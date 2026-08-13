            package p000;

            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.RandomAccess;
            
            public final class O0lO1101 extends I01I01Oolii {
                public o01l1ioOo0 I00li1OI;
                public OOoO0OoIIO I00ll1;

                @Override
                public final List I010iIIOlo(List list) {
                    O0lO1101 o0lO1101;
                    Oi1ol0llI oi1ol0llI;
                    O0iIl1 o0iIl1;
                    O0iIl1 o0iIl1I000OOo1O;
/* 1 */             o01l1ioOo0 o01l1iooo0 = this.I00li1OI;
/* 10 */            Oi1ol0llI oi1ol0llI2 = (Oi1ol0llI) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000iOII;
/* 12 */            List<O0iIl1> list2 = list;
/* 22 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 33 */            for (O0iIl1 o0iIl12 : list2) {
/* 49 */                if (OoOilo0Oliii.I0000Il00O(o0iIl12, OOo1l011.I00oOio10iI1, null)) {
/* 51 */                    o0lO1101 = this;
/* 52 */                    oi1ol0llI = oi1ol0llI2;
/* 53 */                    o0iIl1 = o0iIl12;
                        } else {
/* 61 */                    o0lO1101 = this;
/* 67 */                    oi1ol0llI = oi1ol0llI2;
/* 68 */                    o0iIl1 = o0iIl12;
/* 72 */                    o0iIl1I000OOo1O = oi1ol0llI.I000OOo1O(new Ol0IO1iloi(o0lO1101, false, o01l1iooo0, I11I1111oi0.I00ilO0, false), o0iIl1, Il01100l.I00iOIl, null, false);
/* 76 */                    if (o0iIl1I000OOo1O == null) {
                            }
/* 79 */                    arrayList.add(o0iIl1I000OOo1O);
/* 82 */                    this = o0lO1101;
/* 83 */                    oi1ol0llI2 = oi1ol0llI;
                        }
/* 78 */                o0iIl1I000OOo1O = o0iIl1;
/* 79 */                arrayList.add(o0iIl1I000OOo1O);
/* 82 */                this = o0lO1101;
/* 83 */                oi1ol0llI2 = oi1ol0llI;
                    }
/* 186 */           return arrayList;
                }

                @Override
                public final List I010ioo() {
/* 1 */             o01l1ioOo0 o01l1iooo0 = this.I00li1OI;
/* 7 */             Type[] bounds = this.I00ll1.I00000oIO.getBounds();
/* 14 */            ArrayList arrayList = new ArrayList(bounds.length);
/* 20 */            for (Type type : bounds) {
/* 29 */                arrayList.add(new OOoI10lllo(type));
                    }
/* 39 */            OOoI10lllo oOoI10lllo = (OOoI10lllo) IOOi0Ool1i.I00Ol00(arrayList);
                    RandomAccess randomAccess = arrayList;
/* 53 */            if (O0000Ioio00.I0000O(oOoI10lllo != null ? oOoI10lllo.I00000oIO : null, Object.class)) {
/* 55 */                randomAccess = Il01100l.I00iOIl;
                    }
/* 57 */            ArrayList arrayList2 = (Collection) randomAccess;
/* 63 */            if (arrayList2.isEmpty()) {
/* 97 */                return Collections.singletonList(l0loOIIo0iOo.I00000oIO(((OI0011) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000O01llI0).I00iio.I0000oI00(), ((OI0011) ((I0l1OOl1l10) o01l1iooo0.I00iOIl).I000O01llI0).I00iio.I000oI1ioi()));
                    }
/* 102 */           ArrayList arrayList3 = arrayList2;
/* 112 */           ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 115 */           Iterator it = arrayList3.iterator();
/* 123 */           while (it.hasNext()) {
/* 146 */               arrayList4.add(((iOliil) o01l1iooo0.I00iio).I001lloI((OOoI10lllo) it.next(), l01ill.I00000oIO(OoOilOl1.I00iiI, false, this, 3)));
                    }
/* 541 */           return arrayList4;
                }
            }
