            package p000;

            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.UUID;
            import kotlin.Metadata;
            
            @OII1IiiII("navigation")
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LOI1o1io;", "LOII1Il1IlOO;", "LOI1lo1liOO;", "navigation-common_release"}, m18k = 1, mv = {2, 0, 0}, xi = 48)
            public class OI1o1io extends OII1Il1IlOO {
                public final OII1IlOi0 I0000Il00O;

                public OI1o1io(OII1IlOi0 oII1IlOi0) {
/* 4 */             this.I0000Il00O = oII1IlOi0;
                }

                @Override
                public final void I0000O(List list, OI1oooI oI1oooI) {
                    OI1ilOI1ioo0 oI1ilOI1ioo0I000O01llI0;
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) it.next();
/* 19 */                OI1lo1liOO oI1lo1liOO = (OI1lo1liOO) oI1OloOIO1O.I00iiI;
/* 21 */                I11l01l i11l01l = oI1lo1liOO.I00iiI;
/* 25 */                OOo0ooi oOo0ooi = new OOo0ooi();
/* 34 */                oOo0ooi.I00iOIl = oI1OloOIO1O.I00ioIO.I00000oIO();
/* 36 */                I0oiil10Ili i0oiil10Ili = oI1lo1liOO.I00ilO0;
/* 38 */                int i = i0oiil10Ili.I00iiI;
/* 42 */                String str = (String) i0oiil10Ili.I00ilO0;
/* 44 */                if (i == 0 && str == null) {
/* 49 */                    i11l01l.getClass();
/* 54 */                    String strValueOf = String.valueOf(i11l01l.I00000oOI);
/* 66 */                    if (((OI1lo1liOO) i0oiil10Ili.I00iiO).I00iiI.I00000oOI == 0) {
/* 69 */                        strValueOf = "the root navigation";
                            }
/* 77 */                    IOOlIIilOl0.I0000oI00("no start destination defined via app:startDestination for ".concat(strValueOf));
/* 80 */                    return;
                        }
/* 82 */                if (str != null) {
/* 84 */                    oI1ilOI1ioo0I000O01llI0 = i0oiil10Ili.I000O01llI0(str, false);
                        } else {
/* 92 */                    OlIIioolI olIIioolI = (OlIIioolI) i0oiil10Ili.I00iio;
/* 94 */                    olIIioolI.getClass();
/* 101 */                   oI1ilOI1ioo0I000O01llI0 = (OI1ilOI1ioo0) iO10Oii01l.I00000oIO(olIIioolI, i);
                        }
/* 88 */                OI1ilOI1ioo0 oI1ilOI1ioo0 = oI1ilOI1ioo0I000O01llI0;
/* 104 */               if (oI1ilOI1ioo0 == null) {
/* 108 */                   String strValueOf2 = (String) i0oiil10Ili.I00ilI0I1;
/* 110 */                   if (strValueOf2 == null) {
/* 114 */                       strValueOf2 = (String) i0oiil10Ili.I00ilO0;
/* 116 */                       if (strValueOf2 == null) {
/* 120 */                           strValueOf2 = String.valueOf(i0oiil10Ili.I00iiI);
                                }
/* 124 */                       i0oiil10Ili.I00ilI0I1 = strValueOf2;
                            }
/* 134 */                   I000II.I000iOII(IlIi0I0.I000lI("navigation destination ", strValueOf2, " is not a direct child of this NavGraph"));
/* 137 */                   return;
                        }
/* 138 */               I11l01l i11l01l2 = oI1ilOI1ioo0.I00iiI;
/* 140 */               if (str != null) {
/* 150 */                   if (!str.equals((String) i11l01l2.I0001Ioi1lo)) {
/* 152 */                       OI1il00IOO oI1il00IOOI001lllioOl = i11l01l2.I001lllioOl(str);
/* 161 */                       Bundle bundle = oI1il00IOOI001lllioOl != null ? oI1il00IOOI001lllioOl.I00iiI : null;
/* 162 */                       if (bundle != null && !bundle.isEmpty()) {
/* 178 */                           Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 182 */                           bundleI00000oIO.putAll(bundle);
/* 187 */                           Bundle bundle2 = (Bundle) oOo0ooi.I00iOIl;
/* 189 */                           if (bundle2 != null) {
/* 191 */                               bundleI00000oIO.putAll(bundle2);
                                    }
/* 194 */                           oOo0ooi.I00iOIl = bundleI00000oIO;
                                }
                            }
/* 204 */                   if (oI1ilOI1ioo0.I000OOo1O().isEmpty()) {
                                continue;
                            } else {
/* 206 */                       Map mapI000OOo1O = oI1ilOI1ioo0.I000OOo1O();
/* 213 */                       I0lOo1lO i0lOo1lO = new I0lOo1lO(3);
/* 216 */                       i0lOo1lO.I00iiI = oOo0ooi;
/* 218 */                       VarHandle.storeStoreFence();
/* 221 */                       ArrayList arrayListI00000oIO = l1iIIII1.I00000oIO(mapI000OOo1O, i0lOo1lO);
/* 229 */                       if (!arrayListI00000oIO.isEmpty()) {
/* 238 */                           IoOOl0iOl1io.I000iOII("Cannot navigate to startDestination ", oI1ilOI1ioo0, ". Missing required arguments [", arrayListI00000oIO, 93);
/* 241 */                           return;
                                }
                            }
                        }
/* 246 */               OII1Il1IlOO oII1Il1IlOOI00000oOI = this.I0000Il00O.I00000oOI(oI1ilOI1ioo0.I00iOIl);
/* 250 */               OI1Ooo oI1OooI00000oOI = I00000oOI();
/* 258 */               Bundle bundleI00000oOI = oI1ilOI1ioo0.I00000oOI((Bundle) oOo0ooi.I00iOIl);
/* 264 */               OI1i0llli oI1i0llli = oI1OooI00000oOI.I000O01llI0.I00000oOI;
/* 294 */               oII1Il1IlOOI00000oOI.I0000O(Collections.singletonList(new OI1OloOIO1O(oI1i0llli.I00000oIO.I0000Il00O, oI1ilOI1ioo0, bundleI00000oOI, oI1i0llli.I000O01llI0(), oI1i0llli.I000oI1ioi, UUID.randomUUID().toString(), null)), oI1oooI);
                    }
                }

                @Override
                public OI1lo1liOO I00000oIO() {
/* 3 */             return new OI1lo1liOO(this);
                }
            }
