package com.example.portfolio

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PortfolioApp() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    "Portfolio", fontSize = 25.sp, color = Color.White
                )
            }, colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color(0xff226f54)
            ), actions = {
                IconButton(onClick = {
                }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            })

        }, containerColor = Color(0xff226f54)

    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(10.dp)
        ) {
            LazyColumn {
                item {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Text("Hello It's Me", color = Color.White, fontSize = 22.sp)
                        Spacer(modifier = Modifier.padding(vertical = 5.dp))
                        Text("Aditya Chandel", color = Color.White, fontSize = 40.sp)
                        Spacer(modifier = Modifier.padding(vertical = 5.dp))
                        Text("And I'm CS Student", color = Color.White, fontSize = 26.sp)
                        Spacer(modifier = Modifier.padding(vertical = 5.dp))
                        Text(
                            "Explore my portfolio featuring projects" + " built with HTML and CSS, reflecting my" + " journey after completing C, C++" + " language. Currently, I'm learning DSA" + " and making projects using JavaScript" + " to expand my web development skills",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp, bottom = 10.dp)
                                .padding(horizontal = 5.dp)

                        ) {
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.linkedin),
                                    contentDescription = null,
                                    tint = Color.White
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.github),
                                    contentDescription = null,
                                    tint = Color.White
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.instagram),
                                    contentDescription = null,
                                    tint = Color.White
                                )
                            }
                            IconButton(onClick = {}) {
                                Icon(
                                    painterResource(R.drawable.twitter),
                                    contentDescription = null,
                                    tint = Color.White
                                )
                            }
                        }
                        Button(
                            onClick = {},
                            shape = RoundedCornerShape(10.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.Yellow
                            )
                        ) {
                            Text(
                                "Explore My Work", color = Color.Black
                            )
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Image(
                                painterResource(R.drawable.study),
                                contentDescription = null,
                                alignment = Alignment.Center,
                                modifier = Modifier.padding(top = 15.dp, bottom = 15.dp)
                            )
                            HorizontalDivider(
                                thickness = 2.dp, color = Color.White
                            )

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Yellow
                                )
                            ) {
                                Text(
                                    "About",
                                    color = Color.Black
                                )
                            }
                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Yellow
                                )
                            ) {
                                Text("Education", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            EducationSection()

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            EducationSection10()

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            EducationSection12()

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            Tools()

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Yellow
                                )
                            ) {
                                Text("Education", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            ProgrammingIcons()

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            HorizontalDivider(
                                thickness = 2.dp, color = Color.White
                            )

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Yellow
                                )
                            ) {
                                Text("Experience", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            Button(
                                onClick = {},
                                shape = RoundedCornerShape(10.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Yellow
                                )
                            ) {
                                Text("Projects", color = Color.Black)
                            }

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            Projects()

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))


                            HorizontalDivider(
                                thickness = 2.dp, color = Color.White
                            )

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize()
                            ) {
                                Button(
                                    onClick = {},
                                    shape = RoundedCornerShape(10.dp),
                                    colors = ButtonDefaults.buttonColors(
                                        containerColor = Color.Yellow
                                    )
                                ) {
                                    Text("Contact", color = Color.Black)
                                }

                                Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    Row(
                                        horizontalArrangement = Arrangement.Center,
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier.fillMaxWidth()

                                    ) {
                                        Text(
                                            "I AM OPEN TO WORK AND ",
                                            fontSize = 22.sp,
                                            color = Color.White
                                        )
                                    }
                                    Text(
                                        "NETWORK", fontSize = 22.sp,
                                        color = Color.White
                                    )
                                }

                                Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))


                                Row(
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth()

                                ) {
                                    Text(
                                        "If you have an exciting project in mind,",
                                        color = Color.White
                                    )
                                }
                                Row(
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth()

                                ) {
                                    Text(
                                        "want to collaboration, or simple wish to",
                                        color = Color.White
                                    )
                                }
                                Row(
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth()

                                ) {
                                    Text(
                                        "connect, let's initiate a conversation.",
                                        color = Color.White
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            IconButton(onClick = {

                            }) {
                                Icon(
                                    imageVector = Icons.Rounded.MailOutline,
                                    contentDescription = null,
                                    modifier = Modifier.size(35.dp),
                                    tint = Color.White
                                )
                            }
                            HorizontalDivider(
                                thickness = 2.dp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

                            Text(
                                "Copyright reserved 2024 Aditya Chandel",
                                fontSize = 17.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Projects() {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            modifier = Modifier
                .padding(15.dp)
                .size(350.dp, 350.dp)
                .shadow(
                    elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                ),
            color = Color(0xFF139695),
            shadowElevation = 20.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Image(
                painterResource(R.drawable.wonders),
                contentDescription = null,
                alignment = Alignment.TopStart
            )
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp)
            ) {
                Text(
                    "Wonder Of The World Website",
                    fontSize = 22.sp,
                    color = Color.White

                )

                Spacer(modifier = Modifier.padding(top = 3.dp, bottom = 5.dp))

                Text(
                    "This Website is for the Wonders of the World." +
                            "From a image sliding" +
                            "Home page to a dedicated page for each Wonder.",
                    color = Color.White

                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "HTML5",
                                color = Color.Black
                            )
                        }
                    }
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "CSS3",
                                color = Color.Black
                            )
                        }
                    }
                    IconButton(onClick = {
                        val websiteUrl = "https://github.com/TonyStark-19/Wonders-of-the-World"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
                        context.startActivity(intent)
                    }) {
                        Icon(
                            painterResource(R.drawable.github),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.share),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                }
            }
        }

        Surface(
            modifier = Modifier
                .padding(15.dp)
                .size(350.dp, 350.dp)
                .shadow(
                    elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                ),
            color = Color(0xFF139695),
            shadowElevation = 20.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Image(
                painterResource(R.drawable.travel),
                contentDescription = null,
                alignment = Alignment.TopStart
            )
            Column(
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp)
            ) {
                Text(
                    "Travel Website",
                    fontSize = 22.sp,
                    color = Color.White,


                    )

                Spacer(modifier = Modifier.padding(top = 3.dp, bottom = 5.dp))

                Text(
                    "An immersive travel website offering detailed guides, stunning visuals, and essential tips for top destinations worldwide.",
                    color = Color.White,
                    maxLines = 3
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "HTML5",
                                color = Color.Black
                            )
                        }
                    }
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "CSS3",
                                color = Color.Black
                            )
                        }
                    }
                    IconButton(onClick = {
                        val websiteUrl = "https://github.com/TonyStark-19/Travel-Website"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
                        context.startActivity(intent)
                    }) {
                        Icon(
                            painterResource(R.drawable.github),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.share),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                }
            }
        }

        Surface(
            modifier = Modifier
                .padding(15.dp)
                .size(350.dp, 350.dp)
                .shadow(
                    elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                ),
            color = Color(0xFF139695),
            shadowElevation = 20.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Image(
                painterResource(R.drawable.solar_system),
                contentDescription = null,
                alignment = Alignment.TopStart
            )
            Column(
                verticalArrangement = Arrangement.Bottom,

                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp)
            ) {
                Text(
                    "Solar System Website",
                    fontSize = 22.sp,
                    color = Color.White

                )

                Spacer(modifier = Modifier.padding(top = 3.dp, bottom = 5.dp))

                Text(
                    "A visually engaging website that showcases key information about each planet in our solar system. From animation to dedicated page for each planet.",
                    color = Color.White,
                    maxLines = 3

                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "HTML5",
                                color = Color.Black
                            )
                        }
                    }
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "CSS3",
                                color = Color.Black
                            )
                        }
                    }
                    IconButton(onClick = {
                        val websiteUrl = "https://github.com/TonyStark-19/Solar-System"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
                        context.startActivity(intent)
                    }) {
                        Icon(
                            painterResource(R.drawable.github),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.share),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                }
            }
        }

        Surface(
            modifier = Modifier
                .padding(15.dp)
                .size(350.dp, 350.dp)
                .shadow(
                    elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                ),
            color = Color(0xFF139695),
            shadowElevation = 20.dp,
            shape = RoundedCornerShape(10.dp)
        ) {
            Image(
                painterResource(R.drawable.coffee),
                contentDescription = null,
                alignment = Alignment.TopStart
            )
            Column(
                verticalArrangement = Arrangement.Bottom,

                modifier = Modifier
                    .fillMaxSize()
                    .padding(15.dp)
            ) {
                Text(
                    "Coffee Website",
                    fontSize = 22.sp,
                    color = Color.White

                )

                Spacer(modifier = Modifier.padding(top = 3.dp, bottom = 5.dp))

                Text(
                    "This is a Coffee Website for a cafe where a display of cafe services are there and contact options to contact the cafe.",
                    color = Color.White,
                    maxLines = 3

                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "HTML5",
                                color = Color.Black
                            )
                        }
                    }
                    OutlinedCard(
                        border = BorderStroke(1.dp, Color.Black),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .size(65.dp, 36.dp)
                            .fillMaxSize()

                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                "CSS3",
                                color = Color.Black
                            )
                        }
                    }
                    IconButton(onClick = {
                        val websiteUrl = "https://github.com/TonyStark-19/Coffee-Website"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl))
                        context.startActivity(intent)
                    }) {
                        Icon(
                            painterResource(R.drawable.github),
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                    IconButton(onClick = {}) {
                        Icon(
                            painterResource(R.drawable.share),
                            contentDescription = null,
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }

                }
            }
        }
    }
}


