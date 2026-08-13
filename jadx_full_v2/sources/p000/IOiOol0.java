            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Trace;
            import android.preference.PreferenceManager;
            import android.util.Log;
            import android.util.Range;
            import android.util.Size;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.CharConversionException;
            import java.io.File;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.security.GeneralSecurityException;
            import java.security.KeyStoreException;
            import java.security.ProviderException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicReference;
            import org.json.JSONArray;
            import org.json.JSONException;
            
/* 624 */   public final class IOiOol0 implements IOiOIoiiO0i, O0iI0IlO0iI, i0Ii0I1ll {
                public static final IOiOoIO1OI I00l0I0l0lO1 = new IOiOoIO1OI(0);
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                public Object I00ioIO;

                public IOiOol0(ArrayList arrayList, List list) {
                    Object next;
                    String strConcat;
                    String str;
                    String str2;
                    boolean zI000O01llI0;
/* 2 */             this.I00iOIl = 7;
/* 4 */             Object obj = I1lIoOIi.I000O01llI0;
/* 9 */             this.I00iiI = list;
/* 11 */            this.I00iiO = obj;
/* 15 */            this.I00iio = Il01llIol0.I00iOIl;
/* 19 */            this.I00ilI0I1 = Il01100l.I00iOIl;
/* 21 */            List listI001i1lo1io = IOOi0Ool1i.I001i1lo1io(arrayList);
/* 25 */            this.I00ilO0 = listI001i1lo1io;
/* 33 */            this.I00io1l = new IiOoil1O(3);
/* 39 */            this.I00ioIO = O1OIIoio0i1.I0000O();
/* 46 */            if (!obj.equals(obj)) {
/* 49 */                Iterator it = listI001i1lo1io.iterator();
/* 57 */                while (it.hasNext()) {
/* 73 */                    if (((Ool10o) it.next()).I000II.I000O01llI0(OolIl0ii1.I00O0i0ii)) {
/* 78 */                        I000II.I000iOII("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
/* 81 */                        throw null;
                            }
                        }
                    }
/* 84 */            List list2 = (List) this.I00ilI0I1;
/* 88 */            Set set = (Set) this.I00iio;
/* 94 */            if (set.isEmpty() && list2.isEmpty()) {
/* 611 */               return;
                    }
/* 104 */           Set set2 = set;
/* 114 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(set2, 10));
/* 117 */           Iterator it2 = set2.iterator();
/* 125 */           while (it2.hasNext()) {
/* 137 */               arrayList2.add(((Io1100oIo) it2.next()).I00000oIO());
                    }
/* 156 */           for (IlIIii1oO1IO ilIIii1oO1IO : IOOi0Ool1i.I001i1lo1io(arrayList2)) {
/* 166 */               ArrayList arrayList3 = new ArrayList();
/* 177 */               for (Object obj2 : set2) {
/* 190 */                   if (((Io1100oIo) obj2).I00000oIO() == ilIIii1oO1IO) {
/* 192 */                       arrayList3.add(obj2);
                            }
                        }
/* 200 */               if (arrayList3.size() > 1) {
/* 205 */                   OIiilo1Ool0o.I000O01llI0("requiredFeatures has conflicting feature values: ", arrayList3);
/* 208 */                   throw null;
                        }
                    }
/* 224 */           if (IOOi0Ool1i.I001i1lo1io(list2).size() != list2.size()) {
/* 622 */               IoOOl0iOl1io.I000O01llI0("Duplicate values in preferredFeatures(", 41, list2);
/* 900 */               throw null;
                    }
/* 228 */           LinkedHashSet linkedHashSetI00IO1oi11O = IOOi0Ool1i.I00IO1oi11O(set2, list2);
/* 236 */           if (!linkedHashSetI00IO1oi11O.isEmpty()) {
/* 614 */               OIiilo1Ool0o.I000O01llI0("requiredFeatures and preferredFeatures have duplicate values: ", linkedHashSetI00IO1oi11O);
/* 617 */               throw null;
                    }
/* 252 */           for (Ool10o ool10o : (List) this.I00ilO0) {
/* 262 */               OolOiI0I.I00iiI.getClass();
/* 271 */               if (l1I0oI.I0001Ioi1lo(ool10o) == OolOiI0I.I00ioIO) {
/* 607 */                   IioIoO10iOiI.I000o00OoI0I(ool10o, " is not supported with feature group");
/* 610 */                   throw null;
                        }
/* 303 */               String str3 = ool10o instanceof OOIIOiolI ? "Preview" : ool10o instanceof Ioi1Io1o ? "ImageCapture" : ool10o instanceof Ioi01I0 ? "ImageAnalysis" : li0IooIlo10.I00000oOI(ool10o) ? "VideoCapture" : "UseCase";
/* 307 */               Iterator it3 = IlIIii1oO1IO.I00iiI.iterator();
                        while (true) {
/* 317 */                   if (!it3.hasNext()) {
/* 420 */                       next = null;
                                break;
                            }
/* 319 */                   next = it3.next();
/* 328 */                   OolOiI0I.I00iiI.getClass();
/* 331 */                   int iOrdinal = ((IlIIii1oO1IO) next).ordinal();
/* 335 */                   if (iOrdinal == 0) {
/* 413 */                       zI000O01llI0 = ool10o.I000II.I000O01llI0(IoiIOIliOIi1.I0010o);
                            } else if (iOrdinal == 1) {
/* 404 */                       zI000O01llI0 = ool10o.I000II.I000O01llI0(OolIl0ii1.I00O0i0ii);
                            } else if (iOrdinal == 2) {
/* 398 */                       zI000O01llI0 = ool10o.I000II.I000O01llI0(OolIl0ii1.I00OIo) || ool10o.I000II.I000O01llI0(OolIl0ii1.I00OOll1);
                            } else if (iOrdinal == 3) {
/* 370 */                       zI000O01llI0 = ool10o.I000II.I000O01llI0(Ioi1iI0IiOl.I00ilO0);
                            } else {
/* 343 */                       if (iOrdinal != 4) {
/* 362 */                           I000II.I00000oIO();
/* 365 */                           throw null;
                                }
/* 357 */                       zI000O01llI0 = O0000Ioio00.I0000O(ool10o.I000II.I00000oOI(OolIl0ii1.I00OilO00Il, Boolean.TRUE), Boolean.FALSE);
                            }
/* 417 */                   if (zI000O01llI0) {
                                break;
                            }
                        }
/* 421 */               IlIIii1oO1IO ilIIii1oO1IO2 = (IlIIii1oO1IO) next;
/* 423 */               if (ilIIii1oO1IO2 != null) {
/* 431 */                   StringBuilder sb = new StringBuilder("A ");
/* 438 */                   sb.append(ilIIii1oO1IO2.name());
/* 443 */                   sb.append(" value is set to ");
/* 446 */                   sb.append(str3);
/* 451 */                   sb.append(" despite using feature groups. Do not use APIs like ");
/* 454 */                   int iOrdinal2 = ilIIii1oO1IO2.ordinal();
/* 458 */                   if (iOrdinal2 == 0) {
/* 511 */                       strConcat = str3.concat(".Builder.setDynamicRange");
                            } else if (iOrdinal2 == 1) {
/* 504 */                       strConcat = str3.concat(".Builder.setTargetFrameRateRange");
                            } else if (iOrdinal2 == 2) {
/* 497 */                       strConcat = li0IooIlo10.I00000oOI(ool10o) ? str3.concat(".Builder.setVideoStabilizationEnabled") : str3.concat(".Builder.setPreviewStabilizationEnabled");
                            } else if (iOrdinal2 == 3) {
/* 477 */                       strConcat = str3.concat(".Builder.setOutputFormat");
                            } else {
/* 466 */                       if (iOrdinal2 != 4) {
/* 471 */                           I000II.I00000oIO();
/* 474 */                           throw null;
                                }
/* 468 */                       strConcat = "Recorder.Builder.setQualitySelector";
                            }
/* 515 */                   sb.append(strConcat);
/* 520 */                   sb.append(" while using feature groups. If, for example, ");
/* 523 */                   int iOrdinal3 = ilIIii1oO1IO2.ordinal();
/* 527 */                   if (iOrdinal3 == 0) {
/* 553 */                       str = "HDR";
                            } else if (iOrdinal3 == 1) {
/* 550 */                       str = "60 FPS";
                            } else if (iOrdinal3 == 2) {
/* 547 */                       str = "stabilization";
                            } else if (iOrdinal3 == 3) {
/* 544 */                       str = "JPEG_R output format";
                            } else {
/* 535 */                       if (iOrdinal3 != 4) {
/* 540 */                           I000II.I00000oIO();
/* 543 */                           throw null;
                                }
/* 537 */                       str = "UHD recording quality";
                            }
/* 555 */                   sb.append(str);
/* 560 */                   sb.append(" is required, instead set ");
/* 563 */                   int iOrdinal4 = ilIIii1oO1IO2.ordinal();
/* 567 */                   if (iOrdinal4 == 0) {
/* 593 */                       str2 = "GroupableFeature.HDR_HLG10";
                            } else if (iOrdinal4 == 1) {
/* 590 */                       str2 = "GroupableFeature.FPS_60";
                            } else if (iOrdinal4 == 2) {
/* 587 */                       str2 = "GroupableFeature.PREVIEW_STABILIZATION";
                            } else if (iOrdinal4 == 3) {
/* 584 */                       str2 = "GroupableFeature.IMAGE_ULTRA_HDR";
                            } else {
/* 575 */                       if (iOrdinal4 != 4) {
/* 577 */                           I000II.I00000oIO();
/* 580 */                           throw null;
                                }
/* 581 */                       str2 = "GroupableFeatures.UHD_RECORDING";
                            }
/* 601 */                   I000II.I0010I0i(IIl001iO0Io.I00100l0(sb, str2, " as either a required or preferred feature."));
/* 604 */                   throw null;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x0072, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {all -> 0x0072, blocks: (B:5:0x0040, B:7:0x004e, B:9:0x005a, B:11:0x005e, B:17:0x006c, B:18:0x006f, B:22:0x0075), top: B:75:0x0040, outer: #1 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O0oOi0i1O I00000oOI(IOiOol0 iOiOol0, O0oiOi o0oiOi, IIo0l1 iIo0l1, IOiOol0 iOiOol02) {
                    O0oOi0i1O o0oOi0i1OI00000oOI;
                    Collection<O0oOi0i1O> collectionUnmodifiableCollection;
                    boolean zContains;
                    I0Iiil0 i0Iiil0;
/* 9 */             IOlO11lll0l iOlO11lll0l = IOlO11lll0l.I0000Il00O;
/* 13 */            lOo0I0iOi11O.I00000oIO("CX:bindToLifecycle-internal");
                    try {
/* 16 */                lOllIO.I00000oIO();
/* 29 */                IIllOo0 iIllOo0I0000Il00O = iIo0l1.I0000Il00O(((IIoIloi0) iOiOol0.I00io1l).I00000oIO.I0000Il00O());
/* 34 */                iIllOo0I0000Il00O.I0010I0i(true);
/* 37 */                I0IiOl1oIloO i0IiOl1oIloOI0010I0i = iOiOol0.I0010I0i(iIo0l1);
/* 54 */                IIllII iIllIII00000oIO = iOillilIolO.I00000oIO(i0IiOl1oIloOI0010I0i.I00iOIl.I0001Ioi1lo(), null, ((IIlIoiO) i0IiOl1oIloOI0010I0i.I00iiO).I00iOIl);
/* 60 */                O0oOooi1l o0oOooi1l = (O0oOooi1l) iOiOol0.I00ioIO;
                        synchronized (o0oOooi1l.I00000oIO) {
                            try {
/* 75 */                        o0oOi0i1OI00000oOI = (O0oOi0i1O) o0oOooi1l.I00000oOI.get(I1l100l.I00000oIO(o0oiOi, iIllIII00000oIO));
/* 77 */                        if (o0oOi0i1OI00000oOI != null) {
/* 79 */                            IIoIi00lIii0 iIoIi00lIii0 = o0oOi0i1OI00000oOI.I00iiO;
/* 107 */                           if (iIoIi00lIii0.I00iOIl.I00iOIl.I000lI() || ((i0Iiil0 = iIoIi00lIii0.I00iiI) != null && i0Iiil0.I00iOIl.I000lI())) {
/* 109 */                               o0oOooi1l.I000iOII(o0oOi0i1OI00000oOI);
/* 113 */                               o0oOi0i1OI00000oOI = null;
                                    }
                                }
                            } finally {
                            }
                        }
/* 121 */               O0oOooi1l o0oOooi1l2 = (O0oOooi1l) iOiOol0.I00ioIO;
                        synchronized (o0oOooi1l2.I00000oIO) {
/* 132 */                   collectionUnmodifiableCollection = Collections.unmodifiableCollection(o0oOooi1l2.I00000oOI.values());
                        }
/* 151 */               for (Ool10o ool10o : (List) iOiOol02.I00ilO0) {
/* 167 */                   for (O0oOi0i1O o0oOi0i1O : collectionUnmodifiableCollection) {
                                synchronized (o0oOi0i1O.I00iOIl) {
/* 188 */                           zContains = ((ArrayList) o0oOi0i1O.I00iiO.I001lIiIIo1O()).contains(ool10o);
                                }
/* 193 */                       if (zContains && !O0000Ioio00.I0000O(o0oOi0i1O.I000OiO(), o0oiOi)) {
/* 225 */                           throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{ool10o}, 1)));
                                }
                            }
                        }
/* 231 */               if (o0oOi0i1OI00000oOI == null) {
/* 236 */                   O0oOooi1l o0oOooi1l3 = (O0oOooi1l) iOiOol0.I00ioIO;
/* 242 */                   OillOo0 oillOo0 = ((IIoIloi0) iOiOol0.I00io1l).I000iOII;
/* 244 */                   if (oillOo0 == null) {
/* 279 */                       throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 267 */                   o0oOi0i1OI00000oOI = o0oOooi1l3.I00000oOI(o0oiOi, oillOo0.I00100l0(iIllOo0I0000Il00O, null, i0IiOl1oIloOI0010I0i, null, iOlO11lll0l, iOlO11lll0l), (OiI0OoOIi) ((IIoIloi0) iOiOol0.I00io1l).I000oI1ioi.getValue());
                        }
/* 288 */               if (!((List) iOiOol02.I00ilO0).isEmpty()) {
/* 293 */                   O0oOooi1l o0oOooi1l4 = (O0oOooi1l) iOiOol0.I00ioIO;
/* 299 */                   IIlOoolol0ll iIlOoolol0ll = ((IIoIloi0) iOiOol0.I00io1l).I000II;
/* 301 */                   if (iIlOoolol0ll == null) {
/* 332 */                       throw new IllegalStateException("CameraX not initialized yet.");
                            }
/* 307 */                   o0oOooi1l4.I00000oIO(o0oOi0i1OI00000oOI, iOiOol02, (IIlOO01iI) iIlOoolol0ll.I00io1l);
/* 318 */                   ((HashSet) iOiOol0.I00ilI0I1).add(I1l100l.I00000oIO(o0oiOi, iIllIII00000oIO));
                        }
/* 324 */               return o0oOi0i1OI00000oOI;
                    } finally {
/* 339 */               Trace.endSection();
                    }
                }

                public static OillOo0 I000l1(Executor executor) {
/* 4 */             OillOo0 oillOo0 = new OillOo0(5);
/* 12 */            oillOo0.I00iiO = new ArrayList();
/* 19 */            oillOo0.I00iio = new ArrayList();
/* 23 */            oillOo0.I00ilI0I1 = IOiOl1lII10i.I000l1;
/* 25 */            oillOo0.I00iiI = executor;
/* 27 */            VarHandle.storeStoreFence();
/* 77 */            return oillOo0;
                }

                public static Ol0O0iI0l0O I000o00OoI0I(Ol0O0iI0l0O ol0O0iI0l0O, O0iIl1 o0iIl1) {
/* 1 */             O0i1lI0o1io o0i1lI0o1ioI0000O = lOoliOIOlIO0.I0000O(ol0O0iI0l0O);
/* 5 */             I11IlOOO annotations = ol0O0iI0l0O.getAnnotations();
/* 9 */             O0iIl1 o0iIl1I0001Ioi1lo = ilioooOo11.I0001Ioi1lo(ol0O0iI0l0O);
/* 13 */            List listI0000O = ilioooOo11.I0000O(ol0O0iI0l0O);
/* 21 */            List listI001l0I00 = IOOi0Ool1i.I001l0I00(ilioooOo11.I000II(ol0O0iI0l0O));
/* 36 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI001l0I00, 10));
/* 39 */            Iterator it = listI001l0I00.iterator();
/* 47 */            while (it.hasNext()) {
/* 59 */                arrayList.add(((OoOi1Ol) it.next()).I00000oOI());
                    }
/* 73 */            return ilioooOo11.I00000oOI(o0i1lI0o1ioI0000O, annotations, o0iIl1I0001Ioi1lo, listI0000O, arrayList, o0iIl1, true).I00li1OI(ol0O0iI0l0O.I00iiI());
                }

                public static IIlIoiO I00100o1O0lo(IIo0l1 iIo0l1) {
/* 3 */             Iterator it = iIo0l1.I00000oIO.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                I1l0i11iIiI i1l0i11iIiI = IIli1ol10i.I00000oIO;
/* 25 */                if (!O0000Ioio00.I0000O(i1l0i11iIiI, i1l0i11iIiI)) {
                            synchronized (Il1l0o01looI.I00000oIO) {
                            }
                        }
                    }
/* 43 */            return IIlIool0Oi0O.I00000oIO;
                }

                public static IIloOI I001lloI(byte[] bArr) throws IOException {
/* 3 */             ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
/* 10 */                O0OOo0iol0I o0OOo0iol0II00II0oii1o = O0OOo0iol0I.I00II0oii1o(byteArrayInputStream, Il1llO11O.I00000oIO());
/* 14 */                byteArrayInputStream.close();
/* 35 */                return new IIloOI((O0OO1oo) ((O0OOo0iol0I) IoIlOo1o0IIl.I00111O(o0OOo0iol0II00II0oii1o).I00iiI).I001i1lo1io(), 18);
                    } catch (Throwable th) {
/* 40 */                byteArrayInputStream.close();
/* 77 */                throw th;
                    }
                }

                public static final ArrayList I00IioO0OiOi(OOi001oo1OOI oOi001oo1OOI, IOiOol0 iOiOol0) {
/* 1 */             List list = oOi001oo1OOI.I00iio;
/* 13 */            OOi001oo1OOI oOi001oo1OOII0000O = lIOOli.I0000O(oOi001oo1OOI, (Oi0Oooi) ((IiOili0lOO1) iOiOol0.I00iiI).I00ilI0I1);
/* 24 */            Iterable iterableI00IioO0OiOi = oOi001oo1OOII0000O != null ? I00IioO0OiOi(oOi001oo1OOII0000O, iOiOol0) : null;
/* 25 */            if (iterableI00IioO0OiOi == null) {
/* 27 */                iterableI00IioO0OiOi = Il01100l.I00iOIl;
                    }
/* 31 */            return IOOi0Ool1i.I00O10llo(list, iterableI00IioO0OiOi);
                }

                public static OoOI1i1i I00IlilI0i0i(List list, I11IlOOO i11IlOOO) {
                    OoOI1i1i ooOI1i1iI00ll1;
/* 1 */             List list2 = list;
/* 11 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list2, 10));
/* 14 */            Iterator it = list2.iterator();
/* 22 */            while (it.hasNext()) {
/* 30 */                ((IiIO0OIIoo) it.next()).getClass();
/* 37 */                if (i11IlOOO.isEmpty()) {
/* 41 */                    OoOI1i1i.I00iiI.getClass();
/* 44 */                    ooOI1i1iI00ll1 = OoOI1i1i.I00iiO;
                        } else {
/* 47 */                    IIlio101Io iIlio101Io = OoOI1i1i.I00iiI;
/* 54 */                    List listSingletonList = Collections.singletonList(new I11O0Ol(i11IlOOO));
/* 58 */                    iIlio101Io.getClass();
/* 61 */                    ooOI1i1iI00ll1 = IIlio101Io.I00ll1(listSingletonList);
                        }
/* 65 */                arrayList.add(ooOI1i1iI00ll1);
                    }
/* 71 */            ArrayList arrayList2 = new ArrayList();
/* 74 */            Iterator it2 = arrayList.iterator();
/* 82 */            while (it2.hasNext()) {
/* 90 */                IOOii0O10Io0.I00100l0(arrayList2, (Iterable) it2.next());
                    }
/* 96 */            OoOI1i1i.I00iiI.getClass();
/* 99 */            return IIlio101Io.I00ll1(arrayList2);
                }

                public static final OI000ilOol I00Io1o110i(IOiOol0 iOiOol0, OOi001oo1OOI oOi001oo1OOI, int i) {
/* 3 */             IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) iOiOol0.I00iiI;
/* 9 */             IOIOill iOIOillI00000oIO = l1iI1lOO.I00000oIO((OI1IlOlol) iiOili0lOO1.I00iiO, i);
/* 16 */            OoOIlli ooOIlli = new OoOIlli(2);
/* 19 */            ooOIlli.I00iiI = iOiOol0;
/* 21 */            VarHandle.storeStoreFence();
/* 32 */            OoI10o0iO11O ooI10o0iO11O = new OoI10o0iO11O(OilO1oiooiII.I000OiO(oOi001oo1OOI, ooOIlli), OOo1l011.I00ooIo0);
/* 37 */            ArrayList arrayList = new ArrayList();
/* 40 */            Iterator it = ooI10o0iO11O.iterator();
                    while (true) {
/* 45 */                OoI0o1II0o ooI0o1II0o = (OoI0o1II0o) it;
/* 53 */                if (!ooI0o1II0o.I00iOIl.hasNext()) {
                            break;
                        }
/* 59 */                arrayList.add(ooI0o1II0o.next());
                    }
/* 69 */            Iterator it2 = OilO1oiooiII.I000OiO(iOIOillI00000oIO, OoOIo0Ioo1.I00ioIO).iterator();
/* 74 */            int i2 = 0;
/* 79 */            while (it2.hasNext()) {
/* 81 */                it2.next();
/* 84 */                i2++;
/* 86 */                if (i2 < 0) {
/* 89 */                    IOOi1I.I000l1();
/* 93 */                    throw null;
                        }
                    }
/* 98 */            while (arrayList.size() < i2) {
/* 104 */               arrayList.add(0);
                    }
/* 116 */           return ((o01l1ioOo0) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000iOII).I000iOII(iOIOillI00000oIO, arrayList);
                }

                public static final boolean I00O0i0ii(IOiOol0 iOiOol0, Context context, o0l0iIlo0O o0l0iilo0o) {
/* 13 */            File file = new File(iOiOol0.I00Ol10(context), o0l0iilo0o.zzb());
/* 25 */            if (file.exists()) {
                        try {
/* 31 */                    if (file.delete()) {
/* 71 */                        return true;
                            }
/* 33 */                    String strZzb = o0l0iilo0o.zzb();
/* 49 */                    StringBuilder sb = new StringBuilder(String.valueOf(strZzb).length() + 30);
/* 52 */                    sb.append("Failed to delete cache file: ");
/* 55 */                    sb.append(strZzb);
/* 58 */                    sb.append(".");
/* 65 */                    Log.w("CacheFileManager", sb.toString());
/* 24 */                    return false;
                        } catch (SecurityException e) {
/* 85 */                    Log.e("CacheFileManager", "Failed to delete cache file: ".concat(String.valueOf(o0l0iilo0o.zzb())), e);
                        }
                    }
/* 24 */            return false;
                }

                public static final LinkedHashMap I00OIl(IOiOol0 iOiOol0, JSONArray jSONArray) throws JSONException {
/* 3 */             LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 6 */             int length = jSONArray.length();
/* 11 */            for (int i = 0; i < length; i++) {
/* 21 */                o0l0iIlo0O o0l0iilo0oI000OOo1O = ((o0l11OO0I0I) iOiOol0.I00iiO).I000OOo1O(jSONArray.getJSONObject(i));
/* 33 */                if (linkedHashMap.containsKey(o0l0iilo0oI000OOo1O.zza())) {
/* 35 */                    String strZza = o0l0iilo0oI000OOo1O.zza();
/* 51 */                    StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + 36);
/* 56 */                    sb.append("Duplicate cache name: ");
/* 59 */                    sb.append(strZza);
/* 64 */                    sb.append(". Overwriting.");
/* 73 */                    Log.w("CacheFileManager", sb.toString());
                        }
/* 80 */                linkedHashMap.put(o0l0iilo0oI000OOo1O.zza(), o0l0iilo0oI000OOo1O);
                    }
