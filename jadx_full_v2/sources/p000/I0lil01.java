            package p000;

            import android.content.ComponentName;
            import android.content.ContentValues;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.os.Handler;
            import android.os.SystemClock;
            import android.util.Log;
            import android.view.MotionEvent;
            import android.view.animation.AnimationUtils;
            import android.view.inputmethod.InputMethodManager;
            import androidx.appcompat.widget.ActionMenuView;
            import androidx.appcompat.widget.SearchView$SearchAutoComplete;
            import androidx.appcompat.widget.Toolbar;
            import com.google.android.gms.oss.licenses.OssLicensesActivity;
            import com.google.android.material.bottomsheet.BottomSheetBehavior;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.util.WeakHashMap;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.logging.Level;
            
/* 9 */     public final class I0lil01 implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;

                public I0lil01(O110lI o110lI) {
/* 3 */             this.I00iOIl = 10;
/* 8 */             this.I00iiI = o110lI;
                }

                private final void I00000oIO() {
/* 3 */             l0IIioiIOIo l0iiioiioio = (l0IIioiIOIo) this.I00iiI;
                    synchronized (l0iiioiioio.I00iiO) {
                        try {
/* 10 */                    OIOol0 oIOol0 = (OIOol0) l0iiioiioio.I00iio;
/* 12 */                    if (oIOol0 != null) {
/* 14 */                        oIOol0.I00000oOI();
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
                
                    if (r1 == false) goto L47;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
                
                    r1 = r1 | java.lang.Thread.interrupted();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
                
                    r4.run();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
                
                    r2 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
                
                    p000.l11I11lO.I00000oOI("SequentialExecutor", "Exception while executing runnable " + r4, r2);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
                
                    return;
                 */
                /* JADX WARN: Removed duplicated region for block: B:42:0x003a A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00000oOI() {
                    Runnable runnable;
/* 1 */             boolean z = false;
/* 2 */             boolean zInterrupted = false;
                    while (true) {
                        try {
                            synchronized (((OilOiO10IO) this.I00iiI).I00iOIl) {
/* 11 */                        if (z) {
/* 55 */                            runnable = (Runnable) ((OilOiO10IO) this.I00iiI).I00iOIl.poll();
/* 57 */                            if (runnable != null) {
                                    }
                                } else {
/* 15 */                            OilOiO10IO oilOiO10IO = (OilOiO10IO) this.I00iiI;
/* 20 */                            if (oilOiO10IO.I00iio != 4) {
                                        oilOiO10IO.I00ilI0I1++;
/* 42 */                                oilOiO10IO.I00iio = 4;
/* 44 */                                z = true;
/* 55 */                                runnable = (Runnable) ((OilOiO10IO) this.I00iiI).I00iOIl.poll();
/* 57 */                                if (runnable != null) {
/* 63 */                                    ((OilOiO10IO) this.I00iiI).I00iio = 1;
                                        }
                                    }
                                }
                            }
/* 23 */                    if (!zInterrupted) {
/* 69 */                        return;
                            }
                        } finally {
/* 108 */                   if (zInterrupted) {
/* 114 */                       Thread.currentThread().interrupt();
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:163:0x032e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() {
                    int actionMasked;
                    int i;
                    Object obj;
                    OloIi00i oloIi00iI00000oOI;
                    long jNanoTime;
                    I0I1ii0i i0I1ii0i;
                    switch (this.I00iOIl) {
                        case 0:
/* 781 */                   I0lio1O01i01 i0lio1O01i01 = (I0lio1O01i01) this.I00iiI;
/* 783 */                   i0lio1O01i01.removeCallbacks(this);
/* 786 */                   MotionEvent motionEvent = i0lio1O01i01.I011olOoO;
/* 788 */                   if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
/* 822 */                       return;
                            }
/* 801 */                   if (actionMasked == 7) {
/* 815 */                       i = 7;
                            } else if (actionMasked == 8) {
/* 813 */                       i = 9;
                            } else if (actionMasked != 9) {
/* 811 */                       i = 2;
                            }
/* 819 */                   i0lio1O01i01.I00IOO(motionEvent, i, i0lio1O01i01.I01I01Oolii, false);
/* 822 */                   return;
                        case 1:
/* 634 */                   O10lo00 o10lo00 = (O10lo00) this.I00iiI;
/* 636 */                   Iio010 iio010 = o10lo00.I00iiO;
/* 638 */                   I1ili10li i1ili10li = o10lo00.I00iOIl;
/* 642 */                   if (o10lo00.I00o0iI0io1) {
/* 648 */                       if (o10lo00.I00lli11) {
/* 650 */                           o10lo00.I00lli11 = false;
/* 652 */                           i1ili10li.getClass();
/* 655 */                           long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
/* 659 */                           i1ili10li.I0000oI00 = jCurrentAnimationTimeMillis;
/* 661 */                           i1ili10li.I000II = -1L;
/* 663 */                           i1ili10li.I0001Ioi1lo = jCurrentAnimationTimeMillis;
/* 667 */                           i1ili10li.I000O01llI0 = 0.5f;
                                }
/* 673 */                       if ((i1ili10li.I000II > 0 && AnimationUtils.currentAnimationTimeMillis() > i1ili10li.I000II + i1ili10li.I000OOo1O) || !o10lo00.I0000oI00()) {
/* 696 */                           o10lo00.I00o0iI0io1 = false;
/* 769 */                           return;
                                }
/* 701 */                       if (o10lo00.I00lll10) {
/* 703 */                           o10lo00.I00lll10 = false;
/* 705 */                           long jUptimeMillis = SystemClock.uptimeMillis();
/* 715 */                           MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
/* 719 */                           iio010.onTouchEvent(motionEventObtain);
/* 722 */                           motionEventObtain.recycle();
                                }
/* 729 */                       if (i1ili10li.I0001Ioi1lo == 0) {
/* 777 */                           throw new RuntimeException("Cannot compute scroll delta before calling start()");
                                }
/* 731 */                       long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
/* 735 */                       float fI00000oIO = i1ili10li.I00000oIO(jCurrentAnimationTimeMillis2);
/* 749 */                       long j = jCurrentAnimationTimeMillis2 - i1ili10li.I0001Ioi1lo;
/* 751 */                       i1ili10li.I0001Ioi1lo = jCurrentAnimationTimeMillis2;
/* 761 */                       o10lo00.I00o101lO.scrollListBy((int) (j * ((fI00000oIO * 4.0f) + ((-4.0f) * fI00000oIO * fI00000oIO)) * i1ili10li.I0000O));
/* 764 */                       WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 766 */                       iio010.postOnAnimation(this);
/* 769 */                       return;
                            }
/* 769 */                   return;
                        case 2:
/* 620 */                   BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) ((IIloOI) this.I00iiI).I00iiI;
/* 622 */                   int i2 = bottomSheetBehavior.I000l1;
/* 624 */                   if (i2 != 2 || i2 == 0) {
/* 631 */                       return;
                            }
/* 629 */                   bottomSheetBehavior.I000l1 = 0;
/* 631 */                   return;
                        case 3:
/* 599 */                   IiI1IIIlo1O0 iiI1IIIlo1O0 = (IiI1IIIlo1O0) this.I00iiI;
/* 605 */                   iiI1IIIlo1O0.I00000oOI.endViewTransition(iiI1IIIlo1O0.I0000Il00O);
/* 610 */                   iiI1IIIlo1O0.I0000O.I0001Ioi1lo();
/* 613 */                   return;
                        case 4:
/* 587 */                   Iii01o00i iii01o00i = (Iii01o00i) this.I00iiI;
/* 593 */                   iii01o00i.I011IO1I11OI.onDismiss(iii01o00i.I011lIilI0lo);
/* 596 */                   return;
                        case 5:
/* 577 */                   Iio010 iio0102 = (Iio010) this.I00iiI;
/* 579 */                   iio0102.I00ll1 = null;
/* 581 */                   iio0102.drawableStateChanged();
/* 584 */                   return;
                        case 6:
/* 571 */                   ((Ill1OlOOl) this.I00iiI).I001iOo1i0O(true);
/* 574 */                   return;
                        case 7:
/* 563 */                   Io11lOo1OOi.I0000Il00O((IIoOoIol0Io0) this.I00iiI);
/* 566 */                   return;
                        case 8:
/* 537 */                   IoIlOo1o0IIl ioIlOo1o0IIl = (IoIlOo1o0IIl) this.I00iiI;
/* 541 */                   Io11o0 io11o0 = (Io11o0) ioIlOo1o0IIl.I00iio;
/* 549 */                   if (io11o0.I00iOIl.getAndSet(null) != null) {
/* 555 */                       ((Handler) ioIlOo1o0IIl.I00iiI).removeCallbacks(io11o0);
/* 558 */                       return;
                            }
/* 558 */                   return;
                        case 9:
/* 528 */                   O10IIOOiO o10IIOOiO = (O10IIOOiO) this.I00iiI;
/* 530 */                   o10IIOOiO.I00iiI = null;
/* 532 */                   o10IIOOiO.I00iOIl = null;
/* 534 */                   return;
                        case 10:
                            synchronized (((O110lI) this.I00iiI).I00000oIO) {
/* 504 */                       obj = ((O110lI) this.I00iiI).I0001Ioi1lo;
/* 512 */                       ((O110lI) this.I00iiI).I0001Ioi1lo = O110lI.I000iOII;
                            }
/* 519 */                   ((O110lI) this.I00iiI).I000iOII(obj);
/* 522 */                   return;
                        case 11:
/* 469 */                   SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.I00iiI;
/* 473 */                   if (searchView$SearchAutoComplete.I00ilO0) {
/* 487 */                       ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
/* 490 */                       searchView$SearchAutoComplete.I00ilO0 = false;
/* 492 */                       return;
                            }
/* 492 */                   return;
                        case 12:
                            try {
/* 444 */                       I00000oOI();
/* 447 */                       return;
                            } catch (Error e) {
                                synchronized (((OilOiO10IO) this.I00iiI).I00iOIl) {
/* 460 */                           ((OilOiO10IO) this.I00iiI).I00iio = 1;
/* 463 */                           throw e;
                                }
                            }
                        case 13:
                            break;
                        case 14:
/* 330 */                   ActionMenuView actionMenuView = ((Toolbar) this.I00iiI).I00iOIl;
/* 332 */                   if (actionMenuView == null || (i0I1ii0i = actionMenuView.I00oIiI10) == null) {
/* 341 */                       return;
                            }
/* 338 */                   i0I1ii0i.I000l1();
/* 341 */                   return;
                        case 15:
/* 322 */                   ((i0Ol1Ool00) this.I00iiI).I00000oIO();
/* 325 */                   return;
                        case 16:
/* 296 */                   Io0OoIoOo io0OoIoOo = ((i0Ol1Ool00) ((i0O1lIi1O0IO) this.I00iiI).I00iiI).I000O01llI0;
/* 314 */                   io0OoIoOo.I0000O(io0OoIoOo.getClass().getName().concat(" disconnecting because it was signed out."));
/* 317 */                   return;
                        case 17:
/* 284 */                   ((i0Oll0oI110) this.I00iiI).I000o00OoI0I.I00000oIO(new IOlo10lO1iOl(4, null, null));
/* 287 */                   return;
                        case PoseLandmark.RIGHT_PINKY:
/* 220 */                   OooooOi1 oooooOi1 = (OooooOi1) this.I00iiI;
                            synchronized (oooooOi1.I00000oIO) {
                                try {
/* 229 */                           if (oooooOi1.I00000oOI()) {
/* 249 */                               Log.e("WakeLock", String.valueOf(oooooOi1.I000OiO).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
/* 252 */                               oooooOi1.I0000O();
/* 259 */                               if (oooooOi1.I00000oOI()) {
/* 263 */                                   oooooOi1.I0000Il00O = 1;
/* 265 */                                   oooooOi1.I0000oI00();
/* 269 */                                   return;
                                        }
/* 269 */                               return;
                                    }
/* 269 */                           return;
                                } finally {
                                }
                            }
                        case PoseLandmark.LEFT_INDEX:
/* 174 */                   iOl1lOo1IO iol1loo1io = (iOl1lOo1IO) this.I00iiI;
                            try {
/* 176 */                       SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = iol1loo1io.I01Io11IiiiO();
/* 182 */                       ContentValues contentValues = new ContentValues();
/* 191 */                       contentValues.put("elapsed_time", (Long) 0L);
/* 196 */                       sQLiteDatabaseI01Io11IiiiO.update("raw_events", contentValues, null, null);
/* 217 */                       return;
                            } catch (SQLiteException e2) {
/* 205 */                       l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) iol1loo1io.I00iOIl).I00ilO0;
/* 207 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 214 */                       l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to remove elapsed times from raw events table", e2);
/* 217 */                       return;
                            }
                        case PoseLandmark.RIGHT_INDEX:
/* 158 */                   il00iIOo1 il00iioo1 = (il00iIOo1) this.I00iiI;
/* 164 */                   Log.i("il00iIOo1", "Cleaning up due to autoUnbind.");
/* 167 */                   il00iioo1.I0000Il00O();
/* 170 */                   return;
                        case PoseLandmark.LEFT_THUMB:
/* 143 */                   il0I11I011 il0i11i011 = (il0I11I011) this.I00iiI;
/* 149 */                   Log.i("il0I11I011", "Cleaning up due to autoUnbind.");
/* 152 */                   il0i11i011.I0000Il00O();
/* 155 */                   return;
                        case PoseLandmark.RIGHT_THUMB:
/* 128 */                   il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) this.I00iiI;
/* 134 */                   Log.i("il0I1i0Oo1", "Cleaning up due to autoUnbind.");
/* 137 */                   il0i1i0oo1.I0000Il00O();
/* 140 */                   return;
                        case PoseLandmark.LEFT_HIP:
/* 113 */                   il1OOI0 il1ooi0 = (il1OOI0) this.I00iiI;
/* 119 */                   Log.i("il1OOI0", "Cleaning up due to autoUnbind.");
/* 122 */                   il1ooi0.I0000Il00O();
/* 125 */                   return;
                        case PoseLandmark.RIGHT_HIP:
/* 81 */                    OssLicensesActivity ossLicensesActivity = (OssLicensesActivity) this.I00iiI;
/* 107 */                   ossLicensesActivity.I00ooiO1I.scrollTo(0, ossLicensesActivity.I00oooO.getLayout().getLineTop(ossLicensesActivity.I00oooO.getLayout().getLineForOffset(ossLicensesActivity.I0100i)));
/* 110 */                   return;
                        case PoseLandmark.LEFT_KNEE:
/* 75 */                    ((ili0l0oo0) this.I00iiI).zzd();
/* 78 */                    return;
                        case PoseLandmark.RIGHT_KNEE:
/* 67 */                    I00000oIO();
/* 70 */                    return;
                        case 27:
/* 51 */                    l00Iil l00iil = (l00Iil) this.I00iiI;
/* 53 */                    l00iil.getClass();
/* 60 */                    Log.i("l00Iil", "Cleaning up due to autoUnbind.");
/* 63 */                    l00iil.I0000Il00O();
/* 66 */                    return;
                        case PoseLandmark.RIGHT_ANKLE:
/* 45 */                    ((l0IilI01) this.I00iiI).I00000oIO.I00Io1lO();
/* 48 */                    return;
                        default:
/* 20 */                    lOliOlO1Io loliolo1io = ((lOl001Iii) this.I00iiI).I00iiO;
/* 35 */                    loliolo1io.I01101IOlO(new ComponentName(((l0olllO1i) loliolo1io.I00iOIl).I00iOIl, "com.google.android.gms.measurement.AppMeasurementService"));
/* 38 */                    return;
                    }
                    while (true) {
/* 345 */               OloO0oOI1lI oloO0oOI1lI = (OloO0oOI1lI) this.I00iiI;
                        synchronized (oloO0oOI1lI) {
/* 348 */                   oloIi00iI00000oOI = oloO0oOI1lI.I00000oOI();
                        }
/* 353 */               if (oloIi00iI00000oOI == null) {
/* 355 */                   return;
                        }
/* 356 */               OloO00ioIOO oloO00ioIOO = oloIi00iI00000oOI.I0000Il00O;
/* 361 */               OloO0oOI1lI oloO0oOI1lI2 = (OloO0oOI1lI) this.I00iiI;
/* 367 */               boolean zIsLoggable = OloO0oOI1lI.I000OOo1O.isLoggable(Level.FINE);
/* 371 */               if (zIsLoggable) {
/* 373 */                   jNanoTime = System.nanoTime();
/* 379 */                   lOilill0l0o.I00000oOI(oloIi00iI00000oOI, oloO00ioIOO, "starting");
                        } else {
/* 383 */                   jNanoTime = -1;
                        }
                        try {
/* 384 */                   oloO0oOI1lI2.I0000oI00(oloIi00iI00000oOI);
/* 387 */                   if (zIsLoggable) {
/* 404 */                       lOilill0l0o.I00000oOI(oloIi00iI00000oOI, oloO00ioIOO, "finished run in ".concat(lOilill0l0o.I00000oIO(System.nanoTime() - jNanoTime)));
                            }
                        } catch (Throwable th) {
                            try {
/* 415 */                       ((ThreadPoolExecutor) oloO0oOI1lI2.I00000oIO.I00iiI).execute(this);
/* 418 */                       throw th;
                            } catch (Throwable th2) {
/* 420 */                       if (zIsLoggable) {
/* 437 */                           lOilill0l0o.I00000oOI(oloIi00iI00000oOI, oloO00ioIOO, "failed a run in ".concat(lOilill0l0o.I00000oIO(System.nanoTime() - jNanoTime)));
                                }
/* 440 */                       throw th2;
                            }
                        }
                    }
                }

/* 10 */        public I0lil01(int i) {
/* 11 */            this.I00iOIl = i;
                }
            }