@Composable
fun Tools(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            // Git
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.git),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("Git")
                    }
                }
            }

            Spacer(modifier = Modifier.padding(horizontal = 5.dp))

            // Github
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.github2),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("Git")
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            // Git
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.vscode),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("Git")
                    }
                }
            }

            Spacer(modifier = Modifier.padding(horizontal = 5.dp))
            // Github
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.figma),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("Git")
                    }
                }
            }
        }
    }
}

@Composable
fun ProgrammingIcons(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            // C language
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.c),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("C")
                    }
                }
            }

            Spacer(modifier = Modifier.padding(horizontal = 5.dp))

            // C++ Language
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.cpp),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("C++")
                    }
                }
            }
        }

        Spacer(modifier = Modifier.padding(vertical = 15.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            // HTML
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.html),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("HTML")
                    }
                }
            }

            Spacer(modifier = Modifier.padding(horizontal = 5.dp))
            // CSS
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.css),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("CSS")
                    }
                }
            }

        }

        //JS
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Surface(
                modifier = Modifier
                    .padding(15.dp)
                    .size(130.dp, 150.dp)
                    .shadow(
                        elevation = 20.dp, shape = RoundedCornerShape(20.dp)
                    ),
                color = Color.White,
                shadowElevation = 20.dp,
                shape = RoundedCornerShape(10.dp)
            ) {
                Column(
                    modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painterResource(R.drawable.js),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .padding(bottom = 3.dp)
                    )
                    Button(onClick = {}) {
                        Text("JavaScript")
                    }
                }
            }
        }
    }
}

