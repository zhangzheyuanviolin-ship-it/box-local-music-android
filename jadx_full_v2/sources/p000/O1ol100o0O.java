            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.ModelAllowlist;
            import com.google.ai.edge.gallery.data.ModelDownloadStatusType;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.mlkit.genai.prompt.Generation;
            import com.google.mlkit.genai.prompt.GenerationConfigKt;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.FilenameFilter;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.NoSuchElementException;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.Executors;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.Metadata;
            
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"LO1ol100o0O;", "LOooioIIoi0O;", "", "isAICoreAvailable", "app"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public class O1ol100o0O extends OooioIIoi0O {
                public Ii1lo00I1 I00000oOI;
                public Ii1liIllli0 I0000Il00O;
                public Ilo0lli0o I0000O;
                public Ioio0O I0000oI00;
                public Context I0001Ioi1lo;
                public File I000II;
                public OlO0OIIl1 I000O01llI0;
                public OOli1O I000OOo1O;
                public I1ii1l10IO I000OiO;
                public String I000iOII;

                public static void I000O01llI0(O1ol100o0O o1ol100o0O, Context context, OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, Object obj, I0IoOl i0IoOl, int i) {
/* 3 */             if ((i & 8) != 0) {
/* 5 */                 obj = o1oIOiI11o0.I00IlilI0i0i;
                    }
                    IllOOo00lI o0o0Ol0 = i0IoOl;
/* 9 */             if ((i & 16) != 0) {
/* 15 */                o0o0Ol0 = new O0o0Ol0(28);
                    }
/* 18 */            o1ol100o0O.getClass();
/* 21 */            if (obj != null && obj != o1oIOiI11o0.I00IlilI0i0i) {
/* 27 */                o0o0Ol0.invoke();
/* 30 */                return;
                    }
/* 33 */            if (o1oIOiI11o0.I00IlilI0i0i == null) {
/* 70 */                if (o1oIOiI11o0.I00Io1lO) {
/* 73 */                    o1oIOiI11o0.I00Io1o110i = true;
/* 965 */                   return;
                        }
/* 965 */               return;
                    }
/* 36 */            o1oIOiI11o0.I00Io1o110i = false;
/* 40 */            O1oiilO o1oiilO = new O1oiilO(0);
/* 43 */            o1oiilO.I00iiI = o1oIOiI11o0;
/* 45 */            o1oiilO.I00iiO = o1ol100o0O;
/* 47 */            o1oiilO.I00iio = o0o0Ol0;
/* 49 */            VarHandle.storeStoreFence();
/* 54 */            Ii0ioo10iO0 ii0ioo10iO0I00111O = o1ol100o0O.I00111O(oloIl1l1oOii.I00000oIO);
/* 58 */            if (ii0ioo10iO0I00111O != null) {
/* 64 */                ii0ioo10iO0I00111O.I0000O(OooiooIOO.I00000oIO(o1ol100o0O), o1oIOiI11o0, o1oiilO);
                    }
                }

                public static O1oIOiI11o0 I000OiO(long j, String str) {
/* 113 */           O1oIOiI11o0 o1oIOiI11o0 = new O1oIOiI11o0(str, "Imported SD GGUF model", IOOi1I.I000OiO(new OIOOoO1O1oO(new IOllO1I("sd_steps", "Steps"), 1.0f, 50.0f, 20.0f, ValueType.INT, false), new OIOOoO1O1oO(new IOllO1I("sd_cfg", "CFG Scale"), 1.0f, 20.0f, 7.5f, ValueType.FLOAT, false)), null, null, null, "", j, "__sd_imports/".concat(str), null, null, false, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 0, null, null, -787342, 2043);
/* 116 */           o1oIOiI11o0.I0000Il00O();
/* 332 */           return o1oIOiI11o0;
                }

                public static O1oIOiI11o0 I000iOII(long j, String str) {
/* 62 */            O1oIOiI11o0 o1oIOiI11o0 = new O1oIOiI11o0(str, "Imported TTS model", null, null, null, null, "", j, "__tts_imports/".concat(str), null, null, false, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 0, null, null, -787334, 2043);
/* 65 */            o1oIOiI11o0.I0000Il00O();
/* 106 */           return o1oIOiI11o0;
                }

                public static O1oIOiI11o0 I000l1(long j, String str) {
/* 62 */            O1oIOiI11o0 o1oIOiI11o0 = new O1oIOiI11o0(str, "Imported Whisper model", null, null, null, null, "", j, "__whisper_imports/".concat(str), null, null, false, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 0, null, null, -787334, 2043);
/* 65 */            o1oIOiI11o0.I0000Il00O();
/* 106 */           return o1oIOiI11o0;
                }

                public static O1oIOiI11o0 I000lI(Ioiol1OIol ioiol1OIol) {
/* 5 */             Iool1IOO1o0i iool1IOO1o0iI0010o = ioiol1OIol.I00111O().I0010o();
/* 11 */            ArrayList arrayList = new ArrayList();
/* 14 */            Iterator<E> it = iool1IOO1o0iI0010o.iterator();
/* 22 */            while (it.hasNext()) {
/* 34 */                String string = OlOoOIi0o.I00OIo((String) it.next()).toString();
/* 38 */                Accelerator accelerator = Accelerator.GPU;
/* 48 */                if (!O0000Ioio00.I0000O(string, accelerator.getLabel())) {
/* 51 */                    accelerator = Accelerator.CPU;
/* 61 */                    if (!O0000Ioio00.I0000O(string, accelerator.getLabel())) {
/* 64 */                        accelerator = Accelerator.NPU;
/* 74 */                        if (!O0000Ioio00.I0000O(string, accelerator.getLabel())) {
/* 77 */                            accelerator = null;
                                }
                            }
                        }
/* 78 */                if (accelerator != null) {
/* 80 */                    arrayList.add(accelerator);
                        }
                    }
/* 86 */            ArrayList arrayList2 = new ArrayList(arrayList);
/* 93 */            int iI001IIilI0O = ioiol1OIol.I00111O().I001IIilI0O();
/* 101 */           boolean zI001l0I00 = ioiol1OIol.I00111O().I001l0I00();
/* 109 */           boolean zI001iOo1i0O = ioiol1OIol.I00111O().I001iOo1i0O();
/* 117 */           boolean zI00II0Ol1O0l = ioiol1OIol.I00111O().I00II0Ol1O0l();
/* 125 */           boolean zI001lIiIIo1O = ioiol1OIol.I00111O().I001lIiIIo1O();
/* 133 */           boolean zI001lloI = ioiol1OIol.I00111O().I001lloI();
/* 141 */           boolean zI001lllioOl = ioiol1OIol.I00111O().I001lllioOl();
/* 244 */           O1oIOiI11o0 o1oIOiI11o0 = new O1oIOiI11o0(ioiol1OIol.I0010I0i(), null, new ArrayList(iilooIoO0I.I00000oOI(iI001IIilI0O, Integer.valueOf(iI001IIilI0O), ioiol1OIol.I00111O().I001i1O0Ol(), ioiol1OIol.I00111O().I001i1lo1io(), ioiol1OIol.I00111O().I001IO000(), arrayList2, zI001lloI, zI001lllioOl)), null, null, null, "", ioiol1OIol.I0010o(), IIl001iO0Io.I000o00OoI0I("__imports/", ioiol1OIol.I0010I0i()), null, null, true, null, null, RuntimeType.LITERT_LM, null, false, false, zI001l0I00, zI001iOo1i0O, zI00II0Ol1O0l, zI001lIiIIo1O, zI001lloI, zI001lllioOl, null, null, iI001IIilI0O, arrayList2, null, 1618177142, 2042);
/* 247 */           o1oIOiI11o0.I0000Il00O();
/* 437 */           return o1oIOiI11o0;
                }

                public static final void I00100l0(OOo0l0ii10l oOo0l0ii10l, LinkedHashMap linkedHashMap, long j, OOo0o0oO oOo0o0oO, LinkedHashMap linkedHashMap2, O1ol100o0O o1ol100o0O, O1oIOiI11o0 o1oIOiI11o0) {
                    O1oIo0iI00 o1oIo0iI00;
/* 3 */             if (!oOo0l0ii10l.I00iOIl) {
/* 100 */               o1oIo0iI00 = new O1oIo0iI00(ModelDownloadStatusType.IN_PROGRESS, j, IOOi0Ool1i.I00OloOo(linkedHashMap2.values()) + oOo0o0oO.I00iOIl, null, 0L, 0L, 56);
                        break;
                    }
/* 5 */             Collection collectionValues = linkedHashMap.values();
/* 13 */            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
/* 25 */                Iterator it = collectionValues.iterator();
/* 33 */                while (it.hasNext()) {
/* 45 */                    if (!((Boolean) it.next()).booleanValue()) {
/* 100 */                       o1oIo0iI00 = new O1oIo0iI00(ModelDownloadStatusType.IN_PROGRESS, j, IOOi0Ool1i.I00OloOo(linkedHashMap2.values()) + oOo0o0oO.I00iOIl, null, 0L, 0L, 56);
                                break;
                            }
                        }
                    }
/* 63 */            o1oIo0iI00 = new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, j, j, null, 0L, 0L, 56);
/* 105 */           o1ol100o0O.I00Io1lO(o1oIOiI11o0, o1oIo0iI00);
                }

                public static int I001IO000(O1oIOiI11o0 o1oIOiI11o0, String str) throws IOException {
                    try {
/* 14 */                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(o1oIOiI11o0.I000O01llI0).openConnection();
/* 16 */                if (str != null) {
/* 24 */                    httpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(str));
                        }
/* 27 */                httpURLConnection.connect();
/* 30 */                return httpURLConnection.getResponseCode();
                    } catch (Exception e) {
/* 42 */                Log.e("AGModelManagerViewModel", String.valueOf(e));
/* 45 */                return -1;
                    }
                }

                public static void I001lIiIIo1O(O1ol100o0O o1ol100o0O, Context context, OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, II1lI0iOIoI iI1lI0iOIoI, int i) {
                    IllOOo00lI o0o0Ol0 = iI1lI0iOIoI;
/* 3 */             if ((i & 16) != 0) {
/* 9 */                 o0o0Ol0 = new O0o0Ol0(29);
                    }
/* 13 */            o1ol100o0O.getClass();
/* 35 */            iOi1II01i0.I0000O(OooiooIOO.I00000oIO(o1ol100o0O), IiiIil1lOIO.I00000oIO, null, new O1ol0l(false, o1ol100o0O, o1oIOiI11o0, o0o0Ol0, context, oloIl1l1oOii, null), 2);
                }

                @Override
                public final void I0000O() {
/* 1 */             I1ii1l10IO i1ii1l10IO = this.I000OiO;
/* 5 */             if (i1ii1l10IO.I00000oIO) {
/* 7 */                 return;
                    }
/* 10 */            iOliil ioliil = (iOliil) i1ii1l10IO.I0000Il00O;
                    synchronized (ioliil) {
                        try {
/* 17 */                    if (((Ii0io10) ioliil.I00ilI0I1) != null) {
/* 29 */                        Context context = (Context) ((WeakReference) ioliil.I00iiI).get();
/* 31 */                        if (context != null) {
/* 37 */                            context.unbindService((Ii0io10) ioliil.I00ilI0I1);
                                }
/* 48 */                        ((AtomicReference) ioliil.I00iiO).set(null);
/* 56 */                        O1I1OO.I0001Ioi1lo("CustomTabsService is disconnected", new Object[0]);
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
/* 61 */            i1ii1l10IO.I00000oIO = true;
                }

                public final void I0000oI00(long j, String str) {
                    Object value;
/* 3 */             OOli1O oOli1O = this.I000OOo1O;
/* 5 */             O1oIOiI11o0 o1oIOiI11o0I000iOII = I000iOII(j, str);
/* 9 */             String str2 = o1oIOiI11o0I000iOII.I00000oIO;
/* 25 */            OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) IOOi0Ool1i.I00II0Ol1O0l(I001i1lo1io(Collections.singleton("tts")));
/* 27 */            if (oloIl1l1oOii == null) {
/* 332 */               return;
                    }
/* 31 */            ArrayList arrayList = oloIl1l1oOii.I000OiO;
/* 33 */            Iterator it = arrayList.iterator();
/* 37 */            int i = 0;
                    while (true) {
/* 42 */                if (!it.hasNext()) {
/* 66 */                    i = -1;
                            break;
                        }
/* 48 */                O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) it.next();
/* 56 */                if (O0000Ioio00.I0000O(o1oIOiI11o0.I00000oIO, str2) && o1oIOiI11o0.I00IOO) {
                            break;
                        } else {
/* 63 */                    i++;
                        }
                    }
/* 67 */            if (i >= 0) {
/* 69 */                arrayList.remove(i);
                    }
/* 72 */            arrayList.add(o1oIOiI11o0I000iOII);
/* 75 */            o1oIOiI11o0I000iOII.I0000Il00O();
/* 88 */            oloIl1l1oOii.I0010o.setValue(Long.valueOf(System.currentTimeMillis()));
/* 103 */           LinkedHashMap linkedHashMap = new LinkedHashMap(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I0000Il00O);
/* 118 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I0000O);
/* 139 */           linkedHashMap.put(str2, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, j, j, null, 0L, 0L, 56));
/* 149 */           linkedHashMap2.put(str2, new O1oOil(O1oOl0.I00iOIl));
/* 152 */           OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 217 */           do {
/* 154 */               value = olO0OIIl1.getValue();
/* 217 */           } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) oOli1O.I00iOIl.getValue(), IOOi0Ool1i.I00iIi0i1o(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I00000oIO), null, linkedHashMap, linkedHashMap2, false, null, null, null, 0L, System.currentTimeMillis(), null, 0.0f, null, null, false, 32242)));
                }

                public final void I0001Ioi1lo(long j, String str) {
                    Object value;
/* 3 */             OOli1O oOli1O = this.I000OOo1O;
/* 5 */             O1oIOiI11o0 o1oIOiI11o0I000l1 = I000l1(j, str);
/* 9 */             String str2 = o1oIOiI11o0I000l1.I00000oIO;
/* 25 */            OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) IOOi0Ool1i.I00II0Ol1O0l(I001i1lo1io(Collections.singleton("whisper")));
/* 27 */            if (oloIl1l1oOii == null) {
/* 332 */               return;
                    }
