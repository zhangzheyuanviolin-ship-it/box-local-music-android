            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O0ilio1l0 implements Oli1oI111 {
                public O0iOOoiioO I00iOIl;
                public float I00iiI;
                public float I00iiO;
                public O0io0olo I00iio;

                @Override
                public final float I00000oIO() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final List I000o00OoI0I(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             O0io0olo o0io0olo = this.I00iio;
/* 3 */             o0io0olo.I000O01llI0();
/* 6 */             O0iiOioolIi o0iiOioolIi = o0io0olo.I00iOIl;
/* 10 */            O0iiOII1OO o0iiOII1OO = o0iiOioolIi.I010I0.I0000O;
/* 12 */            O0iiOII1OO o0iiOII1OO2 = O0iiOII1OO.I00iOIl;
/* 14 */            if (o0iiOII1OO != o0iiOII1OO2 && o0iiOII1OO != O0iiOII1OO.I00iiO && o0iiOII1OO != O0iiOII1OO.I00iiI && o0iiOII1OO != O0iiOII1OO.I00iio) {
/* 31 */                IolioOO1.I0000Il00O("subcompose can only be used inside the measure or layout blocks");
                    }
/* 34 */            OI10I1IoI0Ol oI10I1IoI0Ol = o0io0olo.I00io1l;
/* 36 */            Object objI000II = oI10I1IoI0Ol.I000II(obj);
/* 42 */            if (objI000II == null) {
/* 50 */                objI000II = (O0iiOioolIi) o0io0olo.I00l0OO0IO.I000iOII(obj);
/* 52 */                if (objI000II != null) {
/* 64 */                    if (o0io0olo.I00o0iI0io1 <= 0) {
/* 69 */                        IolioOO1.I0000Il00O("Check failed.");
                            }
                            o0io0olo.I00o0iI0io1--;
                        } else {
/* 79 */                    objI000II = o0io0olo.I000o00OoI0I(obj);
/* 83 */                    if (objI000II == null) {
/* 85 */                        int i = o0io0olo.I00iio;
/* 90 */                        O0iiOioolIi o0iiOioolIi2 = new O0iiOioolIi(2);
/* 93 */                        o0iiOioolIi.I00oI0i = true;
/* 95 */                        o0iiOioolIi.I001lloI(i, o0iiOioolIi2);
/* 98 */                        o0iiOioolIi.I00oI0i = false;
/* 100 */                       objI000II = o0iiOioolIi2;
                            }
                        }
/* 101 */               oI10I1IoI0Ol.I000lI(obj, objI000II);
                    }
/* 104 */           O0iiOioolIi o0iiOioolIi3 = (O0iiOioolIi) objI000II;
/* 116 */           if (IOOi0Ool1i.I00II0oii1o(o0io0olo.I00iio, o0iiOioolIi.I000oI1ioi()) != o0iiOioolIi3) {
/* 128 */               int iI000OiO = ((OI110O0) ((OI0oIOI) o0iiOioolIi.I000oI1ioi()).I00iiI).I000OiO(o0iiOioolIi3);
/* 134 */               if (iI000OiO < o0io0olo.I00iio) {
/* 156 */                   IolioOO1.I00000oIO("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                        }
/* 159 */               int i2 = o0io0olo.I00iio;
/* 161 */               if (i2 != iI000OiO) {
/* 163 */                   o0io0olo.I000OiO(iI000OiO, i2);
                        }
                    }
                    o0io0olo.I00iio++;
/* 171 */           o0io0olo.I000lI(o0iiOioolIi3, obj, false, illiIl1l11O);
                    return (o0iiOII1OO == o0iiOII1OO2 || o0iiOII1OO == O0iiOII1OO.I00iiO) ? o0iiOioolIi3.I000lI() : o0iiOioolIi3.I000l1();
                }

                @Override
                public final float I00Ol00() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final boolean I00OloOo() {
/* 7 */             O0iiOII1OO o0iiOII1OO = this.I00iio.I00iOIl.I010I0.I0000O;
                    return o0iiOII1OO == O0iiOII1OO.I00iio || o0iiOII1OO == O0iiOII1OO.I00iiI;
                }

                @Override
                public final O1iOIo0o0 I00io1l(int i, int i2, Map map, Function1 function1, Function1 function12) {
/* 5 */             if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
/* 38 */                IolioOO1.I0000Il00O("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
                    }
/* 43 */            O0io0olo o0io0olo = this.I00iio;
/* 45 */            O0ilIO1o o0ilIO1o = new O0ilIO1o();
/* 48 */            o0ilIO1o.I00000oIO = i;
/* 50 */            o0ilIO1o.I00000oOI = i2;
/* 52 */            o0ilIO1o.I0000Il00O = map;
/* 54 */            o0ilIO1o.I0000O = function1;
/* 56 */            o0ilIO1o.I0000oI00 = this;
/* 58 */            o0ilIO1o.I0001Ioi1lo = o0io0olo;
/* 60 */            o0ilIO1o.I000II = function12;
/* 62 */            VarHandle.storeStoreFence();
/* 399 */           return o0ilIO1o;
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 1 */             return this.I00iOIl;
                }
            }
