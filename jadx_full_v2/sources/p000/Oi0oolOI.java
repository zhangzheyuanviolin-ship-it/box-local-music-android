            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.graphics.Typeface;
            import android.util.Log;
            import android.util.TypedValue;
            import java.io.IOException;
            import java.util.WeakHashMap;
            import org.xmlpull.v1.XmlPullParserException;
            
            public abstract class Oi0oolOI {
                public static final ThreadLocal I00000oIO = new ThreadLocal();
                public static final WeakHashMap I00000oOI = new WeakHashMap(0);
                public static final Object I0000Il00O = new Object();

                /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x009d A[ADDED_TO_REGION] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static Typeface I00000oIO(Context context, int i, TypedValue typedValue, int i2, I1I1OO00o1o i1I1OO00o1o, boolean z) throws Resources.NotFoundException {
/* 3 */             Resources resources = context.getResources();
/* 8 */             resources.getValue(i, typedValue, true);
/* 13 */            CharSequence charSequence = typedValue.string;
/* 15 */            if (charSequence == null) {
/* 685 */               throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
                    }
/* 17 */            String string = charSequence.toString();
/* 27 */            Typeface typefaceI00000oOI = null;
/* 29 */            if (string.startsWith("res/")) {
/* 50 */                Typeface typeface = (Typeface) OoOl10O1o.I00000oOI.I0000Il00O(OoOl10O1o.I0000O(resources, i, string, typedValue.assetCookie, i2));
/* 52 */                if (typeface != null) {
/* 54 */                    if (i1I1OO00o1o != null) {
/* 56 */                        i1I1OO00o1o.I00000oOI(typeface);
                            }
/* 59 */                    typefaceI00000oOI = typeface;
                        } else {
                            try {
/* 72 */                        if (string.toLowerCase().endsWith(".xml")) {
/* 78 */                            Iliii01Iil iliii01IilI00000oIO = iliiOo1000lO.I00000oIO(resources.getXml(i), resources);
/* 82 */                            if (iliii01IilI00000oIO == null) {
/* 86 */                                Log.e("ResourcesCompat", "Failed to find font-family tag");
/* 89 */                                if (i1I1OO00o1o != null) {
/* 91 */                                    i1I1OO00o1o.I00000oIO(-3);
                                        }
                                    } else {
/* 108 */                               typefaceI00000oOI = OoOl10O1o.I00000oOI(context, iliii01IilI00000oIO, resources, i, string, typedValue.assetCookie, i2, i1I1OO00o1o, z);
                                    }
                                } else {
/* 115 */                           Typeface typefaceI0000Il00O = OoOl10O1o.I0000Il00O(resources, i, string, typedValue.assetCookie, i2);
/* 119 */                           if (i1I1OO00o1o != null) {
/* 121 */                               if (typefaceI0000Il00O != null) {
/* 123 */                                   i1I1OO00o1o.I00000oOI(typefaceI0000Il00O);
                                        } else {
/* 128 */                                   i1I1OO00o1o.I00000oIO(-3);
                                        }
                                    }
/* 126 */                           typefaceI00000oOI = typefaceI0000Il00O;
                                }
                            } catch (IOException e) {
/* 138 */                       Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
/* 151 */                       if (i1I1OO00o1o != null) {
/* 153 */                           i1I1OO00o1o.I00000oIO(-3);
                                }
/* 156 */                       if (typefaceI00000oOI == null) {
                                }
/* 190 */                       return typefaceI00000oOI;
                            } catch (XmlPullParserException e2) {
/* 148 */                       Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
/* 151 */                       if (i1I1OO00o1o != null) {
                                }
/* 156 */                       if (typefaceI00000oOI == null) {
                                }
/* 190 */                       return typefaceI00000oOI;
                            }
                        }
                    } else if (i1I1OO00o1o != null) {
/* 33 */                i1I1OO00o1o.I00000oIO(-3);
                    }
/* 156 */           if (typefaceI00000oOI == null || i1I1OO00o1o != null) {
/* 190 */               return typefaceI00000oOI;
                    }
/* 189 */           throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
                }
            }