/* 31 */            ArrayList arrayList = oloIl1l1oOii.I000OiO;
/* 33 */            Iterator it = arrayList.iterator();
/* 37 */            int i = 0;
                    while (true) {
/* 42 */                if (!it.hasNext()) {
/* 66 */                    i = -1;
                            break;
                        }
/* 48 */                O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) it.next();
/* 56 */                if (O0000Ioio00.I0000O(o1oIOiI11o0.I00000oIO, str2) && o1oIOiI11o0.I00IOO) {
                            break;
                        } else {
/* 63 */                    i++;
                        }
                    }
/* 67 */            if (i >= 0) {
/* 69 */                arrayList.remove(i);
                    }
/* 72 */            arrayList.add(o1oIOiI11o0I000l1);
/* 75 */            o1oIOiI11o0I000l1.I0000Il00O();
/* 88 */            oloIl1l1oOii.I0010o.setValue(Long.valueOf(System.currentTimeMillis()));
/* 103 */           LinkedHashMap linkedHashMap = new LinkedHashMap(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I0000Il00O);
/* 118 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I0000O);
/* 139 */           linkedHashMap.put(str2, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, j, j, null, 0L, 0L, 56));
/* 149 */           linkedHashMap2.put(str2, new O1oOil(O1oOl0.I00iOIl));
/* 152 */           OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 217 */           do {
/* 154 */               value = olO0OIIl1.getValue();
/* 217 */           } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) oOli1O.I00iOIl.getValue(), IOOi0Ool1i.I00iIi0i1o(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I00000oIO), null, linkedHashMap, linkedHashMap2, false, null, null, null, 0L, System.currentTimeMillis(), null, 0.0f, null, null, false, 32242)));
                }

                public final void I000II(String str) {
                    Object value;
/* 5 */             OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 7 */             OOli1O oOli1O = this.I000OOo1O;
/* 23 */            if (((O1oiOloOo) oOli1O.I00iOIl.getValue()).I000O01llI0.indexOf(str) >= 0) {
/* 134 */               I00IO1oi11O(str);
/* 168 */               return;
                    }
/* 39 */            ArrayList arrayList = new ArrayList(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I000O01llI0);
/* 43 */            arrayList.add(0, str);
/* 52 */            if (arrayList.size() > 50) {
/* 60 */                arrayList.remove(arrayList.size() - 1);
                    }
/* 108 */           do {
/* 63 */                value = olO0OIIl1.getValue();
/* 108 */           } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) olO0OIIl1.getValue(), null, null, null, null, false, null, null, arrayList, 0L, 0L, null, 0.0f, null, null, false, 32639)));
/* 110 */           Ii1liIllli0 ii1liIllli0 = this.I0000Il00O;
/* 118 */           List list = ((O1oiOloOo) olO0OIIl1.getValue()).I000O01llI0;
/* 120 */           ii1liIllli0.getClass();
/* 130 */           iOi1IOoIO0l.I00000oOI(new Ii1O001loIoO(ii1liIllli0, list, null, 6));
                }

                public final void I000OOo1O(Collection collection) throws IOException {
                    File[] fileArrListFiles;
/* 1 */             File file = this.I000II;
/* 3 */             if (file == null) {
/* 437 */               return;
                    }
/* 9 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 12 */            Iterator it = collection.iterator();
/* 20 */            while (it.hasNext()) {
/* 26 */                O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) it.next();
/* 28 */                boolean z = o1oIOiI11o0.I00IOO;
/* 30 */                String str = o1oIOiI11o0.I00IioO0OiOi;
/* 32 */                if (!z && o1oIOiI11o0.I0010I0i.length() <= 0 && o1oIOiI11o0.I00100o1O0lo.length() <= 0 && !OlOoOIi0o.I001l0I00(str)) {
/* 58 */                    Object linkedHashSet = linkedHashMap.get(str);
/* 62 */                    if (linkedHashSet == null) {
/* 66 */                        linkedHashSet = new LinkedHashSet();
/* 69 */                        linkedHashMap.put(str, linkedHashSet);
                            }
/* 76 */                    ((Set) linkedHashSet).add(o1oIOiI11o0.I000iOII);
                        }
                    }
/* 84 */            if (linkedHashMap.isEmpty()) {
/* 437 */               return;
                    }
