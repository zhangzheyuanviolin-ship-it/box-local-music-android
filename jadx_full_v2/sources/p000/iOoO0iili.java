            package p000;

            import android.app.PendingIntent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Message;
            import android.util.Log;
            
            public final class iOoO0iili extends O1oo1il01OoO {
                public final I1oIol10O I00000oOI;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public iOoO0iili(I1oIol10O i1oIol10O, Looper looper) {
/* 4 */             super(looper, 6);
/* 1 */             this.I00000oOI = i1oIol10O;
                }

                @Override
                public final void handleMessage(Message message) {
                    Boolean bool;
                    i1IIiIiiII i1iiiiiiii;
/* 1 */             I1oIol10O i1oIol10O = this.I00000oOI;
/* 5 */             int i = i1oIol10O.I001i1lo1io.get();
/* 9 */             int i2 = message.arg1;
/* 11 */            int i3 = message.what;
/* 17 */            if (i != i2) {
/* 19 */                if ((i3 == 2 || i3 == 1 || i3 == 7) && (i1iiiiiiii = (i1IIiIiiII) message.obj) != null) {
                            synchronized (i1iiiiiiii) {
/* 34 */                        i1iiiiiiii.I00000oIO = null;
                            }
/* 37 */                    I1oIol10O i1oIol10O2 = i1iiiiiiii.I0000Il00O;
                            synchronized (i1oIol10O2.I000l1) {
/* 44 */                        i1oIol10O2.I000l1.remove(i1iiiiiiii);
                            }
/* 48 */                    return;
                        }
/* 437 */               return;
                    }
/* 57 */            if ((i3 == 1 || i3 == 7 || ((i3 == 4 && !(i1oIol10O instanceof lIOlIOO0l)) || i3 == 5)) && !i1oIol10O.I00100o1O0lo()) {
/* 410 */               i1IIiIiiII i1iiiiiiii2 = (i1IIiIiiII) message.obj;
/* 412 */               if (i1iiiiiiii2 != null) {
                            synchronized (i1iiiiiiii2) {
/* 415 */                       i1iiiiiiii2.I00000oIO = null;
                            }
/* 418 */                   I1oIol10O i1oIol10O3 = i1iiiiiiii2.I0000Il00O;
                            synchronized (i1oIol10O3.I000l1) {
/* 425 */                       i1oIol10O3.I000l1.remove(i1iiiiiiii2);
                            }
/* 429 */                   return;
                        }
/* 437 */               return;
                    }
/* 75 */            int i4 = message.what;
/* 80 */            if (i4 == 4) {
/* 89 */                i1oIol10O.I001IIilI0O = new IOlo10lO1iOl(message.arg2, null, null);
/* 95 */                if (i1oIol10O.I001IO000() && !i1oIol10O.I001IO000) {
/* 102 */                   i1oIol10O.I001i1O0Ol(3, null);
/* 105 */                   return;
                        }
/* 106 */               IOlo10lO1iOl iOlo10lO1iOl = i1oIol10O.I001IIilI0O;
/* 108 */               if (iOlo10lO1iOl == null) {
/* 113 */                   iOlo10lO1iOl = new IOlo10lO1iOl(8, null, null);
                        }
/* 118 */               i1oIol10O.I000OiO.I000O01llI0(iOlo10lO1iOl);
/* 121 */               System.currentTimeMillis();
/* 124 */               return;
                    }
/* 125 */           if (i4 == 5) {
/* 127 */               IOlo10lO1iOl iOlo10lO1iOl2 = i1oIol10O.I001IIilI0O;
/* 129 */               if (iOlo10lO1iOl2 == null) {
/* 134 */                   iOlo10lO1iOl2 = new IOlo10lO1iOl(8, null, null);
                        }
/* 139 */               i1oIol10O.I000OiO.I000O01llI0(iOlo10lO1iOl2);
/* 142 */               System.currentTimeMillis();
/* 145 */               return;
                    }
/* 146 */           if (i4 == 3) {
/* 148 */               Object obj = message.obj;
/* 167 */               i1oIol10O.I000OiO.I000O01llI0(new IOlo10lO1iOl(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
/* 170 */               System.currentTimeMillis();
/* 173 */               return;
                    }
/* 175 */           if (i4 == 6) {
/* 177 */               i1oIol10O.I001i1O0Ol(5, null);
/* 180 */               I1oIlIIIiOo0 i1oIlIIIiOo0 = i1oIol10O.I000oI1ioi;
/* 182 */               if (i1oIlIIIiOo0 != null) {
/* 186 */                   i1oIlIIIiOo0.I0000O(message.arg2);
                        }
/* 189 */               System.currentTimeMillis();
/* 192 */               i1oIol10O.I00111O(5, 1, null);
/* 195 */               return;
                    }
/* 196 */           if (i4 == 2 && !i1oIol10O.I00100l0()) {
/* 207 */               i1IIiIiiII i1iiiiiiii3 = (i1IIiIiiII) message.obj;
/* 209 */               if (i1iiiiiiii3 != null) {
                            synchronized (i1iiiiiiii3) {
/* 212 */                       i1iiiiiiii3.I00000oIO = null;
                            }
/* 215 */                   I1oIol10O i1oIol10O4 = i1iiiiiiii3.I0000Il00O;
                            synchronized (i1oIol10O4.I000l1) {
/* 222 */                       i1oIol10O4.I000l1.remove(i1iiiiiiii3);
                            }
/* 226 */                   return;
                        }
/* 437 */               return;
                    }
/* 233 */           int i5 = message.what;
/* 235 */           if (i5 != 2 && i5 != 1 && i5 != 7) {
/* 270 */               Log.wtf("GmsClient", Oi010OO0.I00100l0(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
/* 273 */               return;
                    }
/* 276 */           i1IIiIiiII i1iiiiiiii4 = (i1IIiIiiII) message.obj;
                    synchronized (i1iiiiiiii4) {
                        try {
/* 283 */                   bool = i1iiiiiiii4.I00000oIO;
/* 287 */                   if (i1iiiiiiii4.I00000oOI) {
/* 291 */                       String string = i1iiiiiiii4.toString();
/* 303 */                       StringBuilder sb = new StringBuilder(string.length() + 47);
/* 306 */                       sb.append("Callback proxy ");
/* 309 */                       sb.append(string);
/* 312 */                       sb.append(" being reused. This is not safe.");
/* 319 */                       Log.w("GmsClient", sb.toString());
                            }
                        } catch (Throwable th) {
/* 407 */                   throw th;
                        }
                    }
/* 326 */           if (bool != null) {
/* 328 */               I1oIol10O i1oIol10O5 = i1iiiiiiii4.I0001Ioi1lo;
/* 330 */               int i6 = i1iiiiiiii4.I0000O;
/* 332 */               if (i6 != 0) {
/* 352 */                   i1oIol10O5.I001i1O0Ol(1, null);
/* 355 */                   Bundle bundle = i1iiiiiiii4.I0000oI00;
/* 374 */                   i1iiiiiiii4.I00000oOI(new IOlo10lO1iOl(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
                        } else if (!i1iiiiiiii4.I00000oIO()) {
/* 340 */                   i1oIol10O5.I001i1O0Ol(1, null);
/* 348 */                   i1iiiiiiii4.I00000oOI(new IOlo10lO1iOl(8, null, null));
                        }
                    }
                    synchronized (i1iiiiiiii4) {
/* 378 */               i1iiiiiiii4.I00000oOI = true;
                    }
                    synchronized (i1iiiiiiii4) {
/* 382 */               i1iiiiiiii4.I00000oIO = null;
                    }
/* 385 */           I1oIol10O i1oIol10O6 = i1iiiiiiii4.I0000Il00O;
                    synchronized (i1oIol10O6.I000l1) {
/* 392 */               i1oIol10O6.I000l1.remove(i1iiiiiiii4);
                    }
                }
            }
