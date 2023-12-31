[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
[![Build Multiplatform project](https://github.com/KevinnZou/compose-multiplatform-library-template/actions/workflows/build.yml/badge.svg)](https://github.com/KevinnZou/compose-multiplatform-library-template/actions/workflows/build.yml)
[![Publish Wiki](https://github.com/KevinnZou/compose-multiplatform-library-template/actions/workflows/wiki.yml/badge.svg)](https://github.com/KevinnZou/compose-multiplatform-library-template/actions/workflows/wiki.yml)
# AutoSizeText for [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform)

Text composable that can adjust font size depending on available space.

## Installation
Get the latest version from Maven Central: [![Maven Central](https://img.shields.io/maven-metadata/v.svg?label=maven-central&metadataUrl=https%3A%2F%2Frepo1.maven.org%2Fmaven2%2Fcom%2Fdshatz%2Fcompose-mpp%2Fautosize-text%2Fmaven-metadata.xml)](Version) 
#### build.gradle.kts
`implementation("com.dshatz.compose-mpp:autosize-text:<version>")`

#### build.gradle
`implementation 'com.dshatz.compose-mpp:autosize-text:<version>'`


## Usage

```kotlin
@Composable
fun AutoSizeText(
    text: String,
    modifier: Modifier = Modifier,
    suggestedFontSizes: ImmutableWrapper<List<TextUnit>> = emptyList<TextUnit>().toImmutableWrapper(),
    minTextSize: TextUnit = TextUnit.Unspecified,
    maxTextSize: TextUnit = TextUnit.Unspecified,
    stepGranularityTextSize: TextUnit = TextUnit.Unspecified,
    alignment: Alignment = Alignment.TopStart,
    color: Color = Color.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    lineSpacingRatio: Float = 0.1F,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current
) {  }
```


```kotlin
Box {
    AutoSizeText(
       text = "Hello world!",
       minTextSize = 10.sp,
       maxTextSize = 20.sp
    )
}
```