/* 100 */           for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 112 */               String str2 = (String) entry.getKey();
/* 118 */               Set set = (Set) entry.getValue();
/* 122 */               File file2 = new File(file, str2);
/* 129 */               if (file2.isDirectory() && (fileArrListFiles = file2.listFiles()) != null) {
/* 140 */                   for (File file3 : fileArrListFiles) {
/* 148 */                       if (file3.isDirectory() && !set.contains(file3.getName())) {
/* 177 */                           Iterator it2 = OilO1oiooiII.I0001Ioi1lo(IlIl10.I000l1(file3, IlIl0l1lO.I00iiI), new O1o0i0Ol0Oo0(10)).iterator();
                                    while (true) {
/* 182 */                               IlIloII10O ilIloII10O = (IlIloII10O) it2;
/* 188 */                               if (!ilIloII10O.hasNext()) {
                                            break;
                                        } else {
/* 196 */                                   ((File) ilIloII10O.next()).length();
                                        }
                                    }
/* 200 */                           file3.getName();
/* 212 */                           IOOi0Ool1i.I00IlilI0i0i(set, null, null, null, null, 63);
/* 215 */                           IlIl10.I0000O(file3);
                                }
                            }
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:215:0x03d2, code lost:
                
                    r13 = ((p000.O1oIOoi0oo) r14).I0000O;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:216:0x03da, code lost:
                
                    if (r11.exists() == false) goto L540;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:218:0x03e2, code lost:
                
                    if (r11.length() == r13) goto L535;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:221:0x03e9, code lost:
                
                    if (r12.exists() == false) goto L537;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:223:0x03f1, code lost:
                
                    if (r12.length() == r13) goto L541;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:227:0x03f6, code lost:
                
                    r5 = r12.getParentFile();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:228:0x03fa, code lost:
                
                    if (r5 == null) goto L230;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:229:0x03fc, code lost:
                
                    r5.mkdirs();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:230:0x03ff, code lost:
                
                    r12.delete();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:231:0x0402, code lost:
                
                    java.nio.file.Files.createLink(r12.toPath(), r11.toPath());
                 */
                /* JADX WARN: Code restructure failed: missing block: B:233:0x040e, code lost:
                
                    p000.IlIl10.I0000Il00O(r11, r12);
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final O1oiOloOo I000o00OoI0I() {
                    ArrayList arrayList;
                    ArrayList arrayList2;
                    ArrayList arrayList3;
                    OloIl1l1oOii oloIl1l1oOii;
                    ArrayList arrayList4;
                    OloIl1l1oOii oloIl1l1oOii2;
                    ArrayList arrayList5;
                    OloIl1l1oOii oloIl1l1oOii3;
                    ArrayList arrayList6;
                    ArrayList arrayList7;
                    ArrayList arrayList8;
                    ArrayList arrayList9;
                    boolean z;
                    ModelDownloadStatusType modelDownloadStatusType;
                    long j;
                    long jI0010o;
                    O1oIo0iI00 o1oIo0iI00;
                    File externalFilesDir;
                    InputStream inputStreamOpen;
                    FileOutputStream fileOutputStream;
/* 3 */             Ioio0O ioio0O = this.I0000oI00;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I0000Il00O;
/* 7 */             File file = this.I000II;
/* 9 */             Context context = this.I0001Ioi1lo;
/* 23 */            for (O1oIOiI11o0 o1oIOiI11o0 : Ool0OlIiiOol.I00000oIO) {
                        try {
/* 40 */                    File file2 = new File(o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO));
/* 47 */                    if (!file2.exists() || file2.length() != o1oIOiI11o0.I000OOo1O) {
/* 62 */                        File parentFile = file2.getParentFile();
/* 66 */                        if (parentFile != null) {
/* 68 */                            parentFile.mkdirs();
                                }
/* 94 */                        inputStreamOpen = context.getAssets().open("upscale_models/" + o1oIOiI11o0.I000OiO);
                                try {
/* 100 */                           fileOutputStream = new FileOutputStream(file2);
                                    try {
/* 103 */                               iOiOlIoI.I00000oIO(inputStreamOpen, fileOutputStream);
/* 106 */                               fileOutputStream.close();
/* 109 */                               inputStreamOpen.close();
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                        } catch (Throwable th) {
/* 146 */                   Log.e("UpscaleBundledModels", "Failed to seed " + o1oIOiI11o0.I000OiO, th);
                        }
                    }
/* 153 */           Iterator it = IlI00lioIi.I00000oIO.iterator();
                    while (true) {
/* 161 */               long j2 = 0;
/* 163 */               if (!it.hasNext()) {
/* 299 */                   for (O1oIOiI11o0 o1oIOiI11o02 : O1o1O1l0.I00000oIO) {
                                try {
/* 316 */                           File file3 = new File(o1oIOiI11o02.I00000oOI(context, o1oIOiI11o02.I000OiO));
/* 323 */                           if (!file3.exists() || file3.length() != o1oIOiI11o02.I000OOo1O) {
/* 338 */                               File parentFile2 = file3.getParentFile();
/* 342 */                               if (parentFile2 != null) {
/* 344 */                                   parentFile2.mkdirs();
                                        }
/* 370 */                               inputStreamOpen = context.getAssets().open("mobilenet_models/" + o1oIOiI11o02.I000OiO);
                                        try {
/* 376 */                                   fileOutputStream = new FileOutputStream(file3);
                                            try {
/* 379 */                                       iOiOlIoI.I00000oIO(inputStreamOpen, fileOutputStream);
/* 382 */                                       fileOutputStream.close();
/* 385 */                                       inputStreamOpen.close();
                                            } finally {
                                                try {
/* 394 */                                           throw th;
                                                } finally {
                                                }
                                            }
                                        } finally {
                                            try {
/* 400 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
/* 422 */                           Log.e("MobileNetBundledModels", "Failed to seed " + o1oIOiI11o02.I000OiO, th2);
                                }
                            }
/* 437 */                   for (O1oIOiI11o0 o1oIOiI11o03 : OO1I1IIio10o.I00000oIO) {
                                try {
/* 454 */                           File file4 = new File(o1oIOiI11o03.I00000oOI(context, o1oIOiI11o03.I000OiO));
/* 461 */                           if (!file4.exists() || file4.length() != o1oIOiI11o03.I000OOo1O) {
/* 476 */                               File parentFile3 = file4.getParentFile();
/* 480 */                               if (parentFile3 != null) {
/* 482 */                                   parentFile3.mkdirs();
                                        }
/* 508 */                               inputStreamOpen = context.getAssets().open("plantrecognise_models/" + o1oIOiI11o03.I000OiO);
                                        try {
/* 514 */                                   fileOutputStream = new FileOutputStream(file4);
                                            try {
/* 517 */                                       iOiOlIoI.I00000oIO(inputStreamOpen, fileOutputStream);
/* 520 */                                       fileOutputStream.close();
/* 523 */                                       inputStreamOpen.close();
                                            } finally {
                                                try {
/* 532 */                                           throw th;
                                                } finally {
                                                }
                                            }
                                        } finally {
                                            try {
/* 538 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
/* 560 */                           Log.e("PlantRecogniseBundledModels", "Failed to seed " + o1oIOiI11o03.I000OiO, th3);
                                }
                            }
/* 575 */                   for (O1oIOiI11o0 o1oIOiI11o04 : IiilII1liol.I00000oIO) {
                                try {
/* 592 */                           File file5 = new File(o1oIOiI11o04.I00000oOI(context, o1oIOiI11o04.I000OiO));
/* 599 */                           if (!file5.exists() || file5.length() != o1oIOiI11o04.I000OOo1O) {
/* 614 */                               File parentFile4 = file5.getParentFile();
/* 618 */                               if (parentFile4 != null) {
/* 620 */                                   parentFile4.mkdirs();
                                        }
/* 646 */                               inputStreamOpen = context.getAssets().open("dmcount_models/" + o1oIOiI11o04.I000OiO);
                                        try {
/* 652 */                                   fileOutputStream = new FileOutputStream(file5);
                                            try {
/* 655 */                                       iOiOlIoI.I00000oIO(inputStreamOpen, fileOutputStream);
/* 658 */                                       fileOutputStream.close();
/* 661 */                                       inputStreamOpen.close();
                                            } finally {
                                                try {
/* 670 */                                           throw th;
                                                } finally {
                                                }
                                            }
                                        } finally {
                                            try {
/* 676 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th4) {
/* 698 */                           Log.e("DmCountBundledModels", "Failed to seed " + o1oIOiI11o04.I000OiO, th4);
                                }
                            }
/* 713 */                   for (O1oIOiI11o0 o1oIOiI11o05 : O1lo00oO01.I00000oIO) {
                                try {
/* 730 */                           File file6 = new File(o1oIOiI11o05.I00000oOI(context, o1oIOiI11o05.I000OiO));
/* 737 */                           if (!file6.exists() || file6.length() != o1oIOiI11o05.I000OOo1O) {
/* 752 */                               File parentFile5 = file6.getParentFile();
/* 756 */                               if (parentFile5 != null) {
/* 758 */                                   parentFile5.mkdirs();
                                        }
/* 784 */                               inputStreamOpen = context.getAssets().open("migan_models/" + o1oIOiI11o05.I000OiO);
                                        try {
/* 790 */                                   fileOutputStream = new FileOutputStream(file6);
                                            try {
/* 793 */                                       iOiOlIoI.I00000oIO(inputStreamOpen, fileOutputStream);
/* 796 */                                       fileOutputStream.close();
/* 799 */                                       inputStreamOpen.close();
                                            } finally {
                                                try {
/* 808 */                                           throw th;
                                                } finally {
                                                }
                                            }
                                        } finally {
                                            try {
/* 814 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    }
                                } catch (Throwable th5) {
/* 836 */                           Log.e("MiGanBundledModels", "Failed to seed " + o1oIOiI11o05.I000OiO, th5);
                                }
                            }
/* 841 */                   List list = i0I00oIlii.I00000oIO;
                            try {
/* 846 */                       externalFilesDir = context.getExternalFilesDir(null);
                            } catch (Throwable th6) {
/* 1055 */                      Log.e("ZImageSharedFiles", "ensure failed", th6);
                            }
/* 850 */                   if (externalFilesDir != null) {
/* 856 */                       O1oIOiI11o0 o1oIOiI11o06 = Ili00l1oO1l.I00000oIO;
/* 880 */                       File file7 = new File(externalFilesDir, o1oIOiI11o06.I00IioO0OiOi + "/" + o1oIOiI11o06.I000iOII);
/* 885 */                       O1oIOiI11o0 o1oIOiI11o07 = i0I00oIl.I00000oIO;
/* 909 */                       File file8 = new File(externalFilesDir, o1oIOiI11o07.I00IioO0OiOi + "/" + o1oIOiI11o07.I000iOII);
/* 916 */                       if (file7.exists()) {
/* 930 */                           for (String str : i0I00oIlii.I00000oIO) {
/* 940 */                               File file9 = new File(file7, str);
/* 945 */                               File file10 = new File(file8, str);
/* 954 */                               Iterator it2 = i0I00oIl.I00000oIO.I000l1.iterator();
                                        while (true) {
/* 962 */                                   if (!it2.hasNext()) {
/* 1050 */                                      throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                            }
/* 964 */                                   Object next = it2.next();
/* 977 */                                   if (((O1oIOoi0oo) next).I0000Il00O.equals(str)) {
                                                break;
                                            }
/* 1055 */                                  Log.e("ZImageSharedFiles", "ensure failed", th6);
                                        }
                                    }
                                }
                            }
/* 1060 */                  LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 1065 */                  LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 1070 */                  LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 1075 */                  LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 1082 */                  Iterator it3 = IOOi0Ool1i.I00iIi0i1o(ioio0O).iterator();
                            while (true) {
/* 1090 */                      int i = 10;
/* 1092 */                      if (!it3.hasNext()) {
                                    break;
                                }
/* 1100 */                      OloIl1l1oOii oloIl1l1oOiiI00000oOI = ((Ii0ioo10iO0) it3.next()).I00000oOI();
/* 1104 */                      long j3 = j2;
/* 1108 */                      linkedHashMap3.put(oloIl1l1oOiiI00000oOI.I00000oIO, oloIl1l1oOiiI00000oOI);
/* 1113 */                      Iterator it4 = oloIl1l1oOiiI00000oOI.I000OiO.iterator();
/* 1121 */                      while (it4.hasNext()) {
/* 1127 */                          O1oIOiI11o0 o1oIOiI11o08 = (O1oIOiI11o0) it4.next();
/* 1129 */                          String str2 = o1oIOiI11o08.I00000oIO;
/* 1135 */                          if (!linkedHashSet.contains(str2)) {
/* 1138 */                              String str3 = o1oIOiI11o08.I000OiO;
/* 1140 */                              Iterator it5 = it3;
/* 1153 */                              List listSingletonList = Collections.singletonList(new OIoi0IIoi(str3, Long.valueOf(o1oIOiI11o08.I000OOo1O)));
/* 1159 */                              List list2 = o1oIOiI11o08.I000l1;
/* 1165 */                              Ioio0O ioio0O2 = ioio0O;
/* 1171 */                              ArrayList arrayList10 = new ArrayList(IOOi1I.I0000O(list2, i));
/* 1174 */                              Iterator it6 = list2.iterator();
/* 1182 */                              while (it6.hasNext()) {
/* 1190 */                                  O1oIOoi0oo o1oIOoi0oo = (O1oIOoi0oo) it6.next();
/* 1211 */                                  arrayList10.add(new OIoi0IIoi(o1oIOoi0oo.I0000Il00O, Long.valueOf(o1oIOoi0oo.I0000O)));
/* 1214 */                                  it6 = it6;
/* 1216 */                                  ii1liIllli0 = ii1liIllli0;
/* 1218 */                                  file = file;
                                        }
/* 1223 */                              Ii1liIllli0 ii1liIllli02 = ii1liIllli0;
/* 1225 */                              File file11 = file;
/* 1231 */                              Iterator it7 = IOOi0Ool1i.I00O10llo(listSingletonList, arrayList10).iterator();
/* 1239 */                              while (it7.hasNext()) {
/* 1245 */                                  OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) it7.next();
/* 1249 */                                  String str4 = (String) oIoi0IIoi.I00iOIl;
/* 1255 */                                  Iterator it8 = it7;
/* 1256 */                                  long jLongValue = ((Number) oIoi0IIoi.I00iiI).longValue();
/* 1262 */                                  if (jLongValue > j3) {
/* 1264 */                                      File fileI0010I0i = I0010I0i(o1oIOiI11o08, str4);
/* 1272 */                                      if (fileI0010I0i.exists() && fileI0010I0i.length() >= jLongValue) {
/* 1334 */                                          Log.w("AGModelManagerViewModel", "Deleting stale tmp '" + fileI0010I0i.getName() + "' (" + fileI0010I0i.length() + "B >= expected " + jLongValue + "B)");
/* 1337 */                                          fileI0010I0i.delete();
/* 1340 */                                          linkedHashSet = linkedHashSet;
/* 1341 */                                          it7 = it8;
/* 1343 */                                          it4 = it4;
                                                }
                                            }
/* 1346 */                                  it7 = it8;
                                        }
/* 1348 */                              LinkedHashSet linkedHashSet2 = linkedHashSet;
/* 1349 */                              Iterator it9 = it4;
/* 1357 */                              if (o1oIOiI11o08.I00100o1O0lo.length() > 0) {
/* 1375 */                                  o1oIo0iI00 = new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, 0L, 0L, null, 0L, 0L, 56);
                                        } else {
/* 1382 */                                  ModelDownloadStatusType modelDownloadStatusType2 = ModelDownloadStatusType.NOT_DOWNLOADED;
/* 1388 */                                  if (I001lloI(o1oIOiI11o08)) {
/* 1390 */                                      modelDownloadStatusType = ModelDownloadStatusType.PARTIALLY_DOWNLOADED;
/* 1392 */                                      jI0010o = I0010o(o1oIOiI11o08);
/* 1396 */                                      j = o1oIOiI11o08.I00IoiI;
                                            } else {
/* 1406 */                                      String str5 = o1oIOiI11o08.I00IioO0OiOi;
/* 1408 */                                      String str6 = o1oIOiI11o08.I0010I0i;
/* 1410 */                                      String str7 = o1oIOiI11o08.I000iOII;
/* 1475 */                                      boolean z2 = str3.length() > 0 && ((str6.length() == 0 && I001lllioOl(IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(str5, str7, str3), File.separator, null, null, null, 62))) || (str6.length() > 0 && new File(str6).exists()));
/* 1478 */                                      if ((list2 instanceof Collection) && list2.isEmpty()) {
/* 1489 */                                          z = true;
/* 1542 */                                          if (z2) {
/* 1547 */                                              modelDownloadStatusType2 = ModelDownloadStatusType.SUCCEEDED;
                                                    }
/* 1549 */                                          modelDownloadStatusType = modelDownloadStatusType2;
/* 1551 */                                          j = j3;
/* 1553 */                                          jI0010o = j;
                                                } else {
/* 1491 */                                          Iterator it10 = list2.iterator();
/* 1499 */                                          while (it10.hasNext()) {
/* 1539 */                                              if (!I001lllioOl(IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(str5, str7, ((O1oIOoi0oo) it10.next()).I0000Il00O), File.separator, null, null, null, 62))) {
/* 1541 */                                                  z = false;
                                                            break;
                                                        }
                                                    }
/* 1489 */                                          z = true;
/* 1542 */                                          if (z2 && z) {
/* 1547 */                                              modelDownloadStatusType2 = ModelDownloadStatusType.SUCCEEDED;
                                                    }
/* 1549 */                                          modelDownloadStatusType = modelDownloadStatusType2;
/* 1551 */                                          j = j3;
/* 1553 */                                          jI0010o = j;
                                                }
                                            }
/* 1565 */                                  o1oIo0iI00 = new O1oIo0iI00(modelDownloadStatusType, j, jI0010o, null, 0L, 0L, 56);
                                        }
/* 1570 */                              linkedHashMap.put(str2, o1oIo0iI00);
/* 1580 */                              linkedHashMap2.put(str2, new O1oOil(O1oOl0.I00iOIl));
/* 1583 */                              linkedHashSet2.add(str2);
/* 1586 */                              linkedHashSet = linkedHashSet2;
/* 1587 */                              it3 = it5;
/* 1589 */                              ioio0O = ioio0O2;
/* 1591 */                              ii1liIllli0 = ii1liIllli02;
/* 1593 */                              file = file11;
/* 1595 */                              it4 = it9;
/* 1598 */                              i = 10;
                                    }
                                }
/* 1602 */                      j2 = j3;
                            }
/* 1606 */                  Ioio0O ioio0O3 = ioio0O;
/* 1610 */                  File file12 = file;
/* 1612 */                  ii1liIllli0.getClass();
/* 1620 */                  Ii1l100 ii1l100 = new Ii1l100(ii1liIllli0, null, 13);
/* 1623 */                  Il00o11 il00o11 = Il00o11.I00iOIl;
/* 1639 */                  for (Ioiol1OIol ioiol1OIol : (List) iOi1IOoIO0l.I00000oIO(il00o11, ii1l100)) {
/* 1647 */                      Objects.toString(ioiol1OIol);
/* 1650 */                      O1oIOiI11o0 o1oIOiI11o0I000lI = I000lI(ioiol1OIol);
/* 1660 */                      OloIl1l1oOii oloIl1l1oOii4 = (OloIl1l1oOii) linkedHashMap3.get("llm_chat");
/* 1662 */                      if (oloIl1l1oOii4 != null && (arrayList9 = oloIl1l1oOii4.I000OiO) != null) {
/* 1668 */                          arrayList9.add(o1oIOiI11o0I000lI);
                                }
/* 1677 */                      OloIl1l1oOii oloIl1l1oOii5 = (OloIl1l1oOii) linkedHashMap3.get("llm_prompt_lab");
/* 1679 */                      if (oloIl1l1oOii5 != null && (arrayList8 = oloIl1l1oOii5.I000OiO) != null) {
/* 1685 */                          arrayList8.add(o1oIOiI11o0I000lI);
                                }
/* 1694 */                      OloIl1l1oOii oloIl1l1oOii6 = (OloIl1l1oOii) linkedHashMap3.get("llm_agent_chat");
/* 1696 */                      if (oloIl1l1oOii6 != null && (arrayList7 = oloIl1l1oOii6.I000OiO) != null) {
/* 1702 */                          arrayList7.add(o1oIOiI11o0I000lI);
                                }
/* 1707 */                      if (o1oIOiI11o0I000lI.I001i1O0Ol && (oloIl1l1oOii3 = (OloIl1l1oOii) linkedHashMap3.get("llm_ask_image")) != null && (arrayList6 = oloIl1l1oOii3.I000OiO) != null) {
/* 1723 */                          arrayList6.add(o1oIOiI11o0I000lI);
                                }
/* 1728 */                      if (o1oIOiI11o0I000lI.I001i1lo1io && (oloIl1l1oOii2 = (OloIl1l1oOii) linkedHashMap3.get("llm_ask_audio")) != null && (arrayList5 = oloIl1l1oOii2.I000OiO) != null) {
/* 1744 */                          arrayList5.add(o1oIOiI11o0I000lI);
                                }
/* 1749 */                      if (o1oIOiI11o0I000lI.I001l0I00 && (oloIl1l1oOii = (OloIl1l1oOii) linkedHashMap3.get("llm_mobile_actions")) != null && (arrayList4 = oloIl1l1oOii.I000OiO) != null) {
/* 1765 */                          arrayList4.add(o1oIOiI11o0I000lI);
                                }
/* 1795 */                      linkedHashMap.put(o1oIOiI11o0I000lI.I00000oIO, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, ioiol1OIol.I0010o(), ioiol1OIol.I0010o(), null, 0L, 0L, 56));
                            }
/* 1806 */                  File file13 = new File(file12, "__sd_imports");
/* 1813 */                  if (file13.exists()) {
/* 1817 */                      final int i2 = 0;
/* 1821 */                      File[] fileArrListFiles = file13.listFiles(new FilenameFilter() {
                                    @Override
                                    public final boolean accept(File file14, String str8) {
                                        switch (i2) {
                                            case 0:
/* 23 */                                        return OlOolloIIOl0.I000II(str8, ".gguf", false);
                                            case 1:
/* 16 */                                        return OlOolloIIOl0.I000II(str8, ".bin", false);
                                            default:
/* 9 */                                         return OlOolloIIOl0.I000II(str8, ".onnx", false);
                                        }
                                    }
                                });
/* 1825 */                      if (fileArrListFiles == null) {
/* 1827 */                          fileArrListFiles = new File[0];
                                }
/* 1831 */                      for (File file14 : fileArrListFiles) {
/* 1843 */                          O1oIOiI11o0 o1oIOiI11o0I000OiO = I000OiO(file14.length(), file14.getName());
/* 1847 */                          String str8 = o1oIOiI11o0I000OiO.I00000oIO;
/* 1855 */                          OloIl1l1oOii oloIl1l1oOii7 = (OloIl1l1oOii) linkedHashMap3.get("image_gen");
/* 1857 */                          if (oloIl1l1oOii7 != null && (arrayList3 = oloIl1l1oOii7.I000OiO) != null) {
/* 1863 */                              arrayList3.add(o1oIOiI11o0I000OiO);
                                    }
/* 1891 */                          linkedHashMap.put(str8, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, file14.length(), file14.length(), null, 0L, 0L, 56));
/* 1901 */                          linkedHashMap2.put(str8, new O1oOil(O1oOl0.I00iOIl));
                                }
                            }
/* 1911 */                  File file15 = new File(file12, "__whisper_imports");
/* 1918 */                  if (file15.exists()) {
/* 1922 */                      final int i3 = 1;
/* 1926 */                      File[] fileArrListFiles2 = file15.listFiles(new FilenameFilter() {
                                    @Override
                                    public final boolean accept(File file142, String str82) {
                                        switch (i3) {
                                            case 0:
/* 23 */                                        return OlOolloIIOl0.I000II(str82, ".gguf", false);
                                            case 1:
/* 16 */                                        return OlOolloIIOl0.I000II(str82, ".bin", false);
                                            default:
/* 9 */                                         return OlOolloIIOl0.I000II(str82, ".onnx", false);
                                        }
                                    }
                                });
/* 1930 */                      if (fileArrListFiles2 == null) {
/* 1933 */                          fileArrListFiles2 = new File[0];
                                }
/* 1937 */                      for (File file16 : fileArrListFiles2) {
/* 1949 */                          O1oIOiI11o0 o1oIOiI11o0I000l1 = I000l1(file16.length(), file16.getName());
/* 1953 */                          String str9 = o1oIOiI11o0I000l1.I00000oIO;
/* 1961 */                          OloIl1l1oOii oloIl1l1oOii8 = (OloIl1l1oOii) linkedHashMap3.get("whisper");
/* 1963 */                          if (oloIl1l1oOii8 != null && (arrayList2 = oloIl1l1oOii8.I000OiO) != null) {
/* 1969 */                              arrayList2.add(o1oIOiI11o0I000l1);
                                    }
/* 1997 */                          linkedHashMap.put(str9, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, file16.length(), file16.length(), null, 0L, 0L, 56));
/* 2007 */                          linkedHashMap2.put(str9, new O1oOil(O1oOl0.I00iOIl));
                                }
                            }
/* 2017 */                  File file17 = new File(file12, "__tts_imports");
/* 2024 */                  if (file17.exists()) {
/* 2028 */                      final int i4 = 2;
/* 2032 */                      File[] fileArrListFiles3 = file17.listFiles(new FilenameFilter() {
                                    @Override
                                    public final boolean accept(File file142, String str82) {
                                        switch (i4) {
                                            case 0:
/* 23 */                                        return OlOolloIIOl0.I000II(str82, ".gguf", false);
                                            case 1:
/* 16 */                                        return OlOolloIIOl0.I000II(str82, ".bin", false);
                                            default:
/* 9 */                                         return OlOolloIIOl0.I000II(str82, ".onnx", false);
                                        }
                                    }
                                });
/* 2037 */                      if (fileArrListFiles3 == null) {
/* 2039 */                          fileArrListFiles3 = new File[0];
                                }
/* 2043 */                      for (File file18 : fileArrListFiles3) {
/* 2055 */                          O1oIOiI11o0 o1oIOiI11o0I000iOII = I000iOII(file18.length(), file18.getName());
/* 2059 */                          String str10 = o1oIOiI11o0I000iOII.I00000oIO;
/* 2067 */                          OloIl1l1oOii oloIl1l1oOii9 = (OloIl1l1oOii) linkedHashMap3.get("tts");
/* 2069 */                          if (oloIl1l1oOii9 != null && (arrayList = oloIl1l1oOii9.I000OiO) != null) {
/* 2075 */                              arrayList.add(o1oIOiI11o0I000iOII);
                                    }
/* 2103 */                          linkedHashMap.put(str10, new O1oIo0iI00(ModelDownloadStatusType.SUCCEEDED, file18.length(), file18.length(), null, 0L, 0L, 56));
/* 2113 */                          linkedHashMap2.put(str10, new O1oOil(O1oOl0.I00iOIl));
                                }
                            }
/* 2132 */                  List list3 = (List) iOi1IOoIO0l.I00000oIO(il00o11, new Ii1l100(ii1liIllli0, null, 14));
/* 2134 */                  list3.toString();
/* 2137 */                  linkedHashMap.toString();
/* 2140 */                  List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(ioio0O3);
/* 2154 */                  ArrayList arrayList11 = new ArrayList(IOOi1I.I0000O(listI00iIi0i1o, 10));
/* 2157 */                  Iterator it11 = listI00iIi0i1o.iterator();
/* 2165 */                  while (it11.hasNext()) {
/* 2177 */                      arrayList11.add(((Ii0ioo10iO0) it11.next()).I00000oOI());
                            }
/* 2189 */                  return new O1oiOloOo(IOOi0Ool1i.I00iIi0i1o(arrayList11), linkedHashMap, linkedHashMap2, list3, 32624);
                        }
/* 170 */               O1oIOiI11o0 o1oIOiI11o09 = (O1oIOiI11o0) it.next();
                        try {
/* 180 */                   File file19 = new File(o1oIOiI11o09.I00000oOI(context, o1oIOiI11o09.I000OiO));
/* 187 */                   if (!file19.exists() || file19.length() <= 0) {
/* 200 */                       File parentFile6 = file19.getParentFile();
/* 204 */                       if (parentFile6 != null) {
/* 206 */                           parentFile6.mkdirs();
                                }
/* 232 */                       inputStreamOpen = context.getAssets().open("facerec_models/" + o1oIOiI11o09.I000OiO);
                                try {
/* 238 */                           fileOutputStream = new FileOutputStream(file19);
                                    try {
/* 241 */                               iOiOlIoI.I00000oIO(inputStreamOpen, fileOutputStream);
/* 244 */                               fileOutputStream.close();
/* 247 */                               inputStreamOpen.close();
                                    } finally {
                                        try {
/* 256 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                } finally {
                                }
                            }
                        } catch (Throwable th7) {
/* 284 */                   Log.e("FaceRecBundledModels", "Failed to seed " + o1oIOiI11o09.I000OiO, th7);
                        }
                    }
                }

                public final void I000oI1ioi(O1oIOiI11o0 o1oIOiI11o0) {
                    Object value;
/* 5 */             Ii1liIllli0 ii1liIllli0 = this.I0000Il00O;
/* 7 */             OOli1O oOli1O = this.I000OOo1O;
/* 9 */             String str = o1oIOiI11o0.I00000oIO;
/* 11 */            boolean z = o1oIOiI11o0.I00IOO;
/* 13 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 14 */            int i = 0;
/* 15 */            if (z) {
/* 17 */                String str2 = o1oIOiI11o0.I000OiO;
/* 19 */                Context context = this.I0001Ioi1lo;
/* 21 */                File externalFilesDir = context.getExternalFilesDir(null);
/* 25 */                if (externalFilesDir != null) {
/* 48 */                    String str3 = context.getExternalFilesDir(null) + File.separator + str2;
/* 56 */                    File file = new File(externalFilesDir, "__imports");
/* 61 */                    O1oiiOO00li o1oiiOO00li = new O1oiiOO00li();
/* 64 */                    o1oiiOO00li.I00000oIO = str3;
/* 66 */                    VarHandle.storeStoreFence();
/* 69 */                    File[] fileArrListFiles = file.listFiles(o1oiiOO00li);
/* 73 */                    if (fileArrListFiles == null) {
/* 75 */                        fileArrListFiles = new File[0];
                            }
/* 79 */                    for (File file2 : fileArrListFiles) {
/* 83 */                        file2.getName();
/* 86 */                        file2.delete();
                            }
                        }
                    } else {
/* 92 */                String str4 = o1oIOiI11o0.I00IioO0OiOi;
/* 98 */                if (I001lllioOl(str4)) {
/* 107 */                   IlIl10.I0000O(new File(this.I000II, str4));
                        }
                    }
/* 122 */           LinkedHashMap linkedHashMap = new LinkedHashMap(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I0000Il00O);
/* 144 */           linkedHashMap.put(str, new O1oIo0iI00(ModelDownloadStatusType.NOT_DOWNLOADED, 0L, 0L, null, 0L, 0L, 62));
/* 147 */           if (z) {
/* 167 */               for (OloIl1l1oOii oloIl1l1oOii : ((O1oiOloOo) oOli1O.I00iOIl.getValue()).I00000oIO) {
/* 177 */                   int iIndexOf = oloIl1l1oOii.I000OiO.indexOf(o1oIOiI11o0);
/* 181 */                   if (iIndexOf >= 0) {
/* 185 */                       oloIl1l1oOii.I000OiO.remove(iIndexOf);
                            }
/* 198 */                   oloIl1l1oOii.I0010o.setValue(Long.valueOf(System.currentTimeMillis()));
                        }
/* 202 */               linkedHashMap.remove(str);
/* 205 */               ii1liIllli0.getClass();
/* 227 */               ArrayList arrayList = new ArrayList((List) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, iOoil1iiIilo, 13)));
/* 230 */               Iterator it = arrayList.iterator();
/* 234 */               int i2 = 0;
                        while (true) {
/* 239 */                   if (!it.hasNext()) {
/* 261 */                       i2 = -1;
                                break;
                            } else if (O0000Ioio00.I0000O(((Ioiol1OIol) it.next()).I0010I0i(), str)) {
                                break;
                            } else {
/* 258 */                       i2++;
                            }
                        }
/* 262 */               if (i2 >= 0) {
/* 264 */                   arrayList.remove(i2);
                        }
/* 272 */               iOi1IOoIO0l.I00000oOI(new Ii1lOii(ii1liIllli0, arrayList, iOoil1iiIilo, i));
                    }
/* 326 */           O1oiOloOo o1oiOloOoI00000oIO = O1oiOloOo.I00000oIO((O1oiOloOo) oOli1O.I00iOIl.getValue(), IOOi0Ool1i.I00iIi0i1o(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I00000oIO), null, linkedHashMap, null, false, null, null, null, 0L, System.currentTimeMillis(), null, 0.0f, null, null, false, 32250);
/* 330 */           OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 343 */           do {
/* 332 */               value = olO0OIIl1.getValue();
/* 343 */           } while (!olO0OIIl1.I000iOII(value, o1oiOloOoI00000oIO));
                }

                public final void I00100o1O0lo(OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0) {
                    Object next;
/* 15 */            if (!O0000Ioio00.I0000O(o1oIOiI11o0.I00000oIO, "Box Assist")) {
/* 426 */               I00IoIO0lI(oloIl1l1oOii, o1oIOiI11o0, new IliI1Ii1II(2, this, O1ol100o0O.class, "setDownloadStatus", "setDownloadStatus(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;)V", 0, 5));
/* 900 */               return;
                    }
/* 17 */            OOli1O oOli1O = this.I000OOo1O;
/* 19 */            List list = II1iIoo.I0000Il00O;
/* 25 */            ArrayList arrayList = new ArrayList();
/* 28 */            Iterator it = list.iterator();
                    while (true) {
/* 36 */                OIoi0IIoi oIoi0IIoi = null;
/* 37 */                if (!it.hasNext()) {
                            break;
                        }
/* 43 */                String str = (String) it.next();
/* 55 */                Iterator it2 = ((O1oiOloOo) oOli1O.I00iOIl.getValue()).I00000oIO.iterator();
                        while (true) {
/* 63 */                    if (!it2.hasNext()) {
                                break;
                            }
/* 69 */                    OloIl1l1oOii oloIl1l1oOii2 = (OloIl1l1oOii) it2.next();
/* 73 */                    Iterator it3 = oloIl1l1oOii2.I000OiO.iterator();
                            while (true) {
/* 81 */                        if (!it3.hasNext()) {
/* 99 */                            next = null;
                                    break;
                                } else {
/* 83 */                            next = it3.next();
/* 96 */                            if (O0000Ioio00.I0000O(((O1oIOiI11o0) next).I00000oIO, str)) {
                                        break;
                                    }
                                }
                            }
/* 100 */                   O1oIOiI11o0 o1oIOiI11o02 = (O1oIOiI11o0) next;
/* 102 */                   if (o1oIOiI11o02 != null) {
/* 107 */                       oIoi0IIoi = new OIoi0IIoi(oloIl1l1oOii2, o1oIOiI11o02);
                                break;
                            }
                        }
/* 110 */               if (oIoi0IIoi != null) {
/* 112 */                   arrayList.add(oIoi0IIoi);
                        }
                    }
/* 118 */           ArrayList arrayList2 = new ArrayList();
/* 121 */           Iterator it4 = arrayList.iterator();
/* 129 */           while (it4.hasNext()) {
/* 131 */               Object next2 = it4.next();
/* 158 */               O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) oOli1O.I00iOIl.getValue()).I0000Il00O.get(((O1oIOiI11o0) ((OIoi0IIoi) next2).I00iiI).I00000oIO);
/* 168 */               if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) != ModelDownloadStatusType.SUCCEEDED) {
/* 170 */                   arrayList2.add(next2);
                        }
                    }
/* 178 */           if (arrayList2.isEmpty()) {
/* 194 */               I00IoIO0lI(oloIl1l1oOii, o1oIOiI11o0, new IliI1Ii1II(2, this, O1ol100o0O.class, "setDownloadStatus", "setDownloadStatus(Lcom/google/ai/edge/gallery/data/Model;Lcom/google/ai/edge/gallery/data/ModelDownloadStatus;)V", 0, 4));
/* 197 */               return;
                    }
/* 198 */           long j = o1oIOiI11o0.I000OOo1O;
/* 204 */           Iterator it5 = o1oIOiI11o0.I000l1.iterator();
/* 210 */           long j2 = 0;
/* 215 */           while (it5.hasNext()) {
/* 225 */               j2 += ((O1oIOoi0oo) it5.next()).I0000O;
                    }
/* 227 */           long j3 = j + j2;
/* 228 */           Iterator it6 = arrayList2.iterator();
/* 232 */           long j4 = 0;
/* 237 */           while (it6.hasNext()) {
/* 251 */               j4 += ((O1oIOiI11o0) ((OIoi0IIoi) it6.next()).I00iiI).I00IoiI;
                    }
/* 253 */           long j5 = j4 + j3;
/* 256 */           OOo0o0oO oOo0o0oO = new OOo0o0oO();
/* 261 */           OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 266 */           LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 269 */           Iterator it7 = arrayList2.iterator();
/* 277 */           while (it7.hasNext()) {
/* 295 */               linkedHashMap.put(((O1oIOiI11o0) ((OIoi0IIoi) it7.next()).I00iiI).I00000oIO, 0L);
                    }
/* 301 */           LinkedHashMap linkedHashMap2 = new LinkedHashMap();
/* 304 */           Iterator it8 = arrayList2.iterator();
/* 312 */           while (it8.hasNext()) {
/* 328 */               linkedHashMap2.put(((O1oIOiI11o0) ((OIoi0IIoi) it8.next()).I00iiI).I00000oIO, Boolean.FALSE);
                    }
/* 334 */           O1oil1il o1oil1il = new O1oil1il();
/* 337 */           o1oil1il.I00iOIl = oOo0o0oO;
/* 339 */           o1oil1il.I00iiI = j3;
/* 341 */           o1oil1il.I00iiO = oOo0l0ii10l;
/* 343 */           o1oil1il.I00iio = this;
/* 345 */           o1oil1il.I00ilI0I1 = o1oIOiI11o0;
/* 347 */           o1oil1il.I00ilO0 = linkedHashMap2;
/* 349 */           o1oil1il.I00io1l = j5;
/* 351 */           o1oil1il.I00ioIO = linkedHashMap;
/* 353 */           VarHandle.storeStoreFence();
/* 356 */           I00IoIO0lI(oloIl1l1oOii, o1oIOiI11o0, o1oil1il);
/* 359 */           Iterator it9 = arrayList2.iterator();
/* 367 */           while (it9.hasNext()) {
/* 373 */               OIoi0IIoi oIoi0IIoi2 = (OIoi0IIoi) it9.next();
/* 377 */               OloIl1l1oOii oloIl1l1oOii3 = (OloIl1l1oOii) oIoi0IIoi2.I00iOIl;
/* 381 */               O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) oIoi0IIoi2.I00iiI;
/* 385 */               O1o0iII o1o0iII = new O1o0iII();
/* 388 */               o1o0iII.I00iiI = this;
/* 390 */               o1o0iII.I00iiO = o1oIOiI11o03;
/* 392 */               o1o0iII.I00ilI0I1 = linkedHashMap;
/* 394 */               o1o0iII.I00ilO0 = linkedHashMap2;
/* 396 */               o1o0iII.I00io1l = oOo0l0ii10l;
/* 398 */               o1o0iII.I00iio = j5;
/* 400 */               o1o0iII.I00ioIO = oOo0o0oO;
/* 402 */               o1o0iII.I00l0I0l0lO1 = o1oIOiI11o0;
/* 404 */               VarHandle.storeStoreFence();
/* 407 */               I00IoIO0lI(oloIl1l1oOii3, o1oIOiI11o03, o1o0iII);
                    }
                }

                public final File I0010I0i(O1oIOiI11o0 o1oIOiI11o0, String str) {
/* 42 */            return new File(this.I0001Ioi1lo.getExternalFilesDir(null), IOOi0Ool1i.I00IlilI0i0i(IOOi1I.I000O01llI0(o1oIOiI11o0.I00IioO0OiOi, o1oIOiI11o0.I000iOII, Oi010OO0.I00111O(str, ".gallerytmp")), File.separator, null, null, null, 62));
                }

                public final long I0010o(O1oIOiI11o0 o1oIOiI11o0) {
/* 3 */             List listSingletonList = Collections.singletonList(o1oIOiI11o0.I000OiO);
/* 9 */             List list = o1oIOiI11o0.I000l1;
/* 21 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 24 */            Iterator it = list.iterator();
/* 32 */            while (it.hasNext()) {
/* 42 */                arrayList.add(((O1oIOoi0oo) it.next()).I0000Il00O);
                    }
/* 50 */            Iterator it2 = IOOi0Ool1i.I00O10llo(listSingletonList, arrayList).iterator();
/* 54 */            long length = 0;
/* 60 */            while (it2.hasNext()) {
/* 66 */                String str = (String) it2.next();
/* 68 */                File fileI0010I0i = I0010I0i(o1oIOiI11o0, str);
/* 78 */                File file = new File(fileI0010I0i.getParentFile(), str);
/* 96 */                length += file.exists() ? file.length() : fileI0010I0i.length();
                    }
/* 168 */           return length;
                }

                public final Ii0ioo10iO0 I00111O(String str) {
                    Object next;
/* 9 */             Iterator it = IOOi0Ool1i.I00iIi0i1o(this.I0000oI00).iterator();
                    while (true) {
/* 17 */                if (!it.hasNext()) {
/* 39 */                    next = null;
                            break;
                        }
/* 19 */                next = it.next();
/* 36 */                if (O0000Ioio00.I0000O(((Ii0ioo10iO0) next).I00000oOI().I00000oIO, str)) {
                            break;
                        }
                    }
/* 40 */            return (Ii0ioo10iO0) next;
                }

                public final O1oIOiI11o0 I001IIilI0O(String str) {
/* 13 */            Iterator it = ((O1oiOloOo) this.I000OOo1O.I00iOIl.getValue()).I00000oIO.iterator();
/* 21 */            while (it.hasNext()) {
/* 31 */                Iterator it2 = ((OloIl1l1oOii) it.next()).I000OiO.iterator();
/* 39 */                while (it2.hasNext()) {
/* 45 */                    O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) it2.next();
/* 53 */                    if (O0000Ioio00.I0000O(o1oIOiI11o0.I00000oIO, str)) {
/* 55 */                        return o1oIOiI11o0;
                            }
                        }
                    }
/* 56 */            return null;
                }

                public final OloIl1l1oOii I001i1O0Ol(String str) {
                    Object next;
/* 15 */            Iterator it = ((O1oiOloOo) this.I000OOo1O.I00iOIl.getValue()).I00000oIO.iterator();
                    while (true) {
/* 23 */                if (!it.hasNext()) {
/* 41 */                    next = null;
                            break;
                        }
/* 25 */                next = it.next();
/* 38 */                if (O0000Ioio00.I0000O(((OloIl1l1oOii) next).I00000oIO, str)) {
                            break;
                        }
                    }
/* 42 */            return (OloIl1l1oOii) next;
                }

                public final ArrayList I001i1lo1io(Set set) {
/* 11 */            List list = ((O1oiOloOo) this.I000OOo1O.I00iOIl.getValue()).I00000oIO;
/* 17 */            ArrayList arrayList = new ArrayList();
/* 28 */            for (Object obj : list) {
/* 43 */                if (set.contains(((OloIl1l1oOii) obj).I00000oIO)) {
/* 45 */                    arrayList.add(obj);
                        }
                    }
/* 77 */            return arrayList;
                }

                public final Oo1O0Ol0ll I001iOo1i0O() {
/* 1 */             Oo1O0IIl oo1O0IIl = Oo1O0IIl.I00iOIl;
/* 3 */             Ii1liIllli0 ii1liIllli0 = this.I0000Il00O;
/* 5 */             ii1liIllli0.getClass();
/* 22 */            I01lO1io10 i01lO1io10 = (I01lO1io10) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, null, 12));
/* 24 */            if (i01lO1io10 != null && i01lO1io10.I0010I0i().length() > 0) {
/* 49 */                if (System.currentTimeMillis() >= i01lO1io10.I00111O() - 300) {
/* 51 */                    oo1O0IIl = Oo1O0IIl.I00iiI;
                        } else {
/* 54 */                    oo1O0IIl = Oo1O0IIl.I00iiO;
/* 60 */                    this.I000iOII = i01lO1io10.I0010I0i();
                        }
                    }
/* 64 */            Oo1O0Ol0ll oo1O0Ol0ll = new Oo1O0Ol0ll();
/* 67 */            oo1O0Ol0ll.I00000oIO = oo1O0IIl;
/* 69 */            oo1O0Ol0ll.I00000oOI = i01lO1io10;
/* 71 */            VarHandle.storeStoreFence();
/* 110 */           return oo1O0Ol0ll;
                }

                public final LinkedHashMap I001l0I00() {
/* 3 */             List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I0000oI00);
/* 17 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00iIi0i1o, 10));
/* 20 */            Iterator it = listI00iIi0i1o.iterator();
/* 28 */            while (it.hasNext()) {
/* 40 */                arrayList.add(((Ii0ioo10iO0) it.next()).I00000oOI());
                    }
/* 48 */            int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(arrayList, 10));
/* 54 */            if (iI00000oIO < 16) {
/* 56 */                iI00000oIO = 16;
                    }
