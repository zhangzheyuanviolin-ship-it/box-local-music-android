            package p000;

            import android.hardware.camera2.params.InputConfiguration;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OillooOlI {
                public static final List I000OiO = Arrays.asList(1, 5, 3);
                public final ArrayList I00000oIO;
                public final I1lIlOi1OI0 I00000oOI;
                public final List I0000Il00O;
                public final List I0000O;
                public final List I0000oI00;
                public final OilloOil0 I0001Ioi1lo;
                public final IIoo00iOol0 I000II;
                public final int I000O01llI0;
                public final InputConfiguration I000OOo1O;

                public OillooOlI(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, IIoo00iOol0 iIoo00iOol0, OilloOil0 oilloOil0, InputConfiguration inputConfiguration, int i, I1lIlOi1OI0 i1lIlOi1OI0) {
/* 4 */             this.I00000oIO = arrayList;
/* 10 */            this.I0000Il00O = Collections.unmodifiableList(arrayList2);
/* 16 */            this.I0000O = Collections.unmodifiableList(arrayList3);
/* 22 */            this.I0000oI00 = Collections.unmodifiableList(arrayList4);
/* 24 */            this.I0001Ioi1lo = oilloOil0;
/* 26 */            this.I000II = iIoo00iOol0;
/* 28 */            this.I000OOo1O = inputConfiguration;
/* 30 */            this.I000O01llI0 = i;
/* 32 */            this.I00000oOI = i1lIlOi1OI0;
                }

                public static OillooOlI I00000oIO() {
/* 39 */            return new OillooOlI(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new I0oiil10Ili().I0001Ioi1lo(), null, null, 0, null);
                }

                public final List I00000oOI() {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             Iterator it = this.I00000oIO.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                I1lIlOi1OI0 i1lIlOi1OI0 = (I1lIlOi1OI0) it.next();
/* 26 */                arrayList.add(i1lIlOi1OI0.I00000oIO);
/* 31 */                Iterator it2 = i1lIlOi1OI0.I00000oOI.iterator();
/* 39 */                while (it2.hasNext()) {
/* 47 */                    arrayList.add((IiIO1ol1i1o0) it2.next());
                        }
                    }
/* 51 */            return Collections.unmodifiableList(arrayList);
                }
            }
