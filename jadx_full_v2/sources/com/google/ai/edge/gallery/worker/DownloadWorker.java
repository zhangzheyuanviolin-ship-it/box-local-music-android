            package com.google.ai.edge.gallery.worker;

            import android.R;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.util.Log;
            import androidx.work.CoroutineWorker;
            import androidx.work.WorkerParameters;
            import androidx.work.impl.foreground.SystemForegroundService;
            import com.box.gallery.MainActivity;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.RandomAccessFile;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.Arrays;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.UUID;
            import java.util.concurrent.CancellationException;
            import kotlin.Metadata;
            import p000.I000II;
            import p000.IIlIOloOOO;
            import p000.IOOlIIilOl0;
            import p000.IOoilo;
            import p000.Ii0111o;
            import p000.Ii11I1OOII1;
            import p000.Ii1oo1ooill0;
            import p000.IiI0oillOO10;
            import p000.IiiIil1lOIO;
            import p000.Iil0i1iiI;
            import p000.Iil0lOolioi;
            import p000.Iil0liIioi;
            import p000.Iil0ll0OI;
            import p000.IioIoO10iOiI;
            import p000.Il01100l;
            import p000.IlIi0I0;
            import p000.IliliOOliOi;
            import p000.O0000Ioio00;
            import p000.O10o0OiIIll;
            import p000.OIO0oiOO;
            import p000.OIOl1lo100ll;
            import p000.OIOlIOlO1;
            import p000.OOo0ll111;
            import p000.Oi010OO0;
            import p000.OlOoOIi0o;
            import p000.OlOolloIIOl0;
            import p000.OllOO1l1;
            import p000.OoiIlOl1iI;
            import p000.Ool0olii10Ii;
            import p000.i01IlOO;
            import p000.iOi100;
            import p000.iOi1II01i0;
            import p000.ii1OOii;
            import p000.il01ool0o;
            import p000.l10oIiO1Il;
            import p000.lIoii1l01l0i;
            
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/ai/edge/gallery/worker/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public final class DownloadWorker extends CoroutineWorker {
                public final File I0000Il00O;
                public final int I0000O;

                public DownloadWorker(Context context, WorkerParameters workerParameters) {
/* 1 */             super(context, workerParameters);
/* 9 */             this.I0000Il00O = context.getExternalFilesDir(null);
/* 17 */            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
/* 25 */            this.I0000O = workerParameters.I00000oIO.hashCode();
/* 29 */            if (Iil0ll0OI.I00000oIO) {
/* 106 */               return;
                    }
/* 38 */            NotificationChannel notificationChannel = new NotificationChannel("model_download_channel_foreground", "Model Downloading", 2);
/* 43 */            notificationChannel.setDescription("Notifications for model downloading");
/* 46 */            notificationManager.createNotificationChannel(notificationChannel);
/* 50 */            Iil0ll0OI.I00000oIO = true;
                }

                public static IliliOOliOi I0000O(DownloadWorker downloadWorker, String str, int i) {
/* 3 */             if ((i & 2) != 0) {
/* 5 */                 str = null;
                    }
/* 13 */            return downloadWorker.I0000Il00O(0L, 0L, 0, str);
                }

                /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static HttpURLConnection I0000oI00(URL url, String str, long j) throws IOException {
/* 2 */             URL url2 = url;
/* 3 */             int i = 0;
/* 16 */            while (OlOolloIIOl0.I000O01llI0(url2.getProtocol(), "https", true)) {
/* 22 */                HttpURLConnection httpURLConnection = (HttpURLConnection) url2.openConnection();
/* 24 */                httpURLConnection.setInstanceFollowRedirects(false);
/* 29 */                httpURLConnection.setConnectTimeout(30000);
/* 35 */                httpURLConnection.setReadTimeout(60000);
/* 38 */                if (str != null && O0000Ioio00.I0000O(url2.getHost(), url.getHost())) {
/* 62 */                    httpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(str));
                        }
/* 69 */                if (j > 0) {
/* 81 */                    httpURLConnection.setRequestProperty("Range", IlIi0I0.I000l1(j, "bytes=", "-"));
/* 88 */                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        }
/* 91 */                httpURLConnection.connect();
/* 94 */                int responseCode = httpURLConnection.getResponseCode();
/* 100 */               if (responseCode != 307 && responseCode != 308) {
                            switch (responseCode) {
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
/* 109 */                           return httpURLConnection;
                            }
/* 16 */                    while (OlOolloIIOl0.I000O01llI0(url2.getProtocol(), "https", true)) {
                            }
                        }
/* 112 */               String headerField = httpURLConnection.getHeaderField("Location");
/* 116 */               if (headerField == null) {
/* 148 */                   IioIoO10iOiI.I000OOo1O(IIlIOloOOO.I00100l0("Redirect (HTTP ", responseCode, ") without Location header"));
/* 15 */                    return null;
                        }
/* 118 */               httpURLConnection.disconnect();
/* 123 */               URL url3 = new URL(url2, headerField);
/* 126 */               i++;
/* 129 */               if (i > 10) {
/* 136 */                   IOOlIIilOl0.I000l1("Too many redirects for ", url);
/* 15 */                    return null;
                        }
/* 131 */               url2 = url3;
                    }
/* 154 */           IOOlIIilOl0.I000l1("Refusing non-https download URL: ", url2);
/* 15 */            return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) throws Throwable {
                    Iil0i1iiI iil0i1iiI;
                    DownloadWorker downloadWorker;
/* 5 */             if (iOoilo instanceof Iil0i1iiI) {
/* 8 */                 iil0i1iiI = (Iil0i1iiI) iOoilo;
/* 10 */                int i = iil0i1iiI.I00iiO;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    iil0i1iiI.I00iiO = i - Integer.MIN_VALUE;
/* 21 */                    downloadWorker = this;
                        } else {
/* 26 */                    downloadWorker = this;
/* 28 */                    iil0i1iiI = new Iil0i1iiI(downloadWorker, iOoilo);
                        }
                    }