/* 59 */            LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 62 */            Iterator it2 = arrayList.iterator();
/* 70 */            while (it2.hasNext()) {
/* 72 */                Object next = it2.next();
/* 83 */                linkedHashMap.put(((OloIl1l1oOii) next).I0000Il00O.I00000oIO, next);
                    }
/* 97 */            LinkedHashMap linkedHashMap2 = new LinkedHashMap(O1Oii0o0Oi.I00000oIO(linkedHashMap.size()));
/* 114 */           for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 134 */               linkedHashMap2.put(entry.getKey(), ((OloIl1l1oOii) entry.getValue()).I0000Il00O);
                    }
/* 140 */           LinkedHashMap linkedHashMap3 = new LinkedHashMap();
/* 143 */           Iterator it3 = arrayList.iterator();
/* 151 */           while (it3.hasNext()) {
/* 153 */               Object next2 = it3.next();
/* 162 */               String str = ((OloIl1l1oOii) next2).I0000Il00O.I00000oIO;
/* 164 */               Object arrayList2 = linkedHashMap3.get(str);
/* 168 */               if (arrayList2 == null) {
/* 172 */                   arrayList2 = new ArrayList();
/* 175 */                   linkedHashMap3.put(str, arrayList2);
                        }
/* 180 */               ((List) arrayList2).add(next2);
                    }
