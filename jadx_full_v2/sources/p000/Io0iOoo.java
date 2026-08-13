            package p000;

            import android.app.ActivityManager;
            import android.app.Application;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.Looper;
            import android.os.Message;
            import android.os.Process;
            import android.os.SystemClock;
            import android.util.Log;
            import android.util.SparseIntArray;
            import com.google.android.gms.common.api.GoogleApiActivity;
            import com.google.android.gms.common.api.Status;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.WeakHashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class Io0iOoo implements Handler.Callback {
                public static final Status I00o0iI0io1 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
                public static final Status I00o0l1o1o0 = new Status(4, "The user must be signed in to make this API call.", null, null);
                public static final Object I00o101lO = new Object();
                public static Io0iOoo I00oI0i;
                public long I00iOIl;
                public boolean I00iiI;
                public OloOI1o I00iiO;
                public i0i01Ii0iII I00iio;
                public final Context I00ilI0I1;
                public final Io0i1l I00ilO0;
                public final i000IO I00io1l;
                public final AtomicInteger I00ioIO;
                public final AtomicInteger I00l0I0l0lO1;
                public final ConcurrentHashMap I00l0OO0IO;
                public final I1Io1oIoo I00li1OI;
                public final I1Io1oIoo I00ll1;
                public final O1oo1il01OoO I00lli11;
                public volatile boolean I00lll10;

                public Io0iOoo(Context context, Looper looper) {
/* 1 */             Io0i1l io0i1l = Io0i1l.I0000oI00;
/* 8 */             this.I00iOIl = 10000L;
/* 11 */            this.I00iiI = false;
/* 19 */            this.I00ioIO = new AtomicInteger(1);
/* 26 */            this.I00l0I0l0lO1 = new AtomicInteger(0);
/* 36 */            this.I00l0OO0IO = new ConcurrentHashMap(5, 0.75f, 1);
/* 43 */            this.I00li1OI = new I1Io1oIoo(0);
/* 50 */            this.I00ll1 = new I1Io1oIoo(0);
/* 52 */            this.I00lll10 = true;
/* 54 */            this.I00ilI0I1 = context;
/* 58 */            O1oo1il01OoO o1oo1il01OoO = new O1oo1il01OoO(looper, this, 1);
/* 61 */            Looper.getMainLooper();
/* 64 */            this.I00lli11 = o1oo1il01OoO;
/* 66 */            this.I00ilO0 = io0i1l;
/* 71 */            i000IO i000io = new i000IO(4);
/* 79 */            i000io.I00iiI = new SparseIntArray();
/* 81 */            i000io.I00iiO = io0i1l;
/* 83 */            VarHandle.storeStoreFence();
/* 86 */            this.I00io1l = i000io;
/* 88 */            PackageManager packageManager = context.getPackageManager();
/* 92 */            Boolean boolValueOf = il1OI0o0Il10.I0000O;
/* 94 */            if (boolValueOf == null) {
/* 102 */               boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
/* 106 */               il1OI0o0Il10.I0000O = boolValueOf;
                    }
/* 112 */           if (boolValueOf.booleanValue()) {
/* 114 */               this.I00lll10 = false;
                    }
/* 121 */           o1oo1il01OoO.sendMessage(o1oo1il01OoO.obtainMessage(6));
                }

                public static Status I0000Il00O(I11Oil i11Oil, IOlo10lO1iOl iOlo10lO1iOl) {
/* 7 */             String str = (String) i11Oil.I00000oOI.I00iiO;
/* 9 */             String strValueOf = String.valueOf(iOlo10lO1iOl);
/* 41 */            return new Status(17, IIl001iO0Io.I00100o1O0lo(new StringBuilder(str.length() + 63 + strValueOf.length()), "API: ", str, " is not available on this device. Connection failed with: ", strValueOf), iOlo10lO1iOl.I00iiO, iOlo10lO1iOl);
                }

                public static Io0iOoo I0000O(Context context) {
                    Io0iOoo io0iOoo;
                    HandlerThread handlerThread;
                    synchronized (I00o101lO) {
/* 4 */                 io0iOoo = I00oI0i;
/* 6 */                 if (io0iOoo == null) {
                            synchronized (ll0oOilllo.I000II) {
                                try {
/* 11 */                            handlerThread = ll0oOilllo.I000OOo1O;
/* 13 */                            if (handlerThread == null) {
/* 25 */                                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
/* 28 */                                ll0oOilllo.I000OOo1O = handlerThread2;
/* 30 */                                handlerThread2.start();
/* 33 */                                handlerThread = ll0oOilllo.I000OOo1O;
                                    }
                                } finally {
                                }
                            }
/* 36 */                    Looper looper = handlerThread.getLooper();
/* 42 */                    Context applicationContext = context.getApplicationContext();
/* 46 */                    Object obj = Io0i1l.I0000O;
/* 48 */                    Io0iOoo io0iOoo2 = new Io0iOoo(applicationContext, looper);
/* 51 */                    I00oI0i = io0iOoo2;
/* 53 */                    io0iOoo = io0iOoo2;
                        }
                    }
/* 60 */            return io0iOoo;
                }

                public final i0Ol1Ool00 I00000oIO(Io0i01 io0i01) {
/* 1 */             ConcurrentHashMap concurrentHashMap = this.I00l0OO0IO;
/* 3 */             I11Oil i11Oil = io0i01.I0001Ioi1lo;
/* 9 */             i0Ol1Ool00 i0ol1ool00 = (i0Ol1Ool00) concurrentHashMap.get(i11Oil);
/* 11 */            if (i0ol1ool00 == null) {
/* 15 */                i0Ol1Ool00 i0ol1ool002 = new i0Ol1Ool00();
/* 18 */                i0ol1ool002.I0010o = this;
/* 25 */                i0ol1ool002.I000II = new LinkedList();
/* 32 */                i0ol1ool002.I000iOII = new HashSet();
/* 39 */                i0ol1ool002.I000l1 = new HashMap();
/* 46 */                i0ol1ool002.I00100l0 = new ArrayList();
/* 49 */                i0ol1ool002.I00100o1O0lo = null;
/* 52 */                i0ol1ool002.I0010I0i = 0;
/* 56 */                Looper looper = this.I00lli11.getLooper();
/* 64 */                I0Oi111ii i0Oi111iiI00000oIO = io0i01.I00000oIO().I00000oIO();
/* 79 */                Io0OoIoOo io0OoIoOoI00000oIO = ((i0Oio1) io0i01.I0000O.I00iiI).I00000oIO(io0i01.I00000oIO, looper, i0Oi111iiI00000oIO, io0i01.I0000oI00, i0ol1ool002, i0ol1ool002);
/* 83 */                O1OIll00i o1OIll00i = io0i01.I0000Il00O;
/* 85 */                if (o1OIll00i == null || !(io0OoIoOoI00000oIO instanceof I1oIol10O)) {
/* 98 */                    String str = io0i01.I00000oOI;
/* 100 */                   if (str != null && (io0OoIoOoI00000oIO instanceof I1oIol10O)) {
/* 109 */                       io0OoIoOoI00000oIO.I0010o = str;
                            }
                        } else {
/* 95 */                    io0OoIoOoI00000oIO.I00111O = o1OIll00i;
                        }
/* 111 */               i0ol1ool002.I000O01llI0 = io0OoIoOoI00000oIO;
/* 115 */               i0ol1ool002.I000OOo1O = io0i01.I0001Ioi1lo;
/* 120 */               OoIol00Ool ooIol00Ool = new OoIol00Ool(5);
/* 132 */               ooIol00Ool.I00iiI = Collections.synchronizedMap(new WeakHashMap());
/* 143 */               ooIol00Ool.I00iiO = Collections.synchronizedMap(new WeakHashMap());
/* 145 */               VarHandle.storeStoreFence();
/* 148 */               i0ol1ool002.I000OiO = ooIol00Ool;
/* 152 */               i0ol1ool002.I000lI = io0i01.I000O01llI0;
/* 158 */               if (io0OoIoOoI00000oIO.I0010I0i()) {
/* 160 */                   Context context = this.I00ilI0I1;
/* 162 */                   O1oo1il01OoO o1oo1il01OoO = this.I00lli11;
/* 170 */                   I0Oi111ii i0Oi111iiI00000oIO2 = io0i01.I00000oIO().I00000oIO();
/* 174 */                   i0Oio1 i0oio1 = i0Oll0oI110.I000oI1ioi;
/* 179 */                   i0Oll0oI110 i0oll0oi110 = new i0Oll0oI110("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
/* 182 */                   i0oll0oi110.I000O01llI0 = context;
/* 184 */                   i0oll0oi110.I000OOo1O = o1oo1il01OoO;
/* 186 */                   i0oll0oi110.I000l1 = i0Oi111iiI00000oIO2;
/* 192 */                   i0oll0oi110.I000iOII = (Set) i0Oi111iiI00000oIO2.I00iiI;
/* 194 */                   i0oll0oi110.I000OiO = i0oio1;
/* 196 */                   VarHandle.storeStoreFence();
/* 199 */                   i0ol1ool002.I000o00OoI0I = i0oll0oi110;
                        } else {
/* 205 */                   i0ol1ool002.I000o00OoI0I = null;
                        }
/* 201 */               VarHandle.storeStoreFence();
/* 208 */               concurrentHashMap.put(i11Oil, i0ol1ool002);
/* 211 */               i0ol1ool00 = i0ol1ool002;
                    }
/* 218 */           if (i0ol1ool00.I000O01llI0.I0010I0i()) {
/* 222 */               this.I00ll1.add(i11Oil);
                    }
/* 225 */           i0ol1ool00.I0010I0i();
/* 437 */           return i0ol1ool00;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00000oOI(OloIlI0ll oloIlI0ll, int i, Io0i01 io0i01) {
                    i0OlO1ooli i0olo1ooli;
/* 1 */             if (i != 0) {
/* 3 */                 I11Oil i11Oil = io0i01.I0001Ioi1lo;
/* 9 */                 if (I0000oI00()) {
/* 18 */                    Oi1oo0 oi1oo0 = (Oi1oo0) Oi1ol0llI.I000l1().I00iiI;
/* 20 */                    boolean z = true;
/* 21 */                    if (oi1oo0 != null) {
/* 25 */                        if (oi1oo0.I00iiI) {
/* 27 */                            boolean z2 = oi1oo0.I00iiO;
/* 35 */                            i0Ol1Ool00 i0ol1ool00 = (i0Ol1Ool00) this.I00l0OO0IO.get(i11Oil);
/* 37 */                            if (i0ol1ool00 != null) {
/* 39 */                                Io0OoIoOo io0OoIoOo = i0ol1ool00.I000O01llI0;
/* 43 */                                if (io0OoIoOo instanceof I1oIol10O) {
/* 45 */                                    Io0OoIoOo io0OoIoOo2 = io0OoIoOo;
/* 49 */                                    if (io0OoIoOo2.I001i1O0Ol == null || io0OoIoOo2.I00100o1O0lo()) {
/* 71 */                                        z = z2;
                                            } else {
/* 57 */                                        IOloii1OiOI iOloii1OiOII00000oIO = i0OlO1ooli.I00000oIO(i0ol1ool00, io0OoIoOo2, i);
/* 61 */                                        if (iOloii1OiOII00000oIO != null) {
                                                    i0ol1ool00.I0010I0i++;
/* 68 */                                            z = iOloii1OiOII00000oIO.I00iiO;
                                                }
                                            }
                                        }
                                    }
                                }
/* 73 */                        i0olo1ooli = null;
                            }
/* 86 */                    long jCurrentTimeMillis = z ? System.currentTimeMillis() : 0L;
/* 89 */                    long jElapsedRealtime = z ? SystemClock.elapsedRealtime() : 0L;
/* 93 */                    i0OlO1ooli i0olo1ooli2 = new i0OlO1ooli();
/* 96 */                    i0olo1ooli2.I00iOIl = this;
/* 98 */                    i0olo1ooli2.I00iiI = i;
/* 100 */                   i0olo1ooli2.I00iiO = i11Oil;
/* 102 */                   i0olo1ooli2.I00iio = jCurrentTimeMillis;
/* 104 */                   i0olo1ooli2.I00ilI0I1 = jElapsedRealtime;
/* 106 */                   VarHandle.storeStoreFence();
/* 109 */                   i0olo1ooli = i0olo1ooli2;
                        } else {
/* 73 */                    i0olo1ooli = null;
                        }
/* 110 */               if (i0olo1ooli != null) {
/* 112 */                   o0IiOl o0iiol = oloIlI0ll.I00000oIO;
/* 114 */                   O1oo1il01OoO o1oo1il01OoO = this.I00lli11;
/* 116 */                   Objects.requireNonNull(o1oo1il01OoO);
/* 122 */                   i0OlIl1l1o i0olil1l1o = new i0OlIl1l1o(0);
/* 125 */                   i0olil1l1o.I00iiI = o1oo1il01OoO;
/* 127 */                   VarHandle.storeStoreFence();
/* 130 */                   o0iiol.I00000oOI(i0olil1l1o, i0olo1ooli);
                        }
                    }
                }

                public final boolean I0000oI00() {
                    int i;
/* 3 */             if (this.I00iiI) {
/* 41 */                return false;
                    }
/* 12 */            Oi1oo0 oi1oo0 = (Oi1oo0) Oi1ol0llI.I000l1().I00iiI;
/* 14 */            if (oi1oo0 != null && !oi1oo0.I00iiI) {
/* 41 */                return false;
                    }
/* 24 */            SparseIntArray sparseIntArray = (SparseIntArray) this.I00io1l.I00iiI;
                    synchronized (sparseIntArray) {
/* 31 */                i = sparseIntArray.get(203400000, -1);
                    }
                    return i == -1 || i == 0;
                }

                public final boolean I0001Ioi1lo(IOlo10lO1iOl iOlo10lO1iOl, int i) throws Resources.NotFoundException {
/* 1 */             Io0i1l io0i1l = this.I00ilO0;
/* 3 */             io0i1l.getClass();
/* 6 */             Context context = this.I00ilI0I1;
/* 13 */            if (!Ioo1l1i00O.I00000oIO(context)) {
/* 17 */                int i2 = iOlo10lO1iOl.I00iiI;
/* 19 */                PendingIntent activity = iOlo10lO1iOl.I00iiO;
/* 29 */                if (!((i2 == 0 || activity == null) ? false : true)) {
/* 32 */                    activity = null;
/* 33 */                    Intent intentI00000oIO = io0i1l.I00000oIO(i2, context, null);
/* 37 */                    if (intentI00000oIO != null) {
/* 42 */                        activity = PendingIntent.getActivity(context, 0, intentI00000oIO, 201326592);
                            }
                        }
/* 46 */                if (activity != null) {
/* 48 */                    int i3 = GoogleApiActivity.I00iiI;
/* 54 */                    Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
/* 59 */                    intent.putExtra("pending_intent", activity);
/* 64 */                    intent.putExtra("failing_client_id", i);
/* 69 */                    intent.putExtra("notify_manager", true);
/* 78 */                    io0i1l.I0000O(context, i2, PendingIntent.getActivity(context, 0, intent, 167772160));
/* 81 */                    Integer num = iOlo10lO1iOl.I00ilI0I1;
/* 105 */                   i0Oioli i0oioli = new i0Oioli(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), iOlo10lO1iOl.I00iiI, false);
/* 108 */                   i0i01Ii0iII i0i01ii0iii = io0i1l.I0000Il00O;
/* 110 */                   if (i0i01ii0iii == null) {
/* 120 */                       i0i01ii0iii = new i0i01Ii0iII(context, i0i01Ii0iII.I000iOII, I11O1IlIl1I.I00000oIO, Io0i00i0.I0000Il00O);
/* 123 */                       io0i1l.I0000Il00O = i0i01ii0iii;
                            }
/* 125 */                   IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 135 */                   iolIIo0o0IioI0000Il00O.I0000O = new IlIII1l[]{iO1i11l.I00000oOI};
/* 138 */                   iolIIo0o0IioI0000Il00O.I00000oIO = false;
/* 142 */                   iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 145 */                   iiolilo0iiil.I00iOIl = i0oioli;
/* 147 */                   VarHandle.storeStoreFence();
/* 150 */                   iolIIo0o0IioI0000Il00O.I0000Il00O = iiolilo0iiil;
/* 157 */                   i0i01ii0iii.I00000oOI(2, iolIIo0o0IioI0000Il00O.I00000oIO());
/* 21 */                    return true;
                        }
                    }
/* 12 */            return false;
                }

                public final void I000II(IOlo10lO1iOl iOlo10lO1iOl, int i) {
/* 5 */             if (I0001Ioi1lo(iOlo10lO1iOl, i)) {
/* 37 */                return;
                    }
/* 9 */             O1oo1il01OoO o1oo1il01OoO = this.I00lli11;
/* 15 */            o1oo1il01OoO.sendMessage(o1oo1il01OoO.obtainMessage(5, i, 0, iOlo10lO1iOl));
                }

                /* JADX WARN: Removed duplicated region for block: B:154:0x0304  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean handleMessage(Message message) {
                    i0Ol1Ool00 i0ol1ool00;
                    boolean z;
                    IlIII1l[] ilIII1lArrI00000oIO;
/* 3 */             O1oo1il01OoO o1oo1il01OoO = this.I00lli11;
/* 5 */             ConcurrentHashMap concurrentHashMap = this.I00l0OO0IO;
/* 7 */             int i = message.what;
                    switch (i) {
                        case 1:
/* 1017 */                  this.I00iOIl = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
/* 1021 */                  o1oo1il01OoO.removeMessages(12);
/* 1028 */                  Iterator it = concurrentHashMap.keySet().iterator();
/* 1036 */                  while (it.hasNext()) {
/* 1050 */                      o1oo1il01OoO.sendMessageDelayed(o1oo1il01OoO.obtainMessage(12, (I11Oil) it.next()), this.I00iOIl);
                            }
/* 16 */                    return true;
                        case 2:
/* 1003 */                  throw IIlIOloOOO.I000l1(message.obj);
                        case 3:
/* 976 */                   for (i0Ol1Ool00 i0ol1ool002 : concurrentHashMap.values()) {
/* 988 */                       lII0I0I000I.I0000Il00O(i0ol1ool002.I0010o.I00lli11);
/* 991 */                       i0ol1ool002.I00100o1O0lo = null;
/* 993 */                       i0ol1ool002.I0010I0i();
                            }
/* 16 */                    return true;
                        case 4:
                        case 8:
                        case 13:
/* 913 */                   i0Oli1olIilo i0oli1oliilo = (i0Oli1olIilo) message.obj;
/* 915 */                   Io0i01 io0i01 = i0oli1oliilo.I0000Il00O;
/* 917 */                   i0OlOlO i0ololo = i0oli1oliilo.I00000oIO;
/* 925 */                   i0Ol1Ool00 i0ol1ool00I00000oIO = (i0Ol1Ool00) concurrentHashMap.get(io0i01.I0001Ioi1lo);
/* 927 */                   if (i0ol1ool00I00000oIO == null) {
/* 929 */                       i0ol1ool00I00000oIO = I00000oIO(io0i01);
                            }
/* 939 */                   if (!i0ol1ool00I00000oIO.I000O01llI0.I0010I0i() || this.I00l0I0l0lO1.get() == i0oli1oliilo.I00000oOI) {
/* 960 */                       i0ol1ool00I00000oIO.I00100l0(i0ololo);
/* 16 */                        return true;
                            }
/* 953 */                   i0ololo.I0000O(I00o0iI0io1);
/* 956 */                   i0ol1ool00I00000oIO.I00100o1O0lo();
/* 16 */                    return true;
                        case 5:
/* 779 */                   int i2 = message.arg1;
/* 783 */                   IOlo10lO1iOl iOlo10lO1iOl = (IOlo10lO1iOl) message.obj;
/* 789 */                   Iterator it2 = concurrentHashMap.values().iterator();
                            while (true) {
/* 797 */                       if (it2.hasNext()) {
/* 803 */                           i0ol1ool00 = (i0Ol1Ool00) it2.next();
/* 807 */                           if (i0ol1ool00.I000lI == i2) {
                                    }
                                } else {
/* 810 */                           i0ol1ool00 = null;
                                }
                            }
/* 811 */                   if (i0ol1ool00 == null) {
/* 907 */                       Log.wtf("GoogleApiManager", IIlIOloOOO.I00100o1O0lo(new StringBuilder(String.valueOf(i2).length() + 65), "Could not find API instance ", i2, " while trying to fail enqueued calls."), new Exception());
/* 16 */                        return true;
                            }
/* 813 */                   int i3 = iOlo10lO1iOl.I00iiI;
/* 817 */                   if (i3 != 13) {
/* 875 */                       i0ol1ool00.I000OiO(I0000Il00O(i0ol1ool00.I000OOo1O, iOlo10lO1iOl));
/* 16 */                        return true;
                            }
/* 823 */                   this.I00ilO0.getClass();
/* 826 */                   int i4 = Io0ii0lOoi.I0000oI00;
/* 828 */                   String strI00000oOI = IOlo10lO1iOl.I00000oOI(i3);
/* 832 */                   String str = iOlo10lO1iOl.I00iio;
/* 865 */                   i0ol1ool00.I000OiO(new Status(17, IIl001iO0Io.I00100o1O0lo(new StringBuilder(strI00000oOI.length() + 69 + String.valueOf(str).length()), "Error resolution was canceled by the user, original error message: ", strI00000oOI, ": ", str), null, null));
/* 16 */                    return true;
                        case 6:
/* 670 */                   Context context = this.I00ilI0I1;
/* 678 */                   if (context.getApplicationContext() instanceof Application) {
/* 686 */                       I1o00Ol1.I00000oIO((Application) context.getApplicationContext());
/* 689 */                       I1o00Ol1 i1o00Ol1 = I1o00Ol1.I00ilI0I1;
/* 693 */                       i0Ol0lo10 i0ol0lo10 = new i0Ol0lo10();
/* 696 */                       i0ol0lo10.I00000oIO = this;
/* 698 */                       VarHandle.storeStoreFence();
/* 701 */                       i1o00Ol1.getClass();
                                synchronized (i1o00Ol1) {
/* 707 */                           i1o00Ol1.I00iiO.add(i0ol0lo10);
                                }
/* 711 */                       AtomicBoolean atomicBoolean = i1o00Ol1.I00iOIl;
/* 713 */                       AtomicBoolean atomicBoolean2 = i1o00Ol1.I00iiI;
/* 719 */                       if (atomicBoolean2.get()) {
/* 767 */                           z = atomicBoolean.get();
/* 771 */                           if (!z) {
/* 773 */                               this.I00iOIl = 300000L;
/* 16 */                                return true;
                                    }
                                } else {
/* 721 */                           Boolean boolValueOf = lIIiIil0.I00000oOI;
/* 723 */                           if (boolValueOf == null) {
/* 729 */                               boolValueOf = Boolean.valueOf(Process.isIsolated());
/* 733 */                               lIIiIil0.I00000oOI = boolValueOf;
                                    }
/* 739 */                           if (boolValueOf.booleanValue()) {
/* 765 */                               z = true;
/* 771 */                               if (!z) {
                                        }
                                    } else {
/* 743 */                               ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
/* 746 */                               ActivityManager.getMyMemoryState(runningAppProcessInfo);
/* 753 */                               if (!atomicBoolean2.getAndSet(true) && runningAppProcessInfo.importance > 100) {
/* 761 */                                   atomicBoolean.set(true);
                                        }
/* 767 */                               z = atomicBoolean.get();
/* 771 */                               if (!z) {
                                        }
                                    }
                                }
                            }
/* 16 */                    return true;
                        case 7:
/* 666 */                   I00000oIO((Io0i01) message.obj);
/* 16 */                    return true;
                        case 9:
/* 637 */                   if (concurrentHashMap.containsKey(message.obj)) {
/* 645 */                       i0Ol1Ool00 i0ol1ool003 = (i0Ol1Ool00) concurrentHashMap.get(message.obj);
/* 651 */                       lII0I0I000I.I0000Il00O(i0ol1ool003.I0010o.I00lli11);
/* 656 */                       if (i0ol1ool003.I000oI1ioi) {
/* 658 */                           i0ol1ool003.I0010I0i();
/* 16 */                            return true;
                                }
                            }
/* 16 */                    return true;
                        case 10:
/* 593 */                   I1Io1oIoo i1Io1oIoo = this.I00ll1;
/* 595 */                   i1Io1oIoo.getClass();
/* 600 */                   I1IlliII1i i1IlliII1i = new I1IlliII1i(i1Io1oIoo);
/* 607 */                   while (i1IlliII1i.hasNext()) {
/* 619 */                       i0Ol1Ool00 i0ol1ool004 = (i0Ol1Ool00) concurrentHashMap.remove((I11Oil) i1IlliII1i.next());
/* 621 */                       if (i0ol1ool004 != null) {
/* 623 */                           i0ol1ool004.I00100o1O0lo();
                                }
                            }
/* 627 */                   i1Io1oIoo.clear();
/* 16 */                    return true;
                        case 11:
/* 506 */                   if (concurrentHashMap.containsKey(message.obj)) {
/* 514 */                       i0Ol1Ool00 i0ol1ool005 = (i0Ol1Ool00) concurrentHashMap.get(message.obj);
/* 516 */                       Io0iOoo io0iOoo = i0ol1ool005.I0010o;
/* 520 */                       lII0I0I000I.I0000Il00O(io0iOoo.I00lli11);
/* 523 */                       boolean z2 = i0ol1ool005.I000oI1ioi;
/* 525 */                       if (z2) {
/* 527 */                           if (z2) {
/* 531 */                               O1oo1il01OoO o1oo1il01OoO2 = i0ol1ool005.I0010o.I00lli11;
/* 533 */                               I11Oil i11Oil = i0ol1ool005.I000OOo1O;
/* 537 */                               o1oo1il01OoO2.removeMessages(11, i11Oil);
/* 542 */                               o1oo1il01OoO2.removeMessages(9, i11Oil);
/* 545 */                               i0ol1ool005.I000oI1ioi = false;
                                    }
/* 580 */                           i0ol1ool005.I000OiO(io0iOoo.I00ilO0.I00000oOI(io0iOoo.I00ilI0I1, Io0iI1l01il.I00000oIO) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
/* 589 */                           i0ol1ool005.I000O01llI0.I0000O("Timing out connection while resuming.");
/* 16 */                            return true;
                                }
                            }
/* 16 */                    return true;
                        case 12:
/* 429 */                   if (concurrentHashMap.containsKey(message.obj)) {
/* 437 */                       i0Ol1Ool00 i0ol1ool006 = (i0Ol1Ool00) concurrentHashMap.get(message.obj);
/* 443 */                       lII0I0I000I.I0000Il00O(i0ol1ool006.I0010o.I00lli11);
/* 446 */                       Io0OoIoOo io0OoIoOo = i0ol1ool006.I000O01llI0;
/* 455 */                       if (io0OoIoOo.I00100l0() && i0ol1ool006.I000l1.isEmpty()) {
/* 465 */                           OoIol00Ool ooIol00Ool = i0ol1ool006.I000OiO;
/* 475 */                           if (((Map) ooIol00Ool.I00iiI).isEmpty() && ((Map) ooIol00Ool.I00iiO).isEmpty()) {
/* 492 */                               io0OoIoOo.I0000O("Timing out service connection.");
/* 16 */                                return true;
                                    }
/* 496 */                           i0ol1ool006.I000iOII();
                                }
/* 16 */                        return true;
                            }
/* 16 */                    return true;
                        case 14:
/* 422 */                   throw IIlIOloOOO.I000l1(message.obj);
                        case 15:
/* 366 */                   i0Ol1iO1 i0ol1io1 = (i0Ol1iO1) message.obj;
/* 374 */                   if (concurrentHashMap.containsKey(i0ol1io1.I00000oIO)) {
/* 382 */                       i0Ol1Ool00 i0ol1ool007 = (i0Ol1Ool00) concurrentHashMap.get(i0ol1io1.I00000oIO);
/* 390 */                       if (i0ol1ool007.I00100l0.contains(i0ol1io1) && !i0ol1ool007.I000oI1ioi) {
/* 406 */                           if (i0ol1ool007.I000O01llI0.I00100l0()) {
/* 412 */                               i0ol1ool007.I000II();
/* 16 */                                return true;
                                    }
/* 408 */                           i0ol1ool007.I0010I0i();
/* 16 */                            return true;
                                }
                            }
/* 16 */                    return true;
                        case 16:
/* 238 */                   i0Ol1iO1 i0ol1io12 = (i0Ol1iO1) message.obj;
/* 246 */                   if (concurrentHashMap.containsKey(i0ol1io12.I00000oIO)) {
/* 254 */                       i0Ol1Ool00 i0ol1ool008 = (i0Ol1Ool00) concurrentHashMap.get(i0ol1io12.I00000oIO);
/* 262 */                       if (i0ol1ool008.I00100l0.remove(i0ol1io12)) {
/* 264 */                           Io0iOoo io0iOoo2 = i0ol1ool008.I0010o;
/* 270 */                           io0iOoo2.I00lli11.removeMessages(15, i0ol1io12);
/* 277 */                           io0iOoo2.I00lli11.removeMessages(16, i0ol1io12);
/* 280 */                           IlIII1l ilIII1l = i0ol1io12.I00000oOI;
/* 282 */                           LinkedList<i0OlOlO> linkedList = i0ol1ool008.I000II;
/* 290 */                           ArrayList arrayList = new ArrayList(linkedList.size());
/* 301 */                           for (i0OlOlO i0ololo2 : linkedList) {
/* 309 */                               if (i0ololo2 != null && (ilIII1lArrI00000oIO = i0ololo2.I00000oIO(i0ol1ool008)) != null) {
/* 317 */                                   int length = ilIII1lArrI00000oIO.length;
/* 318 */                                   int i5 = 0;
                                            while (true) {
/* 319 */                                       if (i5 >= length) {
                                                    break;
                                                }
/* 327 */                                       if (!l1ioii1I10Io.I00000oIO(ilIII1lArrI00000oIO[i5], ilIII1l)) {
/* 335 */                                           i5++;
                                                } else if (i5 >= 0) {
/* 331 */                                           arrayList.add(i0ololo2);
                                                }
                                            }
                                        }
                                    }
/* 338 */                           int size = arrayList.size();
/* 342 */                           for (int i6 = 0; i6 < size; i6++) {
/* 348 */                               i0OlOlO i0ololo3 = (i0OlOlO) arrayList.get(i6);
/* 350 */                               linkedList.remove(i0ololo3);
/* 358 */                               i0ololo3.I0000oI00(new OoiolI1Oll(ilIII1l));
                                    }
                                }
                            }
/* 16 */                    return true;
                        case 17:
/* 202 */                   OloOI1o oloOI1o = this.I00iiO;
/* 204 */                   if (oloOI1o != null) {
/* 208 */                       if (oloOI1o.I00iOIl > 0 || I0000oI00()) {
/* 216 */                           i0i01Ii0iII i0i01ii0iiiI00000oIO = this.I00iio;
/* 218 */                           if (i0i01ii0iiiI00000oIO == null) {
/* 224 */                               i0i01ii0iiiI00000oIO = lOio11O.I00000oIO(this.I00ilI0I1, OloOII1ioI1l.I0000Il00O);
/* 228 */                               this.I00iio = i0i01ii0iiiI00000oIO;
                                    }
/* 230 */                           i0i01ii0iiiI00000oIO.I0000Il00O(oloOI1o);
                                }
/* 233 */                       this.I00iiO = null;
/* 16 */                        return true;
                            }
/* 16 */                    return true;
                        case PoseLandmark.RIGHT_PINKY:
/* 56 */                    i0OlOI1 i0oloi1 = (i0OlOI1) message.obj;
/* 58 */                    long j = i0oloi1.I0000Il00O;
/* 60 */                    O1lli10oolO o1lli10oolO = i0oloi1.I00000oIO;
/* 62 */                    int i7 = i0oloi1.I00000oOI;
/* 68 */                    if (j == 0) {
/* 80 */                        OloOI1o oloOI1o2 = new OloOI1o(i7, Arrays.asList(o1lli10oolO));
/* 83 */                        i0i01Ii0iII i0i01ii0iiiI00000oIO2 = this.I00iio;
/* 85 */                        if (i0i01ii0iiiI00000oIO2 == null) {
/* 91 */                            i0i01ii0iiiI00000oIO2 = lOio11O.I00000oIO(this.I00ilI0I1, OloOII1ioI1l.I0000Il00O);
/* 95 */                            this.I00iio = i0i01ii0iiiI00000oIO2;
                                }
/* 97 */                        i0i01ii0iiiI00000oIO2.I0000Il00O(oloOI1o2);
/* 16 */                        return true;
                            }
/* 101 */                   OloOI1o oloOI1o3 = this.I00iiO;
/* 103 */                   if (oloOI1o3 != null) {
/* 105 */                       List list = oloOI1o3.I00iiI;
/* 109 */                       if (oloOI1o3.I00iOIl != i7 || (list != null && list.size() >= i0oloi1.I0000O)) {
/* 139 */                           o1oo1il01OoO.removeMessages(17);
/* 142 */                           OloOI1o oloOI1o4 = this.I00iiO;
/* 144 */                           if (oloOI1o4 != null) {
/* 148 */                               if (oloOI1o4.I00iOIl > 0 || I0000oI00()) {
/* 156 */                                   i0i01Ii0iII i0i01ii0iiiI00000oIO3 = this.I00iio;
/* 158 */                                   if (i0i01ii0iiiI00000oIO3 == null) {
/* 164 */                                       i0i01ii0iiiI00000oIO3 = lOio11O.I00000oIO(this.I00ilI0I1, OloOII1ioI1l.I0000Il00O);
/* 168 */                                       this.I00iio = i0i01ii0iiiI00000oIO3;
                                            }
/* 170 */                                   i0i01ii0iiiI00000oIO3.I0000Il00O(oloOI1o4);
                                        }
/* 173 */                               this.I00iiO = null;
                                    }
                                } else {
/* 122 */                           OloOI1o oloOI1o5 = this.I00iiO;
/* 124 */                           List arrayList2 = oloOI1o5.I00iiI;
/* 126 */                           if (arrayList2 == null) {
/* 130 */                               arrayList2 = new ArrayList();
/* 133 */                               oloOI1o5.I00iiI = arrayList2;
                                    }
/* 135 */                           arrayList2.add(o1lli10oolO);
                                }
                            }
/* 177 */                   if (this.I00iiO == null) {
/* 181 */                       ArrayList arrayList3 = new ArrayList();
/* 184 */                       arrayList3.add(o1lli10oolO);
/* 192 */                       this.I00iiO = new OloOI1o(i7, arrayList3);
/* 198 */                       o1oo1il01OoO.sendMessageDelayed(o1oo1il01OoO.obtainMessage(17), j);
/* 16 */                        return true;
                            }
/* 16 */                    return true;
                        case PoseLandmark.LEFT_INDEX:
/* 51 */                    this.I00iiI = false;
/* 16 */                    return true;
                        default:
/* 32 */                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
/* 37 */                    sb.append("Unknown message id: ");
/* 40 */                    sb.append(i);
/* 47 */                    Log.w("GoogleApiManager", sb.toString());
/* 14 */                    return false;
                    }
                }
            }
