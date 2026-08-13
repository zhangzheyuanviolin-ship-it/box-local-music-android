            package p000;

            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.text.Spannable;
            import android.text.SpannableString;
            import android.text.Spanned;
            import android.view.inputmethod.EditorInfo;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.concurrent.locks.ReentrantReadWriteLock;
            
            public final class IiollO1llli {
                public static final Object I000OiO = new Object();
                public static volatile IiollO1llli I000iOII;
                public final ReentrantReadWriteLock I00000oIO;
                public final I1Io1oIoo I00000oOI;
                public volatile int I0000Il00O;
                public final Handler I0000O;
                public final IiolOoiOIO I0000oI00;
                public final IiollO I0001Ioi1lo;
                public final Io1Oioii1111 I000II;
                public final int I000O01llI0;
                public final Ii1oOi0l I000OOo1O;

                public IiollO1llli(IliiOO1o iliiOO1o) {
/* 6 */             ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
/* 9 */             this.I00000oIO = reentrantReadWriteLock;
/* 12 */            this.I0000Il00O = 3;
/* 18 */            this.I0001Ioi1lo = (IiollO) iliiOO1o.I00000oOI;
/* 20 */            int i = iliiOO1o.I00000oIO;
/* 22 */            this.I000O01llI0 = i;
/* 28 */            this.I000OOo1O = (Ii1oOi0l) iliiOO1o.I0000Il00O;
/* 39 */            this.I0000O = new Handler(Looper.getMainLooper());
/* 47 */            this.I00000oOI = new I1Io1oIoo(0);
/* 56 */            this.I000II = new Io1Oioii1111(11);
/* 60 */            IiolOoiOIO iiolOoiOIO = new IiolOoiOIO();
/* 63 */            iiolOoiOIO.I00000oIO = this;
/* 65 */            VarHandle.storeStoreFence();
/* 68 */            this.I0000oI00 = iiolOoiOIO;
/* 74 */            reentrantReadWriteLock.writeLock().lock();
/* 77 */            if (i == 0) {
                        try {
/* 79 */                    this.I0000Il00O = 0;
                        } catch (Throwable th) {
/* 89 */                    this.I00000oIO.writeLock().unlock();
/* 92 */                    throw th;
                        }
                    }
/* 97 */            reentrantReadWriteLock.writeLock().unlock();
/* 104 */           if (I0000Il00O() == 0) {
/* 106 */               iiolOoiOIO.I00000oIO();
                    }
                }

                public static IiollO1llli I00000oIO() {
                    IiollO1llli iiollO1llli;
                    synchronized (I000OiO) {
/* 4 */                 iiollO1llli = I000iOII;
/* 13 */                lII1OI11o1I.I0000oI00("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", iiollO1llli != null);
                    }
/* 17 */            return iiollO1llli;
                }

                public static boolean I0000O() {
                    return I000iOII != null;
                }

                public final int I00000oOI(int i, CharSequence charSequence) {
/* 13 */            lII1OI11o1I.I0000oI00("Not initialized yet", I0000Il00O() == 1);
/* 18 */            lII1OI11o1I.I0000O("charSequence cannot be null", charSequence);
/* 23 */            IOO000ilo iOO000ilo = this.I0000oI00.I00000oOI;
/* 25 */            iOO000ilo.getClass();
/* 28 */            if (i < 0 || i >= charSequence.length()) {
/* 99 */                return -1;
                    }
/* 39 */            if (charSequence instanceof Spanned) {
/* 42 */                Spanned spanned = (Spanned) charSequence;
/* 52 */                OoOlI0ii[] ooOlI0iiArr = (OoOlI0ii[]) spanned.getSpans(i, i + 1, OoOlI0ii.class);
/* 55 */                if (ooOlI0iiArr.length > 0) {
/* 59 */                    return spanned.getSpanStart(ooOlI0iiArr[0]);
                        }
                    }
/* 96 */            return ((Iiooiil01lII) iOO000ilo.I001lloI(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new Iiooiil01lII(i))).I00iiI;
                }

                public final int I0000Il00O() {
/* 7 */             this.I00000oIO.readLock().lock();
                    try {
/* 10 */                return this.I0000Il00O;
                    } finally {
/* 29 */                this.I00000oIO.readLock().unlock();
                    }
                }

                public final void I0000oI00() {
/* 12 */            lII1OI11o1I.I0000oI00("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.I000O01llI0 == 1);
/* 19 */            if (I0000Il00O() == 1) {
/* 21 */                return;
                    }
/* 28 */            this.I00000oIO.writeLock().lock();
                    try {
/* 33 */                if (this.I0000Il00O == 0) {
/* 44 */                    return;
                        }
/* 45 */                this.I0000Il00O = 0;
/* 53 */                this.I00000oIO.writeLock().unlock();
/* 58 */                this.I0000oI00.I00000oIO();
                    } finally {
/* 69 */                this.I00000oIO.writeLock().unlock();
                    }
                }

                public final void I0001Ioi1lo(Throwable th) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            this.I00000oIO.writeLock().lock();
                    try {
/* 16 */                this.I0000Il00O = 2;
/* 20 */                arrayList.addAll(this.I00000oOI);
/* 25 */                this.I00000oOI.clear();
/* 34 */                this.I00000oIO.writeLock().unlock();
/* 46 */                this.I0000O.post(new IIiOiIiO01O(arrayList, this.I0000Il00O, th));
                    } catch (Throwable th2) {
/* 57 */                this.I00000oIO.writeLock().unlock();
/* 77 */                throw th2;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:49:0x0098 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00ca A[Catch: all -> 0x0107, TRY_ENTER, TryCatch #0 {all -> 0x0107, blocks: (B:62:0x00ca, B:65:0x00d2, B:47:0x008e), top: B:90:0x008e }] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final CharSequence I000II(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
                    CharSequence charSequence2;
                    Throwable th;
                    int i4;
                    int i5;
                    OoOlI0ii[] ooOlI0iiArr;
/* 14 */            lII1OI11o1I.I0000oI00("Not initialized yet", I0000Il00O() == 1);
/* 17 */            Ooii0i ooii0i = null;
/* 18 */            if (i < 0) {
/* 288 */               I000II.I000iOII("start cannot be negative");
/* 17 */                return null;
                    }
/* 20 */            if (i2 < 0) {
/* 282 */               I000II.I000iOII("end cannot be negative");
/* 17 */                return null;
                    }
/* 29 */            lII1OI11o1I.I00000oIO("start should be <= than end", i <= i2);
/* 32 */            if (charSequence == null) {
/* 17 */                return null;
                    }
/* 46 */            lII1OI11o1I.I00000oIO("start should be < than charSequence length", i <= charSequence.length());
/* 60 */            lII1OI11o1I.I00000oIO("end should be < than charSequence length", i2 <= charSequence.length());
/* 67 */            if (charSequence.length() == 0 || i == i2) {
/* 71 */                return charSequence;
                    }
/* 78 */            boolean z = i3 == 1;
/* 81 */            IOO000ilo iOO000ilo = this.I0000oI00.I00000oOI;
/* 83 */            iOO000ilo.getClass();
/* 86 */            boolean z2 = charSequence instanceof OlIIiioli01;
/* 88 */            if (z2) {
/* 93 */                ((OlIIiioli01) charSequence).I00000oIO();
                    }
/* 98 */            if (z2) {
/* 148 */               ooii0i = new Ooii0i((Spannable) charSequence);
/* 151 */               if (ooii0i != null) {
                        }
/* 199 */               i4 = i;
/* 200 */               i5 = i2;
/* 201 */               if (i4 == i5) {
                        }
/* 260 */               ((OlIIiioli01) charSequence2).I00000oOI();
/* 263 */               return charSequence2;
                    }
                    try {
/* 102 */               if (!(charSequence instanceof Spannable)) {
/* 107 */                   if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, OoOlI0ii.class) <= i2) {
/* 124 */                       ooii0i = new Ooii0i();
/* 127 */                       ooii0i.I00iOIl = false;
/* 134 */                       ooii0i.I00iiI = new SpannableString(charSequence);
                            }
/* 151 */                   if (ooii0i != null) {
/* 167 */                       while (i < r2) {
                                }
                            }
/* 199 */                   i4 = i;
/* 200 */                   i5 = i2;
/* 201 */                   if (i4 == i5) {
/* 209 */                       charSequence2 = charSequence;
/* 267 */                       if (!z2) {
                                }
                            }
/* 260 */                   ((OlIIiioli01) charSequence2).I00000oOI();
/* 263 */                   return charSequence2;
                        }
                        try {
/* 148 */                   ooii0i = new Ooii0i((Spannable) charSequence);
/* 151 */                   if (ooii0i != null && (ooOlI0iiArr = (OoOlI0ii[]) ooii0i.I00iiI.getSpans(i, i2, OoOlI0ii.class)) != null && ooOlI0iiArr.length > 0) {
/* 167 */                       for (OoOlI0ii ooOlI0ii : ooOlI0iiArr) {
/* 173 */                           int spanStart = ooii0i.I00iiI.getSpanStart(ooOlI0ii);
/* 179 */                           int spanEnd = ooii0i.I00iiI.getSpanEnd(ooOlI0ii);
/* 183 */                           if (spanStart != i2) {
/* 185 */                               ooii0i.removeSpan(ooOlI0ii);
                                    }
/* 188 */                           i = Math.min(spanStart, i);
/* 192 */                           i2 = Math.max(spanEnd, i2);
                                }
                            }
/* 199 */                   i4 = i;
/* 200 */                   i5 = i2;
/* 201 */                   if (i4 == i5 || i4 >= charSequence.length()) {
/* 209 */                       charSequence2 = charSequence;
/* 267 */                       if (!z2) {
/* 279 */                           return charSequence2;
                                }
                            } else {
/* 215 */                       Io1Oioii1111 io1Oioii1111 = (Io1Oioii1111) iOO000ilo.I00iiI;
/* 219 */                       IoloOio0I ioloOio0I = new IoloOio0I(11);
/* 222 */                       ioloOio0I.I00iiI = ooii0i;
/* 224 */                       ioloOio0I.I00iiO = io1Oioii1111;
/* 226 */                       VarHandle.storeStoreFence();
/* 232 */                       charSequence2 = charSequence;
                                try {
/* 237 */                           Ooii0i ooii0i2 = (Ooii0i) iOO000ilo.I001lloI(charSequence2, i4, i5, Integer.MAX_VALUE, z, ioloOio0I);
/* 239 */                           if (ooii0i2 != null) {
/* 241 */                               Spannable spannable = ooii0i2.I00iiI;
/* 243 */                               if (z2) {
/* 248 */                                   ((OlIIiioli01) charSequence2).I00000oOI();
                                        }
/* 251 */                               return spannable;
                                    }
/* 255 */                           if (!z2) {
/* 279 */                               return charSequence2;
                                    }
                                } catch (Throwable th2) {
/* 252 */                           th = th2;
/* 253 */                           th = th;
/* 270 */                           if (!z2) {
                                    }
                                }
                            }
/* 260 */                   ((OlIIiioli01) charSequence2).I00000oOI();
/* 263 */                   return charSequence2;
                        } catch (Throwable th3) {
/* 264 */                   th = th3;
/* 265 */                   charSequence2 = charSequence;
/* 253 */                   th = th;
/* 270 */                   if (!z2) {
                            }
                        }
                    } catch (Throwable th4) {
/* 141 */               th = th4;
/* 137 */               charSequence2 = charSequence;
                    }
/* 270 */           if (!z2) {
/* 278 */               throw th;
                    }
/* 275 */           ((OlIIiioli01) charSequence2).I00000oOI();
/* 278 */           throw th;
                }

                public final void I000O01llI0(Iioll1 iioll1) {
/* 7 */             this.I00000oIO.writeLock().lock();
                    try {
/* 13 */                if (this.I0000Il00O == 1 || this.I0000Il00O == 2) {
/* 49 */                    this.I0000O.post(new IIiOiIiO01O(Arrays.asList(iioll1), this.I0000Il00O, null));
                        } else {
/* 23 */                    this.I00000oOI.add(iioll1);
                        }
/* 58 */                this.I00000oIO.writeLock().unlock();
                    } catch (Throwable th) {
/* 68 */                this.I00000oIO.writeLock().unlock();
/* 77 */                throw th;
                    }
                }

                public final void I000OOo1O(EditorInfo editorInfo) {
/* 6 */             if (I0000Il00O() != 1 || editorInfo == null) {
/* 10 */                return;
                    }
/* 13 */            if (editorInfo.extras == null) {
/* 20 */                editorInfo.extras = new Bundle();
                    }
/* 22 */            IiolOoiOIO iiolOoiOIO = this.I0000oI00;
/* 24 */            iiolOoiOIO.getClass();
/* 27 */            Bundle bundle = editorInfo.extras;
/* 33 */            O1liIlo o1liIlo = (O1liIlo) iiolOoiOIO.I0000Il00O.I00iiI;
/* 36 */            int iI00000oIO = o1liIlo.I00000oIO(4);
/* 58 */            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iI00000oIO != 0 ? ((ByteBuffer) o1liIlo.I00iiI).getInt(iI00000oIO + o1liIlo.I00iOIl) : 0);
/* 65 */            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
                }
            }
