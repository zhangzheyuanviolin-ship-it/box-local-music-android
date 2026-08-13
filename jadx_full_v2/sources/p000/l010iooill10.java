            package p000;

            import android.app.Application;
            import android.content.SharedPreferences;
            import android.content.pm.ApplicationInfo;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.util.Map;
            
/* 18 */    public final class l010iooill10 implements Runnable {
                public final int I00iOIl = 0;
                public int I00iiI;
                public String I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;

                public l010iooill10(String str, l01lllOO0 l01llloo0, int i, IOException iOException, byte[] bArr, Map map) {
/* 7 */             this.I00iio = l01llloo0;
/* 9 */             this.I00iiI = i;
/* 11 */            this.I00ilI0I1 = iOException;
/* 13 */            this.I00ilO0 = bArr;
/* 15 */            this.I00iiO = str;
/* 17 */            this.I00io1l = map;
                }

                @Override
                public final void run() {
                    switch (this.I00iOIl) {
                        case 0:
/* 36 */                    l01O0IO1ooO0 l01o0io1ooo0 = (l01O0IO1ooO0) this.I00io1l;
/* 42 */                    l0Oi0o l0oi0o = ((l0olllO1i) l01o0io1ooo0.I00iOIl).I00ilI0I1;
/* 44 */                    l0olllO1i.I0000oI00(l0oi0o);
/* 49 */                    if (!l0oi0o.I00iiI) {
/* 407 */                       Log.println(6, l01o0io1ooo0.I010l1O(), "Persisted config not initialized. Not logging error/warn");
/* 410 */                       return;
                            }
/* 55 */                    if (l01o0io1ooo0.I00iiO == 0) {
/* 61 */                        iIl1iil iil1iil = ((l0olllO1i) l01o0io1ooo0.I00iOIl).I00iio;
/* 65 */                        if (iil1iil.I00ilI0I1 == null) {
                                    synchronized (iil1iil) {
                                        try {
/* 70 */                                    if (iil1iil.I00ilI0I1 == null) {
/* 74 */                                        l0olllO1i l0olllo1i = (l0olllO1i) iil1iil.I00iOIl;
/* 78 */                                        ApplicationInfo applicationInfo = l0olllo1i.I00iOIl.getApplicationInfo();
/* 82 */                                        String processName = lIIiIil0.I00000oIO;
/* 84 */                                        if (processName == null) {
/* 86 */                                            processName = Application.getProcessName();
/* 90 */                                            lIIiIil0.I00000oIO = processName;
                                                }
/* 92 */                                        if (applicationInfo != null) {
/* 94 */                                            String str = applicationInfo.processName;
/* 115 */                                           iil1iil.I00ilI0I1 = Boolean.valueOf(str != null && str.equals(processName));
                                                }
/* 119 */                                       if (iil1iil.I00ilI0I1 == null) {
/* 123 */                                           iil1iil.I00ilI0I1 = Boolean.TRUE;
/* 125 */                                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 127 */                                           l0olllO1i.I000II(l01o0io1ooo02);
/* 134 */                                           l01o0io1ooo02.I00ilO0.I00000oOI("My process not in the list of running processes");
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
/* 147 */                       if (iil1iil.I00ilI0I1.booleanValue()) {
/* 151 */                           l01o0io1ooo0.I00iiO = 'C';
                                } else {
/* 156 */                           l01o0io1ooo0.I00iiO = 'c';
                                }
                            }
/* 158 */                   long j = l01o0io1ooo0.I00iio;
/* 164 */                   if (j < 0) {
/* 172 */                       ((l0olllO1i) l01o0io1ooo0.I00iOIl).I00iio.I010l1O();
/* 175 */                       j = 161000;
/* 178 */                       l01o0io1ooo0.I00iio = 161000L;
                            }
/* 180 */                   int i = this.I00iiI;
/* 182 */                   char c = l01o0io1ooo0.I00iiO;
/* 184 */                   String str2 = this.I00iiO;
/* 186 */                   Object obj = this.I00iio;
/* 188 */                   Object obj2 = this.I00ilI0I1;
/* 190 */                   Object obj3 = this.I00ilO0;
/* 194 */                   char cCharAt = "01VDIWEA?".charAt(i);
/* 198 */                   String strI010l1ol111 = l01O0IO1ooO0.I010l1ol111(true, str2, obj, obj2, obj3);
/* 238 */                   StringBuilder sb = new StringBuilder(IIlIOloOOO.I0000Il00O(String.valueOf(cCharAt).length() + 1, String.valueOf(c).length(), String.valueOf(j).length(), 1) + strI010l1ol111.length());
/* 243 */                   sb.append("2");
/* 246 */                   sb.append(cCharAt);
/* 249 */                   sb.append(c);
/* 252 */                   sb.append(j);
/* 257 */                   sb.append(":");
/* 260 */                   sb.append(strI010l1ol111);
/* 263 */                   String string = sb.toString();
/* 273 */                   if (string.length() > 1024) {
/* 275 */                       string = str2.substring(0, Barcode.FORMAT_UPC_E);
                            }
/* 279 */                   I0Oo1I101o i0Oo1I101o = l0oi0o.I00ilI0I1;
/* 281 */                   if (i0Oo1I101o != null) {
/* 285 */                       String str3 = (String) i0Oo1I101o.I0000O;
/* 289 */                       l0Oi0o l0oi0o2 = (l0Oi0o) i0Oo1I101o.I0000oI00;
/* 291 */                       l0oi0o2.I010II();
/* 312 */                       if (((l0Oi0o) i0Oo1I101o.I0000oI00).I010ioo().getLong((String) i0Oo1I101o.I00000oOI, 0L) == 0) {
/* 314 */                           i0Oo1I101o.I00000oOI();
                                }
/* 317 */                       SharedPreferences sharedPreferencesI010ioo = l0oi0o2.I010ioo();
/* 323 */                       String str4 = (String) i0Oo1I101o.I0000Il00O;
/* 325 */                       long j2 = sharedPreferencesI010ioo.getLong(str4, 0L);
/* 333 */                       if (j2 <= 0) {
/* 339 */                           SharedPreferences.Editor editorEdit = l0oi0o2.I010ioo().edit();
/* 343 */                           editorEdit.putString(str3, string);
/* 346 */                           editorEdit.putLong(str4, 1L);
/* 349 */                           editorEdit.apply();
/* 410 */                           return;
                                }
/* 357 */                       lioil0ilIOi lioil0ilioi = ((l0olllO1i) l0oi0o2.I00iOIl).I00l0I0l0lO1;
/* 359 */                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 375 */                       long jNextLong = lioil0ilioi.I01OO1I().nextLong() & Long.MAX_VALUE;
/* 376 */                       long j3 = j2 + 1;
/* 377 */                       long j4 = Long.MAX_VALUE / j3;
/* 382 */                       SharedPreferences.Editor editorEdit2 = l0oi0o2.I010ioo().edit();
/* 388 */                       if (jNextLong < j4) {
/* 390 */                           editorEdit2.putString(str3, string);
                                }
/* 393 */                       editorEdit2.putLong(str4, j3);
/* 396 */                       editorEdit2.apply();
/* 410 */                       return;
                            }
/* 410 */                   return;
                        default:
/* 30 */                    ((l01lllOO0) this.I00iio).I00000oOI(this.I00iiO, this.I00iiI, (Throwable) this.I00ilI0I1, (byte[]) this.I00ilO0, (Map) this.I00io1l);
/* 33 */                    return;
                    }
                }

/* 19 */        public l010iooill10() {
                }
            }
