            package p000;

            import android.os.PowerManager;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.ScheduledFuture;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class OooooOi1 {
                public static volatile ScheduledExecutorService I000o00OoI0I;
                public static final Object I000oI1ioi = new Object();
                public Object I00000oIO;
                public PowerManager.WakeLock I00000oOI;
                public int I0000Il00O;
                public ScheduledFuture I0000O;
                public long I0000oI00;
                public HashSet I0001Ioi1lo;
                public boolean I000II;
                public iOoIO1IIiOlI I000O01llI0;
                public Iioi0lilII I000OOo1O;
                public String I000OiO;
                public HashMap I000iOII;
                public AtomicInteger I000l1;
                public ScheduledExecutorService I000lI;

                public final void I00000oIO() {
/* 3 */             this.I000l1.incrementAndGet();
/* 29 */            long jMin = Math.min(60000L, Math.max(Math.min(Long.MAX_VALUE, 31622400000L), 1L));
                    synchronized (this.I00000oIO) {
                        try {
/* 40 */                    if (!I00000oOI()) {
/* 44 */                        this.I000O01llI0 = iOoIO1IIiOlI.I00iOIl;
/* 48 */                        this.I00000oOI.acquire();
/* 53 */                        this.I000OOo1O.getClass();
/* 56 */                        SystemClock.elapsedRealtime();
                            }
                            this.I0000Il00O++;
/* 71 */                    if (this.I000II) {
/* 73 */                        TextUtils.isEmpty(null);
                            }
/* 82 */                    iil0ooOli iil0oooli = (iil0ooOli) this.I000iOII.get(null);
/* 84 */                    if (iil0oooli == null) {
/* 88 */                        iil0oooli = new iil0ooOli();
/* 93 */                        this.I000iOII.put(null, iil0oooli);
                            }
                            iil0oooli.I00000oIO++;
/* 104 */                   this.I000OOo1O.getClass();
/* 107 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 117 */                   long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
/* 123 */                   if (j > this.I0000oI00) {
/* 125 */                       this.I0000oI00 = j;
/* 127 */                       ScheduledFuture scheduledFuture = this.I0000O;
/* 129 */                       if (scheduledFuture != null) {
/* 132 */                           scheduledFuture.cancel(false);
                                }
/* 135 */                       ScheduledExecutorService scheduledExecutorService = this.I000lI;
/* 141 */                       I0lil01 i0lil01 = new I0lil01(18);
/* 144 */                       i0lil01.I00iiI = this;
/* 146 */                       VarHandle.storeStoreFence();
/* 155 */                       this.I0000O = scheduledExecutorService.schedule(i0lil01, jMin, TimeUnit.MILLISECONDS);
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                }

                public final boolean I00000oOI() {
                    boolean z;
                    synchronized (this.I00000oIO) {
/* 10 */                z = this.I0000Il00O > 0;
                    }
/* 12 */            return z;
                }

                public final void I0000Il00O() {
/* 7 */             if (this.I000l1.decrementAndGet() < 0) {
/* 23 */                Log.e("WakeLock", String.valueOf(this.I000OiO).concat(" release without a matched acquire!"));
                    }
                    synchronized (this.I00000oIO) {
                        try {
/* 32 */                    if (this.I000II) {
/* 34 */                        TextUtils.isEmpty(null);
                            }
/* 43 */                    if (this.I000iOII.containsKey(null)) {
/* 51 */                        iil0ooOli iil0oooli = (iil0ooOli) this.I000iOII.get(null);
/* 53 */                        if (iil0oooli != null) {
                                    int i = iil0oooli.I00000oIO - 1;
/* 59 */                            iil0oooli.I00000oIO = i;
/* 61 */                            if (i == 0) {
/* 65 */                                this.I000iOII.remove(null);
                                    }
                                }
                            } else {
/* 85 */                        Log.w("WakeLock", String.valueOf(this.I000OiO).concat(" counter does not exist"));
                            }
/* 88 */                    I0000oI00();
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public final void I0000O() {
/* 1 */             HashSet hashSet = this.I0001Ioi1lo;
/* 7 */             if (hashSet.isEmpty()) {
/* 24 */                return;
                    }
/* 12 */            ArrayList arrayList = new ArrayList(hashSet);
/* 15 */            hashSet.clear();
/* 22 */            if (arrayList.size() <= 0) {
/* 24 */                return;
                    }
/* 30 */            arrayList.get(0).getClass();
/* 33 */            OIiilo1Ool0o.I00000oIO();
                }

                public final void I0000oI00() {
                    synchronized (this.I00000oIO) {
                        try {
/* 8 */                     if (I00000oOI()) {
/* 18 */                        if (this.I000II) {
                                    int i = this.I0000Il00O - 1;
/* 24 */                            this.I0000Il00O = i;
/* 26 */                            if (i > 0) {
/* 30 */                                return;
                                    }
                                } else {
/* 31 */                            this.I0000Il00O = 0;
                                }
/* 33 */                        I0000O();
/* 42 */                        Iterator it = this.I000iOII.values().iterator();
/* 50 */                        while (it.hasNext()) {
/* 58 */                            ((iil0ooOli) it.next()).I00000oIO = 0;
                                }
/* 63 */                        this.I000iOII.clear();
/* 66 */                        ScheduledFuture scheduledFuture = this.I0000O;
/* 69 */                        if (scheduledFuture != null) {
/* 71 */                            scheduledFuture.cancel(false);
/* 74 */                            this.I0000O = null;
/* 78 */                            this.I0000oI00 = 0L;
                                }
/* 86 */                        if (this.I00000oOI.isHeld()) {
                                    try {
                                        try {
/* 90 */                                    this.I00000oOI.release();
/* 95 */                                    if (this.I000O01llI0 != null) {
/* 97 */                                        this.I000O01llI0 = null;
                                            }
                                        } catch (RuntimeException e) {
/* 113 */                                   if (!e.getClass().equals(RuntimeException.class)) {
/* 139 */                                       throw e;
                                            }
/* 129 */                                   Log.e("WakeLock", String.valueOf(this.I000OiO).concat(" failed to release!"), e);
/* 134 */                                   if (this.I000O01llI0 != null) {
/* 136 */                                       this.I000O01llI0 = null;
                                            }
                                        }
                                    } catch (Throwable th) {
/* 142 */                               if (this.I000O01llI0 != null) {
/* 144 */                                   this.I000O01llI0 = null;
                                        }
/* 146 */                               throw th;
                                    }
                                } else {
/* 161 */                           Log.e("WakeLock", String.valueOf(this.I000OiO).concat(" should be held!"));
                                }
                            }
                        } catch (Throwable th2) {
/* 245 */                   throw th2;
                        }
                    }
                }
            }
