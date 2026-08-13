            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.UUID;
            
            public final class Oooo00lI implements Ool10ll {
                public HashSet I00iOIl;
                public HashMap I00iiI;
                public HashMap I00iiO;
                public HashMap I00iio;
                public OolO0o0O10I I00ilI0I1;
                public IIllOo0 I00ilO0;
                public IIllOo0 I00io1l;
                public IIl1i10oO I00ioIO;
                public HashSet I00l0I0l0lO1;
                public HashMap I00l0OO0IO;
                public Oi0Oo1OIoOo I00li1OI;
                public Oi0Oo1OIoOo I00ll1;

                public static void I001IO000(OlioOil olioOil, IiIO1ol1i1o0 iiIO1ol1i1o0, OillooOlI oillooOlI) {
/* 1 */             olioOil.I0000oI00();
                    try {
/* 4 */                 lOllIO.I00000oIO();
/* 7 */                 olioOil.I00000oIO();
/* 10 */                OlioII olioII = olioOil.I000l1;
/* 15 */                Olio0o olio0o = new Olio0o(0);
/* 18 */                olio0o.I00iiI = olioII;
/* 20 */                VarHandle.storeStoreFence();
/* 23 */                olioII.I000II(iiIO1ol1i1o0, olio0o);
                    } catch (IiIO1IliI1Ol unused) {
/* 27 */                OilloOil0 oilloOil0 = oillooOlI.I0001Ioi1lo;
/* 29 */                if (oilloOil0 != null) {
/* 31 */                    oilloOil0.I00000oIO(oillooOlI);
                        }
                    }
                }

                public static IiIO1ol1i1o0 I001i1O0Ol(Ool10o ool10o) {
/* 18 */            List listI00000oOI = ool10o instanceof Ioi1Io1o ? ool10o.I00100l0.I00000oOI() : Collections.unmodifiableList(ool10o.I00100l0.I000II.I00000oIO);
/* 34 */            lII1OI11o1I.I0000oI00(null, listI00000oOI.size() <= 1);
/* 41 */            if (listI00000oOI.size() == 1) {
/* 47 */                return (IiIO1ol1i1o0) listI00000oOI.get(0);
                    }
/* 33 */            return null;
                }

                @Override
                public final void I0000oI00(Ool10o ool10o) {
                    IiIO1ol1i1o0 iiIO1ol1i1o0I001i1O0Ol;
/* 1 */             lOllIO.I00000oIO();
/* 10 */            OlioOil olioOil = (OlioOil) this.I00iiI.get(ool10o);
/* 12 */            Objects.requireNonNull(olioOil);
/* 19 */            if (I001iOo1i0O(ool10o) && (iiIO1ol1i1o0I001i1O0Ol = I001i1O0Ol(ool10o)) != null) {
/* 30 */                I001IO000(olioOil, iiIO1ol1i1o0I001i1O0Ol, ool10o.I00100l0);
                    }
                }

                @Override
                public final void I000II(Ool10o ool10o) {
/* 1 */             lOllIO.I00000oIO();
/* 8 */             if (I001iOo1i0O(ool10o)) {
/* 77 */                return;
                    }
/* 15 */            this.I00iio.put(ool10o, Boolean.TRUE);
/* 18 */            IiIO1ol1i1o0 iiIO1ol1i1o0I001i1O0Ol = I001i1O0Ol(ool10o);
/* 22 */            if (iiIO1ol1i1o0I001i1O0Ol != null) {
/* 30 */                OlioOil olioOil = (OlioOil) this.I00iiI.get(ool10o);
/* 32 */                Objects.requireNonNull(olioOil);
/* 37 */                I001IO000(olioOil, iiIO1ol1i1o0I001i1O0Ol, ool10o.I00100l0);
                    }
                }

                @Override
                public final void I000OiO(Ool10o ool10o) {
/* 1 */             lOllIO.I00000oIO();
/* 8 */             if (I001iOo1i0O(ool10o)) {
/* 17 */                OlioOil olioOil = (OlioOil) this.I00iiI.get(ool10o);
/* 19 */                Objects.requireNonNull(olioOil);
/* 22 */                IiIO1ol1i1o0 iiIO1ol1i1o0I001i1O0Ol = I001i1O0Ol(ool10o);
/* 26 */                if (iiIO1ol1i1o0I001i1O0Ol != null) {
/* 30 */                    I001IO000(olioOil, iiIO1ol1i1o0I001i1O0Ol, ool10o.I00100l0);
/* 33 */                    return;
                        }
/* 34 */                lOllIO.I00000oIO();
/* 37 */                olioOil.I00000oIO();
/* 42 */                olioOil.I000l1.I00000oIO();
                    }
                }

                @Override
                public final void I00111O(Ool10o ool10o) {
/* 1 */             lOllIO.I00000oIO();
/* 8 */             if (I001iOo1i0O(ool10o)) {
/* 15 */                this.I00iio.put(ool10o, Boolean.FALSE);
/* 24 */                OlioOil olioOil = (OlioOil) this.I00iiI.get(ool10o);
/* 26 */                Objects.requireNonNull(olioOil);
/* 29 */                lOllIO.I00000oIO();
/* 32 */                olioOil.I00000oIO();
/* 37 */                olioOil.I000l1.I00000oIO();
                    }
                }

                public final I1l1llI1 I001IIilI0O(Ool10o ool10o, Oi0Oo1OIoOo oi0Oo1OIoOo, IIllOo0 iIllOo0, OlioOil olioOil, int i, boolean z) {
/* 5 */             int iI000o00OoI0I = iIllOo0.I0000Il00O().I000o00OoI0I(i);
/* 11 */            boolean zI0000oI00 = OoI0lIiO.I0000oI00(olioOil.I00000oOI);
/* 21 */            OolIl0ii1 oolIl0ii1 = (OolIl0ii1) this.I00l0OO0IO.get(ool10o);
/* 23 */            Objects.requireNonNull(oolIl0ii1);
/* 34 */            OOI1i0iI oOI1i0iII00000oOI = oi0Oo1OIoOo.I00000oOI(oolIl0ii1, olioOil.I0000O, OoI0lIiO.I00000oOI(olioOil.I00000oOI), z);
/* 38 */            Rect rect = oOI1i0iII00000oOI.I00000oIO;
/* 40 */            Size size = oOI1i0iII00000oOI.I00000oOI;
/* 63 */            int iI000OOo1O = OoI0lIiO.I000OOo1O((olioOil.I000OOo1O + iIllOo0.I0000Il00O().I000o00OoI0I(((IoiIli1i0Oil) ool10o.I000OOo1O).I001lloI(0))) - iI000o00OoI0I);
/* 71 */            boolean zI000o00OoI0I = ool10o.I000o00OoI0I(iIllOo0) ^ zI0000oI00;
/* 84 */            int i2 = ool10o instanceof OOIIOiolI ? 1 : ool10o instanceof Ioi1Io1o ? 4 : 2;
/* 92 */            int i3 = ool10o instanceof Ioi1Io1o ? Barcode.FORMAT_QR_CODE : 34;
/* 94 */            Size sizeI000II = OoI0lIiO.I000II(iI000OOo1O, size);
/* 100 */           UUID uuidRandomUUID = UUID.randomUUID();
/* 104 */           I1l1llI1 i1l1llI1 = new I1l1llI1();
/* 108 */           if (uuidRandomUUID == null) {
/* 138 */               IOOlIIilOl0.I000II("Null getUuid");
/* 107 */               return null;
                    }
/* 110 */           i1l1llI1.I00000oIO = uuidRandomUUID;
/* 112 */           i1l1llI1.I00000oOI = i2;
/* 114 */           i1l1llI1.I0000Il00O = i3;
/* 116 */           i1l1llI1.I0000O = rect;
/* 118 */           if (sizeI000II == null) {
/* 132 */               IOOlIIilOl0.I000II("Null getSize");
/* 107 */               return null;
                    }
/* 120 */           i1l1llI1.I0000oI00 = sizeI000II;
/* 122 */           i1l1llI1.I0001Ioi1lo = iI000OOo1O;
/* 124 */           i1l1llI1.I000II = zI000o00OoI0I;
/* 126 */           VarHandle.storeStoreFence();
/* 129 */           return i1l1llI1;
                }

                public final HashMap I001i1lo1io(OlioOil olioOil, boolean z) {
/* 3 */             HashMap map = new HashMap();
/* 8 */             Iterator it = this.I00iOIl.iterator();
/* 16 */            while (it.hasNext()) {
/* 22 */                Ool10o ool10o = (Ool10o) it.next();
/* 24 */                Oi0Oo1OIoOo oi0Oo1OIoOo = this.I00li1OI;
/* 32 */                OolIl0ii1 oolIl0ii1 = (OolIl0ii1) this.I00l0OO0IO.get(ool10o);
/* 34 */                Objects.requireNonNull(oolIl0ii1);
/* 49 */                Size size = oi0Oo1OIoOo.I00000oOI(oolIl0ii1, olioOil.I0000O, OoI0lIiO.I00000oOI(olioOil.I00000oOI), z).I0000Il00O;
/* 51 */                map.put(ool10o, size);
/* 54 */                Objects.toString(size);
/* 57 */                Objects.toString(ool10o);
/* 63 */                l11I11lO.I0000O(3, "VirtualCameraAdapter");
                    }
/* 106 */           return map;
                }

                public final boolean I001iOo1i0O(Ool10o ool10o) {
/* 7 */             Boolean bool = (Boolean) this.I00iio.get(ool10o);
/* 9 */             Objects.requireNonNull(bool);
/* 12 */            return bool.booleanValue();
                }

                public final void I001l0I00(HashMap map, HashMap map2) {
/* 1 */             HashMap map3 = this.I00iiI;
/* 3 */             map3.clear();
/* 6 */             map3.putAll(map);
/* 21 */            for (Map.Entry entry : map3.entrySet()) {
/* 33 */                Ool10o ool10o = (Ool10o) entry.getKey();
/* 39 */                OlioOil olioOil = (OlioOil) entry.getValue();
/* 43 */                ool10o.I001lllioOl(olioOil.I0000O);
/* 48 */                ool10o.I001lIiIIo1O(olioOil.I00000oOI);
/* 53 */                IOiOol0 iOiOol0I00000oOI = olioOil.I000II.I00000oOI();
/* 61 */                Size size = (Size) map2.get(ool10o);
/* 63 */                if (size != null) {
/* 65 */                    iOiOol0I00000oOI.I00iiO = size;
                        }
/* 72 */                ool10o.I00II0oii1o(iOiOol0I00000oOI.I0000O(), null);
/* 75 */                ool10o.I0010I0i();
                    }
                }
            }
