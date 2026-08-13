            package p000;

            import android.os.Bundle;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class OiIil1il implements OiIii0 {
                public static final IoloOio0I I00ilI0I1 = OiIoloOl0.I00000oIO(new IiI01lI(29), new OOii01Ioi1(13));
                public final Map I00iOIl;
                public final OI10I1IoI0Ol I00iiI;
                public OiIiol10 I00iiO;
                public final OiIii0oi10I I00iio;

                public OiIil1il(Map map) {
/* 4 */             this.I00iOIl = map;
/* 6 */             long[] jArr = OiO10oio.I00000oIO;
/* 13 */            this.I00iiI = new OI10I1IoI0Ol();
/* 18 */            OiIii0oi10I oiIii0oi10I = new OiIii0oi10I(0);
/* 21 */            oiIii0oi10I.I00iiI = this;
/* 23 */            VarHandle.storeStoreFence();
/* 26 */            this.I00iio = oiIii0oi10I;
                }

                @Override
                public final void I00000oOI(Object obj, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(533563200);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000OOo1O(obj) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000OOo1O(this) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 71 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 73 */                iloI0lOlll1.I00i0ilIl0i(obj);
/* 76 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 80 */                Object obj2 = IOl11li.I00000oIO;
/* 82 */                if (objI00O0i0ii == obj2) {
/* 84 */                    OiIii0oi10I oiIii0oi10I = this.I00iio;
/* 96 */                    if (!((Boolean) oiIii0oi10I.invoke(obj)).booleanValue()) {
/* 163 */                       OIiilo1Ool0o.I0010o(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.");
/* 166 */                       return;
                            }
/* 108 */                   OiIl0IIi0 oiIl0IIi0I00000oIO = OiIl0oI.I00000oIO((Map) this.I00iOIl.get(obj), oiIii0oi10I);
/* 112 */                   OiIl1O1OO oiIl1O1OO = new OiIl1O1OO();
/* 115 */                   oiIl1O1OO.I00iOIl = oiIl0IIi0I00000oIO;
/* 119 */                   Object objI0000oI00 = oiIl0IIi0I00000oIO.I0000oI00("androidx.savedstate.SavedStateRegistry");
/* 130 */                   Bundle bundle = objI0000oI00 instanceof Bundle ? (Bundle) objI0000oI00 : null;
/* 131 */                   if (bundle != null) {
/* 133 */                       oiIl1O1OO.I0001Ioi1lo(bundle);
                            }
/* 140 */                   OIOo1iiI oIOo1iiI = new OIOo1iiI(19);
/* 143 */                   oIOo1iiI.I00iiI = oiIl1O1OO;
/* 145 */                   VarHandle.storeStoreFence();
/* 148 */                   oiIl0IIi0I00000oIO.I00000oIO("androidx.savedstate.SavedStateRegistry", oIOo1iiI);
/* 151 */                   VarHandle.storeStoreFence();
/* 154 */                   iloI0lOlll1.I00iio(oiIl1O1OO);
/* 157 */                   objI00O0i0ii = oiIl1O1OO;
                        }
/* 167 */               Object obj3 = (OiIl1O1OO) objI00O0i0ii;
/* 190 */               iiliio0o.I00000oOI(new OOiIo1lll[]{OiIl0oI.I00000oIO.I00000oIO(obj3), O11oI0.I00000oIO.I00000oIO(obj3)}, iOii1l, iloI0lOlll1, (i2 & 112) | 8);
/* 206 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(this) | iloI0lOlll1.I000OOo1O(obj) | iloI0lOlll1.I000OOo1O(obj3);
/* 207 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii2;
/* 211 */               if (zI000OOo1O || objI00O0i0ii2 == obj2) {
/* 219 */                   O11IOOoiI10i o11IOOoiI10i = new O11IOOoiI10i(9);
/* 222 */                   o11IOOoiI10i.I00iiI = this;
/* 224 */                   o11IOOoiI10i.I00iiO = obj;
/* 226 */                   o11IOOoiI10i.I00iio = obj3;
/* 228 */                   VarHandle.storeStoreFence();
/* 231 */                   iloI0lOlll1.I00iio(o11IOOoiI10i);
                            obj4 = o11IOOoiI10i;
                        }
/* 238 */               iIO0iiOiOl0l.I00000oOI(OoiIlOl1iI.I00000oIO, (Function1) obj4, iloI0lOlll1);
/* 243 */               if (iloI0lOlll1.I001iOo1i0O && iloI0lOlll1.I00IO1oi11O.I000OOo1O == iloI0lOlll1.I001l0I00) {
/* 254 */                   iloI0lOlll1.I001l0I00 = -1;
/* 256 */                   iloI0lOlll1.I001iOo1i0O = false;
                        }
/* 258 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 262 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 265 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 269 */           if (oOloioIlI001IO000 != null) {
/* 275 */               I0IliiililIo i0IliiililIo = new I0IliiililIo(17);
/* 278 */               i0IliiililIo.I00iiO = this;
/* 280 */               i0IliiililIo.I00iio = obj;
/* 282 */               i0IliiililIo.I00ilI0I1 = iOii1l;
/* 284 */               i0IliiililIo.I00iiI = i;
/* 286 */               VarHandle.storeStoreFence();
/* 289 */               oOloioIlI001IO000.I0000O = i0IliiililIo;
                    }
                }

                @Override
                public final void I0001Ioi1lo(Object obj) {
/* 7 */             if (this.I00iiI.I000iOII(obj) == null) {
/* 11 */                this.I00iOIl.remove(obj);
                    }
                }
            }
