            package com.google.ai.edge.litert.deployment;

            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.ModelProvider;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import p000.I000II;
            import p000.I0iiilOi;
            import p000.I0iilI1i0i;
            import p000.I0iio0;
            import p000.I0il01;
            import p000.I1IoiO1l;
            import p000.I1O11ll000;
            import p000.IIoOo1iIio1l;
            import p000.IIoOoIol0Io0;
            import p000.IOOlIIilOl0;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IllOOo00lI;
            import p000.O0000Ioio00;
            import p000.OIi0011o;
            import p000.OlOilIlol1;
            import p000.OloIo0oOIO0;
            import p000.OoOlO1O0o;
            import p000.OoiIlOl1iI;
            import p000.i0IOo0i0;
            import p000.i0Il00O1;
            import p000.i0Il1olI;
            import p000.i0IlIo00I;
            import p000.i0Ilo11Ii;
            import p000.i0O0lO1il0;
            import p000.i0OO1i1;
            import p000.i0OOI1OOo0;
            import p000.i0OOIO00Ii;
            import p000.i0OOOilo0l0;
            import p000.i0OOOllloIII;
            import p000.i0OOioi1OiOi;
            import p000.i0OiOI1;
            import p000.i1O01oOIoI0I;
            import p000.l00iIoI;
            import p000.lIoii1l01l0i;
            import p000.lOio0o;
            import p000.liIlli0IIoo;
            import p000.liO0o11;
            import p000.o0IiOl;
            
            @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u00020\u0001:\u0001-B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bB5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\f\"\u00020\b¢\u0006\u0004\b\n\u0010\rB5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e¢\u0006\u0004\b\n\u0010\u0010J7\u0010\u0019\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/google/ai/edge/litert/deployment/AiPackModelProvider;", "Lcom/google/ai/edge/litert/ModelProvider;", "Landroid/content/Context;", "context", "", "aiPackName", "modelPath", "", "Lcom/google/ai/edge/litert/Accelerator;", "accelerators", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Lcom/google/ai/edge/litert/Accelerator;)V", "Lkotlin/Function0;", "acceleratorsProvider", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;LIllOOo00lI;)V", "LIIoOo1iIio1l;", "LOoiIlOl1iI;", "continuation", "LI0il01;", "listener", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "unregisterListenerAndResume", "(LIIoOo1iIio1l;LI0il01;Ljava/lang/Exception;)V", "Lcom/google/ai/edge/litert/ModelProvider$Type;", "getType", "()Lcom/google/ai/edge/litert/ModelProvider$Type;", "", "isReady", "()Z", "getPath", "()Ljava/lang/String;", "getCompatibleAccelerators", "()Ljava/util/Set;", "download", "(LIOoil1iiIilo;)Ljava/lang/Object;", "Landroid/content/Context;", "Ljava/lang/String;", "Ljava/util/Set;", "LI0iiilOi;", "aiPackManager", "LI0iiilOi;", "Companion", "third_party.odml.litert.litert.kotlin_litert_kotlin_api"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