/* 31 */            Object objI0000oI00 = iil0i1iiI.I00iOIl;
/* 33 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 35 */            int i2 = iil0i1iiI.I00iiO;
/* 38 */            if (i2 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
                        try {
/* 69 */                    if (((Boolean) OIOlIOlO1.I00000oIO.getValue()).booleanValue()) {
/* 256 */                       throw new OIOl1lo100ll("Network request blocked: Box is in offline-only mode");
                            }
/* 77 */                    String strI0000Il00O = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_URL");
/* 87 */                    String strI0000Il00O2 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_NAME");
/* 91 */                    if (strI0000Il00O2 == null) {
/* 93 */                        strI0000Il00O2 = "Model";
                            }
/* 95 */                    String str = strI0000Il00O2;
/* 102 */                   String strI0000Il00O3 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_COMMIT_HASH");
/* 112 */                   String strI0000Il00O4 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_DOWNLOAD_FILE_NAME");
/* 122 */                   String strI0000Il00O5 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_DOWNLOAD_MODEL_DIR");
/* 132 */                   boolean zI00000oIO = downloadWorker.getInputData().I00000oIO("KEY_MODEL_IS_ZIP");
/* 142 */                   String strI0000Il00O6 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_UNZIPPED_DIR");
/* 152 */                   String strI0000Il00O7 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_EXTRA_DATA_URLS");
/* 157 */                   List listI00IoIO0lI = Il01100l.I00iOIl;
/* 172 */                   List listI00IoIO0lI2 = strI0000Il00O7 != null ? OlOoOIi0o.I00IoIO0lI(strI0000Il00O7, new String[]{","}, 6) : listI00IoIO0lI;
/* 179 */                   String strI0000Il00O8 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_EXTRA_DATA_DOWNLOAD_FILE_NAMES");
/* 183 */                   if (strI0000Il00O8 != null) {
/* 189 */                       listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI(strI0000Il00O8, new String[]{","}, 6);
                            }
/* 193 */                   List list = listI00IoIO0lI;
/* 202 */                   long jI00000oOI = downloadWorker.getInputData().I00000oOI("KEY_MODEL_TOTAL_BYTES", 0L);
/* 212 */                   String strI0000Il00O9 = downloadWorker.getInputData().I0000Il00O("KEY_MODEL_DOWNLOAD_ACCESS_TOKEN");
/* 216 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 218 */                   Ii1oo1ooill0 ii1oo1ooill0 = Ii1oo1ooill0.I00iiI;
/* 232 */                   Iil0lOolioi iil0lOolioi = new Iil0lOolioi(strI0000Il00O, strI0000Il00O4, downloadWorker, str, listI00IoIO0lI2, list, strI0000Il00O5, strI0000Il00O3, jI00000oOI, strI0000Il00O9, zI00000oIO, strI0000Il00O6, null);
/* 235 */                   iil0i1iiI.I00iiO = 1;
/* 239 */                   objI0000oI00 = iOi1II01i0.I0000oI00(ii1oo1ooill0, iil0lOolioi, iil0i1iiI);
/* 245 */                   if (objI0000oI00 == ii0111o) {
/* 243 */                       return ii0111o;
                            }
                        } catch (OIOl1lo100ll e) {
/* 260 */                   LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 269 */                   linkedHashMap.put("KEY_MODEL_DOWNLOAD_ERROR_MESSAGE", e.getMessage());
/* 274 */                   Ii11I1OOII1 ii11I1OOII1 = new Ii11I1OOII1(linkedHashMap);
/* 277 */                   il01ool0o.I0000Il00O(ii11I1OOII1);
/* 282 */                   return new O10o0OiIIll(ii11I1OOII1);
                        }
                    } else {
/* 40 */                if (i2 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                    return null;
                        }
/* 42 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
                    }
/* 248 */           return objI0000oI00;
                }

                @Override
                public final Object I00000oOI() {
/* 4 */             return I0000O(this, null, 14);
                }

                public final IliliOOliOi I0000Il00O(long j, long j2, int i, String str) {
/* 12 */            String strI000lI = str != null ? IlIi0I0.I000lI("Downloading \"", str, "\"") : "Downloading model";
/* 33 */            StringBuilder sb = new StringBuilder(i + "%");
/* 41 */            if (j > 0) {
/* 66 */                sb.append(String.format(" · %.1f MB/s", Arrays.copyOf(new Object[]{Float.valueOf(j / 1000000.0f)}, 1)));
                    }
/* 74 */            if (j2 > 60000) {
/* 96 */                sb.append(" · ~" + (j2 / 60000) + " min left");
                    } else if (1 <= j2 && j2 < 60001) {
/* 115 */               sb.append(" · under a minute left");
                    }
/* 118 */           String string = sb.toString();
/* 124 */           Context applicationContext = getApplicationContext();
/* 128 */           int i2 = MainActivity.I010101Oo1lO;
/* 132 */           Intent intent = new Intent(applicationContext, (Class<?>) MainActivity.class);
/* 137 */           intent.setFlags(536870912);
/* 147 */           PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, intent, 201326592);
/* 155 */           i01IlOO i01ilooI00000oOI = i01IlOO.I00000oOI(getApplicationContext());
/* 159 */           UUID id = getId();
/* 163 */           Context context = i01ilooI00000oOI.I00000oIO;
/* 165 */           String string2 = id.toString();
/* 169 */           String str2 = OllOO1l1.I00l0OO0IO;
/* 175 */           Intent intent2 = new Intent(context, (Class<?>) SystemForegroundService.class);
/* 180 */           intent2.setAction("ACTION_CANCEL_WORK");
/* 201 */           intent2.setData(Uri.parse("workspec://" + string2));
/* 206 */           intent2.putExtra("KEY_WORKSPEC_ID", string2);
/* 211 */           PendingIntent service = PendingIntent.getService(context, 0, intent2, 167772160);
/* 223 */           OIO0oiOO oIO0oiOO = new OIO0oiOO(getApplicationContext(), "model_download_channel_foreground");
/* 230 */           oIO0oiOO.I0000oI00 = OIO0oiOO.I0000Il00O(strI000lI);
/* 236 */           oIO0oiOO.I0001Ioi1lo = OIO0oiOO.I0000Il00O(string);
/* 243 */           oIO0oiOO.I001IIilI0O.icon = R.drawable.stat_sys_download;
/* 246 */           oIO0oiOO.I0000O(2, true);
/* 251 */           oIO0oiOO.I000lI = 100;
/* 253 */           oIO0oiOO.I000o00OoI0I = i;
/* 255 */           oIO0oiOO.I000II = activity;
/* 262 */           oIO0oiOO.I00000oIO(R.drawable.ic_media_pause, service, "Pause");
/* 273 */           return new IliliOOliOi(this.I0000O, oIO0oiOO.I00000oOI(), 1);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(35:216|24|25|98|(4:100|182|101|102)(1:107)|108|202|109|110|212|111|112|226|113|230|114|115|192|116|117|198|118|119|184|120|121|208|122|123|220|124|125|(1:128)|127|(1:236)(5:131|132|157|235|(4:186|62|(0)(0)|161))) */
                /* JADX WARN: Can't wrap try/catch for region: R(36:23|216|24|25|98|(4:100|182|101|102)(1:107)|108|202|109|110|212|111|112|226|113|230|114|115|192|116|117|198|118|119|184|120|121|208|122|123|220|124|125|(1:128)|127|(1:236)(5:131|132|157|235|(4:186|62|(0)(0)|161))) */
                /* JADX WARN: Code restructure failed: missing block: B:130:0x0476, code lost:
                
                    return r26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:133:0x0492, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:135:0x0494, code lost:
                
                    r21 = r44;
                    r29 = r25;
                    r25 = r6;
                    r7 = r9;
                    r9 = r18;
                    r6 = r42;
                    r17 = r4;
                    r4 = r36;
                    r36 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:136:0x04a6, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:137:0x04a7, code lost:
                
                    r3 = r35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:138:0x04a9, code lost:
                
                    r8 = r26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:139:0x04ac, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:140:0x04ad, code lost:
                
                    r3 = r35;
                    r23 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:141:0x04b1, code lost:
                
                    r1 = r21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:142:0x04b4, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x04b5, code lost:
                
                    r3 = r35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:144:0x04b8, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:145:0x04b9, code lost:
                
                    r9 = r1;
                    r44 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:146:0x04bc, code lost:
                
                    r1 = r21;
                    r8 = r26;
                    r3 = r35;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:147:0x04c3, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:148:0x04c4, code lost:
                
                    r9 = r1;
                    r36 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:149:0x04c8, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:150:0x04c9, code lost:
                
                    r9 = r1;
                    r36 = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:151:0x04cd, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:152:0x04ce, code lost:
                
                    r36 = r2;
                    r42 = r9;
                    r8 = r26;
                    r3 = r35;
                    r9 = r1;
                    r1 = r21;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:153:0x04da, code lost:
                
                    r0 = e;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:154:0x04db, code lost:
                
                    r3 = r35;
                    r36 = r2;
                    r9 = r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x02d1, code lost:
                
                    r6 = 0.0f;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:73:0x02d6, code lost:
                
                    if (r40 == 0) goto L84;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:75:0x02dd, code lost:
                
                    if (r7.size() != 5) goto L79;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:76:0x02df, code lost:
                
                    r7.remove(0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x02e8, code lost:
                
                    r7.add(new java.lang.Long(r4));
                 */
                /* JADX WARN: Code restructure failed: missing block: B:80:0x02f4, code lost:
                
                    if (r9.size() != 5) goto L82;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:81:0x02f6, code lost:
                
                    r9.remove(0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x02fc, code lost:
                
                    r9.add(new java.lang.Long(r1));
                    r2 = p000.IOOi0Ool1i.I00OloOo(r7) / p000.IOOi0Ool1i.I00OloOo(r9);
                    r4 = 0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:84:0x0319, code lost:
                
                    r2 = 0.0f;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x031d, code lost:
                
                    if (r2 <= 0.0f) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:88:0x0323, code lost:
                
                    if (r38 <= 0) goto L90;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x0325, code lost:
                
                    r27 = r4;
                    r6 = (r38 - r36) / r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x032d, code lost:
                
                    r27 = r4;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:91:0x032f, code lost:
                
                    r1 = new java.util.LinkedHashMap();
                    r1.put("KEY_MODEL_DOWNLOAD_RECEIVED_BYTES", java.lang.Long.valueOf(r36));
                    r1.put("KEY_MODEL_DOWNLOAD_RATE", java.lang.Long.valueOf((long) (r2 * r46)));
                    r1.put("KEY_MODEL_DOWNLOAD_REMAINING_SECONDS", java.lang.Long.valueOf((long) r6));
                    r3 = new p000.Ii11I1OOII1(r1);
                    p000.il01ool0o.I0000Il00O(r3);
                    r8.I00iOIl = r0;
                    r8.I00iiI = r7;
                    r8.I00iiO = r9;
                    r8.I00iio = r15;
                    r8.I00ilI0I1 = r12;
                    r8.I00ilO0 = r14;
                    r8.I00io1l = r13;
                    r8.I00ioIO = r10;
                    r4 = r24;
                    r8.I00l0I0l0lO1 = r4;
                    r11 = r0;
                    r0 = r38;
                    r8.I00l0OO0IO = r0;
                    r8.I00li1OI = r36;
                    r0 = r22;
                    r8.I00ll1 = r0;
                    r0 = r21;
                    r8.I00o0l1o1o0 = r0 ? 1 : 0;
                    r8.I00lli11 = r40;
                    r0 = r27;
                    r8.I00lll10 = r0;
                    r8.I00o0iI0io1 = r1;
                    r8.I00o101lO = r2;
                    r8.I00oI0i = r6;
                    r8.I00oO101o = 1;
                    r0 = p000.l10oIiO1Il.I00000oIO(setProgressAsync(r3), r8);
                    r3 = p000.Ii0111o.I00iOIl;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:92:0x03b3, code lost:
                
                    if (r0 != r3) goto L94;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:94:0x03b8, code lost:
                
                    r0 = r19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:95:0x03bb, code lost:
                
                    if (r0 != r26) goto L97;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:97:0x03c0, code lost:
                
                    r29 = r40;
                    r26 = r26;
                    r17 = r3;
                    r0 = r6;
                    r18 = r9;
                    r1 = r0 ? 1 : 0;
                    r43 = r2;
                    r42 = r11;
                    r2 = r0;
                    r25 = r7;
                    r11 = r8;
                    r8 = r0;
                    r23 = r0;
                    r27 = 0;
                    r6 = r36;
                    r21 = r1;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:204:0x0534 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x029e A[Catch: all -> 0x02e4, TRY_LEAVE, TryCatch #2 {all -> 0x02e4, blocks: (B:62:0x0293, B:64:0x029e, B:70:0x02ae, B:74:0x02d8, B:76:0x02df, B:79:0x02e8, B:81:0x02f6, B:83:0x02fc, B:89:0x0325, B:91:0x032f, B:101:0x03ea, B:109:0x0418, B:111:0x041e, B:113:0x0422, B:114:0x042e, B:116:0x0442, B:118:0x044b, B:120:0x044f, B:122:0x0455, B:124:0x0462, B:155:0x04e2), top: B:186:0x0293 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
                /* JADX WARN: Type inference failed for: r1v27 */
                /* JADX WARN: Type inference failed for: r1v41 */
                /* JADX WARN: Type inference failed for: r1v5, types: [int] */
                /* JADX WARN: Type inference failed for: r7v19, types: [int] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0477 -> B:132:0x0484). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x04f8 -> B:157:0x0506). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(Ool0olii10Ii ool0olii10Ii, File file, long j, long j2, String str, String str2, List list, List list2, IOoilo iOoilo) throws Throwable {
                    Iil0liIioi iil0liIioi;
                    float f;
                    long j3;
                    boolean z;
                    InputStream inputStream;
                    HttpURLConnection httpURLConnection;
                    FileOutputStream fileOutputStream;
                    boolean z2;
                    OoiIlOl1iI ooiIlOl1iI;
                    long j4;
                    String str3;
                    long j5;
                    OOo0ll111 oOo0ll111;
                    long j6;
                    String str4;
                    List list3;
                    byte[] bArr;
                    Iil0liIioi iil0liIioi2;
                    FileOutputStream fileOutputStream2;
                    long j7;
                    long j8;
                    long j9;
                    List list4;
                    HttpURLConnection httpURLConnection2;
                    CancellationException e;
                    long j10;
                    List list5;
                    long j11;
                    long j12;
                    long j13;
                    long j14;
                    Iil0liIioi iil0liIioi3;
                    Ii0111o ii0111o;
                    boolean z3;
                    String str5;
                    long j15;
                    DownloadWorker downloadWorker;
                    Exception e2;
                    String str6;
                    List list6;
                    long j16;
                    long j17;
                    long j18;
                    boolean z4;
                    long j19;
                    long j20;
                    int i;
                    boolean z5;
                    long j21;
                    long j22;
                    List list7;
                    long j23;
                    int i2;
                    long j24;
                    long j25;
                    long j26;
/* 1 */             DownloadWorker downloadWorker2 = this;
/* 13 */            if (iOoilo instanceof Iil0liIioi) {
/* 16 */                iil0liIioi = (Iil0liIioi) iOoilo;
/* 18 */                int i3 = iil0liIioi.I00oO101o;
/* 24 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 27 */                    iil0liIioi.I00oO101o = i3 - Integer.MIN_VALUE;
                        } else {
/* 32 */                    iil0liIioi = new Iil0liIioi(downloadWorker2, iOoilo);
                        }
                    }
