            package p000;

            import android.R;
            import android.content.Context;
            import android.util.AttributeSet;
            import android.view.View;
            import java.lang.reflect.Constructor;
            
            public class I1IIIOIooo0 {
                public static final Class[] I00000oOI = {Context.class, AttributeSet.class};
                public static final int[] I0000Il00O = {R.attr.onClick};
                public static final String[] I0000O = {"android.widget.", "android.view.", "android.webkit."};
                public static final Ol0Ii10o1 I0000oI00 = new Ol0Ii10o1(0);
                public final Object[] I00000oIO = new Object[2];

                public I11ioI1IlOI I00000oIO(Context context, AttributeSet attributeSet) {
/* 3 */             return new I11ioI1IlOI(context, attributeSet);
                }

                public I11l0Ool I00000oOI(Context context, AttributeSet attributeSet) {
/* 6 */             return new I11l0Ool(context, attributeSet, com.box.gallery.R.attr.buttonStyle);
                }

                public I11l110liiOi I0000Il00O(Context context, AttributeSet attributeSet) {
/* 3 */             return new I11l110liiOi(context, attributeSet);
                }

                public I1I0ii0 I0000O(Context context, AttributeSet attributeSet) {
/* 3 */             return new I1I0ii0(context, attributeSet);
                }

                public I1II01I I0000oI00(Context context, AttributeSet attributeSet) {
/* 3 */             return new I1II01I(context, attributeSet);
                }

                public final View I0001Ioi1lo(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
                    String strConcat;
/* 1 */             Ol0Ii10o1 ol0Ii10o1 = I0000oI00;
/* 7 */             Constructor constructor = (Constructor) ol0Ii10o1.get(str);
/* 9 */             if (constructor == null) {
/* 11 */                if (str2 != null) {
                            try {
/* 13 */                        strConcat = str2.concat(str);
                            } catch (Exception unused) {
/* 56 */                        return null;
                            }
                        } else {
/* 18 */                    strConcat = str;
                        }
/* 36 */                constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(I00000oOI);
/* 40 */                ol0Ii10o1.put(str, constructor);
                    }
/* 44 */            constructor.setAccessible(true);
/* 53 */            return (View) constructor.newInstance(this.I00000oIO);
                }
            }
