            package p000;

            import android.database.Cursor;
            import android.os.IInterface;
            import android.text.TextUtils;
            import android.util.Log;
            import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.BufferedReader;
            import java.io.BufferedWriter;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.io.OutputStream;
            import java.io.OutputStreamWriter;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.net.ConnectException;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.net.UnknownHostException;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Set;
            import java.util.concurrent.ExecutionException;
            import java.util.zip.GZIPInputStream;
            import java.util.zip.GZIPOutputStream;
            import kotlin.jvm.functions.Function1;
            
/* 83 */    public final class I0IOIlIOIII implements I0IIOlio, IIiOOIoi0, IoiO1iOOil11, OIOi0l1il, OIi0Oi1lOoo, IOoillilli, IoOoo0ll, I1Olli1oIi, Illill0o, OOooio11i00, OiIIOlilOlo {
                public final int I00iOIl;
                public Object I00iiI;

                public I0IOIlIOIII(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public void I00000oIO(Oio0oi11l oio0oi11l) {
/* 5 */             ((IoOoo0ll) this.I00iiI).I00000oIO(oio0oi11l);
                }

                @Override
                public Object I00000oOI() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 5:
/* 43 */                    Constructor constructor = (Constructor) obj;
                            try {
/* 50 */                        return constructor.newInstance(null);
                            } catch (IllegalAccessException e) {
/* 56 */                        lIo000I lio000i = OOoi0l1.I00000oIO;
/* 60 */                        OIiilo1Ool0o.I000iOII("Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
/* 49 */                        return null;
                            } catch (InstantiationException e2) {
/* 117 */                       throw new RuntimeException("Failed to invoke constructor '" + OOoi0l1.I00000oOI(constructor) + "' with no args", e2);
                            } catch (InvocationTargetException e3) {
/* 88 */                        OIiilo1Ool0o.I000iOII("Failed to invoke constructor '" + OOoi0l1.I00000oOI(constructor) + "' with no args", e3.getCause());
/* 49 */                        return null;
                            }
                        default:
/* 8 */                     Class cls = (Class) obj;
                            try {
/* 12 */                        return Ooiiil.I00000oIO.I00000oIO(cls);
                            } catch (Exception e4) {
/* 42 */                        throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e4);
                            }
                    }
                }

                @Override
                public void I0000Il00O(IoiO1ilO ioiO1ilO) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 3:
/* 27 */                    I0Oi111ii i0Oi111ii = (I0Oi111ii) obj;
                            try {
/* 32 */                        IoiO1IO1I1i ioiO1IO1I1iI00000oOI = ioiO1ilO.I00000oOI();
/* 39 */                        l11I11lO.I0000O(3, "CaptureNode");
/* 42 */                        if (ioiO1IO1I1iI00000oOI != null) {
/* 44 */                            i0Oi111ii.I00Io1lO(ioiO1IO1I1iI00000oOI);
                                } else {
/* 52 */                            OOIo1Iiiil oOIo1Iiiil = (OOIo1Iiiil) i0Oi111ii.I00iiI;
/* 54 */                            if (oOIo1Iiiil != null) {
/* 68 */                                i0Oi111ii.I00IoIO0lI(I1lO01OlllO.I00000oIO(oOIo1Iiiil.I00000oIO, new Ioi1lIO("Failed to acquire latest image", null, 2)));
                                    }
                                }
/* 92 */                        return;
                            } catch (IllegalStateException e) {
/* 74 */                        OOIo1Iiiil oOIo1Iiiil2 = (OOIo1Iiiil) i0Oi111ii.I00iiI;
/* 76 */                        if (oOIo1Iiiil2 != null) {
/* 89 */                            i0Oi111ii.I00IoIO0lI(I1lO01OlllO.I00000oIO(oOIo1Iiiil2.I00000oIO, new Ioi1lIO("Failed to acquire latest image", e, 2)));
/* 92 */                            return;
                                }
/* 92 */                        return;
                            }
                        default:
/* 8 */                     O1li1Il o1li1Il = (O1li1Il) obj;
                            synchronized (o1li1Il.I00iOIl) {
                                o1li1Il.I00iiO++;
                            }