/* 35 */            Object obj = iil0liIioi.I00oII;
/* 37 */            Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 39 */            int i4 = iil0liIioi.I00oO101o;
/* 41 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 49 */            if (i4 == 0) {
/* 336 */               f = 1000.0f;
/* 340 */               lIoii1l01l0i.I00000oOI(obj);
/* 343 */               long length = file.length();
/* 349 */               if (length > 0) {
/* 351 */                   file.getName();
                        }
/* 361 */               HttpURLConnection httpURLConnectionI0000oI00 = I0000oI00(new URL(ool0olii10Ii.I00000oIO), str2, length);
/* 365 */               httpURLConnectionI0000oI00.getResponseCode();
/* 374 */               if (httpURLConnectionI0000oI00.getResponseCode() == 416) {
/* 407 */                   Log.w("AGDownloadWorker", "416 resuming '" + file.getName() + "' at " + length + " bytes — restarting file");
/* 410 */                   httpURLConnectionI0000oI00.disconnect();
/* 413 */                   file.delete();
/* 425 */                   HttpURLConnection httpURLConnectionI0000oI002 = I0000oI00(new URL(ool0olii10Ii.I00000oIO), str2, 0L);
/* 429 */                   httpURLConnectionI0000oI002.getResponseCode();
/* 432 */                   httpURLConnectionI0000oI00 = httpURLConnectionI0000oI002;
/* 433 */                   length = 0;
                        }
/* 441 */               if (httpURLConnectionI0000oI00.getResponseCode() != 200 && httpURLConnectionI0000oI00.getResponseCode() != 206) {
/* 452 */                   int responseCode = httpURLConnectionI0000oI00.getResponseCode();
/* 456 */                   httpURLConnectionI0000oI00.disconnect();
/* 465 */                   IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(responseCode, "HTTP error code: "));
/* 47 */                    return null;
                        }
