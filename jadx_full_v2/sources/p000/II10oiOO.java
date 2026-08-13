            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.litert.Environment;
            import java.io.File;
            import java.io.RandomAccessFile;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteOrder;
            import java.nio.MappedByteBuffer;
            import java.nio.channels.FileChannel;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            
            public final class II10oiOO extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public final O1oIOiI11o0 I00iiI;
                public final Context I00iiO;
                public final I0IO1io0I I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II10oiOO(int i, I0IO1io0I i0IO1io0I, IOoil1iiIilo iOoil1iiIilo, O1oIOiI11o0 o1oIOiI11o0, Context context) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = o1oIOiI11o0;
/* 5 */             this.I00iiO = context;
/* 7 */             this.I00iio = i0IO1io0I;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 44 */                    return new II10oiOO(0, this.I00iio, iOoil1iiIilo, this.I00iiI, this.I00iiO);
                        case 1:
/* 30 */                    return new II10oiOO(1, this.I00iio, iOoil1iiIilo, this.I00iiI, this.I00iiO);
                        default:
/* 16 */                    return new II10oiOO(2, this.I00iio, iOoil1iiIilo, this.I00iiI, this.I00iiO);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                        case 0:
/* 38 */                    ((II10oiOO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        case 1:
/* 28 */                    ((II10oiOO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                        default:
/* 18 */                    ((II10oiOO) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                            break;
                    }
/* 21 */            return ooiIlOl1iI;
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OoiIlOl1iI ooiIlOl1iI;
                    String str;
                    Object obj2;
                    String absolutePath;
                    Object next;
                    File file;
/* 3 */             int i = this.I00iOIl;
/* 17 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 24 */            Context context = this.I00iiO;
/* 26 */            O1oIOiI11o0 o1oIOiI11o0 = this.I00iiI;
/* 28 */            I0IO1io0I i0IO1io0I = this.I00iio;
                    switch (i) {
                        case 0:
/* 649 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 651 */                   lIoii1l01l0i.I00000oOI(obj);
/* 656 */                   II10ili1 iI10ili1 = new II10ili1();
/* 671 */                   iI10ili1.I0001Ioi1lo = new OllO00oiil(new I01iOOoiOI(25));
/* 685 */                   iI10ili1.I000II = new OllO00oiil(new I01iOOoiOI(26));
/* 687 */                   VarHandle.storeStoreFence();
/* 701 */                   String parent = new File(o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO)).getParent();
/* 705 */                   if (parent != null) {
                                try {
/* 711 */                           iI10ili1.I0000Il00O();
/* 716 */                           File file2 = new File(parent);
/* 719 */                           iI10ili1.I0000Il00O = file2;
/* 725 */                           iI10ili1.I00000oOI = II10ili1.I00000oOI(file2);
/* 733 */                           iI10ili1.I0000O = II10ili1.I0000O(context, "bn_scale.bin");
/* 737 */                           float[] fArrI0000O = II10ili1.I0000O(context, "bn_shift.bin");
/* 741 */                           iI10ili1.I0000oI00 = fArrI0000O;
/* 743 */                           float[] fArr = iI10ili1.I0000O;
/* 745 */                           if (fArr == null) {
/* 803 */                               O0000Ioio00.I000OOo1O("bnScale");
/* 808 */                               throw null;
                                    }
/* 750 */                           if (fArr.length != 128 || fArrI0000O.length != 128) {
/* 802 */                               throw new IllegalArgumentException(("bn stats must be 128 floats, got " + fArr.length + "/" + fArrI0000O.length).toString());
                                    }
/* 763 */                           iI10ili1.I00000oIO = Environment.Companion.create$default(Environment.INSTANCE, null, 1, null);
/* 765 */                           o1oIOiI11o0.I00IlilI0i0i = iI10ili1;
/* 767 */                           i0IO1io0I.invoke("");
                                } catch (Throwable th) {
/* 811 */                           Log.e("BonsaiEngine", "load failed", th);
/* 814 */                           iI10ili1.I0000Il00O();
                                }
                            } else {
/* 819 */                       i0IO1io0I.invoke("Failed to load Bonsai Image (check that all files finished downloading)");
                            }
/* 646 */                   return ooiIlOl1iI2;
                        case 1:
/* 427 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 429 */                   lIoii1l01l0i.I00000oOI(obj);
/* 434 */                   Ili000 ili000 = new Ili000();
/* 448 */                   String parent2 = new File(o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO)).getParent();
/* 452 */                   if (parent2 != null) {
                                try {
/* 454 */                           ili000.I00000oIO();
/* 459 */                           File file3 = new File(parent2);
/* 462 */                           ili000.I0000Il00O = file3;
/* 484 */                           ili000.I00000oOI = new I0Oi111ii(new File(file3, "qwen_vocab.txt"), new File(file3, "qwen_merges.txt"), new File(file3, "qwen_special.txt"));
/* 493 */                           RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file3, "qwen_embed_fp16.bin"), "r");
/* 496 */                           ili000.I0000O = randomAccessFile;
/* 510 */                           MappedByteBuffer map = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile.length());
/* 516 */                           map.order(ByteOrder.LITTLE_ENDIAN);
/* 519 */                           ili000.I0000oI00 = map;
/* 527 */                           ili000.I0001Ioi1lo = Ili000.I0000Il00O(context, "enc_cos.bin");
/* 535 */                           ili000.I000II = Ili000.I0000Il00O(context, "enc_sin.bin");
/* 543 */                           ili000.I000O01llI0 = Ili000.I0000Il00O(context, "dit_cos.bin");
/* 551 */                           ili000.I000OOo1O = Ili000.I0000Il00O(context, "dit_sin.bin");
/* 559 */                           ili000.I000OiO = Ili000.I0000Il00O(context, "sigmas.bin");
/* 563 */                           float[] fArrI0000Il00O = Ili000.I0000Il00O(context, "temb.bin");
/* 568 */                           float[][] fArr2 = new float[4][];
/* 572 */                           for (int i2 = 0; i2 < 4; i2++) {
/* 576 */                               float[] fArr3 = new float[3072];
/* 579 */                               for (int i3 = 0; i3 < 3072; i3++) {
/* 586 */                                   fArr3[i3] = fArrI0000Il00O[(i2 * 3072) + i3];
                                        }
/* 593 */                               fArr2[i2] = fArr3;
                                    }
/* 598 */                           ili000.I000iOII = fArr2;
/* 606 */                           ili000.I000l1 = Ili000.I0000Il00O(context, "bn_mean.bin");
/* 614 */                           ili000.I000lI = Ili000.I0000Il00O(context, "bn_std.bin");
/* 624 */                           ili000.I00000oIO = Environment.Companion.create$default(Environment.INSTANCE, null, 1, null);
/* 626 */                           o1oIOiI11o0.I00IlilI0i0i = ili000;
/* 628 */                           i0IO1io0I.invoke("");
                                } catch (Throwable th2) {
/* 634 */                           Log.e("FluxKleinEngine", "load failed", th2);
/* 637 */                           ili000.I00000oIO();
                                }
                            } else {
/* 642 */                       i0IO1io0I.invoke("Failed to load FLUX.2 klein (check that all files finished downloading)");
                            }
