            package p000;

            import android.app.job.JobScheduler;
            import android.content.Context;
            import android.content.IntentFilter;
            import android.content.SharedPreferences;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import android.util.SparseArray;
            import com.google.android.play.core.assetpacks.bs;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.text.internal.zzr;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.ReferenceQueue;
            import java.security.SecureRandom;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Random;
            import java.util.RandomAccess;
            import java.util.Set;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import org.json.JSONException;
            
/* 10 */    public final class l0iOoII1Il implements Runnable {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public l0iOoII1Il(O0olI0 o0olI0, Runnable runnable) {
/* 2 */             this.I00iOIl = 1;
/* 7 */             this.I00iiO = o0olI0;
/* 9 */             this.I00iiI = runnable;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(22:99|(1:101)(26:103|432|104|(1:108)(2:109|(1:111))|420|112|(7:114|(1:116)(1:118)|424|119|446|120|121)|126|(2:128|(2:130|(2:132|(2:134|(2:136|(2:138|(1:140)(1:141))(1:142))(1:143))(1:144))(1:145))(1:146))(1:147)|148|422|149|(1:151)(1:152)|153|(1:155)(1:156)|157|(1:159)|160|163|(1:165)(7:167|(0)(1:170)|(3:426|172|(1:174)(1:175))(0)|(2:181|(1:183)(4:184|(3:187|(1:459)(1:460)|185)|458|190))(1:190)|(1:192)(1:193)|194|(30:196|(1:198)(1:199)|200|(1:202)|203|(1:205)(1:206)|207|(2:209|(2:214|(1:216)(1:217))(1:(3:213|214|(0)(0))(1:218)))(0)|219|(19:224|(1:226)|(1:240)(1:241)|242|(1:244)|245|(2:250|(1:255))(1:249)|256|(3:260|(1:262)|263)|264|(1:266)|267|(1:271)|272|(3:274|(7:276|(1:278)(1:279)|280|(1:282)|283|(4:287|(1:289)|290|(1:292))|293)(1:295)|294)(10:296|(2:298|(2:311|312)(3:301|(5:303|(1:305)(1:306)|307|(1:309)|310)(0)|312))(1:313)|314|(1:316)|317|438|318|319|323|(5:325|(1:327)(1:328)|(1:332)|(1:334)|335))|336|(2:338|(5:340|(1:342)|343|(1:345)|346))|347|479)(1:223)|227|(1:238)|237|(0)(0)|242|(0)|245|(3:247|250|(1:255))(0)|256|(4:258|260|(0)|263)(0)|264|(0)|267|(2:269|271)|272|(0)(0)|336|(0)|347|479)(2:348|480))|166|(0)(0)|(0)(0)|(0)(0)|194|(0)(0))|102|126|(0)(0)|148|422|149|(0)(0)|153|(0)(0)|157|(0)|160|163|(0)(0)|166|(0)(0)|(0)(0)|(0)(0)|194|(0)(0)) */
                /* JADX WARN: Code restructure failed: missing block: B:161:0x0512, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:162:0x0513, code lost:
                
                    p000.l0olllO1i.I000II(r9);
                    r9.I00ilO0.I0000O(p000.l01O0IO1ooO0.I010ioo(r2), "Fetching Google App Id failed with exception. appId", r0);
                 */
                /* JADX WARN: Removed duplicated region for block: B:128:0x0471  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x04db  */
                /* JADX WARN: Removed duplicated region for block: B:151:0x04ef  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x04f0 A[Catch: IllegalStateException -> 0x0512, TryCatch #1 {IllegalStateException -> 0x0512, blocks: (B:149:0x04e7, B:153:0x04f6, B:157:0x04fe, B:159:0x0502, B:152:0x04f0), top: B:422:0x04e7 }] */
                /* JADX WARN: Removed duplicated region for block: B:155:0x04fc A[DONT_GENERATE] */
                /* JADX WARN: Removed duplicated region for block: B:156:0x04fd  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x0502 A[Catch: IllegalStateException -> 0x0512, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0512, blocks: (B:149:0x04e7, B:153:0x04f6, B:157:0x04fe, B:159:0x0502, B:152:0x04f0), top: B:422:0x04e7 }] */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0535  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x0543  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x0564  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x057c  */
                /* JADX WARN: Removed duplicated region for block: B:190:0x05ab  */
                /* JADX WARN: Removed duplicated region for block: B:192:0x05af  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x05b6  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x05da  */
                /* JADX WARN: Removed duplicated region for block: B:212:0x069f  */
                /* JADX WARN: Removed duplicated region for block: B:216:0x06e1  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x06fe  */
                /* JADX WARN: Removed duplicated region for block: B:240:0x0789  */
                /* JADX WARN: Removed duplicated region for block: B:241:0x0791  */
                /* JADX WARN: Removed duplicated region for block: B:244:0x07ba  */
                /* JADX WARN: Removed duplicated region for block: B:250:0x07e9  */
                /* JADX WARN: Removed duplicated region for block: B:260:0x081a  */
                /* JADX WARN: Removed duplicated region for block: B:262:0x0838  */
                /* JADX WARN: Removed duplicated region for block: B:266:0x086c  */
                /* JADX WARN: Removed duplicated region for block: B:274:0x08a1  */
                /* JADX WARN: Removed duplicated region for block: B:296:0x090d  */
                /* JADX WARN: Removed duplicated region for block: B:311:0x09b5  */
                /* JADX WARN: Removed duplicated region for block: B:338:0x0a7b  */
                /* JADX WARN: Removed duplicated region for block: B:348:0x0ada  */
                /* JADX WARN: Removed duplicated region for block: B:426:0x0554 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void run() throws JSONException, Resources.NotFoundException, PackageManager.NameNotFoundException, ClassNotFoundException {
                    Throwable thI00000oOI;
                    String str;
                    String str2;
                    String str3;
                    PackageManager packageManager;
                    String string;
                    int i;
                    String str4;
                    String str5;
                    int iI00000oOI;
                    Bundle bundleI01101olii;
                    Integer numValueOf;
                    String[] stringArray;
                    List<String> listAsList;
                    lIo1Iil lio1iil;
                    l0olllO1i l0olllo1i;
                    String str6;
                    IOloiOI1 iOloiOI1;
                    lioil0ilIOi lioil0ilioi;
                    l1ioIO011Oo l1ioio011oo;
                    l0olllO1i l0olllo1i2;
                    l1iIoO01 l1iioo01I011IO1I11OI;
                    l1iIoO01 l1iioo01I011IO1I11OI2;
                    Boolean boolI0110OiO;
                    l0O0o010I l0o0o010i;
                    iili011O1 iili011o1;
                    lioil0ilIOi lioil0ilioi2;
                    I1ii1l10IO i1ii1l10IO;
                    l01O0IO1ooO0 l01o0io1ooo0;
                    IOloiOI1 iOloiOI12;
                    boolean z;
                    String strI00000oIO;
                    Bundle bundle;
/* 5 */             int i2 = 3;
/* 6 */             i1liliil11 i1liliil11Var = null;
/* 8 */             int i3 = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 3006 */                  l0iO00i1IO0 l0io00i1io0 = (l0iO00i1IO0) this.I00iiO;
/* 3010 */                  ListenableFuture listenableFuture = (ListenableFuture) this.I00iiI;
/* 3014 */                  if ((listenableFuture instanceof l01loiOOo11l) && (thI00000oOI = ((l01loiOOo11l) listenableFuture).I00000oOI()) != null) {
/* 3026 */                      l0io00i1io0.zza(thI00000oOI);
/* 3051 */                      return;
                            }
                            try {
/* 3034 */                      l0io00i1io0.zzb(ll00lliII.I0000Il00O(listenableFuture));
/* 3051 */                      return;
                            } catch (ExecutionException e) {
/* 3048 */                      l0io00i1io0.zza(e.getCause());
/* 3051 */                      return;
                            } catch (Throwable th) {
/* 3039 */                      l0io00i1io0.zza(th);
/* 3051 */                      return;
                            }
                        case 1:
                            while (true) {
                                try {
/* 2934 */                          ((Runnable) this.I00iiI).run();
                                } catch (Throwable th2) {
/* 2941 */                          iiooO1ll.I00000oIO(Il00o11.I00iOIl, th2);
                                }
/* 2948 */                      Runnable runnableI00ooiO1I = ((O0olI0) this.I00iiO).I00ooiO1I();
/* 2952 */                      if (runnableI00ooiO1I == null) {
/* 2984 */                          return;
                                }
                                try {
/* 2955 */                          this.I00iiI = runnableI00ooiO1I;
/* 2958 */                          i3++;
/* 2961 */                          if (i3 >= 16) {
/* 2965 */                              O0olI0 o0olI0 = (O0olI0) this.I00iiO;
/* 2973 */                              if (IiiIIO0IO.I0000Il00O(o0olI0.I00iiO, o0olI0)) {
/* 2977 */                                  O0olI0 o0olI02 = (O0olI0) this.I00iiO;
/* 2981 */                                  IiiIIO0IO.I00000oOI(o0olI02.I00iiO, o0olI02, this);
/* 2984 */                                  return;
                                        }
                                    }
                                } catch (Throwable th3) {
/* 2988 */                          O0olI0 o0olI03 = (O0olI0) this.I00iiO;
                                    synchronized (o0olI03.I00ilO0) {
/* 2995 */                              O0olI0.I00io1l.decrementAndGet(o0olI03);
/* 2999 */                              throw th3;
                                    }
                                }
                            }
                        case 2:
/* 2907 */                  ArrayList arrayList = ((IiI1i00oi) this.I00iiO).I00000oOI;
/* 2911 */                  OlIIlIO1O olIIlIO1O = (OlIIlIO1O) this.I00iiI;
/* 2917 */                  if (arrayList.contains(olIIlIO1O)) {
/* 2925 */                      Oi010OO0.I00000oIO(olIIlIO1O.I0000Il00O.I0100i, olIIlIO1O.I00000oIO);
/* 2928 */                      return;
                            }
/* 2928 */                  return;
                        case 3:
/* 2863 */                  i0Iio1OiI i0iio1oii = (i0Iio1OiI) this.I00iiI;
/* 2867 */                  bs bsVar = (bs) this.I00iiO;
                            synchronized (i0iio1oii) {
/* 2877 */                      Iterator it = new HashSet(i0iio1oii.I00000oIO).iterator();
/* 2885 */                      while (it.hasNext()) {
/* 2893 */                          ((OlO1OoIo1l) it.next()).onStateUpdate(bsVar);
                                }
                            }
/* 2900 */                  return;
                        case 4:
/* 2823 */                  ReferenceQueue referenceQueue = (ReferenceQueue) this.I00iiI;
/* 2833 */                  while (!((Set) this.I00iiO).isEmpty()) {
                                try {
/* 2839 */                          il11olo il11oloVar = (il11olo) referenceQueue.remove();
/* 2847 */                          if (il11oloVar.I00000oIO.remove(il11oloVar)) {
/* 2850 */                              il11oloVar.clear();
/* 2855 */                              il11oloVar.I00000oOI.getClass();
                                    }
                                } catch (InterruptedException unused) {
                                }
                            }
/* 2859 */                  return;
                        case 5:
/* 2817 */                  ((iOlloil01Ilo) this.I00iiI).zza((iOIoil) this.I00iiO);
/* 2820 */                  return;
                        case 6:
/* 2797 */                  ioii01Ii100 ioii01ii100 = (ioii01Ii100) this.I00iiI;
/* 2801 */                  ili0l0oo0 ili0l0oo0Var = (ili0l0oo0) this.I00iiO;
/* 2803 */                  ilOiOOII0I0 iloiooii0i0 = ioii01ii100.I00000oOI;
/* 2805 */                  ili0l0oo0Var.zzd();
/* 2808 */                  return;
                        case 7:
/* 557 */                   l0olllO1i l0olllo1i3 = (l0olllO1i) this.I00iiO;
/* 559 */                   AtomicInteger atomicInteger = l0olllo1i3.I00ooiO1I;
/* 563 */                   l1llIli l1llili = (l1llIli) this.I00iiI;
/* 565 */                   String string2 = "";
/* 567 */                   l0o10OoO0 l0o10ooo0 = l0olllo1i3.I00io1l;
/* 569 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i3.I00ilO0;
/* 571 */                   l0Oi0o l0oi0o = l0olllo1i3.I00ilI0I1;
/* 573 */                   lioil0ilIOi lioil0ilioi3 = l0olllo1i3.I00l0I0l0lO1;
/* 575 */                   Iioi0lilII iioi0lilII = l0olllo1i3.I00li1OI;
/* 577 */                   l0olllO1i.I000II(l0o10ooo0);
/* 580 */                   l0o10ooo0.I010II();
/* 583 */                   iIl1iil iil1iil = l0olllo1i3.I00iio;
/* 589 */                   ((l0olllO1i) iil1iil.I00iOIl).getClass();
/* 594 */                   iOolIl0IIo ioolil0iio = new iOolIl0IIo();
/* 597 */                   ioolil0iio.I00iOIl = l0olllo1i3;
                            l0olllo1i3.I00oo1iO0ll++;
/* 604 */                   ioolil0iio.I010iIIOlo();
/* 607 */                   l0olllo1i3.I00oII = ioolil0iio;
/* 609 */                   il1i11oOloil il1i11ooloil = l1llili.I0000O;
/* 616 */                   long j = il1i11ooloil == null ? 0L : il1i11ooloil.I00iOIl;
/* 618 */                   if (il1i11ooloil != null && (bundle = il1i11ooloil.I00iio) != null) {
/* 627 */                       string2 = bundle.getString("runtime_google_app_id", "");
                            }
/* 635 */                   long j2 = l1llili.I0000Il00O;
/* 637 */                   iooloO1iOil iooloo1ioil = new iooloO1iOil(l0olllo1i3);
/* 646 */                   iooloo1ioil.I00o101lO = 0L;
/* 649 */                   iooloo1ioil.I00oI0i = null;
/* 651 */                   iooloo1ioil.I00l0I0l0lO1 = j2;
/* 653 */                   iooloo1ioil.I00l0OO0IO = j;
/* 655 */                   iooloo1ioil.I00lli11 = string2;
/* 657 */                   VarHandle.storeStoreFence();
/* 660 */                   iooloo1ioil.I010i10l();
/* 663 */                   l0olllo1i3.I00oIiI10 = iooloo1ioil;
/* 667 */                   l00Ii0II l00ii0ii = new l00Ii0II(l0olllo1i3);
/* 681 */                   l00ii0ii.I00iiO = new iOio0o1oi1I(l00ii0ii, ((l0olllO1i) l00ii0ii.I00iOIl).I00iOIl);
/* 683 */                   VarHandle.storeStoreFence();
/* 686 */                   l00ii0ii.I010i10l();
/* 689 */                   l0olllo1i3.I00o101lO = l00ii0ii;
/* 693 */                   lOliOlO1Io loliolo1io = new lOliOlO1Io(l0olllo1i3);
/* 701 */                   loliolo1io.I00l0I0l0lO1 = new ArrayList();
/* 708 */                   loliolo1io.I00ioIO = new li1iIiOi10o(iioi0lilII);
/* 712 */                   lOl001Iii lol001iii = new lOl001Iii();
/* 715 */                   lol001iii.I00iiO = loliolo1io;
/* 717 */                   VarHandle.storeStoreFence();
/* 720 */                   loliolo1io.I00iiO = lol001iii;
/* 728 */                   loliolo1io.I00ilO0 = new lOIIlil0OO(loliolo1io, l0olllo1i3, 0);
/* 737 */                   loliolo1io.I00l0OO0IO = new lOIIlil0OO(loliolo1io, l0olllo1i3, 1);
/* 739 */                   VarHandle.storeStoreFence();
/* 742 */                   loliolo1io.I010i10l();
/* 745 */                   l0olllo1i3.I00oI0i = loliolo1io;
/* 747 */                   boolean z2 = lioil0ilioi3.I00iiI;
/* 751 */                   l0olllO1i l0olllo1i4 = (l0olllO1i) lioil0ilioi3.I00iOIl;
/* 753 */                   if (z2) {
/* 2791 */                      I000II.I001IO000("Can't initialize twice");
/* 2794 */                      return;
                            }
/* 755 */                   lioil0ilioi3.I010II();
/* 760 */                   SecureRandom secureRandom = new SecureRandom();
/* 763 */                   long jNextLong = secureRandom.nextLong();
/* 771 */                   if (jNextLong == 0) {
/* 773 */                       jNextLong = secureRandom.nextLong();
/* 779 */                       if (jNextLong == 0) {
/* 785 */                           l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) lioil0ilioi3.I00iOIl).I00ilO0;
/* 787 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 794 */                           l01o0io1ooo03.I00l0I0l0lO1.I00000oOI("Utils falling back to Random for random id");
                                }
                            }