/* 20 */                    o1li1Il.I000OOo1O(ioiO1ilO);
/* 23 */                    return;
                    }
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) throws ExecutionException {
/* 3 */             String str = (String) this.I00iiI;
/* 9 */             if (!oloIIoII1oo.I000OOo1O()) {
/* 77 */                throw new ExecutionException(oloIIoII1oo.I0001Ioi1lo());
                    }
/* 15 */            String str2 = (String) oloIIoII1oo.I000II();
/* 21 */            if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
/* 42 */                throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                    }
/* 29 */            return str;
                }

                public IIo0IiiO I0000oI00(IoIlOo1o0IIl ioIlOo1o0IIl) throws IOException {
/* 3 */             IO0ll11OOI iO0ll11OOI = (IO0ll11OOI) this.I00iiI;
/* 5 */             iO0ll11OOI.getClass();
/* 10 */            URL url = (URL) ioIlOo1o0IIl.I00iiI;
/* 16 */            String strConcat = "TRuntime.".concat("CctTransportBackend");
/* 25 */            if (Log.isLoggable(strConcat, 4)) {
/* 37 */                Log.i(strConcat, String.format("Making request to: %s", url));
                    }
/* 44 */            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
/* 48 */            httpURLConnection.setConnectTimeout(30000);
/* 53 */            httpURLConnection.setReadTimeout(iO0ll11OOI.I000II);
/* 57 */            httpURLConnection.setDoOutput(true);
/* 61 */            httpURLConnection.setInstanceFollowRedirects(false);
/* 66 */            httpURLConnection.setRequestMethod("POST");
/* 73 */            httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
/* 80 */            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
/* 87 */            httpURLConnection.setRequestProperty("Content-Type", "application/json");
/* 92 */            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
/* 97 */            String str = (String) ioIlOo1o0IIl.I00iio;
/* 99 */            if (str != null) {
/* 103 */               httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                    }
                    try {
/* 109 */               OutputStream outputStream = httpURLConnection.getOutputStream();
                        try {
/* 115 */                   GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                            try {
/* 134 */                       iO0ll11OOI.I00000oIO.I000o00OoI0I((I1illOi0o) ioIlOo1o0IIl.I00iiO, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
/* 137 */                       gZIPOutputStream.close();
/* 140 */                       if (outputStream != null) {
/* 142 */                           outputStream.close();
                                }
/* 152 */                       int responseCode = httpURLConnection.getResponseCode();
/* 156 */                       Integer numValueOf = Integer.valueOf(responseCode);
/* 160 */                       String strConcat2 = "TRuntime.".concat("CctTransportBackend");
/* 168 */                       if (Log.isLoggable(strConcat2, 4)) {
/* 180 */                           Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                                }
/* 189 */                       l11I1i.I00000oIO("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
/* 198 */                       l11I1i.I00000oIO("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
/* 203 */                       if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
/* 316 */                           return new IIo0IiiO(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                                }
/* 216 */                       if (responseCode != 200) {
/* 220 */                           return new IIo0IiiO(responseCode, null, 0L);
                                }
/* 224 */                       InputStream inputStream = httpURLConnection.getInputStream();
                                try {
/* 244 */                           InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                                    try {
/* 263 */                               IIo0IiiO iIo0IiiO = new IIo0IiiO(responseCode, null, I1l1Il0.I00000oIO(new BufferedReader(new InputStreamReader(gZIPInputStream))).I00000oIO);
/* 266 */                               if (gZIPInputStream != null) {
/* 268 */                                   gZIPInputStream.close();
                                        }
/* 274 */                               if (inputStream != null) {
/* 276 */                                   inputStream.close();
                                        }
/* 279 */                               return iIo0IiiO;
                                    } finally {
                                    }
                                } catch (Throwable th) {
/* 292 */                           if (inputStream != null) {
                                        try {
/* 294 */                                   inputStream.close();
                                        } catch (Throwable th2) {
/* 299 */                                   th.addSuppressed(th2);
                                        }
                                    }
/* 302 */                           throw th;
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
/* 332 */                   if (outputStream != null) {
                                try {
/* 334 */                           outputStream.close();
                                } catch (Throwable th4) {
/* 339 */                           th3.addSuppressed(th4);
                                }
                            }
/* 342 */                   throw th3;
                        }
                    } catch (Il0IO001iOOo | IOException e) {
/* 345 */               l11I1i.I00000oOI("CctTransportBackend", "Couldn't encode request, returning with 400", e);
/* 352 */               return new IIo0IiiO(400, null, 0L);
                    } catch (ConnectException | UnknownHostException e2) {
/* 358 */               l11I1i.I00000oOI("CctTransportBackend", "Couldn't open connection, returning with 500", e2);
/* 365 */               return new IIo0IiiO(500, null, 0L);
                    }
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case 10:
/* 40 */                    ((IlI0iIl011) obj2).invoke(obj);
                            break;
                        case 11:
/* 34 */                    ((IlI0iIl011) obj2).invoke(obj);
                            break;
                        case 12:
/* 28 */                    ((IloIil1iOi) obj2).invoke(obj);
                            break;
                        case 13:
/* 22 */                    ((IloIil1iOi) obj2).invoke(obj);
                            break;
                        case 14:
/* 16 */                    ((IlI0iIl011) obj2).invoke(obj);
                            break;
                        default:
/* 10 */                    ((IlI0iIl011) obj2).invoke(obj);
                            break;
                    }
                }

                public void I000II() {
/* 3 */             IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00iiI;
                    synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 16 */                Ol1l1lI1Ili.I000O01llI0 = IOOi0Ool1i.I00Iooi00oi(Ol1l1lI1Ili.I000O01llI0, illiIl1l11O);
                    }
                }

                public void I000O01llI0() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 9:
/* 38 */                    ((IOi10loi) obj).I00O10llo(OoiIlOl1iI.I00000oIO);
/* 41 */                    return;
                        default:
/* 8 */                     OiOOoiOOo oiOOoiOOo = (OiOOoiOOo) obj;
                            synchronized (oiOOoiOOo.I00000oOI) {
                                try {
/* 15 */                            if (oiOOoiOOo.I0000O == null) {
/* 21 */                                l11I11lO.I0000oI00("ScreenFlashWrapper", "apply: pendingListener is null!");
                                    }
/* 27 */                            oiOOoiOOo.I0000Il00O();
                                } catch (Throwable th) {
/* 33 */                            throw th;
                                }
                            }
/* 31 */                    return;
                    }
                }

                @Override
                public void I000iOII(Object obj) {
/* 11 */            ((Function1) ((OI10i0Il) this.I00iiI).getValue()).invoke(obj);
                }

                @Override
                public void I001lIiIIo1O(IInterface iInterface, OOoolO01Ioo oOoolO01Ioo) {
/* 3 */             RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = (RemoteListenableDelegatingWorker) this.I00iiI;
/* 28 */            ((IoOl0I1Io1O) iInterface).I00II0oii1o(oOoolO01Ioo, l1oOOloO0.I00000oIO(new OIoo00(remoteListenableDelegatingWorker.I00000oOI.I00000oIO.toString(), remoteListenableDelegatingWorker.getStopReason())));
/* 33 */            remoteListenableDelegatingWorker.I0000Il00O.I00000oOI();
                }

                @Override
                public Object apply(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00iiI;
                    switch (i) {
                        case PoseLandmark.LEFT_INDEX:
/* 81 */                    return (Void) ((I01oIoOI01l) obj2).invoke(obj);
                        default:
/* 8 */                     HashMap map = (HashMap) obj2;
/* 10 */                    Cursor cursor = (Cursor) obj;
/* 16 */                    while (cursor.moveToNext()) {
/* 19 */                        long j = cursor.getLong(0);
/* 31 */                        Set hashSet = (Set) map.get(Long.valueOf(j));
/* 33 */                        if (hashSet == null) {
/* 37 */                            hashSet = new HashSet();
/* 44 */                            map.put(Long.valueOf(j), hashSet);
                                }
/* 50 */                        String string = cursor.getString(1);
/* 55 */                        String string2 = cursor.getString(2);
/* 59 */                        OiIIil oiIIil = new OiIIil();
/* 62 */                        oiIIil.I00000oIO = string;
/* 64 */                        oiIIil.I00000oOI = string2;
/* 66 */                        VarHandle.storeStoreFence();
/* 69 */                        hashSet.add(oiIIil);
                            }
/* 73 */                    return null;
                    }
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
                    ListenableFuture listenableFuture;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 1:
/* 239 */                   IIo0ii1Oi iIo0ii1Oi = (IIo0ii1Oi) obj;
                            synchronized (iIo0ii1Oi.I00000oIO) {
/* 244 */                       iIo0ii1Oi.I0000oI00 = iIiOOI;
                            }
/* 247 */                   return "CameraRepository-deinit";
                        case 2:
/* 63 */                    IIoIloi0 iIoIloi0 = (IIoIloi0) obj;
/* 67 */                    iIoIloi0.I000o00OoI0I.I0001Ioi1lo();
/* 76 */                    if (iIoIloi0.I000oI1ioi.I00000oOI()) {
/* 84 */                        OiI0OoOIi oiI0OoOIi = (OiI0OoOIi) iIoIloi0.I000oI1ioi.getValue();
                                synchronized (oiI0OoOIi.I00000oIO) {
/* 91 */                            oiI0OoOIi.I00000oOI.disable();
/* 96 */                            oiI0OoOIi.I0000Il00O.clear();
/* 100 */                           oiI0OoOIi.I0000O = -1;
                                }
                            }
/* 107 */                   IIo0ii1Oi iIo0ii1Oi2 = iIoIloi0.I00000oIO;
                            synchronized (iIo0ii1Oi2.I00000oIO) {
                                try {
/* 114 */                           boolean zIsEmpty = iIo0ii1Oi2.I00000oOI.isEmpty();
/* 118 */                           ListenableFuture listenableFuture2 = iIo0ii1Oi2.I0000O;
                                    ListenableFuture listenableFuture3 = listenableFuture2;
                                    ListenableFuture listenableFuture4 = listenableFuture2;
/* 120 */                           if (!zIsEmpty) {
/* 131 */                               if (listenableFuture2 == null) {
/* 136 */                                   I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(1);
/* 139 */                                   i0IOIlIOIII.I00iiI = iIo0ii1Oi2;
/* 141 */                                   VarHandle.storeStoreFence();
/* 144 */                                   IIiOiI0il iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(i0IOIlIOIII);
/* 148 */                                   iIo0ii1Oi2.I0000O = iIiOiI0ilI00000oIO;
                                            listenableFuture4 = iIiOiI0ilI00000oIO;
                                        }
/* 158 */                               iIo0ii1Oi2.I0000Il00O.addAll(iIo0ii1Oi2.I00000oOI.values());
/* 175 */                               for (IIllOo0 iIllOo0 : iIo0ii1Oi2.I00000oOI.values()) {
/* 183 */                                   ListenableFuture listenableFutureI00000oIO = iIllOo0.I00000oIO();
/* 191 */                                   I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(12);
/* 194 */                                   i0iOo0oioiO.I00iiI = iIo0ii1Oi2;
/* 196 */                                   i0iOo0oioiO.I00iiO = iIllOo0;
/* 198 */                                   VarHandle.storeStoreFence();
/* 205 */                                   listenableFutureI00000oIO.addListener(i0iOo0oioiO, Iii11l.I00000oIO());
                                        }
/* 211 */                               iIo0ii1Oi2.I00000oOI.clear();
                                        listenableFuture = listenableFuture4;
                                    } else if (listenableFuture2 == null) {
/* 124 */                               listenableFuture3 = Ioil1IIo.I00iiO;
                                    }
                                } finally {
                                }
                            }
/* 219 */                   I0iOo0oioiO i0iOo0oioiO2 = new I0iOo0oioiO(14);
/* 222 */                   i0iOo0oioiO2.I00iiI = iIoIloi0;
/* 224 */                   i0iOo0oioiO2.I00iiO = iIiOOI;
/* 226 */                   VarHandle.storeStoreFence();
/* 231 */                   listenableFuture.addListener(i0iOo0oioiO2, iIoIloi0.I0000O);
/* 234 */                   return "CameraX shutdownInternal";
                        case 7:
/* 49 */                    IiIOIO1I iiIOIO1I = (IiIOIO1I) obj;
/* 59 */                    iiIOIO1I.I00iiI(new Ii00IiIOOoi0(0, iIiOOI, iiIOIO1I));
/* 51 */                    return "Deferred.asListenableFuture";
                        case 8:
/* 37 */                    IIOIlOoI111 iIOIlOoI111 = new IIOIlOoI111(26);
/* 40 */                    iIOIlOoI111.I00iiI = iIiOOI;
/* 42 */                    VarHandle.storeStoreFence();
/* 45 */                    ((O011OOl11) obj).I00iiI(iIOIlOoI111);
/* 31 */                    return "Job.asListenableFuture";
                        default:
/* 8 */                     OoIlIoo1oiOo ooIlIoo1oiOo = (OoIlIoo1oiOo) obj;
/* 23 */                    iOi1II01i0.I0000O((IIOlO1ii) ooIlIoo1oiOo.I00ioIO, null, null, new O00lOIIO(ooIlIoo1oiOo, iIiOOI, null, 20), 3);
/* 26 */                    return "FetchData for PipeCameraPresence0";
                    }
                }

                @Override
/* 84 */        public ListenableFuture apply(Object obj) {
/* 85 */            return (ListenableFuture) ((O0l0IlolloIO) this.I00iiI).invoke(obj);
                }
            }
