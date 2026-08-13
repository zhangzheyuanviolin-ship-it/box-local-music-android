            package p000;

            import android.view.KeyEvent;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol10oOiIII implements Function1 {
                public boolean I00iOIl;
                public IOO1O00oI I00iiI;
                public int I00iiO;
                public boolean I00iio;
                public Function1 I00ilI0I1;
                public boolean I00ilO0;
                public float I00io1l;
                public IllOOo00lI I00ioIO;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             KeyEvent keyEvent = ((O0O1l0ilO) obj).I00000oIO;
/* 5 */             IllOOo00lI illOOo00lI = this.I00ioIO;
/* 7 */             boolean z = this.I00ilO0;
/* 9 */             float f = this.I00io1l;
/* 11 */            Function1 function1 = this.I00ilI0I1;
/* 13 */            IOO1O00oI iOO1O00oI = this.I00iiI;
/* 15 */            float f2 = iOO1O00oI.I00000oOI;
/* 19 */            if (!this.I00iOIl) {
/* 21 */                return Boolean.FALSE;
                    }
/* 24 */            int iI00000oOI = l0iloO.I00000oOI(keyEvent);
/* 30 */            if (iI00000oOI != 2) {
/* 467 */               if (iI00000oOI != 1) {
/* 703 */                   return Boolean.FALSE;
                        }
/* 469 */               if (z) {
/* 475 */                   long jI00000oIO = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 485 */                   if (!O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0000O) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00IO1) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I0000oI00) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00IO1oi11O) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I001IO000) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00IlilI0i0i) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I001i1O0Ol) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00Io1lO) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I001lloI) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00Io1o110i) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00II0Ol1O0l) && !O0O11OI0i.I00000oIO(jI00000oIO, O0O11OI0i.I00IoIO0lI)) {
/* 576 */                       return Boolean.FALSE;
                            }
/* 579 */                   if (illOOo00lI != null) {
/* 581 */                       illOOo00lI.invoke();
                            }
/* 584 */                   return Boolean.TRUE;
                        }
/* 591 */               long jI00000oIO2 = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 601 */               if (!O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I000II) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IioO0OiOi) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I0001Ioi1lo) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IOO) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I001IO000) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IlilI0i0i) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I001i1O0Ol) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00Io1lO) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I001lloI) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00Io1o110i) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00II0Ol1O0l) && !O0O11OI0i.I00000oIO(jI00000oIO2, O0O11OI0i.I00IoIO0lI)) {
/* 692 */                   return Boolean.FALSE;
                        }
/* 695 */               if (illOOo00lI != null) {
/* 697 */                   illOOo00lI.invoke();
                        }
/* 700 */               return Boolean.TRUE;
                    }
/* 32 */            float f3 = iOO1O00oI.I00000oIO;
/* 36 */            float fAbs = Math.abs(f2 - f3);
/* 40 */            int i = this.I00iiO;
/* 49 */            float f4 = fAbs / (i > 0 ? i + 1 : 100);
/* 56 */            int i2 = this.I00iio ? -1 : 1;
/* 71 */            if (O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I001IO000) || O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I00IlilI0i0i)) {
/* 461 */               function1.invoke(Float.valueOf(f3));
/* 464 */               return Boolean.TRUE;
                    }
/* 105 */           if (O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I001i1O0Ol) || O0O11OI0i.I00000oIO(l0lIloi.I00000oIO(keyEvent.getKeyCode()), O0O11OI0i.I00Io1lO)) {
/* 451 */               function1.invoke(Float.valueOf(f2));
/* 454 */               return Boolean.TRUE;
                    }
/* 127 */           if (z) {
/* 133 */               long jI00000oIO3 = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 143 */               if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I0000O) || O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00IO1)) {
/* 283 */                   function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf(f - (i2 * f4)), iOO1O00oI));
/* 286 */                   return Boolean.TRUE;
                        }
/* 161 */               if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I0000oI00) || O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00IO1oi11O)) {
/* 266 */                   function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf((i2 * f4) + f), iOO1O00oI));
/* 269 */                   return Boolean.TRUE;
                        }
/* 178 */               if (O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I001lloI) || O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00Io1o110i)) {
/* 249 */                   function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf(f - ((lIiioliIlo.I0000Il00O(r7 / 10, 1, 10) * i2) * f4)), iOO1O00oI));
/* 252 */                   return Boolean.TRUE;
                        }
/* 195 */               if (!O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00II0Ol1O0l) && !O0O11OI0i.I00000oIO(jI00000oIO3, O0O11OI0i.I00IoIO0lI)) {
/* 206 */                   return Boolean.FALSE;
                        }
/* 226 */               function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf((lIiioliIlo.I0000Il00O(r7 / 10, 1, 10) * i2 * f4) + f), iOO1O00oI));
/* 229 */               return Boolean.TRUE;
                    }
/* 293 */           long jI00000oIO4 = l0lIloi.I00000oIO(keyEvent.getKeyCode());
/* 303 */           if (O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I000II) || O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I00IioO0OiOi)) {
/* 441 */               function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf((i2 * f4) + f), iOO1O00oI));
/* 444 */               return Boolean.TRUE;
                    }
/* 321 */           if (O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I0001Ioi1lo) || O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I00IOO)) {
/* 424 */               function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf(f - (i2 * f4)), iOO1O00oI));
/* 427 */               return Boolean.TRUE;
                    }
/* 338 */           if (O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I001lloI) || O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I00Io1o110i)) {
/* 407 */               function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf((lIiioliIlo.I0000Il00O(r7 / 10, 1, 10) * f4) + f), iOO1O00oI));
/* 410 */               return Boolean.TRUE;
                    }
/* 355 */           if (!O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I00II0Ol1O0l) && !O0O11OI0i.I00000oIO(jI00000oIO4, O0O11OI0i.I00IoIO0lI)) {
/* 366 */               return Boolean.FALSE;
                    }
/* 385 */           function1.invoke(lIiioliIlo.I0000oI00(Float.valueOf(f - (lIiioliIlo.I0000Il00O(r7 / 10, 1, 10) * f4)), iOO1O00oI));
/* 388 */           return Boolean.TRUE;
                }
            }