/* 186 */           LinkedHashMap linkedHashMap4 = new LinkedHashMap();
/* 201 */           for (String str2 : linkedHashMap3.keySet()) {
/* 213 */               Iterable iterable = (Iterable) linkedHashMap3.get(str2);
/* 219 */               I0Iooi0i1l0l i0Iooi0i1l0l = new I0Iooi0i1l0l(8);
/* 222 */               i0Iooi0i1l0l.I00iiI = str2;
/* 224 */               VarHandle.storeStoreFence();
/* 230 */               IOi10O11O iOi10O11O = new IOi10O11O(2);
/* 233 */               iOi10O11O.I00iiI = i0Iooi0i1l0l;
/* 235 */               VarHandle.storeStoreFence();
/* 238 */               List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(iterable, iOi10O11O);
/* 245 */               Iterator it4 = listI00Ol1ll1.iterator();
/* 249 */               int i = 0;
/* 254 */               while (it4.hasNext()) {
/* 264 */                   ((OloIl1l1oOii) it4.next()).I0010I0i = i;
/* 256 */                   i++;
                        }
/* 268 */               linkedHashMap4.put(str2, listI00Ol1ll1);
                    }
/* 743 */           return linkedHashMap4;
                }

                public final boolean I001lllioOl(String str) {
/* 1 */             File file = this.I000II;
/* 3 */             if (file != null) {
/* 10 */                return new File(file, str).exists();
                    }
/* 15 */            return false;
                }

                public final boolean I001lloI(O1oIOiI11o0 o1oIOiI11o0) {
/* 7 */             if (o1oIOiI11o0.I0010I0i.length() > 0) {
/* 71 */                return false;
                    }
/* 20 */            if (I0010I0i(o1oIOiI11o0, o1oIOiI11o0.I000OiO).exists()) {
/* 69 */                return true;
                    }
/* 23 */            List list = o1oIOiI11o0.I000l1;
/* 29 */            if ((list instanceof Collection) && list.isEmpty()) {
/* 71 */                return false;
                    }
/* 41 */            Iterator it = list.iterator();
/* 49 */            while (it.hasNext()) {
/* 67 */                if (I0010I0i(o1oIOiI11o0, ((O1oIOoi0oo) it.next()).I0000Il00O).exists()) {
/* 69 */                    return true;
                        }
                    }
/* 71 */            return false;
                }

                public final void I00II0Ol1O0l() {
                    Object value;
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 56 */            do {
/* 5 */                 value = olO0OIIl1.getValue();
/* 56 */            } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) this.I000OOo1O.I00iOIl.getValue(), null, null, null, null, true, "", null, null, 0L, 0L, null, 0.0f, null, null, false, 32719)));
/* 58 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 62 */            IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 74 */            iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new O1oio1O(this, null, 1), 2);
                }

                public final void I00II0oii1o() {
/* 1 */             Ii1lo00I1 ii1lo00I1 = this.I00000oOI;
/* 6 */             Io1o0l0iOl io1o0l0iOl = new Io1o0l0iOl(6);
/* 9 */             io1o0l0iOl.I00iiI = this;
/* 11 */            VarHandle.storeStoreFence();
/* 14 */            i01IlOO i01iloo = ii1lo00I1.I0000Il00O;
/* 18 */            O1oO0lOoI1 o1oO0lOoI1 = i01iloo.I00000oOI.I000oI1ioi;
/* 26 */            OilOol oilOol = (OilOol) ((OillOo0) i01iloo.I0000O).I00iiI;
/* 30 */            int i = 16;
/* 32 */            I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(i);
/* 35 */            i0OIOO00l0O.I00iiI = i01iloo;
/* 37 */            VarHandle.storeStoreFence();
/* 48 */            IIiOiI0il iIiOiI0il = (IIiOiI0il) l1l1IO0Ii.I00000oIO(o1oO0lOoI1, "CancelAllWork", oilOol, i0OIOO00l0O).I00iiI;
/* 52 */            I0100i i0100i = new I0100i(i);
/* 55 */            i0100i.I00iiI = io1o0l0iOl;
/* 57 */            VarHandle.storeStoreFence();
/* 66 */            iIiOiI0il.I00iiI.addListener(i0100i, Executors.newSingleThreadExecutor());
                }

                /* JADX WARN: Removed duplicated region for block: B:69:0x013e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00IO1() {
                    O1oIOiI11o0 o1oIOiI11o0;
                    O1oIOiI11o0 o1oIOiI11o02;
                    boolean z;
                    Object next;
                    Object next2;
/* 5 */             List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(this.I0000oI00);
/* 19 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00iIi0i1o, 10));
/* 22 */            Iterator it = listI00iIi0i1o.iterator();
/* 30 */            while (it.hasNext()) {
/* 42 */                arrayList.add(((Ii0ioo10iO0) it.next()).I00000oOI());
                    }
