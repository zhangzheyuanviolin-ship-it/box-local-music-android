            package p000;

            import android.database.sqlite.SQLiteConstraintException;
            import android.util.Log;
            
            public final class O11iI11 extends Oll0io implements IlliIl1l11O {
                public OI11ol I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public String I00iio;
                public long I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;
                public int I00ioIO;
                public final O11iO00I1o I00l0I0l0lO1;
                public final IO1loOo1o I00l0OO0IO;
                public final String I00li1OI;
                public final long I00ll1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O11iI11(O11iO00I1o o11iO00I1o, IO1loOo1o iO1loOo1o, String str, long j, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00l0I0l0lO1 = o11iO00I1o;
/* 3 */             this.I00l0OO0IO = iO1loOo1o;
/* 5 */             this.I00li1OI = str;
/* 7 */             this.I00ll1 = j;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new O11iI11(this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O11iI11) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Not initialized variable reg: 8, insn: 0x004f: MOVE (r1 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:80), block:B:19:0x004f */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v10 */
                /* JADX WARN: Type inference failed for: r1v15 */
                /* JADX WARN: Type inference failed for: r1v16 */
                /* JADX WARN: Type inference failed for: r1v2, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r1v20, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r1v5 */
                /* JADX WARN: Type inference failed for: r8v11, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r8v13, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r8v14, types: [OI11ol] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    O11iO00I1o o11iO00I1o;
                    IO1loOo1o iO1loOo1o;
                    String str;
                    OI1I0OoOl oI1I0OoOl;
                    int i;
                    long j;
                    OI1I0OoOl oI1I0OoOl2;
                    OI1I0OoOl oI1I0OoOl3;
                    IO1loOo1o iO1loOo1o2;
                    long j2;
                    String str2;
                    String str3;
                    int i2;
                    int i3;
                    IO1loOo1o iO1loOo1o3;
                    long j3;
                    String str4;
                    int i4;
                    OI1I0OoOl oI1I0OoOl4;
                    SQLiteConstraintException e;
                    OI1I0OoOl oI1I0OoOl5;
                    OI1I0OoOl oI1I0OoOl6;
                    int i5;
                    String str5;
                    Object obj2;
/* 1 */             O11iI11 o11iI11 = this;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i6 = o11iI11.I00ioIO;
/* 7 */             int i7 = 0;
/* 10 */            ?? r1 = 2;
                    try {
                        try {
                        } catch (Throwable th) {
/* 40 */                    th = th;
                        }
                    } catch (Exception e2) {
/* 356 */               Log.e("AGLlmChatViewModel", "Failed to persist assistant message", e2);
                    }
                    try {
/* 15 */                if (i6 == 0) {
/* 150 */                   lIoii1l01l0i.I00000oOI(obj);
/* 153 */                   o11iO00I1o = o11iI11.I00l0I0l0lO1;
/* 155 */                   OI1I0OoOl oI1I0OoOl7 = o11iO00I1o.I000II;
/* 157 */                   iO1loOo1o = o11iI11.I00l0OO0IO;
/* 159 */                   str = o11iI11.I00li1OI;
/* 161 */                   long j4 = o11iI11.I00ll1;
/* 163 */                   o11iI11.I00iOIl = oI1I0OoOl7;
/* 165 */                   o11iI11.I00iiI = o11iO00I1o;
/* 167 */                   o11iI11.I00iiO = iO1loOo1o;
/* 169 */                   o11iI11.I00iio = str;
/* 171 */                   o11iI11.I00ilI0I1 = j4;
/* 173 */                   o11iI11.I00ilO0 = 0;
/* 175 */                   o11iI11.I00ioIO = 1;
/* 181 */                   if (oI1I0OoOl7.I00000oIO(o11iI11) != ii0111o) {
/* 185 */                       oI1I0OoOl = oI1I0OoOl7;
/* 186 */                       i = 0;
/* 187 */                       j = j4;
                            }
/* 341 */                   return ii0111o;
                        }
/* 17 */                if (i6 != 1) {
                            try {
/* 19 */                        if (i6 != 2) {
/* 21 */                            if (i6 != 3) {
/* 23 */                                if (i6 != 4) {
/* 45 */                                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                    return null;
                                        }
/* 33 */                                ?? r12 = o11iI11.I00iOIl;
/* 35 */                                lIoii1l01l0i.I00000oOI(obj);
                                        oI1I0OoOl2 = r12;
/* 343 */                               oI1I0OoOl = oI1I0OoOl2;
/* 344 */                               oI1I0OoOl.I00000oOI(null);
/* 359 */                               return OoiIlOl1iI.I00000oIO;
                                    }
/* 49 */                            i3 = o11iI11.I00io1l;
/* 51 */                            i2 = o11iI11.I00ilO0;
/* 53 */                            long j5 = o11iI11.I00ilI0I1;
/* 55 */                            String str6 = o11iI11.I00iio;
/* 59 */                            String str7 = (String) o11iI11.I00iiO;
/* 63 */                            iO1loOo1o2 = (IO1loOo1o) o11iI11.I00iiI;
/* 65 */                            ?? r8 = o11iI11.I00iOIl;
/* 67 */                            lIoii1l01l0i.I00000oOI(obj);
/* 70 */                            oI1I0OoOl3 = r8;
/* 73 */                            str3 = str6;
/* 74 */                            str2 = str7;
/* 75 */                            j2 = j5;
                                    try {
/* 314 */                               o11iI11.I00iOIl = oI1I0OoOl3;
/* 316 */                               o11iI11.I00iiI = str3;
/* 318 */                               o11iI11.I00iiO = null;
/* 320 */                               o11iI11.I00iio = null;
/* 322 */                               o11iI11.I00ilO0 = i2;
/* 324 */                               o11iI11.I00io1l = i3;
/* 327 */                               o11iI11.I00ioIO = 4;
/* 339 */                               if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str3, "assistant", str2, j2, null, o11iI11, 40) != ii0111o) {
/* 342 */                                   oI1I0OoOl2 = oI1I0OoOl3;
/* 343 */                                   oI1I0OoOl = oI1I0OoOl2;
/* 344 */                                   oI1I0OoOl.I00000oOI(null);
/* 359 */                                   return OoiIlOl1iI.I00000oIO;
                                        }
/* 341 */                               return ii0111o;
                                    } catch (Throwable th2) {
/* 348 */                               th = th2;
/* 349 */                               r1 = oI1I0OoOl3;
/* 350 */                               r1.I00000oOI(null);
/* 353 */                               throw th;
                                    }
                                }
/* 83 */                        i7 = o11iI11.I00io1l;
/* 85 */                        int i8 = o11iI11.I00ilO0;
/* 87 */                        long j6 = o11iI11.I00ilI0I1;
/* 89 */                        str4 = o11iI11.I00iio;
/* 94 */                        String str8 = (String) o11iI11.I00iiO;
/* 99 */                        IO1loOo1o iO1loOo1o4 = (IO1loOo1o) o11iI11.I00iiI;
/* 101 */                       ?? r82 = o11iI11.I00iOIl;
                                try {
/* 103 */                           lIoii1l01l0i.I00000oOI(obj);
                                    oI1I0OoOl5 = r82;
/* 246 */                           oI1I0OoOl = oI1I0OoOl5;
                                } catch (SQLiteConstraintException e3) {
/* 108 */                           e = e3;
/* 111 */                           i4 = i8;
/* 112 */                           str2 = str8;
/* 113 */                           oI1I0OoOl4 = r82;
/* 114 */                           iO1loOo1o3 = iO1loOo1o4;
/* 115 */                           j3 = j6;
/* 278 */                           Log.w("AGLlmChatViewModel", "Foreign key constraint failed for assistant message, conversation might not be committed yet. Retrying...", e);
/* 281 */                           o11iI11.I00iOIl = oI1I0OoOl4;
/* 283 */                           o11iI11.I00iiI = iO1loOo1o3;
/* 285 */                           o11iI11.I00iiO = str2;
/* 287 */                           o11iI11.I00iio = str4;
/* 289 */                           o11iI11.I00ilI0I1 = j3;
/* 291 */                           o11iI11.I00ilO0 = i4;
/* 293 */                           o11iI11.I00io1l = i7;
/* 295 */                           o11iI11.I00ioIO = 3;
/* 303 */                           if (il0l1o1l.I00000oOI(100L, o11iI11) != ii0111o) {
/* 306 */                               i3 = i7;
/* 307 */                               oI1I0OoOl3 = oI1I0OoOl4;
/* 308 */                               i2 = i4;
/* 309 */                               str3 = str4;
/* 310 */                               j2 = j3;
/* 311 */                               iO1loOo1o2 = iO1loOo1o3;
/* 314 */                               o11iI11.I00iOIl = oI1I0OoOl3;
/* 316 */                               o11iI11.I00iiI = str3;
/* 318 */                               o11iI11.I00iiO = null;
/* 320 */                               o11iI11.I00iio = null;
/* 322 */                               o11iI11.I00ilO0 = i2;
/* 324 */                               o11iI11.I00io1l = i3;
/* 327 */                               o11iI11.I00ioIO = 4;
/* 339 */                               if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o2, str3, "assistant", str2, j2, null, o11iI11, 40) != ii0111o) {
                                        }
                                    }
/* 341 */                           return ii0111o;
                                }
/* 344 */                       oI1I0OoOl.I00000oOI(null);
/* 359 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th3) {
/* 79 */                        th = th3;
/* 80 */                        r1 = obj2;
/* 350 */                       r1.I00000oOI(null);
/* 353 */                       throw th;
                            }
                        }
