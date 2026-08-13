            package p000;

            import android.graphics.Bitmap;
            import java.text.DateFormat;
            import java.text.ParsePosition;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Locale;
            import java.util.concurrent.TimeUnit;
            
            public final class IIi1OIllI {
                public final I0Oi111ii I00000oIO;
                public final IIi1IIlllIi I00000oOI;
                public final Date I0000Il00O;
                public final String I0000O;
                public final Date I0000oI00;
                public final String I0001Ioi1lo;
                public final Date I000II;
                public final long I000O01llI0;
                public final long I000OOo1O;
                public final String I000OiO;
                public final int I000iOII;

                /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
                /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IIi1OIllI(I0Oi111ii i0Oi111ii, IIi1IIlllIi iIi1IIlllIi) {
                    int i;
                    int i2;
                    Date date;
                    Date date2;
                    Date date3;
                    DateFormat simpleDateFormat;
/* 16 */            this.I00000oIO = i0Oi111ii;
/* 18 */            this.I00000oOI = iIi1IIlllIi;
/* 21 */            this.I000iOII = -1;
/* 23 */            if (iIi1IIlllIi != null) {
/* 27 */                this.I000O01llI0 = iIi1IIlllIi.I0000Il00O;
/* 31 */                this.I000OOo1O = iIi1IIlllIi.I0000O;
/* 33 */                Io1Io0OOi011 io1Io0OOi011 = iIi1IIlllIi.I0001Ioi1lo;
/* 35 */                int size = io1Io0OOi011.size();
/* 39 */                int i3 = 0;
/* 40 */                int i4 = 0;
/* 41 */                while (i4 < size) {
/* 43 */                    String strI0000O = io1Io0OOi011.I0000O(i4);
/* 52 */                    if (OlOolloIIOl0.I000O01llI0(strI0000O, "Date", true)) {
/* 54 */                        String strI00000oOI = io1Io0OOi011.I00000oOI("Date");
/* 58 */                        if (strI00000oOI != null) {
/* 60 */                            I0OiiiO i0OiiiO = Ii1Oil0IO.I00000oIO;
/* 66 */                            if (strI00000oOI.length() == 0) {
/* 68 */                                date3 = null;
/* 161 */                               this.I0000Il00O = date3;
/* 167 */                               this.I0000O = io1Io0OOi011.I000OiO(i4);
                                    } else {
/* 72 */                                ParsePosition parsePosition = new ParsePosition(i3);
/* 83 */                                Date date4 = ((DateFormat) Ii1Oil0IO.I00000oIO.get()).parse(strI00000oOI, parsePosition);
/* 95 */                                if (parsePosition.getIndex() == strI00000oOI.length()) {
/* 97 */                                    date3 = date4;
                                        } else {
/* 99 */                                    String[] strArr = Ii1Oil0IO.I00000oOI;
                                            synchronized (strArr) {
                                                try {
/* 102 */                                           int length = strArr.length;
/* 103 */                                           int i5 = i3;
/* 104 */                                           while (i5 < length) {
/* 106 */                                               DateFormat[] dateFormatArr = Ii1Oil0IO.I0000Il00O;
/* 108 */                                               DateFormat dateFormat = dateFormatArr[i5];
/* 110 */                                               if (dateFormat == null) {
/* 120 */                                                   simpleDateFormat = new SimpleDateFormat(Ii1Oil0IO.I00000oOI[i5], Locale.US);
/* 125 */                                                   simpleDateFormat.setTimeZone(OollIoI001lo.I0000oI00);
/* 128 */                                                   dateFormatArr[i5] = simpleDateFormat;
/* 130 */                                                   i3 = 0;
                                                        } else {
/* 134 */                                                   simpleDateFormat = dateFormat;
                                                        }
/* 136 */                                               parsePosition.setIndex(i3);
/* 139 */                                               Date date5 = simpleDateFormat.parse(strI00000oOI, parsePosition);
/* 147 */                                               if (parsePosition.getIndex() != 0) {
/* 150 */                                                   date3 = date5;
                                                            break;
                                                        } else {
/* 152 */                                                   i5++;
/* 155 */                                                   i3 = 0;
                                                        }
                                                    }
/* 68 */                                            date3 = null;
                                                } catch (Throwable th) {
/* 160 */                                           throw th;
                                                }
                                            }
                                        }
/* 161 */                               this.I0000Il00O = date3;
/* 167 */                               this.I0000O = io1Io0OOi011.I000OiO(i4);
                                    }
                                }
/* 469 */                       i4++;
/* 471 */                       i3 = i;
                            } else if (OlOolloIIOl0.I000O01llI0(strI0000O, "Expires", true)) {
/* 178 */                       String strI00000oOI2 = io1Io0OOi011.I00000oOI("Expires");
/* 182 */                       if (strI00000oOI2 != null) {
/* 184 */                           I0OiiiO i0OiiiO2 = Ii1Oil0IO.I00000oIO;
/* 190 */                           if (strI00000oOI2.length() == 0) {
/* 192 */                               date2 = null;
/* 281 */                               this.I000II = date2;
                                    } else {
/* 197 */                               ParsePosition parsePosition2 = new ParsePosition(0);
/* 208 */                               Date date6 = ((DateFormat) Ii1Oil0IO.I00000oIO.get()).parse(strI00000oOI2, parsePosition2);
/* 220 */                               if (parsePosition2.getIndex() == strI00000oOI2.length()) {
/* 222 */                                   date2 = date6;
                                        } else {
/* 224 */                                   String[] strArr2 = Ii1Oil0IO.I00000oOI;
                                            synchronized (strArr2) {
                                                try {
/* 227 */                                           int length2 = strArr2.length;
/* 229 */                                           for (int i6 = 0; i6 < length2; i6++) {
/* 231 */                                               DateFormat[] dateFormatArr2 = Ii1Oil0IO.I0000Il00O;
/* 233 */                                               DateFormat simpleDateFormat2 = dateFormatArr2[i6];
/* 235 */                                               if (simpleDateFormat2 == null) {
/* 245 */                                                   simpleDateFormat2 = new SimpleDateFormat(Ii1Oil0IO.I00000oOI[i6], Locale.US);
/* 250 */                                                   simpleDateFormat2.setTimeZone(OollIoI001lo.I0000oI00);
/* 253 */                                                   dateFormatArr2[i6] = simpleDateFormat2;
                                                        }
/* 259 */                                               parsePosition2.setIndex(0);
/* 262 */                                               date2 = simpleDateFormat2.parse(strI00000oOI2, parsePosition2);
/* 270 */                                               if (parsePosition2.getIndex() != 0) {
                                                            break;
                                                        }
                                                    }
/* 192 */                                           date2 = null;
                                                } catch (Throwable th2) {
/* 280 */                                           throw th2;
                                                }
                                            }
                                        }
/* 281 */                               this.I000II = date2;
                                    }
                                }
/* 469 */                       i4++;
/* 471 */                       i3 = i;
                            } else {
/* 288 */                       if (OlOolloIIOl0.I000O01llI0(strI0000O, "Last-Modified", true)) {
/* 290 */                           String strI00000oOI3 = io1Io0OOi011.I00000oOI("Last-Modified");
/* 294 */                           if (strI00000oOI3 != null) {
/* 296 */                               I0OiiiO i0OiiiO3 = Ii1Oil0IO.I00000oIO;
/* 302 */                               if (strI00000oOI3.length() == 0) {
/* 304 */                                   i = 0;
                                        } else {
/* 310 */                                   ParsePosition parsePosition3 = new ParsePosition(0);
/* 321 */                                   Date date7 = ((DateFormat) Ii1Oil0IO.I00000oIO.get()).parse(strI00000oOI3, parsePosition3);
/* 333 */                                   if (parsePosition3.getIndex() == strI00000oOI3.length()) {
/* 335 */                                       date = date7;
/* 336 */                                       i = 0;
                                            } else {
/* 338 */                                       String[] strArr3 = Ii1Oil0IO.I00000oOI;
                                                synchronized (strArr3) {
                                                    try {
/* 341 */                                               int length3 = strArr3.length;
/* 343 */                                               for (int i7 = 0; i7 < length3; i7++) {
/* 345 */                                                   DateFormat[] dateFormatArr3 = Ii1Oil0IO.I0000Il00O;
/* 347 */                                                   DateFormat simpleDateFormat3 = dateFormatArr3[i7];
/* 349 */                                                   if (simpleDateFormat3 == null) {
/* 359 */                                                       simpleDateFormat3 = new SimpleDateFormat(Ii1Oil0IO.I00000oOI[i7], Locale.US);
/* 364 */                                                       simpleDateFormat3.setTimeZone(OollIoI001lo.I0000oI00);
/* 367 */                                                       dateFormatArr3[i7] = simpleDateFormat3;
                                                            }
/* 369 */                                                   i = 0;
/* 373 */                                                   parsePosition3.setIndex(0);
/* 376 */                                                   date = simpleDateFormat3.parse(strI00000oOI3, parsePosition3);
/* 384 */                                                   if (parsePosition3.getIndex() != 0) {
                                                                break;
                                                            }
                                                        }
/* 391 */                                               i = 0;
                                                    } catch (Throwable th3) {
/* 395 */                                               throw th3;
                                                    }
                                                }
                                            }
/* 396 */                                   this.I0000oI00 = date;
/* 402 */                                   this.I0001Ioi1lo = io1Io0OOi011.I000OiO(i4);
                                        }
/* 305 */                               date = null;
/* 396 */                               this.I0000oI00 = date;
/* 402 */                               this.I0001Ioi1lo = io1Io0OOi011.I000OiO(i4);
                                    }
                                } else {
/* 405 */                           i = 0;
/* 412 */                           if (OlOolloIIOl0.I000O01llI0(strI0000O, "ETag", true)) {
/* 418 */                               this.I000OiO = io1Io0OOi011.I000OiO(i4);
                                    } else if (OlOolloIIOl0.I000O01llI0(strI0000O, "Age", true)) {
/* 429 */                               String strI000OiO = io1Io0OOi011.I000OiO(i4);
/* 433 */                               Bitmap.Config[] configArr = I000O01llI0.I00000oIO;
/* 435 */                               Long lI000o00OoI0I = OlOolloIIOl0.I000o00OoI0I(strI000OiO);
/* 439 */                               if (lI000o00OoI0I != null) {
/* 441 */                                   long jLongValue = lI000o00OoI0I.longValue();
/* 464 */                                   i2 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                                        } else {
/* 466 */                                   i2 = -1;
                                        }
/* 467 */                               this.I000iOII = i2;
                                    }
                                }
/* 469 */                       i4++;
/* 471 */                       i3 = i;
                            }
/* 169 */                   i = 0;
/* 469 */                   i4++;
/* 471 */                   i3 = i;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IIi1OiooiI I00000oIO() {
                    IIi1IIlllIi iIi1IIlllIi;
                    long jMax;
                    String string;
                    long time;
                    long j;
                    long millis;
                    int i;
/* 3 */             I0Oi111ii i0Oi111ii = this.I00000oIO;
/* 7 */             Io1Io0OOi011 io1Io0OOi011 = (Io1Io0OOi011) i0Oi111ii.I00iio;
/* 11 */            IoOi01OlIl1o ioOi01OlIl1o = (IoOi01OlIl1o) i0Oi111ii.I00iiI;
/* 14 */            IIi1IIlllIi iIi1IIlllIi2 = this.I00000oOI;
/* 16 */            if (iIi1IIlllIi2 == null) {
/* 20 */                return new IIi1OiooiI(i0Oi111ii, null);
                    }
/* 24 */            O0ioIllo0i1 o0ioIllo0i1 = iIi1IIlllIi2.I00000oIO;
/* 28 */            if (ioOi01OlIl1o.I000OOo1O && !iIi1IIlllIi2.I0000oI00) {
/* 36 */                return new IIi1OiooiI(i0Oi111ii, null);
                    }
/* 44 */            IIi100 iIi100 = (IIi100) o0ioIllo0i1.getValue();
/* 52 */            if (i0Oi111ii.I000oI1ioi().I00000oOI || ((IIi100) o0ioIllo0i1.getValue()).I00000oOI || O0000Ioio00.I0000O(iIi1IIlllIi2.I0001Ioi1lo.I00000oOI("Vary"), "*")) {
/* 387 */               return new IIi1OiooiI(i0Oi111ii, null);
                    }
/* 80 */            IIi100 iIi100I000oI1ioi = i0Oi111ii.I000oI1ioi();
/* 86 */            if (!iIi100I000oI1ioi.I00000oIO) {
/* 88 */                String str = "If-Modified-Since";
/* 94 */                if (io1Io0OOi011.I00000oOI("If-Modified-Since") == null && io1Io0OOi011.I00000oOI("If-None-Match") == null) {
/* 106 */                   long time2 = this.I000OOo1O;
/* 108 */                   Date date = this.I0000Il00O;
/* 112 */                   if (date != null) {
/* 118 */                       iIi1IIlllIi = iIi1IIlllIi2;
/* 122 */                       jMax = Math.max(0L, time2 - date.getTime());
                            } else {
/* 127 */                       iIi1IIlllIi = iIi1IIlllIi2;
/* 129 */                       jMax = 0;
                            }
/* 130 */                   TimeUnit timeUnit = TimeUnit.SECONDS;
/* 135 */                   int i2 = this.I000iOII;
/* 137 */                   if (i2 != -1) {
/* 144 */                       jMax = Math.max(jMax, timeUnit.toMillis(i2));
                            }
/* 148 */                   long time3 = this.I000O01llI0;
/* 168 */                   long jLongValue = jMax + (time2 - time3) + (((Number) Oo110iIlO.I00000oIO.invoke()).longValue() - time2);
/* 176 */                   int i3 = ((IIi100) o0ioIllo0i1.getValue()).I0000Il00O;
/* 180 */                   Date date2 = this.I0000oI00;
/* 185 */                   if (i3 != -1) {
/* 188 */                       time = timeUnit.toMillis(i3);
                            } else {
/* 193 */                       Date date3 = this.I000II;
/* 195 */                       if (date3 != null) {
/* 197 */                           if (date != null) {
/* 199 */                               time2 = date.getTime();
                                    }
/* 207 */                           time = date3.getTime() - time2;
/* 210 */                           if (time <= 0) {
/* 213 */                               time = 0;
                                    }
                                } else if (date2 != null) {
/* 218 */                           ArrayList arrayList = ioOi01OlIl1o.I0001Ioi1lo;
/* 220 */                           if (arrayList == null) {
/* 222 */                               string = null;
                                    } else {
/* 226 */                               StringBuilder sb = new StringBuilder();
/* 229 */                               iOl0lOIi11.I0010I0i(sb, arrayList);
/* 232 */                               string = sb.toString();
                                    }
/* 236 */                           if (string == null) {
/* 238 */                               if (date != null) {
/* 240 */                                   time3 = date.getTime();
                                        }
/* 248 */                               long time4 = time3 - date2.getTime();
/* 251 */                               if (time4 > 0) {
/* 255 */                                   time = time4 / 10;
                                        }
                                    }
                                }
                            }
/* 257 */                   int i4 = iIi100I000oI1ioi.I0000Il00O;
/* 260 */                   if (i4 != -1) {
/* 267 */                       time = Math.min(time, timeUnit.toMillis(i4));
                            }
/* 271 */                   int i5 = iIi100I000oI1ioi.I000OOo1O;
/* 281 */                   long millis2 = i5 != -1 ? timeUnit.toMillis(i5) : 0L;
/* 285 */                   if (iIi100.I000II || (i = iIi100I000oI1ioi.I000O01llI0) == -1) {
/* 299 */                       j = time;
/* 301 */                       millis = 0;
                            } else {
/* 291 */                       j = time;
/* 294 */                       millis = timeUnit.toMillis(i);
                            }
/* 305 */                   if (!iIi100.I00000oIO && jLongValue + millis2 < j + millis) {
/* 319 */                       return new IIi1OiooiI(null, iIi1IIlllIi);
                            }
/* 323 */                   IIi1IIlllIi iIi1IIlllIi3 = iIi1IIlllIi;
/* 325 */                   String str2 = this.I000OiO;
/* 327 */                   if (str2 != null) {
/* 96 */                        str = "If-None-Match";
                            } else if (date2 != null) {
/* 333 */                       str2 = this.I0001Ioi1lo;
                            } else {
/* 336 */                       if (date == null) {
/* 373 */                           return new IIi1OiooiI(i0Oi111ii, null);
                                }
/* 338 */                       str2 = this.I0000O;
                            }
/* 340 */                   I1ii1o0 i1ii1o0I00IlilI0i0i = i0Oi111ii.I00IlilI0i0i();
/* 346 */                   Io1IlO1I1i io1IlO1I1i = (Io1IlO1I1i) i1ii1o0I00IlilI0i0i.I00iio;
/* 348 */                   io1IlO1I1i.getClass();
/* 351 */                   illliIoo1l0O.I00000oIO(str);
/* 354 */                   illliIoo1l0O.I00000oOI(str2, str);
/* 357 */                   io1IlO1I1i.I00000oIO(str, str2);
/* 366 */                   return new IIi1OiooiI(i1ii1o0I00IlilI0i0i.I00100o1O0lo(), iIi1IIlllIi3);
                        }
                    }
/* 380 */           return new IIi1OiooiI(i0Oi111ii, null);
                }
            }