/* 471 */               String headerField = httpURLConnectionI0000oI00.getHeaderField("Content-Range");
/* 475 */               if (headerField != null) {
/* 507 */                   List listI00IoIO0lI = OlOoOIi0o.I00IoIO0lI((CharSequence) OlOoOIi0o.I00IoIO0lI(OlOoOIi0o.I00Iooi00oi(headerField, "bytes ", headerField), new String[]{"/"}, 6).get(0), new String[]{"-"}, 6);
/* 517 */                   long j27 = Long.parseLong((String) listI00IoIO0lI.get(0));
/* 528 */                   Long.parseLong((String) listI00IoIO0lI.get(1));
/* 537 */                   if (file.length() != j27) {
/* 543 */                       RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                try {
/* 546 */                           randomAccessFile.setLength(j27);
/* 549 */                           randomAccessFile.close();
                                } catch (Throwable th) {
                                    try {
/* 555 */                               throw th;
                                    } catch (Throwable th2) {
/* 557 */                               ii1OOii.I00000oIO(randomAccessFile, th);
/* 560 */                               throw th2;
                                    }
                                }
                            }
/* 561 */                   j3 = j + j27;
/* 563 */                   z = true;
                        } else {
/* 569 */                   if (length > 0) {
/* 594 */                       Log.w("AGDownloadWorker", "Server ignored Range request for '" + file.getName() + "'. Restarting file.");
/* 597 */                       file.delete();
                            }
/* 606 */                   iOi100.I00000oIO(Log.d("AGDownloadWorker", "Download starts from beginning."));
/* 609 */                   j3 = j;
/* 611 */                   z = false;
                        }