@Composable
fun EducationSection() {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = Color(0xff06d6a0),
        modifier = Modifier
            .fillMaxSize()
            .size(400.dp, 130.dp)
    ) {
        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 8.dp)
        ) {
            Text(
                "Pursuing BCA from HRIST College, Ghaziabad",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp)
            )
            Spacer(modifier = Modifier.padding(top = 1.dp, bottom = 2.dp))
            Text(
                "Sept 2023 - Present",
                color = Color.Yellow,
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }

    }
}

@Composable
fun EducationSection12() {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = Color(0xff06d6a0),
        modifier = Modifier
            .fillMaxSize()
            .size(400.dp, 130.dp)
    ) {
        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 8.dp)
        ) {
            Text(
                "Complete 12th from Happy Model School, Nandgram, Ghaziabad",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp)
            )
            Spacer(modifier = Modifier.padding(top = 1.dp, bottom = 2.dp))
            Text(
                "With a score of 85% : Class Topper",
                color = Color.Yellow,
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Composable
fun EducationSection10() {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = Color(0xff06d6a0),
        modifier = Modifier
            .fillMaxSize()
            .size(400.dp, 130.dp)
    ) {
        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 8.dp)
        ) {
            Text(
                "Complete 10th from Happy Model School, Nandgram, Ghaziabad",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.padding(5.dp)
            )
            Spacer(modifier = Modifier.padding(top = 1.dp, bottom = 2.dp))
            Text(
                "With a score of 72%",
                color = Color.Yellow,
                fontSize = 18.sp,
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PortfolioPreview() {
    PortfolioApp()
}