/* 799 */                   lioil0ilioi3.I00iio.set(jNextLong);
/* 804 */                   l0olllo1i4.I00ooiO1I.incrementAndGet();
/* 808 */                   lioil0ilioi3.I00iiI = true;
/* 812 */                   if (l0oi0o.I00iiI) {
/* 2787 */                      I000II.I001IO000("Can't initialize twice");
/* 2794 */                      return;
                            }
/* 823 */                   SharedPreferences sharedPreferences = ((l0olllO1i) l0oi0o.I00iOIl).I00iOIl.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
/* 827 */                   l0oi0o.I00iiO = sharedPreferences;
/* 831 */                   boolean z3 = sharedPreferences.getBoolean("has_been_opened", false);
/* 835 */                   l0oi0o.I00oI0i = z3;
/* 837 */                   if (!z3) {
/* 841 */                       SharedPreferences.Editor editorEdit = l0oi0o.I00iiO.edit();
/* 846 */                       editorEdit.putBoolean("has_been_opened", true);
/* 849 */                       editorEdit.apply();
                            }
/* 869 */                   long jMax = Math.max(0L, ((Long) iol1II1ii1i.I0000O.I00000oIO(null)).longValue());
/* 873 */                   I0Oo1I101o i0Oo1I101o = new I0Oo1I101o();
/* 876 */                   i0Oo1I101o.I0000oI00 = l0oi0o;
/* 880 */                   lII0I0I000I.I0000O("health_monitor");
/* 890 */                   lII0I0I000I.I00000oOI(jMax > 0);
/* 895 */                   i0Oo1I101o.I00000oOI = "health_monitor:start";
/* 899 */                   i0Oo1I101o.I0000Il00O = "health_monitor:count";
/* 903 */                   i0Oo1I101o.I0000O = "health_monitor:value";
/* 905 */                   i0Oo1I101o.I00000oIO = jMax;
/* 907 */                   VarHandle.storeStoreFence();
/* 910 */                   l0oi0o.I00ilI0I1 = i0Oo1I101o;
/* 918 */                   ((l0olllO1i) l0oi0o.I00iOIl).I00ooiO1I.incrementAndGet();
/* 922 */                   l0oi0o.I00iiI = true;
/* 924 */                   iooloO1iOil iooloo1ioil2 = l0olllo1i3.I00oIiI10;
/* 928 */                   if (iooloo1ioil2.I00iiI) {
/* 2783 */                      I000II.I001IO000("Can't initialize twice");
/* 2794 */                      return;
                            }