/* 424 */                   return ooiIlOl1iI2;
                        default:
/* 33 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 40 */                    i0I00l i0i00l = new i0I00l();
/* 54 */                    String parent3 = new File(o1oIOiI11o0.I00000oOI(context, o1oIOiI11o0.I000OiO)).getParent();
/* 58 */                    File externalFilesDir = context.getExternalFilesDir(null);
/* 62 */                    if (externalFilesDir != null) {
/* 66 */                        ooiIlOl1iI = ooiIlOl1iI2;
/* 68 */                        O1oIOiI11o0 o1oIOiI11o02 = Ili00l1oO1l.I00000oIO;
/* 19 */                        str = "load failed";
/* 21 */                        obj2 = "";
/* 99 */                        absolutePath = new File(externalFilesDir, o1oIOiI11o02.I00IioO0OiOi + "/" + o1oIOiI11o02.I000iOII).getAbsolutePath();
                            } else {
/* 104 */                       ooiIlOl1iI = ooiIlOl1iI2;
/* 19 */                        str = "load failed";
/* 21 */                        obj2 = "";
/* 110 */                       absolutePath = null;
                            }
/* 111 */                   if (parent3 != null) {
/* 113 */                       List listI000OOo1O = IOOi1I.I000OOo1O(absolutePath);
                                try {
/* 119 */                           i0i00l.I0000Il00O();
/* 127 */                           i0i00l.I0000Il00O = new File(parent3);
/* 137 */                           ArrayList arrayListI00O10llo = IOOi0Ool1i.I00O10llo(Collections.singletonList(parent3), listI000OOo1O);
/* 149 */                           ArrayList arrayList = new ArrayList(IOOi1I.I0000O(arrayListI00O10llo, 10));
/* 152 */                           Iterator it = arrayListI00O10llo.iterator();
/* 160 */                           while (it.hasNext()) {
/* 173 */                               arrayList.add(new File((String) it.next()));
                                    }
/* 182 */                           Iterator it2 = arrayList.iterator();
                                    while (true) {
/* 190 */                               if (it2.hasNext()) {
/* 192 */                                   next = it2.next();
/* 197 */                                   File file4 = (File) next;
/* 208 */                                   if (!new File(file4, "qwen_vocab.txt").exists() || !new File(file4, "qwen_embed_fp16.bin").exists()) {
                                            }
                                        } else {
/* 222 */                                   next = null;
                                        }
                                    }
/* 223 */                           file = (File) next;
                                } catch (Throwable th3) {
/* 412 */                           Log.e("ZImageEngine", str, th3);
/* 415 */                           i0i00l.I0000Il00O();
                                }
/* 225 */                       if (file == null) {
/* 249 */                           Log.e("ZImageEngine", "No tokenizer assets found in " + parent3 + " or fallbacks");
/* 420 */                           i0IO1io0I.invoke("Failed to load Z-Image (check that all files finished downloading)");
                                } else {
/* 274 */                           i0i00l.I00000oOI = new I0Oi111ii(new File(file, "qwen_vocab.txt"), new File(file, "qwen_merges.txt"), new File(file, "qwen_special.txt"));
/* 283 */                           RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(file, "qwen_embed_fp16.bin"), "r");
/* 286 */                           i0i00l.I0000O = randomAccessFile2;
/* 300 */                           MappedByteBuffer map2 = randomAccessFile2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile2.length());
/* 306 */                           map2.order(ByteOrder.LITTLE_ENDIAN);
/* 309 */                           i0i00l.I0000oI00 = map2;
/* 313 */                           float[] fArrI0000oI00 = i0I00l.I0000oI00(context, "zimage/zimage_cap_pad_token.bin");
/* 317 */                           i0i00l.I0001Ioi1lo = fArrI0000oI00;
/* 322 */                           if (fArrI0000oI00.length != 3840) {
/* 411 */                               throw new IllegalArgumentException(("cap_pad_token size " + fArrI0000oI00.length).toString());
                                    }
/* 326 */                           float[] fArrI0000oI002 = i0I00l.I0000oI00(context, "zimage/zimage_temb_mlp.bin");
/* 330 */                           i0i00l.I000II = fArrI0000oI002;
/* 336 */                           if (fArrI0000oI002.length != 525568) {
/* 383 */                               throw new IllegalArgumentException(("temb_mlp size " + fArrI0000oI002.length).toString());
                                    }
/* 346 */                           i0i00l.I00000oIO = Environment.Companion.create$default(Environment.INSTANCE, null, 1, null);
/* 348 */                           o1oIOiI11o0.I00IlilI0i0i = i0i00l;
/* 352 */                           i0IO1io0I.invoke(obj2);
                                }
                            } else {
/* 420 */                       i0IO1io0I.invoke("Failed to load Z-Image (check that all files finished downloading)");
                            }
/* 423 */                   return ooiIlOl1iI;
                    }
                }
            }
