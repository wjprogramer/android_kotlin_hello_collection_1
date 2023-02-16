package com.wjprogrammer.happybirthday_compose

import android.os.Bundle
import android.util.Log
// AndroidX (Android Extension)
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.wjprogrammer.happybirthday_compose.features.marsphotos.ui.MarsPhotosApp
import com.wjprogrammer.happybirthday_compose.features.marsphotos.ui.theme.MarsPhotosTheme
import com.wjprogrammer.happybirthday_compose.features.affirmations.AffirmationApp
import com.wjprogrammer.happybirthday_compose.features.birthday.BirthdayGreetingWithImage
import com.wjprogrammer.happybirthday_compose.features.birthday.ui.theme.HappyBirthday_ComposeTheme
import com.wjprogrammer.happybirthday_compose.features.cupcake.CupcakeApp
import com.wjprogrammer.happybirthday_compose.features.cupcake.ui.theme.CupcakeTheme
import com.wjprogrammer.happybirthday_compose.features.dessert_clicker.DessertClickerApp
import com.wjprogrammer.happybirthday_compose.features.dessert_clicker.DessertClickerAppWithViewModel
import com.wjprogrammer.happybirthday_compose.features.dessert_clicker.MyDessertClickerAppWithViewModelPreview
import com.wjprogrammer.happybirthday_compose.features.dessert_clicker.data.Datasource
import com.wjprogrammer.happybirthday_compose.features.dessert_clicker.ui.theme.DessertClickerTheme
import com.wjprogrammer.happybirthday_compose.features.dice_roller.DiceRollerApp
import com.wjprogrammer.happybirthday_compose.features.dice_roller.ui.theme.DiceRollerTheme
import com.wjprogrammer.happybirthday_compose.features.reply.ui.ReplyApp
import com.wjprogrammer.happybirthday_compose.features.reply.ui.theme.ReplyTheme
import com.wjprogrammer.happybirthday_compose.features.tip_time.TipTimeScreen
import com.wjprogrammer.happybirthday_compose.features.tip_time.ui.theme.TipTimeTheme
import com.wjprogrammer.happybirthday_compose.features.unscramble.ui.GameScreen
import com.wjprogrammer.happybirthday_compose.features.unscramble.ui.theme.UnscrambleTheme
import com.wjprogrammer.happybirthday_compose.features.woof.WoofApp
import com.wjprogrammer.happybirthday_compose.features.woof.ui.theme.WoofTheme
import com.wjprogrammer.happybirthday_compose.my_codelab_practices.business_card_app.BusinessCardApp
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.compose_article.ComposeArticleApp
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.compose_article.ui.theme.ComposeArticleTheme
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.compose_quadrant.ComposeQuadrantApp
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.compose_quadrant.ui.theme.ComposeQuadrantTheme
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.courses.TopicGrid
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.courses.ui.theme.CoursesTheme
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.lemonade.LemonApp
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.lemonade.ui.theme.LemonadeTheme
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.super_heroes.SuperheroesApp
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.super_heroes.ui.theme.SuperheroesTheme
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.task_completed.TaskCompletedScreen
import com.wjprogrammer.happybirthday_compose.official_practice_solutions.task_completed.ui.theme.TaskCompletedTheme

// tag for logging
private const val TAG = "MainActivity"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setBirthdayContent()
//        buildComposeArticle()
//        buildTaskCompletedApp()
//        buildComposeQuadrant()
//        buildCodelabMyPracticeCreateBusinessCardApp()
//        setDiceRoller()
//        buildClickBehavior()
//        buildCalculateTip()
//        buildAffirmationApp()
//        buildCoursesApp()
//        buildWoofApp()
//        buildSuperheroesApp()
//        buildDessertClickerApp()
//        buildUnscrambleApp()
//        buildDessertClickerAppWithViewModel()
        setCupcakeContent()
//        buildReplyApp()
//        buildMarsApp()
    }

    // Unit 1: Your first Android app
    // Build a basic layout
    private fun setBirthdayContent() {
        setContent {
            HappyBirthday_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    BirthdayGreetingWithImage(getString(R.string.happy_birthday_text), getString(R.string.signature_text))
                }
            }
        }
    }

    // Practice: Compose Article
    private fun buildComposeArticle() {
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ComposeArticleApp()
                }
            }
        }
    }

    // Practice: Task Completed
    private fun buildTaskCompletedApp() {
        setContent {
            TaskCompletedTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    TaskCompletedScreen()
                }
            }
        }
    }

    // Practice: Compose Quadrant
    private fun buildComposeQuadrant() {
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ComposeQuadrantApp()
                }
            }
        }
    }

    // Codelab My Practice: Create a Business Card app
    private fun buildCodelabMyPracticeCreateBusinessCardApp() {
        setContent {
            Surface(
                color = Color(0xFF073042)
            ) {
                BusinessCardApp()
            }
        }
    }

    // Unit 2: Building app UI
    // Add a button to an app
    private fun setDiceRoller() {
        setContent {
            DiceRollerTheme {
                DiceRollerApp()
            }
        }
    }

    // Practice: Click Behavior
    private fun buildClickBehavior() {
        setContent {
            LemonadeTheme {
                LemonApp()
            }
        }
    }

    // Interacting with UI and state
    // Calculate a custom tip
    private fun buildCalculateTip() {
        setContent {
            TipTimeTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TipTimeScreen()
                }
            }
        }
    }

    // Unit 3: Display lists and use Material Design
    // Build a scrollable list
    private fun buildAffirmationApp() {
        setContent {
            AffirmationApp()
        }
    }

    // Practice: Build a grid
    private fun buildCoursesApp() {
        setContent {
            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TopicGrid()
                }
            }
        }
    }

    // Build beautiful apps
    private fun buildWoofApp() {
        setContent {
            WoofTheme {
                WoofApp()
            }
        }
    }

    // Practice: Build Superheroes app
    private fun buildSuperheroesApp() {
        setContent {
            SuperheroesTheme {
                SuperheroesApp()
            }
        }
    }

    // Unit 4: Navigation and app architecture
    // Architecture Components
    private fun buildDessertClickerApp() {
        Log.d(TAG, "onCreate Called")
        setContent {
            DessertClickerTheme {
                DessertClickerApp(desserts = Datasource.dessertList)
            }
        }
    }

    // ViewModel and State in Compose
    private fun buildUnscrambleApp() {
        setContent {
            UnscrambleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    GameScreen()
                }
            }
        }
    }

    // Practice
    private fun buildDessertClickerAppWithViewModel() {
        setContent {
            DessertClickerTheme {
                DessertClickerAppWithViewModel()
            }
        }
    }

    // Navigation in Jetpack Compose
    private fun setCupcakeContent() {
        setContent {
            CupcakeTheme {
                CupcakeApp()
            }
        }
    }

    // Adaptive Layout
    @OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
    private fun buildReplyApp() {
        setContent {
            ReplyTheme {
                val windowSize = calculateWindowSizeClass(this)

                ReplyApp(
                    windowSize = windowSize.widthSizeClass,
                )
            }
        }
    }

    // Unit 5: Connect to the internet
    // Get data from the internet
    private fun buildMarsApp() {
        setContent {
            MarsPhotosTheme {
                MarsPhotosApp()
            }
        }
    }

    // region Other Utils
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }
    // endregion
}