/* 106 */           return linkedHashMap;
                }

                @Override
                public Object I0000Il00O() {
/* 9 */             String str = (String) ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 15 */            Object objI0000Il00O = ((i0IOo0i0) this.I00iiO).I0000Il00O();
/* 23 */            Object objI0000Il00O2 = ((i0IOo0i0) this.I00iio).I0000Il00O();
/* 31 */            Context contextI00000oOI = ((i0O00lI) this.I00ilI0I1).I00000oOI();
/* 39 */            Object objI0000Il00O3 = ((i0IOo0i0) this.I00ilO0).I0000Il00O();
/* 53 */            i0IOo0i0 i0ioo0i0 = new i0IOo0i0(liIllOil01.I00000oIO((i0IOo0i0) this.I00io1l));
/* 66 */            i0Iii1o10 i0iii1o10 = (i0Iii1o10) objI0000Il00O;
/* 68 */            i0O0oOiO11 i0o0ooio11 = (i0O0oOiO11) objI0000Il00O2;
/* 70 */            i0OI1ii10 i0oi1ii10 = (i0OI1ii10) objI0000Il00O3;
/* 72 */            i0OI1IOoili1 i0oi1iooili1 = (i0OI1IOoili1) ((i0IOo0i0) this.I00ioIO).I0000Il00O();
/* 87 */            File file = str != null ? new File(contextI00000oOI.getExternalFilesDir(null), str) : contextI00000oOI.getExternalFilesDir(null);
/* 91 */            i0O1Oi1Ioll i0o1oi1ioll = new i0O1Oi1Ioll();
/* 103 */           i0o1oi1ioll.I0001Ioi1lo = new Handler(Looper.getMainLooper());
/* 109 */           i0o1oi1ioll.I00000oIO = file.getAbsolutePath();
/* 111 */           i0o1oi1ioll.I00000oOI = i0iii1o10;
/* 113 */           i0o1oi1ioll.I0000Il00O = i0o0ooio11;
/* 115 */           i0o1oi1ioll.I0000O = i0oi1ii10;
/* 117 */           i0o1oi1ioll.I000II = i0ioo0i0;
/* 119 */           i0o1oi1ioll.I0000oI00 = i0oi1iooili1;
/* 121 */           VarHandle.storeStoreFence();
/* 245 */           return i0o1oi1ioll;
                }

                public I1lIoOIi I0000O() {
/* 10 */            String strConcat = ((Size) this.I00iiI) == null ? " resolution" : "";
/* 16 */            if (((Size) this.I00iiO) == null) {
/* 20 */                strConcat = strConcat.concat(" originalConfiguredResolution");
                    }
/* 28 */            if (((Iio1oiI) this.I00iio) == null) {
/* 32 */                strConcat = strConcat.concat(" dynamicRange");
                    }
/* 40 */            if (((Integer) this.I00ilI0I1) == null) {
/* 44 */                strConcat = strConcat.concat(" sessionType");
                    }
/* 52 */            if (((Range) this.I00ilO0) == null) {
/* 56 */                strConcat = strConcat.concat(" expectedFrameRateRange");
                    }
/* 64 */            if (((Boolean) this.I00ioIO) == null) {
/* 68 */                strConcat = strConcat.concat(" zslDisabled");
                    }
/* 76 */            if (!strConcat.isEmpty()) {
/* 143 */               I000II.I001IO000("Missing required properties:".concat(strConcat));
/* 146 */               return null;
                    }
/* 82 */            Size size = (Size) this.I00iiI;
/* 86 */            Size size2 = (Size) this.I00iiO;
/* 90 */            Iio1oiI iio1oiI = (Iio1oiI) this.I00iio;
/* 96 */            int iIntValue = ((Integer) this.I00ilI0I1).intValue();
/* 102 */           Range range = (Range) this.I00ilO0;
/* 106 */           IOlOo1ll1l1 iOlOo1ll1l1 = (IOlOo1ll1l1) this.I00io1l;
/* 112 */           boolean zBooleanValue = ((Boolean) this.I00ioIO).booleanValue();
/* 116 */           I1lIoOIi i1lIoOIi = new I1lIoOIi();
/* 119 */           i1lIoOIi.I00000oIO = size;
/* 121 */           i1lIoOIi.I00000oOI = size2;
/* 123 */           i1lIoOIi.I0000Il00O = iio1oiI;
/* 125 */           i1lIoOIi.I0000O = iIntValue;
/* 127 */           i1lIoOIi.I0000oI00 = range;
/* 129 */           i1lIoOIi.I0001Ioi1lo = iOlOo1ll1l1;
/* 131 */           i1lIoOIi.I000II = zBooleanValue;
/* 133 */           VarHandle.storeStoreFence();
/* 136 */           return i1lIoOIi;
                }

                public synchronized Oi00IilOloo0 I000II() {
                    Oi00IilOloo0 oi00IilOloo0;
                    try {
/* 6 */                 if (((String) this.I00iiO) == null) {
/* 131 */                   throw new IllegalArgumentException("keysetName cannot be null");
                        }
                        synchronized (Oi00IilOloo0.I00iiI) {
                            try {
/* 13 */                        Context context = (Context) this.I00iiI;
/* 17 */                        String str = (String) this.I00iiO;
/* 21 */                        String str2 = (String) this.I00iio;
/* 23 */                        byte[] bArrI00000oIO = null;
/* 24 */                        if (str != null) {
/* 26 */                            Context applicationContext = context.getApplicationContext();
                                    try {
/* 42 */                                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
/* 46 */                                if (string != null) {
/* 49 */                                    bArrI00000oIO = ilo01iOOoO0l.I00000oIO(string);
                                        }
                                    } catch (ClassCastException | IllegalArgumentException unused) {
/* 67 */                                throw new CharConversionException(IlIi0I0.I000lI("can't read keyset; the pref value ", str, " is not a valid hex string"));
                                    }
                                } else {
/* 70 */                            I000II.I000iOII("keysetName cannot be null");
                                }
/* 75 */                        String str3 = (String) this.I00ilI0I1;
/* 77 */                        if (bArrI00000oIO == null) {
/* 79 */                            if (str3 != null) {
/* 85 */                                this.I00ilO0 = I00II0oii1o();
                                    }
/* 94 */                            this.I00ioIO = I00100l0();
                                } else if (str3 != null) {
/* 103 */                           this.I00ioIO = I00II0Ol1O0l(bArrI00000oIO);
                                } else {
/* 110 */                           this.I00ioIO = I001lloI(bArrI00000oIO);
                                }
/* 114 */                       oi00IilOloo0 = new Oi00IilOloo0(this);
                            } finally {
                            }
                        }
                    } catch (Throwable th) {
/* 245 */               throw th;
                    }
/* 119 */           return oi00IilOloo0;
                }

                @Override
                public synchronized OOiO0Il I000O01llI0(OOiilOlOOI oOiilOlOOI) {
/* 10 */            O0o11IlioI o0o11IlioI = (O0o11IlioI) ((HashMap) this.I00iio).get(oOiilOlOOI);
/* 12 */            if (o0o11IlioI != null) {
/* 15 */                return o0o11IlioI;
                    }
/* 16 */            return I00l0I0l0lO1;
                }

                @Override
                public void I000OOo1O() {
/* 3 */             I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iio;
/* 7 */             IOIOill iOIOill = (IOIOill) this.I00ilO0;
/* 11 */            HashMap map = (HashMap) this.I00iiI;
/* 19 */            boolean zI00II0Ol1O0l = false;
/* 20 */            if (iOIOill.equals(OlIIo0.I00000oOI)) {
/* 29 */                Object obj = map.get(OI1Iio0ii1.I0000oI00("value"));
/* 41 */                O0IiIOO o0IiIOO = obj instanceof O0IiIOO ? (O0IiIOO) obj : null;
/* 42 */                if (o0IiIOO != null) {
/* 45 */                    Object obj2 = o0IiIOO.I00000oIO;
/* 52 */                    O0Ii1li1lo o0Ii1li1lo = obj2 instanceof O0Ii1li1lo ? (O0Ii1li1lo) obj2 : null;
/* 54 */                    if (o0Ii1li1lo != null) {
/* 61 */                        zI00II0Ol1O0l = i0Oi111ii.I00II0Ol1O0l(o0Ii1li1lo.I00000oIO.I00000oIO);
                            }
                        }
                    }
/* 65 */            if (zI00II0Ol1O0l || i0Oi111ii.I00II0Ol1O0l(iOIOill)) {
/* 74 */                return;
                    }
/* 96 */            ((List) this.I00io1l).add(new I111ooiO0(((OI000ilOol) this.I00ilI0I1).I00Ol10(), map, (OlI1o0ooI) this.I00ioIO));
                }

                @Override
                public synchronized OOiO0Il I000OiO(OOiilOlOOI oOiilOlOOI) {
/* 4 */             lII0IlO.I00000oIO("Null interface requested.", oOiilOlOOI);
/* 15 */            return (OOiO0Il) ((HashMap) this.I00iiO).get(oOiilOlOOI);
                }

                @Override
                public void I000lI(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
/* 13 */            ((HashMap) this.I00iiI).put(oI1Iio0ii1, ((I0Oi111ii) this.I00iiO).I0010I0i(oI1Iio0ii1, obj));
                }

                public void I000oI1ioi(Map map, boolean z) {
                    ArrayDeque arrayDeque;
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 25 */                IOiIi0Oi iOiIi0Oi = (IOiIi0Oi) entry.getKey();
/* 31 */                OOiO0Il oOiO0Il = (OOiO0Il) entry.getValue();
/* 33 */                int i = iOiIi0Oi.I0000O;
/* 36 */                if (i == 1 || (i == 2 && z)) {
/* 44 */                    oOiO0Il.get();
                        }
                    }
