            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.Accelerator;
            import com.google.ai.edge.gallery.data.ValueType;
            import com.google.ai.edge.litertlm.Contents;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.jegly.offlineLLM.smollm.SmolLM;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class O1111lilIi0 implements O11il1ilio1o {
                public static final O1111lilIi0 I00000oIO = new O1111lilIi0();
                public static final LinkedHashMap I00000oOI = new LinkedHashMap();
                public static final LinkedHashMap I0000Il00O = new LinkedHashMap();

                @Override
                public final void I00000oIO(O1oIOiI11o0 o1oIOiI11o0, IllOOo00lI illOOo00lI) throws Exception {
/* 9 */             O1111l o1111l = (O1111l) I00000oOI.remove(o1oIOiI11o0.I00000oIO);
/* 11 */            if (o1111l != null) {
/* 13 */                o1111l.I00000oOI();
                    }
/* 17 */            o1oIOiI11o0.I00IlilI0i0i = null;
/* 21 */            ((O1oiilO) illOOo00lI).invoke();
                }

                @Override
                public final void I0000Il00O(O1oIOiI11o0 o1oIOiI11o0, Contents contents, List list, boolean z) {
                    String str;
/* 12 */            O1111l o1111l = (O1111l) I00000oOI.get(o1oIOiI11o0.I00000oIO);
/* 14 */            if (o1111l == null || (str = o1111l.I0000O) == null) {
/* 21 */                return;
                    }
/* 22 */            Ol1OIlllo ol1OIlllo = o1111l.I0000Il00O;
/* 44 */            Ol1OIlllo ol1OIlllo2 = ol1OIlllo == null ? new Ol1OIlllo(0.0f, 0.0f, 0, null, 0, false, false, 0, 0, false, 16383) : ol1OIlllo;
/* 45 */            String str2 = o1111l.I0000oI00;
/* 51 */            IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(29);
/* 54 */            iO1Io1IOOOIi.I00iiI = o1oIOiI11o0;
/* 56 */            iO1Io1IOOOIi.I00iiO = o1111l;
/* 58 */            VarHandle.storeStoreFence();
/* 64 */            I000l1 i000l1 = new I000l1(2);
/* 67 */            i000l1.I00iiI = o1oIOiI11o0;
/* 69 */            VarHandle.storeStoreFence();
/* 72 */            ReentrantLock reentrantLock = o1111l.I00000oOI;
/* 74 */            reentrantLock.lock();
                    try {
/* 77 */                OlIl0i olIl0i = o1111l.I0001Ioi1lo;
/* 80 */                if (olIl0i != null) {
/* 82 */                    olIl0i.I000II(null);
                        }
/* 102 */               iOi1II01i0.I0000O(il001oo1.I00000oIO(IiiIil1lOIO.I00000oIO), null, null, new I10i01i0Iilo(o1111l, str, ol1OIlllo2, str2, iO1Io1IOOOIi, i000l1, null, 2), 3);
/* 105 */               reentrantLock.unlock();
                    } catch (Throwable th) {
/* 109 */               reentrantLock.unlock();
/* 204 */               throw th;
                    }
                }

                /* JADX WARN: Type inference failed for: r9v11 */
                /* JADX WARN: Type inference failed for: r9v12, types: [Ii00l101O, Ii01I10] */
                /* JADX WARN: Type inference failed for: r9v13 */
                @Override
                public final void I0000O(Context context, O1oIOiI11o0 o1oIOiI11o0, boolean z, boolean z2, Function1 function1, Contents contents, List list, boolean z3, Ii0110 ii0110) {
                    ?? r9;
/* 29 */            int iIntValue = ((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopK", 64), ValueType.INT)).intValue();
/* 56 */            float fFloatValue = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("TopP", Float.valueOf(0.95f)), ValueType.FLOAT)).floatValue();
/* 82 */            float fFloatValue2 = ((Float) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Temperature", Float.valueOf(1.0f)), ValueType.FLOAT)).floatValue();
/* 137 */           int i = ((String) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Accelerator", Accelerator.CPU.getLabel()), ValueType.STRING)).equals(Accelerator.GPU.getLabel()) ? context.getSharedPreferences("box_settings", 0).getInt("llama_gpu_layers", 99) : 0;
/* 140 */           String strI00000oOI = o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO);
/* 144 */           LinkedHashMap linkedHashMap = I00000oOI;
/* 152 */           O1111l o1111l = (O1111l) linkedHashMap.get(o1oIOiI11o0.I00000oIO);
/* 154 */           if (o1111l != null) {
/* 156 */               o1111l.I00000oOI();
                    }
/* 161 */           O1111l o1111l2 = new O1111l();
/* 169 */           o1111l2.I00000oIO = new SmolLM();
/* 173 */           ReentrantLock reentrantLock = new ReentrantLock();
/* 176 */           o1111l2.I00000oOI = reentrantLock;
/* 180 */           o1111l2.I0000oI00 = "";
/* 187 */           o1111l2.I000OOo1O = new AtomicBoolean(false);
/* 189 */           VarHandle.storeStoreFence();
/* 194 */           linkedHashMap.put(o1oIOiI11o0.I00000oIO, o1111l2);
/* 201 */           String str = context.getApplicationInfo().nativeLibraryDir;
/* 209 */           o1111l2.I00000oIO.loadBackends(str != null ? str : "");
/* 216 */           int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
/* 226 */           int iI0000Il00O = context.getSharedPreferences("box_settings", 0).getInt("llama_num_threads", 0);
/* 236 */           int i2 = context.getSharedPreferences("box_settings", 0).getInt("llama_context_size", 0);
/* 240 */           if (iI0000Il00O <= 0) {
/* 251 */               iI0000Il00O = lIiioliIlo.I0000Il00O(iAvailableProcessors / 2, 4, 8);
                    } else if (iI0000Il00O > iAvailableProcessors) {
/* 244 */               iI0000Il00O = iAvailableProcessors;
                    }
/* 314 */           Ol1OIlllo ol1OIlllo = new Ol1OIlllo(fFloatValue2, fFloatValue, iIntValue, i2 > 0 ? Long.valueOf(i2) : null, iI0000Il00O, context.getSharedPreferences("box_settings", 0).getBoolean("llama_use_mmap", false), context.getSharedPreferences("box_settings", 0).getBoolean("llama_use_mlock", false), i, iAvailableProcessors, context.getSharedPreferences("box_settings", 0).getBoolean("llama_kv_cache_q8", false), 177);
/* 321 */           I0iI0O1IoIoI i0iI0O1IoIoI = new I0iI0O1IoIoI(25);
/* 324 */           i0iI0O1IoIoI.I00iiI = o1oIOiI11o0;
/* 326 */           i0iI0O1IoIoI.I00iiO = o1111l2;
/* 328 */           i0iI0O1IoIoI.I00iio = function1;
/* 330 */           VarHandle.storeStoreFence();
/* 336 */           II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(3);
/* 339 */           iI0O1i0I1.I00iiI = function1;
/* 341 */           VarHandle.storeStoreFence();
/* 344 */           Il01100l il01100l = Il01100l.I00iOIl;
/* 346 */           o1111l2.I0000Il00O = ol1OIlllo;
/* 348 */           o1111l2.I0000O = strI00000oOI;
/* 350 */           String str2 = "";
/* 352 */           o1111l2.I0000oI00 = "";
/* 354 */           reentrantLock.lock();
                    try {
/* 357 */               OlIl0i olIl0i = o1111l2.I000II;
/* 359 */               if (olIl0i != null) {
/* 361 */                   r9 = 0;
/* 362 */                   olIl0i.I000II(null);
                        } else {
/* 368 */                   r9 = 0;
                        }
/* 408 */               o1111l2.I000II = iOi1II01i0.I0000O(il001oo1.I00000oIO(IiiIil1lOIO.I00000oIO), r9, r9, new I1iIiIIIio0(o1111l2, strI00000oOI, ol1OIlllo, str2, il01100l, i0iI0O1IoIoI, iI0O1i0I1, null, 5), 3);
/* 410 */               reentrantLock.unlock();
                    } catch (Throwable th) {
/* 414 */               reentrantLock.unlock();
/* 1821 */              throw th;
                    }
                }

                @Override
                public final void I0000oI00(O1oIOiI11o0 o1oIOiI11o0) {
/* 9 */             O1111l o1111l = (O1111l) I00000oOI.get(o1oIOiI11o0.I00000oIO);
/* 11 */            if (o1111l != null) {
/* 13 */                ReentrantLock reentrantLock = o1111l.I00000oOI;
/* 15 */                reentrantLock.lock();
                        try {
/* 18 */                    OlIl0i olIl0i = o1111l.I0001Ioi1lo;
/* 20 */                    if (olIl0i != null) {
/* 23 */                        olIl0i.I000II(null);
                            }
                        } finally {
/* 33 */                    reentrantLock.unlock();
                        }
                    }
                }

                @Override
                public final void I0001Ioi1lo(O1oIOiI11o0 o1oIOiI11o0, String str, Function3 function3, IllOOo00lI illOOo00lI, Function1 function1, List list, List list2, Ii0110 ii0110, Map map) {
/* 9 */             O1111l o1111l = (O1111l) I00000oOI.get(o1oIOiI11o0.I00000oIO);
/* 11 */            if (o1111l == null || !o1111l.I000OOo1O.get()) {
/* 196 */               function1.invoke("llama.cpp engine not initialized for " + o1oIOiI11o0.I00000oIO);
/* 1821 */              return;
                    }
/* 31 */            if (!list.isEmpty()) {
/* 58 */                Log.w("BoxLlamaCppModelHelper", "Image input not supported with llama.cpp engine, ignoring " + list.size() + " images");
                    }
/* 65 */            O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(10);
/* 68 */            o0l0IlolloIO.I00iiI = function3;
/* 70 */            VarHandle.storeStoreFence();
/* 78 */            IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(25);
/* 81 */            iiioilIl1Il.I00iiI = o1oIOiI11o0;
/* 83 */            iiioilIl1Il.I00iiO = function3;
/* 85 */            VarHandle.storeStoreFence();
/* 93 */            IlIi0Il ilIi0Il = new IlIi0Il(14);
/* 96 */            ilIi0Il.I00iiI = function3;
/* 98 */            VarHandle.storeStoreFence();
/* 105 */           II0O1i0I1 iI0O1i0I1 = new II0O1i0I1(4);
/* 108 */           iI0O1i0I1.I00iiI = function1;
/* 110 */           VarHandle.storeStoreFence();
/* 113 */           ReentrantLock reentrantLock = o1111l.I00000oOI;
/* 115 */           reentrantLock.lock();
                    try {
/* 124 */               if (!o1111l.I000OOo1O.get()) {
/* 133 */                   iI0O1i0I1.invoke(new IllegalStateException("Model not loaded"));
/* 136 */                   reentrantLock.unlock();
/* 139 */                   return;
                        }
/* 143 */               OlIl0i olIl0i = o1111l.I0001Ioi1lo;
/* 146 */               if (olIl0i != null) {
/* 148 */                   olIl0i.I000II(null);
                        }
/* 170 */               o1111l.I0001Ioi1lo = iOi1II01i0.I0000O(il001oo1.I00000oIO(IiiIil1lOIO.I00000oIO), null, null, new O1111Ol0O(o1111l, str, o0l0IlolloIO, iiioilIl1Il, ilIi0Il, iI0O1i0I1, null), 3);
/* 172 */               reentrantLock.unlock();
                    } catch (Throwable th) {
/* 176 */               reentrantLock.unlock();
/* 179 */               throw th;
                    }
                }

                public final void I000OOo1O(O1oIOiI11o0 o1oIOiI11o0, List list) {
                    O1111l o1111l;
/* 5 */             if (list.isEmpty() || (o1111l = (O1111l) I00000oOI.get(o1oIOiI11o0.I00000oIO)) == null || !o1111l.I000OOo1O.get()) {
/* 123 */               return;
                    }
/* 64 */            int iIntValue = (int) (((Integer) iilooIoO0I.I00000oIO(o1oIOiI11o0.I00IoIO0lI.getOrDefault("Max tokens", Integer.valueOf(Barcode.FORMAT_UPC_E)), ValueType.INT)).intValue() * 0.7d);
/* 65 */            List<OIoi0IIoi> listI001iOo1i0O = list;
/* 74 */            while (!listI001iOo1i0O.isEmpty()) {
/* 77 */                List list2 = listI001iOo1i0O;
/* 79 */                Iterator it = list2.iterator();
/* 83 */                int length = 0;
/* 88 */                while (it.hasNext()) {
/* 108 */                   length += (((String) ((OIoi0IIoi) it.next()).I00iiI).length() / 4) + 6;
                        }
/* 110 */               if (length <= iIntValue) {
                            break;
                        } else {
/* 112 */                   listI001iOo1i0O = IOOi0Ool1i.I001iOo1i0O(list2, 1);
                        }
                    }
/* 121 */           if (listI001iOo1i0O.isEmpty()) {
/* 123 */               return;
                    }
/* 124 */           listI001iOo1i0O.size();
/* 127 */           list.size();
/* 138 */           for (OIoi0IIoi oIoi0IIoi : listI001iOo1i0O) {
/* 150 */               boolean zBooleanValue = ((Boolean) oIoi0IIoi.I00iOIl).booleanValue();
/* 156 */               String str = (String) oIoi0IIoi.I00iiI;
/* 163 */               String str2 = zBooleanValue ? "user" : "assistant";
/* 171 */               if (o1111l.I000OOo1O.get()) {
/* 175 */                   o1111l.I00000oIO.addChatMessage(str2, str);
                        }
                    }
/* 179 */           ReentrantLock reentrantLock = o1111l.I00000oOI;
/* 181 */           reentrantLock.lock();
                    try {
/* 190 */               if (o1111l.I000OOo1O.get()) {
/* 196 */                   OlIl0i olIl0i = o1111l.I000O01llI0;
/* 198 */                   if (olIl0i == null || !olIl0i.I0000Il00O()) {
/* 231 */                       o1111l.I000O01llI0 = iOi1II01i0.I0000O(il001oo1.I00000oIO(IiiIil1lOIO.I00000oIO), null, null, new I1iOI0oo(o1111l, (IOoil1iiIilo) null, 11), 3);
                            }
                        }
                    } finally {
/* 237 */               reentrantLock.unlock();
                    }
                }
            }
