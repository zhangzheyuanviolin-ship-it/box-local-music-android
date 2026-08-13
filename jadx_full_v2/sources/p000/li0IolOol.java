            package p000;

            import android.util.Range;
            import java.util.HashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Objects;
            
            public abstract class li0IolOol {
                public static OillOo0 I00000oIO;

                public static final void I00000oIO(IIllOioOlolI iIllOioOlolI, IOiOol0 iOiOol0, Oi0Oooi oi0Oooi) {
/* 1 */             OillOo0 oillOo0 = I00000oIO;
/* 3 */             if (oillOo0 == null) {
/* 167 */               I000II.I001IO000("mCameraUseCaseAdapterProvider must be initialized first!");
/* 408 */               return;
                    }
/* 13 */            IIllOo0 iIllOo0I00000oOI = ((IIo0ii1Oi) oillOo0.I00iiI).I00000oOI(iIllOioOlolI.I0001Ioi1lo());
/* 25 */            I0IiOl1oIloO i0IiOl1oIloO = new I0IiOl1oIloO(iIllOo0I00000oOI.I0010o(), IIlIool0Oi0O.I00000oIO);
/* 28 */            IOlO11lll0l iOlO11lll0l = IOlO11lll0l.I0000Il00O;
/* 33 */            IIoIi00lIii0 iIoIi00lIii0I00100l0 = oillOo0.I00100l0(iIllOo0I00000oOI, null, i0IiOl1oIloO, null, iOlO11lll0l, iOlO11lll0l);
                    synchronized (iIoIi00lIii0I00100l0.I00li1OI) {
                    }
/* 43 */            List list = (List) iOiOol0.I00iiI;
                    synchronized (iIoIi00lIii0I00100l0.I00li1OI) {
/* 48 */                iIoIi00lIii0I00100l0.I00ioIO = list;
                    }
                    synchronized (iIoIi00lIii0I00100l0.I00li1OI) {
                    }
/* 57 */            Range range = (Range) iOiOol0.I00iiO;
                    synchronized (iIoIi00lIii0I00100l0.I00li1OI) {
/* 62 */                iIoIi00lIii0I00100l0.I00l0I0l0lO1 = range;
                    }
/* 67 */            List list2 = (List) iOiOol0.I00ilO0;
/* 73 */            Objects.toString(list2);
/* 76 */            Objects.toString(oi0Oooi);
/* 80 */            l11I11lO.I0000O(3, "CameraUseCaseAdapter");
                    synchronized (iIoIi00lIii0I00100l0.I00li1OI) {
/* 86 */                I0Iiil0 i0Iiil0 = iIoIi00lIii0I00100l0.I00iOIl;
/* 88 */                IIlIi00 iIlIi00 = iIoIi00lIii0I00100l0.I00l0OO0IO;
/* 90 */                i0Iiil0.I000iOII(iIlIi00);
/* 93 */                I0Iiil0 i0Iiil02 = iIoIi00lIii0I00100l0.I00iiI;
/* 95 */                if (i0Iiil02 != null) {
/* 97 */                    i0Iiil02.I000iOII(iIlIi00);
                        }
/* 104 */               LinkedHashSet linkedHashSet = new LinkedHashSet(iIoIi00lIii0I00100l0.I00ilI0I1);
/* 107 */               linkedHashSet.addAll(list2);
/* 110 */               HashMap mapI000OiO = IIoIi00lIii0.I000OiO(linkedHashSet, oi0Oooi);
                        try {
                            try {
/* 121 */                       iIoIi00lIii0I00100l0.I001IIilI0O(linkedHashSet, iIoIi00lIii0I00100l0.I00iiI != null);
/* 124 */                       IIoIi00lIii0.I00II0Ol1O0l(mapI000OiO);
                            } catch (IllegalArgumentException e) {
/* 142 */                       throw new IIoIIOI0l1(e);
                            }
                        } catch (Throwable th) {
/* 143 */                   IIoIi00lIii0.I00II0Ol1O0l(mapI000OiO);
/* 146 */                   throw th;
                        }
                    }
                }
            }
