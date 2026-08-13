            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.util.ArrayMap;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OolI1i extends Oll0io implements Function1 {
                public int I00iOIl;
                public final LinkedHashSet I00iiI;
                public final boolean I00iiO;
                public final OolI1lo I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OolI1i(LinkedHashSet linkedHashSet, boolean z, OolI1lo oolI1lo, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(1, iOoil1iiIilo);
/* 1 */             this.I00iiI = linkedHashSet;
/* 3 */             this.I00iiO = z;
/* 5 */             this.I00iio = oolI1lo;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new OolI1i(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((OolI1i) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 3 */             OolI1lo oolI1lo = this.I00iio;
/* 5 */             LinkedHashMap linkedHashMap = oolI1lo.I000iOII;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00iOIl;
/* 13 */            if (i != 0) {
/* 15 */                if (i == 1) {
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
/* 20 */                    return obj;
                        }
/* 23 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                return null;
                    }
/* 27 */            lIoii1l01l0i.I00000oOI(obj);
/* 33 */            l11I11lO.I0000O(3, "CXCP");
/* 42 */            Oilo101I11l0 oilo101I11l0 = new Oilo101I11l0(this.I00iiI, this.I00iiO);
/* 65 */            OillooOlI oillooOlI = ((Oilloi0llol1) oilo101I11l0.I0000oI00.getValue()).I0000Il00O() ? (OillooOlI) oilo101I11l0.I0001Ioi1lo.getValue() : null;
/* 67 */            if (oillooOlI == null) {
/* 69 */                l11I11lO.I0000O(3, "CXCP");
/* 74 */                LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 79 */                I0oiil10Ili i0oiil10Ili = new I0oiil10Ili();
/* 84 */                ArrayList arrayList = new ArrayList();
/* 89 */                ArrayList arrayList2 = new ArrayList();
/* 94 */                ArrayList arrayList3 = new ArrayList();
/* 97 */                i0oiil10Ili.I00iiI = 1;
/* 135 */               oillooOlI = new OillooOlI(new ArrayList(linkedHashSet), new ArrayList(arrayList), new ArrayList(arrayList2), new ArrayList(arrayList3), i0oiil10Ili.I0001Ioi1lo(), null, null, 0, null);
                    }
/* 139 */           IIoo00iOol0 iIoo00iOol0 = oillooOlI.I000II;
/* 141 */           l11I11lO.I0000O(3, "CXCP");
/* 144 */           Ool1iI0OiI ool1iI0OiI = Ool1iI0OiI.I00iOIl;
/* 146 */           IOi10loi iOi10loi = OolI1lo.I000l1;
/* 150 */           I0lOoloIoi i0lOoloIoi = oolI1lo.I0000oI00.I0000O;
/* 156 */           boolean z = false;
/* 157 */           IIl0lo1oi iIl0lo1oi = new IIl0lo1oi(0);
/* 170 */           if (!iIoo00iOol0.I00000oIO().equals(I1lIoOIi.I000O01llI0)) {
/* 184 */               iIl0lo1oi.I00iiI.I0010I0i(iOil1io0i00.I00000oIO(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE), iIoo00iOol0.I00000oIO());
                    }
/* 189 */           iIl0lo1oi.I0000O(iIoo00iOol0.I00000oOI);
/* 192 */           Olo0o1II0 olo0o1II0 = iIoo00iOol0.I0000oI00;
/* 196 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 199 */           ArrayMap arrayMap = olo0o1II0.I00000oIO;
/* 215 */           for (String str : arrayMap.keySet()) {
/* 221 */               boolean z2 = z;
/* 231 */               linkedHashMap2.put(str, arrayMap.get(str));
/* 234 */               z = z2;
                    }
/* 238 */           boolean z3 = z;
/* 242 */           LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
/* 245 */           List list = iIoo00iOol0.I0000O;
/* 251 */           IIl1Iloio iIl1Iloio = new IIl1Iloio();
/* 256 */           Iterator it = list.iterator();
/* 264 */           while (it.hasNext()) {
/* 272 */               iIl1Iloio.I00000oIO((IIl1Ol) it.next(), i0lOoloIoi);
                    }
/* 276 */           Oi01Ooii1Ol[] oi01Ooii1OlArr = new Oi01Ooii1Ol[1];
/* 278 */           oi01Ooii1OlArr[z3 ? 1 : 0] = iIl1Iloio;
/* 293 */           linkedHashMap.put(ool1iI0OiI, new Ool1o1l(iIl0lo1oi, linkedHashMap3, Oio0lI.I0000O(oi01Ooii1OlArr), Oi0OO1IIl1.I00000oIO(iIoo00iOol0.I0000Il00O)));
/* 306 */           LinkedHashSet linkedHashSetI00000oOI = oolI1lo.I0000Il00O.I00000oOI(Collections.unmodifiableList(iIoo00iOol0.I00000oIO));
/* 311 */           l11I11lO.I0000O(3, "CXCP");
/* 314 */           Ool1o1l ool1o1lI000oI1ioi = OolI1lo.I000oI1ioi(linkedHashMap);
/* 318 */           this.I00iOIl = 1;
/* 320 */           Object objI0010I0i = oolI1lo.I0010I0i(ool1o1lI000oI1ioi, linkedHashSetI00000oOI, this);
                    return objI0010I0i == ii0111o ? ii0111o : objI0010I0i;
                }
            }