/* 119 */               int i9 = o11iI11.I00ilO0;
/* 121 */               long j7 = o11iI11.I00ilI0I1;
/* 123 */               str = o11iI11.I00iio;
/* 127 */               iO1loOo1o = (IO1loOo1o) o11iI11.I00iiO;
/* 131 */               o11iO00I1o = (O11iO00I1o) o11iI11.I00iiI;
/* 133 */               ?? r83 = o11iI11.I00iOIl;
/* 135 */               lIoii1l01l0i.I00000oOI(obj);
/* 138 */               j = j7;
/* 140 */               i = i9;
/* 141 */               oI1I0OoOl = r83;
/* 190 */               String str9 = o11iO00I1o.I0001Ioi1lo;
/* 192 */               if (str9 == null) {
                            try {
/* 196 */                       Log.w("AGLlmChatViewModel", "No conversation ID available for assistant message, skipping persistence");
/* 344 */                       oI1I0OoOl.I00000oOI(null);
/* 359 */                       return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th4) {
/* 201 */                       th = th4;
/* 202 */                       r1 = oI1I0OoOl;
/* 350 */                       r1.I00000oOI(null);
/* 353 */                       throw th;
                            }
                        }
                        try {
/* 207 */                   o11iI11.I00iOIl = oI1I0OoOl;
/* 209 */                   o11iI11.I00iiI = iO1loOo1o3;
/* 211 */                   o11iI11.I00iiO = str;
/* 213 */                   o11iI11.I00iio = str9;
/* 215 */                   o11iI11.I00ilI0I1 = j3;
/* 217 */                   o11iI11.I00ilO0 = i;
/* 219 */                   o11iI11.I00io1l = 0;
/* 221 */                   o11iI11.I00ioIO = 2;
/* 224 */                   int i10 = i;
/* 225 */                   str5 = str9;
/* 228 */                   i5 = i10;
/* 230 */                   oI1I0OoOl6 = oI1I0OoOl;
                        } catch (SQLiteConstraintException e4) {
/* 268 */                   e = e4;
/* 269 */                   i5 = i;
/* 271 */                   oI1I0OoOl6 = oI1I0OoOl;
/* 274 */                   str5 = str9;
                        }
                        try {
                        } catch (SQLiteConstraintException e5) {
/* 254 */                   e = e5;
/* 255 */                   o11iI11 = this;
/* 256 */                   iO1loOo1o3 = iO1loOo1o3;
/* 257 */                   str2 = str;
/* 258 */                   oI1I0OoOl4 = oI1I0OoOl6;
/* 260 */                   str4 = str5;
/* 261 */                   i4 = i5;
/* 278 */                   Log.w("AGLlmChatViewModel", "Foreign key constraint failed for assistant message, conversation might not be committed yet. Retrying...", e);
/* 281 */                   o11iI11.I00iOIl = oI1I0OoOl4;
/* 283 */                   o11iI11.I00iiI = iO1loOo1o3;
/* 285 */                   o11iI11.I00iiO = str2;
/* 287 */                   o11iI11.I00iio = str4;
/* 289 */                   o11iI11.I00ilI0I1 = j3;
/* 291 */                   o11iI11.I00ilO0 = i4;
/* 293 */                   o11iI11.I00io1l = i7;
/* 295 */                   o11iI11.I00ioIO = 3;
/* 303 */                   if (il0l1o1l.I00000oOI(100L, o11iI11) != ii0111o) {
                            }
/* 341 */                   return ii0111o;
                        } catch (Throwable th5) {
/* 249 */                   th = th5;
/* 250 */                   r1 = oI1I0OoOl6;
/* 350 */                   r1.I00000oOI(null);
/* 353 */                   throw th;
                        }
/* 240 */               if (IO1loOo1o.I0001Ioi1lo(iO1loOo1o3, str5, "assistant", str, j3, null, this, 40) != ii0111o) {
/* 244 */                   oI1I0OoOl5 = oI1I0OoOl6;
/* 246 */                   oI1I0OoOl = oI1I0OoOl5;
/* 344 */                   oI1I0OoOl.I00000oOI(null);
/* 359 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 341 */               return ii0111o;
                    } catch (Throwable th6) {
/* 264 */               th = th6;
/* 265 */               oI1I0OoOl6 = oI1I0OoOl;
                    }
/* 143 */           iO1loOo1o3 = iO1loOo1o;
/* 144 */           j3 = j;
                }
            }