/* 46 */            Iterator it2 = arrayList.iterator();
                    while (true) {
/* 55 */                Object obj = null;
/* 56 */                if (!it2.hasNext()) {
                            break;
                        }
/* 62 */                OloIl1l1oOii oloIl1l1oOii = (OloIl1l1oOii) it2.next();
/* 64 */                ArrayList arrayList2 = oloIl1l1oOii.I000OiO;
/* 66 */                Iterator it3 = arrayList2.iterator();
/* 74 */                while (it3.hasNext()) {
/* 82 */                    ((O1oIOiI11o0) it3.next()).I0000Il00O();
                        }
/* 86 */                Iterator it4 = arrayList2.iterator();
                        while (true) {
/* 94 */                    if (!it4.hasNext()) {
                                break;
                            }
/* 96 */                    Object next3 = it4.next();
/* 111 */                   if (((O1oIOiI11o0) next3).I0001Ioi1lo.contains(oloIl1l1oOii.I00000oIO)) {
/* 113 */                       obj = next3;
                                break;
                            }
                        }
/* 114 */               O1oIOiI11o0 o1oIOiI11o03 = (O1oIOiI11o0) obj;
/* 116 */               if (o1oIOiI11o03 != null) {
/* 118 */                   arrayList2.remove(o1oIOiI11o03);
/* 121 */                   arrayList2.add(0, o1oIOiI11o03);
                        }
                    }
