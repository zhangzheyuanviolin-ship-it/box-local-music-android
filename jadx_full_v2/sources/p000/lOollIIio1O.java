            package p000;

            import android.content.res.ColorStateList;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.util.Log;
            import android.util.TypedValue;
            import org.xmlpull.v1.XmlPullParser;
            
            public abstract class lOollIIio1O {
                public static ColorStateList I00000oIO(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
/* 10 */            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
/* 14 */                TypedValue typedValue = new TypedValue();
/* 18 */                typedArray.getValue(1, typedValue);
/* 21 */                int i = typedValue.type;
/* 24 */                if (i != 2) {
/* 28 */                    if (i >= 28 && i <= 31) {
/* 36 */                        return ColorStateList.valueOf(typedValue.data);
                            }
/* 41 */                    Resources resources = typedArray.getResources();
/* 46 */                    int resourceId = typedArray.getResourceId(1, 0);
/* 50 */                    ThreadLocal threadLocal = IOOlOlo.I00000oIO;
                            try {
/* 56 */                        return IOOlOlo.I00000oIO(resources, resources.getXml(resourceId), theme);
                            } catch (Exception e) {
/* 66 */                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
/* 9 */                         return null;
                            }
                        }
/* 72 */                OoOil11Ol1o.I000iOII("Failed to resolve attribute at index 1: ", typedValue);
                    }
/* 9 */             return null;
                }

                public static I00Ol00 I00000oOI(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
                    I00Ol00 i00Ol00I0000oI00;
/* 1 */             boolean zI0000Il00O = I0000Il00O(xmlPullParser, str);
/* 5 */             int i2 = 6;
/* 6 */             Object obj = null;
/* 7 */             int i3 = 0;
/* 8 */             if (zI0000Il00O) {
/* 12 */                TypedValue typedValue = new TypedValue();
/* 15 */                typedArray.getValue(i, typedValue);
/* 18 */                int i4 = typedValue.type;
/* 22 */                if (i4 >= 28 && i4 <= 31) {
/* 32 */                    return new I00Ol00(obj, typedValue.data, i2, obj);
                        }
                        try {
/* 44 */                    i00Ol00I0000oI00 = I00Ol00.I0000oI00(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                        } catch (Exception e) {
/* 54 */                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
/* 57 */                    i00Ol00I0000oI00 = null;
                        }
/* 58 */                if (i00Ol00I0000oI00 != null) {
/* 60 */                    return i00Ol00I0000oI00;
                        }
                    }
/* 63 */            return new I00Ol00(obj, i3, i2, obj);
                }

                public static boolean I0000Il00O(XmlPullParser xmlPullParser, String str) {
                    return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
                }

                public static TypedArray I0000O(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
                    return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                }
            }
