            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OIIoil0oI implements Function1 {
                public final int I00iOIl;
                public o01l1ioOo0 I00iiI;

                public OIIoil0oI(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             o01l1ioOo0 o01l1iooo0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 198 */                   return new Il01Ii1Ol((OI0010oo1o) o01l1iooo0.I00iiI, (Ill0IO) obj, 0);
                        default:
/* 9 */                     OIIool oIIool = (OIIool) obj;
/* 11 */                    IOIOill iOIOill = oIIool.I00000oIO;
/* 13 */                    List list = oIIool.I00000oOI;
/* 17 */                    if (iOIOill.I0000Il00O) {
/* 185 */                       OoOil11Ol1o.I000iOII("Unresolved local class: ", iOIOill);
/* 188 */                       return null;
                            }
/* 19 */                    IOIOill iOIOillI0000oI00 = iOIOill.I0000oI00();
/* 48 */                    Ii1Ool1 ii1Ool1I000iOII = iOIOillI0000oI00 != null ? o01l1iooo0.I000iOII(iOIOillI0000oI00, IOOi0Ool1i.I001iOo1i0O(list, 1)) : (IOIOooI1110l) ((O1I00llOi) o01l1iooo0.I00iiO).invoke(iOIOill.I00000oIO);
/* 50 */                    boolean zI000II = iOIOill.I000II();
/* 58 */                    O1I0OloI o1I0OloI = (O1I0OloI) o01l1iooo0.I00iOIl;
/* 60 */                    OI1Iio0ii1 oI1Iio0ii1I0001Ioi1lo = iOIOill.I0001Ioi1lo();
/* 68 */                    Integer num = (Integer) IOOi0Ool1i.I00II0Ol1O0l(list);
/* 77 */                    int iIntValue = num != null ? num.intValue() : 0;
/* 80 */                    OIIoolO0i oIIoolO0i = new OIIoolO0i(o1I0OloI, ii1Ool1I000iOII, oI1Iio0ii1I0001Ioi1lo, OlI1o0ooI.I00IO1);
/* 83 */                    oIIoolO0i.I00io1l = zI000II;
/* 85 */                    IooO11l iooO11lI000O01llI0 = lIiioliIlo.I000O01llI0(0, iIntValue);
/* 97 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(iooO11lI000O01llI0, 10));
/* 100 */                   Iterator it = iooO11lI000O01llI0.iterator();
/* 109 */                   while (((IooO10lI) it).I00iiO) {
/* 114 */                       int iNextInt = ((IooIlO1) it).nextInt();
/* 142 */                       arrayList.add(OoOOiOollo.I010l1O(oIIoolO0i, Ooo0Ioii0o0.I00iiO, OI1Iio0ii1.I0000oI00("T" + iNextInt), iNextInt, o1I0OloI));
                            }
/* 146 */                   oIIoolO0i.I00ioIO = arrayList;
/* 150 */                   List listI00000oOI = lOoii1O1lI1O.I00000oOI(oIIoolO0i);
/* 154 */                   int i2 = IiOiOOIo.I00000oIO;
/* 177 */                   oIIoolO0i.I00l0I0l0lO1 = new IOIi10o(oIIoolO0i, listI00000oOI, Collections.singleton(IiOiIO0i1Oil.I0000Il00O(oIIoolO0i).I0000O().I0000oI00()), o1I0OloI);
/* 179 */                   VarHandle.storeStoreFence();
/* 189 */                   return oIIoolO0i;
                    }
                }
            }
