# pastelPlaceholders 🎨

[![](https://jitpack.io/v/zedlabs/pastelPlaceholders.svg)](https://jitpack.io/#zedlabs/pastelPlaceholders)

Add clean pastel colours as loading placeholders for your images 🟥🟧🟨🟪🟩

![demo](demo.gif)
## Adding to your Project
### project level build.gradle
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	    }
```


### app level build.gradle
```
dependencies { implementation 'com.github.zedlabs:pastelPlaceholders:1.0.3' }
```

## Usage [(sample)](https://github.com/zedlabs/pastelPlaceholders/tree/master/app)

```
Pastel().getColorLight() \\ or getColorDark() for dark pastels
```
### example with glide
```
  Glide.with(holder.itemView.context)
            .load(imageSet[position])
            .placeholder(Pastel().getColorLight())
            .transition(DrawableTransitionOptions.withCrossFade(300))
            .into(imageView)
```