/* 50 */            Il10OII il10OII = (Il10OII) this.I00ilO0;
                    synchronized (il10OII) {
                        try {
/* 53 */                    arrayDeque = il10OII.I00000oOI;
/* 56 */                    if (arrayDeque != null) {
/* 58 */                        il10OII.I00000oOI = null;
                            } else {
/* 63 */                        arrayDeque = null;
                            }
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
/* 65 */            if (arrayDeque != null) {
/* 67 */                Iterator it = arrayDeque.iterator();
/* 75 */                if (it.hasNext()) {
/* 82 */                    throw IIlIOloOOO.I000lI(it);
                        }
                    }
                }

                public IIloOI I00100l0() throws GeneralSecurityException, IOException {
/* 6 */             if (((O0OIIioi) this.I00io1l) == null) {
/* 371 */               IioIoO10iOiI.I000oI1ioi("cannot read or generate keyset");
/* 5 */                 return null;
                    }
/* 16 */            IIloOI iIloOI = new IIloOI(O0OOo0iol0I.I00II0Ol1O0l(), 18);
/* 21 */            O0OIIioi o0OIIioi = (O0OIIioi) this.I00io1l;
                    synchronized (iIloOI) {
/* 26 */                iIloOI.I00II0Ol1O0l(o0OIIioi.I00000oIO);
                    }
/* 46 */            int iI001iOo1i0O = OollIoO0.I00000oIO((O0OOo0iol0I) iIloOI.I00Io1o110i().I00iiI).I001l0I00().I001iOo1i0O();
                    synchronized (iIloOI) {
/* 65 */                for (int i = 0; i < ((O0OOo0iol0I) ((O0OO1oo) iIloOI.I00iiI).I00iiI).I001lIiIIo1O(); i++) {
                            try {
/* 75 */                        O0OOlOII0l0 o0OOlOII0l0I001l0I00 = ((O0OOo0iol0I) ((O0OO1oo) iIloOI.I00iiI).I00iiI).I001l0I00(i);
/* 83 */                        if (o0OOlOII0l0I001l0I00.I001l0I00() == iI001iOo1i0O) {
/* 95 */                            if (!o0OOlOII0l0I001l0I00.I001lllioOl().equals(O0OIII11.ENABLED)) {
/* 334 */                               throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iI001iOo1i0O);
                                    }
/* 99 */                            O0OO1oo o0OO1oo = (O0OO1oo) iIloOI.I00iiI;
/* 101 */                           o0OO1oo.I0000oI00();
/* 108 */                           ((O0OOo0iol0I) o0OO1oo.I00iiI).I00IO1oi11O(iI001iOo1i0O);
                                }
                            } catch (Throwable th) {
/* 365 */                       throw th;
                            }
                        }
/* 363 */               throw new GeneralSecurityException("key not found: " + iI001iOo1i0O);
                    }
/* 114 */           Context context = (Context) this.I00iiI;
/* 118 */           String str = (String) this.I00iiO;
/* 122 */           String str2 = (String) this.I00iio;
/* 124 */           if (str == null) {
/* 308 */               I000II.I000iOII("keysetName cannot be null");
/* 5 */                 return null;
                    }
/* 126 */           Context applicationContext = context.getApplicationContext();
/* 145 */           SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
/* 153 */           if (((I0Ooii0oll) this.I00ilO0) != null) {
/* 155 */               IoIlOo1o0IIl ioIlOo1o0IIlI00Io1o110i = iIloOI.I00Io1o110i();
/* 161 */               I0Ooii0oll i0Ooii0oll = (I0Ooii0oll) this.I00ilO0;
/* 163 */               byte[] bArr = new byte[0];
/* 167 */               O0OOo0iol0I o0OOo0iol0I = (O0OOo0iol0I) ioIlOo1o0IIlI00Io1o110i.I00iiI;
/* 173 */               byte[] bArrI00000oIO = i0Ooii0oll.I00000oIO(o0OOo0iol0I.I0000oI00(), bArr);
                        try {
/* 193 */                   if (!O0OOo0iol0I.I00IO1(i0Ooii0oll.I00000oOI(bArrI00000oIO, bArr), Il1llO11O.I00000oIO()).equals(o0OOo0iol0I)) {
/* 266 */                       throw new GeneralSecurityException("cannot encrypt keyset");
                            }
/* 195 */                   Il0IiIlOiOi il0IiIlOiOiI001l0I00 = Il0Iiol1o.I001l0I00();
/* 200 */                   IIO1i10I iIO1i10II0000oI00 = IIOI1Ii1I.I0000oI00(bArrI00000oIO, 0, bArrI00000oIO.length);
/* 204 */                   il0IiIlOiOiI001l0I00.I0000oI00();
/* 211 */                   ((Il0Iiol1o) il0IiIlOiOiI001l0I00.I00iiI).I001lllioOl(iIO1i10II0000oI00);
/* 214 */                   O0OiO1O00I o0OiO1O00II00000oIO = OollIoO0.I00000oIO(o0OOo0iol0I);
/* 218 */                   il0IiIlOiOiI001l0I00.I0000oI00();
/* 225 */                   ((Il0Iiol1o) il0IiIlOiOiI001l0I00.I00iiI).I001lloI(o0OiO1O00II00000oIO);
/* 250 */                   if (!editorEdit.putString(str, ilo01iOOoO0l.I00000oOI(((Il0Iiol1o) il0IiIlOiOiI001l0I00.I00000oOI()).I0000oI00())).commit()) {
/* 255 */                       IioIoO10iOiI.I000OOo1O("Failed to write to SharedPreferences");
/* 5 */                         return null;
                            }
                        } catch (O000oiiiOI0 unused) {
/* 269 */                   IioIoO10iOiI.I000oI1ioi("invalid keyset, corrupted key material");
/* 5 */                     return null;
                        }
                    } else if (!editorEdit.putString(str, ilo01iOOoO0l.I00000oOI(((O0OOo0iol0I) iIloOI.I00Io1o110i().I00iiI).I0000oI00())).commit()) {
/* 302 */               IioIoO10iOiI.I000OOo1O("Failed to write to SharedPreferences");
/* 5 */                 return null;
                    }
/* 299 */           return iIloOI;
                }

                public I0IiOl1oIloO I0010I0i(IIo0l1 iIo0l1) {
                    Object i0IiOl1oIloO;
/* 3 */             lOo0I0iOi11O.I00000oIO("CX:getCameraInfo");
                    try {
/* 20 */                IIllOioOlolI iIllOioOlolII0010o = iIo0l1.I0000Il00O(((IIoIloi0) this.I00io1l).I00000oIO.I0000Il00O()).I0010o();
/* 24 */                IIlIoiO iIlIoiOI00100o1O0lo = I00100o1O0lo(iIo0l1);
/* 35 */                IIllII iIllIII00000oIO = iOillilIolO.I00000oIO(iIllOioOlolII0010o.I0001Ioi1lo(), null, iIlIoiOI00100o1O0lo.I00iOIl);
                        synchronized (this.I00iiO) {
/* 46 */                    i0IiOl1oIloO = ((HashMap) this.I00iiI).get(iIllIII00000oIO);
/* 50 */                    if (i0IiOl1oIloO == null) {
/* 54 */                        i0IiOl1oIloO = new I0IiOl1oIloO(iIllOioOlolII0010o, iIlIoiOI00100o1O0lo);
/* 61 */                        ((HashMap) this.I00iiI).put(iIllIII00000oIO, i0IiOl1oIloO);
                            }
                        }
/* 68 */                return (I0IiOl1oIloO) i0IiOl1oIloO;
                    } finally {
/* 77 */                Trace.endSection();
                    }
                }

                public List I0010o() {
/* 11 */            return IOOi0Ool1i.I00iIi0i1o(((Map) this.I00ioIO).values());
                }

                public void I00111O(IIoIloi0 iIoIloi0, Context context) {
                    IIo0IOlilI iIo0IOlilI;
                    synchronized (this.I00iiO) {
/* 4 */                 this.I00io1l = iIoIloi0;
/* 6 */                 if (iIoIloi0 != null && (iIo0IOlilI = iIoIloi0.I000o00OoI0I) != null) {
/* 12 */                    ScheduledExecutorService scheduledExecutorServiceI0000O = O1OIIoio0i1.I0000O();
/* 18 */                    IIo01Oii0 iIo01Oii0 = new IIo01Oii0();
/* 21 */                    iIo01Oii0.I00000oIO = this;
/* 23 */                    iIo01Oii0.I00000oOI = scheduledExecutorServiceI0000O;
/* 25 */                    VarHandle.storeStoreFence();
/* 30 */                    iIo0IOlilI.I000o00OoI0I.add(iIo01Oii0);
/* 37 */                    I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(10);
/* 40 */                    i0iOo0oioiO.I00iiI = iIo0IOlilI;
/* 42 */                    i0iOo0oioiO.I00iiO = this;
/* 44 */                    VarHandle.storeStoreFence();
/* 49 */                    ((Io11oioo) scheduledExecutorServiceI0000O).execute(i0iOo0oioiO);
                        }
                    }
                }

                public void I001IIilI0O(boolean z) {
                    HashMap map;
/* 14 */            if (((AtomicReference) this.I00io1l).compareAndSet(null, Boolean.valueOf(z))) {
                        synchronized (this) {
/* 24 */                    map = new HashMap((HashMap) this.I00iiI);
                        }
/* 28 */                I000oI1ioi(map, z);
                    }
                }

                @Override
                public void I001IO000(OI1Iio0ii1 oI1Iio0ii1, IOIOo1o iOIOo1o) {
/* 10 */            ((HashMap) this.I00iiI).put(oI1Iio0ii1, new O0IiIOO(iOIOo1o));
                }

                public OoOOiO I001i1O0Ol(int i) {
/* 13 */            OoOOiO ooOOiO = (OoOOiO) ((Map) this.I00ioIO).get(Integer.valueOf(i));
/* 15 */            if (ooOOiO != null) {
/* 77 */                return ooOOiO;
                    }
/* 19 */            IOiOol0 iOiOol0 = (IOiOol0) this.I00iiO;
/* 21 */            if (iOiOol0 != null) {
/* 23 */                return iOiOol0.I001i1O0Ol(i);
                    }
/* 28 */            return null;
                }

                @Override
                public O0iI1ol I001i1lo1io(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             I0Oi111ii i0Oi111ii = (I0Oi111ii) this.I00iiO;
/* 8 */             iOliil ioliil = new iOliil(2);
/* 11 */            ioliil.I00iiO = i0Oi111ii;
/* 13 */            ioliil.I00iio = oI1Iio0ii1;
/* 15 */            ioliil.I00ilI0I1 = this;
/* 22 */            ioliil.I00iiI = new ArrayList();
/* 24 */            VarHandle.storeStoreFence();
/* 29 */            return ioliil;
                }

                @Override
                public void I001iOo1i0O(OI1Iio0ii1 oI1Iio0ii1, IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii12) {
/* 10 */            ((HashMap) this.I00iiI).put(oI1Iio0ii1, new Il0o0Oii0I(iOIOill, oI1Iio0ii12));
                }

                public void I001l0I00() {
/* 17 */            for (IOiIi0Oi iOiIi0Oi : ((HashMap) this.I00iiI).keySet()) {
/* 35 */                for (IiIooooiilo iiIooooiilo : iOiIi0Oi.I0000Il00O) {
/* 46 */                    if (iiIooooiilo.I00000oOI == 2 && !((HashMap) this.I00iio).containsKey(iiIooooiilo.I00000oIO)) {
/* 62 */                        HashMap map = (HashMap) this.I00iio;
/* 64 */                        OOiilOlOOI oOiilOlOOI = iiIooooiilo.I00000oIO;
/* 66 */                        Set set = Collections.EMPTY_SET;
/* 72 */                        O0o11IlioI o0o11IlioI = new O0o11IlioI();
/* 76 */                        o0o11IlioI.I00000oOI = null;
/* 87 */                        o0o11IlioI.I00000oIO = Collections.newSetFromMap(new ConcurrentHashMap());
/* 91 */                        o0o11IlioI.I00000oIO.addAll(set);
/* 94 */                        map.put(oOiilOlOOI, o0o11IlioI);
                            } else if (((HashMap) this.I00iiO).containsKey(iiIooooiilo.I00000oIO)) {
                                continue;
                            } else {
/* 110 */                       int i = iiIooooiilo.I00000oOI;
/* 113 */                       if (i == 1) {
/* 170 */                           throw new IiO00oI1oiIo("Unsatisfied dependency for component " + iOiIi0Oi + ": " + iiIooooiilo.I00000oIO, 1);
                                }
/* 115 */                       if (i != 2) {
/* 120 */                           HashMap map2 = (HashMap) this.I00iiO;
/* 122 */                           OOiilOlOOI oOiilOlOOI2 = iiIooooiilo.I00000oIO;
/* 126 */                           OIiilo1Ool0o oIiilo1Ool0o = OIiioO1l.I0000Il00O;
/* 128 */                           IOiOoIO1OI iOiOoIO1OI = OIiioO1l.I0000O;
/* 130 */                           OIiioO1l oIiioO1l = new OIiioO1l();
/* 133 */                           oIiioO1l.I00000oIO = oIiilo1Ool0o;
/* 135 */                           oIiioO1l.I00000oOI = iOiOoIO1OI;
/* 137 */                           map2.put(oOiilOlOOI2, oIiioO1l);
                                }
                            }
                        }
                    }
                }

                public ArrayList I001lIiIIo1O(ArrayList arrayList) {
/* 3 */             HashMap map = (HashMap) this.I00iiO;
/* 7 */             ArrayList arrayList2 = new ArrayList();
/* 10 */            Iterator it = arrayList.iterator();
/* 18 */            while (it.hasNext()) {
/* 24 */                IOiIi0Oi iOiIi0Oi = (IOiIi0Oi) it.next();
/* 28 */                if (iOiIi0Oi.I0000oI00 == 0) {
/* 38 */                    OOiO0Il oOiO0Il = (OOiO0Il) ((HashMap) this.I00iiI).get(iOiIi0Oi);
/* 50 */                    for (OOiilOlOOI oOiilOlOOI : iOiIi0Oi.I00000oOI) {
/* 62 */                        if (map.containsKey(oOiilOlOOI)) {
/* 74 */                            OIiioO1l oIiioO1l = (OIiioO1l) ((OOiO0Il) map.get(oOiilOlOOI));
/* 80 */                            I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(19);
/* 83 */                            i0iOo0oioiO.I00iiI = oIiioO1l;
/* 85 */                            i0iOo0oioiO.I00iiO = oOiO0Il;
/* 87 */                            VarHandle.storeStoreFence();
/* 90 */                            arrayList2.add(i0iOo0oioiO);
                                } else {
/* 64 */                            map.put(oOiilOlOOI, oOiO0Il);
                                }
                            }
                        }
                    }
/* 168 */           return arrayList2;
                }

                public ArrayList I001lllioOl() {
/* 3 */             HashMap map = (HashMap) this.I00iio;
/* 7 */             ArrayList arrayList = new ArrayList();
/* 12 */            HashMap map2 = new HashMap();
/* 31 */            for (Map.Entry entry : ((HashMap) this.I00iiI).entrySet()) {
/* 43 */                IOiIi0Oi iOiIi0Oi = (IOiIi0Oi) entry.getKey();
/* 47 */                if (iOiIi0Oi.I0000oI00 != 0) {
/* 54 */                    OOiO0Il oOiO0Il = (OOiO0Il) entry.getValue();
/* 66 */                    for (OOiilOlOOI oOiilOlOOI : iOiIi0Oi.I00000oOI) {
/* 78 */                        if (!map2.containsKey(oOiilOlOOI)) {
/* 85 */                            map2.put(oOiilOlOOI, new HashSet());
                                }
/* 94 */                        ((Set) map2.get(oOiilOlOOI)).add(oOiO0Il);
                            }
                        }
                    }
/* 110 */           for (Map.Entry entry2 : map2.entrySet()) {
/* 126 */               if (map.containsKey(entry2.getKey())) {
/* 178 */                   O0o11IlioI o0o11IlioI = (O0o11IlioI) map.get(entry2.getKey());
/* 194 */                   for (OOiO0Il oOiO0Il2 : (Set) entry2.getValue()) {
/* 206 */                       I0iOo0oioiO i0iOo0oioiO = new I0iOo0oioiO(20);
/* 209 */                       i0iOo0oioiO.I00iiI = o0o11IlioI;
/* 211 */                       i0iOo0oioiO.I00iiO = oOiO0Il2;
/* 213 */                       VarHandle.storeStoreFence();
/* 216 */                       arrayList.add(i0iOo0oioiO);
                            }
                        } else {
/* 132 */                   OOiilOlOOI oOiilOlOOI2 = (OOiilOlOOI) entry2.getKey();
/* 140 */                   Set set = (Set) ((Collection) entry2.getValue());
/* 144 */                   O0o11IlioI o0o11IlioI2 = new O0o11IlioI();
/* 148 */                   o0o11IlioI2.I00000oOI = null;
/* 159 */                   o0o11IlioI2.I00000oIO = Collections.newSetFromMap(new ConcurrentHashMap());
/* 163 */                   o0o11IlioI2.I00000oIO.addAll(set);
/* 166 */                   map.put(oOiilOlOOI2, o0o11IlioI2);
                        }
                    }
/* 245 */           return arrayList;
                }

                public IIloOI I00II0Ol1O0l(byte[] bArr) {
                    try {
/* 14 */                this.I00ilO0 = new I0oO1Io0l().I0000Il00O((String) this.I00ilI0I1);
                        try {
/* 20 */                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
/* 25 */                    Oi1ol0llI oi1ol0llI = new Oi1ol0llI(4, false);
/* 28 */                    oi1ol0llI.I00iiI = byteArrayInputStream;
/* 30 */                    VarHandle.storeStoreFence();
/* 55 */                    return new IIloOI((O0OO1oo) ((O0OOo0iol0I) IoIlOo1o0IIl.I00IioO0OiOi(oi1ol0llI, (I0Ooii0oll) this.I00ilO0).I00iiI).I001i1lo1io(), 18);
                        } catch (IOException | GeneralSecurityException e) {
                            try {
/* 60 */                        return I001lloI(bArr);
                            } catch (IOException unused) {
/* 65 */                        throw e;
                            }
                        }
                    } catch (GeneralSecurityException | ProviderException e2) {
                        try {
/* 67 */                    IIloOI iIloOII001lloI = I001lloI(bArr);
/* 75 */                    Log.w("Oi00IilOloo0", "cannot use Android Keystore, it'll be disabled", e2);
/* 78 */                    return iIloOII001lloI;
                        } catch (IOException unused2) {
/* 168 */                   throw e2;
                        }
                    }
                }

                public I0Ooii0oll I00II0oii1o() throws KeyStoreException {
/* 7 */             I0oO1Io0l i0oO1Io0l = new I0oO1Io0l();
                    try {
/* 15 */                boolean zI00000oIO = I0oO1Io0l.I00000oIO((String) this.I00ilI0I1);
                        try {
/* 23 */                    return i0oO1Io0l.I0000Il00O((String) this.I00ilI0I1);
                        } catch (GeneralSecurityException | ProviderException e) {
/* 29 */                    if (!zI00000oIO) {
/* 52 */                        throw new KeyStoreException(IlIi0I0.I000lI("the master key ", (String) this.I00ilI0I1, " exists but is unusable"), e);
                            }
/* 31 */                    Log.w("Oi00IilOloo0", "cannot use Android Keystore, it'll be disabled", e);
/* 10 */                    return null;
                        }
                    } catch (GeneralSecurityException | ProviderException e2) {
/* 54 */                Log.w("Oi00IilOloo0", "cannot use Android Keystore, it'll be disabled", e2);
/* 10 */                return null;
                    }
                }

                @Override
                public O0iI0IlO0iI I00IO1(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            IOiOol0 iOiOol0I00II0oii1o = ((I0Oi111ii) this.I00iiO).I00II0oii1o(iOIOill, OlI1o0ooI.I00IO1, arrayList);
/* 20 */            I1ii1o0 i1ii1o0 = new I1ii1o0(3, false);
/* 23 */            i1ii1o0.I00iiO = iOiOol0I00II0oii1o;
/* 25 */            i1ii1o0.I00iio = this;
/* 27 */            i1ii1o0.I00ilI0I1 = oI1Iio0ii1;
/* 29 */            i1ii1o0.I00ilO0 = arrayList;
/* 31 */            i1ii1o0.I00iiI = iOiOol0I00II0oii1o;
/* 33 */            VarHandle.storeStoreFence();
/* 37 */            return i1ii1o0;
                }

                public void I00IO1oi11O(int i) {
                    IIo0ii1Oi iIo0ii1Oi;
/* 3 */             IIoIloi0 iIoIloi0 = (IIoIloi0) this.I00io1l;
/* 5 */             if (iIoIloi0 != null) {
/* 7 */                 IIlOoolol0ll iIlOoolol0ll = iIoIloi0.I000II;
/* 9 */                 if (iIlOoolol0ll == null) {
/* 107 */                   I000II.I001IO000("CameraX not initialized yet.");
/* 168 */                   return;
                        }
/* 13 */                IIlOO01iI iIlOO01iI = (IIlOO01iI) iIlOoolol0ll.I00io1l;
                        synchronized (iIlOO01iI.I00000oOI) {
/* 18 */                    iIlOO01iI.I0001Ioi1lo = i;
/* 20 */                    iIo0ii1Oi = iIlOO01iI.I0000Il00O;
                        }
/* 23 */                if (iIo0ii1Oi == null) {
/* 101 */                   return;
                        }
/* 33 */                boolean z = i == 2;
/* 34 */                iIlOO01iI.I000II = z;
/* 36 */                if (!z) {
/* 40 */                    iIlOO01iI.I0000O = Il01100l.I00iOIl;
                        }
/* 46 */                Iterator it = iIo0ii1Oi.I0000Il00O().iterator();
/* 54 */                while (it.hasNext()) {
/* 60 */                    IIllOo0 iIllOo0 = (IIllOo0) it.next();
/* 69 */                    IIlll1OOiIO1 iIlll1OOiIO1 = iIllOo0 instanceof IIlll1OOiIO1 ? (IIlll1OOiIO1) iIllOo0 : null;
/* 70 */                    if (iIlll1OOiIO1 != null) {
/* 72 */                        if (i == 1) {
/* 89 */                            OolOO1oOoo oolOO1oOoo = iIlll1OOiIO1.I00iOIl;
                                    synchronized (oolOO1oOoo.I000oI1ioi) {
/* 94 */                                oolOO1oOoo.I0010o = true;
                                    }
                                } else if (i != 2) {
                                    continue;
                                } else {
/* 77 */                            OolOO1oOoo oolOO1oOoo2 = iIlll1OOiIO1.I00iOIl;
                                    synchronized (oolOO1oOoo2.I000oI1ioi) {
/* 82 */                                oolOO1oOoo2.I0010o = false;
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:108:0x02eb  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x03a7  */
                /* JADX WARN: Removed duplicated region for block: B:154:0x03b3 A[PHI: r4
                  0x03b3: PHI (r4v6 Ol0O0iI0l0O) = (r4v5 Ol0O0iI0l0O), (r4v17 Ol0O0iI0l0O) binds: [B:158:0x03cc, B:152:0x03a5] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0122  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
                /* JADX WARN: Type inference failed for: r8v27 */
                /* JADX WARN: Type inference failed for: r8v28, types: [OlIo1I] */
                /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r8v32, types: [OlIo1I] */
                /* JADX WARN: Type inference failed for: r8v33, types: [OlIo0i1IO, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Ol0O0iI0l0O I00IOO(OOi001oo1OOI oOi001oo1OOI, boolean z) {
                    OoOIOoO1I ooOIOoO1II0000Il00O;
                    IOIiO1lIl0l iOIiO1lIl0lI00Io1o110i;
                    Object next;
                    OOi001oo1OOI oOi001oo1OOI2;
                    Ol0O0iI0l0O ol0O0iI0l0OI0000Il00O;
                    Ol0O0iI0l0O ol0O0iI0l0OI0000O;
                    Illo0o illo0oI0000oI00;
                    OoOi1Ol ooOi1Ol;
                    O0iIl1 o0iIl1I00000oOI;
                    int size;
                    I11IlOOO i11IlOOO;
                    Ooo0Ioii0o0 ooo0Ioii0o0;
                    ?? olIo1I;
/* 7 */             IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) this.I00iiI;
/* 11 */            Oi0Oooi oi0Oooi = (Oi0Oooi) iiOili0lOO1.I00ilI0I1;
/* 15 */            Ii1Ool1 ii1Ool1 = (Ii1Ool1) iiOili0lOO1.I00iio;
/* 19 */            Ii10lIo0l1 ii10lIo0l1 = (Ii10lIo0l1) iiOili0lOO1.I00iiI;
/* 27 */            if (oOi001oo1OOI.I00100o1O0lo()) {
/* 41 */                if (l1iI1lOO.I00000oIO((OI1IlOlol) iiOili0lOO1.I00iiO, oOi001oo1OOI.I00l0I0l0lO1).I0000Il00O) {
/* 51 */                    ((iOloo0O0O) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000II).getClass();
                        }
                    } else if ((oOi001oo1OOI.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 72 */                if (l1iI1lOO.I00000oIO((OI1IlOlol) iiOili0lOO1.I00iiO, oOi001oo1OOI.I00ll1).I0000Il00O) {
/* 82 */                    ((iOloo0O0O) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000II).getClass();
                        }
                    }
/* 90 */            if (!oOi001oo1OOI.I00100o1O0lo()) {
/* 118 */               int i = oOi001oo1OOI.I00iiO;
/* 124 */               if ((i & 32) == 32) {
/* 128 */                   iOIiO1lIl0lI00Io1o110i = I001i1O0Ol(oOi001oo1OOI.I00l0OO0IO);
/* 132 */                   if (iOIiO1lIl0lI00Io1o110i == null) {
/* 134 */                       Il0ooiloI il0ooiloI = Il0ooiloI.I00000oIO;
/* 152 */                       ooOIOoO1II0000Il00O = Il0ooiloI.I0000Il00O(Il0ooO1IO.I00o0iI0io1, String.valueOf(oOi001oo1OOI.I00l0OO0IO), (String) this.I00ilI0I1);
                            }
                        } else if ((i & 64) == 64) {
/* 170 */                   String string = ((OI1IlOlol) iiOili0lOO1.I00iiO).getString(oOi001oo1OOI.I00li1OI);
/* 180 */                   Iterator it = I0010o().iterator();
                            while (true) {
/* 188 */                       if (!it.hasNext()) {
/* 212 */                           next = null;
                                    break;
                                }
/* 190 */                       next = it.next();
/* 209 */                       if (O0000Ioio00.I0000O(((OoOOiO) next).getName().I00000oOI(), string)) {
                                    break;
                                }
                            }
/* 214 */                   OoOOiO ooOOiO = (OoOOiO) next;
/* 216 */                   if (ooOOiO == null) {
/* 218 */                       Il0ooiloI il0ooiloI2 = Il0ooiloI.I00000oIO;
/* 230 */                       ooOIOoO1II0000Il00O = Il0ooiloI.I0000Il00O(Il0ooO1IO.I00o0l1o1o0, string, ii1Ool1.toString());
                            } else {
/* 235 */                       iOIiO1lIl0lI00Io1o110i = ooOOiO;
                            }
                        } else if ((i & Barcode.FORMAT_ITF) == 128) {
/* 255 */                   iOIiO1lIl0lI00Io1o110i = (IOIiO1lIl0l) ((I1ooIoloo0) this.I00io1l).invoke(Integer.valueOf(oOi001oo1OOI.I00ll1));
/* 257 */                   if (iOIiO1lIl0lI00Io1o110i == null) {
/* 261 */                       iOIiO1lIl0lI00Io1o110i = I00Io1o110i(this, oOi001oo1OOI, oOi001oo1OOI.I00ll1);
                            }
                        } else {
/* 270 */                   Il0ooiloI il0ooiloI3 = Il0ooiloI.I00000oIO;
/* 276 */                   ooOIOoO1II0000Il00O = Il0ooiloI.I0000Il00O(Il0ooO1IO.I00oI0i, new String[0]);
                        }
/* 288 */               int i2 = 1;
/* 289 */               if (!Il0ooiloI.I0000oI00(ooOIOoO1II0000Il00O.I00100o1O0lo())) {
/* 291 */                   Il0ooiloI il0ooiloI4 = Il0ooiloI.I00000oIO;
/* 311 */                   return Il0ooiloI.I0000O(Il0ooO1IO.I00ol1, Il01100l.I00iOIl, ooOIOoO1II0000Il00O, (String[]) Arrays.copyOf(new String[]{ooOIOoO1II0000Il00O.toString()}, 1));
                        }
/* 320 */               O1I0OloI o1I0OloI = (O1I0OloI) ii10lIo0l1.I00000oIO;
/* 326 */               I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(29);
/* 329 */               i01illiil1Oo.I00iiO = this;
/* 331 */               i01illiil1Oo.I00iiI = oOi001oo1OOI;
/* 333 */               VarHandle.storeStoreFence();
/* 336 */               IiOillIi iiOillIi = new IiOillIi(o1I0OloI, i01illiil1Oo);
/* 343 */               OoOI1i1i ooOI1i1iI00IlilI0i0i = I00IlilI0i0i((List) ii10lIo0l1.I00100o1O0lo, iiOillIi);
/* 347 */               ArrayList arrayListI00IioO0OiOi = I00IioO0OiOi(oOi001oo1OOI, this);
/* 359 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00IioO0OiOi, 10));
/* 362 */               Iterator it2 = arrayListI00IioO0OiOi.iterator();
/* 366 */               int i3 = 0;
/* 371 */               while (it2.hasNext()) {
/* 373 */                   Object next2 = it2.next();
/* 377 */                   int i4 = i3 + 1;
/* 379 */                   if (i3 < 0) {
/* 530 */                       IOOi1I.I000lI();
/* 533 */                       throw null;
                            }
/* 381 */                   OOOooIOl oOOooIOl = (OOOooIOl) next2;
/* 391 */                   OoOOiO ooOOiO2 = (OoOOiO) IOOi0Ool1i.I00II0oii1o(i3, ooOIOoO1II0000Il00O.I000II());
/* 393 */                   OOOoil1l010 oOOoil1l010 = oOOooIOl.I00iiO;
/* 399 */                   if (oOOoil1l010 != OOOoil1l010.STAR) {
/* 432 */                       int iOrdinal = oOOoil1l010.ordinal();
/* 437 */                       if (iOrdinal == 0) {
/* 462 */                           ooo0Ioii0o0 = Ooo0Ioii0o0.I00iio;
                                } else if (iOrdinal == i2) {
/* 459 */                           ooo0Ioii0o0 = Ooo0Ioii0o0.I00ilI0I1;
                                } else {
/* 441 */                           if (iOrdinal != 2) {
/* 444 */                               if (iOrdinal != 3) {
/* 446 */                                   I000II.I00000oIO();
/* 395 */                                   return null;
                                        }
/* 452 */                               IioIoO10iOiI.I000OiO("Only IN, OUT and INV are supported. Actual argument: ", oOOoil1l010);
/* 395 */                               return null;
                                    }
/* 456 */                           ooo0Ioii0o0 = Ooo0Ioii0o0.I00iiO;
                                }
/* 464 */                       int i5 = oOOooIOl.I00iiI;
/* 485 */                       OOi001oo1OOI oOi001oo1OOII00100l0 = (i5 & 2) == 2 ? oOOooIOl.I00iio : (i5 & 4) == 4 ? oi0Oooi.I00100l0(oOOooIOl.I00ilI0I1) : null;
/* 515 */                       olIo1I = oOi001oo1OOII00100l0 == null ? new OlIo1I(Il0ooiloI.I00000oOI(Il0ooO1IO.I00ooIo0, oOOooIOl.toString())) : new OlIo1I(I00Io1lO(oOi001oo1OOII00100l0), ooo0Ioii0o0);
                            } else if (ooOOiO2 == null) {
/* 409 */                       O0i1lI0o1io o0i1lI0o1ioI0000O = ((OI0010oo1o) ii10lIo0l1.I00000oOI).I0000O();
/* 413 */                       olIo1I = new OlIo0i1IO();
/* 420 */                       olIo1I.I00000oIO = o0i1lI0o1ioI0000O.I000oI1ioi();
/* 422 */                       VarHandle.storeStoreFence();
                            } else {
/* 428 */                       olIo1I = new OlIo1I(ooOOiO2);
                            }
/* 519 */                   arrayList.add(olIo1I);
/* 522 */                   i3 = i4;
/* 524 */                   i2 = 1;
                        }
/* 536 */               List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(arrayList);
/* 540 */               IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = ooOIOoO1II0000Il00O.I00100o1O0lo();
/* 544 */               if (z && (iOIiO1lIl0lI00100o1O0lo instanceof IiOoI0oI)) {
/* 550 */                   IiOoI0oI iiOoI0oI = (IiOoI0oI) iOIiO1lIl0lI00100o1O0lo;
/* 556 */                   i1O01Ill i1o01ill = new i1O01Ill(16);
/* 561 */                   List listI000II = iiOoI0oI.I00ioIO.I000II();
/* 573 */                   ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI000II, 10));
/* 576 */                   Iterator it3 = listI000II.iterator();
/* 584 */                   while (it3.hasNext()) {
/* 596 */                       arrayList2.add(((OoOOiO) it3.next()).I010i10l());
                            }
/* 607 */                   Map mapI000OiO = O1Oii0O0loo.I000OiO(IOOi0Ool1i.I00ilO0(arrayList2, listI00iIi0i1o));
/* 615 */                   iOliil ioliil = new iOliil(13);
/* 618 */                   oOi001oo1OOI2 = null;
/* 620 */                   ioliil.I00iiI = null;
/* 622 */                   ioliil.I00iiO = iiOoI0oI;
/* 624 */                   ioliil.I00iio = listI00iIi0i1o;
/* 626 */                   ioliil.I00ilI0I1 = mapI000OiO;
/* 628 */                   VarHandle.storeStoreFence();
/* 633 */                   OoOI1i1i.I00iiI.getClass();
/* 648 */                   Ol0O0iI0l0O ol0O0iI0l0OI0000O2 = i1o01ill.I0000O(ioliil, OoOI1i1i.I00iiO, false, 0, true);
/* 654 */                   List list = (List) ii10lIo0l1.I00100o1O0lo;
/* 660 */                   ArrayList arrayListI00O0i0ii = IOOi0Ool1i.I00O0i0ii(iiOillIi, ol0O0iI0l0OI0000O2.getAnnotations());
/* 668 */                   if (arrayListI00O0i0ii.isEmpty()) {
/* 670 */                       i11IlOOO = i1i0olI.I00iiO;
                            } else {
/* 675 */                       I11Io0oil0i0 i11Io0oil0i0 = new I11Io0oil0i0();
/* 678 */                       i11Io0oil0i0.I00iiI = arrayListI00O0i0ii;
/* 680 */                       VarHandle.storeStoreFence();
/* 683 */                       i11IlOOO = i11Io0oil0i0;
                            }
/* 706 */                   ol0O0iI0l0OI0000Il00O = ol0O0iI0l0OI0000O2.I00li1OI(OoOilo0Oliii.I0000oI00(ol0O0iI0l0OI0000O2) || oOi001oo1OOI.I00ilI0I1).I00lli11(I00IlilI0i0i(list, i11IlOOO));
                        } else {
/* 712 */                   oOi001oo1OOI2 = null;
/* 722 */                   boolean zBooleanValue = IlO1il.I00000oIO.I0000oI00(oOi001oo1OOI.I00o101lO).booleanValue();
/* 726 */                   boolean z2 = oOi001oo1OOI.I00ilI0I1;
/* 728 */                   if (zBooleanValue) {
/* 742 */                       int size2 = ooOIOoO1II0000Il00O.I000II().size() - listI00iIi0i1o.size();
/* 743 */                       if (size2 != 0) {
/* 770 */                           ol0O0iI0l0OI0000O = (size2 == 1 && (size = listI00iIi0i1o.size() - 1) >= 0) ? l0loOIIo0iOo.I0000Il00O(ooOI1i1iI00IlilI0i0i, ooOIOoO1II0000Il00O.I0000O().I001IO000(size).I000OOo1O(), listI00iIi0i1o, z2) : null;
/* 934 */                           if (ol0O0iI0l0OI0000O != null) {
/* 936 */                               Il0ooiloI il0ooiloI5 = Il0ooiloI.I00000oIO;
/* 943 */                               ol0O0iI0l0OI0000Il00O = Il0ooiloI.I0000O(Il0ooO1IO.I00o101lO, listI00iIi0i1o, ooOIOoO1II0000Il00O, new String[0]);
                                    } else {
/* 948 */                               ol0O0iI0l0OI0000Il00O = ol0O0iI0l0OI0000O;
                                    }
                                } else {
/* 776 */                           Ol0O0iI0l0O ol0O0iI0l0OI0000Il00O2 = l0loOIIo0iOo.I0000Il00O(ooOI1i1iI00IlilI0i0i, ooOIOoO1II0000Il00O, listI00iIi0i1o, z2);
/* 784 */                           IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo2 = ol0O0iI0l0OI0000Il00O2.I00iOIl().I00100o1O0lo();
/* 788 */                           if (iOIiO1lIl0lI00100o1O0lo2 != null && (iOIiO1lIl0lI00100o1O0lo2 instanceof OI000ilOol) && O0i1lI0o1io.I00IioO0OiOi(iOIiO1lIl0lI00100o1O0lo2)) {
/* 803 */                               int i6 = IiOiOOIo.I00000oIO;
/* 809 */                               illo0oI0000oI00 = ilioooOo11.I0000oI00(IiOiIO0i1Oil.I0001Ioi1lo(iOIiO1lIl0lI00100o1O0lo2));
                                    } else {
/* 801 */                               illo0oI0000oI00 = null;
                                    }
/* 819 */                           if (O0000Ioio00.I0000O(illo0oI0000oI00, Illo01lli.I0000Il00O) && (ooOi1Ol = (OoOi1Ol) IOOi0Ool1i.I00IoIO0lI(ilioooOo11.I000II(ol0O0iI0l0OI0000Il00O2))) != null && (o0iIl1I00000oOI = ooOi1Ol.I00000oOI()) != null) {
/* 845 */                               IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo3 = o0iIl1I00000oOI.I00iOIl().I00100o1O0lo();
/* 856 */                               Ill0IO ill0IOI000II = iOIiO1lIl0lI00100o1O0lo3 != null ? IiOiOOIo.I000II(iOIiO1lIl0lI00100o1O0lo3) : null;
/* 866 */                               if (o0iIl1I00000oOI.I00OIl().size() == 1 && (O0000Ioio00.I0000O(ill0IOI000II, OlIlllOI1.I000II) || O0000Ioio00.I0000O(ill0IOI000II, OoOIo0li.I00000oIO))) {
/* 895 */                                   O0iIl1 o0iIl1I00000oOI2 = ((OoOi1Ol) IOOi0Ool1i.I00OilO00Il(o0iIl1I00000oOI.I00OIl())).I00000oOI();
/* 906 */                                   IIiIoIl11IO iIiIoIl11IO = ii1Ool1 instanceof IIiIoIl11IO ? (IIiIoIl11IO) ii1Ool1 : null;
/* 928 */                                   ol0O0iI0l0OI0000O = O0000Ioio00.I0000O(iIiIoIl11IO != null ? IiOiOOIo.I0000Il00O(iIiIoIl11IO) : null, Oll0iIil0.I00000oIO) ? I000o00OoI0I(ol0O0iI0l0OI0000Il00O2, o0iIl1I00000oOI2) : I000o00OoI0I(ol0O0iI0l0OI0000Il00O2, o0iIl1I00000oOI2);
                                        } else {
/* 933 */                                   ol0O0iI0l0OI0000O = ol0O0iI0l0OI0000Il00O2;
                                        }
                                    }
/* 934 */                           if (ol0O0iI0l0OI0000O != null) {
                                    }
                                }
                            } else {
/* 950 */                       ol0O0iI0l0OI0000Il00O = l0loOIIo0iOo.I0000Il00O(ooOI1i1iI00IlilI0i0i, ooOIOoO1II0000Il00O, listI00iIi0i1o, z2);
/* 966 */                       if (IlO1il.I00000oOI.I0000oI00(oOi001oo1OOI.I00o101lO).booleanValue()) {
/* 969 */                           ol0O0iI0l0OI0000O = lo1iloiI1.I0000O(ol0O0iI0l0OI0000Il00O, true);
/* 973 */                           if (ol0O0iI0l0OI0000O == null) {
/* 1004 */                              throw new IllegalStateException(("null DefinitelyNotNullType for '" + ol0O0iI0l0OI0000Il00O + '\'').toString());
                                    }
/* 948 */                           ol0O0iI0l0OI0000Il00O = ol0O0iI0l0OI0000O;
                                }
                            }
                        }
/* 1005 */              int i7 = oOi001oo1OOI.I00iiO;
/* 1028 */              OOi001oo1OOI oOi001oo1OOII00100l02 = (i7 & Barcode.FORMAT_UPC_E) == 1024 ? oOi001oo1OOI.I00o0iI0io1 : (i7 & Barcode.FORMAT_PDF417) == 2048 ? oi0Oooi.I00100l0(oOi001oo1OOI.I00o0l1o1o0) : oOi001oo1OOI2;
                        return oOi001oo1OOII00100l02 != null ? lOOIol01.I0000Il00O(ol0O0iI0l0OI0000Il00O, I00IOO(oOi001oo1OOII00100l02, false)) : ol0O0iI0l0OI0000Il00O;
                    }
/* 106 */           iOIiO1lIl0lI00Io1o110i = (IOIiO1lIl0l) ((I1ooIoloo0) this.I00ilO0).invoke(Integer.valueOf(oOi001oo1OOI.I00l0I0l0lO1));
/* 108 */           if (iOIiO1lIl0lI00Io1o110i == null) {
/* 112 */               iOIiO1lIl0lI00Io1o110i = I00Io1o110i(this, oOi001oo1OOI, oOi001oo1OOI.I00l0I0l0lO1);
                    }
/* 265 */           ooOIOoO1II0000Il00O = iOIiO1lIl0lI00Io1o110i.I000OOo1O();
/* 288 */           int i22 = 1;
/* 289 */           if (!Il0ooiloI.I0000oI00(ooOIOoO1II0000Il00O.I00100o1O0lo())) {
                    }
                }

                public O0iIl1 I00Io1lO(OOi001oo1OOI oOi001oo1OOI) {
/* 3 */             IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) this.I00iiI;
/* 10 */            if ((oOi001oo1OOI.I00iiO & 2) != 2) {
/* 70 */                return I00IOO(oOi001oo1OOI, true);
                    }
/* 18 */            String string = ((OI1IlOlol) iiOili0lOO1.I00iiO).getString(oOi001oo1OOI.I00ilO0);
/* 22 */            Ol0O0iI0l0O ol0O0iI0l0OI00IOO = I00IOO(oOi001oo1OOI, true);
/* 28 */            Oi0Oooi oi0Oooi = (Oi0Oooi) iiOili0lOO1.I00ilI0I1;
/* 30 */            int i = oOi001oo1OOI.I00iiO;
/* 65 */            return ((IlOIOol) ((Ii10lIo0l1) iiOili0lOO1.I00iiI).I000OOo1O).I00000oOI(oOi001oo1OOI, string, ol0O0iI0l0OI00IOO, I00IOO((i & 4) == 4 ? oOi001oo1OOI.I00io1l : (i & 8) == 8 ? oi0Oooi.I00100l0(oOi001oo1OOI.I00ioIO) : null, true));
                }

                public void I00IoIO0lI() {
/* 3 */             lOo0I0iOi11O.I00000oIO("CX:unbindAll");
                    try {
/* 6 */                 lOllIO.I00000oIO();
/* 10 */                I00IO1oi11O(0);
/* 21 */                ((O0oOooi1l) this.I00ioIO).I000OiO((HashSet) this.I00ilI0I1);
                    } finally {
/* 29 */                Trace.endSection();
                    }
                }

                public void I00IoO0(String str) {
/* 7 */             if (str.startsWith("android-keystore://")) {
/* 9 */                 this.I00ilI0I1 = str;
                    } else {
/* 14 */                I000II.I000iOII("key URI must start with android-keystore://");
                    }
                }

                public void I00IoiI(Context context, String str, String str2) {
/* 1 */             if (context == null) {
/* 12 */                I000II.I000iOII("need an Android context");
/* 98 */                return;
                    }
/* 3 */             this.I00iiI = context;
/* 5 */             this.I00iiO = str;
/* 7 */             this.I00iio = str2;
                }

                public iOIli0 I00Iooi00oi() {
/* 3 */             iOIli0 ioili0 = new iOIli0();
/* 10 */            ioili0.I00000oIO = (Integer) this.I00iiI;
/* 16 */            ioili0.I00000oOI = (iO0Io0) this.I00iiO;
/* 22 */            ioili0.I0000Il00O = (Boolean) this.I00iio;
/* 28 */            ioili0.I0000O = (Integer) this.I00ilI0I1;
/* 34 */            ioili0.I0000oI00 = (Integer) this.I00ilO0;
/* 40 */            ioili0.I0001Ioi1lo = (Long) this.I00io1l;
/* 46 */            ioili0.I000II = (Long) this.I00ioIO;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            return ioili0;
                }

                public li1IOoo I00O0o1oo() {
/* 3 */             li1IOoo li1iooo = new li1IOoo();
/* 10 */            li1iooo.I00000oIO = (lo0II0OI) this.I00iiI;
/* 16 */            li1iooo.I00000oOI = (li0lloo) this.I00iiO;
/* 22 */            li1iooo.I0000Il00O = (li0O0iolIoOi) this.I00iio;
/* 28 */            li1iooo.I0000O = (llOoOI00I1o) this.I00ilI0I1;
/* 34 */            li1iooo.I0000oI00 = (llilOiOoOo1) this.I00ilO0;
/* 40 */            li1iooo.I0001Ioi1lo = (lliOIl0IO) this.I00io1l;
/* 46 */            li1iooo.I000II = (ili0Oii10O) this.I00ioIO;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            return li1iooo;
                }

                public li1OiO I00O10llo() {
/* 3 */             li1OiO li1oio = new li1OiO();
/* 10 */            li1oio.I00000oIO = (lo0II1) this.I00iiI;
/* 16 */            li1oio.I00000oOI = (li10OOoO0loI) this.I00iiO;
/* 22 */            li1oio.I0000Il00O = (li0lOl1IO) this.I00iio;
/* 28 */            li1oio.I0000O = (ll00o1ll) this.I00ilI0I1;
/* 34 */            li1oio.I0000oI00 = (ll0O0O1Il11I) this.I00ilO0;
/* 40 */            li1oio.I0001Ioi1lo = (ll0lioioI) this.I00io1l;
/* 46 */            li1oio.I000II = (ilI0il) this.I00ioIO;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            return li1oio;
                }

                public llillo1Oi I00OI1() {
/* 3 */             llillo1Oi llillo1oi = new llillo1Oi();
/* 10 */            llillo1oi.I00000oIO = (o00oo00i) this.I00iiI;
/* 16 */            llillo1oi.I00000oOI = (lliOo1oo) this.I00iiO;
/* 22 */            llillo1oi.I0000Il00O = (lliI0lOI) this.I00iio;
/* 28 */            llillo1oi.I0000O = (llo1OlOi) this.I00ilI0I1;
/* 34 */            llillo1oi.I0000oI00 = (lloOlO0lOIO) this.I00ilO0;
/* 40 */            llillo1oi.I0001Ioi1lo = (ioiiOII0li) this.I00io1l;
/* 46 */            llillo1oi.I000II = (loool1Oolli) this.I00ioIO;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            return llillo1oi;
                }

                public ll00O01Ooli I00OIO1() {
/* 3 */             ll00O01Ooli ll00o01ooli = new ll00O01Ooli();
/* 10 */            ll00o01ooli.I00000oIO = (loioOO0OOiO) this.I00iiI;
/* 16 */            ll00o01ooli.I00000oOI = (lioiiIOoil) this.I00iiO;
/* 22 */            ll00o01ooli.I0000Il00O = (lioi0il00i) this.I00iio;
/* 28 */            ll00o01ooli.I0000O = (lo0O0OO1i) this.I00ilI0I1;
/* 34 */            ll00o01ooli.I0000oI00 = (io1lIIli) this.I00ilO0;
/* 40 */            ll00o01ooli.I0001Ioi1lo = (ii01IlIiIo) this.I00io1l;
/* 46 */            ll00o01ooli.I000II = (loOoIo) this.I00ioIO;
/* 48 */            VarHandle.storeStoreFence();
/* 55 */            return ll00o01ooli;
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
                
                    if (I00Oio(r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00OIo(Context context, IOoilo iOoilo) throws Throwable {
                    o0OliOI0I o0olioi0i;
/* 3 */             if (iOoilo instanceof o0OliOI0I) {
/* 6 */                 o0olioi0i = (o0OliOI0I) iOoilo;
/* 8 */                 int i = o0olioi0i.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0olioi0i.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0olioi0i = new o0OliOI0I(this, iOoilo);
                        }
                    }
/* 25 */            Object objI0000oI00 = o0olioi0i.I00iOIl;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0olioi0i.I00iiO;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 34 */            if (i2 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 57 */                o0olioi0i.I00iiO = 1;
/* 72 */                objI0000oI00 = iOi1II01i0.I0000oI00(((IIOlO1ii) this.I00ioIO).I00iiI, new Ol0Oli(this, context, iOoil1iiIilo, 21), o0olioi0i);
/* 76 */                if (objI0000oI00 != obj) {
                        }
/* 106 */               return obj;
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 == 2) {
/* 40 */                    lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 96 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 50 */            lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 84 */            IlliIl1l11O ol0Oli = new Ol0Oli((Map) objI0000oI00, iOoil1iiIilo, 20);
/* 87 */            o0olioi0i.I00iiO = 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00OOll1(Context context, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    o0iIllo1lOii o0iillo1loii;
                    OI1I0OoOl oI1I0OoOl;
                    Throwable th;
                    OI11ol oI11ol;
/* 3 */             if (iOoilo instanceof o0iIllo1lOii) {
/* 6 */                 o0iillo1loii = (o0iIllo1lOii) iOoilo;
/* 8 */                 int i = o0iillo1loii.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0iillo1loii.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0iillo1loii = new o0iIllo1lOii(this, iOoilo);
                        }
                    }
/* 25 */            Object objInvoke = o0iillo1loii.I00iiO;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0iillo1loii.I00ilI0I1;
/* 35 */            if (i2 == 0) {
/* 78 */                lIoii1l01l0i.I00000oOI(objInvoke);
/* 81 */                o0iillo1loii.I00iOIl = illiIl1l11O;
/* 83 */                o0iillo1loii.I00ilI0I1 = 1;
/* 89 */                if (I00Ol00(context, o0iillo1loii) != obj) {
                        }
/* 408 */               return obj;
                    }
/* 37 */            if (i2 != 1) {
/* 39 */                if (i2 != 2) {
/* 41 */                    if (i2 != 3) {
/* 55 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                        return null;
                            }
/* 45 */                    oI11ol = (OI11ol) o0iillo1loii.I00iOIl;
                            try {
/* 47 */                        lIoii1l01l0i.I00000oOI(objInvoke);
/* 125 */                       oI11ol.I00000oOI(null);
/* 128 */                       return objInvoke;
                            } catch (Throwable th2) {
/* 51 */                        th = th2;
/* 133 */                       oI11ol.I00000oOI(null);
/* 136 */                       throw th;
                            }
                        }
/* 59 */                oI1I0OoOl = o0iillo1loii.I00iiI;
/* 63 */                illiIl1l11O = (IlliIl1l11O) o0iillo1loii.I00iOIl;
/* 65 */                lIoii1l01l0i.I00000oOI(objInvoke);
                        try {
/* 109 */                   LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00ilI0I1;
/* 111 */                   o0iillo1loii.I00iOIl = oI1I0OoOl;
/* 113 */                   o0iillo1loii.I00iiI = null;
/* 115 */                   o0iillo1loii.I00ilI0I1 = 3;
/* 117 */                   objInvoke = illiIl1l11O.invoke(linkedHashMap, o0iillo1loii);
/* 121 */                   if (objInvoke != obj) {
/* 124 */                       oI11ol = oI1I0OoOl;
/* 125 */                       oI11ol.I00000oOI(null);
/* 128 */                       return objInvoke;
                            }
/* 408 */                   return obj;
                        } catch (Throwable th3) {
/* 130 */                   OI1I0OoOl oI1I0OoOl2 = oI1I0OoOl;
/* 131 */                   th = th3;
/* 132 */                   oI11ol = oI1I0OoOl2;
/* 133 */                   oI11ol.I00000oOI(null);
/* 136 */                   throw th;
                        }
                    }
/* 72 */            illiIl1l11O = (IlliIl1l11O) o0iillo1loii.I00iOIl;
/* 74 */            lIoii1l01l0i.I00000oOI(objInvoke);
/* 93 */            oI1I0OoOl = (OI1I0OoOl) this.I00iio;
/* 95 */            o0iillo1loii.I00iOIl = illiIl1l11O;
/* 97 */            o0iillo1loii.I00iiI = oI1I0OoOl;
/* 99 */            o0iillo1loii.I00ilI0I1 = 2;
/* 105 */           if (oI1I0OoOl.I00000oIO(o0iillo1loii) != obj) {
/* 109 */               LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.I00ilI0I1;
/* 111 */               o0iillo1loii.I00iOIl = oI1I0OoOl;
/* 113 */               o0iillo1loii.I00iiI = null;
/* 115 */               o0iillo1loii.I00ilI0I1 = 3;
/* 117 */               objInvoke = illiIl1l11O.invoke(linkedHashMap2, o0iillo1loii);
/* 121 */               if (objInvoke != obj) {
                        }
                    }
/* 408 */           return obj;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00OilO00Il(Context context, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    o0iOo1 o0ioo1;
                    IlliIl1l11O illiIl1l11O2;
/* 3 */             if (iOoilo instanceof o0iOo1) {
/* 6 */                 o0ioo1 = (o0iOo1) iOoilo;
/* 8 */                 int i = o0ioo1.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0ioo1.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0ioo1 = new o0iOo1(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = o0ioo1.I00iiO;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0ioo1.I00ilI0I1;
/* 33 */            if (i2 == 0) {
/* 63 */                lIoii1l01l0i.I00000oOI(obj);
/* 66 */                o0ioo1.I00iOIl = context;
/* 71 */                o0ioo1.I00iiI = (Oll0io) illiIl1l11O;
/* 73 */                o0ioo1.I00ilI0I1 = 1;
                        illiIl1l11O2 = illiIl1l11O;
/* 79 */                if (I00Ol00(context, o0ioo1) != obj2) {
                        }
                    }
/* 35 */            if (i2 != 1) {
/* 37 */                if (i2 == 2) {
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
/* 42 */                    return obj;
                        }
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                return null;
                    }
/* 53 */            IlliIl1l11O illiIl1l11O3 = (IlliIl1l11O) o0ioo1.I00iiI;
/* 55 */            context = o0ioo1.I00iOIl;
/* 57 */            lIoii1l01l0i.I00000oOI(obj);
                    illiIl1l11O2 = illiIl1l11O3;
/* 88 */            IlliIl1l11O o1o1iI = new O1o1iI((Object) illiIl1l11O2, this, context, (IOoil1iiIilo) null, 26);
/* 91 */            o0ioo1.I00iOIl = null;
/* 93 */            o0ioo1.I00iiI = null;
/* 95 */            o0ioo1.I00ilI0I1 = 2;
/* 97 */            Object objI00Oio = I00Oio(o1o1iI, o0ioo1);
                    return objI00Oio == obj2 ? obj2 : objI00Oio;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00Oio(IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    o0iiO1o o0iio1o;
                    IlliIl1l11O illiIl1l11O2;
                    OI1I0OoOl oI1I0OoOl;
                    Throwable th;
                    OI11ol oI11ol;
/* 3 */             if (iOoilo instanceof o0iiO1o) {
/* 6 */                 o0iio1o = (o0iiO1o) iOoilo;
/* 8 */                 int i = o0iio1o.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0iio1o.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0iio1o = new o0iiO1o(this, iOoilo);
                        }
                    }
/* 25 */            Object objInvoke = o0iio1o.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0iio1o.I00ilI0I1;
                    try {
/* 34 */                if (i2 == 0) {
/* 66 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 71 */                    OI1I0OoOl oI1I0OoOl2 = (OI1I0OoOl) this.I00iio;
/* 73 */                    o0iio1o.I00iOIl = illiIl1l11O;
/* 75 */                    o0iio1o.I00iiI = oI1I0OoOl2;
/* 77 */                    o0iio1o.I00ilI0I1 = 1;
/* 83 */                    if (oI1I0OoOl2.I00000oIO(o0iio1o) != ii0111o) {
/* 85 */                        illiIl1l11O2 = illiIl1l11O;
/* 86 */                        oI1I0OoOl = oI1I0OoOl2;
                            }
/* 332 */                   return ii0111o;
                        }
/* 36 */                if (i2 != 1) {
/* 38 */                    if (i2 != 2) {
/* 52 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 42 */                    oI11ol = (OI11ol) o0iio1o.I00iOIl;
                            try {
/* 44 */                        lIoii1l01l0i.I00000oOI(objInvoke);
/* 105 */                       oI11ol.I00000oOI(null);
/* 108 */                       return objInvoke;
                            } catch (Throwable th2) {
/* 48 */                        th = th2;
/* 113 */                       oI11ol.I00000oOI(null);
/* 116 */                       throw th;
                            }
                        }
/* 56 */                oI1I0OoOl = o0iio1o.I00iiI;
/* 60 */                illiIl1l11O2 = (IlliIl1l11O) o0iio1o.I00iOIl;
/* 62 */                lIoii1l01l0i.I00000oOI(objInvoke);
/* 89 */                LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00ilI0I1;
/* 91 */                o0iio1o.I00iOIl = oI1I0OoOl;
/* 93 */                o0iio1o.I00iiI = null;
/* 95 */                o0iio1o.I00ilI0I1 = 2;
/* 97 */                objInvoke = illiIl1l11O2.invoke(linkedHashMap, o0iio1o);
/* 101 */               if (objInvoke != ii0111o) {
/* 104 */                   oI11ol = oI1I0OoOl;
/* 105 */                   oI11ol.I00000oOI(null);
/* 108 */                   return objInvoke;
                        }
/* 332 */               return ii0111o;
                    } catch (Throwable th3) {
/* 110 */               OI1I0OoOl oI1I0OoOl3 = oI1I0OoOl;
/* 111 */               th = th3;
/* 112 */               oI11ol = oI1I0OoOl3;
/* 113 */               oI11ol.I00000oOI(null);
/* 116 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00Ol00(Context context, IOoilo iOoilo) throws Throwable {
                    o0Oilo o0oilo;
                    OI1I0OoOl oI1I0OoOl;
/* 3 */             if (iOoilo instanceof o0Oilo) {
/* 6 */                 o0oilo = (o0Oilo) iOoilo;
/* 8 */                 int i = o0oilo.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    o0oilo.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    o0oilo = new o0Oilo(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = o0oilo.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = o0oilo.I00ilI0I1;
/* 31 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 34 */            int i3 = 1;
/* 35 */            IOoil1iiIilo iOoil1iiIilo = null;
                    try {
/* 36 */                if (i2 == 0) {
/* 62 */                    lIoii1l01l0i.I00000oOI(obj);
/* 67 */                    oI1I0OoOl = (OI1I0OoOl) this.I00ilO0;
/* 69 */                    o0oilo.I00iOIl = context;
/* 71 */                    o0oilo.I00iiI = oI1I0OoOl;
/* 73 */                    o0oilo.I00ilI0I1 = 1;
/* 79 */                    if (oI1I0OoOl.I00000oIO(o0oilo) != ii0111o) {
                            }
/* 332 */                   return ii0111o;
                        }
/* 38 */                if (i2 != 1) {
/* 40 */                    if (i2 == 2) {
/* 42 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        return ooiIlOl1iI;
                            }
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 52 */                OI1I0OoOl oI1I0OoOl2 = o0oilo.I00iiI;
/* 54 */                Context context2 = o0oilo.I00iOIl;
/* 56 */                lIoii1l01l0i.I00000oOI(obj);
/* 59 */                oI1I0OoOl = oI1I0OoOl2;
/* 60 */                context = context2;
/* 85 */                if (((OlIl0i) this.I00io1l) == null) {
/* 101 */                   this.I00io1l = iOi1II01i0.I0000O((IIOlO1ii) this.I00ioIO, null, null, new o0OOoOO1i(this, context, iOoil1iiIilo, i3), 3);
                        }
/* 106 */               oI1I0OoOl.I00000oOI(null);
/* 111 */               OlIl0i olIl0i = (OlIl0i) this.I00io1l;
/* 113 */               if (olIl0i != null) {
/* 115 */                   o0oilo.I00iOIl = null;
/* 117 */                   o0oilo.I00iiI = null;
/* 119 */                   o0oilo.I00ilI0I1 = 2;
/* 125 */                   if (olIl0i.I001l0I00(o0oilo) == ii0111o) {
/* 332 */                       return ii0111o;
                            }
                        }
/* 128 */               return ooiIlOl1iI;
                    } catch (Throwable th) {
/* 129 */               oI1I0OoOl.I00000oOI(null);
/* 132 */               throw th;
                    }
                }

                public File I00Ol10(Context context) {
/* 15 */            File file = new File(context.getApplicationContext().getFilesDir(), (String) this.I00iiI);
/* 22 */            if (!file.exists()) {
/* 24 */                file.mkdirs();
                    }
/* 29 */            return file;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 6:
/* 158 */                   return "HttpRequestData(url=" + ((Ool0oO1OIi) this.I00iiI) + ", method=" + ((IoIolIO1) this.I00iiO) + ')';
                        case 7:
/* 122 */                   return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + ((List) this.I00ilO0) + ", frameRateRange=" + ((Range) this.I00iiO) + ", requiredFeatureGroup=" + ((Set) this.I00iio) + ", preferredFeatureGroup=" + ((List) this.I00ilI0I1) + ", effects=" + ((List) this.I00iiI) + ", viewPort=null}";
                        case 8:
                        default:
/* 6 */                     return super.toString();
                        case 9:
/* 13 */                    String str = (String) this.I00iio;
/* 17 */                    IOiOol0 iOiOol0 = (IOiOol0) this.I00iiO;
/* 34 */                    return str.concat(iOiOol0 == null ? "" : ". Child of ".concat((String) iOiOol0.I00iio));
                    }
                }

/* 625 */       public IOiOol0(ExecutorService executorService, String str, o0l11OO0I0I o0l11oo0i0i) {
                    this.I00iOIl = 16;
                    this.I00iiI = str;
                    this.I00iiO = o0l11oo0i0i;
/* 628 */           this.I00iio = new OI1I0OoOl();
/* 629 */           this.I00ilI0I1 = new LinkedHashMap();
/* 631 */           this.I00ilO0 = new OI1I0OoOl();
/* 633 */           this.I00ioIO = il001oo1.I00000oIO(new Il11ooO1o(executorService));
                }

/* 633 */       public IOiOol0(int i) {
/* 634 */           this.I00iOIl = i;
                }

/* 634 */       public IOiOol0() {
                    this.I00iOIl = 1;
/* 636 */           this.I00iiI = null;
/* 637 */           this.I00iiO = null;
/* 638 */           this.I00iio = null;
/* 639 */           this.I00ilI0I1 = null;
/* 640 */           this.I00ilO0 = null;
/* 641 */           this.I00io1l = null;
                }
            }