/* 612 */               InputStream inputStream2 = httpURLConnectionI0000oI00.getInputStream();
/* 618 */               FileOutputStream fileOutputStream3 = new FileOutputStream(file, z);
                        try {
/* 623 */                   byte[] bArr2 = new byte[8192];
/* 630 */                   z2 = z;
/* 632 */                   httpURLConnection = httpURLConnectionI0000oI00;
/* 633 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 635 */                   j4 = length;
/* 44 */                    str3 = "AGDownloadWorker";
/* 639 */                   j5 = j3;
/* 627 */                   oOo0ll111 = new OOo0ll111();
/* 642 */                   j6 = 0;
/* 644 */                   str4 = str;
/* 646 */                   list3 = list2;
/* 648 */                   bArr = bArr2;
/* 649 */                   inputStream = inputStream2;
/* 650 */                   iil0liIioi2 = iil0liIioi;
/* 651 */                   fileOutputStream2 = fileOutputStream3;
/* 652 */                   j7 = 0;
/* 654 */                   j8 = j;
/* 656 */                   j9 = j2;
/* 658 */                   list4 = list;
                            while (true) {
/* 660 */                       i2 = inputStream.read(bArr);
/* 664 */                       oOo0ll111.I00iOIl = i2;
/* 666 */                       Ii0111o ii0111o3 = ii0111o2;
/* 669 */                       if (i2 == -1) {
                                }
/* 1321 */                      downloadWorker2 = this;
/* 1323 */                      j8 = j26;
/* 1325 */                      ii0111o2 = ii0111o3;
/* 1327 */                      j6 = j25;
/* 1329 */                      j7 = j24;
                            }
                        } catch (Throwable th3) {
/* 1350 */                  th = th3;
/* 1351 */                  inputStream = inputStream2;
/* 1352 */                  httpURLConnection = httpURLConnectionI0000oI00;
/* 1353 */                  fileOutputStream = fileOutputStream3;
                        }
                    } else if (i4 == 1) {
/* 212 */               f = 1000.0f;
/* 216 */               float f2 = iil0liIioi.I00oI0i;
/* 218 */               float f3 = iil0liIioi.I00o101lO;
/* 220 */               long j28 = iil0liIioi.I00o0iI0io1;
/* 222 */               long j29 = iil0liIioi.I00lll10;
/* 224 */               long j30 = iil0liIioi.I00lli11;
/* 226 */               int i5 = iil0liIioi.I00o0l1o1o0;
/* 231 */               long j31 = iil0liIioi.I00ll1;
/* 235 */               long j32 = iil0liIioi.I00li1OI;
/* 239 */               long j33 = iil0liIioi.I00l0OO0IO;
/* 243 */               long j34 = iil0liIioi.I00l0I0l0lO1;
/* 247 */               OOo0ll111 oOo0ll1112 = iil0liIioi.I00ioIO;
/* 251 */               byte[] bArr3 = iil0liIioi.I00io1l;
/* 255 */               FileOutputStream fileOutputStream4 = iil0liIioi.I00ilO0;
/* 257 */               InputStream inputStream3 = iil0liIioi.I00ilI0I1;
/* 261 */               HttpURLConnection httpURLConnection3 = iil0liIioi.I00iio;
/* 265 */               List list8 = iil0liIioi.I00iiO;
/* 271 */               List list9 = iil0liIioi.I00iiI;
/* 277 */               String str7 = iil0liIioi.I00iOIl;
                        try {
/* 279 */                   lIoii1l01l0i.I00000oOI(obj);
/* 282 */                   Ii0111o ii0111o4 = ii0111o2;
/* 284 */                   long j35 = j30;
/* 286 */                   long j36 = 0;
/* 288 */                   ?? r1 = i5;
/* 290 */                   List list10 = list8;
/* 292 */                   List list11 = list9;
/* 294 */                   fileOutputStream2 = fileOutputStream4;
/* 296 */                   httpURLConnection = httpURLConnection3;
/* 297 */                   Ii0111o ii0111o5 = ii0111o4;
/* 299 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 301 */                   j12 = j29;
/* 303 */                   bArr = bArr3;
/* 305 */                   inputStream = inputStream3;
/* 306 */                   long j37 = j28;
/* 308 */                   long j38 = j31;
/* 310 */                   long j39 = j33;
/* 312 */                   oOo0ll111 = oOo0ll1112;
/* 314 */                   String str8 = str7;
/* 316 */                   float f4 = f2;
/* 44 */                    str3 = "AGDownloadWorker";
/* 320 */                   iil0liIioi3 = iil0liIioi;
/* 321 */                   long j40 = j34;
/* 323 */                   float f5 = f3;
/* 325 */                   long j41 = j32;
/* 995 */                   if (j39 > j36) {
/* 1001 */                      j20 = j38;
                                try {
                                    try {
                                    } catch (Exception e3) {
/* 1007 */                              e2 = e3;
/* 1008 */                              list3 = list10;
/* 1010 */                              j10 = j37;
/* 1012 */                              list5 = list11;
/* 1014 */                              ii0111o = ii0111o4;
/* 1016 */                              j13 = j20;
/* 1018 */                              j14 = j40;
/* 1020 */                              j11 = j41;
/* 1022 */                              str5 = str8;
/* 1024 */                              z3 = r1;
/* 1025 */                              j15 = j39;
/* 1026 */                              downloadWorker = this;
/* 1268 */                              str6 = str3;
/* 1270 */                              Log.w(str6, "setForeground failed mid-download (ignored): " + e2);
/* 1275 */                              list6 = list5;
/* 1277 */                              j16 = j12;
/* 1279 */                              j17 = j13;
/* 1281 */                              j18 = j11;
/* 1283 */                              str4 = str5;
/* 1284 */                              z4 = z3;
/* 1285 */                              j19 = j10;
/* 1287 */                              str3 = str6;
/* 1289 */                              downloadWorker2 = downloadWorker;
/* 1290 */                              j9 = j15;
/* 1292 */                              j7 = j19;
/* 1293 */                              ii0111o2 = ii0111o;
/* 1294 */                              iil0liIioi2 = iil0liIioi3;
/* 1295 */                              j5 = j18;
/* 1297 */                              j4 = j17;
/* 1299 */                              list4 = list6;
/* 1301 */                              j6 = j16;
/* 1303 */                              z2 = z4;
/* 1305 */                              j8 = j14;
                                        while (true) {
/* 660 */                                   i2 = inputStream.read(bArr);
/* 664 */                                   oOo0ll111.I00iOIl = i2;
/* 666 */                                   Ii0111o ii0111o32 = ii0111o2;
/* 669 */                                   if (i2 == -1) {
                                            }
/* 1321 */                                  downloadWorker2 = this;
/* 1323 */                                  j8 = j26;
/* 1325 */                                  ii0111o2 = ii0111o32;
/* 1327 */                                  j6 = j25;
/* 1329 */                                  j7 = j24;
                                        }
                                    }
/* 1005 */                          i = (int) ((100 * j41) / j39);
                                } catch (CancellationException e4) {
/* 1030 */                          e = e4;
/* 1031 */                          httpURLConnection2 = httpURLConnection;
/* 1309 */                          throw e;
                                }
                            } else {
/* 1034 */                      j20 = j38;
/* 1036 */                      i = 0;
                            }
/* 1049 */                  IliliOOliOi ililiOOliOiI0000Il00O = I0000Il00O((long) (f5 * f), (long) f4, i, str8);
/* 1053 */                  String str9 = str8;
/* 1055 */                  iil0liIioi3.I00iOIl = str9;
/* 1057 */                  str8 = str9;
/* 1063 */                  iil0liIioi3.I00iiI = list11;
/* 1069 */                  iil0liIioi3.I00iiO = list10;
/* 1071 */                  iil0liIioi3.I00iio = httpURLConnection;
/* 1073 */                  iil0liIioi3.I00ilI0I1 = inputStream;
/* 1075 */                  iil0liIioi3.I00ilO0 = fileOutputStream2;
/* 1077 */                  iil0liIioi3.I00io1l = bArr;
/* 1079 */                  iil0liIioi3.I00ioIO = oOo0ll111;
/* 1081 */                  iil0liIioi3.I00l0I0l0lO1 = j40;
/* 1083 */                  iil0liIioi3.I00l0OO0IO = j39;
/* 1085 */                  iil0liIioi3.I00li1OI = j41;
/* 1087 */                  long j42 = j39;
/* 1089 */                  long j43 = j20;
/* 1091 */                  iil0liIioi3.I00ll1 = j43;
/* 1093 */                  iil0liIioi3.I00o0l1o1o0 = r1;
/* 1095 */                  z5 = r1;
/* 1096 */                  j20 = j43;
/* 1100 */                  iil0liIioi3.I00lli11 = j35;
/* 1102 */                  long j44 = j12;
/* 1104 */                  iil0liIioi3.I00lll10 = j44;
/* 1106 */                  j12 = j44;
/* 1108 */                  j21 = j37;
/* 1110 */                  iil0liIioi3.I00o0iI0io1 = j21;
/* 1114 */                  iil0liIioi3.I00o101lO = f5;
/* 1116 */                  iil0liIioi3.I00oI0i = f4;
/* 1119 */                  iil0liIioi3.I00oO101o = 2;
/* 1121 */                  downloadWorker = this;
/* 1127 */                  Object objI00000oIO = l10oIiO1Il.I00000oIO(downloadWorker.setForegroundAsync(ililiOOliOiI0000Il00O), iil0liIioi3);
/* 1133 */                  if (objI00000oIO != ii0111o5) {
/* 1138 */                      objI00000oIO = ooiIlOl1iI;
                            }
/* 1135 */                  ii0111o = ii0111o4;
/* 1141 */                  if (objI00000oIO == ii0111o) {
/* 1143 */                      return ii0111o;
                            }
/* 1144 */                  str4 = str8;
/* 1146 */                  j18 = j41;
/* 1148 */                  list6 = list11;
/* 1150 */                  j22 = j40;
/* 1151 */                  list7 = list10;
/* 1153 */                  j15 = j42;
/* 1155 */                  j23 = j20;
/* 1157 */                  j16 = j12;
/* 1159 */                  j17 = j23;
/* 1161 */                  j14 = j22;
/* 1163 */                  j19 = j21;
/* 1164 */                  z4 = z5;
/* 1165 */                  str6 = str3;
/* 1167 */                  list3 = list7;
/* 1287 */                  str3 = str6;
/* 1289 */                  downloadWorker2 = downloadWorker;
/* 1290 */                  j9 = j15;
/* 1292 */                  j7 = j19;
/* 1293 */                  ii0111o2 = ii0111o;
/* 1294 */                  iil0liIioi2 = iil0liIioi3;
/* 1295 */                  j5 = j18;
/* 1297 */                  j4 = j17;
/* 1299 */                  list4 = list6;
/* 1301 */                  j6 = j16;
/* 1303 */                  z2 = z4;
/* 1305 */                  j8 = j14;
                            while (true) {
/* 660 */                       i2 = inputStream.read(bArr);
/* 664 */                       oOo0ll111.I00iOIl = i2;
/* 666 */                       Ii0111o ii0111o322 = ii0111o2;
/* 669 */                       if (i2 == -1) {
                                }
/* 1321 */                      downloadWorker2 = this;
/* 1323 */                      j8 = j26;
/* 1325 */                      ii0111o2 = ii0111o322;
/* 1327 */                      j6 = j25;
/* 1329 */                      j7 = j24;
                            }
                        } catch (Throwable th4) {
/* 329 */                   th = th4;
/* 330 */                   httpURLConnection = httpURLConnection3;
/* 331 */                   inputStream = inputStream3;
/* 332 */                   fileOutputStream = fileOutputStream4;
                        }
                    } else {
/* 53 */                if (i4 != 2) {
/* 208 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 55 */                long j45 = iil0liIioi.I00o0iI0io1;
/* 57 */                f = 1000.0f;
/* 59 */                long j46 = iil0liIioi.I00lll10;
/* 61 */                ?? r7 = iil0liIioi.I00o0l1o1o0;
/* 63 */                long j47 = iil0liIioi.I00ll1;
/* 67 */                long j48 = iil0liIioi.I00li1OI;
/* 69 */                j10 = j45;
/* 71 */                long j49 = iil0liIioi.I00l0OO0IO;
/* 75 */                long j50 = iil0liIioi.I00l0I0l0lO1;
/* 79 */                OOo0ll111 oOo0ll1113 = iil0liIioi.I00ioIO;
/* 81 */                byte[] bArr4 = iil0liIioi.I00io1l;
/* 85 */                FileOutputStream fileOutputStream5 = iil0liIioi.I00ilO0;
/* 89 */                InputStream inputStream4 = iil0liIioi.I00ilI0I1;
/* 93 */                HttpURLConnection httpURLConnection4 = iil0liIioi.I00iio;
/* 95 */                List list12 = iil0liIioi.I00iiO;
/* 101 */               List list13 = iil0liIioi.I00iiI;
/* 109 */               String str10 = iil0liIioi.I00iOIl;
                        try {
/* 111 */                   lIoii1l01l0i.I00000oOI(obj);
/* 114 */                   str4 = str10;
/* 115 */                   j12 = j46;
/* 117 */                   j18 = j48;
/* 121 */                   list7 = list12;
/* 123 */                   list6 = list13;
/* 125 */                   oOo0ll111 = oOo0ll1113;
/* 127 */                   fileOutputStream2 = fileOutputStream5;
/* 129 */                   httpURLConnection = httpURLConnection4;
/* 131 */                   z5 = r7;
/* 132 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 44 */                    str3 = "AGDownloadWorker";
/* 136 */                   j23 = j47;
/* 138 */                   inputStream = inputStream4;
/* 140 */                   bArr = bArr4;
/* 141 */                   iil0liIioi3 = iil0liIioi;
/* 142 */                   ii0111o = ii0111o2;
/* 143 */                   j15 = j49;
/* 145 */                   j22 = j50;
/* 147 */                   downloadWorker = downloadWorker2;
/* 148 */                   j21 = j10;
                        } catch (CancellationException e5) {
/* 197 */                   e = e5;
/* 198 */                   fileOutputStream2 = fileOutputStream5;
/* 200 */                   inputStream = inputStream4;
/* 202 */                   httpURLConnection2 = httpURLConnection4;
                            try {
/* 1309 */                      throw e;
                            } catch (Throwable th5) {
/* 1310 */                      th = th5;
/* 1311 */                      httpURLConnection = httpURLConnection2;
/* 742 */                       fileOutputStream = fileOutputStream2;
/* 1354 */                      fileOutputStream.close();
/* 1357 */                      inputStream.close();
/* 1360 */                      httpURLConnection.disconnect();
/* 1821 */                      throw th;
                            }
                        } catch (Exception e6) {
/* 161 */                   e2 = e6;
/* 162 */                   j12 = j46;
/* 164 */                   j13 = j47;
/* 166 */                   j11 = j48;
/* 170 */                   list3 = list12;
/* 172 */                   list5 = list13;
/* 174 */                   j14 = j50;
/* 176 */                   oOo0ll111 = oOo0ll1113;
/* 178 */                   fileOutputStream2 = fileOutputStream5;
/* 180 */                   inputStream = inputStream4;
/* 182 */                   httpURLConnection = httpURLConnection4;
/* 184 */                   bArr = bArr4;
/* 185 */                   ooiIlOl1iI = ooiIlOl1iI2;
/* 44 */                    str3 = "AGDownloadWorker";
/* 189 */                   downloadWorker = downloadWorker2;
/* 190 */                   iil0liIioi3 = iil0liIioi;
/* 191 */                   ii0111o = ii0111o2;
/* 192 */                   j15 = j49;
/* 194 */                   str5 = str10;
                            z3 = r7;
/* 1268 */                  str6 = str3;
/* 1270 */                  Log.w(str6, "setForeground failed mid-download (ignored): " + e2);
/* 1275 */                  list6 = list5;
/* 1277 */                  j16 = j12;
/* 1279 */                  j17 = j13;
/* 1281 */                  j18 = j11;
/* 1283 */                  str4 = str5;
/* 1284 */                  z4 = z3;
/* 1285 */                  j19 = j10;
/* 1287 */                  str3 = str6;
/* 1289 */                  downloadWorker2 = downloadWorker;
/* 1290 */                  j9 = j15;
/* 1292 */                  j7 = j19;
/* 1293 */                  ii0111o2 = ii0111o;
/* 1294 */                  iil0liIioi2 = iil0liIioi3;
/* 1295 */                  j5 = j18;
/* 1297 */                  j4 = j17;
/* 1299 */                  list4 = list6;
/* 1301 */                  j6 = j16;
/* 1303 */                  z2 = z4;
/* 1305 */                  j8 = j14;
                            while (true) {
                                try {
/* 660 */                           i2 = inputStream.read(bArr);
/* 664 */                           oOo0ll111.I00iOIl = i2;
/* 666 */                           Ii0111o ii0111o3222 = ii0111o2;
/* 669 */                           if (i2 == -1) {
                                    }
/* 1321 */                          downloadWorker2 = this;
/* 1323 */                          j8 = j26;
/* 1325 */                          ii0111o2 = ii0111o3222;
/* 1327 */                          j6 = j25;
/* 1329 */                          j7 = j24;
                                } catch (Throwable th6) {
/* 741 */                           th = th6;
/* 742 */                           fileOutputStream = fileOutputStream2;
/* 1354 */                          fileOutputStream.close();
/* 1357 */                          inputStream.close();
/* 1360 */                          httpURLConnection.disconnect();
/* 1821 */                          throw th;
                                }
                            }
                        } catch (Throwable th7) {
/* 152 */                   th = th7;
/* 153 */                   fileOutputStream = fileOutputStream5;
/* 155 */                   inputStream = inputStream4;
/* 157 */                   httpURLConnection = httpURLConnection4;
                        }
/* 1157 */              j16 = j12;
/* 1159 */              j17 = j23;
/* 1161 */              j14 = j22;
/* 1163 */              j19 = j21;
/* 1164 */              z4 = z5;
/* 1165 */              str6 = str3;
/* 1167 */              list3 = list7;
/* 1287 */              str3 = str6;
/* 1289 */              downloadWorker2 = downloadWorker;
/* 1290 */              j9 = j15;
/* 1292 */              j7 = j19;
/* 1293 */              ii0111o2 = ii0111o;
/* 1294 */              iil0liIioi2 = iil0liIioi3;
/* 1295 */              j5 = j18;
/* 1297 */              j4 = j17;
/* 1299 */              list4 = list6;
/* 1301 */              j6 = j16;
/* 1303 */              z2 = z4;
/* 1305 */              j8 = j14;
                        while (true) {
/* 660 */                   i2 = inputStream.read(bArr);
/* 664 */                   oOo0ll111.I00iOIl = i2;
/* 666 */                   Ii0111o ii0111o32222 = ii0111o2;
/* 669 */                   if (i2 == -1) {
                                try {
/* 1333 */                          fileOutputStream2.close();
                                } catch (Throwable unused) {
                                }
                                try {
/* 1336 */                          inputStream.close();
                                } catch (Throwable unused2) {
                                }
                                try {
/* 1339 */                          httpURLConnection.disconnect();
                                } catch (Throwable unused3) {
                                }
/* 1346 */                      return new Long(j5);
                            }
/* 675 */                   if (downloadWorker2.isStopped()) {
                                try {
/* 677 */                           fileOutputStream2.close();
                                } catch (Throwable unused4) {
                                }
                                try {
/* 680 */                           inputStream.close();
                                } catch (Throwable unused5) {
                                }
                                try {
/* 683 */                           httpURLConnection.disconnect();
                                } catch (Throwable unused6) {
                                }
/* 47 */                        return null;
                            }
/* 690 */                   fileOutputStream2.write(bArr, 0, oOo0ll111.I00iOIl);
/* 695 */                   j24 = j7;
/* 693 */                   long j51 = oOo0ll111.I00iOIl;
/* 700 */                   j5 += j51;
/* 704 */                   j25 = j6 + j51;
/* 706 */                   j26 = j8;
/* 708 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 714 */                   long j52 = jCurrentTimeMillis - j24;
/* 720 */                   if (j52 > 200) {
                                break;
                            }
/* 1321 */                  downloadWorker2 = this;
/* 1323 */                  j8 = j26;
/* 1325 */                  ii0111o2 = ii0111o32222;
/* 1327 */                  j6 = j25;
/* 1329 */                  j7 = j24;
                        }
                    }
                    try {
/* 1354 */              fileOutputStream.close();
                    } catch (Throwable unused7) {
                    }
                    try {
/* 1357 */              inputStream.close();
                    } catch (Throwable unused8) {
                    }
                    try {
/* 1360 */              httpURLConnection.disconnect();
/* 1821 */              throw th;
                    } catch (Throwable unused9) {
/* 1821 */              throw th;
                    }
                }
            }
