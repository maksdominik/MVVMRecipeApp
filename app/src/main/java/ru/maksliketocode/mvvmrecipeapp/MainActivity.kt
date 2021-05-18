package ru.maksliketocode.mvvmrecipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.maksliketocode.mvvmrecipeapp.domain.model.Recipe
import ru.maksliketocode.mvvmrecipeapp.network.model.RecipeNetworkEntity
import ru.maksliketocode.mvvmrecipeapp.network.model.RecipeNetworkMapper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapper = RecipeNetworkMapper()
        val recipe = Recipe()

        val networkEntity: RecipeNetworkEntity = mapper.mapToEntity(recipe)

        val r: Recipe = mapper.mapFromEntity(networkEntity)
    }
}