/* 930 */                   String str7 = "";
/* 934 */                   l0olllO1i l0olllo1i5 = (l0olllO1i) iooloo1ioil2.I00iOIl;
/* 936 */                   l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i5.I00ilO0;
/* 938 */                   l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i5.I00ilO0;
/* 940 */                   l0olllO1i.I000II(l01o0io1ooo04);
/* 955 */                   l0olllO1i l0olllo1i6 = l0olllo1i4;
/* 964 */                   l01o0io1ooo04.I00lll10.I0000O(Long.valueOf(iooloo1ioil2.I00l0OO0IO), "sdkVersion bundled with app, dynamiteVersion", Long.valueOf(iooloo1ioil2.I00l0I0l0lO1));
/* 967 */                   Context context = l0olllo1i5.I00iOIl;
/* 969 */                   String packageName = context.getPackageName();
/* 973 */                   PackageManager packageManager2 = context.getPackageManager();
/* 979 */                   String installerPackageName = "unknown";
/* 983 */                   if (packageManager2 == null) {
/* 985 */                       l0olllO1i.I000II(l01o0io1ooo05);
/* 977 */                       str = "Unknown";
/* 550 */                       str2 = "measurement_enabled";
/* 1000 */                      l01o0io1ooo05.I00ilO0.I0000Il00O("PackageManager is null, app identity information might be inaccurate. appId", l01O0IO1ooO0.I010ioo(packageName));
                            } else {
/* 977 */                       str = "Unknown";
/* 550 */                       str2 = "measurement_enabled";
                                try {
/* 1016 */                          installerPackageName = packageManager2.getInstallerPackageName(packageName);
                                } catch (IllegalArgumentException unused2) {
/* 1021 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1032 */                          l01o0io1ooo05.I00ilO0.I0000Il00O("Error retrieving app installer package name. appId", l01O0IO1ooO0.I010ioo(packageName));
                                }
/* 1035 */                      if (installerPackageName == null) {
/* 1037 */                          installerPackageName = "manual_install";
                                } else if ("com.android.vending".equals(installerPackageName)) {
/* 930 */                           installerPackageName = "";
                                }
                                try {
/* 1055 */                          PackageInfo packageInfo = packageManager2.getPackageInfo(context.getPackageName(), 0);
/* 1059 */                          if (packageInfo != null) {
/* 1063 */                              CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
/* 1078 */                              string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : str;
                                        try {
/* 1080 */                                  str5 = packageInfo.versionName;
                                        } catch (PackageManager.NameNotFoundException unused3) {
/* 1093 */                                  str3 = string;
                                        }
                                        try {
/* 1084 */                                  packageManager = packageManager2;
/* 1082 */                                  i = packageInfo.versionCode;
/* 1087 */                                  str4 = str5;
                                        } catch (PackageManager.NameNotFoundException unused4) {
/* 1089 */                                  str3 = string;
/* 1090 */                                  str = str5;
/* 1097 */                                  l0olllO1i.I000II(l01o0io1ooo05);
/* 1106 */                                  packageManager = packageManager2;
/* 1110 */                                  l01o0io1ooo05.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(packageName), "Error retrieving package info. appId, appName", str3);
/* 1113 */                                  string = str3;
/* 1114 */                                  i = Integer.MIN_VALUE;
/* 1116 */                                  str4 = str;
/* 1118 */                                  iooloo1ioil2.I00iiO = packageName;
/* 1120 */                                  iooloo1ioil2.I00ilO0 = installerPackageName;
/* 1122 */                                  iooloo1ioil2.I00iio = str4;
/* 1124 */                                  iooloo1ioil2.I00ilI0I1 = i;
/* 1126 */                                  iooloo1ioil2.I00io1l = string;
/* 1130 */                                  iooloo1ioil2.I00ioIO = 0L;
/* 1132 */                                  iI00000oOI = l0olllo1i5.I00000oOI();
/* 1136 */                                  if (iI00000oOI == 0) {
                                            }
/* 1254 */                                  iooloo1ioil2.I00o0iI0io1 = "";
/* 1256 */                                  strI00000oIO = iooloo1ioil2.I00lli11;
/* 1262 */                                  if (TextUtils.isEmpty(strI00000oIO)) {
                                            }
/* 1275 */                                  if (!TextUtils.isEmpty(strI00000oIO)) {
                                            }
/* 1279 */                                  iooloo1ioil2.I00o0iI0io1 = str7;
/* 1281 */                                  if (iI00000oOI == 0) {
                                            }
/* 1315 */                                  iooloo1ioil2.I00li1OI = null;
/* 1317 */                                  iIl1iil iil1iil2 = l0olllo1i5.I00iio;
/* 1321 */                                  l0olllO1i l0olllo1i7 = (l0olllO1i) iil1iil2.I00iOIl;
/* 1325 */                                  lII0I0I000I.I0000O("analytics.safelisted_events");
/* 1328 */                                  bundleI01101olii = iil1iil2.I01101olii();
/* 1332 */                                  if (bundleI01101olii != null) {
                                            }
/* 1346 */                                  numValueOf = null;
/* 1363 */                                  if (numValueOf == null) {
                                            }
/* 1402 */                                  if (listAsList == null) {
                                            }
/* 1454 */                                  if (packageManager == null) {
                                            }
/* 1472 */                                  ((l0olllO1i) iooloo1ioil2.I00iOIl).I00ooiO1I.incrementAndGet();
/* 1476 */                                  iooloo1ioil2.I00iiI = true;
/* 1480 */                                  lio1iil = new lIo1Iil();
/* 1483 */                                  lio1iil.I00iOIl = l0olllo1i3;
                                            l0olllo1i3.I00oo1iO0ll++;
/* 1490 */                                  lio1iil.I010i10l();
/* 1493 */                                  l0olllo1i3.I00oO101o = lio1iil;
/* 1497 */                                  if (!lio1iil.I00iiI) {
                                            }
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException unused5) {
/* 1095 */                          str3 = str;
                                }
/* 1118 */                      iooloo1ioil2.I00iiO = packageName;
/* 1120 */                      iooloo1ioil2.I00ilO0 = installerPackageName;
/* 1122 */                      iooloo1ioil2.I00iio = str4;
/* 1124 */                      iooloo1ioil2.I00ilI0I1 = i;
/* 1126 */                      iooloo1ioil2.I00io1l = string;
/* 1130 */                      iooloo1ioil2.I00ioIO = 0L;
/* 1132 */                      iI00000oOI = l0olllo1i5.I00000oOI();
/* 1136 */                      if (iI00000oOI == 0) {
/* 1244 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1251 */                          l01o0io1ooo05.I00lll10.I00000oOI("App measurement collection enabled");
                                } else if (iI00000oOI == 1) {
/* 1233 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1240 */                          l01o0io1ooo05.I00ll1.I00000oOI("App measurement deactivated via the manifest");
                                } else if (iI00000oOI == 3) {
/* 1222 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1229 */                          l01o0io1ooo05.I00ll1.I00000oOI("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                                } else if (iI00000oOI == 4) {
/* 1211 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1218 */                          l01o0io1ooo05.I00ll1.I00000oOI("App measurement disabled via the manifest");
                                } else if (iI00000oOI == 6) {
/* 1200 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1207 */                          l01o0io1ooo05.I00li1OI.I00000oOI("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                                } else if (iI00000oOI == 7) {
/* 1189 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1196 */                          l01o0io1ooo05.I00ll1.I00000oOI("App measurement disabled via the global data collection setting");
                                } else if (iI00000oOI != 8) {
/* 1157 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1164 */                          l01o0io1ooo05.I00ll1.I00000oOI("App measurement disabled");
/* 1167 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1174 */                          l01o0io1ooo05.I00io1l.I00000oOI("Invalid scion state in identity");
                                } else {
/* 1178 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1185 */                          l01o0io1ooo05.I00ll1.I00000oOI("App measurement disabled due to denied storage consent");
                                }
/* 1254 */                      iooloo1ioil2.I00o0iI0io1 = "";
/* 1256 */                      strI00000oIO = iooloo1ioil2.I00lli11;
/* 1262 */                      if (TextUtils.isEmpty(strI00000oIO)) {
/* 1267 */                          strI00000oIO = ll0i0l0Ili.I00000oIO(context, l0olllo1i5.I00o0l1o1o0);
                                }
/* 1275 */                      if (!TextUtils.isEmpty(strI00000oIO)) {
/* 1278 */                          str7 = strI00000oIO;
                                }
/* 1279 */                      iooloo1ioil2.I00o0iI0io1 = str7;
/* 1281 */                      if (iI00000oOI == 0) {
/* 1283 */                          l0olllO1i.I000II(l01o0io1ooo05);
/* 1294 */                          l01o0io1ooo05.I00lll10.I0000O(iooloo1ioil2.I00iiO, "App measurement enabled for app package, google app id", iooloo1ioil2.I00o0iI0io1);
                                }
/* 1315 */                      iooloo1ioil2.I00li1OI = null;
/* 1317 */                      iIl1iil iil1iil22 = l0olllo1i5.I00iio;
/* 1321 */                      l0olllO1i l0olllo1i72 = (l0olllO1i) iil1iil22.I00iOIl;
/* 1325 */                      lII0I0I000I.I0000O("analytics.safelisted_events");
/* 1328 */                      bundleI01101olii = iil1iil22.I01101olii();
/* 1332 */                      if (bundleI01101olii != null) {
/* 1352 */                          if (bundleI01101olii.containsKey("analytics.safelisted_events")) {
/* 1359 */                              numValueOf = Integer.valueOf(bundleI01101olii.getInt("analytics.safelisted_events"));
                                    }
/* 1363 */                          if (numValueOf == null) {
                                        try {
/* 1375 */                                  stringArray = l0olllo1i72.I00iOIl.getResources().getStringArray(numValueOf.intValue());
                                        } catch (Resources.NotFoundException e2) {
/* 1389 */                                  l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i72.I00ilO0;
/* 1391 */                                  l0olllO1i.I000II(l01o0io1ooo06);
/* 1398 */                                  l01o0io1ooo06.I00ilO0.I0000Il00O("Failed to load string array from metadata: resource not found", e2);
                                        }
/* 1383 */                              listAsList = stringArray == null ? null : Arrays.asList(stringArray);
                                    }
/* 1402 */                          if (listAsList == null) {
/* 1452 */                              iooloo1ioil2.I00li1OI = listAsList;
                                    } else if (listAsList.isEmpty()) {
/* 1411 */                              l0olllO1i.I000II(l01o0io1ooo05);
/* 1418 */                              l01o0io1ooo05.I00li1OI.I00000oOI("Safelisted event list is empty. Ignoring");
                                    } else {
/* 1430 */                              for (String str8 : listAsList) {
/* 1438 */                                  lioil0ilIOi lioil0ilioi4 = l0olllo1i5.I00l0I0l0lO1;
/* 1440 */                                  l0olllO1i.I0000oI00(lioil0ilioi4);
/* 1449 */                                  if (!lioil0ilioi4.I01Ol1o0("safelisted event", str8)) {
                                            }
                                        }
/* 1452 */                              iooloo1ioil2.I00li1OI = listAsList;
                                    }
/* 1454 */                          if (packageManager == null) {
/* 1460 */                              iooloo1ioil2.I00lll10 = Ioo1l1i00O.I00000oIO(context) ? 1 : 0;
                                    } else {
/* 1464 */                              iooloo1ioil2.I00lll10 = 0;
                                    }
/* 1472 */                          ((l0olllO1i) iooloo1ioil2.I00iOIl).I00ooiO1I.incrementAndGet();
/* 1476 */                          iooloo1ioil2.I00iiI = true;
/* 1480 */                          lio1iil = new lIo1Iil();
/* 1483 */                          lio1iil.I00iOIl = l0olllo1i3;
                                    l0olllo1i3.I00oo1iO0ll++;
/* 1490 */                          lio1iil.I010i10l();
/* 1493 */                          l0olllo1i3.I00oO101o = lio1iil;
/* 1497 */                          if (!lio1iil.I00iiI) {
/* 2779 */                              I000II.I001IO000("Can't initialize twice");
/* 2794 */                              return;
                                    }
/* 1513 */                          lio1iil.I00iiO = (JobScheduler) ((l0olllO1i) lio1iil.I00iOIl).I00iOIl.getSystemService("jobscheduler");
/* 1515 */                          atomicInteger.incrementAndGet();
/* 1519 */                          lio1iil.I00iiI = true;
/* 1521 */                          l0olllO1i.I000II(l01o0io1ooo02);
/* 1524 */                          IOloiOI1 iOloiOI13 = l01o0io1ooo02.I00lli11;
/* 1526 */                          IOloiOI1 iOloiOI14 = l01o0io1ooo02.I00ll1;
/* 1528 */                          IOloiOI1 iOloiOI15 = l01o0io1ooo02.I00lll10;
/* 1530 */                          IOloiOI1 iOloiOI16 = l01o0io1ooo02.I00ilO0;
/* 1532 */                          iil1iil.I010l1O();
/* 1544 */                          iOloiOI14.I0000Il00O("App measurement initialized, version", 161000L);
/* 1547 */                          l0olllO1i.I000II(l01o0io1ooo02);
/* 1552 */                          iOloiOI14.I00000oOI("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
/* 1555 */                          String strI010l1O = iooloo1ioil.I010l1O();
/* 1565 */                          if (lioil0ilioi3.I01II10(strI010l1O, iil1iil.I00iiO)) {
/* 1567 */                              l0olllO1i.I000II(l01o0io1ooo02);
/* 1572 */                              iOloiOI14.I00000oOI("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                                    } else {
/* 1576 */                              l0olllO1i.I000II(l01o0io1ooo02);
/* 1589 */                              iOloiOI14.I00000oOI("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strI010l1O)));
                                    }
/* 1592 */                          l0olllO1i.I000II(l01o0io1ooo02);
/* 1597 */                          iOloiOI13.I00000oOI("Debug-level message logging enabled");
/* 1606 */                          if (l0olllo1i3.I00oo1iO0ll != atomicInteger.get()) {
/* 1608 */                              l0olllO1i.I000II(l01o0io1ooo02);
/* 1627 */                              iOloiOI16.I0000O(Integer.valueOf(l0olllo1i3.I00oo1iO0ll), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                                    }
/* 1631 */                          l0olllo1i3.I00oOio10iI1 = true;
/* 1635 */                          long j3 = l0olllo1i3.I00oooO;
/* 1637 */                          l1iioiool l1iioioolVar = l1iioiool.ANALYTICS_STORAGE;
/* 1641 */                          lIl1O1li lil1o1li = l0olllo1i3.I00lli11;
/* 1643 */                          l0olllO1i.I000II(l0o10ooo0);
/* 1646 */                          l0o10ooo0.I010II();
/* 1651 */                          l0olllO1i.I0000O(l0olllo1i3.I00oO101o);
/* 1656 */                          int iI010l10O = l0olllo1i3.I00oO101o.I010l10O();
/* 1660 */                          iIO0ooOool.I00000oIO();
/* 1670 */                          boolean zI01101IOlO = iil1iil.I01101IOlO(null, iol1II1ii1i.I0100o111I);
/* 1679 */                          boolean z4 = iI010l10O == 2;
/* 1682 */                          if (zI01101IOlO) {
/* 1684 */                              lioil0ilioi3.I010II();
/* 1693 */                              if (lioil0ilioi3.I011iiii0i() == 1) {
/* 1699 */                                  lioil0ilioi3.I010II();
/* 1704 */                                  IntentFilter intentFilter = new IntentFilter();
/* 1709 */                                  intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1714 */                                  intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1719 */                                  I11o1li1O00 i11o1li1O00 = new I11o1li1O00();
/* 1726 */                                  i11o1li1O00.I00000oOI = l0olllo1i6;
/* 1728 */                                  VarHandle.storeStoreFence();
/* 1743 */                                  l0olllo1i6.I00iOIl.registerReceiver(i11o1li1O00, intentFilter, null, null, 2);
/* 1746 */                                  l01O0IO1ooO0 l01o0io1ooo07 = l0olllo1i6.I00ilO0;
/* 1748 */                                  l0olllO1i.I000II(l01o0io1ooo07);
/* 1753 */                                  z = z4;
/* 1757 */                                  l01o0io1ooo07.I00lli11.I00000oOI("Registered app receiver");
/* 1760 */                                  if (z) {
/* 1633 */                                      str6 = "gmp_app_id";
/* 1793 */                                      l0olllo1i6 = l0olllo1i6;
/* 1795 */                                      l0olllo1i = l0olllo1i3;
                                            } else {
/* 1764 */                                      l0olllO1i.I0000O(l0olllo1i3.I00oO101o);
/* 1771 */                                      l0olllo1i6 = l0olllo1i6;
/* 1780 */                                      l0olllo1i = l0olllo1i3;
/* 1633 */                                      str6 = "gmp_app_id";
/* 1787 */                                      l0olllo1i3.I00oO101o.I010ioo(((Long) iol1II1ii1i.I001lloI.I00000oIO(null)).longValue());
                                            }
                                        } else if (z4) {
/* 1698 */                                  z4 = true;
/* 1699 */                                  lioil0ilioi3.I010II();
/* 1704 */                                  IntentFilter intentFilter2 = new IntentFilter();
/* 1709 */                                  intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
/* 1714 */                                  intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 1719 */                                  I11o1li1O00 i11o1li1O002 = new I11o1li1O00();
/* 1726 */                                  i11o1li1O002.I00000oOI = l0olllo1i6;
/* 1728 */                                  VarHandle.storeStoreFence();
/* 1743 */                                  l0olllo1i6.I00iOIl.registerReceiver(i11o1li1O002, intentFilter2, null, null, 2);
/* 1746 */                                  l01O0IO1ooO0 l01o0io1ooo072 = l0olllo1i6.I00ilO0;
/* 1748 */                                  l0olllO1i.I000II(l01o0io1ooo072);
/* 1753 */                                  z = z4;
/* 1757 */                                  l01o0io1ooo072.I00lli11.I00000oOI("Registered app receiver");
/* 1760 */                                  if (z) {
                                            }
                                        } else {
/* 1797 */                                  l0olllo1i = l0olllo1i3;
/* 1633 */                                  str6 = "gmp_app_id";
                                        }
                                    }
/* 1800 */                          I1ii1l10IO i1ii1l10IO2 = l0oi0o.I00io1l;
/* 1802 */                          l1ioIO011Oo l1ioio011ooI010l1ol111 = l0oi0o.I010l1ol111();
/* 1806 */                          int i4 = l1ioio011ooI010l1ol111.I00000oOI;
/* 1813 */                          l1iIoO01 l1iioo01I011IO1I11OI3 = iil1iil.I011IO1I11OI("google_analytics_default_allow_ad_storage", false);
/* 1817 */                          l0olllO1i l0olllo1i8 = l0olllo1i;
/* 1821 */                          l1iIoO01 l1iioo01I011IO1I11OI4 = iil1iil.I011IO1I11OI("google_analytics_default_allow_analytics_storage", false);
/* 1825 */                          l1iIoO01 l1iioo01 = l1iIoO01.UNINITIALIZED;
/* 1829 */                          if (l1iioo01I011IO1I11OI3 != l1iioo01 || l1iioo01I011IO1I11OI4 != l1iioo01) {
/* 1843 */                              iOloiOI1 = iOloiOI16;
/* 1847 */                              lioil0ilioi = lioil0ilioi3;
/* 1861 */                              if (l1ioIO011Oo.I000l1(-10, l0oi0o.I010ioo().getInt("consent_source", 100))) {
/* 1865 */                                  EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 1870 */                                  enumMap.put((EnumMap) l1iioiool.AD_STORAGE, (l1iioiool) l1iioo01I011IO1I11OI3);
/* 1873 */                                  enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) l1iioo01I011IO1I11OI4);
/* 1878 */                                  l1ioio011oo = new l1ioIO011Oo(enumMap, -10);
                                        }
/* 1928 */                              if (l1ioio011oo == null) {
/* 1930 */                                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 1934 */                                  lil1o1li.I011lIilI0lo(l1ioio011oo, true);
                                        } else {
/* 1938 */                                  l1ioio011oo = l1ioio011ooI010l1ol111;
                                        }
/* 1940 */                              l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 1945 */                              l0olllo1i2 = (l0olllO1i) lil1o1li.I00iOIl;
/* 1947 */                              lil1o1li.I01I01Oolii(l1ioio011oo);
/* 1950 */                              l0oi0o.I010II();
/* 1968 */                              int i5 = iOoOIi0i.I00000oOI(l0oi0o.I010ioo().getString("dma_consent_settings", null)).I00000oIO;
/* 1973 */                              l1iioo01I011IO1I11OI = iil1iil.I011IO1I11OI("google_analytics_default_allow_ad_personalization_signals", true);
/* 1977 */                              if (l1iioo01I011IO1I11OI != l1iioo01) {
/* 1979 */                                  l0olllO1i.I000II(l01o0io1ooo02);
/* 1984 */                                  iOloiOI15.I0000Il00O("Default ad personalization consent from Manifest", l1iioo01I011IO1I11OI);
                                        }
/* 1989 */                              l1iioo01I011IO1I11OI2 = iil1iil.I011IO1I11OI("google_analytics_default_allow_ad_user_data", true);
/* 1993 */                              if (l1iioo01I011IO1I11OI2 == l1iioo01 && l1ioIO011Oo.I000l1(-10, i5)) {
/* 2003 */                                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2008 */                                  EnumMap enumMap2 = new EnumMap(l1iioiool.class);
/* 2013 */                                  enumMap2.put((EnumMap) l1iioiool.AD_USER_DATA, (l1iioiool) l1iioo01I011IO1I11OI2);
/* 2022 */                                  lil1o1li.I011iiii0i(new iOoOIi0i(enumMap2, -10, (Boolean) null, (String) null), true);
                                        } else if (!TextUtils.isEmpty(l0olllo1i8.I000iOII().I010l1ol111()) && (i5 == 0 || i5 == 30)) {
/* 2046 */                                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2058 */                                  lil1o1li.I011iiii0i(new iOoOIi0i((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        }
/* 2063 */                              boolI0110OiO = iil1iil.I0110OiO("google_analytics_tcf_data_enabled");
/* 2067 */                              if (boolI0110OiO != null || boolI0110OiO.booleanValue()) {
/* 2075 */                                  l0olllO1i.I000II(l01o0io1ooo02);
/* 2080 */                                  iOloiOI13.I00000oOI("TCF client enabled.");
/* 2083 */                                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2086 */                                  lil1o1li.I010II();
/* 2089 */                                  l01O0IO1ooO0 l01o0io1ooo08 = l0olllo1i2.I00ilO0;
/* 2091 */                                  l0olllO1i.I000II(l01o0io1ooo08);
/* 2098 */                                  l01o0io1ooo08.I00lli11.I00000oOI("Register tcfPrefChangeListener.");
/* 2103 */                                  if (lil1o1li.I00oIiI10 == null) {
/* 2111 */                                      lil1o1li.I00oO101o = new l1o00OIlII(lil1o1li, l0olllo1i2, 2);
/* 2115 */                                      lIiOOollI0O liiooolli0o = new lIiOOollI0O();
/* 2118 */                                      liiooolli0o.I00000oIO = lil1o1li;
/* 2120 */                                      VarHandle.storeStoreFence();
/* 2123 */                                      lil1o1li.I00oIiI10 = liiooolli0o;
                                            }
/* 2125 */                                  l0Oi0o l0oi0o2 = l0olllo1i2.I00ilI0I1;
/* 2127 */                                  l0olllO1i.I0000oI00(l0oi0o2);
/* 2136 */                                  l0oi0o2.I010l10O().registerOnSharedPreferenceChangeListener(lil1o1li.I00oIiI10);
/* 2139 */                                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2142 */                                  lil1o1li.I010l1O();
                                        }
/* 2145 */                              l0o0o010i = l0oi0o.I00ilO0;
/* 2155 */                              if (l0o0o010i.I00000oIO() == 0) {
/* 2157 */                                  l0olllO1i.I000II(l01o0io1ooo02);
/* 2166 */                                  iOloiOI15.I0000Il00O("Persisting first open", Long.valueOf(j3));
/* 2169 */                                  l0o0o010i.I00000oOI(j3);
                                        }
/* 2172 */                              l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2175 */                              iili011o1 = lil1o1li.I00o101lO;
/* 2181 */                              if (iili011o1.I0000Il00O() && iili011o1.I00000oOI()) {
/* 2193 */                                  l0Oi0o l0oi0o3 = ((l0olllO1i) iili011o1.I00iiI).I00ilI0I1;
/* 2195 */                                  l0olllO1i.I0000oI00(l0oi0o3);
/* 2201 */                                  l0oi0o3.I00ol1.I000O01llI0(null);
                                        }
/* 2208 */                              if (l0olllo1i8.I0000Il00O()) {
/* 2214 */                                  if (l0olllo1i8.I00000oIO()) {
/* 2218 */                                      lioil0ilioi2 = lioil0ilioi;
/* 2224 */                                      if (lioil0ilioi2.I01I0Iioooo0("android.permission.INTERNET")) {
/* 2237 */                                          iOloiOI12 = iOloiOI1;
                                                } else {
/* 2226 */                                          l0olllO1i.I000II(l01o0io1ooo02);
/* 2231 */                                          iOloiOI12 = iOloiOI1;
/* 2233 */                                          iOloiOI12.I00000oOI("App is missing INTERNET permission");
                                                }
/* 2245 */                                      if (!lioil0ilioi2.I01I0Iioooo0("android.permission.ACCESS_NETWORK_STATE")) {
/* 2247 */                                          l0olllO1i.I000II(l01o0io1ooo02);
/* 2252 */                                          iOloiOI12.I00000oOI("App is missing ACCESS_NETWORK_STATE permission");
                                                }
/* 2257 */                                      Context context2 = l0olllo1i8.I00iOIl;
/* 2267 */                                      if (!i01l1OO001.I00000oIO(context2).I0000oI00() && !iil1iil.I010iIIOlo()) {
/* 2279 */                                          if (!lioil0ilIOi.I01O10iIoo1O(context2)) {
/* 2281 */                                              l0olllO1i.I000II(l01o0io1ooo02);
/* 2286 */                                              iOloiOI12.I00000oOI("AppMeasurementReceiver not registered/enabled");
                                                    }
/* 2293 */                                          if (!lioil0ilIOi.I011iIOio(context2)) {
/* 2295 */                                              l0olllO1i.I000II(l01o0io1ooo02);
/* 2300 */                                              iOloiOI12.I00000oOI("AppMeasurementService not registered/enabled");
                                                    }
                                                }
/* 2303 */                                      l0olllO1i.I000II(l01o0io1ooo02);
/* 2308 */                                      iOloiOI12.I00000oOI("Uploading is not possible. App measurement disabled");
                                            } else {
/* 2315 */                                      lioil0ilioi2 = lioil0ilioi;
                                            }
/* 2311 */                                  l01o0io1ooo0 = l01o0io1ooo02;
                                        } else {
/* 2320 */                                  lioil0ilioi2 = lioil0ilioi;
/* 2334 */                                  if (TextUtils.isEmpty(l0olllo1i8.I000iOII().I010l1ol111())) {
/* 2514 */                                      i1ii1l10IO = i1ii1l10IO2;
                                            } else {
/* 2340 */                                      String strI010l1ol111 = l0olllo1i8.I000iOII().I010l1ol111();
/* 2344 */                                      l0oi0o.I010II();
/* 2351 */                                      String str9 = str6;
/* 2354 */                                      String string3 = l0oi0o.I010ioo().getString(str9, null);
/* 2358 */                                      boolean zIsEmpty = TextUtils.isEmpty(strI010l1ol111);
/* 2362 */                                      boolean zIsEmpty2 = TextUtils.isEmpty(string3);
/* 2366 */                                      if (zIsEmpty || zIsEmpty2) {
/* 2486 */                                          i1ii1l10IO = i1ii1l10IO2;
/* 2492 */                                          String strI010l1ol1112 = l0olllo1i8.I000iOII().I010l1ol111();
/* 2496 */                                          l0oi0o.I010II();
/* 2503 */                                          SharedPreferences.Editor editorEdit2 = l0oi0o.I010ioo().edit();
/* 2507 */                                          editorEdit2.putString(str9, strI010l1ol1112);
/* 2510 */                                          editorEdit2.apply();
                                                } else {
/* 2370 */                                          lII0I0I000I.I000II(strI010l1ol111);
/* 2377 */                                          if (!strI010l1ol111.equals(string3)) {
/* 2379 */                                              l0olllO1i.I000II(l01o0io1ooo02);
/* 2386 */                                              iOloiOI14.I00000oOI("Rechecking which service to use due to a GMP App Id change");
/* 2389 */                                              l0oi0o.I010II();
/* 2392 */                                              l0oi0o.I010II();
/* 2399 */                                              String str10 = str2;
/* 2421 */                                              Boolean boolValueOf = l0oi0o.I010ioo().contains(str10) ? Boolean.valueOf(l0oi0o.I010ioo().getBoolean(str10, true)) : null;
/* 2426 */                                              SharedPreferences.Editor editorEdit3 = l0oi0o.I010ioo().edit();
/* 2430 */                                              editorEdit3.clear();
/* 2433 */                                              editorEdit3.apply();
/* 2436 */                                              if (boolValueOf != null) {
/* 2438 */                                                  l0oi0o.I010II();
/* 2445 */                                                  SharedPreferences.Editor editorEdit4 = l0oi0o.I010ioo().edit();
/* 2453 */                                                  editorEdit4.putBoolean(str10, boolValueOf.booleanValue());
/* 2456 */                                                  editorEdit4.apply();
                                                        }
/* 2463 */                                              l0olllo1i8.I000O01llI0().I010ioo();
/* 2468 */                                              l0olllo1i8.I00oI0i.I010lI0oi();
/* 2473 */                                              l0olllo1i8.I00oI0i.I010l1O();
/* 2476 */                                              l0o0o010i.I00000oOI(j3);
/* 2479 */                                              i1ii1l10IO = i1ii1l10IO2;
/* 2482 */                                              i1ii1l10IO.I000O01llI0(null);
                                                    }
/* 2492 */                                          String strI010l1ol11122 = l0olllo1i8.I000iOII().I010l1ol111();
/* 2496 */                                          l0oi0o.I010II();
/* 2503 */                                          SharedPreferences.Editor editorEdit22 = l0oi0o.I010ioo().edit();
/* 2507 */                                          editorEdit22.putString(str9, strI010l1ol11122);
/* 2510 */                                          editorEdit22.apply();
                                                }
                                            }
/* 2524 */                                  if (!l0oi0o.I010l1ol111().I000OOo1O(l1iioioolVar)) {
/* 2527 */                                      i1ii1l10IO.I000O01llI0(null);
                                            }
/* 2530 */                                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2539 */                                  lil1o1li.I00io1l.set(i1ii1l10IO.I000II());
                                            try {
/* 2552 */                                      l0olllo1i6.I00iOIl.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                            } catch (ClassNotFoundException unused6) {
/* 2558 */                                      I1ii1l10IO i1ii1l10IO3 = l0oi0o.I00oOio10iI1;
/* 2568 */                                      if (!TextUtils.isEmpty(i1ii1l10IO3.I000II())) {
/* 2570 */                                          l0olllO1i.I000II(l01o0io1ooo02);
/* 2573 */                                          l01o0io1ooo0 = l01o0io1ooo02;
/* 2579 */                                          l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Remote config removed with active feature rollouts");
/* 2583 */                                          i1ii1l10IO3.I000O01llI0(null);
                                                }
                                            }
/* 2555 */                                  l01o0io1ooo0 = l01o0io1ooo02;
/* 2598 */                                  if (!TextUtils.isEmpty(l0olllo1i8.I000iOII().I010l1ol111())) {
/* 2600 */                                      boolean zI00000oIO = l0olllo1i8.I00000oIO();
/* 2604 */                                      SharedPreferences sharedPreferences2 = l0oi0o.I00iiO;
/* 2616 */                                      if (!(sharedPreferences2 == null ? false : sharedPreferences2.contains("deferred_analytics_collection")) && !iil1iil.I0110o()) {
/* 2626 */                                          l0oi0o.I010lI0oi(!zI00000oIO);
                                                }
/* 2629 */                                      if (zI00000oIO) {
/* 2631 */                                          l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2634 */                                          lil1o1li.I0110o();
                                                }
/* 2637 */                                      li10O1l0 li10o1l0 = l0olllo1i8.I00ioIO;
/* 2639 */                                      l0olllO1i.I0001Ioi1lo(li10o1l0);
/* 2644 */                                      li10o1l0.I00ilI0I1.I00000oOI();
/* 2656 */                                      l0olllo1i8.I000OOo1O().I010ioo(new AtomicReference());
/* 2669 */                                      l0olllo1i8.I000OOo1O().I010l10O(l0oi0o.I00oli.I0010o());
                                            }
                                        }
/* 2672 */                              iIO0ooOool.I00000oIO();
/* 2682 */                              if (iil1iil.I01101IOlO(null, iol1II1ii1i.I0100o111I)) {
/* 2684 */                                  lioil0ilioi2.I010II();
/* 2693 */                                  if (lioil0ilioi2.I011iiii0i() == 1) {
/* 2731 */                                      long jMax2 = Math.max(500L, ((((Integer) iol1II1ii1i.I00lli11.I00000oIO(null)).intValue() * 1000) + new Random().nextInt(5000)) - SystemClock.elapsedRealtime());
/* 2737 */                                      if (jMax2 > 500) {
/* 2739 */                                          l0olllO1i.I000II(l01o0io1ooo0);
/* 2748 */                                          iOloiOI15.I0000Il00O("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(jMax2));
                                                }
/* 2751 */                                      l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2754 */                                      lil1o1li.I010II();
/* 2757 */                                      l1o00OIlII l1o00oilii = lil1o1li.I00ll1;
/* 2759 */                                      if (l1o00oilii == null) {
/* 2764 */                                          l1o00oilii = new l1o00OIlII(lil1o1li, l0olllo1i2, 0);
/* 2767 */                                          lil1o1li.I00ll1 = l1o00oilii;
                                                }
/* 2769 */                                      l1o00oilii.I00000oOI(jMax2);
                                            }
                                        }
/* 2775 */                              l0oi0o.I00o0iI0io1.I00000oOI(true);
/* 2794 */                              return;
                                    }
/* 1834 */                          iOloiOI1 = iOloiOI16;
/* 1836 */                          lioil0ilioi = lioil0ilioi3;
/* 1894 */                          if (!TextUtils.isEmpty(l0olllo1i8.I000iOII().I010l1ol111()) && (i4 == 0 || i4 == 30 || i4 == 10 || i4 == 40)) {
/* 1913 */                              l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 1924 */                              lil1o1li.I011lIilI0lo(new l1ioIO011Oo(-10), false);
                                    }
/* 1911 */                          l1ioio011oo = null;
/* 1928 */                          if (l1ioio011oo == null) {
                                    }
/* 1940 */                          l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 1945 */                          l0olllo1i2 = (l0olllO1i) lil1o1li.I00iOIl;
/* 1947 */                          lil1o1li.I01I01Oolii(l1ioio011oo);
/* 1950 */                          l0oi0o.I010II();
/* 1968 */                          int i52 = iOoOIi0i.I00000oOI(l0oi0o.I010ioo().getString("dma_consent_settings", null)).I00000oIO;
/* 1973 */                          l1iioo01I011IO1I11OI = iil1iil.I011IO1I11OI("google_analytics_default_allow_ad_personalization_signals", true);
/* 1977 */                          if (l1iioo01I011IO1I11OI != l1iioo01) {
                                    }
/* 1989 */                          l1iioo01I011IO1I11OI2 = iil1iil.I011IO1I11OI("google_analytics_default_allow_ad_user_data", true);
/* 1993 */                          if (l1iioo01I011IO1I11OI2 == l1iioo01) {
/* 2038 */                              if (!TextUtils.isEmpty(l0olllo1i8.I000iOII().I010l1ol111())) {
/* 2046 */                                  l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2058 */                                  lil1o1li.I011iiii0i(new iOoOIi0i((Boolean) null, -10, (Boolean) null, (String) null), true);
                                        }
                                    }
/* 2063 */                          boolI0110OiO = iil1iil.I0110OiO("google_analytics_tcf_data_enabled");
/* 2067 */                          if (boolI0110OiO != null) {
/* 2075 */                              l0olllO1i.I000II(l01o0io1ooo02);
/* 2080 */                              iOloiOI13.I00000oOI("TCF client enabled.");
/* 2083 */                              l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2086 */                              lil1o1li.I010II();
/* 2089 */                              l01O0IO1ooO0 l01o0io1ooo082 = l0olllo1i2.I00ilO0;
/* 2091 */                              l0olllO1i.I000II(l01o0io1ooo082);
/* 2098 */                              l01o0io1ooo082.I00lli11.I00000oOI("Register tcfPrefChangeListener.");
/* 2103 */                              if (lil1o1li.I00oIiI10 == null) {
                                        }
/* 2125 */                              l0Oi0o l0oi0o22 = l0olllo1i2.I00ilI0I1;
/* 2127 */                              l0olllO1i.I0000oI00(l0oi0o22);
/* 2136 */                              l0oi0o22.I010l10O().registerOnSharedPreferenceChangeListener(lil1o1li.I00oIiI10);
/* 2139 */                              l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2142 */                              lil1o1li.I010l1O();
                                    }
/* 2145 */                          l0o0o010i = l0oi0o.I00ilO0;
/* 2155 */                          if (l0o0o010i.I00000oIO() == 0) {
                                    }
/* 2172 */                          l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 2175 */                          iili011o1 = lil1o1li.I00o101lO;
/* 2181 */                          if (iili011o1.I0000Il00O()) {
/* 2193 */                              l0Oi0o l0oi0o32 = ((l0olllO1i) iili011o1.I00iiI).I00ilI0I1;
/* 2195 */                              l0olllO1i.I0000oI00(l0oi0o32);
/* 2201 */                              l0oi0o32.I00ol1.I000O01llI0(null);
                                    }
/* 2208 */                          if (l0olllo1i8.I0000Il00O()) {
                                    }
/* 2672 */                          iIO0ooOool.I00000oIO();
/* 2682 */                          if (iil1iil.I01101IOlO(null, iol1II1ii1i.I0100o111I)) {
                                    }
/* 2775 */                          l0oi0o.I00o0iI0io1.I00000oOI(true);
/* 2794 */                          return;
                                }
/* 1334 */                      l01O0IO1ooO0 l01o0io1ooo09 = l0olllo1i72.I00ilO0;
/* 1336 */                      l0olllO1i.I000II(l01o0io1ooo09);
/* 1343 */                      l01o0io1ooo09.I00ilO0.I00000oOI("Failed to load metadata: Metadata bundle is null");
/* 1346 */                      numValueOf = null;
/* 1363 */                      if (numValueOf == null) {
                                }
/* 1402 */                      if (listAsList == null) {
                                }
/* 1454 */                      if (packageManager == null) {
                                }
/* 1472 */                      ((l0olllO1i) iooloo1ioil2.I00iOIl).I00ooiO1I.incrementAndGet();
/* 1476 */                      iooloo1ioil2.I00iiI = true;
/* 1480 */                      lio1iil = new lIo1Iil();
/* 1483 */                      lio1iil.I00iOIl = l0olllo1i3;
                                l0olllo1i3.I00oo1iO0ll++;
/* 1490 */                      lio1iil.I010i10l();
/* 1493 */                      l0olllo1i3.I00oO101o = lio1iil;
/* 1497 */                      if (!lio1iil.I00iiI) {
                                }
                            }
/* 1003 */                  packageManager = packageManager2;
/* 1005 */                  i = Integer.MIN_VALUE;
/* 1007 */                  str4 = str;
/* 1009 */                  string = str4;
/* 1118 */                  iooloo1ioil2.I00iiO = packageName;
/* 1120 */                  iooloo1ioil2.I00ilO0 = installerPackageName;
/* 1122 */                  iooloo1ioil2.I00iio = str4;
/* 1124 */                  iooloo1ioil2.I00ilI0I1 = i;
/* 1126 */                  iooloo1ioil2.I00io1l = string;
/* 1130 */                  iooloo1ioil2.I00ioIO = 0L;
/* 1132 */                  iI00000oOI = l0olllo1i5.I00000oOI();
/* 1136 */                  if (iI00000oOI == 0) {
                            }
/* 1254 */                  iooloo1ioil2.I00o0iI0io1 = "";
/* 1256 */                  strI00000oIO = iooloo1ioil2.I00lli11;
/* 1262 */                  if (TextUtils.isEmpty(strI00000oIO)) {
                            }
/* 1275 */                  if (!TextUtils.isEmpty(strI00000oIO)) {
                            }
/* 1279 */                  iooloo1ioil2.I00o0iI0io1 = str7;
/* 1281 */                  if (iI00000oOI == 0) {
                            }
/* 1315 */                  iooloo1ioil2.I00li1OI = null;
/* 1317 */                  iIl1iil iil1iil222 = l0olllo1i5.I00iio;
/* 1321 */                  l0olllO1i l0olllo1i722 = (l0olllO1i) iil1iil222.I00iOIl;
/* 1325 */                  lII0I0I000I.I0000O("analytics.safelisted_events");
/* 1328 */                  bundleI01101olii = iil1iil222.I01101olii();
/* 1332 */                  if (bundleI01101olii != null) {
                            }
/* 1346 */                  numValueOf = null;
/* 1363 */                  if (numValueOf == null) {
                            }
/* 1402 */                  if (listAsList == null) {
                            }
/* 1454 */                  if (packageManager == null) {
                            }
/* 1472 */                  ((l0olllO1i) iooloo1ioil2.I00iOIl).I00ooiO1I.incrementAndGet();
/* 1476 */                  iooloo1ioil2.I00iiI = true;
/* 1480 */                  lio1iil = new lIo1Iil();
/* 1483 */                  lio1iil.I00iOIl = l0olllo1i3;
                            l0olllo1i3.I00oo1iO0ll++;
/* 1490 */                  lio1iil.I010i10l();
/* 1493 */                  l0olllo1i3.I00oO101o = lio1iil;
/* 1497 */                  if (!lio1iil.I00iiI) {
                            }
                            break;
                        case 8:
/* 535 */                   l1Oli1l l1oli1l = (l1Oli1l) this.I00iiI;
/* 539 */                   lli10iI lli10ii = (lli10iI) this.I00iiO;
/* 541 */                   lilOOl0 lilool0 = l1oli1l.I000II;
/* 543 */                   lilool0.I00OI1();
/* 546 */                   lilool0.I00iiO(lli10ii);
/* 549 */                   return;
                        case 9:
/* 477 */                   AtomicReference atomicReference = (AtomicReference) this.I00iiI;
                            synchronized (atomicReference) {
                                try {
                                    try {
/* 486 */                               l0olllO1i l0olllo1i9 = (l0olllO1i) ((lIl1O1li) this.I00iiO).I00iOIl;
/* 508 */                               atomicReference.set(Long.valueOf(l0olllo1i9.I00iio.I010lI0oi(l0olllo1i9.I000iOII().I010l1O(), iol1II1ii1i.I00Ol1ll1)));
                                    } finally {
                                    }
                                } finally {
/* 527 */                           ((AtomicReference) this.I00iiI).notify();
                                }
                            }
/* 519 */                   return;
                        case 10:
/* 400 */                   lIl1O1li lil1o1li2 = (lIl1O1li) this.I00iiI;
/* 402 */                   lil1o1li2.I010II();
/* 407 */                   List<li1l0Iiiii> list = (List) this.I00iiO;
/* 413 */                   l0Oi0o l0oi0o4 = ((l0olllO1i) lil1o1li2.I00iOIl).I00ilI0I1;
/* 415 */                   l0olllO1i.I0000oI00(l0oi0o4);
/* 418 */                   SparseArray sparseArrayI010l1O = l0oi0o4.I010l1O();
/* 430 */                   for (li1l0Iiiii li1l0iiiii : list) {
/* 438 */                       int i6 = li1l0iiiii.I00iiO;
/* 444 */                       if (!sparseArrayI010l1O.contains(i6) || ((Long) sparseArrayI010l1O.get(i6)).longValue() < li1l0iiiii.I00iiI) {
/* 466 */                           lil1o1li2.I011lOIoo0l().add(li1l0iiiii);
                                }
                            }
/* 470 */                   lil1o1li2.I011olOoO();
/* 473 */                   return;
                        case 11:
/* 317 */                   lOliOlO1Io loliolo1io2 = (lOliOlO1Io) this.I00iiO;
/* 319 */                   iolll0ill1i iolll0ill1iVar = loliolo1io2.I00iio;
/* 323 */                   l0olllO1i l0olllo1i10 = (l0olllO1i) loliolo1io2.I00iOIl;
/* 325 */                   if (iolll0ill1iVar == null) {
/* 327 */                       l01O0IO1ooO0 l01o0io1ooo010 = l0olllo1i10.I00ilO0;
/* 329 */                       l0olllO1i.I000II(l01o0io1ooo010);
/* 336 */                       l01o0io1ooo010.I00ilO0.I00000oOI("Failed to send current screen to service");
/* 397 */                       return;
                            }
                            try {
/* 342 */                       lIol0ili1Oi liol0ili1oi = (lIol0ili1Oi) this.I00iiI;
/* 344 */                       if (liol0ili1oi == null) {
/* 356 */                           iolll0ill1iVar.I000o00OoI0I(0L, null, null, l0olllo1i10.I00iOIl.getPackageName());
                                } else {
/* 374 */                           iolll0ill1iVar.I000o00OoI0I(liol0ili1oi.I0000Il00O, liol0ili1oi.I00000oIO, liol0ili1oi.I00000oOI, l0olllo1i10.I00iOIl.getPackageName());
                                }
/* 377 */                       loliolo1io2.I0110OiO();
/* 397 */                       return;
                            } catch (RemoteException e3) {
/* 385 */                       l01O0IO1ooO0 l01o0io1ooo011 = ((l0olllO1i) loliolo1io2.I00iOIl).I00ilO0;
/* 387 */                       l0olllO1i.I000II(l01o0io1ooo011);
/* 394 */                       l01o0io1ooo011.I00ilO0.I0000Il00O("Failed to send current screen to the service", e3);
/* 397 */                       return;
                            }
                        case 12:
/* 256 */                   lOliOlO1Io loliolo1io3 = ((lOl001Iii) this.I00iiO).I00iiO;
/* 259 */                   loliolo1io3.I00iio = null;
/* 269 */                   if (((IOlo10lO1iOl) this.I00iiI).I00iiI != 7777) {
/* 310 */                       loliolo1io3.I0111i();
/* 313 */                       return;
                            }
/* 271 */                   ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = loliolo1io3.I00io1l;
/* 273 */                   if (scheduledExecutorServiceNewScheduledThreadPool == null) {
/* 275 */                       scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
/* 279 */                       loliolo1io3.I00io1l = scheduledExecutorServiceNewScheduledThreadPool;
                            }
/* 283 */                   lOii1o loii1o = new lOii1o(i3);
/* 286 */                   loii1o.I00iiI = this;
/* 288 */                   VarHandle.storeStoreFence();
/* 306 */                   scheduledExecutorServiceNewScheduledThreadPool.schedule(loii1o, ((Long) iol1II1ii1i.I00Oio.I00000oIO(null)).longValue(), TimeUnit.MILLISECONDS);
/* 313 */                   return;
                        default:
/* 14 */                    loloOlli1l0 loloolli1l0 = (loloOlli1l0) this.I00iiI;
/* 16 */                    liOll1O lioll1o = liOll1O.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
/* 20 */                    zzr zzrVar = (zzr) this.I00iiO;
/* 22 */                    HashMap map = loloolli1l0.I000OiO;
/* 28 */                    iO0OOlIoo00 io0oolioo00 = (iO0OOlIoo00) map.get(lioll1o);
/* 30 */                    if (io0oolioo00 != null) {
/* 32 */                        iI0iIIo ii0iiio = io0oolioo00.I00iiO;
/* 34 */                        i1OOoIIIl1 i1oooiiil1 = io0oolioo00.I00iOIl;
/* 36 */                        if (i1oooiiil1 == null) {
/* 40 */                            i1oooiiil1 = new i1OOoIIIl1(io0oolioo00, ii0iiio);
/* 43 */                            io0oolioo00.I00iOIl = i1oooiiil1;
                                }
/* 45 */                        Iterator it2 = i1oooiiil1.iterator();
/* 53 */                        while (it2.hasNext()) {
/* 55 */                            Object next = it2.next();
/* 65 */                            Collection collection = (Collection) ii0iiio.get(next);
                                    Collection arrayList2 = collection;
/* 67 */                            if (collection == null) {
/* 71 */                                arrayList2 = new ArrayList(i2);
                                    }
/* 74 */                            List list2 = (List) arrayList2;
/* 91 */                            ArrayList arrayList3 = new ArrayList(list2 instanceof RandomAccess ? new iI1I11iO0oi(io0oolioo00, next, list2, i1liliil11Var) : new i1liliil11(io0oolioo00, next, list2, i1liliil11Var));
/* 94 */                            Collections.sort(arrayList3);
/* 97 */                            Iterator it3 = arrayList3.iterator();
/* 101 */                           long jLongValue = 0;
/* 107 */                           while (it3.hasNext()) {
/* 119 */                               jLongValue = ((Long) it3.next()).longValue() + jLongValue;
                                    }
/* 135 */                           Long lValueOf = Long.valueOf((jLongValue / arrayList3.size()) & Long.MAX_VALUE);
/* 146 */                           Long lValueOf2 = Long.valueOf(loloOlli1l0.I00000oIO(arrayList3, 100.0d) & Long.MAX_VALUE);
/* 160 */                           Long lValueOf3 = Long.valueOf(loloOlli1l0.I00000oIO(arrayList3, 75.0d) & Long.MAX_VALUE);
/* 174 */                           Long lValueOf4 = Long.valueOf(loloOlli1l0.I00000oIO(arrayList3, 50.0d) & Long.MAX_VALUE);
/* 178 */                           liOll1O lioll1o2 = lioll1o;
/* 187 */                           Long lValueOf5 = Long.valueOf(loloOlli1l0.I00000oIO(arrayList3, 25.0d) & Long.MAX_VALUE);
/* 201 */                           Long lValueOf6 = Long.valueOf(loloOlli1l0.I00000oIO(arrayList3, 0.0d) & Long.MAX_VALUE);
/* 207 */                           li001Ol li001ol = new li001Ol();
/* 210 */                           li001ol.I00000oIO = lValueOf2;
/* 212 */                           li001ol.I00000oOI = lValueOf6;
/* 216 */                           li001ol.I0000Il00O = lValueOf;
/* 218 */                           li001ol.I0000O = lValueOf5;
/* 220 */                           li001ol.I0000oI00 = lValueOf4;
/* 222 */                           li001ol.I0001Ioi1lo = lValueOf3;
/* 224 */                           VarHandle.storeStoreFence();
/* 239 */                           loloolli1l0.I00000oOI(zzrVar.zza(next, arrayList3.size(), li001ol), lioll1o2, loloolli1l0.I0000O());
/* 242 */                           lioll1o = lioll1o2;
/* 243 */                           i2 = 3;
/* 244 */                           i1liliil11Var = null;
                                }
/* 248 */                       map.remove(lioll1o);
/* 251 */                       return;
                            }
/* 251 */                   return;
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 15 */                    String simpleName = l0iOoII1Il.class.getSimpleName();
/* 21 */                    OlilOlOiI olilOlOiI = new OlilOlOiI(22);
/* 26 */                    int i = 21;
/* 28 */                    Oo1ol1ll oo1ol1ll = new Oo1ol1ll(i);
/* 31 */                    olilOlOiI.I00iiO = oo1ol1ll;
/* 33 */                    olilOlOiI.I00iio = oo1ol1ll;
/* 35 */                    olilOlOiI.I00iiI = simpleName;
/* 37 */                    VarHandle.storeStoreFence();
/* 42 */                    l0iO00i1IO0 l0io00i1io0 = (l0iO00i1IO0) this.I00iiO;
/* 46 */                    Oo1ol1ll oo1ol1ll2 = new Oo1ol1ll(i);
/* 49 */                    oo1ol1ll.I00iio = oo1ol1ll2;
/* 51 */                    olilOlOiI.I00iio = oo1ol1ll2;
/* 53 */                    oo1ol1ll2.I00iiO = l0io00i1io0;
/* 55 */                    return olilOlOiI.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 11 */        public l0iOoII1Il(int i) {
/* 12 */            this.I00iOIl = i;
                }
            }
