package com.example.assignment_kot104

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight

data class ListItemMenuNgang(val iconRes: Int, val name: String)
data class Product(val imageRes: Int, val name: String, val price: String)

@Preview(showBackground = true)
@Composable
fun GetLayoutHome() {
    val itemsMenu = listOf(
        ListItemMenuNgang(R.drawable.ic_popular, "Popular"),
        ListItemMenuNgang(R.drawable.ic_chair, "Chair"),
        ListItemMenuNgang(R.drawable.ic_table, "Table"),
        ListItemMenuNgang(R.drawable.ic_armchair, "Armchair"),
        ListItemMenuNgang(R.drawable.ic_bed, "Bed"),
        ListItemMenuNgang(R.drawable.ic_lamb, "Lamp")
    )
    val products = listOf(
        Product(R.drawable.img_sp1, "Black Simple Lamp", "$ 12.00"),
        Product(R.drawable.img_sp2, "Minimal Stand", "$ 25.00"),
        Product(R.drawable.img_sp3, "Coffee Chair", "$ 20.00"),
        Product(R.drawable.img_sp4, "Simple Desk", "$ 50.00"),
        Product(R.drawable.img_sp1, "Product 5", "$60.00"),
        Product(R.drawable.img_sp2, "Product 6", "$70.00")
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(bottom = 56.dp) // Thêm khoảng trống cho thanh điều hướng ở dưới
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Make home",
                        fontSize = 20.sp,
                        color = Color("#909090".toColorInt()),
                        fontStyle = FontStyle.Italic
                    )
                    Text(
                        text = "BEAUTIFUL",
                        fontSize = 23.sp,
                        color = Color.Black,
                        fontStyle = FontStyle.Italic
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.ic_cart),
                    contentDescription = "",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
            }
            Row(
                modifier = Modifier
                    .padding(start = 10.dp)
                    .horizontalScroll(rememberScrollState()),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                itemsMenu.forEach { item ->
                    ListItem(item)
                }
            }
            ProductList(products)
        }
        BottomNavigationBar(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(56.dp)
                .background(Color.White)
        )
    }
}

@Composable
fun ListItem(item: ListItemMenuNgang) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(48.dp)
                .background(color = Color("#F5F5F5".toColorInt()), shape = RoundedCornerShape(8.dp))
                .border(BorderStroke(1.dp, Color.Gray), shape = RoundedCornerShape(8.dp))
        ) {
            Image(
                painter = painterResource(id = item.iconRes),
                contentDescription = null,
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
        }
        Text(
            text = item.name,
            fontSize = 16.sp,
            color = Color.Black,
            fontStyle = FontStyle.Normal
        )
    }
}


@Composable
fun ProductList(products: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(products.size) { index ->
            ProductItem(product = products[index])
        }
    }
}

@Composable
fun ProductItem(product: Product) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .background(Color.White)
        ) {
            Image(
                painter = painterResource(id = product.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .size(157.dp, 200.dp)
                    .clip(RoundedCornerShape(8.dp)) // Rounded corners
                    .padding(8.dp), // Padding to apply border to the whole image
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
            ) {
                Text(text = product.name, fontSize = 14.sp, color = Color.Gray)
                Text(
                    text = product.price,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}


@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomNavItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            selected = false,
            onClick = {}
        )
        BottomNavItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_save),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            selected = false,
            onClick = {}
        )
        BottomNavItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_tb),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            selected = true,
            onClick = {}
        )
        BottomNavItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_user),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
            },
            selected = false,
            onClick = {}
        )
    }
}

@Composable
fun BottomNavItem(
    icon: @Composable () -> Unit,
    selected: Boolean,
    onClick: () -> Unit
) {
    val contentColor = if (selected) Color.White else Color.Gray
    val backgroundColor = if (selected) Color.Black else Color.Transparent

    IconButton(
        onClick = onClick,
        modifier = Modifier
            .size(40.dp)
            .background(color = backgroundColor, shape = CircleShape)
    ) {
        CompositionLocalProvider(LocalContentColor provides contentColor) {
            icon()
        }
    }
}