/* 125 */           Iterator it5 = arrayList.iterator();
                    while (true) {
/* 133 */               if (!it5.hasNext()) {
/* 177 */                   o1oIOiI11o0 = null;
                            break;
                        }
/* 143 */               Iterator it6 = ((OloIl1l1oOii) it5.next()).I000OiO.iterator();
                        while (true) {
/* 151 */                   if (it6.hasNext()) {
/* 153 */                       next2 = it6.next();
/* 168 */                       if (O0000Ioio00.I0000O(((O1oIOiI11o0) next2).I00000oIO, "Box Assist")) {
                                    break;
                                }
                            } else {
/* 171 */                       next2 = null;
                                break;
                            }
                        }
/* 172 */               o1oIOiI11o0 = (O1oIOiI11o0) next2;
/* 174 */               if (o1oIOiI11o0 != null) {
                            break;
                        }
                    }
/* 178 */           if (o1oIOiI11o0 == null) {
/* 180 */               return;
                    }
/* 181 */           long j = o1oIOiI11o0.I000OOo1O;
/* 187 */           Iterator it7 = o1oIOiI11o0.I000l1.iterator();
/* 193 */           long j2 = 0;
/* 198 */           while (it7.hasNext()) {
/* 208 */               j2 += ((O1oIOoi0oo) it7.next()).I0000O;
                    }
/* 210 */           long j3 = j + j2;
/* 219 */           long j4 = 0;
/* 224 */           for (String str : II1iIoo.I0000Il00O) {
/* 232 */               Iterator it8 = arrayList.iterator();
                        while (true) {
/* 240 */                   if (!it8.hasNext()) {
/* 286 */                       o1oIOiI11o02 = null;
                                break;
                            }
/* 250 */                   Iterator it9 = ((OloIl1l1oOii) it8.next()).I000OiO.iterator();
                            while (true) {
/* 258 */                       if (it9.hasNext()) {
/* 260 */                           next = it9.next();
/* 273 */                           if (O0000Ioio00.I0000O(((O1oIOiI11o0) next).I00000oIO, str)) {
                                        break;
                                    }
                                } else {
/* 278 */                           next = null;
                                    break;
                                }
                            }
/* 279 */                   o1oIOiI11o02 = (O1oIOiI11o0) next;
/* 281 */                   if (o1oIOiI11o02 != null) {
                                break;
                            }
                        }
/* 287 */               if (o1oIOiI11o02 == null) {
/* 319 */                   z = false;
                        } else {
/* 305 */                   O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) this.I000OOo1O.I00iOIl.getValue()).I0000Il00O.get(str);
/* 315 */                   if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) == ModelDownloadStatusType.SUCCEEDED) {
/* 317 */                       z = true;
                            }
                        }
/* 328 */               j4 += (o1oIOiI11o02 == null || z) ? 0L : o1oIOiI11o02.I00IoiI;
                    }
