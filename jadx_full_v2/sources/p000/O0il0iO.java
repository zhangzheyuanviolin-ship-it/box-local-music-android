            package p000;

            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O0il0iO implements Oli1oI111, O1iOIoOiO0 {
                public O0ilio1l0 I00iOIl;
                public O0io0olo I00iiI;

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00iOIl.I00iiI;
                }

                @Override
                public final List I000o00OoI0I(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             O0io0olo o0io0olo = this.I00iiI;
/* 3 */             O0iiOioolIi o0iiOioolIi = o0io0olo.I00iOIl;
/* 5 */             OI10I1IoI0Ol oI10I1IoI0Ol = o0io0olo.I00io1l;
/* 11 */            O0iiOioolIi o0iiOioolIi2 = (O0iiOioolIi) oI10I1IoI0Ol.I000II(obj);
/* 13 */            if (o0iiOioolIi2 != null && ((OI110O0) ((OI0oIOI) o0iiOioolIi.I000oI1ioi()).I00iiI).I000OiO(o0iiOioolIi2) < o0io0olo.I00iio) {
/* 33 */                return o0iiOioolIi2.I000lI();
                    }
/* 38 */            OI10I1IoI0Ol oI10I1IoI0Ol2 = o0io0olo.I00ll1;
/* 40 */            OI10I1IoI0Ol oI10I1IoI0Ol3 = o0io0olo.I00l0OO0IO;
/* 42 */            OI110O0 oi110o0 = o0io0olo.I00lli11;
/* 48 */            if (oi110o0.I00iiO < o0io0olo.I00ilI0I1) {
/* 53 */                IolioOO1.I00000oIO("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
                    }
/* 60 */            O0iiOioolIi o0iiOioolIi3 = (O0iiOioolIi) oI10I1IoI0Ol.I000II(obj);
/* 62 */            int i = oi110o0.I00iiO;
/* 64 */            int i2 = o0io0olo.I00ilI0I1;
/* 66 */            if (i == i2) {
/* 68 */                oi110o0.I00000oOI(obj);
                    } else {
/* 72 */                Object[] objArr = oi110o0.I00iOIl;
/* 74 */                Object obj2 = objArr[i2];
/* 76 */                objArr[i2] = obj;
                    }
                    o0io0olo.I00ilI0I1++;
/* 84 */            boolean zI00000oOI = oI10I1IoI0Ol3.I00000oOI(obj);
/* 89 */            if (zI00000oOI || o0iiOioolIi3 != null) {
/* 104 */               if (!zI00000oOI && o0iiOioolIi3 != null) {
/* 134 */                   o0io0olo.I000OiO(((OI110O0) ((OI0oIOI) o0iiOioolIi.I000oI1ioi()).I00iiI).I000OiO(o0iiOioolIi3), ((OI110O0) ((OI0oIOI) o0iiOioolIi.I000oI1ioi()).I00iiI).I00iiO);
                            o0io0olo.I00o0iI0io1++;
/* 142 */                   oI10I1IoI0Ol.I000iOII(obj);
/* 145 */                   oI10I1IoI0Ol3.I000lI(obj, o0iiOioolIi3);
/* 152 */                   oI10I1IoI0Ol2.I000lI(obj, o0io0olo.I0000oI00(obj));
/* 159 */                   if (o0iiOioolIi.I00Io1lO()) {
/* 161 */                       o0io0olo.I000O01llI0();
                            }
                        }
/* 168 */               O0iiOioolIi o0iiOioolIi4 = (O0iiOioolIi) oI10I1IoI0Ol3.I000II(obj);
/* 182 */               O0il1o0oIi o0il1o0oIi = o0iiOioolIi4 != null ? (O0il1o0oIi) o0io0olo.I00ilO0.I000II(o0iiOioolIi4) : null;
/* 183 */               if (o0il1o0oIi != null && o0il1o0oIi.I0000O) {
/* 189 */                   o0io0olo.I000lI(o0iiOioolIi4, obj, false, illiIl1l11O);
                        }
/* 196 */               if ((o0il1o0oIi != null ? o0il1o0oIi.I0001Ioi1lo : null) != null) {
/* 198 */                   o0io0olo.I00000oIO(o0il1o0oIi, true);
                        }
                    } else {
/* 93 */                o0io0olo.I000iOII(obj, illiIl1l11O, false);
/* 100 */               oI10I1IoI0Ol2.I000lI(obj, o0io0olo.I0000oI00(obj));
                    }
/* 205 */           O0iiOioolIi o0iiOioolIi5 = (O0iiOioolIi) oI10I1IoI0Ol3.I000II(obj);
/* 207 */           if (o0iiOioolIi5 == null) {
/* 240 */               return Il01100l.I00iOIl;
                    }
/* 213 */           List listI00ioIO = o0iiOioolIi5.I010I0.I00100l0.I00ioIO();
/* 217 */           int size = listI00ioIO.size();
/* 221 */           for (int i3 = 0; i3 < size; i3++) {
/* 234 */               ((O1iO1i) ((OI0oIOI) listI00ioIO).get(i3)).I00ilO0.I00000oOI = true;
                    }
/* 239 */           return listI00ioIO;
                }

                @Override
                public final long I00100l0(float f) {
/* 3 */             return this.I00iOIl.I00100l0(f);
                }

                @Override
                public final long I00100o1O0lo(long j) {
/* 3 */             return this.I00iOIl.I00100o1O0lo(j);
                }

                @Override
                public final O1iOIo0o0 I001i1lo1io(int i, int i2, Map map, Function1 function1) {
/* 8 */             return this.I00iOIl.I00io1l(i, i2, map, null, function1);
                }

                @Override
                public final float I001lIiIIo1O(long j) {
/* 3 */             return this.I00iOIl.I001lIiIIo1O(j);
                }

                @Override
                public final long I00IioO0OiOi(int i) {
/* 3 */             return this.I00iOIl.I00IioO0OiOi(i);
                }

                @Override
                public final long I00Io1o110i(float f) {
/* 3 */             return this.I00iOIl.I00Io1o110i(f);
                }

                @Override
                public final float I00O0o1oo(int i) {
/* 3 */             return this.I00iOIl.I00O0o1oo(i);
                }

                @Override
                public final float I00OIO1(float f) {
/* 7 */             return f / this.I00iOIl.I00000oIO();
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00iOIl.I00iiO;
                }

                @Override
                public final boolean I00OloOo() {
/* 3 */             return this.I00iOIl.I00OloOo();
                }

                @Override
                public final float I00i0ilIl0i(float f) {
/* 7 */             return this.I00iOIl.I00000oIO() * f;
                }

                @Override
                public final int I00iio(long j) {
/* 3 */             return this.I00iOIl.I00iio(j);
                }

                @Override
                public final O1iOIo0o0 I00io1l(int i, int i2, Map map, Function1 function1, Function1 function12) {
/* 3 */             return this.I00iOIl.I00io1l(i, i2, map, function1, function12);
                }

                @Override
                public final int I00l0OO0IO(float f) {
/* 3 */             return this.I00iOIl.I00l0OO0IO(f);
                }

                @Override
                public final long I00oI0i(long j) {
/* 3 */             return this.I00iOIl.I00oI0i(j);
                }

                @Override
                public final float I00oO101o(long j) {
/* 3 */             return this.I00iOIl.I00oO101o(j);
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 3 */             return this.I00iOIl.I00iOIl;
                }
            }
