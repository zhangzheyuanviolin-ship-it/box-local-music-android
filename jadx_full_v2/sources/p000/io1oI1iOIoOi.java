            package p000;

            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.PorterDuff;
            import android.graphics.drawable.Icon;
            import android.net.Uri;
            import android.text.TextUtils;
            import androidx.core.graphics.drawable.IconCompat;
            
            public abstract class io1oI1iOIoOi {
                public static Icon I00000oIO(IconCompat iconCompat) {
                    Icon iconCreateWithBitmap;
                    String resPackage;
                    Uri uri;
/* 1 */             int i = iconCompat.I00000oIO;
                    switch (i) {
                        case -1:
/* 163 */                   return (Icon) iconCompat.I00000oOI;
                        case 0:
                        default:
/* 10 */                    I000II.I000iOII("Unknown type");
/* 3 */                     return null;
                        case 1:
/* 140 */                   iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.I00000oOI);
                            break;
                        case 2:
/* 82 */                    if (i == -1) {
/* 88 */                        resPackage = ((Icon) iconCompat.I00000oOI).getResPackage();
                            } else {
/* 94 */                        if (i != 2) {
/* 132 */                           IoOOl0iOl1io.I000OOo1O("called getResPackage() on ", iconCompat);
/* 3 */                             return null;
                                }
/* 96 */                        String str = iconCompat.I000OiO;
/* 121 */                       resPackage = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.I00000oOI).split(":", -1)[0] : iconCompat.I000OiO;
                            }
/* 125 */                   iconCreateWithBitmap = Icon.createWithResource(resPackage, iconCompat.I0000oI00);
                            break;
                        case 3:
/* 77 */                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.I00000oOI, iconCompat.I0000oI00, iconCompat.I0001Ioi1lo);
                            break;
                        case 4:
/* 64 */                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.I00000oOI);
                            break;
                        case 5:
/* 55 */                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.I00000oOI);
                            break;
                        case 6:
/* 14 */                    if (i == -1) {
/* 20 */                        uri = ((Icon) iconCompat.I00000oOI).getUri();
                            } else {
/* 26 */                        if (i != 4 && i != 6) {
/* 34 */                            IoOOl0iOl1io.I000OOo1O("called getUri() on ", iconCompat);
/* 3 */                             return null;
                                }
/* 42 */                        uri = Uri.parse((String) iconCompat.I00000oOI);
                            }
/* 46 */                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmapContentUri(uri);
                            break;
                    }
/* 144 */           ColorStateList colorStateList = iconCompat.I000II;
/* 146 */           if (colorStateList != null) {
/* 148 */               iconCreateWithBitmap.setTintList(colorStateList);
                    }
/* 151 */           PorterDuff.Mode mode = iconCompat.I000O01llI0;
/* 155 */           if (mode != IconCompat.I000iOII) {
/* 157 */               iconCreateWithBitmap.setTintMode(mode);
                    }
/* 160 */           return iconCreateWithBitmap;
                }
            }
