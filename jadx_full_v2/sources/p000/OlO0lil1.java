            package p000;

            import android.content.Context;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.content.res.XmlResourceParser;
            import android.util.AttributeSet;
            import android.util.StateSet;
            import com.box.gallery.R;
            import java.io.IOException;
            import org.xmlpull.v1.XmlPullParserException;
            
            public final class OlO0lil1 {
                public int I00000oIO;
                public OioOlIlii1il I00000oOI;
                public int[][] I0000Il00O;
                public OioOlIlii1il[] I0000O;

                public static void I00000oIO(o00io0IiOOo0 o00io0iiooo0, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
/* 6 */             int depth = xmlResourceParser.getDepth() + 1;
                    while (true) {
/* 7 */                 int next = xmlResourceParser.next();
/* 11 */                if (next == 1) {
/* 966 */                   return;
                        }
/* 13 */                int depth2 = xmlResourceParser.getDepth();
/* 17 */                if (depth2 < depth && next == 3) {
/* 966 */                   return;
                        }
/* 23 */                if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
/* 40 */                    Resources resources = context.getResources();
/* 44 */                    int[] iArr = OOilOii0o1I.I000OOo1O;
/* 54 */                    TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
/* 76 */                    OioOlIlii1il oioOlIlii1ilI00000oIO = OioOlIlii1il.I00000oIO(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0), new I00iOIl(0.0f)).I00000oIO();
/* 80 */                    typedArrayObtainAttributes.recycle();
/* 83 */                    int attributeCount = attributeSet.getAttributeCount();
/* 87 */                    int[] iArr2 = new int[attributeCount];
/* 90 */                    int i = 0;
/* 91 */                    for (int i2 = 0; i2 < attributeCount; i2++) {
/* 93 */                        int attributeNameResource = attributeSet.getAttributeNameResource(i2);
/* 100 */                       if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
/* 107 */                           int i3 = i + 1;
/* 113 */                           if (!attributeSet.getAttributeBooleanValue(i2, false)) {
/* 116 */                               attributeNameResource = -attributeNameResource;
                                    }
/* 117 */                           iArr2[i] = attributeNameResource;
/* 119 */                           i = i3;
                                }
                            }
/* 123 */                   int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i);
/* 127 */                   int i4 = o00io0iiooo0.I00iiI;
/* 129 */                   if (i4 == 0 || iArrTrimStateSet.length == 0) {
/* 134 */                       o00io0iiooo0.I00iiO = oioOlIlii1ilI00000oIO;
                            }
/* 138 */                   int[][] iArr3 = (int[][]) o00io0iiooo0.I00iio;
/* 141 */                   if (i4 >= iArr3.length) {
/* 143 */                       int i5 = i4 + 10;
/* 145 */                       int[][] iArr4 = new int[i5][];
/* 147 */                       System.arraycopy(iArr3, 0, iArr4, 0, i4);
/* 150 */                       o00io0iiooo0.I00iio = iArr4;
/* 152 */                       OioOlIlii1il[] oioOlIlii1ilArr = new OioOlIlii1il[i5];
/* 158 */                       System.arraycopy((OioOlIlii1il[]) o00io0iiooo0.I00ilI0I1, 0, oioOlIlii1ilArr, 0, i4);
/* 161 */                       o00io0iiooo0.I00ilI0I1 = oioOlIlii1ilArr;
                            }
/* 165 */                   int[][] iArr5 = (int[][]) o00io0iiooo0.I00iio;
/* 167 */                   int i6 = o00io0iiooo0.I00iiI;
/* 169 */                   iArr5[i6] = iArrTrimStateSet;
/* 175 */                   ((OioOlIlii1il[]) o00io0iiooo0.I00ilI0I1)[i6] = oioOlIlii1ilI00000oIO;
/* 178 */                   o00io0iiooo0.I00iiI = i6 + 1;
                        }
                    }
                }
            }
