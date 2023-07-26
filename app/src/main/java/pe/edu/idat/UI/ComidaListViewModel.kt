package pe.edu.idat.UI

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pe.edu.idat.Model.Comida
import pe.edu.idat.repository.ComidaRespository
import pe.edu.idat.response.Apiresponse

class ComidaListViewModel: ViewModel() {
    val repository = ComidaRespository()
    val comidaList: MutableLiveData<List<Comida>> = MutableLiveData<List<Comida>>()

    fun getComidaFromService(){
        viewModelScope.launch(Dispatchers.IO) {
            val response = repository.getComidas()
            when(response){
                is  Apiresponse.Error -> {

                }
                is Apiresponse.Success ->{
                    comidaList.postValue(response.data.comidas)
                }
            }
        }
    }
}