/* 60 */    public final class AiPackModelProvider implements ModelProvider {
                private static final String TAG = "AiPackModelProvider";
                private final Set<Accelerator> accelerators;
                private final I0iiilOi aiPackManager;
                private final String aiPackName;
                private final Context context;
                private final String modelPath;

                /* JADX WARN: Multi-variable type inference failed */
                public AiPackModelProvider(Context context, String str, String str2, Set<? extends Accelerator> set) {
                    i0OOOllloIII i0ooollloiii;
                    OoOlO1O0o ooOlO1O0o;
/* 4 */             this.context = context;
/* 6 */             this.aiPackName = str;
/* 8 */             this.modelPath = str2;
/* 10 */            this.accelerators = set;
                    synchronized (I0iilI1i0i.class) {
                        synchronized (I1O11ll000.class) {
/* 30 */                    i0ooollloiii = (i0OOOllloIII) ((i0IOo0i0) i0O0lO1il0.I0000O(context).I00iOIl).I0000Il00O();
                        }
/* 36 */                ooOlO1O0o = new OoOlO1O0o(2);
/* 44 */                ooOlO1O0o.I00iiO = new HashMap();
/* 46 */                ooOlO1O0o.I00iiI = i0ooollloiii;
/* 48 */                VarHandle.storeStoreFence();
                    }
/* 52 */            this.aiPackManager = ooOlO1O0o;
                }

                private final void unregisterListenerAndResume(IIoOo1iIio1l continuation, I0il01 listener, Exception exception) {
/* 5 */             ((OoOlO1O0o) this.aiPackManager).I000II(listener);
/* 8 */             if (exception != null) {
/* 14 */                continuation.resumeWith(lIoii1l01l0i.I00000oIO(exception));
                    } else {
/* 20 */                continuation.resumeWith(OoiIlOl1iI.I00000oIO);
                    }
                }

                public static void unregisterListenerAndResume$default(AiPackModelProvider aiPackModelProvider, IIoOo1iIio1l iIoOo1iIio1l, I0il01 i0il01, Exception exc, int i, Object obj) {
/* 3 */             if ((i & 4) != 0) {
/* 5 */                 exc = null;
                    }
/* 6 */             aiPackModelProvider.unregisterListenerAndResume(iIoOo1iIio1l, i0il01, exc);
                }

                /* JADX WARN: Type inference failed for: r15v2, types: [com.google.ai.edge.litert.deployment.AiPackModelProvider$download$2$listener$1, java.lang.Object] */
                @Override
                public Object download(IOoil1iiIilo iOoil1iiIilo) {
                    o0IiOl o0iiolI00000oIO;
/* 5 */             if (isReady()) {
/* 250 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 14 */            final IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 17 */            iIoOoIol0Io0.I00111O();
/* 22 */            final ?? r15 = new I0il01() {
                        @Override
                        public void onStateUpdate(I0iio0 state) {
/* 1 */                     i0OOioi1OiOi i0ooioi1oioi = (i0OOioi1OiOi) state;
/* 3 */                     int i = i0ooioi1oioi.I00000oOI;
/* 17 */                    if (O0000Ioio00.I0000O(i0ooioi1oioi.I00000oIO, this.this$0.aiPackName)) {
/* 49 */                        Log.i("AiPackModelProvider", "AiPack " + this.this$0.aiPackName + " status = " + i);
/* 52 */                        if (i == 0) {
/* 216 */                           Log.e("AiPackModelProvider", "Asset pack status unknown");
/* 1 */                             this.this$0.unregisterListenerAndResume(iIoOoIol0Io0, this, new IllegalStateException("Asset pack status unknown"));
/* 437 */                           return;
                                }
/* 56 */                        if (i != 9) {
/* 59 */                            if (i == 4) {
/* 194 */                               AiPackModelProvider.unregisterListenerAndResume$default(this.this$0, iIoOoIol0Io0, this, null, 4, null);
/* 197 */                               return;
                                    }
/* 62 */                            if (i == 5) {
/* 168 */                               Log.e("AiPackModelProvider", "AiPack " + this.this$0.aiPackName + " failed to download, errorCode = " + i0ooioi1oioi.I0000Il00O);
/* 1 */                                 this.this$0.unregisterListenerAndResume(iIoOoIol0Io0, this, new IllegalStateException("AiPack failed to download"));
/* 185 */                               return;
                                    }
/* 65 */                            if (i == 6) {
/* 122 */                               Log.w("AiPackModelProvider", "AiPack " + this.this$0.aiPackName + " download is canceled");
/* 1 */                                 this.this$0.unregisterListenerAndResume(iIoOoIol0Io0, this, new IllegalStateException("AiPack download is canceled"));
/* 139 */                               return;
                                    }
/* 68 */                            if (i != 7) {
/* 93 */                                Log.i("AiPackModelProvider", "AiPack " + this.this$0.aiPackName + " is downloading");
/* 96 */                                return;
                                    }
                                }
/* 1 */                         this.this$0.unregisterListenerAndResume(iIoOoIol0Io0, this, new IllegalStateException("Waiting for user confirmation"));
                            }
                        }
                    };
/* 29 */            OoOlO1O0o ooOlO1O0o = (OoOlO1O0o) this.aiPackManager;
                    synchronized (ooOlO1O0o) {
/* 34 */                i0OOI1OOo0 i0ooi1ooo0 = new i0OOI1OOo0();
/* 37 */                i0ooi1ooo0.I00000oIO = r15;
/* 39 */                VarHandle.storeStoreFence();
/* 46 */                ((i0OOOllloIII) ooOlO1O0o.I00iiI).I00000oOI(i0ooi1ooo0);
/* 53 */                ((HashMap) ooOlO1O0o.I00iiO).put(r15, i0ooi1ooo0);
                    }
/* 1 */             I0iiilOi i0iiilOi = this.aiPackManager;
/* 65 */            List<String> listSingletonList = Collections.singletonList(this.aiPackName);
/* 73 */            i0OOOllloIII i0ooollloiii = (i0OOOllloIII) ((OoOlO1O0o) i0iiilOi).I00iiI;
/* 83 */            HashMap mapI00100l0 = i0ooollloiii.I00000oIO.I00100l0();
/* 89 */            ArrayList arrayList = new ArrayList(listSingletonList);
/* 96 */            if (arrayList.isEmpty()) {
/* 100 */               Bundle bundle = new Bundle();
/* 106 */               bundle.putInt("session_id", 0);
/* 109 */               bundle.putInt("error_code", 0);
/* 122 */               for (String str : listSingletonList) {
/* 137 */                   bundle.putInt(liIlli0IIoo.I00000oIO("status", str), 4);
/* 144 */                   bundle.putInt(liIlli0IIoo.I00000oIO("error_code", str), 0);
/* 151 */                   bundle.putLong(liIlli0IIoo.I00000oIO("total_bytes_to_download", str), 0L);
/* 158 */                   bundle.putLong(liIlli0IIoo.I00000oIO("bytes_downloaded", str), 0L);
                        }
/* 169 */               bundle.putStringArrayList("pack_names", new ArrayList<>(listSingletonList));
/* 172 */               bundle.putLong("total_bytes_to_download", 0L);
/* 175 */               bundle.putLong("bytes_downloaded", 0L);
/* 186 */               o0iiolI00000oIO = lOio0o.I0000oI00(i0Ilo11Ii.I00000oIO(bundle, i0ooollloiii.I0000oI00, i0ooollloiii.I0001Ioi1lo));
                    } else {
/* 199 */               o0iiolI00000oIO = ((i0OiOI1) i0ooollloiii.I000O01llI0.I0000Il00O()).I00000oIO(arrayList, mapI00100l0);
                    }
/* 207 */           i1O01oOIoI0I i1o01ooioi0i = new i1O01oOIoI0I(17);
/* 210 */           o0iiolI00000oIO.getClass();
/* 224 */           o0iiolI00000oIO.I000iOII(OloIo0oOIO0.I00000oIO, i1o01ooioi0i).I0000Il00O(new OIi0011o() {
                        @Override
                        public final void onFailure(Exception exc) {
/* 1 */                     this.this$0.unregisterListenerAndResume(iIoOoIol0Io0, r15, exc);
                        }
                    });
/* 232 */           iIoOoIol0Io0.I001IO000(new Function1() {
                        public final void invoke(Throwable th) {
/* 11 */                    ((OoOlO1O0o) this.this$0.aiPackManager).I000II(r15);
                        }

                        @Override
/* 14 */                public Object invoke(Object obj) {
/* 15 */                    invoke((Throwable) obj);
                            return OoiIlOl1iI.I00000oIO;
                        }
                    });
/* 235 */           Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
                    return objI0010I0i == Ii0111o.I00iOIl ? objI0010I0i : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public Set<Accelerator> getCompatibleAccelerators() {
/* 1 */             return this.accelerators;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public String getPath() throws PackageManager.NameNotFoundException {
                    i0IlIo00I i0ilio00iI000OiO;
                    i0Il1olI i0il1oli;
                    PackageInfo packageInfo;
                    ArrayList<String> arrayList;
                    String str;
/* 5 */             i0OOIO00Ii i0ooio00ii = null;
/* 6 */             if (!isReady()) {
/* 361 */               I000II.I001IO000("AiPack is not ready yet");
/* 5 */                 return null;
                    }
/* 8 */             I0iiilOi i0iiilOi = this.aiPackManager;
/* 10 */            String str2 = this.aiPackName;
/* 12 */            String str3 = this.modelPath;
/* 18 */            i0OOOllloIII i0ooollloiii = (i0OOOllloIII) ((OoOlO1O0o) i0iiilOi).I00iiI;
/* 20 */            i0Il00O1 i0il00o1 = i0ooollloiii.I00000oIO;
/* 25 */            if (!i0ooollloiii.I000II) {
/* 40 */                ((Executor) i0ooollloiii.I000OOo1O.I0000Il00O()).execute(new i0OO1i1(i0ooollloiii));
/* 43 */                i0ooollloiii.I000II = true;
                    }
/* 45 */            i0il00o1.getClass();
/* 52 */            if (i0il00o1.I000o00OoI0I(str2) != null) {
                        try {
/* 54 */                    i0ilio00iI000OiO = i0il00o1.I000OiO(str2);
                        } catch (IOException unused) {
                        }
                    } else {
/* 73 */                i0ilio00iI000OiO = i0ooollloiii.I0000O.I00000oIO().contains(str2) ? i0IlIo00I.I0000O : null;
                    }
/* 75 */            if (i0ilio00iI000OiO == null) {
/* 77 */                i0il1oli = null;
                    } else {
/* 80 */                String str4 = i0ilio00iI000OiO.I0000Il00O;
/* 82 */                int i = i0ilio00iI000OiO.I00000oIO;
/* 84 */                if (i == 1) {
/* 86 */                    Context context = i0il00o1.I00000oIO;
/* 88 */                    OlOilIlol1 olOilIlol1 = i0Il00O1.I0000Il00O;
                            try {
/* 99 */                        packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                            } catch (PackageManager.NameNotFoundException unused2) {
/* 108 */                       olOilIlol1.I00000oOI("Could not find PackageInfo.", new Object[0]);
/* 111 */                       packageInfo = null;
                            }
/* 112 */                   if (packageInfo == null) {
/* 114 */                       arrayList = null;
                            } else {
/* 118 */                       arrayList = new ArrayList();
/* 121 */                       String[] strArr = packageInfo.splitNames;
/* 123 */                       if (strArr == null || packageInfo.applicationInfo.splitSourceDirs == null) {
/* 162 */                           olOilIlol1.I00000oIO("No splits present for package %s.", str2);
                                } else {
/* 132 */                           int iBinarySearch = Arrays.binarySearch(strArr, str2);
/* 136 */                           if (iBinarySearch < 0) {
/* 144 */                               olOilIlol1.I00000oIO("Asset Pack '%s' is not installed.", str2);
                                    } else {
/* 153 */                               str = packageInfo.applicationInfo.splitSourceDirs[iBinarySearch];
/* 166 */                               if (str != null) {
/* 172 */                                   arrayList.add(packageInfo.applicationInfo.sourceDir);
/* 181 */                                   arrayList.addAll(i0Il00O1.I0000oI00(packageInfo, "config."));
                                        } else {
/* 185 */                                   arrayList.add(str);
/* 202 */                                   arrayList.addAll(i0Il00O1.I0000oI00(packageInfo, String.valueOf(str2).concat(".config.")));
                                        }
                                    }
                                }
/* 147 */                       str = null;
/* 166 */                       if (str != null) {
                                }
                            }
/* 205 */                   OlOilIlol1 olOilIlol12 = i0Il00O1.I0000Il00O;
/* 207 */                   if (arrayList != null) {
/* 218 */                       String path = new File("assets", str3).getPath();
/* 230 */                       for (String str5 : arrayList) {
                                    try {
/* 238 */                               i0il1oli = liO0o11.I00000oIO(str5, path);
/* 242 */                               if (i0il1oli != null) {
                                            break;
                                        }
                                    } catch (IOException e) {
/* 252 */                               olOilIlol12.I0000Il00O(e, "Failed to parse APK file '%s' looking for asset '%s'.", str5, str3);
                                    }
                                }
/* 263 */                       olOilIlol12.I00000oIO("The asset %s is not present in Asset Pack %s. Searched in APKs: %s", str3, str2, arrayList);
/* 77 */                        i0il1oli = null;
                            }
                        } else {
/* 268 */                   if (i == 0) {
/* 272 */                       File file = new File(str4, str3);
/* 279 */                       if (file.exists()) {
/* 293 */                           i0il1oli = new i0Il1olI(file.getPath(), 0L, file.length());
                                } else {
/* 306 */                           i0Il00O1.I0000Il00O.I00000oIO("The asset %s is not present in Asset Pack %s. Searched in folder: %s", str3, str2, str4);
                                }
                            } else {
/* 319 */                       i0OOOllloIII.I000OiO.I00000oIO("The asset %s is not present in Asset Pack %s", str3, str2);
                            }
/* 77 */                    i0il1oli = null;
                        }
                    }
/* 324 */           if (i0il1oli != null) {
/* 327 */               String str6 = i0il1oli.I00000oIO;
/* 329 */               long j = i0il1oli.I00000oOI;
/* 331 */               long j2 = i0il1oli.I0000Il00O;
/* 335 */               i0OOIO00Ii i0ooio00ii2 = new i0OOIO00Ii();
/* 338 */               if (str6 == null) {
/* 355 */                   IOOlIIilOl0.I000II("Null path");
/* 5 */                     return null;
                        }
/* 340 */               i0ooio00ii2.I00000oIO = str6;
/* 342 */               i0ooio00ii2.I00000oOI = j;
/* 344 */               i0ooio00ii2.I0000Il00O = j2;
/* 346 */               VarHandle.storeStoreFence();
/* 349 */               i0ooio00ii = i0ooio00ii2;
                    }
/* 350 */           return i0ooio00ii.I00000oIO;
                }

                @Override
                public ModelProvider.Type getType() {
/* 1 */             return ModelProvider.Type.FILE;
                }

                @Override
                public boolean isReady() {
                    i0IlIo00I i0ilio00iI000OiO;
/* 1 */             I0iiilOi i0iiilOi = this.aiPackManager;
/* 3 */             String str = this.aiPackName;
/* 9 */             i0OOOllloIII i0ooollloiii = (i0OOOllloIII) ((OoOlO1O0o) i0iiilOi).I00iiI;
/* 11 */            i0Il00O1 i0il00o1 = i0ooollloiii.I00000oIO;
/* 16 */            if (!i0ooollloiii.I000II) {
/* 31 */                ((Executor) i0ooollloiii.I000OOo1O.I0000Il00O()).execute(new i0OO1i1(i0ooollloiii));
/* 34 */                i0ooollloiii.I000II = true;
                    }
/* 36 */            i0il00o1.getClass();
/* 39 */            i0OOOilo0l0 i0oooilo0l0 = null;
/* 44 */            if (i0il00o1.I000o00OoI0I(str) != null) {
                        try {
/* 46 */                    i0ilio00iI000OiO = i0il00o1.I000OiO(str);
                        } catch (IOException unused) {
                        }
                    } else {
/* 65 */                i0ilio00iI000OiO = i0ooollloiii.I0000O.I00000oIO().contains(str) ? i0IlIo00I.I0000O : null;
                    }
/* 68 */            if (i0ilio00iI000OiO != null) {
/* 73 */                if (i0ilio00iI000OiO.I00000oIO == 1) {
/* 75 */                    i0oooilo0l0 = i0OOOilo0l0.I0000O;
                        } else {
/* 78 */                    String str2 = i0ilio00iI000OiO.I00000oOI;
/* 80 */                    String str3 = i0ilio00iI000OiO.I0000Il00O;
/* 82 */                    if (str2 == null) {
/* 125 */                       IOOlIIilOl0.I000II("STORAGE_FILES location path must be non-null");
/* 67 */                        return false;
                            }
/* 86 */                    i0oooilo0l0 = new i0OOOilo0l0(str2, 0, str3);
                        }
                    }
/* 89 */            boolean z = i0oooilo0l0 != null;
/* 119 */           Log.i(TAG, "AiPack " + this.aiPackName + " is installed = " + z);
/* 122 */           return z;
                }

/* 61 */        public AiPackModelProvider(Context context, String str, String str2, Accelerator... acceleratorArr) {
/* 64 */            this(context, str, str2, (Set<? extends Accelerator>) I1IoiO1l.I00IlilI0i0i(Arrays.copyOf(acceleratorArr, acceleratorArr.length)));
                }

/* 64 */        public AiPackModelProvider(Context context, String str, String str2, IllOOo00lI illOOo00lI) {
/* 65 */            this(context, str, str2, (Set<? extends Accelerator>) illOOo00lI.invoke());
                }
            }