/* 332 */           o1oIOiI11o0.I00IoiI = j3 + j4;
                }

                public final void I00IO1oi11O(String str) {
                    Object value;
/* 5 */             OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 7 */             OOli1O oOli1O = this.I000OOo1O;
/* 19 */            int iIndexOf = ((O1oiOloOo) oOli1O.I00iOIl.getValue()).I000O01llI0.indexOf(str);
/* 23 */            if (iIndexOf >= 0) {
/* 39 */                ArrayList arrayList = new ArrayList(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I000O01llI0);
/* 42 */                arrayList.remove(iIndexOf);
/* 46 */                arrayList.add(0, str);
/* 94 */                do {
/* 49 */                    value = olO0OIIl1.getValue();
/* 94 */                } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) olO0OIIl1.getValue(), null, null, null, null, false, null, null, arrayList, 0L, 0L, null, 0.0f, null, null, false, 32639)));
/* 96 */                Ii1liIllli0 ii1liIllli0 = this.I0000Il00O;
/* 104 */               List list = ((O1oiOloOo) olO0OIIl1.getValue()).I000O01llI0;
/* 106 */               ii1liIllli0.getClass();
/* 116 */               iOi1IOoIO0l.I00000oOI(new Ii1O001loIoO(ii1liIllli0, list, null, 6));
                    }
                }

                public final ModelAllowlist I00IOO() throws IOException {
                    try {
/* 24 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.I0001Ioi1lo.getAssets().open("model_allowlist.json"), IO1IOI.I00000oIO), 8192);
                        try {
/* 27 */                    String strI00000oOI = lOliOoIi.I00000oOI(bufferedReader);
/* 31 */                    bufferedReader.close();
/* 50 */                    return (ModelAllowlist) new OoIlIoo1oiOo().I0000Il00O(strI00000oOI, new OoOilO(ModelAllowlist.class));
                        } finally {
                        }
                    } catch (Exception e) {
/* 65 */                Log.e("AGModelManagerViewModel", "failed to read model allowlist from assets", e);
/* 68 */                return null;
                    }
                }

                public final ModelAllowlist I00IioO0OiOi(String str) {
                    try {
/* 24 */                File file = new File(str.equals("model_allowlist_test.json") ? new File("/data/local/tmp") : this.I000II, str);
/* 31 */                if (file.exists()) {
/* 53 */                    return (ModelAllowlist) new OoIlIoo1oiOo().I0000Il00O(IlIl10.I000OOo1O(file), new OoOilO(ModelAllowlist.class));
                        }
/* 1 */                 return null;
                    } catch (Exception e) {
/* 61 */                Log.e("AGModelManagerViewModel", "failed to read model allowlist from disk", e);
/* 1 */                 return null;
                    }
                }

                public final void I00IlilI0i0i(O1oIOiI11o0 o1oIOiI11o0) {
/* 3 */             OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 15 */            O1oIOiI11o0 o1oIOiI11o02 = o1oIOiI11o0;
/* 23 */            if (O0000Ioio00.I0000O(((O1oiOloOo) olO0OIIl1.getValue()).I000II.I00000oIO, o1oIOiI11o02.I00000oIO)) {
/* 77 */                return;
                    }
                    while (true) {
/* 25 */                Object value = olO0OIIl1.getValue();
/* 68 */                if (olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) olO0OIIl1.getValue(), null, null, null, null, false, null, o1oIOiI11o02, null, 0L, 0L, null, 0.0f, null, null, false, 32703))) {
/* 77 */                    return;
                        } else {
/* 71 */                    o1oIOiI11o02 = o1oIOiI11o0;
                        }
                    }
                }

                public final void I00Io1lO(O1oIOiI11o0 o1oIOiI11o0, O1oIo0iI00 o1oIo0iI00) {
                    Object value;
/* 5 */             OOli1O oOli1O = this.I000OOo1O;
/* 7 */             O1oIo0iI00 o1oIo0iI002 = o1oIo0iI00;
/* 9 */             ModelDownloadStatusType modelDownloadStatusType = o1oIo0iI002.I00000oIO;
/* 11 */            ModelDownloadStatusType modelDownloadStatusType2 = ModelDownloadStatusType.NOT_DOWNLOADED;
/* 13 */            if (modelDownloadStatusType == modelDownloadStatusType2 && I001lloI(o1oIOiI11o0)) {
/* 38 */                o1oIo0iI002 = new O1oIo0iI00(ModelDownloadStatusType.PARTIALLY_DOWNLOADED, o1oIOiI11o0.I00IoiI, I0010o(o1oIOiI11o0), null, 0L, 0L, 56);
                    }
/* 54 */            LinkedHashMap linkedHashMap = new LinkedHashMap(((O1oiOloOo) oOli1O.I00iOIl.getValue()).I0000Il00O);
/* 59 */            linkedHashMap.put(o1oIOiI11o0.I00000oIO, o1oIo0iI002);
/* 94 */            O1oiOloOo o1oiOloOoI00000oIO = O1oiOloOo.I00000oIO((O1oiOloOo) oOli1O.I00iOIl.getValue(), null, null, linkedHashMap, null, false, null, null, null, 0L, 0L, null, 0.0f, null, null, false, 32763);
/* 98 */            ModelDownloadStatusType modelDownloadStatusType3 = o1oIo0iI002.I00000oIO;
/* 102 */           if (modelDownloadStatusType3 == ModelDownloadStatusType.FAILED || modelDownloadStatusType3 == modelDownloadStatusType2) {
/* 106 */               String str = o1oIOiI11o0.I000OiO;
/* 112 */               if (I001lllioOl(str)) {
/* 121 */                   new File(this.I000II, str).delete();
                        }
                    }
/* 124 */           OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 137 */           do {
/* 126 */               value = olO0OIIl1.getValue();
/* 137 */           } while (!olO0OIIl1.I000iOII(value, o1oiOloOoI00000oIO));
                }

                public final void I00Io1o110i(O1oIOiI11o0 o1oIOiI11o0, O1oOil o1oOil) {
                    Set setI0001Ioi1lo;
                    Object value;
/* 7 */             OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 9 */             O1oOl0 o1oOl0 = o1oOil.I00000oIO;
/* 25 */            LinkedHashMap linkedHashMap = new LinkedHashMap(((O1oiOloOo) this.I000OOo1O.I00iOIl.getValue()).I0000O);
/* 28 */            String str = o1oIOiI11o0.I00000oIO;
/* 34 */            if (linkedHashMap.containsKey(str)) {
/* 40 */                O1oOil o1oOil2 = (O1oOil) linkedHashMap.get(str);
/* 42 */                if (o1oOil2 == null || (setI0001Ioi1lo = o1oOil2.I0000Il00O) == null) {
/* 48 */                    setI0001Ioi1lo = Il01llIol0.I00iOIl;
                        }
/* 70 */                String str2 = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", Accelerator.GPU.getLabel()), ValueType.STRING);
/* 74 */                if (o1oOl0 == O1oOl0.I00iiO) {
/* 76 */                    setI0001Ioi1lo = Oio0lI.I0001Ioi1lo(setI0001Ioi1lo, str2);
                        }
/* 87 */                linkedHashMap.put(str, new O1oOil(o1oOl0, o1oOil.I00000oOI, setI0001Ioi1lo));
/* 135 */               do {
/* 90 */                    value = olO0OIIl1.getValue();
/* 135 */               } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO((O1oiOloOo) olO0OIIl1.getValue(), null, null, null, linkedHashMap, false, null, null, null, 0L, 0L, null, 0.0f, null, null, false, 32759)));
                    }
                }

                public final void I00IoIO0lI(OloIl1l1oOii oloIl1l1oOii, O1oIOiI11o0 o1oIOiI11o0, IlliIl1l11O illiIl1l11O) {
/* 25 */            O1oIo0iI00 o1oIo0iI00 = (O1oIo0iI00) ((O1oiOloOo) this.I000OOo1O.I00iOIl.getValue()).I0000Il00O.get(o1oIOiI11o0.I00000oIO);
/* 36 */            if ((o1oIo0iI00 != null ? o1oIo0iI00.I00000oIO : null) != ModelDownloadStatusType.PARTIALLY_DOWNLOADED) {
/* 39 */                o1oIo0iI00 = null;
                    }
/* 68 */            illiIl1l11O.invoke(o1oIOiI11o0, new O1oIo0iI00(ModelDownloadStatusType.IN_PROGRESS, o1oIo0iI00 != null ? o1oIo0iI00.I00000oOI : 0L, o1oIo0iI00 != null ? o1oIo0iI00.I0000Il00O : 0L, null, 0L, 0L, 56));
/* 75 */            if (o1oIOiI11o0.I00100l0 != RuntimeType.AICORE) {
/* 158 */               if (!I001lloI(o1oIOiI11o0)) {
/* 160 */                   I000oI1ioi(o1oIOiI11o0);
                        }
/* 167 */               this.I00000oOI.I00000oIO(oloIl1l1oOii, o1oIOiI11o0, illiIl1l11O);
/* 408 */               return;
                    }
/* 77 */            I001i1O0Ol i001i1O0Ol = I001i1O0Ol.I00000oIO;
/* 79 */            IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(this);
/* 86 */            O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(0);
/* 89 */            o1oiiIIo111o.I00iiI = illiIl1l11O;
/* 91 */            o1oiiIIo111o.I00iiO = o1oIOiI11o0;
/* 93 */            VarHandle.storeStoreFence();
/* 99 */            IO1io1iOI iO1io1iOI = new IO1io1iOI(1);
/* 102 */           iO1io1iOI.I00iiI = illiIl1l11O;
/* 104 */           iO1io1iOI.I00iiO = o1oIOiI11o0;
/* 106 */           VarHandle.storeStoreFence();
/* 112 */           O1lIIi o1lIIi = new O1lIIi(6);
/* 115 */           o1lIIi.I00iiI = illiIl1l11O;
/* 117 */           o1lIIi.I00iiO = o1oIOiI11o0;
/* 119 */           VarHandle.storeStoreFence();
/* 122 */           Generation generation = Generation.INSTANCE;
/* 126 */           I000l1 i000l1 = new I000l1(1);
/* 129 */           i000l1.I00iiI = o1oIOiI11o0;
/* 131 */           VarHandle.storeStoreFence();
/* 150 */           iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, null, null, new I000oI1ioi(generation.getClient(GenerationConfigKt.generationConfig(i000l1)), iO1io1iOI, o1oIOiI11o0, o1lIIi, o1oiiIIo111o, null, 0), 3);
                }

                public final void I00IoO0(O1oIOiI11o0 o1oIOiI11o0, O1oOl0 o1oOl0, String str) {
                    Object value;
                    O1oiOloOo o1oiOloOo;
                    LinkedHashMap linkedHashMap;
                    Set setI0001Ioi1lo;
/* 7 */             OlO0OIIl1 olO0OIIl1 = this.I000O01llI0;
/* 112 */           do {
/* 9 */                 value = olO0OIIl1.getValue();
/* 14 */                o1oiOloOo = (O1oiOloOo) value;
/* 20 */                linkedHashMap = new LinkedHashMap(o1oiOloOo.I0000O);
/* 29 */                O1oOil o1oOil = (O1oOil) linkedHashMap.get(o1oIOiI11o0.I00000oIO);
/* 31 */                if (o1oOil == null || (setI0001Ioi1lo = o1oOil.I0000Il00O) == null) {
/* 37 */                    setI0001Ioi1lo = Il01llIol0.I00iOIl;
                        }
/* 59 */                String str2 = (String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", Accelerator.GPU.getLabel()), ValueType.STRING);
/* 63 */                if (o1oOl0 == O1oOl0.I00iiO) {
/* 65 */                    setI0001Ioi1lo = Oio0lI.I0001Ioi1lo(setI0001Ioi1lo, str2);
                        }
/* 78 */                linkedHashMap.put(o1oIOiI11o0.I00000oIO, new O1oOil(o1oOl0, str, setI0001Ioi1lo));
/* 112 */           } while (!olO0OIIl1.I000iOII(value, O1oiOloOo.I00000oIO(o1oiOloOo, null, null, null, linkedHashMap, false, null, null, null, 0L, 0L, null, 0.0f, null, null, false, 32759)));
                }
            }
