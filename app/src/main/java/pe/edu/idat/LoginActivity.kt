package pe.edu.idat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import pe.edu.idat.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.textinputuser.editText?.addTextChangedListener {text ->
            binding.btnlogin.isEnabled = validateEmailPass(text.toString(), binding.textinputpass.editText?.text.toString())
        }

        binding.textinputpass.editText?.addTextChangedListener {text ->
            binding.btnlogin.isEnabled = validateEmailPass(binding.textinputuser.editText?.text.toString(), text.toString())
        }

        binding.btnlogin.setOnClickListener {
            val ventanaInicio = Intent(this, MainActivity::class.java)
            startActivity(ventanaInicio)
            Toast.makeText(this, "Bienvenido Profesor :3", Toast.LENGTH_SHORT).show()
        }
}


    private fun validateEmailPass(email: String, pass: String): Boolean {
        val validateEmail = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email == "ejemplo@idat.edu.pe"
        val validatePass = pass.isNotEmpty() && pass == "123456"
        return validateEmail && validatePass
    }
}