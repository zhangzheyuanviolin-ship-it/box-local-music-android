            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.net.Uri;
            import java.io.InputStream;
            
            public final class I1o0lo01 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final Context I00iiI;
                public final Uri I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1o0lo01(Context context, Uri uri, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = context;
/* 5 */             this.I00iiO = uri;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Uri uri = this.I00iiO;
/* 5 */             Context context = this.I00iiI;
                    switch (i) {
                        case 0:
/* 48 */                    return new I1o0lo01(context, uri, iOoil1iiIilo, 0);
                        case 1:
/* 41 */                    return new I1o0lo01(context, uri, iOoil1iiIilo, 1);
                        case 2:
/* 34 */                    return new I1o0lo01(context, uri, iOoil1iiIilo, 2);
                        case 3:
/* 27 */                    return new I1o0lo01(context, uri, iOoil1iiIilo, 3);
                        case 4:
/* 20 */                    return new I1o0lo01(context, uri, iOoil1iiIilo, 4);
                        default:
/* 13 */                    return new I1o0lo01(context, uri, iOoil1iiIilo, 5);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((I1o0lo01) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    InputStream inputStreamOpenInputStream;
/* 1 */             int i = this.I00iOIl;
/* 6 */             int iI0000O = 1;
/* 7 */             Context context = this.I00iiI;
/* 9 */             Uri uri = this.I00iiO;
                    switch (i) {
                        case 0:
/* 375 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 377 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 384 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 388 */                       if (inputStreamOpenInputStream == null) {
/* 11 */                            return null;
                                }
                                try {
/* 390 */                           Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
/* 394 */                           inputStreamOpenInputStream.close();
/* 397 */                           return bitmapDecodeStream;
                                } finally {
                                    try {
/* 400 */                               throw th;
                                    } finally {
                                    }
                                }
                            } catch (Exception unused) {
/* 11 */                        return null;
                            }
                        case 1:
/* 293 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 295 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 302 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 306 */                       if (inputStreamOpenInputStream == null) {
/* 11 */                            return null;
                                }
                                try {
/* 308 */                           Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
/* 312 */                           inputStreamOpenInputStream.close();
/* 315 */                           if (bitmapDecodeStream2 == null) {
/* 11 */                                return null;
                                    }
/* 322 */                           inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 326 */                           if (inputStreamOpenInputStream != null) {
                                        try {
/* 333 */                                   iI0000O = new Il1Ilio1Ol1(inputStreamOpenInputStream).I0000O(1, "Orientation");
/* 337 */                                   inputStreamOpenInputStream.close();
                                        } finally {
                                            try {
/* 342 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    }
/* 348 */                           Bitmap bitmapI0000Il00O = li10oO000.I0000Il00O(bitmapDecodeStream2, iI0000O);
/* 352 */                           Bitmap.Config config = bitmapI0000Il00O.getConfig();
/* 356 */                           Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                                    return config == config2 ? bitmapI0000Il00O : bitmapI0000Il00O.copy(config2, false);
                                } finally {
                                    try {
/* 368 */                               throw th;
                                    } finally {
                                    }
                                }
                            } catch (Throwable unused2) {
/* 11 */                        return null;
                            }
                        case 2:
/* 261 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 263 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 270 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 274 */                       if (inputStreamOpenInputStream == null) {
/* 11 */                            return null;
                                }
                                try {
/* 276 */                           Bitmap bitmapDecodeStream3 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
/* 280 */                           inputStreamOpenInputStream.close();
/* 283 */                           return bitmapDecodeStream3;
                                } finally {
                                    try {
/* 286 */                               throw th;
                                    } finally {
                                    }
                                }
                            } catch (Exception unused3) {
/* 11 */                        return null;
                            }
                        case 3:
/* 179 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 181 */                   lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 188 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 192 */                       if (inputStreamOpenInputStream == null) {
/* 11 */                            return null;
                                }
                                try {
/* 194 */                           Bitmap bitmapDecodeStream4 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
/* 198 */                           inputStreamOpenInputStream.close();
/* 201 */                           if (bitmapDecodeStream4 == null) {
/* 11 */                                return null;
                                    }
/* 208 */                           inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 212 */                           if (inputStreamOpenInputStream != null) {
                                        try {
/* 219 */                                   iI0000O = new Il1Ilio1Ol1(inputStreamOpenInputStream).I0000O(1, "Orientation");
/* 223 */                                   inputStreamOpenInputStream.close();
                                        } finally {
                                            try {
/* 228 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    }
/* 234 */                           Bitmap bitmapI0000Il00O2 = li10oO000.I0000Il00O(bitmapDecodeStream4, iI0000O);
/* 238 */                           Bitmap.Config config3 = bitmapI0000Il00O2.getConfig();
/* 242 */                           Bitmap.Config config4 = Bitmap.Config.ARGB_8888;
                                    return config3 == config4 ? bitmapI0000Il00O2 : bitmapI0000Il00O2.copy(config4, false);
                                } finally {
                                    try {
/* 254 */                               throw th;
                                    } finally {
                                    }
                                }
                            } catch (Throwable unused4) {
/* 11 */                        return null;
                            }
                        case 4:
/* 97 */                    Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 99 */                    lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 106 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 110 */                       if (inputStreamOpenInputStream == null) {
/* 11 */                            return null;
                                }
                                try {
/* 112 */                           Bitmap bitmapDecodeStream5 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
/* 116 */                           inputStreamOpenInputStream.close();
/* 119 */                           if (bitmapDecodeStream5 == null) {
/* 11 */                                return null;
                                    }
/* 126 */                           inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 130 */                           if (inputStreamOpenInputStream != null) {
                                        try {
/* 137 */                                   iI0000O = new Il1Ilio1Ol1(inputStreamOpenInputStream).I0000O(1, "Orientation");
/* 141 */                                   inputStreamOpenInputStream.close();
                                        } finally {
                                            try {
/* 146 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    }
/* 152 */                           Bitmap bitmapI0000Il00O3 = li10oO000.I0000Il00O(bitmapDecodeStream5, iI0000O);
/* 156 */                           Bitmap.Config config5 = bitmapI0000Il00O3.getConfig();
/* 160 */                           Bitmap.Config config6 = Bitmap.Config.ARGB_8888;
                                    return config5 == config6 ? bitmapI0000Il00O3 : bitmapI0000Il00O3.copy(config6, false);
                                } finally {
                                    try {
/* 172 */                               throw th;
                                    } finally {
                                    }
                                }
                            } catch (Throwable unused5) {
/* 11 */                        return null;
                            }
                        default:
/* 15 */                    Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
                            try {
/* 24 */                        inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 28 */                        if (inputStreamOpenInputStream == null) {
/* 11 */                            return null;
                                }
                                try {
/* 30 */                            Bitmap bitmapDecodeStream6 = BitmapFactory.decodeStream(inputStreamOpenInputStream);
/* 34 */                            inputStreamOpenInputStream.close();
/* 37 */                            if (bitmapDecodeStream6 == null) {
/* 11 */                                return null;
                                    }
/* 44 */                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 48 */                            if (inputStreamOpenInputStream != null) {
                                        try {
/* 55 */                                    iI0000O = new Il1Ilio1Ol1(inputStreamOpenInputStream).I0000O(1, "Orientation");
/* 59 */                                    inputStreamOpenInputStream.close();
                                        } finally {
                                        }
                                    }
/* 70 */                            Bitmap bitmapI0000Il00O4 = li10oO000.I0000Il00O(bitmapDecodeStream6, iI0000O);
/* 74 */                            Bitmap.Config config7 = bitmapI0000Il00O4.getConfig();
/* 78 */                            Bitmap.Config config8 = Bitmap.Config.ARGB_8888;
                                    return config7 == config8 ? bitmapI0000Il00O4 : bitmapI0000Il00O4.copy(config8, false);
                                } finally {
                                }
                            } catch (Throwable unused6) {
/* 11 */                        return null;
                            }
                    }
                }
            }
