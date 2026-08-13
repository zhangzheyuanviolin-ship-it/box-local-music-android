            package p000;

            import android.app.BroadcastOptions;
            import android.app.Service;
            import android.app.job.JobInfo;
            import android.app.job.JobScheduler;
            import android.content.ComponentName;
            import android.content.ContentValues;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.os.PersistableBundle;
            import android.os.SystemClock;
            import android.os.UserHandle;
            import android.text.TextUtils;
            import android.util.Log;
            import android.util.Pair;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.math.BigInteger;
            import java.net.MalformedURLException;
            import java.net.URI;
            import java.net.URISyntaxException;
            import java.net.URL;
            import java.nio.ByteBuffer;
            import java.nio.channels.FileChannel;
            import java.nio.channels.FileLock;
            import java.nio.channels.OverlappingFileLockException;
            import java.nio.charset.StandardCharsets;
            import java.security.SecureRandom;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.TreeSet;
            import java.util.UUID;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.zip.GZIPInputStream;
            
            public final class lilOOl0 implements l1i11I1I0 {
                public static volatile lilOOl0 I010i10l;
                public final l0l1ol11 I00iOIl;
                public final l0I1IOo I00iiI;
                public iOl1lOo1IO I00iiO;
                public l0IilI01 I00iio;
                public liI1IolOl I00ilI0I1;
                public i1lioiII I00ilO0;
                public final lio010i I00io1l;
                public l0I1IOo I00ioIO;
                public lOloIl1o001 I00l0I0l0lO1;
                public final liOii110IIl I00l0OO0IO;
                public i0O1lIi1O0IO I00li1OI;
                public final l0olllO1i I00ll1;
                public boolean I00lll10;
                public long I00o0iI0io1;
                public ArrayList I00o0l1o1o0;
                public int I00oI0i;
                public int I00oII;
                public boolean I00oIiI10;
                public boolean I00oO101o;
                public boolean I00oOio10iI1;
                public FileLock I00ol1;
                public FileChannel I00olI;
                public ArrayList I00oli;
                public ArrayList I00oliIiO01i;
                public long I00oo1iO0ll;
                public final HashMap I00ooIo0;
                public final HashMap I00ooiO1I;
                public final HashMap I00oooO;
                public lIol0ili1Oi I0100o111I;
                public String I010101Oo1lO;
                public li0O100iO01 I010I0;
                public long I010II;
                public final i1Il01 I010OIo1l;
                public final AtomicBoolean I00lli11 = new AtomicBoolean(false);
                public final LinkedList I00o101lO = new LinkedList();
                public final HashMap I0100i = new HashMap();

                public lilOOl0(IioloOoI iioloOoI) {
/* 30 */            i1Il01 i1il01 = new i1Il01(9);
/* 33 */            i1il01.I00iiI = this;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            this.I010OIo1l = i1il01;
/* 43 */            l0olllO1i l0olllo1iI000l1 = l0olllO1i.I000l1(iioloOoI.I00iOIl, null, null, null);
/* 47 */            this.I00ll1 = l0olllo1iI000l1;
/* 51 */            this.I00oo1iO0ll = -1L;
/* 55 */            liOii110IIl lioii110iil = new liOii110IIl(l0olllo1iI000l1);
/* 58 */            lioii110iil.I00iiI = this;
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            this.I00l0OO0IO = lioii110iil;
/* 67 */            lio010i lio010iVar = new lio010i(this);
/* 70 */            lio010iVar.I010i10l();
/* 73 */            this.I00io1l = lio010iVar;
/* 77 */            l0I1IOo l0i1ioo = new l0I1IOo(this, 0);
/* 80 */            l0i1ioo.I010i10l();
/* 83 */            this.I00iiI = l0i1ioo;
/* 87 */            l0l1ol11 l0l1ol11Var = new l0l1ol11(this);
/* 95 */            l0l1ol11Var.I00iio = new I1Io0i0II(0);
/* 102 */           l0l1ol11Var.I00ilI0I1 = new I1Io0i0II(0);
/* 109 */           l0l1ol11Var.I00ilO0 = new I1Io0i0II(0);
/* 116 */           l0l1ol11Var.I00io1l = new I1Io0i0II(0);
/* 123 */           l0l1ol11Var.I00ioIO = new I1Io0i0II(0);
/* 130 */           l0l1ol11Var.I00l0I0l0lO1 = new I1Io0i0II(0);
/* 137 */           l0l1ol11Var.I00lli11 = new I1Io0i0II(0);
/* 144 */           l0l1ol11Var.I00lll10 = new I1Io0i0II(0);
/* 151 */           l0l1ol11Var.I00o0iI0io1 = new I1Io0i0II(0);
/* 158 */           l0l1ol11Var.I00l0OO0IO = new I1Io0i0II(0);
/* 165 */           l0l1ol11Var.I00li1OI = new OOllli10(l0l1ol11Var);
/* 169 */           int i = 2;
/* 170 */           iii1IIii iii1iiii = new iii1IIii(i);
/* 173 */           iii1iiii.I00iiI = l0l1ol11Var;
/* 175 */           VarHandle.storeStoreFence();
/* 178 */           l0l1ol11Var.I00ll1 = iii1iiii;
/* 180 */           VarHandle.storeStoreFence();
/* 183 */           l0l1ol11Var.I010i10l();
/* 186 */           this.I00iOIl = l0l1ol11Var;
/* 193 */           this.I00ooIo0 = new HashMap();
/* 200 */           this.I00ooiO1I = new HashMap();
/* 207 */           this.I00oooO = new HashMap();
/* 209 */           l0o10OoO0 l0o10ooo0I00iOIl = I00iOIl();
/* 215 */           lOii1o loii1o = new lOii1o(i);
/* 218 */           loii1o.I00iiI = this;
/* 220 */           VarHandle.storeStoreFence();
/* 223 */           l0o10ooo0I00iOIl.I010o0o0oO(loii1o);
                }

                public static lilOOl0 I001iOo1i0O(Service service) {
/* 5 */             lII0I0I000I.I000II(service.getApplicationContext());
/* 10 */            if (I010i10l == null) {
                        synchronized (lilOOl0.class) {
                            try {
/* 17 */                        if (I010i10l == null) {
/* 21 */                            IioloOoI iioloOoI = new IioloOoI();
/* 24 */                            Context applicationContext = service.getApplicationContext();
/* 28 */                            lII0I0I000I.I000II(applicationContext);
/* 31 */                            iioloOoI.I00iOIl = applicationContext;
/* 33 */                            VarHandle.storeStoreFence();
/* 41 */                            I010i10l = new lilOOl0(iioloOoI);
                                }
                            } finally {
                            }
                        }
                    }
/* 50 */            return I010i10l;
                }

                public static final void I001l0I00(l0l0O000 l0l0o000, int i, String str) {
/* 1 */             List listI000O01llI0 = l0l0o000.I000O01llI0();
/* 12 */            for (int i2 = 0; i2 < listI000O01llI0.size(); i2++) {
/* 28 */                if ("_err".equals(((l0lliIlIO) listI000O01llI0.get(i2)).I001IIilI0O())) {
/* 30 */                    return;
                        }
                    }
/* 34 */            l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
/* 38 */            l0loooo1ioiI00IO1.I000O01llI0("_err");
/* 42 */            l0loooo1ioiI00IO1.I000OiO(i);
/* 49 */            l0lliIlIO l0lliilio = (l0lliIlIO) l0loooo1ioiI00IO1.I0000oI00();
/* 51 */            l0lOoOo1Ioi l0loooo1ioiI00IO12 = l0lliIlIO.I00IO1();
/* 57 */            l0loooo1ioiI00IO12.I000O01llI0("_ev");
/* 60 */            l0loooo1ioiI00IO12.I000OOo1O(str);
/* 67 */            l0lliIlIO l0lliilio2 = (l0lliIlIO) l0loooo1ioiI00IO12.I0000oI00();
/* 69 */            l0l0o000.I000iOII(l0lliilio);
/* 72 */            l0l0o000.I000iOII(l0lliilio2);
                }

                public static final void I001lIiIIo1O(l0l0O000 l0l0o000, String str) {
/* 1 */             List listI000O01llI0 = l0l0o000.I000O01llI0();
/* 10 */            for (int i = 0; i < listI000O01llI0.size(); i++) {
/* 26 */                if (str.equals(((l0lliIlIO) listI000O01llI0.get(i)).I001IIilI0O())) {
/* 28 */                    l0l0o000.I000lI(i);
/* 31 */                    return;
                        }
                    }
                }

                public static final boolean I00O0i0ii(lli10iI lli10ii) {
                    return !TextUtils.isEmpty(lli10ii.I00iiI);
                }

                public static final void I00O0o1oo(liOO10o0 lioo10o0) {
/* 1 */             if (lioo10o0 == null) {
/* 28 */                I000II.I001IO000("Upload Component not created");
                    } else {
/* 5 */                 if (lioo10o0.I00iiO) {
/* 7 */                     return;
                        }
/* 22 */                I000II.I001IO000("Component not initialized: ".concat(String.valueOf(lioo10o0.getClass())));
                    }
                }

                public static final Boolean I00O10llo(lli10iI lli10ii) {
/* 1 */             Boolean bool = lli10ii.I00o0l1o1o0;
/* 3 */             String str = lli10ii.I00ooiO1I;
/* 9 */             if (!TextUtils.isEmpty(str)) {
/* 19 */                int iOrdinal = ((l1iIoO01) i0O1lIi1O0IO.I000II(str).I00iiI).ordinal();
/* 23 */                if (iOrdinal == 0 || iOrdinal == 1) {
/* 41 */                    return null;
                        }
/* 29 */                if (iOrdinal == 2) {
/* 38 */                    return Boolean.TRUE;
                        }
/* 32 */                if (iOrdinal == 3) {
/* 35 */                    return Boolean.FALSE;
                        }
                    }
/* 77 */            return bool;
                }

                public final l1ioIO011Oo I00000oIO(String str) throws Throwable {
/* 1 */             l1ioIO011Oo l1ioio011oo = l1ioIO011Oo.I0000Il00O;
/* 7 */             I00iOIl().I010II();
/* 10 */            I00iIi0i1o();
/* 13 */            HashMap map = this.I00ooIo0;
/* 19 */            l1ioIO011Oo l1ioio011ooI011Ol0 = (l1ioIO011Oo) map.get(str);
/* 21 */            if (l1ioio011ooI011Ol0 == null) {
/* 23 */                iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 25 */                I00O0o1oo(iol1loo1io);
/* 28 */                l1ioio011ooI011Ol0 = iol1loo1io.I011Ol0(str);
/* 32 */                if (l1ioio011ooI011Ol0 == null) {
/* 34 */                    l1ioio011ooI011Ol0 = l1ioIO011Oo.I0000Il00O;
                        }
/* 40 */                I00iOIl().I010II();
/* 43 */                I00iIi0i1o();
/* 46 */                map.put(str, l1ioio011ooI011Ol0);
/* 49 */                iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 51 */                I00O0o1oo(iol1loo1io2);
/* 54 */                iol1loo1io2.I01IO0oio(str, l1ioio011ooI011Ol0);
                    }
/* 77 */            return l1ioio011ooI011Ol0;
                }

                public final long I00000oOI() {
/* 5 */             I00IoO0().getClass();
/* 8 */             long jCurrentTimeMillis = System.currentTimeMillis();
/* 12 */            lOloIl1o001 loloil1o001 = this.I00l0I0l0lO1;
/* 14 */            loloil1o001.I010OIo1l();
/* 17 */            loloil1o001.I010II();
/* 20 */            l0O0o010I l0o0o010i = loloil1o001.I00l0OO0IO;
/* 22 */            long jI00000oIO = l0o0o010i.I00000oIO();
/* 30 */            if (jI00000oIO == 0) {
/* 38 */                l0olllO1i.I0000oI00(((l0olllO1i) loloil1o001.I00iOIl).I00l0I0l0lO1);
/* 55 */                jI00000oIO = r7.I01OO1I().nextInt(86400000) + 1;
/* 56 */                l0o0o010i.I00000oOI(jI00000oIO);
                    }
/* 69 */            return ((((jCurrentTimeMillis + jI00000oIO) / 1000) / 60) / 60) / 24;
                }

                public final void I0000Il00O(String str, ii0oooi0IO0l ii0oooi0io0l) {
/* 7 */             iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 9 */             I00O0o1oo(iol1loo1io);
/* 12 */            l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str);
/* 16 */            if (l0iiiiI01Ol1o0 != null) {
/* 18 */                l0olllO1i l0olllo1i = l0iiiiI01Ol1o0.I00000oIO;
/* 28 */                if (!TextUtils.isEmpty(l0iiiiI01Ol1o0.I00IoiI())) {
/* 32 */                    Boolean boolI00IoIO0lI = I00IoIO0lI(l0iiiiI01Ol1o0);
/* 36 */                    if (boolI00IoIO0lI == null) {
/* 46 */                        if (!"_ui".equals(ii0oooi0io0l.I00iOIl)) {
/* 60 */                            I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Could not find package. appId", l01O0IO1ooO0.I010ioo(str));
                                }
                            } else if (!boolI00IoIO0lI.booleanValue()) {
/* 82 */                        I00II0oii1o().I00ilO0.I0000Il00O("App version does not match; dropping event. appId", l01O0IO1ooO0.I010ioo(str));
/* 85 */                        return;
                            }
/* 88 */                    String strI00IOO = l0iiiiI01Ol1o0.I00IOO();
/* 92 */                    String strI00IoiI = l0iiiiI01Ol1o0.I00IoiI();
/* 98 */                    long jI00O0i0ii = l0iiiiI01Ol1o0.I00O0i0ii();
/* 102 */                   l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 104 */                   l0olllO1i.I000II(l0o10ooo0);
/* 107 */                   l0o10ooo0.I010II();
/* 111 */                   String str2 = l0iiiiI01Ol1o0.I000l1;
/* 113 */                   l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 115 */                   l0olllO1i.I000II(l0o10ooo02);
/* 118 */                   l0o10ooo02.I010II();
/* 123 */                   long j = l0iiiiI01Ol1o0.I000lI;
/* 125 */                   l0o10OoO0 l0o10ooo03 = l0olllo1i.I00io1l;
/* 127 */                   l0olllO1i.I000II(l0o10ooo03);
/* 130 */                   l0o10ooo03.I010II();
/* 135 */                   long j2 = l0iiiiI01Ol1o0.I000o00OoI0I;
/* 137 */                   l0o10OoO0 l0o10ooo04 = l0olllo1i.I00io1l;
/* 139 */                   l0olllO1i.I000II(l0o10ooo04);
/* 142 */                   l0o10ooo04.I010II();
/* 146 */                   boolean z = l0iiiiI01Ol1o0.I000oI1ioi;
/* 148 */                   String strI00Io1lO = l0iiiiI01Ol1o0.I00Io1lO();
/* 154 */                   l0o10OoO0 l0o10ooo05 = l0olllo1i.I00io1l;
/* 156 */                   l0olllO1i.I000II(l0o10ooo05);
/* 159 */                   l0o10ooo05.I010II();
/* 162 */                   boolean z2 = l0iiiiI01Ol1o0.I00100l0;
/* 164 */                   Boolean boolI001i1lo1io = l0iiiiI01Ol1o0.I001i1lo1io();
/* 168 */                   long jI00000oOI = l0iiiiI01Ol1o0.I00000oOI();
/* 174 */                   l0o10OoO0 l0o10ooo06 = l0olllo1i.I00io1l;
/* 176 */                   l0olllO1i.I000II(l0o10ooo06);
/* 179 */                   l0o10ooo06.I010II();
/* 182 */                   ArrayList arrayList = l0iiiiI01Ol1o0.I0010o;
/* 188 */                   String strI000II = I00000oIO(str).I000II();
/* 192 */                   boolean zI001l0I00 = l0iiiiI01Ol1o0.I001l0I00();
/* 198 */                   l0o10OoO0 l0o10ooo07 = l0olllo1i.I00io1l;
/* 200 */                   l0olllO1i.I000II(l0o10ooo07);
/* 203 */                   l0o10ooo07.I010II();
/* 206 */                   long j3 = l0iiiiI01Ol1o0.I001IO000;
/* 214 */                   int i = I00000oIO(str).I00000oOI;
/* 220 */                   String str3 = I00ilI0I1(str).I00000oOI;
/* 224 */                   l0o10OoO0 l0o10ooo08 = l0olllo1i.I00io1l;
/* 226 */                   l0olllO1i.I000II(l0o10ooo08);
/* 229 */                   l0o10ooo08.I010II();
/* 232 */                   int i2 = l0iiiiI01Ol1o0.I001i1lo1io;
/* 234 */                   l0o10OoO0 l0o10ooo09 = l0olllo1i.I00io1l;
/* 236 */                   l0olllO1i.I000II(l0o10ooo09);
/* 239 */                   l0o10ooo09.I010II();
/* 290 */                   I0000O(ii0oooi0io0l, new lli10iI(str, strI00IOO, strI00IoiI, jI00O0i0ii, str2, j, j2, null, z, false, strI00Io1lO, 0L, 0, z2, false, boolI001i1lo1io, jI00000oOI, arrayList, strI000II, "", null, zI001l0I00, j3, i, str3, i2, l0iiiiI01Ol1o0.I001lllioOl, l0iiiiI01Ol1o0.I00II0Ol1O0l(), l0iiiiI01Ol1o0.I0010o(), 0L, l0iiiiI01Ol1o0.I00111O(), 0L));
/* 293 */                   return;
                        }
                    }
/* 302 */           I00II0oii1o().I00lli11.I0000Il00O("No app data available; dropping event", str);
                }

                /* JADX WARN: Not initialized variable reg: 6, insn: 0x0080: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:129), block:B:18:0x0080 */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0000O(ii0oooi0IO0l ii0oooi0io0l, lli10iI lli10ii) throws Throwable {
                    Throwable th;
                    Cursor cursorRawQuery;
                    Cursor cursor;
                    Bundle bundleI010o0o0oO;
                    ii0oooi0IO0l ii0oooi0io0lI00000oOI;
                    ii0il0lOolIo ii0il0loolio;
/* 1 */             String str = lli10ii.I00iOIl;
/* 3 */             lII0I0I000I.I0000O(str);
/* 6 */             iOlOi1iIii ioloi1iiiiI00000oIO = iOlOi1iIii.I00000oIO(ii0oooi0io0l);
/* 13 */            Bundle bundle = (Bundle) ioloi1iiiiI00000oIO.I0001Ioi1lo;
/* 15 */            lioil0ilIOi lioil0ilioiI00iIO = I00iIO();
/* 19 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 21 */            I00O0o1oo(iol1loo1io);
/* 26 */            l0olllO1i l0olllo1i = (l0olllO1i) iol1loo1io.I00iOIl;
/* 28 */            iol1loo1io.I010II();
/* 31 */            iol1loo1io.I010OIo1l();
/* 34 */            Cursor cursor2 = null;
                    try {
                        try {
/* 45 */                    cursorRawQuery = iol1loo1io.I01Io11IiiiO().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                            try {
                            } catch (SQLiteException e) {
/* 71 */                        e = e;
/* 138 */                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 140 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 147 */                       l01o0io1ooo0.I00ilO0.I0000Il00O("Error selecting default event parameters", e);
/* 150 */                       if (cursorRawQuery != null) {
                                }
/* 155 */                       bundleI010o0o0oO = null;
/* 156 */                       lioil0ilioiI00iIO.I0110OiO(bundle, bundleI010o0o0oO);
/* 159 */                       lioil0ilIOi lioil0ilioiI00iIO2 = I00iIO();
/* 163 */                       iIl1iil iil1iilI00Ol1ll1 = I00Ol1ll1();
/* 167 */                       iil1iilI00Ol1ll1.getClass();
/* 188 */                       lioil0ilioiI00iIO2.I01101IOlO(ioloi1iiiiI00000oIO, Math.max(Math.min(iil1iilI00Ol1ll1.I010o0o0oO(str, iol1II1ii1i.I00OOll1), 100), 25));
/* 191 */                       ii0oooi0io0lI00000oOI = ioloi1iiiiI00000oIO.I00000oOI();
/* 205 */                       if (!I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010l1ol111)) {
                                }
/* 264 */                       I0000oI00(ii0oooi0io0lI00000oOI, lli10ii);
                            }
                        } catch (Throwable th2) {
/* 69 */                    th = th2;
/* 129 */                   cursor2 = cursor;
/* 268 */                   if (cursor2 != null) {
/* 332 */                       throw th;
                            }
/* 270 */                   cursor2.close();
/* 332 */                   throw th;
                        }
                    } catch (SQLiteException e2) {
/* 136 */               e = e2;
/* 137 */               cursorRawQuery = null;
                    } catch (Throwable th3) {
/* 133 */               th = th3;
/* 268 */               if (cursor2 != null) {
                        }
                    }
/* 53 */            if (cursorRawQuery.moveToFirst()) {
                        try {
/* 92 */                    l0l1iIIOl l0l1iiiol = (l0l1iIIOl) ((l0l0O000) lio010i.I01IlIoOI(l0l1iIIOl.I00IlilI0i0i(), cursorRawQuery.getBlob(0))).I0000oI00();
/* 96 */                    iol1loo1io.I00iiI.I00i0oil();
/* 103 */                   bundleI010o0o0oO = lio010i.I010o0o0oO(l0l1iiiol.I001IO000());
/* 107 */                   cursorRawQuery.close();
                        } catch (IOException e3) {
/* 112 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 114 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 125 */                   l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Failed to retrieve default event parameters. appId", e3);
                        }
/* 156 */               lioil0ilioiI00iIO.I0110OiO(bundle, bundleI010o0o0oO);
/* 159 */               lioil0ilIOi lioil0ilioiI00iIO22 = I00iIO();
/* 163 */               iIl1iil iil1iilI00Ol1ll12 = I00Ol1ll1();
/* 167 */               iil1iilI00Ol1ll12.getClass();
/* 188 */               lioil0ilioiI00iIO22.I01101IOlO(ioloi1iiiiI00000oIO, Math.max(Math.min(iil1iilI00Ol1ll12.I010o0o0oO(str, iol1II1ii1i.I00OOll1), 100), 25));
/* 191 */               ii0oooi0io0lI00000oOI = ioloi1iiiiI00000oIO.I00000oOI();
/* 205 */               if (!I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010l1ol111) && "_cmp".equals(ii0oooi0io0lI00000oOI.I00iOIl)) {
/* 218 */                   ii0il0loolio = ii0oooi0io0lI00000oOI.I00iiI;
/* 234 */                   if ("referrer API v2".equals(ii0il0loolio.I00iOIl.getString("_cis"))) {
/* 240 */                       String string = ii0il0loolio.I00iOIl.getString("gclid");
/* 248 */                       if (!TextUtils.isEmpty(string)) {
/* 261 */                           I00OIO1(new lio0llOI0(ii0oooi0io0lI00000oOI.I00iio, string, "_lgclid", "auto"), lli10ii);
                                }
                            }
                        }
/* 264 */               I0000oI00(ii0oooi0io0lI00000oOI, lli10ii);
                    }
/* 55 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 57 */            l0olllO1i.I000II(l01o0io1ooo03);
/* 64 */            l01o0io1ooo03.I00lll10.I00000oOI("Default event parameters not found");
/* 150 */           if (cursorRawQuery != null) {
/* 152 */               cursorRawQuery.close();
                    }
/* 155 */           bundleI010o0o0oO = null;
/* 156 */           lioil0ilioiI00iIO.I0110OiO(bundle, bundleI010o0o0oO);
/* 159 */           lioil0ilIOi lioil0ilioiI00iIO222 = I00iIO();
/* 163 */           iIl1iil iil1iilI00Ol1ll122 = I00Ol1ll1();
/* 167 */           iil1iilI00Ol1ll122.getClass();
/* 188 */           lioil0ilioiI00iIO222.I01101IOlO(ioloi1iiiiI00000oIO, Math.max(Math.min(iil1iilI00Ol1ll122.I010o0o0oO(str, iol1II1ii1i.I00OOll1), 100), 25));
/* 191 */           ii0oooi0io0lI00000oOI = ioloi1iiiiI00000oIO.I00000oOI();
/* 205 */           if (!I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010l1ol111)) {
/* 218 */               ii0il0loolio = ii0oooi0io0lI00000oOI.I00iiI;
/* 234 */               if ("referrer API v2".equals(ii0il0loolio.I00iOIl.getString("_cis"))) {
                        }
                    }
/* 264 */           I0000oI00(ii0oooi0io0lI00000oOI, lli10ii);
                }

                public final void I0000oI00(ii0oooi0IO0l ii0oooi0io0l, lli10iI lli10ii) {
                    long j;
                    List listI01OiO1OI;
                    l0olllO1i l0olllo1i;
                    List listI01OiO1OI2;
                    List<iII000ol000> listI01OiO1OI3;
                    long j2;
                    String str;
/* 11 */            lII0I0I000I.I000II(lli10ii);
/* 14 */            String str2 = lli10ii.I00iOIl;
/* 16 */            lII0I0I000I.I0000O(str2);
/* 23 */            I00iOIl().I010II();
/* 26 */            I00iIi0i1o();
/* 29 */            long j3 = ii0oooi0io0l.I00iio;
/* 31 */            long j4 = ii0oooi0io0l.I00ilI0I1;
/* 33 */            iOlOi1iIii ioloi1iiiiI00000oIO = iOlOi1iIii.I00000oIO(ii0oooi0io0l);
/* 41 */            I00iOIl().I010II();
/* 44 */            lIol0ili1Oi liol0ili1oi = this.I0100o111I;
/* 46 */            if (liol0ili1oi == null || (str = this.I010101Oo1lO) == null || !str.equals(str2)) {
/* 58 */                liol0ili1oi = null;
                    }
/* 64 */            lioil0ilIOi.I01O1I1(liol0ili1oi, (Bundle) ioloi1iiiiI00000oIO.I0001Ioi1lo, false);
/* 67 */            ii0oooi0IO0l ii0oooi0io0lI00000oOI = ioloi1iiiiI00000oIO.I00000oOI();
/* 71 */            I00i0oil();
/* 80 */            if (TextUtils.isEmpty(lli10ii.I00iiI)) {
/* 82 */                return;
                    }
/* 85 */            if (!lli10ii.I00ioIO) {
/* 87 */                I00Ol00(lli10ii);
/* 90 */                return;
                    }
/* 91 */            List list = lli10ii.I00oI0i;
/* 93 */            if (list != null) {
/* 95 */                String str3 = ii0oooi0io0lI00000oOI.I00iOIl;
/* 101 */               if (!list.contains(str3)) {
/* 152 */                   I00II0oii1o().I00lli11.I0000oI00("Dropping non-safelisted event. appId, event name, origin", str2, str3, ii0oooi0io0lI00000oOI.I00iiO);
/* 155 */                   return;
                        }
/* 105 */               Bundle bundleI0001Ioi1lo = ii0oooi0io0lI00000oOI.I00iiI.I0001Ioi1lo();
/* 111 */               j = j3;
/* 115 */               bundleI0001Ioi1lo.putLong("ga_safelisted", 1L);
/* 137 */               ii0oooi0io0lI00000oOI = new ii0oooi0IO0l(str3, new ii0il0lOolIo(bundleI0001Ioi1lo), ii0oooi0io0lI00000oOI.I00iiO, ii0oooi0io0lI00000oOI.I00iio, ii0oooi0io0lI00000oOI.I00ilI0I1);
                    } else {
/* 156 */               j = j3;
                    }
/* 158 */           iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 160 */           I00O0o1oo(iol1loo1io);
/* 163 */           iol1loo1io.I01Io000();
                    try {
/* 166 */               String str4 = ii0oooi0io0lI00000oOI.I00iOIl;
/* 174 */               if ("_s".equals(str4)) {
/* 176 */                   iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 178 */                   I00O0o1oo(iol1loo1io2);
/* 185 */                   if (!iol1loo1io2.I0111i(str2, "_s") && ii0oooi0io0lI00000oOI.I00iiI.I00iOIl.getLong("_sid") != 0) {
/* 199 */                       iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 201 */                       I00O0o1oo(iol1loo1io3);
/* 210 */                       if (iol1loo1io3.I0111i(str2, "_f")) {
/* 260 */                           iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 262 */                           I00O0o1oo(iol1loo1io4);
/* 270 */                           iol1loo1io4.I011Io0I1ioi(str2, null, "_sid", I0001Ioi1lo(str2, ii0oooi0io0lI00000oOI));
                                } else {
/* 212 */                           iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 214 */                           I00O0o1oo(iol1loo1io5);
/* 223 */                           if (iol1loo1io5.I0111i(str2, "_v")) {
/* 260 */                               iOl1lOo1IO iol1loo1io42 = this.I00iiO;
/* 262 */                               I00O0o1oo(iol1loo1io42);
/* 270 */                               iol1loo1io42.I011Io0I1ioi(str2, null, "_sid", I0001Ioi1lo(str2, ii0oooi0io0lI00000oOI));
                                    } else {
/* 226 */                               iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 228 */                               I00O0o1oo(iol1loo1io6);
/* 235 */                               I00IoO0().getClass();
/* 253 */                               iol1loo1io6.I011Io0I1ioi(str2, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", I0001Ioi1lo(str2, ii0oooi0io0lI00000oOI));
                                    }
                                }
                            }
                        }
/* 273 */               iOl1lOo1IO iol1loo1io7 = this.I00iiO;
/* 275 */               I00O0o1oo(iol1loo1io7);
/* 278 */               lII0I0I000I.I0000O(str2);
/* 281 */               iol1loo1io7.I010II();
/* 284 */               iol1loo1io7.I010OIo1l();
/* 287 */               int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
/* 289 */               if (i < 0) {
/* 295 */                   l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) iol1loo1io7.I00iOIl).I00ilO0;
/* 297 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 312 */                   l01o0io1ooo0.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str2), "Invalid time querying timed out conditional properties", Long.valueOf(j));
/* 315 */                   listI01OiO1OI = Collections.EMPTY_LIST;
                        } else {
/* 328 */                   listI01OiO1OI = iol1loo1io7.I01OiO1OI("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                        }
/* 332 */               Iterator it = listI01OiO1OI.iterator();
                        while (true) {
/* 336 */                   boolean zHasNext = it.hasNext();
/* 340 */                   l0olllo1i = this.I00ll1;
/* 342 */                   if (!zHasNext) {
                                break;
                            }
/* 349 */                   iII000ol000 iii000ol000 = (iII000ol000) it.next();
/* 351 */                   if (iii000ol000 != null) {
/* 379 */                       I00II0oii1o().I00lll10.I0000oI00("User property timed out", iii000ol000.I00iOIl, l0olllo1i.I00l0OO0IO.I0000Il00O(iii000ol000.I00iiO.I00iiI), iii000ol000.I00iiO.zza());
/* 382 */                       ii0oooi0IO0l ii0oooi0io0l2 = iii000ol000.I00io1l;
/* 384 */                       if (ii0oooi0io0l2 != null) {
/* 388 */                           j2 = j;
/* 393 */                           I000II(new ii0oooi0IO0l(ii0oooi0io0l2, j2, j4), lli10ii);
                                } else {
/* 397 */                           j2 = j;
                                }
/* 399 */                       iOl1lOo1IO iol1loo1io8 = this.I00iiO;
/* 401 */                       I00O0o1oo(iol1loo1io8);
/* 408 */                       iol1loo1io8.I01OOiI1o(str2, iii000ol000.I00iiO.I00iiI);
/* 411 */                       j = j2;
                            }
                        }
/* 414 */               long j5 = j;
/* 416 */               iOl1lOo1IO iol1loo1io9 = this.I00iiO;
/* 418 */               I00O0o1oo(iol1loo1io9);
/* 421 */               lII0I0I000I.I0000O(str2);
/* 424 */               iol1loo1io9.I010II();
/* 427 */               iol1loo1io9.I010OIo1l();
/* 430 */               if (i < 0) {
/* 436 */                   l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) iol1loo1io9.I00iOIl).I00ilO0;
/* 438 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 453 */                   l01o0io1ooo02.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str2), "Invalid time querying expired conditional properties", Long.valueOf(j5));
/* 456 */                   listI01OiO1OI2 = Collections.EMPTY_LIST;
                        } else {
/* 469 */                   listI01OiO1OI2 = iol1loo1io9.I01OiO1OI("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j5)});
                        }
/* 479 */               ArrayList arrayList = new ArrayList(listI01OiO1OI2.size());
/* 482 */               Iterator it2 = listI01OiO1OI2.iterator();
/* 490 */               while (it2.hasNext()) {
/* 496 */                   iII000ol000 iii000ol0002 = (iII000ol000) it2.next();
/* 498 */                   if (iii000ol0002 != null) {
/* 508 */                       Iterator it3 = it2;
/* 512 */                       int i2 = i;
/* 516 */                       long j6 = j5;
/* 532 */                       I00II0oii1o().I00lll10.I0000oI00("User property expired", iii000ol0002.I00iOIl, l0olllo1i.I00l0OO0IO.I0000Il00O(iii000ol0002.I00iiO.I00iiI), iii000ol0002.I00iiO.zza());
/* 535 */                       iOl1lOo1IO iol1loo1io10 = this.I00iiO;
/* 537 */                       I00O0o1oo(iol1loo1io10);
/* 544 */                       iol1loo1io10.I01Iol(str2, iii000ol0002.I00iiO.I00iiI);
/* 547 */                       ii0oooi0IO0l ii0oooi0io0l3 = iii000ol0002.I00li1OI;
/* 549 */                       if (ii0oooi0io0l3 != null) {
/* 551 */                           arrayList.add(ii0oooi0io0l3);
                                }
/* 554 */                       iOl1lOo1IO iol1loo1io11 = this.I00iiO;
/* 556 */                       I00O0o1oo(iol1loo1io11);
/* 563 */                       iol1loo1io11.I01OOiI1o(str2, iii000ol0002.I00iiO.I00iiI);
/* 566 */                       it2 = it3;
/* 568 */                       i = i2;
/* 570 */                       j5 = j6;
                            }
                        }
/* 573 */               int i3 = i;
/* 575 */               long j7 = j5;
/* 577 */               Iterator it4 = arrayList.iterator();
/* 585 */               while (it4.hasNext()) {
/* 596 */                   long j8 = j7;
/* 603 */                   I000II(new ii0oooi0IO0l((ii0oooi0IO0l) it4.next(), j8, j4), lli10ii);
/* 606 */                   j7 = j8;
/* 608 */                   j4 = j4;
                        }
/* 611 */               long j9 = j4;
/* 613 */               long j10 = j7;
/* 615 */               iOl1lOo1IO iol1loo1io12 = this.I00iiO;
/* 617 */               I00O0o1oo(iol1loo1io12);
/* 620 */               lII0I0I000I.I0000O(str2);
/* 623 */               lII0I0I000I.I0000O(str4);
/* 626 */               iol1loo1io12.I010II();
/* 629 */               iol1loo1io12.I010OIo1l();
/* 632 */               if (i3 < 0) {
/* 636 */                   l0olllO1i l0olllo1i2 = (l0olllO1i) iol1loo1io12.I00iOIl;
/* 638 */                   l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i2.I00ilO0;
/* 640 */                   l0olllO1i.I000II(l01o0io1ooo03);
/* 661 */                   l01o0io1ooo03.I00l0I0l0lO1.I0000oI00("Invalid time querying triggered conditional properties", l01O0IO1ooO0.I010ioo(str2), l0olllo1i2.I00l0OO0IO.I00000oIO(str4), Long.valueOf(j10));
/* 664 */                   listI01OiO1OI3 = Collections.EMPTY_LIST;
                        } else {
/* 677 */                   listI01OiO1OI3 = iol1loo1io12.I01OiO1OI("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                        }
/* 687 */               ArrayList arrayList2 = new ArrayList(listI01OiO1OI3.size());
/* 698 */               for (iII000ol000 iii000ol0003 : listI01OiO1OI3) {
/* 706 */                   if (iii000ol0003 != null) {
/* 708 */                       lio0llOI0 lio0lloi0 = iii000ol0003.I00iiO;
/* 712 */                       String str5 = iii000ol0003.I00iOIl;
/* 714 */                       lII0I0I000I.I000II(str5);
/* 717 */                       long j11 = j10;
/* 719 */                       String str6 = iii000ol0003.I00iiI;
/* 721 */                       String str7 = lio0lloi0.I00iiI;
/* 723 */                       Object objZza = lio0lloi0.zza();
/* 727 */                       lII0I0I000I.I000II(objZza);
/* 732 */                       lioOO0ioOI liooo0iooi = new lioOO0ioOI(str5, str6, str7, j11, objZza);
/* 735 */                       j10 = j11;
/* 736 */                       Object obj = liooo0iooi.I0000oI00;
/* 738 */                       String str8 = liooo0iooi.I0000Il00O;
/* 740 */                       iOl1lOo1IO iol1loo1io13 = this.I00iiO;
/* 742 */                       I00O0o1oo(iol1loo1io13);
/* 749 */                       if (iol1loo1io13.I01O10iIoo1O(liooo0iooi)) {
/* 767 */                           I00II0oii1o().I00lll10.I0000oI00("User property triggered", iii000ol0003.I00iOIl, l0olllo1i.I00l0OO0IO.I0000Il00O(str8), obj);
                                } else {
/* 791 */                           I00II0oii1o().I00ilO0.I0000oI00("Too many active user properties, ignoring", l01O0IO1ooO0.I010ioo(iii000ol0003.I00iOIl), l0olllo1i.I00l0OO0IO.I0000Il00O(str8), obj);
                                }
/* 794 */                       ii0oooi0IO0l ii0oooi0io0l4 = iii000ol0003.I00l0I0l0lO1;
/* 796 */                       if (ii0oooi0io0l4 != null) {
/* 798 */                           arrayList2.add(ii0oooi0io0l4);
                                }
/* 806 */                       iii000ol0003.I00iiO = new lio0llOI0(liooo0iooi);
/* 809 */                       iii000ol0003.I00ilI0I1 = true;
/* 811 */                       iOl1lOo1IO iol1loo1io14 = this.I00iiO;
/* 813 */                       I00O0o1oo(iol1loo1io14);
/* 816 */                       iol1loo1io14.I01OO1I(iii000ol0003);
                            }
                        }
/* 820 */               I000II(ii0oooi0io0lI00000oOI, lli10ii);
/* 823 */               Iterator it5 = arrayList2.iterator();
/* 831 */               while (it5.hasNext()) {
/* 842 */                   long j12 = j9;
/* 847 */                   I000II(new ii0oooi0IO0l((ii0oooi0IO0l) it5.next(), j10, j12), lli10ii);
/* 850 */                   j9 = j12;
                        }
/* 853 */               iOl1lOo1IO iol1loo1io15 = this.I00iiO;
/* 855 */               I00O0o1oo(iol1loo1io15);
/* 858 */               iol1loo1io15.I01Io001O();
/* 861 */               iOl1lOo1IO iol1loo1io16 = this.I00iiO;
/* 863 */               I00O0o1oo(iol1loo1io16);
/* 866 */               iol1loo1io16.I01Io1();
                    } catch (Throwable th) {
/* 870 */               iOl1lOo1IO iol1loo1io17 = this.I00iiO;
/* 872 */               I00O0o1oo(iol1loo1io17);
/* 875 */               iol1loo1io17.I01Io1();
/* 900 */               throw th;
                    }
                }

                public final Bundle I0001Ioi1lo(String str, ii0oooi0IO0l ii0oooi0io0l) throws Throwable {
/* 3 */             Bundle bundle = new Bundle();
/* 16 */            bundle.putLong("_sid", ii0oooi0io0l.I00iiI.I00iOIl.getLong("_sid"));
/* 19 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 21 */            I00O0o1oo(iol1loo1io);
/* 26 */            lioOO0ioOI liooo0iooiI01O1I1 = iol1loo1io.I01O1I1(str, "_sno");
/* 30 */            if (liooo0iooiI01O1I1 != null) {
/* 32 */                Object obj = liooo0iooiI01O1I1.I0000oI00;
/* 36 */                if (obj instanceof Long) {
/* 44 */                    bundle.putLong("_sno", ((Long) obj).longValue());
                        }
                    }
/* 106 */           return bundle;
                }

                /* JADX WARN: Can't wrap try/catch for region: R(9:73|(4:75|(0)(1:78)|85|(1:87)(1:88))|77|79|349|80|84|85|(0)(0)) */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x02de, code lost:
                
                    r0 = move-exception;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:83:0x02df, code lost:
                
                    ((p000.l0olllO1i) r10.I00iOIl).I00II0oii1o().I00ilO0.I0000O(p000.l01O0IO1ooO0.I010ioo(r11), "Error pruning currencies. appId", r0);
                 */
                /* JADX WARN: Removed duplicated region for block: B:101:0x03c8 A[Catch: all -> 0x01bb, TryCatch #5 {all -> 0x01bb, blocks: (B:37:0x0199, B:40:0x01a8, B:42:0x01b0, B:48:0x01bf, B:90:0x0349, B:99:0x0381, B:101:0x03c8, B:103:0x03cd, B:104:0x03e2, B:106:0x03ed, B:108:0x0407, B:110:0x040d, B:111:0x0422, B:114:0x043e, B:118:0x045d, B:119:0x0472, B:120:0x047b, B:123:0x0498, B:124:0x04ac, B:126:0x04b4, B:128:0x04be, B:130:0x04c4, B:131:0x04cb, B:132:0x04d8, B:138:0x051b, B:139:0x052e, B:141:0x055d, B:144:0x0587, B:146:0x0591, B:150:0x05d7, B:152:0x0600, B:154:0x062d, B:155:0x0630, B:157:0x0638, B:158:0x063b, B:160:0x0643, B:161:0x0646, B:163:0x064e, B:164:0x0651, B:166:0x065a, B:167:0x065e, B:169:0x0669, B:171:0x0675, B:174:0x06a6, B:176:0x06b8, B:180:0x06ce, B:185:0x06dc, B:218:0x075b, B:220:0x0761, B:221:0x0764, B:223:0x077a, B:224:0x0784, B:226:0x0791, B:228:0x079b, B:229:0x07a0, B:238:0x07d5, B:188:0x06e5, B:192:0x06f3, B:196:0x0702, B:200:0x0711, B:204:0x0720, B:208:0x072f, B:212:0x073c, B:216:0x074b, B:151:0x05f2, B:135:0x0502, B:93:0x035b, B:94:0x0367, B:96:0x036d, B:98:0x037b, B:53:0x01dd, B:56:0x01ef, B:58:0x0204, B:64:0x021c, B:69:0x024a, B:71:0x0250, B:73:0x025e, B:75:0x026c, B:78:0x0281, B:85:0x0308, B:87:0x0312, B:79:0x02b3, B:80:0x02cc, B:84:0x02f2, B:83:0x02df, B:67:0x0228, B:68:0x0244), top: B:346:0x0199, inners: #4, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:105:0x03eb  */
                /* JADX WARN: Removed duplicated region for block: B:217:0x0758  */
                /* JADX WARN: Removed duplicated region for block: B:257:0x0861  */
                /* JADX WARN: Removed duplicated region for block: B:260:0x08a8 A[Catch: all -> 0x083a, TryCatch #3 {all -> 0x083a, blocks: (B:231:0x07b4, B:233:0x07b8, B:236:0x07ca, B:239:0x07de, B:241:0x07e8, B:243:0x07f4, B:245:0x07fe, B:247:0x080c, B:249:0x0826, B:253:0x0841, B:255:0x084f, B:256:0x0858, B:258:0x0865, B:260:0x08a8, B:263:0x08b3, B:264:0x08bd, B:265:0x08be, B:267:0x08c8), top: B:343:0x07b4 }] */
                /* JADX WARN: Removed duplicated region for block: B:267:0x08c8 A[Catch: all -> 0x083a, TRY_LEAVE, TryCatch #3 {all -> 0x083a, blocks: (B:231:0x07b4, B:233:0x07b8, B:236:0x07ca, B:239:0x07de, B:241:0x07e8, B:243:0x07f4, B:245:0x07fe, B:247:0x080c, B:249:0x0826, B:253:0x0841, B:255:0x084f, B:256:0x0858, B:258:0x0865, B:260:0x08a8, B:263:0x08b3, B:264:0x08bd, B:265:0x08be, B:267:0x08c8), top: B:343:0x07b4 }] */
                /* JADX WARN: Removed duplicated region for block: B:276:0x0928  */
                /* JADX WARN: Removed duplicated region for block: B:284:0x0951 A[Catch: all -> 0x08f2, TryCatch #1 {all -> 0x08f2, blocks: (B:269:0x08cf, B:271:0x08e6, B:275:0x08f5, B:277:0x092b, B:279:0x0933, B:281:0x093d, B:282:0x0947, B:284:0x0951, B:285:0x095b, B:286:0x0964, B:288:0x096a, B:290:0x09b4, B:292:0x09c6, B:296:0x09e1, B:298:0x09f1, B:295:0x09d5, B:302:0x0a04, B:303:0x0a46, B:304:0x0a51, B:305:0x0a66, B:307:0x0a6c, B:316:0x0ab3, B:317:0x0b06, B:319:0x0b17, B:333:0x0b76, B:324:0x0b2f, B:325:0x0b32, B:310:0x0a79, B:312:0x0a9f, B:330:0x0b4b, B:331:0x0b62, B:332:0x0b63), top: B:340:0x08cf, inners: #2, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:288:0x096a A[Catch: all -> 0x08f2, TryCatch #1 {all -> 0x08f2, blocks: (B:269:0x08cf, B:271:0x08e6, B:275:0x08f5, B:277:0x092b, B:279:0x0933, B:281:0x093d, B:282:0x0947, B:284:0x0951, B:285:0x095b, B:286:0x0964, B:288:0x096a, B:290:0x09b4, B:292:0x09c6, B:296:0x09e1, B:298:0x09f1, B:295:0x09d5, B:302:0x0a04, B:303:0x0a46, B:304:0x0a51, B:305:0x0a66, B:307:0x0a6c, B:316:0x0ab3, B:317:0x0b06, B:319:0x0b17, B:333:0x0b76, B:324:0x0b2f, B:325:0x0b32, B:310:0x0a79, B:312:0x0a9f, B:330:0x0b4b, B:331:0x0b62, B:332:0x0b63), top: B:340:0x08cf, inners: #2, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:300:0x09fc  */
                /* JADX WARN: Removed duplicated region for block: B:307:0x0a6c A[Catch: all -> 0x08f2, TryCatch #1 {all -> 0x08f2, blocks: (B:269:0x08cf, B:271:0x08e6, B:275:0x08f5, B:277:0x092b, B:279:0x0933, B:281:0x093d, B:282:0x0947, B:284:0x0951, B:285:0x095b, B:286:0x0964, B:288:0x096a, B:290:0x09b4, B:292:0x09c6, B:296:0x09e1, B:298:0x09f1, B:295:0x09d5, B:302:0x0a04, B:303:0x0a46, B:304:0x0a51, B:305:0x0a66, B:307:0x0a6c, B:316:0x0ab3, B:317:0x0b06, B:319:0x0b17, B:333:0x0b76, B:324:0x0b2f, B:325:0x0b32, B:310:0x0a79, B:312:0x0a9f, B:330:0x0b4b, B:331:0x0b62, B:332:0x0b63), top: B:340:0x08cf, inners: #2, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:319:0x0b17 A[Catch: all -> 0x08f2, SQLiteException -> 0x0b2b, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x0b2b, blocks: (B:317:0x0b06, B:319:0x0b17), top: B:347:0x0b06, outer: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:323:0x0b2d  */
                /* JADX WARN: Removed duplicated region for block: B:357:0x0a79 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0312 A[Catch: all -> 0x01bb, TryCatch #5 {all -> 0x01bb, blocks: (B:37:0x0199, B:40:0x01a8, B:42:0x01b0, B:48:0x01bf, B:90:0x0349, B:99:0x0381, B:101:0x03c8, B:103:0x03cd, B:104:0x03e2, B:106:0x03ed, B:108:0x0407, B:110:0x040d, B:111:0x0422, B:114:0x043e, B:118:0x045d, B:119:0x0472, B:120:0x047b, B:123:0x0498, B:124:0x04ac, B:126:0x04b4, B:128:0x04be, B:130:0x04c4, B:131:0x04cb, B:132:0x04d8, B:138:0x051b, B:139:0x052e, B:141:0x055d, B:144:0x0587, B:146:0x0591, B:150:0x05d7, B:152:0x0600, B:154:0x062d, B:155:0x0630, B:157:0x0638, B:158:0x063b, B:160:0x0643, B:161:0x0646, B:163:0x064e, B:164:0x0651, B:166:0x065a, B:167:0x065e, B:169:0x0669, B:171:0x0675, B:174:0x06a6, B:176:0x06b8, B:180:0x06ce, B:185:0x06dc, B:218:0x075b, B:220:0x0761, B:221:0x0764, B:223:0x077a, B:224:0x0784, B:226:0x0791, B:228:0x079b, B:229:0x07a0, B:238:0x07d5, B:188:0x06e5, B:192:0x06f3, B:196:0x0702, B:200:0x0711, B:204:0x0720, B:208:0x072f, B:212:0x073c, B:216:0x074b, B:151:0x05f2, B:135:0x0502, B:93:0x035b, B:94:0x0367, B:96:0x036d, B:98:0x037b, B:53:0x01dd, B:56:0x01ef, B:58:0x0204, B:64:0x021c, B:69:0x024a, B:71:0x0250, B:73:0x025e, B:75:0x026c, B:78:0x0281, B:85:0x0308, B:87:0x0312, B:79:0x02b3, B:80:0x02cc, B:84:0x02f2, B:83:0x02df, B:67:0x0228, B:68:0x0244), top: B:346:0x0199, inners: #4, #7 }] */
                /* JADX WARN: Removed duplicated region for block: B:88:0x033a  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0358  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x035b A[Catch: all -> 0x01bb, TryCatch #5 {all -> 0x01bb, blocks: (B:37:0x0199, B:40:0x01a8, B:42:0x01b0, B:48:0x01bf, B:90:0x0349, B:99:0x0381, B:101:0x03c8, B:103:0x03cd, B:104:0x03e2, B:106:0x03ed, B:108:0x0407, B:110:0x040d, B:111:0x0422, B:114:0x043e, B:118:0x045d, B:119:0x0472, B:120:0x047b, B:123:0x0498, B:124:0x04ac, B:126:0x04b4, B:128:0x04be, B:130:0x04c4, B:131:0x04cb, B:132:0x04d8, B:138:0x051b, B:139:0x052e, B:141:0x055d, B:144:0x0587, B:146:0x0591, B:150:0x05d7, B:152:0x0600, B:154:0x062d, B:155:0x0630, B:157:0x0638, B:158:0x063b, B:160:0x0643, B:161:0x0646, B:163:0x064e, B:164:0x0651, B:166:0x065a, B:167:0x065e, B:169:0x0669, B:171:0x0675, B:174:0x06a6, B:176:0x06b8, B:180:0x06ce, B:185:0x06dc, B:218:0x075b, B:220:0x0761, B:221:0x0764, B:223:0x077a, B:224:0x0784, B:226:0x0791, B:228:0x079b, B:229:0x07a0, B:238:0x07d5, B:188:0x06e5, B:192:0x06f3, B:196:0x0702, B:200:0x0711, B:204:0x0720, B:208:0x072f, B:212:0x073c, B:216:0x074b, B:151:0x05f2, B:135:0x0502, B:93:0x035b, B:94:0x0367, B:96:0x036d, B:98:0x037b, B:53:0x01dd, B:56:0x01ef, B:58:0x0204, B:64:0x021c, B:69:0x024a, B:71:0x0250, B:73:0x025e, B:75:0x026c, B:78:0x0281, B:85:0x0308, B:87:0x0312, B:79:0x02b3, B:80:0x02cc, B:84:0x02f2, B:83:0x02df, B:67:0x0228, B:68:0x0244), top: B:346:0x0199, inners: #4, #7 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000II(ii0oooi0IO0l ii0oooi0io0l, lli10iI lli10ii) throws Throwable {
                    String str;
                    lilOOl0 lilool0;
                    int i;
                    boolean z;
                    String str2;
                    boolean z2;
                    long jRound;
                    String str3;
                    String str4;
                    String str5;
                    i1Il01 i1il01;
                    String str6;
                    ii0il0lOolIo ii0il0loolio;
                    l0olllO1i l0olllo1i;
                    lioOO0ioOI liooo0iooi;
                    long length;
                    long jIntValue;
                    long jDelete;
                    ii00010lll1 ii00010lll1Var;
                    ii01Ioio01i ii01ioio01i;
                    String str7;
                    String str8;
                    String str9;
                    String str10;
                    l0IIii l0iiiiI01Ol1o0;
                    ii00010lll1 ii00010lll1Var2;
                    long j;
                    l0IIii l0iiiiI01Ol1o02;
                    int i2;
                    List listI01O1lIi;
                    int i3;
                    iOl1lOo1IO iol1loo1ioI00i01iIIliI;
                    iOl1lOo1IO iol1loo1ioI00i01iIIliI2;
                    Iterator<String> it;
                    ContentValues contentValues;
                    String str11;
                    long jI01IiOO;
                    List listI011IOil;
                    lioOO0ioOI liooo0iooiI01O1I1;
/* 17 */            lII0I0I000I.I000II(lli10ii);
/* 20 */            boolean z3 = lli10ii.I00ioIO;
/* 22 */            String str12 = lli10ii.I00iOIl;
/* 24 */            lII0I0I000I.I0000O(str12);
/* 27 */            long jNanoTime = System.nanoTime();
/* 35 */            I00iOIl().I010II();
/* 38 */            I00iIi0i1o();
/* 41 */            I00i0oil();
/* 44 */            String str13 = lli10ii.I00iiI;
/* 50 */            if (TextUtils.isEmpty(str13)) {
/* 244 */               return;
                    }
/* 54 */            if (!z3) {
/* 56 */                I00Ol00(lli10ii);
/* 59 */                return;
                    }
/* 60 */            l0l1ol11 l0l1ol11VarI00OloOo = I00OloOo();
/* 66 */            String str14 = ii0oooi0io0l.I00iOIl;
/* 68 */            boolean zI0111i = l0l1ol11VarI00OloOo.I0111i(str12, str14);
/* 74 */            l0olllO1i l0olllo1i2 = this.I00ll1;
/* 78 */            i1Il01 i1il012 = this.I010OIo1l;
/* 83 */            if (zI0111i) {
/* 103 */               I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str12), "Dropping blocked event. appId", l0olllo1i2.I00l0OO0IO.I00000oIO(str14));
/* 122 */               if (!"1".equals(I00OloOo().I00OIl(str12, "measurement.upload.blacklist_internal")) && !"1".equals(I00OloOo().I00OIl(str12, "measurement.upload.blacklist_public"))) {
/* 145 */                   if ("_err".equals(str14)) {
/* 244 */                       return;
                            }
/* 147 */                   I00iIO();
/* 155 */                   lioil0ilIOi.I011Ill(i1il012, str12, 11, "_ev", str14, 0);
/* 158 */                   return;
                        }
/* 163 */               l0IIii l0iiiiI01Ol1o03 = I00i01iIIliI().I01Ol1o0(str12);
/* 167 */               if (l0iiiiI01Ol1o03 != null) {
/* 169 */                   l0olllO1i l0olllo1i3 = l0iiiiI01Ol1o03.I00000oIO;
/* 171 */                   l0o10OoO0 l0o10ooo0 = l0olllo1i3.I00io1l;
/* 173 */                   l0olllO1i.I000II(l0o10ooo0);
/* 176 */                   l0o10ooo0.I010II();
/* 179 */                   long j2 = l0iiiiI01Ol1o03.I00OI1;
/* 181 */                   l0o10OoO0 l0o10ooo02 = l0olllo1i3.I00io1l;
/* 183 */                   l0olllO1i.I000II(l0o10ooo02);
/* 186 */                   l0o10ooo02.I010II();
/* 191 */                   long jMax = Math.max(j2, l0iiiiI01Ol1o03.I00O10llo);
/* 199 */                   I00IoO0().getClass();
/* 207 */                   long jAbs = Math.abs(System.currentTimeMillis() - jMax);
/* 211 */                   I00Ol1ll1();
/* 228 */                   if (jAbs > ((Long) iol1II1ii1i.I00IoO0.I00000oIO(null)).longValue()) {
/* 238 */                       I00II0oii1o().I00lli11.I00000oOI("Fetching config for blocked app");
/* 241 */                       I001IO000(l0iiiiI01Ol1o03);
/* 244 */                       return;
                            }
/* 244 */                   return;
                        }
/* 244 */               return;
                    }
/* 247 */           iOlOi1iIii ioloi1iiiiI00000oIO = iOlOi1iIii.I00000oIO(ii0oooi0io0l);
/* 251 */           lioil0ilIOi lioil0ilioiI00iIO = I00iIO();
/* 255 */           iIl1iil iil1iilI00Ol1ll1 = I00Ol1ll1();
/* 259 */           iil1iilI00Ol1ll1.getClass();
/* 280 */           lioil0ilioiI00iIO.I01101IOlO(ioloi1iiiiI00000oIO, Math.max(Math.min(iil1iilI00Ol1ll1.I010o0o0oO(str12, iol1II1ii1i.I00OOll1), 100), 25));
/* 301 */           int iMax = Math.max(Math.min(I00Ol1ll1().I010o0o0oO(str12, iol1II1ii1i.I00i0O), 35), 10);
/* 307 */           Bundle bundle = (Bundle) ioloi1iiiiI00000oIO.I0001Ioi1lo;
/* 318 */           Iterator it2 = new TreeSet(bundle.keySet()).iterator();
/* 326 */           while (it2.hasNext()) {
/* 332 */               String str15 = (String) it2.next();
/* 334 */               Iterator it3 = it2;
/* 342 */               if ("items".equals(str15)) {
/* 352 */                   I00iIO().I01101olii(bundle.getParcelableArray(str15), iMax);
                        }
/* 355 */               it2 = it3;
                    }
/* 358 */           ii0oooi0IO0l ii0oooi0io0lI00000oOI = ioloi1iiiiI00000oIO.I00000oOI();
/* 362 */           ii0il0lOolIo ii0il0loolio2 = ii0oooi0io0lI00000oOI.I00iiI;
/* 364 */           String str16 = ii0oooi0io0lI00000oOI.I00iOIl;
/* 379 */           if (Log.isLoggable(I00II0oii1o().I010l1O(), 2)) {
/* 72 */                str = "_err";
/* 397 */               I00II0oii1o().I00lll10.I0000Il00O("Logging event", l0olllo1i2.I00l0OO0IO.I0000O(ii0oooi0io0lI00000oOI));
                    } else {
/* 72 */                str = "_err";
                    }
/* 407 */           I00i01iIIliI().I01Io000();
                    try {
/* 410 */               I00Ol00(lli10ii);
/* 421 */               i = 1;
/* 442 */               z = "ecommerce_purchase".equals(str16) || "purchase".equals(str16) || "refund".equals(str16);
                    } catch (Throwable th) {
/* 444 */               th = th;
/* 445 */               lilool0 = this;
                    }
/* 454 */           if (!"_iap".equals(str16)) {
/* 456 */               if (!z) {
/* 7 */                     str2 = "app_id";
/* 9 */                     str3 = "_fx";
/* 465 */                   z2 = z3;
/* 467 */                   ii0il0loolio = ii0il0loolio2;
/* 468 */                   str4 = str16;
/* 470 */                   str5 = str13;
/* 472 */                   i1il01 = i1il012;
/* 474 */                   str6 = str;
/* 842 */                   boolean zI01OOIlI = lioil0ilIOi.I01OOIlI(str4);
/* 846 */                   String str17 = str4;
/* 848 */                   boolean zEquals = str6.equals(str17);
/* 852 */                   I00iIO();
/* 855 */                   if (ii0il0loolio == null) {
/* 857 */                       length = 0;
                            } else {
/* 866 */                       Iterator<String> it4 = ii0il0loolio.I00iOIl.keySet().iterator();
/* 870 */                       length = 0;
/* 876 */                       while (it4.hasNext()) {
/* 890 */                           if (ii0il0loolio.I00000oOI(it4.next()) instanceof Parcelable[]) {
/* 896 */                               length += ((Parcelable[]) r5).length;
                                    }
                                }
                            }
/* 927 */                   ii0il0lOolIo ii0il0loolio3 = ii0il0loolio;
/* 936 */                   iOII1I ioii1iI01Olioli = I00i01iIIliI().I01Olioli(I00000oOI(), str12, length + 1, true, zI01OOIlI, false, zEquals, false, false, false);
/* 943 */                   long j3 = ioii1iI01Olioli.I00000oOI;
/* 945 */                   I00Ol1ll1();
/* 962 */                   jIntValue = j3 - ((Integer) iol1II1ii1i.I000l1.I00000oIO(null)).intValue();
/* 967 */                   if (jIntValue <= 0) {
/* 1004 */                      if (zI01OOIlI) {
/* 1006 */                          long j4 = ioii1iI01Olioli.I00000oIO;
/* 1008 */                          I00Ol1ll1();
/* 1027 */                          long jIntValue2 = j4 - ((Integer) iol1II1ii1i.I000o00OoI0I.I00000oIO(null)).intValue();
/* 1030 */                          if (jIntValue2 > 0) {
/* 1036 */                              if (jIntValue2 % 1000 == 1) {
/* 1056 */                                  I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str12), "Data loss. Too many public events logged. appId, count", Long.valueOf(ioii1iI01Olioli.I00000oIO));
                                        }
/* 1059 */                              I00iIO();
/* 1070 */                              lioil0ilIOi.I011Ill(i1il01, str12, 16, "_ev", ii0oooi0io0lI00000oOI.I00iOIl, 0);
/* 1077 */                              I00i01iIIliI().I01Io001O();
                                    }
                                }
/* 1085 */                      if (zEquals) {
/* 1109 */                          long jMax2 = ioii1iI01Olioli.I0000O - Math.max(0, Math.min(1000000, I00Ol1ll1().I010o0o0oO(str12, iol1II1ii1i.I000lI)));
/* 1112 */                          if (jMax2 > 0) {
/* 1116 */                              if (jMax2 == 1) {
/* 1136 */                                  I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str12), "Too many error events logged. appId, count", Long.valueOf(ioii1iI01Olioli.I0000O));
                                        }
/* 1143 */                              I00i01iIIliI().I01Io001O();
                                    }
                                }
/* 1148 */                      Bundle bundleI0001Ioi1lo = ii0il0loolio3.I0001Ioi1lo();
/* 1160 */                      I00iIO().I011IOil(bundleI0001Ioi1lo, "_o", ii0oooi0io0lI00000oOI.I00iiO);
/* 1175 */                      if (I00iIO().I01II10(str12, lli10ii.I00ooIo0)) {
/* 1187 */                          I00iIO().I011IOil(bundleI0001Ioi1lo, "_dbg", 1L);
/* 1194 */                          I00iIO().I011IOil(bundleI0001Ioi1lo, "_r", 1L);
                                }
/* 1203 */                      if ("_s".equals(str17) && (liooo0iooiI01O1I1 = I00i01iIIliI().I01O1I1(str12, "_sno")) != null) {
/* 1215 */                          Object obj = liooo0iooiI01O1I1.I0000oI00;
/* 1219 */                          if (obj instanceof Long) {
/* 1225 */                              I00iIO().I011IOil(bundleI0001Ioi1lo, "_sno", obj);
                                    }
                                }
/* 1228 */                      iOl1lOo1IO iol1loo1ioI00i01iIIliI3 = I00i01iIIliI();
/* 1232 */                      lII0I0I000I.I0000O(str12);
/* 1235 */                      iol1loo1ioI00i01iIIliI3.I010II();
/* 1238 */                      iol1loo1ioI00i01iIIliI3.I010OIo1l();
                                try {
/* 1276 */                          jDelete = iol1loo1ioI00i01iIIliI3.I01Io11IiiiO().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str12, String.valueOf(Math.max(0, Math.min(1000000, ((l0olllO1i) iol1loo1ioI00i01iIIliI3.I00iOIl).I00iio.I010o0o0oO(str12, iol1II1ii1i.I00100o1O0lo))))});
                                } catch (SQLiteException e) {
/* 1299 */                          ((l0olllO1i) iol1loo1ioI00i01iIIliI3.I00iOIl).I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str12), "Error deleting over the limit events. appId", e);
/* 1302 */                          jDelete = 0;
                                }
/* 1306 */                      if (jDelete > 0) {
/* 1324 */                          I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str12), "Data lost. Too many events stored on disk, deleted. appId", Long.valueOf(jDelete));
                                }
/* 1331 */                      l0olllO1i l0olllo1i4 = this.I00ll1;
/* 1354 */                      ii00010lll1 ii00010lll1Var3 = new ii00010lll1(l0olllo1i4, ii0oooi0io0lI00000oOI.I00iiO, str12, ii0oooi0io0lI00000oOI.I00iOIl, ii0oooi0io0lI00000oOI.I00iio, ii0oooi0io0lI00000oOI.I00ilI0I1, 0L, bundleI0001Ioi1lo);
/* 1359 */                      String str18 = str12;
/* 1360 */                      iOl1lOo1IO iol1loo1ioI00i01iIIliI4 = I00i01iIIliI();
/* 1364 */                      String str19 = ii00010lll1Var3.I00000oOI;
/* 1368 */                      ii01Ioio01i ii01ioio01iI011lOIoo0l = iol1loo1ioI00i01iIIliI4.I011lOIoo0l("events", str18, str19);
/* 1372 */                      if (ii01ioio01iI011lOIoo0l == null) {
/* 1378 */                          long jI011IOil = I00i01iIIliI().I011IOil(str18);
/* 1386 */                          I00Ol1ll1().getClass();
/* 1389 */                          iol01I0001 iol01i0001 = iol1II1ii1i.I00OIo;
/* 1412 */                          if (jI011IOil < Math.max(Math.min(r5.I010o0o0oO(str18, iol01i0001), 2000), 500) || !zI01OOIlI || I00iIO().I01OoIoio00O(str19)) {
/* 1494 */                              str18 = str18;
/* 1518 */                              ii01ioio01i = new ii01Ioio01i(str18, str19, 0L, 0L, 0L, ii00010lll1Var3.I0000O, 0L, null, null, null, null);
/* 1521 */                              ii00010lll1Var = ii00010lll1Var3;
                                    } else {
/* 1430 */                              IOloiOI1 iOloiOI1 = I00II0oii1o().I00ilO0;
/* 1434 */                              l01I01OOO l01i01oooI010ioo = l01O0IO1ooO0.I010ioo(str18);
/* 1440 */                              String strI00000oIO = l0olllo1i4.I00l0OO0IO.I00000oIO(str19);
/* 1444 */                              iIl1iil iil1iilI00Ol1ll12 = I00Ol1ll1();
/* 1448 */                              iil1iilI00Ol1ll12.getClass();
/* 1471 */                              iOloiOI1.I0000oI00("Too many event names used, ignoring event. appId, name, supported count", l01i01oooI010ioo, strI00000oIO, Integer.valueOf(Math.max(Math.min(iil1iilI00Ol1ll12.I010o0o0oO(str18, iol01i0001), 2000), 500)));
/* 1474 */                              I00iIO();
/* 1483 */                              lioil0ilIOi.I011Ill(i1il01, str18, 8, null, null, 0);
                                    }
                                } else {
/* 1525 */                          ii00010lll1 ii00010lll1VarI00000oIO = ii00010lll1Var3.I00000oIO(l0olllo1i4, ii01ioio01iI011lOIoo0l.I0001Ioi1lo);
/* 1531 */                          ii01Ioio01i ii01ioio01iI00000oIO = ii01ioio01iI011lOIoo0l.I00000oIO(ii00010lll1VarI00000oIO.I0000O);
/* 1535 */                          ii00010lll1Var = ii00010lll1VarI00000oIO;
/* 1536 */                          ii01ioio01i = ii01ioio01iI00000oIO;
                                }
/* 1541 */                      I00i01iIIliI().I011olOoO("events", ii01ioio01i);
/* 1548 */                      I00iOIl().I010II();
/* 1551 */                      I00iIi0i1o();
/* 1554 */                      String str20 = ii00010lll1Var.I00000oIO;
/* 1556 */                      lII0I0I000I.I0000O(str20);
/* 1563 */                      lII0I0I000I.I00000oOI(str20.equals(str18));
/* 1566 */                      l0ooIi1oOO l0ooii1oooI00OilO00Il = l100ll0OOIoO.I00OilO00Il();
/* 1570 */                      l0ooii1oooI00OilO00Il.I001iOo1i0O();
/* 1573 */                      l0ooii1oooI00OilO00Il.I000OiO();
/* 1580 */                      if (!TextUtils.isEmpty(str18)) {
/* 1582 */                          l0ooii1oooI00OilO00Il.I00100l0(str18);
                                }
/* 1585 */                      String str21 = lli10ii.I00iio;
/* 1591 */                      if (!TextUtils.isEmpty(str21)) {
/* 1593 */                          l0ooii1oooI00OilO00Il.I000o00OoI0I(str21);
                                }
/* 1596 */                      String str22 = lli10ii.I00iiO;
/* 1602 */                      if (!TextUtils.isEmpty(str22)) {
/* 1604 */                          l0ooii1oooI00OilO00Il.I00100o1O0lo(str22);
                                }
/* 1607 */                      String str23 = lli10ii.I00oO101o;
/* 1613 */                      if (!TextUtils.isEmpty(str23)) {
/* 1615 */                          l0ooii1oooI00OilO00Il.I00O10llo(str23);
                                }
/* 1618 */                      long j5 = lli10ii.I00l0OO0IO;
/* 1625 */                      if (j5 != -2147483648L) {
/* 1628 */                          l0ooii1oooI00OilO00Il.I00IoIO0lI((int) j5);
                                }
/* 1631 */                      long j6 = lli10ii.I00ilI0I1;
/* 1633 */                      l0ooii1oooI00OilO00Il.I0010I0i(j6);
/* 1640 */                      if (TextUtils.isEmpty(str5)) {
/* 13 */                            str7 = "raw_events";
/* 1652 */                          str8 = str5;
                                } else {
/* 13 */                            str7 = "raw_events";
/* 1644 */                          str8 = str5;
/* 1646 */                          l0ooii1oooI00OilO00Il.I00IOO(str8);
                                }
/* 1654 */                      lII0I0I000I.I000II(str18);
/* 1657 */                      String str24 = str23;
/* 1659 */                      l1ioIO011Oo l1ioio011ooI00000oIO = I00000oIO(str18);
/* 1665 */                      String str25 = lli10ii.I00oII;
/* 1675 */                      l1ioIO011Oo l1ioio011ooI000OiO = l1ioio011ooI00000oIO.I000OiO(l1ioIO011Oo.I0000Il00O(100, str25));
/* 1683 */                      l0ooii1oooI00OilO00Il.I00O0o1oo(l1ioio011ooI000OiO.I0001Ioi1lo());
/* 1686 */                      iIO0ooOool.I00000oIO();
/* 1695 */                      boolean zI01101IOlO = I00Ol1ll1().I01101IOlO(str18, iol1II1ii1i.I0100i);
/* 1699 */                      l1iioiool l1iioioolVar = l1iioiool.AD_STORAGE;
/* 1701 */                      if (zI01101IOlO) {
/* 1703 */                          I00iIO();
/* 1719 */                          if (lioil0ilIOi.I01I01Oolii((String) iol1II1ii1i.I00io1l.I00000oIO(null), str18)) {
/* 1723 */                              l0ooii1oooI00OilO00Il.I001l0I00(lli10ii.I00oliIiO01i);
/* 1726 */                              str9 = str8;
/* 1728 */                              str10 = str22;
/* 1729 */                              long j7 = lli10ii.I00oo1iO0ll;
/* 1737 */                              if (!l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar) && j7 != 0) {
/* 1747 */                                  j7 = (j7 & (-2)) | 32;
                                        }
/* 1757 */                              l0ooii1oooI00OilO00Il.I00OIO1(j7 == 1);
/* 1762 */                              if (j7 != 0) {
/* 1766 */                                  l0O01OlI l0o01oliI001lIiIIo1O = l0O1iO1OIiII.I001lIiIIo1O();
/* 1780 */                                  l0o01oliI001lIiIIo1O.I000O01llI0((j7 & 1) != 0);
/* 1795 */                                  l0o01oliI001lIiIIo1O.I000OOo1O((j7 & 2) != 0);
/* 1810 */                                  l0o01oliI001lIiIIo1O.I000OiO((j7 & 4) != 0);
/* 1825 */                                  l0o01oliI001lIiIIo1O.I000iOII((j7 & 8) != 0);
/* 1840 */                                  l0o01oliI001lIiIIo1O.I000l1((j7 & 16) != 0);
/* 1853 */                                  l0o01oliI001lIiIIo1O.I000lI((j7 & 32) != 0);
/* 1868 */                                  l0o01oliI001lIiIIo1O.I000o00OoI0I((j7 & 64) != 0);
/* 1877 */                                  l0ooii1oooI00OilO00Il.I001lIiIIo1O((l0O1iO1OIiII) l0o01oliI001lIiIIo1O.I0000oI00());
                                        }
                                    } else {
/* 1881 */                              str9 = str8;
/* 1883 */                              str10 = str22;
                                    }
/* 1884 */                          long j8 = lli10ii.I00ilO0;
/* 1888 */                          if (j8 != 0) {
/* 1890 */                              l0ooii1oooI00OilO00Il.I001i1O0Ol(j8);
                                    }
/* 1895 */                          long j9 = lli10ii.I00o101lO;
/* 1897 */                          l0ooii1oooI00OilO00Il.I00Iooi00oi(j9);
/* 1906 */                          String str26 = str10;
/* 1913 */                          if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010i10l)) {
/* 1915 */                              I00Ol1ll1();
/* 1922 */                              l0ooii1oooI00OilO00Il.I00II0oii1o(iI1l1i0I0.I00000oIO());
                                    }
/* 1936 */                          if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010iIIOlo) && (listI011IOil = I00OloOo().I011IOil(str18)) != null) {
/* 1950 */                              l0ooii1oooI00OilO00Il.I00IoiI(listI011IOil);
                                    }
/* 1963 */                          l1ioIO011Oo l1ioio011ooI000OiO2 = I00000oIO(str18).I000OiO(l1ioIO011Oo.I0000Il00O(100, str25));
/* 1971 */                          if (l1ioio011ooI000OiO2.I000OOo1O(l1iioioolVar)) {
                                        try {
/* 1973 */                                  boolean z4 = lli10ii.I00lll10;
/* 1975 */                                  if (z4) {
/* 1979 */                                      Pair pairI010ioo = this.I00l0I0l0lO1.I010ioo(lli10ii, l1ioio011ooI000OiO2);
/* 1991 */                                      if (TextUtils.isEmpty((CharSequence) pairI010ioo.first) || !z4) {
/* 2146 */                                          ii00010lll1Var2 = ii00010lll1Var;
/* 2148 */                                          j = j9;
/* 2154 */                                          l0olllo1i4.I000OiO().I010i10l();
/* 2157 */                                          String str27 = Build.MODEL;
/* 2159 */                                          l0ooii1oooI00OilO00Il.I000iOII();
/* 2166 */                                          l0olllo1i4.I000OiO().I010i10l();
/* 2169 */                                          String str28 = Build.VERSION.RELEASE;
/* 2171 */                                          l0ooii1oooI00OilO00Il.I0000Il00O();
/* 2178 */                                          ((l100ll0OOIoO) l0ooii1oooI00OilO00Il.I00iiI).I00l0I0l0lO1(str28);
/* 2190 */                                          l0ooii1oooI00OilO00Il.I000lI((int) l0olllo1i4.I000OiO().I010ioo());
/* 2201 */                                          l0ooii1oooI00OilO00Il.I000l1(l0olllo1i4.I000OiO().I010l10O());
/* 2208 */                                          l0ooii1oooI00OilO00Il.I00OI1(lli10ii.I00ol1);
/* 2215 */                                          if (l0olllo1i4.I00000oIO()) {
/* 2217 */                                              l0ooii1oooI00OilO00Il.I000oI1ioi();
/* 2225 */                                              if (!TextUtils.isEmpty(null)) {
/* 2228 */                                                  l0ooii1oooI00OilO00Il.I0000Il00O();
/* 2235 */                                                  ((l100ll0OOIoO) l0ooii1oooI00OilO00Il.I00iiI).I010iIIOlo(null);
/* 2238 */                                                  throw null;
                                                        }
                                                    }
/* 2243 */                                          l0iiiiI01Ol1o02 = I00i01iIIliI().I01Ol1o0(str18);
/* 2247 */                                          if (l0iiiiI01Ol1o02 != null) {
/* 2251 */                                              l0iiiiI01Ol1o02 = new l0IIii(l0olllo1i4, str18);
/* 2254 */                                              lilool0 = this;
                                                        try {
/* 2260 */                                                  l0iiiiI01Ol1o02.I00IO1oi11O(lilool0.I000OiO(l1ioio011ooI000OiO2));
/* 2265 */                                                  l0iiiiI01Ol1o02.I00Io1o110i(lli10ii.I00li1OI);
/* 2270 */                                                  l0iiiiI01Ol1o02.I00IioO0OiOi(str9);
/* 2277 */                                                  if (l1ioio011ooI000OiO2.I000OOo1O(l1iioioolVar)) {
/* 2285 */                                                      l0iiiiI01Ol1o02.I00IlilI0i0i(lilool0.I00l0I0l0lO1.I010l1O(lli10ii, l1ioio011ooI000OiO2));
                                                            }
/* 2294 */                                                  l0iiiiI01Ol1o02.I0000oI00(0L);
/* 2297 */                                                  l0iiiiI01Ol1o02.I00IoIO0lI(0L);
/* 2300 */                                                  l0iiiiI01Ol1o02.I00IoO0(0L);
/* 2305 */                                                  l0iiiiI01Ol1o02.I00Iooi00oi(str26);
/* 2310 */                                                  l0iiiiI01Ol1o02.I00O0o1oo(j5);
/* 2313 */                                                  l0iiiiI01Ol1o02.I00O10llo(str21);
/* 2318 */                                                  l0iiiiI01Ol1o02.I00OI1(j6);
/* 2323 */                                                  l0iiiiI01Ol1o02.I00000oIO(j8);
/* 2328 */                                                  l0iiiiI01Ol1o02.I0000O(z2);
/* 2333 */                                                  l0iiiiI01Ol1o02.I0000Il00O(j);
/* 2340 */                                                  i2 = 0;
/* 2341 */                                                  lilool0.I00i01iIIliI().I01OlIoIl(l0iiiiI01Ol1o02, false);
                                                        } catch (Throwable th2) {
/* 2291 */                                                  th = th2;
                                                        }
                                                    } else {
/* 2345 */                                              i2 = 0;
/* 2346 */                                              lilool0 = this;
                                                    }
/* 2354 */                                          if (l1ioio011ooI000OiO2.I000OOo1O(l1iioiool.ANALYTICS_STORAGE) && !TextUtils.isEmpty(l0iiiiI01Ol1o02.I00IO1())) {
/* 2366 */                                              String strI00IO1 = l0iiiiI01Ol1o02.I00IO1();
/* 2370 */                                              lII0I0I000I.I000II(strI00IO1);
/* 2373 */                                              l0ooii1oooI00OilO00Il.I001IO000(strI00IO1);
                                                    }
/* 2384 */                                          if (!TextUtils.isEmpty(l0iiiiI01Ol1o02.I00Io1lO())) {
/* 2386 */                                              String strI00Io1lO = l0iiiiI01Ol1o02.I00Io1lO();
/* 2390 */                                              lII0I0I000I.I000II(strI00Io1lO);
/* 2393 */                                              l0ooii1oooI00OilO00Il.I00Io1o110i(strI00Io1lO);
                                                    }
/* 2400 */                                          listI01O1lIi = lilool0.I00i01iIIliI().I01O1lIi(str18);
/* 2404 */                                          i3 = i2;
/* 2409 */                                          while (i3 < listI01O1lIi.size()) {
/* 2411 */                                              l1IIIIIl1iIO l1iiiiil1iioI00II0oii1o = l1IOl1iI00l.I00II0oii1o();
/* 2421 */                                              String str29 = ((lioOO0ioOI) listI01O1lIi.get(i3)).I0000Il00O;
/* 2423 */                                              l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 2430 */                                              ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IO1oi11O(str29);
/* 2439 */                                              long j10 = ((lioOO0ioOI) listI01O1lIi.get(i3)).I0000O;
/* 2441 */                                              l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 2448 */                                              ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IO1(j10);
/* 2463 */                                              lilool0.I00i0oil().I011iiii0i(l1iiiiil1iioI00II0oii1o, ((lioOO0ioOI) listI01O1lIi.get(i3)).I0000oI00);
/* 2466 */                                              l0ooii1oooI00OilO00Il.I00Ol00(l1iiiiil1iioI00II0oii1o);
/* 2483 */                                              if ("_sid".equals(((lioOO0ioOI) listI01O1lIi.get(i3)).I0000Il00O)) {
/* 2487 */                                                  l0o10OoO0 l0o10ooo03 = l0iiiiI01Ol1o02.I00000oIO.I00io1l;
/* 2489 */                                                  l0olllO1i.I000II(l0o10ooo03);
/* 2492 */                                                  l0o10ooo03.I010II();
/* 2501 */                                                  if (l0iiiiI01Ol1o02.I001i1O0Ol != 0) {
/* 2503 */                                                      lio010i lio010iVarI00i0oil = lilool0.I00i0oil();
/* 2511 */                                                      if (TextUtils.isEmpty(str24)) {
/* 2513 */                                                          str11 = str24;
/* 2515 */                                                          jI01IiOO = 0;
                                                                } else {
/* 2520 */                                                          str11 = str24;
/* 2526 */                                                          jI01IiOO = lio010iVarI00i0oil.I01IiOO(str11.getBytes(StandardCharsets.UTF_8));
                                                                }
/* 2532 */                                                      l0o10OoO0 l0o10ooo04 = l0iiiiI01Ol1o02.I00000oIO.I00io1l;
/* 2534 */                                                      l0olllO1i.I000II(l0o10ooo04);
/* 2537 */                                                      l0o10ooo04.I010II();
/* 2544 */                                                      if (jI01IiOO != l0iiiiI01Ol1o02.I001i1O0Ol) {
/* 2546 */                                                          l0ooii1oooI00OilO00Il.I0000Il00O();
/* 2553 */                                                          ((l100ll0OOIoO) l0ooii1oooI00OilO00Il.I00iiI).I01101IOlO();
                                                                }
                                                            } else {
/* 2557 */                                                      str11 = str24;
                                                            }
                                                        }
/* 2559 */                                              i3++;
/* 2561 */                                              str24 = str11;
                                                    }
                                                    try {
/* 2565 */                                              iol1loo1ioI00i01iIIliI = lilool0.I00i01iIIliI();
/* 2574 */                                              l100ll0OOIoO l100ll0ooioo = (l100ll0OOIoO) l0ooii1oooI00OilO00Il.I0000oI00();
/* 2576 */                                              iol1loo1ioI00i01iIIliI.I010II();
/* 2579 */                                              iol1loo1ioI00i01iIIliI.I010OIo1l();
/* 2586 */                                              lII0I0I000I.I0000O(l100ll0ooioo.I00111O());
/* 2589 */                                              byte[] bArrI00000oIO = l100ll0ooioo.I00000oIO();
/* 2599 */                                              long jI01IiOO2 = iol1loo1ioI00i01iIIliI.I00iiI.I00i0oil().I01IiOO(bArrI00000oIO);
/* 2605 */                                              ContentValues contentValues2 = new ContentValues();
/* 2612 */                                              String str30 = str2;
/* 2614 */                                              contentValues2.put(str30, l100ll0ooioo.I00111O());
/* 2623 */                                              contentValues2.put("metadata_fingerprint", Long.valueOf(jI01IiOO2));
/* 2628 */                                              contentValues2.put("metadata", bArrI00000oIO);
                                                        try {
/* 2639 */                                                  iol1loo1ioI00i01iIIliI.I01Io11IiiiO().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
/* 2642 */                                                  iol1loo1ioI00i01iIIliI2 = lilool0.I00i01iIIliI();
/* 2646 */                                                  ii00010lll1 ii00010lll1Var4 = ii00010lll1Var2;
/* 2648 */                                                  ii0il0lOolIo ii0il0loolio4 = ii00010lll1Var4.I000II;
/* 2650 */                                                  Objects.requireNonNull(ii0il0loolio4);
/* 2659 */                                                  it = ii0il0loolio4.I00iOIl.keySet().iterator();
                                                            while (true) {
/* 2667 */                                                      if (it.hasNext()) {
/* 2682 */                                                          l0l1ol11 l0l1ol11VarI00OloOo2 = lilool0.I00OloOo();
/* 2686 */                                                          String str31 = ii00010lll1Var4.I00000oIO;
/* 2690 */                                                          boolean zI011IO1I11OI = l0l1ol11VarI00OloOo2.I011IO1I11OI(str31, ii00010lll1Var4.I00000oOI);
/* 2712 */                                                          iOII1I ioii1iI01OlOoii0 = lilool0.I00i01iIIliI().I01OlOoii0(lilool0.I00000oOI(), str31, false, false, false, false);
/* 2718 */                                                          if (!zI011IO1I11OI || ioii1iI01OlOoii0.I0000oI00 >= lilool0.I00Ol1ll1().I010o0o0oO(str31, iol1II1ii1i.I00100l0)) {
/* 2738 */                                                              i = i2;
                                                                    }
                                                                } else if ("_r".equals(it.next())) {
                                                                    break;
                                                                }
                                                            }
/* 2740 */                                                  iol1loo1ioI00i01iIIliI2.I010II();
/* 2743 */                                                  iol1loo1ioI00i01iIIliI2.I010OIo1l();
/* 2746 */                                                  String str32 = ii00010lll1Var4.I00000oIO;
/* 2748 */                                                  lII0I0I000I.I0000O(str32);
/* 2761 */                                                  byte[] bArrI00000oIO2 = iol1loo1ioI00i01iIIliI2.I00iiI.I00i0oil().I011lOIoo0l(ii00010lll1Var4).I00000oIO();
/* 2767 */                                                  contentValues = new ContentValues();
/* 2770 */                                                  contentValues.put(str30, str32);
/* 2777 */                                                  contentValues.put("name", ii00010lll1Var4.I00000oOI);
/* 2788 */                                                  contentValues.put("timestamp", Long.valueOf(ii00010lll1Var4.I0000O));
/* 2795 */                                                  contentValues.put("metadata_fingerprint", Long.valueOf(jI01IiOO2));
/* 2800 */                                                  contentValues.put("data", bArrI00000oIO2);
/* 2809 */                                                  contentValues.put("realtime", Integer.valueOf(i));
/* 2820 */                                                  contentValues.put("elapsed_time", Long.valueOf(ii00010lll1Var4.I0000oI00));
                                                            try {
/* 2838 */                                                      if (iol1loo1ioI00i01iIIliI2.I01Io11IiiiO().insert(str7, null, contentValues) != -1) {
/* 2856 */                                                          ((l0olllO1i) iol1loo1ioI00i01iIIliI2.I00iOIl).I00II0oii1o().I00ilO0.I0000Il00O("Failed to insert raw event (got -1). appId", l01O0IO1ooO0.I010ioo(str32));
                                                                } else {
/* 2864 */                                                          lilool0.I00o0iI0io1 = 0L;
                                                                }
                                                            } catch (SQLiteException e2) {
/* 2885 */                                                      ((l0olllO1i) iol1loo1ioI00i01iIIliI2.I00iOIl).I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(ii00010lll1Var4.I00000oIO), "Error storing raw event. appId", e2);
                                                            }
                                                        } catch (SQLiteException e3) {
/* 2912 */                                                  ((l0olllO1i) iol1loo1ioI00i01iIIliI.I00iOIl).I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(l100ll0ooioo.I00111O()), "Error storing raw event metadata. appId", e3);
/* 2915 */                                                  throw e3;
                                                        }
                                                    } catch (IOException e4) {
/* 2932 */                                              lilool0.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(l0ooii1oooI00OilO00Il.I000oI1ioi()), "Data loss. Failed to insert raw event metadata. appId", e4);
                                                    }
/* 2939 */                                          lilool0.I00i01iIIliI().I01Io001O();
/* 2946 */                                          lilool0.I00i01iIIliI().I01Io1();
/* 2949 */                                          lilool0.I00Io1lO();
/* 2978 */                                          lilool0.I00II0oii1o().I00lll10.I0000Il00O("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
/* 2981 */                                          return;
                                                }
/* 1999 */                                      l0ooii1oooI00OilO00Il.I00111O((String) pairI010ioo.first);
/* 2002 */                                      Object obj2 = pairI010ioo.second;
/* 2004 */                                      if (obj2 != null) {
/* 2012 */                                          l0ooii1oooI00OilO00Il.I001IIilI0O(((Boolean) obj2).booleanValue());
                                                }
/* 2017 */                                      String str33 = str3;
/* 2023 */                                      if (!ii00010lll1Var.I00000oOI.equals(str33) && !((String) pairI010ioo.first).equals("00000000-0000-0000-0000-000000000000") && (l0iiiiI01Ol1o0 = I00i01iIIliI().I01Ol1o0(str18)) != null) {
/* 2049 */                                          l0o10OoO0 l0o10ooo05 = l0iiiiI01Ol1o0.I00000oIO.I00io1l;
/* 2051 */                                          l0olllO1i.I000II(l0o10ooo05);
/* 2054 */                                          l0o10ooo05.I010II();
/* 2059 */                                          if (l0iiiiI01Ol1o0.I001iOo1i0O) {
/* 2061 */                                              ii00010lll1Var2 = ii00010lll1Var;
/* 2065 */                                              I00100l0(str18, false, null, null);
/* 2070 */                                              Bundle bundle2 = new Bundle();
/* 2075 */                                              l0o10OoO0 l0o10ooo06 = l0iiiiI01Ol1o0.I00000oIO.I00io1l;
/* 2077 */                                              l0olllO1i.I000II(l0o10ooo06);
/* 2080 */                                              l0o10ooo06.I010II();
/* 2083 */                                              Long l = l0iiiiI01Ol1o0.I001l0I00;
/* 2085 */                                              if (l != null) {
/* 2091 */                                                  j = j9;
/* 2103 */                                                  bundle2.putLong("_pfo", Math.max(0L, l.longValue()));
                                                        } else {
/* 2112 */                                                  j = j9;
                                                        }
/* 2116 */                                              l0o10OoO0 l0o10ooo07 = l0iiiiI01Ol1o0.I00000oIO.I00io1l;
/* 2118 */                                              l0olllO1i.I000II(l0o10ooo07);
/* 2121 */                                              l0o10ooo07.I010II();
/* 2124 */                                              Long l2 = l0iiiiI01Ol1o0.I001lIiIIo1O;
/* 2126 */                                              if (l2 != null) {
/* 2134 */                                                  bundle2.putLong("_uwa", l2.longValue());
                                                        }
/* 2139 */                                              bundle2.putLong("_r", 1L);
/* 2142 */                                              i1il01.I00000oOI(str18, str33, bundle2);
                                                    }
/* 2154 */                                          l0olllo1i4.I000OiO().I010i10l();
/* 2157 */                                          String str272 = Build.MODEL;
/* 2159 */                                          l0ooii1oooI00OilO00Il.I000iOII();
/* 2166 */                                          l0olllo1i4.I000OiO().I010i10l();
/* 2169 */                                          String str282 = Build.VERSION.RELEASE;
/* 2171 */                                          l0ooii1oooI00OilO00Il.I0000Il00O();
/* 2178 */                                          ((l100ll0OOIoO) l0ooii1oooI00OilO00Il.I00iiI).I00l0I0l0lO1(str282);
/* 2190 */                                          l0ooii1oooI00OilO00Il.I000lI((int) l0olllo1i4.I000OiO().I010ioo());
/* 2201 */                                          l0ooii1oooI00OilO00Il.I000l1(l0olllo1i4.I000OiO().I010l10O());
/* 2208 */                                          l0ooii1oooI00OilO00Il.I00OI1(lli10ii.I00ol1);
/* 2215 */                                          if (l0olllo1i4.I00000oIO()) {
                                                    }
/* 2243 */                                          l0iiiiI01Ol1o02 = I00i01iIIliI().I01Ol1o0(str18);
/* 2247 */                                          if (l0iiiiI01Ol1o02 != null) {
                                                    }
/* 2354 */                                          if (l1ioio011ooI000OiO2.I000OOo1O(l1iioiool.ANALYTICS_STORAGE)) {
/* 2366 */                                              String strI00IO12 = l0iiiiI01Ol1o02.I00IO1();
/* 2370 */                                              lII0I0I000I.I000II(strI00IO12);
/* 2373 */                                              l0ooii1oooI00OilO00Il.I001IO000(strI00IO12);
                                                    }
/* 2384 */                                          if (!TextUtils.isEmpty(l0iiiiI01Ol1o02.I00Io1lO())) {
                                                    }
/* 2400 */                                          listI01O1lIi = lilool0.I00i01iIIliI().I01O1lIi(str18);
/* 2404 */                                          i3 = i2;
/* 2409 */                                          while (i3 < listI01O1lIi.size()) {
                                                    }
/* 2565 */                                          iol1loo1ioI00i01iIIliI = lilool0.I00i01iIIliI();
/* 2574 */                                          l100ll0OOIoO l100ll0ooioo2 = (l100ll0OOIoO) l0ooii1oooI00OilO00Il.I0000oI00();
/* 2576 */                                          iol1loo1ioI00i01iIIliI.I010II();
/* 2579 */                                          iol1loo1ioI00i01iIIliI.I010OIo1l();
/* 2586 */                                          lII0I0I000I.I0000O(l100ll0ooioo2.I00111O());
/* 2589 */                                          byte[] bArrI00000oIO3 = l100ll0ooioo2.I00000oIO();
/* 2599 */                                          long jI01IiOO22 = iol1loo1ioI00i01iIIliI.I00iiI.I00i0oil().I01IiOO(bArrI00000oIO3);
/* 2605 */                                          ContentValues contentValues22 = new ContentValues();
/* 2612 */                                          String str302 = str2;
/* 2614 */                                          contentValues22.put(str302, l100ll0ooioo2.I00111O());
/* 2623 */                                          contentValues22.put("metadata_fingerprint", Long.valueOf(jI01IiOO22));
/* 2628 */                                          contentValues22.put("metadata", bArrI00000oIO3);
/* 2639 */                                          iol1loo1ioI00i01iIIliI.I01Io11IiiiO().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
/* 2642 */                                          iol1loo1ioI00i01iIIliI2 = lilool0.I00i01iIIliI();
/* 2646 */                                          ii00010lll1 ii00010lll1Var42 = ii00010lll1Var2;
/* 2648 */                                          ii0il0lOolIo ii0il0loolio42 = ii00010lll1Var42.I000II;
/* 2650 */                                          Objects.requireNonNull(ii0il0loolio42);
/* 2659 */                                          it = ii0il0loolio42.I00iOIl.keySet().iterator();
                                                    while (true) {
/* 2667 */                                              if (it.hasNext()) {
                                                        }
                                                    }
/* 2740 */                                          iol1loo1ioI00i01iIIliI2.I010II();
/* 2743 */                                          iol1loo1ioI00i01iIIliI2.I010OIo1l();
/* 2746 */                                          String str322 = ii00010lll1Var42.I00000oIO;
/* 2748 */                                          lII0I0I000I.I0000O(str322);
/* 2761 */                                          byte[] bArrI00000oIO22 = iol1loo1ioI00i01iIIliI2.I00iiI.I00i0oil().I011lOIoo0l(ii00010lll1Var42).I00000oIO();
/* 2767 */                                          contentValues = new ContentValues();
/* 2770 */                                          contentValues.put(str302, str322);
/* 2777 */                                          contentValues.put("name", ii00010lll1Var42.I00000oOI);
/* 2788 */                                          contentValues.put("timestamp", Long.valueOf(ii00010lll1Var42.I0000O));
/* 2795 */                                          contentValues.put("metadata_fingerprint", Long.valueOf(jI01IiOO22));
/* 2800 */                                          contentValues.put("data", bArrI00000oIO22);
/* 2809 */                                          contentValues.put("realtime", Integer.valueOf(i));
/* 2820 */                                          contentValues.put("elapsed_time", Long.valueOf(ii00010lll1Var42.I0000oI00));
/* 2838 */                                          if (iol1loo1ioI00i01iIIliI2.I01Io11IiiiO().insert(str7, null, contentValues) != -1) {
                                                    }
/* 2939 */                                          lilool0.I00i01iIIliI().I01Io001O();
/* 2946 */                                          lilool0.I00i01iIIliI().I01Io1();
/* 2949 */                                          lilool0.I00Io1lO();
/* 2978 */                                          lilool0.I00II0oii1o().I00lll10.I0000Il00O("Background event processing time, ms", Long.valueOf(((System.nanoTime() - jNanoTime) + 500000) / 1000000));
/* 2981 */                                          return;
                                                }
                                            }
                                        } catch (Throwable th3) {
/* 2107 */                                  th = th3;
/* 2108 */                                  lilool0 = this;
                                        }
                                    }
                                }
/* 2986 */                      lilool0.I00i01iIIliI().I01Io1();
/* 3380 */                      throw th;
                            }
/* 972 */                   if (jIntValue % 1000 == 1) {
/* 992 */                       I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str12), "Data loss. Too many events logged. appId, count", Long.valueOf(ioii1iI01Olioli.I00000oOI));
                            }
/* 999 */                   I00i01iIIliI().I01Io001O();
/* 1490 */                  I00i01iIIliI().I01Io1();
                        }
/* 458 */               z = true;
                    }
/* 482 */           String strI0000oI00 = ii0il0loolio2.I0000oI00();
/* 7 */             str2 = "app_id";
/* 488 */           Bundle bundle3 = ii0il0loolio2.I00iOIl;
/* 494 */           if (z) {
/* 509 */               double dDoubleValue = ii0il0loolio2.I0000O().doubleValue() * 1000000.0d;
/* 515 */               if (dDoubleValue == 0.0d) {
/* 517 */                   z2 = z3;
/* 524 */                   dDoubleValue = bundle3.getLong("value") * 1000000.0d;
                        } else {
/* 527 */                   z2 = z3;
                        }
/* 533 */               if (dDoubleValue > 9.223372036854776E18d || dDoubleValue < -9.223372036854776E18d) {
/* 569 */                   I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str12), "Data lost. Currency value is too big. appId", Double.valueOf(dDoubleValue));
/* 576 */                   I00i01iIIliI().I01Io001O();
/* 1490 */                  I00i01iIIliI().I01Io1();
                        } else {
/* 541 */                   jRound = Math.round(dDoubleValue);
/* 549 */                   if ("refund".equals(str16)) {
/* 551 */                       jRound = -jRound;
                            }
                        }
                    } else {
/* 581 */               z2 = z3;
/* 583 */               jRound = bundle3.getLong("value");
                    }
/* 591 */           if (!TextUtils.isEmpty(strI0000oI00)) {
/* 595 */               String upperCase = strI0000oI00.toUpperCase(Locale.US);
/* 605 */               if (upperCase.matches("[A-Z]{3}")) {
/* 607 */                   String strConcat = "_ltv_".concat(upperCase);
/* 615 */                   lioOO0ioOI liooo0iooiI01O1I12 = I00i01iIIliI().I01O1I1(str12, strConcat);
/* 619 */                   if (liooo0iooiI01O1I12 != null) {
/* 621 */                       Object obj3 = liooo0iooiI01O1I12.I0000oI00;
/* 625 */                       if (obj3 instanceof Long) {
/* 653 */                           String str34 = ii0oooi0io0lI00000oOI.I00iiO;
/* 659 */                           I00IoO0().getClass();
/* 664 */                           long jCurrentTimeMillis = System.currentTimeMillis();
/* 670 */                           Long lValueOf = Long.valueOf(((Long) obj3).longValue() + jRound);
/* 674 */                           str4 = str16;
/* 9 */                             str3 = "_fx";
/* 678 */                           str5 = str13;
/* 680 */                           str6 = str;
/* 682 */                           l0olllo1i = l0olllo1i2;
/* 684 */                           ii0il0loolio = ii0il0loolio2;
/* 688 */                           liooo0iooi = new lioOO0ioOI(str12, str34, strConcat, jCurrentTimeMillis, lValueOf);
                                }
/* 785 */                       if (I00i01iIIliI().I01O10iIoo1O(liooo0iooi)) {
/* 809 */                           I00II0oii1o().I00ilO0.I0000oI00("Too many unique user properties are set. Ignoring user property. appId", l01O0IO1ooO0.I010ioo(str12), l0olllo1i.I00l0OO0IO.I0000Il00O(liooo0iooi.I0000Il00O), liooo0iooi.I0000oI00);
/* 812 */                           I00iIO();
/* 822 */                           lioil0ilIOi.I011Ill(i1il012, str12, 9, null, null, 0);
/* 825 */                           i1il01 = i1il012;
                                } else {
/* 827 */                           i1il01 = i1il012;
                                }
                            }
/* 9 */                     str3 = "_fx";
/* 629 */                   long j11 = jRound;
/* 631 */                   str4 = str16;
/* 633 */                   str5 = str13;
/* 635 */                   str6 = str;
/* 637 */                   l0olllo1i = l0olllo1i2;
/* 639 */                   ii0il0loolio = ii0il0loolio2;
/* 692 */                   iOl1lOo1IO iol1loo1ioI00i01iIIliI5 = I00i01iIIliI();
                            int iI010o0o0oO = I00Ol1ll1().I010o0o0oO(str12, iol1II1ii1i.I00OI1) - 1;
/* 708 */                   lII0I0I000I.I0000O(str12);
/* 711 */                   iol1loo1ioI00i01iIIliI5.I010II();
/* 714 */                   iol1loo1ioI00i01iIIliI5.I010OIo1l();
/* 731 */                   iol1loo1ioI00i01iIIliI5.I01Io11IiiiO().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str12, str12, String.valueOf(iI010o0o0oO)});
/* 757 */                   String str35 = ii0oooi0io0lI00000oOI.I00iiO;
/* 763 */                   I00IoO0().getClass();
/* 774 */                   liooo0iooi = new lioOO0ioOI(str12, str35, strConcat, System.currentTimeMillis(), Long.valueOf(j11));
/* 785 */                   if (I00i01iIIliI().I01O10iIoo1O(liooo0iooi)) {
                            }
                        }
/* 842 */               boolean zI01OOIlI2 = lioil0ilIOi.I01OOIlI(str4);
/* 846 */               String str172 = str4;
/* 848 */               boolean zEquals2 = str6.equals(str172);
/* 852 */               I00iIO();
/* 855 */               if (ii0il0loolio == null) {
                        }
/* 927 */               ii0il0lOolIo ii0il0loolio32 = ii0il0loolio;
/* 936 */               iOII1I ioii1iI01Olioli2 = I00i01iIIliI().I01Olioli(I00000oOI(), str12, length + 1, true, zI01OOIlI2, false, zEquals2, false, false, false);
/* 943 */               long j32 = ioii1iI01Olioli2.I00000oOI;
/* 945 */               I00Ol1ll1();
/* 962 */               jIntValue = j32 - ((Integer) iol1II1ii1i.I000l1.I00000oIO(null)).intValue();
/* 967 */               if (jIntValue <= 0) {
                        }
/* 1490 */              I00i01iIIliI().I01Io1();
                    }
/* 9 */             str3 = "_fx";
/* 832 */           str4 = str16;
/* 834 */           str5 = str13;
/* 836 */           i1il01 = i1il012;
/* 838 */           str6 = str;
/* 840 */           ii0il0loolio = ii0il0loolio2;
/* 842 */           boolean zI01OOIlI22 = lioil0ilIOi.I01OOIlI(str4);
/* 846 */           String str1722 = str4;
/* 848 */           boolean zEquals22 = str6.equals(str1722);
/* 852 */           I00iIO();
/* 855 */           if (ii0il0loolio == null) {
                    }
/* 927 */           ii0il0lOolIo ii0il0loolio322 = ii0il0loolio;
/* 936 */           iOII1I ioii1iI01Olioli22 = I00i01iIIliI().I01Olioli(I00000oOI(), str12, length + 1, true, zI01OOIlI22, false, zEquals22, false, false, false);
/* 943 */           long j322 = ioii1iI01Olioli22.I00000oOI;
/* 945 */           I00Ol1ll1();
/* 962 */           jIntValue = j322 - ((Integer) iol1II1ii1i.I000l1.I00000oIO(null)).intValue();
/* 967 */           if (jIntValue <= 0) {
                    }
/* 1490 */          I00i01iIIliI().I01Io1();
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I000O01llI0(l0IIii l0iiii, l0ooIi1oOO l0ooii1ooo) throws Throwable {
                    int i;
                    i0O1lIi1O0IO i0o1lii1o0io;
                    l1IOl1iI00l l1iol1ii00l;
                    String str;
                    iIloio1i iiloio1i;
/* 9 */             I00iOIl().I010II();
/* 12 */            I00iIi0i1o();
/* 19 */            String strI00oOio10iI1 = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00oOio10iI1();
/* 27 */            EnumMap enumMap = new EnumMap(l1iioiool.class);
/* 30 */            int length = strI00oOio10iI1.length();
/* 38 */            int length2 = l1iioiool.values().length;
/* 39 */            iIloio1i iiloio1i2 = iIloio1i.UNSET;
/* 41 */            int i2 = 0;
/* 42 */            if (length < length2 || strI00oOio10iI1.charAt(0) != '1') {
/* 52 */                i = 0;
/* 129 */               i0o1lii1o0io = new i0O1lIi1O0IO();
                    } else {
/* 54 */                l1iioiool[] l1iioioolVarArrValues = l1iioiool.values();
/* 58 */                int length3 = l1iioioolVarArrValues.length;
/* 59 */                int i3 = 0;
/* 60 */                int i4 = 1;
/* 61 */                while (i3 < length3) {
/* 63 */                    l1iioiool l1iioioolVar = l1iioioolVarArrValues[i3];
/* 65 */                    int i5 = i4 + 1;
/* 67 */                    char cCharAt = strI00oOio10iI1.charAt(i4);
/* 71 */                    iIloio1i[] iiloio1iArrValues = iIloio1i.values();
/* 75 */                    int length4 = iiloio1iArrValues.length;
/* 76 */                    int i6 = i2;
                            while (true) {
/* 77 */                        if (i6 >= length4) {
/* 94 */                            str = strI00oOio10iI1;
/* 96 */                            iiloio1i = iiloio1i2;
                                    break;
                                }
/* 79 */                        iiloio1i = iiloio1iArrValues[i6];
/* 81 */                        str = strI00oOio10iI1;
/* 85 */                        if (iiloio1i.I00iOIl == cCharAt) {
                                    break;
                                }
/* 88 */                        i6++;
/* 90 */                        strI00oOio10iI1 = str;
                            }
/* 97 */                    enumMap.put((EnumMap) l1iioioolVar, (l1iioiool) iiloio1i);
/* 100 */                   i3++;
/* 102 */                   i4 = i5;
/* 103 */                   strI00oOio10iI1 = str;
/* 105 */                   i2 = 0;
                        }
/* 109 */               i = 0;
/* 110 */               i0o1lii1o0io = new i0O1lIi1O0IO((boolean) (0 == true ? 1 : 0));
/* 115 */               EnumMap enumMap2 = new EnumMap(l1iioiool.class);
/* 118 */               i0o1lii1o0io.I00iiI = enumMap2;
/* 120 */               enumMap2.putAll(enumMap);
/* 123 */               VarHandle.storeStoreFence();
                    }
/* 132 */           String strI00II0oii1o = l0iiii.I00II0oii1o();
/* 140 */           I00iOIl().I010II();
/* 143 */           I00iIi0i1o();
/* 146 */           l1ioIO011Oo l1ioio011ooI00000oIO = I00000oIO(strI00II0oii1o);
/* 150 */           EnumMap enumMap3 = l1ioio011ooI00000oIO.I00000oIO;
/* 152 */           l1iioiool l1iioioolVar2 = l1iioiool.AD_STORAGE;
/* 158 */           l1iIoO01 l1iioo01 = (l1iIoO01) enumMap3.get(l1iioioolVar2);
/* 160 */           l1iIoO01 l1iioo012 = l1iIoO01.UNINITIALIZED;
/* 162 */           if (l1iioo01 == null) {
/* 164 */               l1iioo01 = l1iioo012;
                    }
/* 165 */           int i7 = l1ioio011ooI00000oIO.I00000oOI;
/* 167 */           int iOrdinal = l1iioo01.ordinal();
/* 171 */           iIloio1i iiloio1i3 = iIloio1i.REMOTE_ENFORCED_DEFAULT;
/* 173 */           iIloio1i iiloio1i4 = iIloio1i.FAILSAFE;
/* 178 */           if (iOrdinal == 1) {
/* 192 */               i0o1lii1o0io.I000O01llI0(l1iioioolVar2, iiloio1i3);
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
/* 188 */               i0o1lii1o0io.I0000oI00(l1iioioolVar2, i7);
                    } else {
/* 184 */               i0o1lii1o0io.I000O01llI0(l1iioioolVar2, iiloio1i4);
                    }
/* 195 */           l1iioiool l1iioioolVar3 = l1iioiool.ANALYTICS_STORAGE;
/* 201 */           l1iIoO01 l1iioo013 = (l1iIoO01) enumMap3.get(l1iioioolVar3);
/* 203 */           if (l1iioo013 != null) {
/* 206 */               l1iioo012 = l1iioo013;
                    }
/* 207 */           int iOrdinal2 = l1iioo012.ordinal();
/* 212 */           if (iOrdinal2 == 1) {
/* 226 */               i0o1lii1o0io.I000O01llI0(l1iioioolVar3, iiloio1i3);
                    } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
/* 222 */               i0o1lii1o0io.I0000oI00(l1iioioolVar3, i7);
                    } else {
/* 218 */               i0o1lii1o0io.I000O01llI0(l1iioioolVar3, iiloio1i4);
                    }
/* 229 */           String strI00II0oii1o2 = l0iiii.I00II0oii1o();
/* 237 */           I00iOIl().I010II();
/* 240 */           I00iIi0i1o();
/* 251 */           iOoOIi0i ioooii0iI00io1l = I00io1l(strI00II0oii1o2, I00ilI0I1(strI00II0oii1o2), I00000oIO(strI00II0oii1o2), i0o1lii1o0io);
/* 255 */           String str2 = ioooii0iI00io1l.I0000O;
/* 257 */           Boolean bool = ioooii0iI00io1l.I0000Il00O;
/* 259 */           lII0I0I000I.I000II(bool);
/* 262 */           boolean zBooleanValue = bool.booleanValue();
/* 266 */           l0ooii1ooo.I0000Il00O();
/* 273 */           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I011IOil(zBooleanValue);
/* 280 */           if (!TextUtils.isEmpty(str2)) {
/* 282 */               l0ooii1ooo.I0000Il00O();
/* 289 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I011Ill(str2);
                    }
/* 296 */           I00iOIl().I010II();
/* 299 */           I00iIi0i1o();
/* 314 */           Iterator it = Collections.unmodifiableList(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Olioli()).iterator();
                    while (true) {
/* 324 */               if (it.hasNext()) {
/* 330 */                   l1iol1ii00l = (l1IOl1iI00l) it.next();
/* 340 */                   if ("_npa".equals(l1iol1ii00l.I001IO000())) {
                                break;
                            }
                        } else {
/* 343 */                   l1iol1ii00l = null;
                            break;
                        }
                    }
/* 344 */           if (l1iol1ii00l != null) {
/* 348 */               EnumMap enumMap4 = (EnumMap) i0o1lii1o0io.I00iiI;
/* 350 */               l1iioiool l1iioioolVar4 = l1iioiool.AD_PERSONALIZATION;
/* 356 */               iIloio1i iiloio1i5 = (iIloio1i) enumMap4.get(l1iioioolVar4);
/* 358 */               if (iiloio1i5 == null) {
/* 360 */                   iiloio1i5 = iiloio1i2;
                        }
/* 361 */               if (iiloio1i5 == iiloio1i2) {
/* 365 */                   iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 367 */                   I00O0o1oo(iol1loo1io);
/* 374 */                   lioOO0ioOI liooo0iooiI01O1I1 = iol1loo1io.I01O1I1(l0iiii.I00II0oii1o(), "_npa");
/* 378 */                   iIloio1i iiloio1i6 = iIloio1i.MANIFEST;
/* 380 */                   iIloio1i iiloio1i7 = iIloio1i.API;
/* 382 */                   if (liooo0iooiI01O1I1 != null) {
/* 384 */                       String str3 = liooo0iooiI01O1I1.I00000oOI;
/* 392 */                       if ("tcf".equals(str3)) {
/* 396 */                           i0o1lii1o0io.I000O01llI0(l1iioioolVar4, iIloio1i.TCF);
                                } else if ("app".equals(str3)) {
/* 409 */                           i0o1lii1o0io.I000O01llI0(l1iioioolVar4, iiloio1i7);
                                } else {
/* 414 */                           i0o1lii1o0io.I000O01llI0(l1iioioolVar4, iiloio1i6);
                                }
                            } else {
/* 419 */                       Boolean boolI001i1lo1io = l0iiii.I001i1lo1io();
/* 423 */                       if (boolI001i1lo1io == null || ((boolI001i1lo1io.booleanValue() && l1iol1ii00l.I001l0I00() != 1) || !(boolI001i1lo1io.booleanValue() || l1iol1ii00l.I001l0I00() == 0))) {
/* 462 */                           i0o1lii1o0io.I000O01llI0(l1iioioolVar4, iiloio1i7);
                                } else {
/* 458 */                           i0o1lii1o0io.I000O01llI0(l1iioioolVar4, iiloio1i6);
                                }
                            }
                        }
                    } else {
/* 470 */               int iI001lllioOl = I001lllioOl(l0iiii.I00II0oii1o(), i0o1lii1o0io);
/* 474 */               l1IIIIIl1iIO l1iiiiil1iioI00II0oii1o = l1IOl1iI00l.I00II0oii1o();
/* 478 */               l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 485 */               ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IO1oi11O("_npa");
/* 492 */               I00IoO0().getClass();
/* 495 */               long jCurrentTimeMillis = System.currentTimeMillis();
/* 499 */               l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 506 */               ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IO1(jCurrentTimeMillis);
/* 510 */               l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 517 */               ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IlilI0i0i(iI001lllioOl);
/* 524 */               l1IOl1iI00l l1iol1ii00l2 = (l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I0000oI00();
/* 526 */               l0ooii1ooo.I0000Il00O();
/* 533 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00i0oil(l1iol1ii00l2);
/* 550 */               I00II0oii1o().I00lll10.I0000O("non_personalized_ads(_npa)", "Setting user property", Integer.valueOf(iI001lllioOl));
                    }
/* 553 */           String string = i0o1lii1o0io.toString();
/* 557 */           l0ooii1ooo.I0000Il00O();
/* 564 */           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I011IO1I11OI(string);
/* 567 */           String strI00II0oii1o3 = l0iiii.I00II0oii1o();
/* 571 */           l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 573 */           l0l1ol11Var.I010II();
/* 576 */           l0l1ol11Var.I010l1O(strI00II0oii1o3);
/* 579 */           iooOiIloili ioooiiloiliI011iO = l0l1ol11Var.I011iO(strI00II0oii1o3);
/* 601 */           boolean z = (ioooiiloiliI011iO == null || !ioooiiloiliI011iO.I001i1O0Ol() || ioooiiloiliI011iO.I001i1lo1io()) ? true : i;
/* 602 */           List listI00OIl = l0ooii1ooo.I00OIl();
/* 611 */           for (int i8 = i; i8 < listI00OIl.size(); i8++) {
/* 629 */               if ("_tcf".equals(((l0l1iIIOl) listI00OIl.get(i8)).I001iOo1i0O())) {
/* 641 */                   l0l0O000 l0l0o000 = (l0l0O000) ((l0l1iIIOl) listI00OIl.get(i8)).I000OiO();
/* 643 */                   List listI000O01llI0 = l0l0o000.I000O01llI0();
/* 647 */                   int i9 = i;
                            while (true) {
/* 652 */                       if (i9 >= listI000O01llI0.size()) {
                                    break;
                                }
/* 670 */                       if ("_tcfd".equals(((l0lliIlIO) listI000O01llI0.get(i9)).I001IIilI0O())) {
/* 678 */                           String strI001i1O0Ol = ((l0lliIlIO) listI000O01llI0.get(i9)).I001i1O0Ol();
/* 682 */                           if (z && strI001i1O0Ol.length() > 4) {
/* 692 */                               char[] charArray = strI001i1O0Ol.toCharArray();
/* 696 */                               int i10 = 1;
                                        while (true) {
/* 701 */                                   if (i10 >= 64) {
/* 717 */                                       i10 = i;
                                                break;
                                            } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10)) {
                                                break;
                                            } else {
/* 714 */                                       i10++;
                                            }
                                        }
/* 725 */                               charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
/* 727 */                               strI001i1O0Ol = String.valueOf(charArray);
                                    }
/* 731 */                           l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
/* 735 */                           l0loooo1ioiI00IO1.I000O01llI0("_tcfd");
/* 738 */                           l0loooo1ioiI00IO1.I000OOo1O(strI001i1O0Ol);
/* 741 */                           l0l0o000.I0000Il00O();
/* 754 */                           ((l0l1iIIOl) l0l0o000.I00iiI).I00Io1lO(i9, (l0lliIlIO) l0loooo1ioiI00IO1.I0000oI00());
                                } else {
/* 760 */                           i9++;
                                }
                            }
/* 763 */                   l0ooii1ooo.I00OOll1(i8, l0l0o000);
/* 766 */                   return;
                        }
                    }
                }

                public final void I000OOo1O(l0IIii l0iiii, l0ooIi1oOO l0ooii1ooo) {
                    Serializable serializableI011Ill;
/* 11 */            I00iOIl().I010II();
/* 14 */            I00iIi0i1o();
/* 17 */            l0I0I1 l0i0i1I00OilO00Il = l0IiI1o01I1o.I00OilO00Il();
/* 21 */            l0olllO1i l0olllo1i = l0iiii.I00000oIO;
/* 23 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 25 */            l0olllO1i.I000II(l0o10ooo0);
/* 28 */            l0o10ooo0.I010II();
/* 31 */            byte[] bArr = l0iiii.I00IOO;
/* 33 */            if (bArr != null) {
                        try {
/* 39 */                    l0i0i1I00OilO00Il = (l0I0I1) lio010i.I01IlIoOI(l0i0i1I00OilO00Il, bArr);
                        } catch (iI00lI unused) {
/* 59 */                    I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Failed to parse locally stored ad campaign info. appId", l01O0IO1ooO0.I010ioo(l0iiii.I00II0oii1o()));
                        }
                    }
/* 66 */            Iterator it = l0ooii1ooo.I00OIl().iterator();
/* 79 */            while (it.hasNext()) {
/* 85 */                l0l1iIIOl l0l1iiiol = (l0l1iIIOl) it.next();
/* 95 */                if (l0l1iiiol.I001iOo1i0O().equals("_cmp")) {
/* 99 */                    l0lliIlIO l0lliilioI010oio1OO0 = lio010i.I010oio1OO0("gclid", l0l1iiiol);
/* 107 */                   Serializable serializableI011Ill2 = l0lliilioI010oio1OO0 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO0);
/* 113 */                   if (serializableI011Ill2 == null) {
/* 111 */                       serializableI011Ill2 = "";
                            }
/* 116 */                   String str = (String) serializableI011Ill2;
/* 120 */                   l0lliIlIO l0lliilioI010oio1OO02 = lio010i.I010oio1OO0("gbraid", l0l1iiiol);
/* 128 */                   Serializable serializableI011Ill3 = l0lliilioI010oio1OO02 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO02);
/* 132 */                   if (serializableI011Ill3 == null) {
/* 111 */                       serializableI011Ill3 = "";
                            }
/* 135 */                   String str2 = (String) serializableI011Ill3;
/* 139 */                   l0lliIlIO l0lliilioI010oio1OO03 = lio010i.I010oio1OO0("gad_source", l0l1iiiol);
/* 147 */                   Serializable serializableI011Ill4 = l0lliilioI010oio1OO03 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO03);
/* 151 */                   if (serializableI011Ill4 == null) {
/* 111 */                       serializableI011Ill4 = "";
                            }
/* 154 */                   String str3 = (String) serializableI011Ill4;
/* 156 */                   l0lliIlIO l0lliilioI010oio1OO04 = lio010i.I010oio1OO0("deep_link_url", l0l1iiiol);
/* 164 */                   Object objI011Ill = l0lliilioI010oio1OO04 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO04);
/* 172 */                   String str4 = (String) (objI011Ill != null ? objI011Ill : "");
/* 184 */                   String[] strArrSplit = ((String) iol1II1ii1i.I010o0o0oO.I00000oIO(null)).split(",");
/* 188 */                   I00i0oil();
/* 193 */                   HashMap map = new HashMap();
/* 208 */                   for (l0lliIlIO l0lliilio : l0l1iiiol.I001IO000()) {
/* 220 */                       Iterator it2 = it;
/* 230 */                       if (Arrays.asList(strArrSplit).contains(l0lliilio.I001IIilI0O()) && (serializableI011Ill = lio010i.I011Ill(l0lliilio)) != null) {
/* 242 */                           map.put(l0lliilio.I001IIilI0O(), serializableI011Ill);
                                }
/* 245 */                       it = it2;
                            }
/* 249 */                   Iterator it3 = it;
/* 255 */                   if (!map.isEmpty()) {
/* 265 */                       l0lliIlIO l0lliilioI010oio1OO05 = lio010i.I010oio1OO0("click_timestamp", l0l1iiiol);
/* 273 */                       Object objI011Ill2 = l0lliilioI010oio1OO05 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO05);
/* 283 */                       long jLongValue = ((Long) (objI011Ill2 != null ? objI011Ill2 : 0L)).longValue();
/* 289 */                       if (jLongValue <= 0) {
/* 291 */                           jLongValue = l0l1iiiol.I001lIiIIo1O();
                                }
/* 295 */                       long j = jLongValue;
/* 299 */                       l0lliIlIO l0lliilioI010oio1OO06 = lio010i.I010oio1OO0("_cis", l0l1iiiol);
/* 317 */                       if ("referrer API v2".equals(l0lliilioI010oio1OO06 == null ? null : lio010i.I011Ill(l0lliilioI010oio1OO06))) {
/* 329 */                           if (j > ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00OIl()) {
/* 335 */                               if (str.isEmpty()) {
/* 337 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 344 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001i1O0Ol();
                                        } else {
/* 348 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 355 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001IO000(str);
                                        }
/* 362 */                               if (str2.isEmpty()) {
/* 364 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 371 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001iOo1i0O();
                                        } else {
/* 375 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 382 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001i1lo1io(str2);
                                        }
/* 389 */                               if (str3.isEmpty()) {
/* 391 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 398 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001lIiIIo1O();
                                        } else {
/* 402 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 409 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001l0I00(str3);
                                        }
/* 412 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 419 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001lllioOl(j);
/* 422 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 433 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00II0Ol1O0l().clear();
/* 436 */                               HashMap mapI001lloI = I001lloI(l0l1iiiol);
/* 440 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 451 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00II0Ol1O0l().putAll(mapI001lloI);
                                    }
                                } else if (j > ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00IoO0()) {
/* 474 */                           if (str.isEmpty()) {
/* 476 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 483 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00Ol10();
                                    } else {
/* 487 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 494 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00Ol00(str);
                                    }
/* 501 */                           if (str2.isEmpty()) {
/* 503 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 510 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00OloOo();
                                    } else {
/* 514 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 521 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00Ol1ll1(str2);
                                    }
/* 528 */                           if (str3.isEmpty()) {
/* 530 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 537 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00111O();
                                    } else {
/* 541 */                               l0i0i1I00OilO00Il.I0000Il00O();
/* 548 */                               ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00i01iIIliI(str3);
                                    }
/* 562 */                           if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010lI0oi)) {
/* 568 */                               if (str4.isEmpty()) {
/* 570 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 577 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00IO1();
                                        } else {
/* 581 */                                   l0i0i1I00OilO00Il.I0000Il00O();
/* 588 */                                   ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I00II0oii1o(str4);
                                        }
                                    }
/* 591 */                           l0i0i1I00OilO00Il.I0000Il00O();
/* 598 */                           ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001IIilI0O(j);
/* 601 */                           l0i0i1I00OilO00Il.I0000Il00O();
/* 612 */                           ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001lloI().clear();
/* 615 */                           HashMap mapI001lloI2 = I001lloI(l0l1iiiol);
/* 619 */                           l0i0i1I00OilO00Il.I0000Il00O();
/* 630 */                           ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I00iiI).I001lloI().putAll(mapI001lloI2);
                                }
                            }
/* 454 */                   it = it3;
                        }
                    }
/* 649 */           if (!((l0IiI1o01I1o) l0i0i1I00OilO00Il.I0000oI00()).equals(l0IiI1o01I1o.I00Oio())) {
/* 655 */               l0IiI1o01I1o l0iii1o01i1o = (l0IiI1o01I1o) l0i0i1I00OilO00Il.I0000oI00();
/* 657 */               l0ooii1ooo.I0000Il00O();
/* 664 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I011iO(l0iii1o01i1o);
                    }
/* 673 */           byte[] bArrI00000oIO = ((l0IiI1o01I1o) l0i0i1I00OilO00Il.I0000oI00()).I00000oIO();
/* 677 */           l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 679 */           l0olllO1i.I000II(l0o10ooo02);
/* 682 */           l0o10ooo02.I010II();
                    l0iiii.I00O0o1oo |= l0iiii.I00IOO != bArrI00000oIO;
/* 698 */           l0iiii.I00IOO = bArrI00000oIO;
/* 704 */           if (l0iiii.I000oI1ioi()) {
/* 706 */               iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 708 */               I00O0o1oo(iol1loo1io);
/* 711 */               iol1loo1io.I01OlIoIl(l0iiii, false);
                    }
/* 725 */           if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010lI0oi)) {
/* 732 */               for (int i = 0; i < l0ooii1ooo.I00OIo(); i++) {
/* 738 */                   l0l1iIIOl l0l1iiiolI01OlOoii0 = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01OlOoii0(i);
/* 750 */                   if ("_cmp".equals(l0l1iiiolI01OlOoii0.I001iOo1i0O())) {
/* 757 */                       l0l0O000 l0l0o000 = (l0l0O000) l0l1iiiolI01OlOoii0.I000OiO();
/* 759 */                       List listI000O01llI0 = l0l0o000.I000O01llI0();
/* 763 */                       int i2 = 0;
                                while (true) {
/* 768 */                           if (i2 >= listI000O01llI0.size()) {
                                        break;
                                    }
/* 784 */                           if ("deep_link_url".equals(((l0lliIlIO) listI000O01llI0.get(i2)).I001IIilI0O())) {
/* 786 */                               l0l0o000.I000lI(i2);
/* 789 */                               l0ooii1ooo.I00OOll1(i, l0l0o000);
                                        break;
                                    }
/* 793 */                           i2++;
                                }
                            }
                        }
                    }
/* 810 */           if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010l1ol111)) {
/* 812 */               iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 814 */               I00O0o1oo(iol1loo1io2);
/* 823 */               iol1loo1io2.I01Iol(l0iiii.I00II0oii1o(), "_lgclid");
                    }
                }

                public final String I000OiO(l1ioIO011Oo l1ioio011oo) {
/* 7 */             if (!l1ioio011oo.I000OOo1O(l1iioiool.ANALYTICS_STORAGE)) {
/* 43 */                return null;
                    }
/* 11 */            byte[] bArr = new byte[16];
/* 21 */            I00iIO().I01OO1I().nextBytes(bArr);
/* 38 */            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
                }

                public final void I000iOII(ArrayList arrayList) {
/* 7 */             lII0I0I000I.I00000oOI(!arrayList.isEmpty());
/* 12 */            if (this.I00oli != null) {
/* 22 */                I00II0oii1o().I00ilO0.I00000oOI("Set uploading progress before finishing the previous upload");
                    } else {
/* 31 */                this.I00oli = new ArrayList(arrayList);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:73:0x01ab A[Catch: all -> 0x0028, TryCatch #4 {all -> 0x0028, blocks: (B:3:0x000e, B:5:0x001b, B:8:0x002b, B:10:0x0031, B:11:0x003e, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:17:0x0063, B:19:0x006e, B:20:0x007e, B:22:0x00a8, B:24:0x00ae, B:25:0x00b1, B:27:0x00ca, B:28:0x00df, B:30:0x00f0, B:32:0x00f6, B:35:0x010b, B:45:0x012a, B:47:0x012f, B:48:0x0132, B:49:0x0133, B:50:0x0138, B:55:0x017d, B:71:0x01a5, B:73:0x01ab, B:75:0x01b6, B:79:0x01c1, B:80:0x01c4, B:33:0x00fb, B:37:0x010f, B:42:0x0117), top: B:91:0x000e, inners: #1 }] */
                /* JADX WARN: Type inference failed for: r11v0, types: [lilOOl0] */
                /* JADX WARN: Type inference failed for: r1v12, types: [long] */
                /* JADX WARN: Type inference failed for: r1v13 */
                /* JADX WARN: Type inference failed for: r1v17 */
                /* JADX WARN: Type inference failed for: r1v18 */
                /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000l1() {
                    iOl1lOo1IO iol1loo1io;
                    long jLongValue;
                    SQLiteException e;
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 12 */            this.I00oOio10iI1 = true;
                    try {
/* 15 */                l0olllO1i l0olllo1i = this.I00ll1;
/* 17 */                l0olllo1i.getClass();
/* 24 */                Boolean bool = l0olllo1i.I000OOo1O().I00ilI0I1;
/* 26 */                if (bool == null) {
/* 36 */                    I00II0oii1o().I00l0I0l0lO1.I00000oOI("Upload data called on the client side before use of service was decided");
                        } else if (bool.booleanValue()) {
/* 58 */                    I00II0oii1o().I00ilO0.I00000oOI("Upload called in the client side when service should be used");
                        } else if (this.I00o0iI0io1 > 0) {
/* 71 */                    I00Io1lO();
                        } else {
/* 80 */                    I00iOIl().I010II();
/* 85 */                    if (this.I00oli != null) {
/* 95 */                        I00II0oii1o().I00lll10.I00000oOI("Uploading requested multiple times");
                            } else {
/* 100 */                       l0I1IOo l0i1ioo = this.I00iiI;
/* 102 */                       I00O0o1oo(l0i1ioo);
/* 109 */                       if (l0i1ioo.I010ioo()) {
/* 131 */                           I00IoO0().getClass();
/* 134 */                           ?? CurrentTimeMillis = System.currentTimeMillis();
/* 144 */                           Cursor cursor = null;
/* 144 */                           cursorRawQuery = null;
/* 144 */                           Cursor cursorRawQuery = null;
/* 144 */                           string = null;
/* 144 */                           string = null;
/* 144 */                           String string = null;
/* 145 */                           int iI010o0o0oO = I00Ol1ll1().I010o0o0oO(null, iol1II1ii1i.I00i0oil);
/* 149 */                           I00Ol1ll1();
/* 164 */                           long jLongValue2 = CurrentTimeMillis - ((Long) iol1II1ii1i.I0000oI00.I00000oIO(null)).longValue();
/* 167 */                           for (int i = 0; i < iI010o0o0oO && I00IO1(jLongValue2, null); i++) {
                                    }
/* 178 */                           iIO0ooOool.I00000oIO();
/* 185 */                           I00iOIl().I010II();
/* 188 */                           I00II0Ol1O0l();
/* 195 */                           long jI00000oIO = this.I00l0I0l0lO1.I00ioIO.I00000oIO();
/* 201 */                           if (jI00000oIO != 0) {
/* 221 */                               I00II0oii1o().I00lli11.I0000Il00O("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(CurrentTimeMillis - jI00000oIO)));
                                    }
/* 224 */                           iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 226 */                           I00O0o1oo(iol1loo1io2);
/* 229 */                           String strI010lI0oi = iol1loo1io2.I010lI0oi();
/* 237 */                           long j = -1;
/* 239 */                           if (TextUtils.isEmpty(strI010lI0oi)) {
                                        try {
/* 313 */                                   this.I00oo1iO0ll = -1L;
/* 315 */                                   iol1loo1io = this.I00iiO;
/* 317 */                                   I00O0o1oo(iol1loo1io);
/* 320 */                                   I00Ol1ll1();
/* 335 */                                   jLongValue = CurrentTimeMillis - ((Long) iol1II1ii1i.I0000oI00.I00000oIO(null)).longValue();
/* 336 */                                   iol1loo1io.I010II();
/* 339 */                                   iol1loo1io.I010OIo1l();
                                        } catch (Throwable th) {
/* 386 */                                   th = th;
/* 395 */                                   cursor = CurrentTimeMillis;
                                        }
                                        try {
/* 356 */                                   CurrentTimeMillis = iol1loo1io.I01Io11IiiiO().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jLongValue)});
                                            try {
/* 364 */                                       if (CurrentTimeMillis.moveToFirst()) {
/* 390 */                                           string = CurrentTimeMillis.getString(0);
                                                } else {
/* 370 */                                           l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) iol1loo1io.I00iOIl).I00ilO0;
/* 372 */                                           l0olllO1i.I000II(l01o0io1ooo0);
/* 379 */                                           l01o0io1ooo0.I00lll10.I00000oOI("No expired configs for apps with pending events");
                                                }
                                            } catch (SQLiteException e2) {
/* 388 */                                       e = e2;
/* 407 */                                       l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) iol1loo1io.I00iOIl).I00ilO0;
/* 409 */                                       l0olllO1i.I000II(l01o0io1ooo02);
/* 416 */                                       l01o0io1ooo02.I00ilO0.I0000Il00O("Error selecting expired configs", e);
/* 419 */                                       if (CurrentTimeMillis != 0) {
/* 382 */                                           CurrentTimeMillis.close();
                                                }
/* 426 */                                       if (!TextUtils.isEmpty(string)) {
                                                }
/* 442 */                                       this.I00oOio10iI1 = false;
/* 444 */                                       I00Io1o110i();
                                            }
                                        } catch (SQLiteException e3) {
/* 401 */                                   e = e3;
/* 402 */                                   CurrentTimeMillis = 0;
                                        } catch (Throwable th2) {
/* 398 */                                   th = th2;
/* 453 */                                   throw th;
                                        }
/* 382 */                               CurrentTimeMillis.close();
/* 426 */                               if (!TextUtils.isEmpty(string)) {
/* 428 */                                   iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 430 */                                   I00O0o1oo(iol1loo1io3);
/* 433 */                                   l0IIii l0iiiiI01Ol1o0 = iol1loo1io3.I01Ol1o0(string);
/* 437 */                                   if (l0iiiiI01Ol1o0 != null) {
/* 439 */                                       I001IO000(l0iiiiI01Ol1o0);
                                            }
                                        }
                                    } else {
/* 245 */                               if (this.I00oo1iO0ll == -1) {
/* 247 */                                   iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 249 */                                   I00O0o1oo(iol1loo1io4);
                                            try {
                                                try {
/* 258 */                                           cursorRawQuery = iol1loo1io4.I01Io11IiiiO().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
/* 266 */                                           if (cursorRawQuery.moveToFirst()) {
/* 272 */                                               j = cursorRawQuery.getLong(0);
                                                    }
                                                } finally {
/* 302 */                                           if (cursorRawQuery != null) {
/* 304 */                                               cursorRawQuery.close();
                                                    }
                                                }
                                            } catch (SQLiteException e4) {
/* 284 */                                       l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) iol1loo1io4.I00iOIl).I00ilO0;
/* 286 */                                       l0olllO1i.I000II(l01o0io1ooo03);
/* 293 */                                       l01o0io1ooo03.I00ilO0.I0000Il00O("Error querying raw events", e4);
/* 296 */                                       if (cursorRawQuery != null) {
                                                }
                                            }
/* 268 */                                   cursorRawQuery.close();
/* 299 */                                   this.I00oo1iO0ll = j;
                                        }
/* 308 */                               I000lI(CurrentTimeMillis, strI010lI0oi);
                                    }
                                } else {
/* 119 */                           I00II0oii1o().I00lll10.I00000oOI("Network not connected, ignoring upload request");
/* 122 */                           I00Io1lO();
                                }
                            }
                        }
/* 442 */               this.I00oOio10iI1 = false;
/* 444 */               I00Io1o110i();
                    } catch (Throwable th3) {
/* 454 */               this.I00oOio10iI1 = false;
/* 456 */               I00Io1o110i();
/* 743 */               throw th3;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:113:0x0229  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[PHI: r0 r11 r23 r24
                  0x006f: PHI (r0v114 java.util.List) = (r0v8 java.util.List), (r0v136 java.util.List) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
                  0x006f: PHI (r11v75 android.database.Cursor) = (r11v5 android.database.Cursor), (r11v77 android.database.Cursor) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
                  0x006f: PHI (r23v18 java.lang.String) = (r23v36 java.lang.String), (r23v37 java.lang.String) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]
                  0x006f: PHI (r24v19 long) = (r24v2 long), (r24v20 long) binds: [B:108:0x021d, B:16:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:187:0x0489  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x0497  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x057d  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x0598  */
                /* JADX WARN: Removed duplicated region for block: B:251:0x05ee  */
                /* JADX WARN: Removed duplicated region for block: B:254:0x060a  */
                /* JADX WARN: Removed duplicated region for block: B:257:0x0616  */
                /* JADX WARN: Removed duplicated region for block: B:261:0x0645  */
                /* JADX WARN: Removed duplicated region for block: B:305:0x07a2  */
                /* JADX WARN: Removed duplicated region for block: B:315:0x07f4  */
                /* JADX WARN: Removed duplicated region for block: B:317:0x0803  */
                /* JADX WARN: Removed duplicated region for block: B:329:0x0836  */
                /* JADX WARN: Removed duplicated region for block: B:335:0x0866  */
                /* JADX WARN: Removed duplicated region for block: B:338:0x087e  */
                /* JADX WARN: Removed duplicated region for block: B:342:0x0894 A[LOOP:7: B:340:0x088e->B:342:0x0894, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:345:0x08d2  */
                /* JADX WARN: Removed duplicated region for block: B:346:0x08d5  */
                /* JADX WARN: Removed duplicated region for block: B:349:0x08ea  */
                /* JADX WARN: Removed duplicated region for block: B:365:0x09e4  */
                /* JADX WARN: Removed duplicated region for block: B:373:0x0a65  */
                /* JADX WARN: Removed duplicated region for block: B:436:0x07e8 A[EDGE_INSN: B:436:0x07e8->B:313:0x07e8 BREAK  A[LOOP:4: B:259:0x0641->B:312:0x07da], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:438:0x07da A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:446:0x084b A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:473:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:476:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r11v2 */
                /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
                /* JADX WARN: Type inference failed for: r11v78 */
                /* JADX WARN: Type inference failed for: r14v13, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r14v14 */
                /* JADX WARN: Type inference failed for: r14v15 */
                /* JADX WARN: Type inference failed for: r23v0 */
                /* JADX WARN: Type inference failed for: r23v1 */
                /* JADX WARN: Type inference failed for: r23v19 */
                /* JADX WARN: Type inference failed for: r23v2, types: [l0olllO1i] */
                /* JADX WARN: Type inference failed for: r23v21 */
                /* JADX WARN: Type inference failed for: r23v23 */
                /* JADX WARN: Type inference failed for: r23v24 */
                /* JADX WARN: Type inference failed for: r23v25 */
                /* JADX WARN: Type inference failed for: r23v26 */
                /* JADX WARN: Type inference failed for: r23v27, types: [l0olllO1i] */
                /* JADX WARN: Type inference failed for: r23v28 */
                /* JADX WARN: Type inference failed for: r23v29 */
                /* JADX WARN: Type inference failed for: r23v30 */
                /* JADX WARN: Type inference failed for: r23v31 */
                /* JADX WARN: Type inference failed for: r23v33 */
                /* JADX WARN: Type inference failed for: r23v35 */
                /* JADX WARN: Type inference failed for: r23v44 */
                /* JADX WARN: Type inference failed for: r23v45 */
                /* JADX WARN: Type inference failed for: r23v46 */
                /* JADX WARN: Type inference failed for: r23v49 */
                /* JADX WARN: Type inference failed for: r23v50 */
                /* JADX WARN: Type inference failed for: r31v0, types: [lilOOl0] */
                /* JADX WARN: Type inference failed for: r4v69, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r4v70 */
                /* JADX WARN: Type inference failed for: r4v71, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r4v77 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000lI(long j, String str) throws Throwable {
                    Cursor cursor;
                    ?? r23;
                    long j2;
                    Cursor cursorQuery;
                    List list;
                    String str2;
                    List<Pair> list2;
                    List list3;
                    l1ioIO011Oo l1ioio011ooI00000oIO;
                    l1iioiool l1iioioolVar;
                    int i;
                    List listSubList;
                    l0o1OoOIol l0o1oooiolI001lIiIIo1O;
                    int size;
                    int i2;
                    boolean zI000OOo1O;
                    boolean zI01101IOlO;
                    List list4;
                    l0olllO1i l0olllo1i;
                    Iterator it;
                    String string;
                    String strI0110OiO;
                    Iterator it2;
                    liOi0lIo lioi0lio;
                    int i3;
                    boolean z;
                    int i4;
                    List list5;
                    boolean z2;
                    String strI001l0I00;
                    List list6;
                    boolean zIsEmpty;
                    ?? r14;
                    l0olllO1i l0olllo1i2;
                    List list7;
                    Cursor cursor2;
                    List list8;
                    Iterator it3;
                    Iterator it4;
                    int i5;
                    int i6;
                    ArrayList arrayList;
                    String str3;
                    String str4;
                    SQLiteDatabase sQLiteDatabaseI01Io11IiiiO;
                    String strValueOf;
                    iOl1lOo1IO iol1loo1io;
                    byte[] byteArray;
                    long jI001l0I00;
                    long jI001l0I002;
/* 5 */             String str5 = str;
/* 15 */            int iI010o0o0oO = I00Ol1ll1().I010o0o0oO(str5, iol1II1ii1i.I000O01llI0);
/* 29 */            int i7 = 0;
/* 30 */            int iMax = Math.max(0, I00Ol1ll1().I010o0o0oO(str5, iol1II1ii1i.I000OOo1O));
/* 34 */            iOl1lOo1IO iol1loo1ioI00i01iIIliI = I00i01iIIliI();
/* 40 */            l0olllO1i l0olllo1i3 = (l0olllO1i) iol1loo1ioI00i01iIIliI.I00iOIl;
/* 42 */            iol1loo1ioI00i01iIIliI.I010II();
/* 45 */            iol1loo1ioI00i01iIIliI.I010OIo1l();
/* 48 */            int i8 = 1;
/* 54 */            lII0I0I000I.I00000oOI(iI010o0o0oO > 0);
/* 61 */            ?? r11 = iMax > 0 ? 1 : 0;
/* 62 */            lII0I0I000I.I00000oOI(r11);
/* 65 */            lII0I0I000I.I0000O(str5);
                    try {
                    } catch (Throwable th) {
/* 118 */               th = th;
/* 506 */               cursor = r11;
                    }
                    try {
                        try {
/* 68 */                    sQLiteDatabaseI01Io11IiiiO = iol1loo1ioI00i01iIIliI.I01Io11IiiiO();
/* 74 */                    j2 = -1;
                        } catch (SQLiteException e) {
/* 515 */                   e = e;
/* 516 */                   r23 = l0olllo1i3;
/* 518 */                   j2 = -1;
                        }
                        try {
/* 92 */                    strValueOf = String.valueOf(iI010o0o0oO);
/* 100 */                   cursorQuery = sQLiteDatabaseI01Io11IiiiO.query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str5}, null, null, "rowid", strValueOf);
                            try {
                            } catch (SQLiteException e2) {
/* 121 */                       e = e2;
/* 122 */                       r23 = l0olllo1i3;
                            }
                        } catch (SQLiteException e3) {
/* 511 */                   e = e3;
/* 512 */                   r23 = l0olllo1i3;
/* 524 */                   cursorQuery = null;
/* 537 */                   r23.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Error querying bundles. appId", e);
/* 540 */                   list = Collections.EMPTY_LIST;
                            str4 = r23;
                            str3 = r23;
/* 542 */                   if (cursorQuery != null) {
/* 112 */                       cursorQuery.close();
                                str3 = str4;
                            }
/* 115 */                   list2 = list;
                            str2 = str3;
/* 550 */                   if (list2.isEmpty()) {
                            }
                        }
/* 108 */               if (!cursorQuery.moveToFirst()) {
/* 110 */                   list = Collections.EMPTY_LIST;
                            str4 = strValueOf;
/* 112 */                   cursorQuery.close();
                            str3 = str4;
/* 115 */                   list2 = list;
                            str2 = str3;
/* 550 */                   if (list2.isEmpty()) {
/* 2750 */                      return;
                            }
/* 554 */                   iIIIi0 iiiii0 = iIIIi0.I00iiI;
/* 562 */                   iIl1iil iil1iilI00Ol1ll1 = I00Ol1ll1();
/* 566 */                   iol01I0001 iol01i0001 = iol1II1ii1i.I010oio1OO0;
/* 569 */                   boolean zI01101IOlO2 = iil1iilI00Ol1ll1.I01101IOlO(null, iol01i0001);
/* 575 */                   l1iioiool l1iioioolVar2 = l1iioiool.ANALYTICS_STORAGE;
/* 577 */                   if (zI01101IOlO2) {
/* 593 */                       if (!I00Ol1ll1().I01101IOlO(null, iol01i0001)) {
                                    list6 = list2;
                                } else if (I00000oIO(str5).I000OOo1O(l1iioioolVar2) || !I00OloOo().I010l10O(str5)) {
/* 892 */                           ArrayList arrayList2 = new ArrayList(list2.size());
/* 895 */                           iOl1lOo1IO iol1loo1ioI00i01iIIliI2 = I00i01iIIliI();
/* 901 */                           l0olllO1i l0olllo1i4 = (l0olllO1i) iol1loo1ioI00i01iIIliI2.I00iOIl;
/* 903 */                           lII0I0I000I.I0000O(str5);
/* 906 */                           iol1loo1ioI00i01iIIliI2.I010II();
/* 909 */                           iol1loo1ioI00i01iIIliI2.I010OIo1l();
/* 914 */                           ArrayList arrayList3 = new ArrayList();
                                    try {
                                        try {
                                            try {
/* 921 */                                       SQLiteDatabase sQLiteDatabaseI01Io11IiiiO2 = iol1loo1ioI00i01iIIliI2.I01Io11IiiiO();
/* 929 */                                       l0olllo1i4.I00IoO0().getClass();
/* 932 */                                       long jCurrentTimeMillis = System.currentTimeMillis();
/* 960 */                                       ?? Query = sQLiteDatabaseI01Io11IiiiO2.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str5, String.valueOf(jCurrentTimeMillis)}, null, null, "rowid", null);
/* 964 */                                       l0olllo1i2 = l0olllo1i4;
                                                try {
                                                    try {
/* 972 */                                               if (Query.moveToFirst()) {
/* 974 */                                                   list7 = list2;
                                                            while (true) {
                                                                try {
                                                                    try {
/* 997 */                                                               arrayList3.add((l0l1iIIOl) ((l0l0O000) lio010i.I01IlIoOI(l0l1iIIOl.I00IlilI0i0i(), Query.getBlob(0))).I0000oI00());
/* 1000 */                                                              cursor2 = Query;
/* 1002 */                                                              arrayList = arrayList3;
                                                                    } catch (iI00lI e4) {
/* 1022 */                                                              cursor2 = Query;
                                                                        try {
/* 1026 */                                                                  arrayList = arrayList3;
/* 1032 */                                                                  l0olllo1i2.I00II0oii1o().I00li1OI.I0000O(l01O0IO1ooO0.I010ioo(str5), "Failed to parse stored NO_DATA mode event, appId", e4);
                                                                        } catch (SQLiteException e5) {
/* 1102 */                                                                  e = e5;
/* 1155 */                                                                  l0olllo1i2.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Error flushing NO_DATA mode events. appId", e);
/* 1158 */                                                                  list8 = Collections.EMPTY_LIST;
/* 1160 */                                                                  if (cursor2 != null) {
                                                                            }
/* 1165 */                                                                  it3 = list7.iterator();
/* 1169 */                                                                  boolean z3 = true;
/* 1174 */                                                                  while (it3.hasNext()) {
                                                                            }
/* 1402 */                                                                  list6 = arrayList2;
/* 1412 */                                                                  zIsEmpty = list6.isEmpty();
                                                                            list3 = list6;
/* 1416 */                                                                  if (zIsEmpty) {
                                                                            }
/* 1421 */                                                                  l1ioio011ooI00000oIO = I00000oIO(str5);
/* 1425 */                                                                  l1iioioolVar = l1iioiool.AD_STORAGE;
/* 1431 */                                                                  if (!l1ioio011ooI00000oIO.I000OOo1O(l1iioioolVar)) {
                                                                            }
/* 1520 */                                                                  l0o1oooiolI001lIiIIo1O = l0oiiI0.I001lIiIIo1O();
/* 1524 */                                                                  size = listSubList.size();
/* 1534 */                                                                  ArrayList arrayList4 = new ArrayList(listSubList.size());
/* 1559 */                                                                  if (I00Ol1ll1().I010OIo1l(str5)) {
                                                                            }
/* 1564 */                                                                  boolean zI000OOo1O2 = I00000oIO(str5).I000OOo1O(l1iioioolVar);
/* 1572 */                                                                  zI000OOo1O = I00000oIO(str5).I000OOo1O(l1iioioolVar2);
/* 1590 */                                                                  zI01101IOlO = I00Ol1ll1().I01101IOlO(str5, iol1II1ii1i.I00ooiO1I);
/* 1594 */                                                                  liOii110IIl lioii110iil = this.I00l0OO0IO;
/* 1596 */                                                                  liOi0lIo lioi0lioI010OIo1l = lioii110iil.I010OIo1l(str5);
                                                                            list4 = listSubList;
                                                                            while (true) {
/* 1602 */                                                                      l0olllo1i = this.I00ll1;
/* 1604 */                                                                      if (i < size) {
                                                                                }
/* 2011 */                                                                      i = i + 1;
/* 2013 */                                                                      size = i3;
/* 2015 */                                                                      zI000OOo1O = z;
/* 2017 */                                                                      list4 = list5;
/* 2019 */                                                                      i2 = i4;
/* 2021 */                                                                      zI01101IOlO = z2;
                                                                            }
/* 2035 */                                                                  if (((l0oiiI0) l0o1oooiolI001lIiIIo1O.I00iiI).I001IIilI0O() != 0) {
                                                                            }
                                                                        }
                                                                    }
/* 1039 */                                                          if (!cursor2.moveToNext()) {
                                                                        break;
                                                                    }
/* 1104 */                                                          Query = cursor2;
/* 1106 */                                                          arrayList3 = arrayList;
                                                                } catch (SQLiteException e6) {
/* 1010 */                                                          e = e6;
/* 1011 */                                                          cursor2 = Query;
/* 1155 */                                                          l0olllo1i2.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Error flushing NO_DATA mode events. appId", e);
/* 1158 */                                                          list8 = Collections.EMPTY_LIST;
/* 1160 */                                                          if (cursor2 != null) {
                                                                    }
/* 1165 */                                                          it3 = list7.iterator();
/* 1169 */                                                          boolean z32 = true;
/* 1174 */                                                          while (it3.hasNext()) {
                                                                    }
/* 1402 */                                                          list6 = arrayList2;
/* 1412 */                                                          zIsEmpty = list6.isEmpty();
                                                                    list3 = list6;
/* 1416 */                                                          if (zIsEmpty) {
                                                                    }
/* 1421 */                                                          l1ioio011ooI00000oIO = I00000oIO(str5);
/* 1425 */                                                          l1iioioolVar = l1iioiool.AD_STORAGE;
/* 1431 */                                                          if (!l1ioio011ooI00000oIO.I000OOo1O(l1iioioolVar)) {
                                                                    }
/* 1520 */                                                          l0o1oooiolI001lIiIIo1O = l0oiiI0.I001lIiIIo1O();
/* 1524 */                                                          size = listSubList.size();
/* 1534 */                                                          ArrayList arrayList42 = new ArrayList(listSubList.size());
/* 1559 */                                                          if (I00Ol1ll1().I010OIo1l(str5)) {
                                                                    }
/* 1564 */                                                          boolean zI000OOo1O22 = I00000oIO(str5).I000OOo1O(l1iioioolVar);
/* 1572 */                                                          zI000OOo1O = I00000oIO(str5).I000OOo1O(l1iioioolVar2);
/* 1590 */                                                          zI01101IOlO = I00Ol1ll1().I01101IOlO(str5, iol1II1ii1i.I00ooiO1I);
/* 1594 */                                                          liOii110IIl lioii110iil2 = this.I00l0OO0IO;
/* 1596 */                                                          liOi0lIo lioi0lioI010OIo1l2 = lioii110iil2.I010OIo1l(str5);
                                                                    list4 = listSubList;
                                                                    while (true) {
/* 1602 */                                                              l0olllo1i = this.I00ll1;
/* 1604 */                                                              if (i < size) {
                                                                        }
/* 2011 */                                                              i = i + 1;
/* 2013 */                                                              size = i3;
/* 2015 */                                                              zI000OOo1O = z;
/* 2017 */                                                              list4 = list5;
/* 2019 */                                                              i2 = i4;
/* 2021 */                                                              zI01101IOlO = z2;
                                                                    }
/* 2035 */                                                          if (((l0oiiI0) l0o1oooiolI001lIiIIo1O.I00iiI).I001IIilI0O() != 0) {
                                                                    }
                                                                }
                                                            }
/* 1041 */                                                  cursor2.close();
                                                            try {
/* 1054 */                                                      int iDelete = sQLiteDatabaseI01Io11IiiiO2.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str5, String.valueOf(jCurrentTimeMillis)});
/* 1062 */                                                      IOloiOI1 iOloiOI1 = l0olllo1i2.I00II0oii1o().I00lll10;
/* 1076 */                                                      StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 34);
/* 1079 */                                                      sb.append("Pruned ");
/* 1082 */                                                      sb.append(iDelete);
/* 1085 */                                                      sb.append(" NO_DATA mode events. appId");
/* 1092 */                                                      iOloiOI1.I0000Il00O(sb.toString(), str5);
                                                            } catch (SQLiteException e7) {
/* 1098 */                                                      e = e7;
/* 1141 */                                                      cursor2 = null;
/* 1155 */                                                      l0olllo1i2.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Error flushing NO_DATA mode events. appId", e);
/* 1158 */                                                      list8 = Collections.EMPTY_LIST;
/* 1160 */                                                      if (cursor2 != null) {
/* 1162 */                                                          cursor2.close();
                                                                }
/* 1165 */                                                      it3 = list7.iterator();
/* 1169 */                                                      boolean z322 = true;
/* 1174 */                                                      while (it3.hasNext()) {
                                                                }
/* 1402 */                                                      list6 = arrayList2;
/* 1412 */                                                      zIsEmpty = list6.isEmpty();
                                                                list3 = list6;
/* 1416 */                                                      if (zIsEmpty) {
                                                                }
/* 1421 */                                                      l1ioio011ooI00000oIO = I00000oIO(str5);
/* 1425 */                                                      l1iioioolVar = l1iioiool.AD_STORAGE;
/* 1431 */                                                      if (!l1ioio011ooI00000oIO.I000OOo1O(l1iioioolVar)) {
                                                                }
/* 1520 */                                                      l0o1oooiolI001lIiIIo1O = l0oiiI0.I001lIiIIo1O();
/* 1524 */                                                      size = listSubList.size();
/* 1534 */                                                      ArrayList arrayList422 = new ArrayList(listSubList.size());
/* 1559 */                                                      if (I00Ol1ll1().I010OIo1l(str5)) {
                                                                }
/* 1564 */                                                      boolean zI000OOo1O222 = I00000oIO(str5).I000OOo1O(l1iioioolVar);
/* 1572 */                                                      zI000OOo1O = I00000oIO(str5).I000OOo1O(l1iioioolVar2);
/* 1590 */                                                      zI01101IOlO = I00Ol1ll1().I01101IOlO(str5, iol1II1ii1i.I00ooiO1I);
/* 1594 */                                                      liOii110IIl lioii110iil22 = this.I00l0OO0IO;
/* 1596 */                                                      liOi0lIo lioi0lioI010OIo1l22 = lioii110iil22.I010OIo1l(str5);
                                                                list4 = listSubList;
                                                                while (true) {
/* 1602 */                                                          l0olllo1i = this.I00ll1;
/* 1604 */                                                          if (i < size) {
                                                                    }
/* 2011 */                                                          i = i + 1;
/* 2013 */                                                          size = i3;
/* 2015 */                                                          zI000OOo1O = z;
/* 2017 */                                                          list4 = list5;
/* 2019 */                                                          i2 = i4;
/* 2021 */                                                          zI01101IOlO = z2;
                                                                }
/* 2035 */                                                      if (((l0oiiI0) l0o1oooiolI001lIiIIo1O.I00iiI).I001IIilI0O() != 0) {
                                                                }
                                                            }
                                                        } else {
/* 1112 */                                                  arrayList = arrayList3;
/* 1114 */                                                  list7 = list2;
/* 1116 */                                                  Query.close();
                                                        }
/* 1119 */                                              list8 = arrayList;
                                                    } catch (Throwable th2) {
/* 1005 */                                              th = th2;
/* 1006 */                                              str2 = Query;
/* 1122 */                                              r14 = str2;
/* 1404 */                                              if (r14 != null) {
                                                        }
/* 1409 */                                              throw th;
                                                    }
                                                } catch (SQLiteException e8) {
/* 1126 */                                          e = e8;
/* 1127 */                                          cursor2 = Query;
/* 1129 */                                          list7 = list2;
                                                }
                                            } catch (Throwable th3) {
/* 1096 */                                      th = th3;
/* 1138 */                                      r14 = null;
/* 1404 */                                      if (r14 != null) {
/* 1406 */                                          r14.close();
                                                }
/* 1409 */                                      throw th;
                                            }
                                        } catch (SQLiteException e9) {
/* 1132 */                                  e = e9;
/* 1133 */                                  l0olllo1i2 = l0olllo1i4;
/* 1135 */                                  list7 = list2;
                                        }
/* 1165 */                              it3 = list7.iterator();
/* 1169 */                              boolean z3222 = true;
/* 1174 */                              while (it3.hasNext()) {
/* 1180 */                                  Pair pair = (Pair) it3.next();
/* 1190 */                                  l0ooIi1oOO l0ooii1ooo = (l0ooIi1oOO) ((l100ll0OOIoO) pair.first).I000OiO();
/* 1192 */                                  if (z3222 && !list8.isEmpty()) {
/* 1200 */                                      List listI00OIl = l0ooii1ooo.I00OIl();
/* 1204 */                                      l0ooii1ooo.I0000Il00O();
/* 1211 */                                      ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00i01iIIliI();
/* 1217 */                                      l0ooii1ooo.I0000Il00O();
/* 1224 */                                      ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00OloOo(list8);
/* 1229 */                                      l0ooii1ooo.I0000Il00O();
/* 1236 */                                      ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00OloOo(listI00OIl);
/* 1239 */                                      z3222 = false;
                                            }
/* 1240 */                                  l0Oio1IOl l0oio1iolI001IIilI0O = l0iiIl.I001IIilI0O();
/* 1248 */                                  iooOiIloili ioooiiloiliI011iO = I00OloOo().I011iO(str5);
/* 1254 */                                  ArrayList arrayList5 = new ArrayList();
/* 1257 */                                  if (ioooiiloiliI011iO != null) {
/* 1271 */                                      Iterator it5 = ioooiiloiliI011iO.I00111O().iterator();
/* 1279 */                                      while (it5.hasNext()) {
/* 1285 */                                          ioiOO11II0O0 ioioo11ii0o0 = (ioiOO11II0O0) it5.next();
/* 1287 */                                          Iterator it6 = it3;
/* 1289 */                                          l0i0l0OoOll l0i0l0ooollI00111O = l0i111O0.I00111O();
/* 1297 */                                          boolean z4 = z3222;
                                                    int iI00111O = ioioo11ii0o0.I00111O() - 1;
/* 1301 */                                          List list9 = list8;
/* 1304 */                                          if (iI00111O == 1) {
/* 1328 */                                              it4 = it5;
/* 1330 */                                              i5 = 3;
/* 1331 */                                              i6 = 2;
                                                    } else if (iI00111O != 2) {
/* 1310 */                                              it4 = it5;
/* 1312 */                                              i5 = 3;
/* 1321 */                                              i6 = iI00111O != 3 ? iI00111O != 4 ? 1 : 5 : 4;
                                                    } else {
/* 1323 */                                              it4 = it5;
/* 1325 */                                              i5 = 3;
/* 1326 */                                              i6 = 3;
                                                    }
/* 1332 */                                          l0i0l0ooollI00111O.I000O01llI0(i6);
                                                    int iI001IO000 = ioioo11ii0o0.I001IO000() - 1;
/* 1342 */                                          if (iI001IO000 == 1) {
/* 1349 */                                              i5 = 2;
                                                    } else if (iI001IO000 != 2) {
/* 1347 */                                              i5 = 1;
                                                    }
/* 1350 */                                          l0i0l0ooollI00111O.I000OOo1O(i5);
/* 1359 */                                          arrayList5.add((l0i111O0) l0i0l0ooollI00111O.I0000oI00());
/* 1362 */                                          it3 = it6;
/* 1364 */                                          list8 = list9;
/* 1366 */                                          z3222 = z4;
/* 1368 */                                          it5 = it4;
                                                }
                                            }
/* 1259 */                                  Iterator it7 = it3;
/* 1261 */                                  boolean z5 = z3222;
/* 1263 */                                  List list10 = list8;
/* 1371 */                                  l0oio1iolI001IIilI0O.I000O01llI0(arrayList5);
/* 1374 */                                  l0ooii1ooo.I00II0Ol1O0l(l0oio1iolI001IIilI0O);
/* 1391 */                                  arrayList2.add(Pair.create((l100ll0OOIoO) l0ooii1ooo.I0000oI00(), (Long) pair.second));
/* 1394 */                                  it3 = it7;
/* 1396 */                                  list8 = list10;
/* 1398 */                                  z3222 = z5;
                                        }
/* 1402 */                              list6 = arrayList2;
                                    } catch (Throwable th4) {
/* 1100 */                              th = th4;
                                    }
                                } else {
/* 631 */                           List listAsList = Arrays.asList(((String) iol1II1ii1i.I01101IOlO.I00000oIO(null)).split(","));
/* 643 */                           for (Pair pair2 : list2) {
                                        try {
/* 663 */                                   I00i01iIIliI().I010o0o0oO(((Long) pair2.second).longValue());
/* 682 */                                   for (l0l1iIIOl l0l1iiiol : ((l100ll0OOIoO) pair2.first).I01OOiI1o()) {
/* 698 */                                       if (listAsList.contains(l0l1iiiol.I001iOo1i0O())) {
/* 708 */                                           if (l0l1iiiol.I001iOo1i0O().equals("_f") || l0l1iiiol.I001iOo1i0O().equals("_v")) {
/* 726 */                                               l0l0O000 l0l0o000 = (l0l0O000) l0l1iiiol.I000OiO();
/* 728 */                                               I00i0oil();
/* 739 */                                               lio010i.I010lI0oi(l0l0o000, "_dac", 1L);
/* 746 */                                               l0l1iiiol = (l0l1iIIOl) l0l0o000.I0000oI00();
                                                    }
/* 748 */                                           iOl1lOo1IO iol1loo1ioI00i01iIIliI3 = I00i01iIIliI();
/* 752 */                                           iol1loo1ioI00i01iIIliI3.I010II();
/* 755 */                                           iol1loo1ioI00i01iIIliI3.I010OIo1l();
/* 758 */                                           lII0I0I000I.I0000O(str5);
/* 763 */                                           l0olllO1i l0olllo1i5 = (l0olllO1i) iol1loo1ioI00i01iIIliI3.I00iOIl;
/* 773 */                                           l0olllo1i5.I00II0oii1o().I00lll10.I0000Il00O("Caching events in NO_DATA mode", l0l1iiiol);
/* 778 */                                           ContentValues contentValues = new ContentValues();
/* 783 */                                           contentValues.put("app_id", str5);
/* 788 */                                           l0l1iIIOl l0l1iiiol2 = l0l1iiiol;
/* 794 */                                           contentValues.put("name", l0l1iiiol2.I001iOo1i0O());
/* 801 */                                           contentValues.put("data", l0l1iiiol2.I00000oIO());
/* 814 */                                           contentValues.put("timestamp_millis", Long.valueOf(l0l1iiiol2.I001lIiIIo1O()));
                                                    try {
/* 828 */                                               if (iol1loo1ioI00i01iIIliI3.I01Io11IiiiO().insert("no_data_mode_events", null, contentValues) == j2) {
/* 842 */                                                   l0olllo1i5.I00II0oii1o().I00ilO0.I0000Il00O("Failed to insert NO_DATA mode event (got -1). appId", l01O0IO1ooO0.I010ioo(str5));
                                                        }
                                                    } catch (SQLiteException e10) {
/* 864 */                                               ((l0olllO1i) iol1loo1ioI00i01iIIliI3.I00iOIl).I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Error storing NO_DATA mode event. appId", e10);
                                                    }
                                                }
                                            }
                                        } catch (SQLiteException unused) {
/* 877 */                                   I00II0oii1o().I00li1OI.I0000Il00O("Failed handling NO_DATA mode bundles. appId", str5);
                                        }
                                    }
/* 882 */                           list6 = Collections.EMPTY_LIST;
                                }
/* 1412 */                      zIsEmpty = list6.isEmpty();
                                list3 = list6;
/* 1416 */                      if (zIsEmpty) {
/* 2750 */                          return;
                                }
                            } else {
                                list3 = list2;
                            }
/* 1421 */                  l1ioio011ooI00000oIO = I00000oIO(str5);
/* 1425 */                  l1iioioolVar = l1iioiool.AD_STORAGE;
/* 1431 */                  if (!l1ioio011ooI00000oIO.I000OOo1O(l1iioioolVar)) {
/* 1433 */                      Iterator it8 = list3.iterator();
                                while (true) {
/* 1441 */                          if (!it8.hasNext()) {
/* 1468 */                              strI001l0I00 = null;
                                        break;
                                    }
/* 1451 */                          l100ll0OOIoO l100ll0ooioo = (l100ll0OOIoO) ((Pair) it8.next()).first;
/* 1461 */                          if (!l100ll0ooioo.I001l0I00().isEmpty()) {
/* 1463 */                              strI001l0I00 = l100ll0ooioo.I001l0I00();
                                        break;
                                    }
                                }
/* 1469 */                      if (strI001l0I00 != null) {
/* 1476 */                          for (int i9 = 0; i9 < list3.size(); i9++) {
/* 1486 */                              l100ll0OOIoO l100ll0ooioo2 = (l100ll0OOIoO) ((Pair) list3.get(i9)).first;
/* 1496 */                              if (!l100ll0ooioo2.I001l0I00().isEmpty() && !l100ll0ooioo2.I001l0I00().equals(strI001l0I00)) {
/* 1510 */                                  i = 0;
/* 1511 */                                  listSubList = list3.subList(0, i9);
                                            break;
                                        }
                                    }
/* 1519 */                          i = 0;
                                    listSubList = list3;
                                } else {
/* 1519 */                          i = 0;
                                    listSubList = list3;
                                }
                            }
/* 1520 */                  l0o1oooiolI001lIiIIo1O = l0oiiI0.I001lIiIIo1O();
/* 1524 */                  size = listSubList.size();
/* 1534 */                  ArrayList arrayList4222 = new ArrayList(listSubList.size());
/* 1559 */                  i2 = (I00Ol1ll1().I010OIo1l(str5) || !I00000oIO(str5).I000OOo1O(l1iioioolVar)) ? i : 1;
/* 1564 */                  boolean zI000OOo1O2222 = I00000oIO(str5).I000OOo1O(l1iioioolVar);
/* 1572 */                  zI000OOo1O = I00000oIO(str5).I000OOo1O(l1iioioolVar2);
/* 1590 */                  zI01101IOlO = I00Ol1ll1().I01101IOlO(str5, iol1II1ii1i.I00ooiO1I);
/* 1594 */                  liOii110IIl lioii110iil222 = this.I00l0OO0IO;
/* 1596 */                  liOi0lIo lioi0lioI010OIo1l222 = lioii110iil222.I010OIo1l(str5);
                            list4 = listSubList;
                            while (true) {
/* 1602 */                      l0olllo1i = this.I00ll1;
/* 1604 */                      if (i < size) {
                                    break;
                                }
/* 1624 */                      l0ooIi1oOO l0ooii1ooo2 = (l0ooIi1oOO) ((l100ll0OOIoO) ((Pair) list4.get(i)).first).I000OiO();
/* 1630 */                      int i10 = i;
/* 1640 */                      arrayList4222.add((Long) ((Pair) list4.get(i)).second);
/* 1647 */                      I00Ol1ll1().I010l1O();
/* 1650 */                      l0ooii1ooo2.I0010o();
/* 1653 */                      l0ooii1ooo2.I0000Il00O();
/* 1660 */                      ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I00iIi0i1o(j);
/* 1663 */                      l0olllo1i.getClass();
/* 1666 */                      l0ooii1ooo2.I00IioO0OiOi();
/* 1669 */                      if (i2 == 0) {
/* 1671 */                          l0ooii1ooo2.I0000Il00O();
/* 1678 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I010ioo();
                                }
/* 1681 */                      if (!zI000OOo1O2222) {
/* 1683 */                          l0ooii1ooo2.I0000Il00O();
/* 1690 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I01IlIoOI();
/* 1693 */                          l0ooii1ooo2.I0000Il00O();
/* 1700 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I01Ilo0i();
                                }
/* 1703 */                      if (!zI000OOo1O) {
/* 1705 */                          l0ooii1ooo2.I0000Il00O();
/* 1712 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I01Io001O();
                                }
/* 1715 */                      I00100o1O0lo(str5, l0ooii1ooo2);
/* 1718 */                      if (!zI01101IOlO) {
/* 1720 */                          l0ooii1ooo2.I0000Il00O();
/* 1727 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I01101IOlO();
                                }
/* 1730 */                      if (!zI000OOo1O) {
/* 1732 */                          l0ooii1ooo2.I0000Il00O();
/* 1739 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I01O1lIi();
                                }
/* 1746 */                      String strI001l0I002 = ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I001l0I00();
/* 1754 */                      if (TextUtils.isEmpty(strI001l0I002)) {
/* 1777 */                          i3 = size;
                                } else {
/* 1756 */                          i3 = size;
/* 1764 */                          if (!strI001l0I002.equals("00000000-0000-0000-0000-000000000000")) {
/* 1767 */                              z = zI000OOo1O;
/* 1769 */                              i4 = i2;
/* 1771 */                              list5 = list4;
/* 1773 */                              z2 = zI01101IOlO;
                                    }
/* 1952 */                          if (l0ooii1ooo2.I00OIo() != 0) {
/* 1965 */                              if (I00Ol1ll1().I01101IOlO(str5, iol1II1ii1i.I00oII)) {
/* 1985 */                                  l0ooii1ooo2.I00O0i0ii(I00i0oil().I01IiOO(((l100ll0OOIoO) l0ooii1ooo2.I0000oI00()).I00000oIO()));
                                        }
/* 1988 */                              l1I1OlIIlO l1i1oliilo = lioi0lioI010OIo1l222.I0000O;
/* 1990 */                              if (l1i1oliilo != null) {
/* 1992 */                                  l0ooii1ooo2.I001lllioOl(l1i1oliilo);
                                        }
/* 1995 */                              l0o1oooiolI001lIiIIo1O.I0000Il00O();
/* 2008 */                              ((l0oiiI0) l0o1oooiolI001lIiIIo1O.I00iiI).I00II0Ol1O0l((l100ll0OOIoO) l0ooii1ooo2.I0000oI00());
                                    }
/* 2011 */                          i = i10 + 1;
/* 2013 */                          size = i3;
/* 2015 */                          zI000OOo1O = z;
/* 2017 */                          list4 = list5;
/* 2019 */                          i2 = i4;
/* 2021 */                          zI01101IOlO = z2;
                                }
/* 1785 */                      ArrayList arrayList6 = new ArrayList(l0ooii1ooo2.I00OIl());
/* 1788 */                      Iterator it9 = arrayList6.iterator();
/* 1794 */                      z = zI000OOo1O;
/* 1796 */                      Long lValueOf = null;
/* 1797 */                      Long lValueOf2 = null;
/* 1798 */                      boolean z6 = false;
/* 1800 */                      boolean z7 = false;
/* 1806 */                      while (it9.hasNext()) {
/* 1812 */                          int i11 = i2;
/* 1816 */                          l0l1iIIOl l0l1iiiol3 = (l0l1iIIOl) it9.next();
/* 1818 */                          List list11 = list4;
/* 1824 */                          boolean z8 = zI01101IOlO;
/* 1832 */                          if ("_fx".equals(l0l1iiiol3.I001iOo1i0O())) {
/* 1834 */                              it9.remove();
/* 1837 */                              list4 = list11;
/* 1839 */                              i2 = i11;
/* 1841 */                              zI01101IOlO = z8;
/* 1843 */                              z6 = true;
                                    } else if ("_f".equals(l0l1iiiol3.I001iOo1i0O())) {
/* 1858 */                              I00i0oil();
/* 1863 */                              l0lliIlIO l0lliilioI010oio1OO0 = lio010i.I010oio1OO0("_pfo", l0l1iiiol3);
/* 1867 */                              if (l0lliilioI010oio1OO0 != null) {
/* 1873 */                                  lValueOf = Long.valueOf(l0lliilioI010oio1OO0.I001iOo1i0O());
                                        }
/* 1877 */                              I00i0oil();
/* 1882 */                              l0lliIlIO l0lliilioI010oio1OO02 = lio010i.I010oio1OO0("_uwa", l0l1iiiol3);
/* 1886 */                              if (l0lliilioI010oio1OO02 != null) {
/* 1892 */                                  lValueOf2 = Long.valueOf(l0lliilioI010oio1OO02.I001iOo1i0O());
                                        }
/* 1896 */                              list4 = list11;
/* 1898 */                              i2 = i11;
/* 1900 */                              zI01101IOlO = z8;
                                    } else {
/* 1903 */                              list4 = list11;
/* 1905 */                              i2 = i11;
/* 1907 */                              zI01101IOlO = z8;
                                    }
/* 1845 */                          z7 = true;
                                }
/* 1910 */                      i4 = i2;
/* 1912 */                      list5 = list4;
/* 1914 */                      z2 = zI01101IOlO;
/* 1916 */                      if (z6) {
/* 1918 */                          l0ooii1ooo2.I0000Il00O();
/* 1925 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I00i01iIIliI();
/* 1928 */                          l0ooii1ooo2.I0000Il00O();
/* 1935 */                          ((l100ll0OOIoO) l0ooii1ooo2.I00iiI).I00OloOo(arrayList6);
                                }
/* 1938 */                      if (z7) {
/* 1945 */                          I00100l0(l0ooii1ooo2.I000oI1ioi(), true, lValueOf, lValueOf2);
                                }
/* 1952 */                      if (l0ooii1ooo2.I00OIo() != 0) {
                                }
/* 2011 */                      i = i10 + 1;
/* 2013 */                      size = i3;
/* 2015 */                      zI000OOo1O = z;
/* 2017 */                      list4 = list5;
/* 2019 */                      i2 = i4;
/* 2021 */                      zI01101IOlO = z2;
                            }
/* 2035 */                  if (((l0oiiI0) l0o1oooiolI001lIiIIo1O.I00iiI).I001IIilI0O() != 0) {
/* 2037 */                      I000iOII(arrayList4222);
/* 2048 */                      I001IIilI0O(false, 204, null, null, str5, Collections.EMPTY_LIST, null);
/* 2051 */                      return;
                            }
/* 2056 */                  l0oiiI0 l0oiii0 = (l0oiiI0) l0o1oooiolI001lIiIIo1O.I0000oI00();
/* 2060 */                  ArrayList arrayList7 = new ArrayList();
/* 2063 */                  lIoOOO lioooo = lioi0lioI010OIo1l222.I0000Il00O;
/* 2071 */                  boolean z9 = lioooo == lIoOOO.SGTM_CLIENT;
/* 2074 */                  if (lioooo == lIoOOO.SGTM) {
/* 2093 */                      it = ((l0oiiI0) l0o1oooiolI001lIiIIo1O.I0000oI00()).I00111O().iterator();
                                while (true) {
/* 2101 */                          if (!it.hasNext()) {
/* 2113 */                              if (((l100ll0OOIoO) it.next()).I00O0o1oo()) {
/* 2119 */                                  string = UUID.randomUUID().toString();
                                            break;
                                        }
                                    } else {
/* 2124 */                              string = null;
                                        break;
                                    }
                                }
/* 2129 */                      l0oiiI0 l0oiii02 = (l0oiiI0) l0o1oooiolI001lIiIIo1O.I0000oI00();
/* 2135 */                      I00iOIl().I010II();
/* 2138 */                      I00iIi0i1o();
/* 2141 */                      l0o1OoOIol l0o1oooiolI001lllioOl = l0oiiI0.I001lllioOl(l0oiii02);
/* 2149 */                      if (!TextUtils.isEmpty(string)) {
/* 2151 */                          l0o1oooiolI001lllioOl.I0000Il00O();
/* 2158 */                          ((l0oiiI0) l0o1oooiolI001lllioOl.I00iiI).I00IO1oi11O(string);
                                }
/* 2165 */                      strI0110OiO = I00OloOo().I0110OiO(str5);
/* 2173 */                      if (!TextUtils.isEmpty(strI0110OiO)) {
/* 2175 */                          l0o1oooiolI001lllioOl.I000OOo1O(strI0110OiO);
                                }
/* 2180 */                      ArrayList arrayList8 = new ArrayList();
/* 2187 */                      it2 = l0oiii02.I00111O().iterator();
/* 2195 */                      while (it2.hasNext()) {
/* 2203 */                          l0ooIi1oOO l0ooii1oooI00Oio = l100ll0OOIoO.I00Oio((l100ll0OOIoO) it2.next());
/* 2207 */                          l0ooii1oooI00Oio.I0000Il00O();
/* 2214 */                          ((l100ll0OOIoO) l0ooii1oooI00Oio.I00iiI).I010ioo();
/* 2223 */                          arrayList8.add((l100ll0OOIoO) l0ooii1oooI00Oio.I0000oI00());
                                }
/* 2227 */                      l0o1oooiolI001lllioOl.I0000Il00O();
/* 2234 */                      ((l0oiiI0) l0o1oooiolI001lllioOl.I00iiI).I00IO1();
/* 2237 */                      l0o1oooiolI001lllioOl.I0000Il00O();
/* 2244 */                      ((l0oiiI0) l0o1oooiolI001lllioOl.I00iiI).I00II0oii1o(arrayList8);
/* 2268 */                      I00II0oii1o().I00lll10.I0000Il00O("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", !TextUtils.isEmpty(string) ? "null" : l0o1oooiolI001lllioOl.I000O01llI0());
/* 2275 */                      l0oiiI0 l0oiii03 = (l0oiiI0) l0o1oooiolI001lllioOl.I0000oI00();
/* 2281 */                      if (!TextUtils.isEmpty(string)) {
/* 2287 */                          l0oiiI0 l0oiii04 = (l0oiiI0) l0o1oooiolI001lIiIIo1O.I0000oI00();
/* 2293 */                          I00iOIl().I010II();
/* 2296 */                          I00iIi0i1o();
/* 2299 */                          l0o1OoOIol l0o1oooiolI001lIiIIo1O2 = l0oiiI0.I001lIiIIo1O();
/* 2311 */                          I00II0oii1o().I00lll10.I0000Il00O("[sgtm] Processing Google Signal, sgtmJoinId:", string);
/* 2314 */                          l0o1oooiolI001lIiIIo1O2.I0000Il00O();
/* 2321 */                          ((l0oiiI0) l0o1oooiolI001lIiIIo1O2.I00iiI).I00IO1oi11O(string);
/* 2336 */                          for (l100ll0OOIoO l100ll0ooioo3 : l0oiii04.I00111O()) {
/* 2344 */                              l0ooIi1oOO l0ooii1oooI00OilO00Il = l100ll0OOIoO.I00OilO00Il();
/* 2348 */                              String strI00O10llo = l100ll0ooioo3.I00O10llo();
/* 2352 */                              l0ooii1oooI00OilO00Il.I0000Il00O();
/* 2359 */                              ((l100ll0OOIoO) l0ooii1oooI00OilO00Il.I00iiI).I010iIIOlo(strI00O10llo);
/* 2362 */                              int iI0100i = l100ll0ooioo3.I0100i();
/* 2366 */                              l0ooii1oooI00OilO00Il.I0000Il00O();
/* 2373 */                              ((l100ll0OOIoO) l0ooii1oooI00OilO00Il.I00iiI).I011iIOio(iI0100i);
/* 2376 */                              l0o1oooiolI001lIiIIo1O2.I0000Il00O();
/* 2389 */                              ((l0oiiI0) l0o1oooiolI001lIiIIo1O2.I00iiI).I00II0Ol1O0l((l100ll0OOIoO) l0ooii1oooI00OilO00Il.I0000oI00());
                                    }
/* 2397 */                          l0oiiI0 l0oiii05 = (l0oiiI0) l0o1oooiolI001lIiIIo1O2.I0000oI00();
/* 2405 */                          String strI0110OiO2 = lioii110iil222.I00iiI.I00OloOo().I0110OiO(str5);
/* 2409 */                          boolean zIsEmpty2 = TextUtils.isEmpty(strI0110OiO2);
/* 2413 */                          lIoOOO lioooo2 = lIoOOO.GOOGLE_SIGNAL;
/* 2415 */                          lIoOOO lioooo3 = lIoOOO.GOOGLE_SIGNAL_PENDING;
/* 2417 */                          if (zIsEmpty2) {
/* 2514 */                              String str6 = (String) iol1II1ii1i.I0010o.I00000oIO(null);
/* 2516 */                              if (z9) {
/* 2518 */                                  lioooo2 = lioooo3;
                                        }
/* 2521 */                              lioi0lio = new liOi0lIo(str6, Collections.EMPTY_MAP, lioooo2, null);
                                    } else {
/* 2428 */                              Uri uri = Uri.parse((String) iol1II1ii1i.I0010o.I00000oIO(null));
/* 2432 */                              Uri.Builder builderBuildUpon = uri.buildUpon();
/* 2436 */                              String authority = uri.getAuthority();
/* 2464 */                              StringBuilder sb2 = new StringBuilder(String.valueOf(strI0110OiO2).length() + 1 + String.valueOf(authority).length());
/* 2467 */                              sb2.append(strI0110OiO2);
/* 2472 */                              sb2.append(".");
/* 2475 */                              sb2.append(authority);
/* 2482 */                              builderBuildUpon.authority(sb2.toString());
/* 2491 */                              String string2 = builderBuildUpon.build().toString();
/* 2495 */                              if (z9) {
/* 2497 */                                  lioooo2 = lioooo3;
                                        }
/* 2501 */                              lioi0lio = new liOi0lIo(string2, Collections.EMPTY_MAP, lioooo2, null);
                                    }
/* 2528 */                          arrayList7.add(Pair.create(l0oiii05, lioi0lio));
                                }
/* 2531 */                      if (!z9) {
/* 2537 */                          l0o1OoOIol l0o1oooiol = (l0o1OoOIol) l0oiii03.I000OiO();
/* 2544 */                          for (int i12 = 0; i12 < l0oiii03.I001IIilI0O(); i12++) {
/* 2554 */                              l0ooIi1oOO l0ooii1ooo3 = (l0ooIi1oOO) l0oiii03.I001IO000(i12).I000OiO();
/* 2556 */                              l0ooii1ooo3.I00Ol10();
/* 2559 */                              l0ooii1ooo3.I001lloI(j);
/* 2562 */                              l0o1oooiol.I0000Il00O();
/* 2575 */                              ((l0oiiI0) l0o1oooiol.I00iiI).I001lloI(i12, (l100ll0OOIoO) l0ooii1ooo3.I0000oI00());
                                    }
/* 2591 */                          arrayList7.add(Pair.create((l0oiiI0) l0o1oooiol.I0000oI00(), lioi0lioI010OIo1l222));
/* 2594 */                          I000iOII(arrayList4222);
/* 2605 */                          I001IIilI0O(false, 204, null, null, str, arrayList7, null);
/* 2614 */                          if (I000o00OoI0I(str, lioi0lioI010OIo1l222.I00000oIO)) {
/* 2624 */                              I00II0oii1o().I00lll10.I0000Il00O("[sgtm] Sending sgtm batches available notification to app", str);
/* 2629 */                              Intent intent = new Intent();
/* 2634 */                              intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
/* 2637 */                              intent.setPackage(str);
/* 2658 */                              l0olllo1i.I00iiI().sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
/* 2661 */                              return;
                                    }
/* 2750 */                          return;
                                }
/* 2662 */                      str5 = str;
/* 2664 */                      l0oiii0 = l0oiii03;
                            } else if (z9) {
/* 2078 */                      z9 = true;
/* 2093 */                      it = ((l0oiiI0) l0o1oooiolI001lIiIIo1O.I0000oI00()).I00111O().iterator();
                                while (true) {
/* 2101 */                          if (!it.hasNext()) {
                                    }
                                }
/* 2129 */                      l0oiiI0 l0oiii022 = (l0oiiI0) l0o1oooiolI001lIiIIo1O.I0000oI00();
/* 2135 */                      I00iOIl().I010II();
/* 2138 */                      I00iIi0i1o();
/* 2141 */                      l0o1OoOIol l0o1oooiolI001lllioOl2 = l0oiiI0.I001lllioOl(l0oiii022);
/* 2149 */                      if (!TextUtils.isEmpty(string)) {
                                }
/* 2165 */                      strI0110OiO = I00OloOo().I0110OiO(str5);
/* 2173 */                      if (!TextUtils.isEmpty(strI0110OiO)) {
                                }
/* 2180 */                      ArrayList arrayList82 = new ArrayList();
/* 2187 */                      it2 = l0oiii022.I00111O().iterator();
/* 2195 */                      while (it2.hasNext()) {
                                }
/* 2227 */                      l0o1oooiolI001lllioOl2.I0000Il00O();
/* 2234 */                      ((l0oiiI0) l0o1oooiolI001lllioOl2.I00iiI).I00IO1();
/* 2237 */                      l0o1oooiolI001lllioOl2.I0000Il00O();
/* 2244 */                      ((l0oiiI0) l0o1oooiolI001lllioOl2.I00iiI).I00II0oii1o(arrayList82);
/* 2268 */                      I00II0oii1o().I00lll10.I0000Il00O("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", !TextUtils.isEmpty(string) ? "null" : l0o1oooiolI001lllioOl2.I000O01llI0());
/* 2275 */                      l0oiiI0 l0oiii032 = (l0oiiI0) l0o1oooiolI001lllioOl2.I0000oI00();
/* 2281 */                      if (!TextUtils.isEmpty(string)) {
                                }
/* 2531 */                      if (!z9) {
                                }
                            }
/* 2667 */                  l0I1IOo l0i1ioo = this.I00iiI;
/* 2669 */                  I00O0o1oo(l0i1ioo);
/* 2676 */                  if (l0i1ioo.I010ioo()) {
/* 2702 */                      String strI011olOoO = Log.isLoggable(I00II0oii1o().I010l1O(), 2) ? I00i0oil().I011olOoO(l0oiii0) : null;
/* 2703 */                      I00i0oil();
/* 2706 */                      byte[] bArrI00000oIO = l0oiii0.I00000oIO();
/* 2710 */                      I000iOII(arrayList4222);
/* 2717 */                      this.I00l0I0l0lO1.I00l0I0l0lO1.I00000oOI(j);
/* 2733 */                      I00II0oii1o().I00lll10.I0000oI00("Uploading data. app, uncompressed size, data", str5, Integer.valueOf(bArrI00000oIO.length), strI011olOoO);
/* 2737 */                      this.I00oO101o = true;
/* 2739 */                      I00O0o1oo(l0i1ioo);
/* 2747 */                      l0i1ioo.I010l1ol111(str5, lioi0lioI010OIo1l222, l0oiii0, new l1Il1IliOI1l(this, str5, arrayList7));
/* 2750 */                      return;
                            }
/* 2750 */                  return;
                        }
/* 128 */               ArrayList arrayList9 = new ArrayList();
/* 131 */               int length = 0;
                        String str7 = strValueOf;
                        while (true) {
/* 132 */                   long j3 = cursorQuery.getLong(i7);
                            try {
/* 136 */                       byte[] blob = cursorQuery.getBlob(i8);
/* 142 */                       lio010i lio010iVarI00i0oil = iol1loo1ioI00i01iIIliI.I00iiI.I00i0oil();
                                try {
/* 148 */                           ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
/* 153 */                           GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
/* 158 */                           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 163 */                           byte[] bArr = new byte[Barcode.FORMAT_UPC_E];
/* 165 */                           iol1loo1io = iol1loo1ioI00i01iIIliI;
                                    r23 = str7;
                                    while (true) {
                                        try {
/* 167 */                                   int i13 = gZIPInputStream.read(bArr);
/* 171 */                                   if (i13 <= 0) {
                                                break;
                                            }
/* 429 */                                   r23 = l0olllo1i3;
                                            try {
                                                try {
/* 432 */                                           byteArrayOutputStream.write(bArr, 0, i13);
/* 435 */                                           l0olllo1i3 = r23;
                                                    r23 = r23;
                                                } catch (IOException e11) {
/* 439 */                                           e = e11;
                                                    try {
/* 457 */                                               ((l0olllO1i) lio010iVarI00i0oil.I00iOIl).I00II0oii1o().I00ilO0.I0000Il00O("Failed to ungzip content", e);
/* 460 */                                               throw e;
                                                    } catch (IOException e12) {
/* 461 */                                               e = e12;
/* 482 */                                               r23.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Failed to unzip queued bundle. appId", e);
                                                        r23 = r23;
/* 489 */                                               if (cursorQuery.moveToNext()) {
                                                            break;
                                                        } else {
                                                            break;
                                                        }
/* 502 */                                               cursorQuery.close();
                                                        list2 = arrayList9;
                                                        str2 = r23;
/* 550 */                                               if (list2.isEmpty()) {
                                                        }
                                                    }
                                                }
                                            } catch (SQLiteException e13) {
/* 463 */                                       e = e13;
/* 537 */                                       r23.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Error querying bundles. appId", e);
/* 540 */                                       list = Collections.EMPTY_LIST;
                                                str4 = r23;
                                                str3 = r23;
/* 542 */                                       if (cursorQuery != null) {
                                                }
/* 115 */                                       list2 = list;
                                                str2 = str3;
/* 550 */                                       if (list2.isEmpty()) {
                                                }
                                            }
                                        } catch (IOException e14) {
/* 425 */                                   e = e14;
/* 426 */                                   r23 = l0olllo1i3;
/* 457 */                                   ((l0olllO1i) lio010iVarI00i0oil.I00iOIl).I00II0oii1o().I00ilO0.I0000Il00O("Failed to ungzip content", e);
/* 460 */                                   throw e;
                                        }
                                    }
/* 173 */                           gZIPInputStream.close();
/* 176 */                           byteArrayInputStream.close();
/* 179 */                           byteArray = byteArrayOutputStream.toByteArray();
                                } catch (IOException e15) {
/* 441 */                           e = e15;
/* 442 */                           iol1loo1io = iol1loo1ioI00i01iIIliI;
                                }
                            } catch (IOException e16) {
/* 465 */                       e = e16;
/* 466 */                       iol1loo1io = iol1loo1ioI00i01iIIliI;
/* 468 */                       r23 = l0olllo1i3;
                            }
/* 187 */                   if (!arrayList9.isEmpty() && byteArray.length + length > iMax) {
                                break;
                            }
                            try {
/* 203 */                       l0ooIi1oOO l0ooii1ooo4 = (l0ooIi1oOO) lio010i.I01IlIoOI(l100ll0OOIoO.I00OilO00Il(), byteArray);
/* 209 */                       if (!arrayList9.isEmpty()) {
/* 220 */                           l100ll0OOIoO l100ll0ooioo4 = (l100ll0OOIoO) ((Pair) arrayList9.get(0)).first;
/* 226 */                           l100ll0OOIoO l100ll0ooioo5 = (l100ll0OOIoO) l0ooii1ooo4.I0000oI00();
/* 240 */                           if (!l100ll0ooioo4.I00o0iI0io1().equals(l100ll0ooioo5.I00o0iI0io1()) || !l100ll0ooioo4.I00oOio10iI1().equals(l100ll0ooioo5.I00oOio10iI1()) || l100ll0ooioo4.I00olI() != l100ll0ooioo5.I00olI() || !l100ll0ooioo4.I00oliIiO01i().equals(l100ll0ooioo5.I00oliIiO01i())) {
                                        break;
                                    }
/* 284 */                           Iterator it10 = l100ll0ooioo4.I01Olioli().iterator();
                                    Iterator it11 = r23;
                                    while (true) {
/* 294 */                               if (!it10.hasNext()) {
/* 322 */                                   jI001l0I00 = -1;
                                            r23 = it11;
                                            break;
                                        }
/* 300 */                               l1IOl1iI00l l1iol1ii00l = (l1IOl1iI00l) it10.next();
/* 302 */                               Iterator it12 = it10;
/* 312 */                               if ("_npa".equals(l1iol1ii00l.I001IO000())) {
/* 314 */                                   jI001l0I00 = l1iol1ii00l.I001l0I00();
                                            r23 = it12;
                                            break;
                                        } else {
/* 319 */                                   it10 = it12;
                                            it11 = it12;
                                        }
                                    }
/* 328 */                           Iterator it13 = l100ll0ooioo5.I01Olioli().iterator();
                                    while (true) {
/* 336 */                               if (!it13.hasNext()) {
/* 359 */                                   jI001l0I002 = -1;
                                            break;
                                        }
/* 342 */                               l1IOl1iI00l l1iol1ii00l2 = (l1IOl1iI00l) it13.next();
/* 352 */                               if ("_npa".equals(l1iol1ii00l2.I001IO000())) {
/* 354 */                                   jI001l0I002 = l1iol1ii00l2.I001l0I00();
                                            break;
                                        }
                                    }
/* 363 */                           if (jI001l0I00 != jI001l0I002) {
                                        break;
                                    }
                                }
/* 370 */                       if (!cursorQuery.isNull(2)) {
/* 372 */                           int i14 = cursorQuery.getInt(2);
/* 376 */                           l0ooii1ooo4.I0000Il00O();
/* 383 */                           ((l100ll0OOIoO) l0ooii1ooo4.I00iiI).I010l10O(i14);
                                }
/* 387 */                       length += byteArray.length;
/* 402 */                       arrayList9.add(Pair.create((l100ll0OOIoO) l0ooii1ooo4.I0000oI00(), Long.valueOf(j3)));
                            } catch (IOException e17) {
/* 421 */                       l0olllo1i3.I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str5), "Failed to merge queued bundle. appId", e17);
                            }
/* 405 */                   r23 = l0olllo1i3;
/* 489 */                   if (cursorQuery.moveToNext() || length > iMax) {
                                break;
                                break;
                            }
/* 494 */                   iol1loo1ioI00i01iIIliI = iol1loo1io;
/* 496 */                   l0olllo1i3 = r23;
/* 498 */                   i7 = 0;
/* 499 */                   i8 = 1;
                            str7 = r23;
                        }
/* 502 */               cursorQuery.close();
                        list2 = arrayList9;
                        str2 = r23;
/* 550 */               if (list2.isEmpty()) {
                        }
                    } catch (Throwable th5) {
/* 509 */               th = th5;
/* 521 */               cursor = null;
/* 2751 */              if (cursor != null) {
/* 2753 */                  cursor.close();
                        }
/* 3380 */              throw th;
                    }
                }

                public final boolean I000o00OoI0I(String str, String str2) throws Throwable {
/* 1 */             iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 3 */             I00O0o1oo(iol1loo1io);
/* 6 */             l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str);
/* 10 */            HashMap map = this.I0100i;
/* 13 */            if (l0iiiiI01Ol1o0 != null && I00iIO().I01II10(str, l0iiiiI01Ol1o0.I00II0Ol1O0l())) {
/* 29 */                map.remove(str2);
/* 12 */                return true;
                    }
/* 37 */            lil1io lil1ioVar = (lil1io) map.get(str2);
/* 39 */            if (lil1ioVar != null) {
/* 48 */                lil1ioVar.I00000oIO.I00IoO0().getClass();
/* 59 */                if (System.currentTimeMillis() < lil1ioVar.I0000Il00O) {
/* 62 */                    return false;
                        }
                    }
/* 12 */            return true;
                }

                public final void I000oI1ioi(String str) {
                    l0oiiI0 l0oiii0;
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 12 */            this.I00oOio10iI1 = true;
                    try {
/* 15 */                l0olllO1i l0olllo1i = this.I00ll1;
/* 17 */                l0olllo1i.getClass();
/* 24 */                Boolean bool = l0olllo1i.I000OOo1O().I00ilI0I1;
/* 26 */                if (bool == null) {
/* 36 */                    I00II0oii1o().I00l0I0l0lO1.I00000oOI("Upload data called on the client side before use of service was decided");
                        } else if (bool.booleanValue()) {
/* 58 */                    I00II0oii1o().I00ilO0.I00000oOI("Upload called in the client side when service should be used");
                        } else if (this.I00o0iI0io1 > 0) {
/* 71 */                    I00Io1lO();
                        } else {
/* 76 */                    l0I1IOo l0i1ioo = this.I00iiI;
/* 78 */                    I00O0o1oo(l0i1ioo);
/* 85 */                    if (l0i1ioo.I010ioo()) {
/* 103 */                       iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 105 */                       I00O0o1oo(iol1loo1io);
/* 112 */                       if (iol1loo1io.I010l1O(str)) {
/* 127 */                           iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 129 */                           I00O0o1oo(iol1loo1io2);
/* 132 */                           lII0I0I000I.I0000O(str);
/* 135 */                           iol1loo1io2.I010II();
/* 138 */                           iol1loo1io2.I010OIo1l();
/* 151 */                           List listI010l10O = iol1loo1io2.I010l10O(str, liIlli.I00000oOI(lIoOOO.GOOGLE_SIGNAL), 1);
/* 168 */                           liloI0Io liloi0io = listI010l10O.isEmpty() ? null : (liloI0Io) listI010l10O.get(0);
/* 170 */                           if (liloi0io != null && (l0oiii0 = liloi0io.I00000oOI) != null) {
/* 188 */                               I00II0oii1o().I00lll10.I0000oI00("[sgtm] Uploading data from upload queue. appId, type, url", str, liloi0io.I0000oI00, liloi0io.I0000Il00O);
/* 191 */                               byte[] bArrI00000oIO = l0oiii0.I00000oIO();
/* 208 */                               if (Log.isLoggable(I00II0oii1o().I010l1O(), 2)) {
/* 210 */                                   lio010i lio010iVar = this.I00io1l;
/* 212 */                                   I00O0o1oo(lio010iVar);
/* 232 */                                   I00II0oii1o().I00lll10.I0000oI00("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrI00000oIO.length), lio010iVar.I011olOoO(l0oiii0));
                                        }
/* 243 */                               liOi0lIo lioi0lio = new liOi0lIo(liloi0io.I0000Il00O, liloi0io.I0000O, liloi0io.I0000oI00, null);
/* 246 */                               this.I00oO101o = true;
/* 248 */                               l0I1IOo l0i1ioo2 = this.I00iiI;
/* 250 */                               I00O0o1oo(l0i1ioo2);
/* 256 */                               l1IllOOOo1 l1illoooo1 = new l1IllOOOo1(6);
/* 259 */                               l1illoooo1.I00iiI = str;
/* 261 */                               l1illoooo1.I00iiO = liloi0io;
/* 263 */                               l1illoooo1.I00iio = this;
/* 265 */                               VarHandle.storeStoreFence();
/* 268 */                               l0i1ioo2.I010l1ol111(str, lioi0lio, l0oiii0, l1illoooo1);
                                    }
                                } else {
/* 122 */                           I00II0oii1o().I00lll10.I0000Il00O("[sgtm] Upload queue has no batches for appId", str);
                                }
                            } else {
/* 95 */                        I00II0oii1o().I00lll10.I00000oOI("Network not connected, ignoring upload request");
/* 98 */                        I00Io1lO();
                            }
                        }
/* 271 */               this.I00oOio10iI1 = false;
/* 273 */               I00Io1o110i();
                    } catch (Throwable th) {
/* 277 */               this.I00oOio10iI1 = false;
/* 279 */               I00Io1o110i();
/* 437 */               throw th;
                    }
                }

                public final void I00100l0(String str, boolean z, Long l, Long l2) throws Throwable {
/* 1 */             iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 3 */             I00O0o1oo(iol1loo1io);
/* 6 */             l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str);
/* 10 */            if (l0iiiiI01Ol1o0 != null) {
/* 12 */                l0olllO1i l0olllo1i = l0iiiiI01Ol1o0.I00000oIO;
/* 14 */                l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 16 */                l0olllO1i.I000II(l0o10ooo0);
/* 19 */                l0o10ooo0.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I001iOo1i0O != z;
/* 36 */                l0iiiiI01Ol1o0.I001iOo1i0O = z;
/* 38 */                l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 40 */                l0olllO1i.I000II(l0o10ooo02);
/* 43 */                l0o10ooo02.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= !Objects.equals(l0iiiiI01Ol1o0.I001l0I00, l);
/* 58 */                l0iiiiI01Ol1o0.I001l0I00 = l;
/* 60 */                l0o10OoO0 l0o10ooo03 = l0olllo1i.I00io1l;
/* 62 */                l0olllO1i.I000II(l0o10ooo03);
/* 65 */                l0o10ooo03.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= !Objects.equals(l0iiiiI01Ol1o0.I001lIiIIo1O, l2);
/* 80 */                l0iiiiI01Ol1o0.I001lIiIIo1O = l2;
/* 86 */                if (l0iiiiI01Ol1o0.I000oI1ioi()) {
/* 88 */                    iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 90 */                    I00O0o1oo(iol1loo1io2);
/* 93 */                    iol1loo1io2.I01OlIoIl(l0iiiiI01Ol1o0, false);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00100o1O0lo(String str, l0ooIi1oOO l0ooii1ooo) {
                    int iI01Ilioliio;
                    int iIndexOf;
/* 1 */             l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 3 */             I00O0o1oo(l0l1ol11Var);
/* 6 */             l0l1ol11Var.I010II();
/* 9 */             l0l1ol11Var.I010l1O(str);
/* 12 */            I1Io0i0II i1Io0i0II = l0l1ol11Var.I00ilI0I1;
/* 18 */            Set set = (Set) i1Io0i0II.get(str);
/* 20 */            if (set != null) {
/* 22 */                l0ooii1ooo.I0000Il00O();
/* 31 */                ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01101olii(set);
                    }
/* 34 */            I00O0o1oo(l0l1ol11Var);
/* 37 */            l0l1ol11Var.I010II();
/* 40 */            l0l1ol11Var.I010l1O(str);
/* 47 */            if (i1Io0i0II.get(str) != null && (((Set) i1Io0i0II.get(str)).contains("device_model") || ((Set) i1Io0i0II.get(str)).contains("device_info"))) {
/* 78 */                l0ooii1ooo.I0000Il00O();
/* 85 */                ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01I01Oolii();
                    }
/* 88 */            I00O0o1oo(l0l1ol11Var);
/* 96 */            if (l0l1ol11Var.I011Io0I1ioi(str)) {
/* 102 */               String strI01iiIii10O = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01iiIii10O();
/* 110 */               if (!TextUtils.isEmpty(strI01iiIii10O) && (iIndexOf = strI01iiIii10O.indexOf(".")) != -1) {
/* 121 */                   String strSubstring = strI01iiIii10O.substring(0, iIndexOf);
/* 125 */                   l0ooii1ooo.I0000Il00O();
/* 132 */                   ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00l0I0l0lO1(strSubstring);
                        }
                    }
/* 135 */           I00O0o1oo(l0l1ol11Var);
/* 138 */           l0l1ol11Var.I010II();
/* 141 */           l0l1ol11Var.I010l1O(str);
/* 148 */           if (i1Io0i0II.get(str) != null && ((Set) i1Io0i0II.get(str)).contains("user_id") && (iI01Ilioliio = lio010i.I01Ilioliio("_id", l0ooii1ooo)) != -1) {
/* 172 */               l0ooii1ooo.I0000Il00O();
/* 179 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00iIO(iI01Ilioliio);
                    }
/* 182 */           I00O0o1oo(l0l1ol11Var);
/* 185 */           l0l1ol11Var.I010II();
/* 188 */           l0l1ol11Var.I010l1O(str);
/* 195 */           if (i1Io0i0II.get(str) != null && ((Set) i1Io0i0II.get(str)).contains("google_signals")) {
/* 211 */               l0ooii1ooo.I0000Il00O();
/* 218 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I010ioo();
                    }
/* 221 */           I00O0o1oo(l0l1ol11Var);
/* 228 */           if (l0l1ol11Var.I011Ol0(str)) {
/* 230 */               l0ooii1ooo.I0000Il00O();
/* 237 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Io001O();
/* 250 */               if (I00000oIO(str).I000OOo1O(l1iioiool.ANALYTICS_STORAGE)) {
/* 252 */                   HashMap map = this.I00oooO;
/* 258 */                   lil111OOoo lil111oooo = (lil111OOoo) map.get(str);
/* 260 */                   if (lil111oooo != null) {
/* 274 */                       long jI010lI0oi = I00Ol1ll1().I010lI0oi(str, iol1II1ii1i.I00iIi0i1o) + lil111oooo.I00000oOI;
/* 279 */                       I00IoO0().getClass();
/* 288 */                       if (jI010lI0oi < SystemClock.elapsedRealtime()) {
/* 300 */                           lil111oooo = new lil111OOoo(this, I00iIO().I01O1lIi());
/* 303 */                           map.put(str, lil111oooo);
                                }
/* 306 */                       String str2 = lil111oooo.I00000oIO;
/* 308 */                       l0ooii1ooo.I0000Il00O();
/* 315 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I0110OiO(str2);
                            }
                        }
                    }
/* 318 */           I00O0o1oo(l0l1ol11Var);
/* 321 */           l0l1ol11Var.I010II();
/* 324 */           l0l1ol11Var.I010l1O(str);
/* 331 */           if (i1Io0i0II.get(str) == null || !((Set) i1Io0i0II.get(str)).contains("enhanced_user_id")) {
/* 900 */               return;
                    }
/* 347 */           l0ooii1ooo.I0000Il00O();
/* 354 */           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01101IOlO();
                }

                public final void I0010I0i(l0ooIi1oOO l0ooii1ooo, I0Oo1I101o i0Oo1I101o) {
                    String strI01O1lIi;
                    String strI01O1lIi2;
/* 12 */            for (int i = 0; i < l0ooii1ooo.I00OIo(); i++) {
/* 26 */                l0l0O000 l0l0o000 = (l0l0O000) ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01OlOoii0(i).I000OiO();
/* 32 */                Iterator it = l0l0o000.I000O01llI0().iterator();
                        while (true) {
/* 40 */                    if (!it.hasNext()) {
                                break;
                            }
/* 58 */                    if ("_c".equals(((l0lliIlIO) it.next()).I001IIilI0O())) {
/* 86 */                        if (((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00oo1iO0ll() >= I00Ol1ll1().I010o0o0oO(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), iol1II1ii1i.I00iOIl)) {
/* 102 */                           int iI010o0o0oO = I00Ol1ll1().I010o0o0oO(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), iol1II1ii1i.I00lll10);
/* 106 */                           LinkedList linkedList = this.I00o101lO;
/* 110 */                           lio010i lio010iVar = this.I00io1l;
/* 116 */                           if (iI010o0o0oO > 0) {
/* 118 */                               iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 120 */                               I00O0o1oo(iol1loo1io);
/* 152 */                               if (iol1loo1io.I01OlOoii0(I00000oOI(), ((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), false, false, false, true).I000II > iI010o0o0oO) {
/* 154 */                                   l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
/* 160 */                                   l0loooo1ioiI00IO1.I000O01llI0("_tnr");
/* 165 */                                   l0loooo1ioiI00IO1.I000OiO(1L);
/* 174 */                                   l0l0o000.I000iOII((l0lliIlIO) l0loooo1ioiI00IO1.I0000oI00());
                                        } else {
/* 197 */                                   if (I00Ol1ll1().I01101IOlO(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), iol1II1ii1i.I010101Oo1lO)) {
/* 203 */                                       strI01O1lIi2 = I00iIO().I01O1lIi();
/* 207 */                                       l0lOoOo1Ioi l0loooo1ioiI00IO12 = l0lliIlIO.I00IO1();
/* 211 */                                       l0loooo1ioiI00IO12.I000O01llI0("_tu");
/* 214 */                                       l0loooo1ioiI00IO12.I000OOo1O(strI01O1lIi2);
/* 223 */                                       l0l0o000.I000iOII((l0lliIlIO) l0loooo1ioiI00IO12.I0000oI00());
                                            } else {
/* 227 */                                       strI01O1lIi2 = null;
                                            }
/* 228 */                                   l0lOoOo1Ioi l0loooo1ioiI00IO13 = l0lliIlIO.I00IO1();
/* 232 */                                   l0loooo1ioiI00IO13.I000O01llI0("_tr");
/* 237 */                                   l0loooo1ioiI00IO13.I000OiO(1L);
/* 246 */                                   l0l0o000.I000iOII((l0lliIlIO) l0loooo1ioiI00IO13.I0000oI00());
/* 249 */                                   I00O0o1oo(lio010iVar);
/* 260 */                                   li1l0Iiiii li1l0iiiiiI011lO1liO1O = lio010iVar.I011lO1liO1O(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), l0ooii1ooo, l0l0o000, strI01O1lIi2);
/* 264 */                                   if (li1l0iiiiiI011lO1liO1O != null) {
/* 282 */                                       I00II0oii1o().I00lll10.I0000O(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), "Generated trigger URI. appId, uri", li1l0iiiiiI011lO1liO1O.I00iOIl);
/* 285 */                                       iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 287 */                                       I00O0o1oo(iol1loo1io2);
/* 298 */                                       iol1loo1io2.I011iIOio(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), li1l0iiiiiI011lO1liO1O);
/* 313 */                                       if (!linkedList.contains(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O())) {
/* 323 */                                           linkedList.add(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O());
                                                }
                                            }
                                        }
                                    } else {
/* 346 */                               if (I00Ol1ll1().I01101IOlO(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), iol1II1ii1i.I010101Oo1lO)) {
/* 352 */                                   strI01O1lIi = I00iIO().I01O1lIi();
/* 356 */                                   l0lOoOo1Ioi l0loooo1ioiI00IO14 = l0lliIlIO.I00IO1();
/* 360 */                                   l0loooo1ioiI00IO14.I000O01llI0("_tu");
/* 363 */                                   l0loooo1ioiI00IO14.I000OOo1O(strI01O1lIi);
/* 372 */                                   l0l0o000.I000iOII((l0lliIlIO) l0loooo1ioiI00IO14.I0000oI00());
                                        } else {
/* 376 */                                   strI01O1lIi = null;
                                        }
/* 377 */                               l0lOoOo1Ioi l0loooo1ioiI00IO15 = l0lliIlIO.I00IO1();
/* 381 */                               l0loooo1ioiI00IO15.I000O01llI0("_tr");
/* 386 */                               l0loooo1ioiI00IO15.I000OiO(1L);
/* 395 */                               l0l0o000.I000iOII((l0lliIlIO) l0loooo1ioiI00IO15.I0000oI00());
/* 398 */                               I00O0o1oo(lio010iVar);
/* 409 */                               li1l0Iiiii li1l0iiiiiI011lO1liO1O2 = lio010iVar.I011lO1liO1O(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), l0ooii1ooo, l0l0o000, strI01O1lIi);
/* 413 */                               if (li1l0iiiiiI011lO1liO1O2 != null) {
/* 431 */                                   I00II0oii1o().I00lll10.I0000O(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), "Generated trigger URI. appId, uri", li1l0iiiiiI011lO1liO1O2.I00iOIl);
/* 434 */                                   iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 436 */                                   I00O0o1oo(iol1loo1io3);
/* 447 */                                   iol1loo1io3.I011iIOio(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O(), li1l0iiiiiI011lO1liO1O2);
/* 462 */                                   if (!linkedList.contains(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O())) {
/* 472 */                                       linkedList.add(((l100ll0OOIoO) i0Oo1I101o.I00000oOI).I00111O());
                                            }
                                        }
                                    }
                                }
/* 479 */                       l0l1iIIOl l0l1iiiol = (l0l1iIIOl) l0l0o000.I0000oI00();
/* 481 */                       l0ooii1ooo.I0000Il00O();
/* 488 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00Ol10(i, l0l1iiiol);
                            }
                        }
                    }
                }

                public final void I0010o(String str, l0lOoOo1Ioi l0loooo1ioi, Bundle bundle, String str2) {
                    int iI010l10O;
/* 36 */            List listI00000oIO = I00Ol1ll1().I01101IOlO(str2, iol1II1ii1i.I010lI0oi) ? iiIIl0oOoi.I00000oIO("_o", "_sn", "_sc", "_si", "deep_link_url") : iiIIl0oOoi.I00000oIO("_o", "_sn", "_sc", "_si");
/* 53 */            if (lioil0ilIOi.I01I1Oo0oll(((l0lliIlIO) l0loooo1ioi.I00iiI).I001IIilI0O()) || lioil0ilIOi.I01I1Oo0oll(str)) {
/* 93 */                iI010l10O = I00Ol1ll1().I010l10O(str2, true);
                    } else {
/* 62 */                iIl1iil iil1iilI00Ol1ll1 = I00Ol1ll1();
/* 66 */                iil1iilI00Ol1ll1.getClass();
/* 83 */                iI010l10O = Math.max(Math.min(iil1iilI00Ol1ll1.I010o0o0oO(str2, iol1II1ii1i.I00i0ilIl0i), 500), 100);
                    }
                    long j = iI010l10O;
/* 119 */           long jCodePointCount = ((l0lliIlIO) l0loooo1ioi.I00iiI).I001i1O0Ol().codePointCount(0, ((l0lliIlIO) l0loooo1ioi.I00iiI).I001i1O0Ol().length());
/* 124 */           I00iIO();
/* 131 */           String strI001IIilI0O = ((l0lliIlIO) l0loooo1ioi.I00iiI).I001IIilI0O();
/* 135 */           I00Ol1ll1();
/* 140 */           String strI010l1ol111 = lioil0ilIOi.I010l1ol111(true, strI001IIilI0O, 40);
/* 146 */           if (jCodePointCount <= j || listI00000oIO.contains(((l0lliIlIO) l0loooo1ioi.I00iiI).I001IIilI0O())) {
/* 1182 */              return;
                    }
/* 176 */           if ("_ev".equals(((l0lliIlIO) l0loooo1ioi.I00iiI).I001IIilI0O())) {
/* 178 */               I00iIO();
/* 201 */               bundle.putString("_ev", lioil0ilIOi.I010l1ol111(true, ((l0lliIlIO) l0loooo1ioi.I00iiI).I001i1O0Ol(), I00Ol1ll1().I010l10O(str2, true)));
/* 204 */               return;
                    }
/* 217 */           I00II0oii1o().I00li1OI.I0000O(strI010l1ol111, "Param value is too long; discarded. Name, value length", Long.valueOf(jCodePointCount));
/* 230 */           if (bundle.getLong("_err") == 0) {
/* 234 */               bundle.putLong("_err", 4L);
/* 241 */               if (bundle.getString("_ev") == null) {
/* 243 */                   bundle.putString("_ev", strI010l1ol111);
/* 248 */                   bundle.putLong("_el", jCodePointCount);
                        }
                    }
/* 259 */           bundle.remove(((l0lliIlIO) l0loooo1ioi.I00iiI).I001IIilI0O());
                }

                public final boolean I00111O(l0l0O000 l0l0o000) {
/* 7 */             ArrayList arrayList = new ArrayList(l0l0o000.I000O01llI0());
/* 13 */            int i = -1;
/* 14 */            int i2 = -1;
/* 23 */            for (int i3 = 0; i3 < arrayList.size(); i3++) {
/* 39 */                if ("value".equals(((l0lliIlIO) arrayList.get(i3)).I001IIilI0O())) {
/* 41 */                    i = i3;
                        } else if ("currency".equals(((l0lliIlIO) arrayList.get(i3)).I001IIilI0O())) {
/* 59 */                    i2 = i3;
                        }
                    }
/* 67 */            if (i == -1) {
/* 80 */                if (!I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I0110OiO) || !"_iap".equals(l0l0o000.I000o00OoI0I())) {
/* 189 */                   return true;
                        }
/* 94 */                I001lIiIIo1O(l0l0o000, "_c");
/* 97 */                I001l0I00(l0l0o000, 18, "value");
/* 10 */                return false;
                    }
/* 111 */           if (!((l0lliIlIO) arrayList.get(i)).I001i1lo1io() && !((l0lliIlIO) arrayList.get(i)).I001lllioOl()) {
/* 133 */               I00II0oii1o().I00li1OI.I00000oOI("Value must be specified with a numeric type.");
/* 136 */               l0l0o000.I000lI(i);
/* 139 */               I001lIiIIo1O(l0l0o000, "_c");
/* 142 */               I001l0I00(l0l0o000, 18, "value");
/* 10 */                return false;
                    }
/* 146 */           if (i2 != -1) {
/* 155 */               String strI001i1O0Ol = ((l0lliIlIO) arrayList.get(i2)).I001i1O0Ol();
/* 164 */               if (strI001i1O0Ol.length() == 3) {
/* 166 */                   int iCharCount = 0;
/* 171 */                   while (iCharCount < strI001i1O0Ol.length()) {
/* 173 */                       int iCodePointAt = strI001i1O0Ol.codePointAt(iCharCount);
/* 181 */                       if (Character.isLetter(iCodePointAt)) {
/* 187 */                           iCharCount += Character.charCount(iCodePointAt);
                                }
                            }
/* 189 */                   return true;
                        }
                    }
/* 199 */           I00II0oii1o().I00li1OI.I00000oOI("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
/* 202 */           l0l0o000.I000lI(i);
/* 205 */           I001lIiIIo1O(l0l0o000, "_c");
/* 210 */           I001l0I00(l0l0o000, 19, "currency");
/* 10 */            return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:109:0x0171 A[EDGE_INSN: B:109:0x0171->B:55:0x0171 BREAK  A[LOOP:0: B:36:0x010b->B:52:0x016b], SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:10:0x002a, B:11:0x0034, B:19:0x0048, B:24:0x0098, B:23:0x0086, B:25:0x00a5, B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x023b, B:86:0x024f, B:88:0x025a, B:96:0x0279, B:90:0x0260, B:92:0x0269, B:94:0x026f, B:95:0x0273, B:97:0x027c, B:98:0x0284, B:33:0x00ef, B:99:0x0285), top: B:106:0x0015, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00a5 A[Catch: all -> 0x0018, PHI: r0
                  0x00a5: PHI (r0v2 int) = (r0v0 int), (r0v35 int) binds: [B:12:0x003b, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:4:0x0015, B:8:0x001d, B:10:0x002a, B:11:0x0034, B:19:0x0048, B:24:0x0098, B:23:0x0086, B:25:0x00a5, B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x023b, B:86:0x024f, B:88:0x025a, B:96:0x0279, B:90:0x0260, B:92:0x0269, B:94:0x026f, B:95:0x0273, B:97:0x027c, B:98:0x0284, B:33:0x00ef, B:99:0x0285), top: B:106:0x0015, inners: #3 }] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00de A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x023b, B:86:0x024f, B:88:0x025a, B:96:0x0279, B:90:0x0260, B:92:0x0269, B:94:0x026f, B:95:0x0273, B:97:0x027c, B:98:0x0284, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:33:0x00ef A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x023b, B:86:0x024f, B:88:0x025a, B:96:0x0279, B:90:0x0260, B:92:0x0269, B:94:0x026f, B:95:0x0273, B:97:0x027c, B:98:0x0284, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[Catch: all -> 0x016e, TRY_ENTER, TryCatch #2 {all -> 0x016e, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:41:0x0127, B:43:0x0133, B:44:0x0135, B:48:0x0154, B:50:0x015e, B:55:0x0171, B:56:0x0177, B:58:0x017d, B:60:0x0190, B:62:0x01a7, B:63:0x01a9, B:65:0x01b9, B:67:0x01d4, B:69:0x01f9, B:70:0x0208, B:71:0x020c, B:73:0x0212, B:74:0x0219, B:77:0x0227, B:79:0x022b, B:82:0x0232, B:83:0x0233), top: B:107:0x0102, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x017d A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:41:0x0127, B:43:0x0133, B:44:0x0135, B:48:0x0154, B:50:0x015e, B:55:0x0171, B:56:0x0177, B:58:0x017d, B:60:0x0190, B:62:0x01a7, B:63:0x01a9, B:65:0x01b9, B:67:0x01d4, B:69:0x01f9, B:70:0x0208, B:71:0x020c, B:73:0x0212, B:74:0x0219, B:77:0x0227, B:79:0x022b, B:82:0x0232, B:83:0x0233), top: B:107:0x0102, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x01d4 A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:41:0x0127, B:43:0x0133, B:44:0x0135, B:48:0x0154, B:50:0x015e, B:55:0x0171, B:56:0x0177, B:58:0x017d, B:60:0x0190, B:62:0x01a7, B:63:0x01a9, B:65:0x01b9, B:67:0x01d4, B:69:0x01f9, B:70:0x0208, B:71:0x020c, B:73:0x0212, B:74:0x0219, B:77:0x0227, B:79:0x022b, B:82:0x0232, B:83:0x0233), top: B:107:0x0102, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0212 A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #2 {all -> 0x016e, blocks: (B:35:0x0102, B:36:0x010b, B:39:0x0115, B:41:0x0127, B:43:0x0133, B:44:0x0135, B:48:0x0154, B:50:0x015e, B:55:0x0171, B:56:0x0177, B:58:0x017d, B:60:0x0190, B:62:0x01a7, B:63:0x01a9, B:65:0x01b9, B:67:0x01d4, B:69:0x01f9, B:70:0x0208, B:71:0x020c, B:73:0x0212, B:74:0x0219, B:77:0x0227, B:79:0x022b, B:82:0x0232, B:83:0x0233), top: B:107:0x0102, inners: #0 }] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x024f A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x023b, B:86:0x024f, B:88:0x025a, B:96:0x0279, B:90:0x0260, B:92:0x0269, B:94:0x026f, B:95:0x0273, B:97:0x027c, B:98:0x0284, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0260 A[Catch: all -> 0x0018, SQLiteException -> 0x00cd, TryCatch #3 {SQLiteException -> 0x00cd, blocks: (B:27:0x00ba, B:30:0x00d0, B:32:0x00de, B:34:0x00fa, B:84:0x023b, B:86:0x024f, B:88:0x025a, B:96:0x0279, B:90:0x0260, B:92:0x0269, B:94:0x026f, B:95:0x0273, B:97:0x027c, B:98:0x0284, B:33:0x00ef), top: B:108:0x00ba, outer: #1 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001IIilI0O(boolean z, int i, Throwable th, byte[] bArr, String str, List list, Map map) {
                    byte[] bArr2;
                    Iterator it;
                    boolean zHasNext;
                    lIoOOO lioooo;
                    Iterator it2;
                    List listI010l10O;
/* 3 */             int i2 = i;
/* 7 */             l0I1IOo l0i1ioo = this.I00iiI;
/* 13 */            I00iOIl().I010II();
/* 16 */            I00iIi0i1o();
/* 20 */            if (bArr == null) {
                        try {
/* 22 */                    bArr2 = new byte[0];
                        } finally {
/* 693 */                   this.I00oO101o = false;
/* 695 */                   I00Io1o110i();
                        }
                    } else {
/* 28 */                bArr2 = bArr;
                    }
/* 41 */            if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I01101olii)) {
/* 43 */                lio010i lio010iVar = this.I00io1l;
/* 45 */                I00O0o1oo(lio010iVar);
/* 50 */                lio010iVar.I010l1O(map);
                    }
/* 53 */            ArrayList arrayList = this.I00oli;
/* 55 */            lII0I0I000I.I000II(arrayList);
/* 58 */            this.I00oli = null;
/* 60 */            if (!z) {
/* 170 */               IOloiOI1 iOloiOI1 = I00II0oii1o().I00lll10;
/* 174 */               Integer numValueOf = Integer.valueOf(i2);
/* 182 */               iOloiOI1.I0000O(numValueOf, "Network upload successful with code, uploadAttempted", Boolean.valueOf(z));
/* 185 */               if (z) {
                            try {
/* 189 */                       l0O0o010I l0o0o010i = this.I00l0I0l0lO1.I00ioIO;
/* 195 */                       I00IoO0().getClass();
/* 202 */                       l0o0o010i.I00000oOI(System.currentTimeMillis());
/* 215 */                       this.I00l0I0l0lO1.I00l0I0l0lO1.I00000oOI(0L);
/* 218 */                       I00Io1lO();
/* 221 */                       if (z) {
/* 248 */                           I00II0oii1o().I00lll10.I00000oOI("Purged empty bundles");
                                } else {
/* 236 */                           I00II0oii1o().I00lll10.I0000O(numValueOf, "Successful upload. Got network response. code, size", Integer.valueOf(bArr2.length));
                                }
/* 251 */                       iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 253 */                       I00O0o1oo(iol1loo1io);
/* 256 */                       iol1loo1io.I01Io000();
                                try {
/* 261 */                           HashMap map2 = new HashMap();
/* 264 */                           it = list.iterator();
                                    while (true) {
/* 268 */                               zHasNext = it.hasNext();
/* 274 */                               lioooo = lIoOOO.SGTM_CLIENT;
/* 276 */                               if (zHasNext) {
                                            break;
                                        }
/* 282 */                               Pair pair = (Pair) it.next();
/* 286 */                               l0oiiI0 l0oiii0 = (l0oiiI0) pair.first;
/* 290 */                               liOi0lIo lioi0lio = (liOi0lIo) pair.second;
/* 294 */                               if (lioi0lio.I0000Il00O != lioooo) {
/* 296 */                                   iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 298 */                                   I00O0o1oo(iol1loo1io2);
/* 302 */                                   String str2 = lioi0lio.I00000oIO;
/* 304 */                                   Map map3 = lioi0lio.I00000oOI;
/* 306 */                                   if (map3 == null) {
/* 308 */                                       map3 = Collections.EMPTY_MAP;
                                            }
/* 322 */                                   ArrayList arrayList2 = arrayList;
/* 327 */                                   long jI010ioo = iol1loo1io2.I010ioo(str, l0oiii0, str2, map3, lioi0lio.I0000Il00O, null);
/* 335 */                                   if (lioi0lio.I0000Il00O == lIoOOO.GOOGLE_SIGNAL_PENDING && jI010ioo != -1 && !l0oiii0.I001i1lo1io().isEmpty()) {
/* 359 */                                       map2.put(l0oiii0.I001i1lo1io(), Long.valueOf(jI010ioo));
                                            }
/* 362 */                                   arrayList = arrayList2;
                                        }
                                    }
/* 370 */                           ArrayList<Long> arrayList3 = arrayList;
/* 372 */                           it2 = list.iterator();
/* 380 */                           while (it2.hasNext()) {
/* 386 */                               Pair pair2 = (Pair) it2.next();
/* 391 */                               l0oiiI0 l0oiii02 = (l0oiiI0) pair2.first;
/* 395 */                               liOi0lIo lioi0lio2 = (liOi0lIo) pair2.second;
/* 399 */                               if (lioi0lio2.I0000Il00O == lioooo) {
/* 410 */                                   Long l = (Long) map2.get(l0oiii02.I001i1lo1io());
/* 412 */                                   iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 414 */                                   I00O0o1oo(iol1loo1io3);
/* 417 */                                   lIoOOO lioooo2 = lioooo;
/* 418 */                                   String str3 = lioi0lio2.I00000oIO;
/* 420 */                                   Map map4 = lioi0lio2.I00000oOI;
/* 422 */                                   if (map4 == null) {
/* 424 */                                       map4 = Collections.EMPTY_MAP;
                                            }
/* 434 */                                   iol1loo1io3.I010ioo(str, l0oiii02, str3, map4, lioi0lio2.I0000Il00O, l);
/* 437 */                                   lioooo = lioooo2;
                                        }
                                    }
/* 445 */                           iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 447 */                           I00O0o1oo(iol1loo1io4);
/* 459 */                           listI010l10O = iol1loo1io4.I010l10O(str, liIlli.I00000oOI(lioooo), 1);
/* 467 */                           if (!listI010l10O.isEmpty()) {
/* 475 */                               long j = ((liloI0Io) listI010l10O.get(0)).I0001Ioi1lo;
/* 481 */                               I00IoO0().getClass();
/* 504 */                               if (System.currentTimeMillis() > ((Long) iol1II1ii1i.I00IO1.I00000oIO(null)).longValue() + j) {
/* 518 */                                   I00II0oii1o().I00l0I0l0lO1.I0000O(str, "[sgtm] client batches are queued too long. appId, creationTime", Long.valueOf(j));
                                        }
                                    }
/* 529 */                           for (Long l2 : arrayList3) {
                                        try {
/* 538 */                                   iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 540 */                                   I00O0o1oo(iol1loo1io5);
/* 547 */                                   iol1loo1io5.I010o0o0oO(l2.longValue());
                                        } catch (SQLiteException e) {
/* 552 */                                   ArrayList arrayList4 = this.I00oliIiO01i;
/* 554 */                                   if (arrayList4 == null || !arrayList4.contains(l2)) {
/* 563 */                                       throw e;
                                            }
                                        }
                                    }
/* 564 */                           iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 566 */                           I00O0o1oo(iol1loo1io6);
/* 569 */                           iol1loo1io6.I01Io001O();
/* 572 */                           iOl1lOo1IO iol1loo1io7 = this.I00iiO;
/* 574 */                           I00O0o1oo(iol1loo1io7);
/* 577 */                           iol1loo1io7.I01Io1();
/* 581 */                           this.I00oliIiO01i = null;
/* 583 */                           I00O0o1oo(l0i1ioo);
/* 590 */                           if (!l0i1ioo.I010ioo()) {
/* 592 */                               iOl1lOo1IO iol1loo1io8 = this.I00iiO;
/* 594 */                               I00O0o1oo(iol1loo1io8);
/* 601 */                               if (iol1loo1io8.I010l1O(str)) {
/* 603 */                                   I000oI1ioi(str);
                                        } else {
/* 609 */                                   I00O0o1oo(l0i1ioo);
/* 616 */                                   if (l0i1ioo.I010ioo() && I00IlilI0i0i()) {
/* 624 */                                       I000l1();
                                            } else {
/* 628 */                                       this.I00oo1iO0ll = -1L;
/* 630 */                                       I00Io1lO();
                                            }
                                        }
/* 634 */                               this.I00o0iI0io1 = 0L;
                                    }
                                } catch (Throwable th2) {
/* 637 */                           iOl1lOo1IO iol1loo1io9 = this.I00iiO;
/* 639 */                           I00O0o1oo(iol1loo1io9);
/* 642 */                           iol1loo1io9.I01Io1();
/* 645 */                           throw th2;
                                }
                            } catch (SQLiteException e2) {
/* 654 */                       I00II0oii1o().I00ilO0.I0000Il00O("Database error while trying to delete uploaded bundles", e2);
/* 661 */                       I00IoO0().getClass();
/* 668 */                       this.I00o0iI0io1 = SystemClock.elapsedRealtime();
/* 684 */                       I00II0oii1o().I00lll10.I0000Il00O("Disable upload, time", Long.valueOf(this.I00o0iI0io1));
                            }
                        } else {
/* 215 */                   this.I00l0I0l0lO1.I00l0I0l0lO1.I00000oOI(0L);
/* 218 */                   I00Io1lO();
/* 221 */                   if (z) {
                            }
/* 251 */                   iOl1lOo1IO iol1loo1io10 = this.I00iiO;
/* 253 */                   I00O0o1oo(iol1loo1io10);
/* 256 */                   iol1loo1io10.I01Io000();
/* 261 */                   HashMap map22 = new HashMap();
/* 264 */                   it = list.iterator();
                            while (true) {
/* 268 */                       zHasNext = it.hasNext();
/* 274 */                       lioooo = lIoOOO.SGTM_CLIENT;
/* 276 */                       if (zHasNext) {
                                }
                            }
/* 370 */                   ArrayList<Long> arrayList32 = arrayList;
/* 372 */                   it2 = list.iterator();
/* 380 */                   while (it2.hasNext()) {
                            }
/* 445 */                   iOl1lOo1IO iol1loo1io42 = this.I00iiO;
/* 447 */                   I00O0o1oo(iol1loo1io42);
/* 459 */                   listI010l10O = iol1loo1io42.I010l10O(str, liIlli.I00000oOI(lioooo), 1);
/* 467 */                   if (!listI010l10O.isEmpty()) {
                            }
/* 529 */                   while (r2.hasNext()) {
                            }
/* 564 */                   iOl1lOo1IO iol1loo1io62 = this.I00iiO;
/* 566 */                   I00O0o1oo(iol1loo1io62);
/* 569 */                   iol1loo1io62.I01Io001O();
/* 572 */                   iOl1lOo1IO iol1loo1io72 = this.I00iiO;
/* 574 */                   I00O0o1oo(iol1loo1io72);
/* 577 */                   iol1loo1io72.I01Io1();
/* 581 */                   this.I00oliIiO01i = null;
/* 583 */                   I00O0o1oo(l0i1ioo);
/* 590 */                   if (!l0i1ioo.I010ioo()) {
                            }
                        }
                    } else if (i2 != 200) {
/* 68 */                if (i2 == 204) {
/* 70 */                    i2 = 204;
/* 71 */                    if (th == null) {
                            }
                        }
/* 77 */                String str4 = new String(bArr2, StandardCharsets.UTF_8);
/* 106 */               I00II0oii1o().I00li1OI.I0000oI00("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str4.substring(0, Math.min(32, str4.length())));
/* 111 */               l0O0o010I l0o0o010i2 = this.I00l0I0l0lO1.I00l0I0l0lO1;
/* 117 */               I00IoO0().getClass();
/* 124 */               l0o0o010i2.I00000oOI(System.currentTimeMillis());
/* 129 */               if (i2 != 503) {
/* 137 */                   l0O0o010I l0o0o010i3 = this.I00l0I0l0lO1.I00io1l;
/* 143 */                   I00IoO0().getClass();
/* 150 */                   l0o0o010i3.I00000oOI(System.currentTimeMillis());
/* 153 */                   iOl1lOo1IO iol1loo1io11 = this.I00iiO;
/* 155 */                   I00O0o1oo(iol1loo1io11);
/* 158 */                   iol1loo1io11.I01101IOlO(arrayList);
/* 161 */                   I00Io1lO();
                        }
                    } else if (th == null) {
/* 77 */                String str42 = new String(bArr2, StandardCharsets.UTF_8);
/* 106 */               I00II0oii1o().I00li1OI.I0000oI00("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str42.substring(0, Math.min(32, str42.length())));
/* 111 */               l0O0o010I l0o0o010i22 = this.I00l0I0l0lO1.I00l0I0l0lO1;
/* 117 */               I00IoO0().getClass();
/* 124 */               l0o0o010i22.I00000oOI(System.currentTimeMillis());
/* 129 */               if (i2 != 503 || i2 == 429) {
/* 137 */                   l0O0o010I l0o0o010i32 = this.I00l0I0l0lO1.I00io1l;
/* 143 */                   I00IoO0().getClass();
/* 150 */                   l0o0o010i32.I00000oOI(System.currentTimeMillis());
                        }
/* 153 */               iOl1lOo1IO iol1loo1io112 = this.I00iiO;
/* 155 */               I00O0o1oo(iol1loo1io112);
/* 158 */               iol1loo1io112.I01101IOlO(arrayList);
/* 161 */               I00Io1lO();
                    }
/* 687 */           this.I00oO101o = false;
/* 689 */           I00Io1o110i();
                }

                public final void I001IO000(l0IIii l0iiii) throws MalformedURLException {
                    I1Io0i0II i1Io0i0II;
                    I1Io0i0II i1Io0i0II2;
/* 5 */             I00iOIl().I010II();
/* 16 */            if (TextUtils.isEmpty(l0iiii.I00IOO())) {
/* 18 */                String strI00II0oii1o = l0iiii.I00II0oii1o();
/* 22 */                lII0I0I000I.I000II(strI00II0oii1o);
/* 31 */                I001i1lo1io(strI00II0oii1o, 204, null, null, null);
/* 34 */                return;
                    }
/* 36 */            String strI00II0oii1o2 = l0iiii.I00II0oii1o();
/* 40 */            lII0I0I000I.I000II(strI00II0oii1o2);
/* 51 */            I00II0oii1o().I00lll10.I0000Il00O("Fetching remote configuration", strI00II0oii1o2);
/* 54 */            l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 56 */            I00O0o1oo(l0l1ol11Var);
/* 59 */            l00O0loO l00o0looI01101olii = l0l1ol11Var.I01101olii(strI00II0oii1o2);
/* 63 */            I00O0o1oo(l0l1ol11Var);
/* 66 */            l0l1ol11Var.I010II();
/* 75 */            String str = (String) l0l1ol11Var.I00lll10.get(strI00II0oii1o2);
/* 78 */            if (l00o0looI01101olii != null) {
/* 85 */                if (TextUtils.isEmpty(str)) {
/* 98 */                    i1Io0i0II2 = null;
                        } else {
/* 89 */                    i1Io0i0II2 = new I1Io0i0II(0);
/* 94 */                    i1Io0i0II2.put("If-Modified-Since", str);
                        }
/* 99 */                I00O0o1oo(l0l1ol11Var);
/* 102 */               l0l1ol11Var.I010II();
/* 111 */               String str2 = (String) l0l1ol11Var.I00o0iI0io1.get(strI00II0oii1o2);
/* 117 */               if (!TextUtils.isEmpty(str2)) {
/* 119 */                   if (i1Io0i0II2 == null) {
/* 123 */                       i1Io0i0II2 = new I1Io0i0II(0);
                            }
/* 129 */                   i1Io0i0II2.put("If-None-Match", str2);
                        }
/* 132 */               i1Io0i0II = i1Io0i0II2;
                    } else {
/* 134 */               i1Io0i0II = null;
                    }
/* 136 */           this.I00oIiI10 = true;
/* 138 */           l0I1IOo l0i1ioo = this.I00iiI;
/* 140 */           I00O0o1oo(l0i1ioo);
/* 147 */           i11I1Ili i11i1ili = new i11I1Ili(10);
/* 150 */           i11i1ili.I00iiI = this;
/* 152 */           VarHandle.storeStoreFence();
/* 157 */           l0olllO1i l0olllo1i = (l0olllO1i) l0i1ioo.I00iOIl;
/* 159 */           l0i1ioo.I010II();
/* 162 */           l0i1ioo.I010OIo1l();
/* 167 */           liOii110IIl lioii110iil = l0i1ioo.I00iiI.I00l0OO0IO;
/* 171 */           Uri.Builder builder = new Uri.Builder();
/* 220 */           Uri.Builder builderAppendQueryParameter = builder.scheme((String) iol1II1ii1i.I0001Ioi1lo.I00000oIO(null)).encodedAuthority((String) iol1II1ii1i.I000II.I00000oIO(null)).path("config/app/".concat(String.valueOf(l0iiii.I00IOO()))).appendQueryParameter("platform", "android");
/* 230 */           ((l0olllO1i) lioii110iil.I00iOIl).I00iio.I010l1O();
/* 250 */           builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(161000L)).appendQueryParameter("runtime_version", OIllioIilO.I01OO1I);
/* 257 */           String string = builder.build().toString();
                    try {
/* 266 */               URL url = new URI(string).toURL();
/* 270 */               l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 272 */               l0olllO1i.I000II(l0o10ooo0);
/* 285 */               l0o10ooo0.I01101olii(new l0I0Ii1OIi0(l0i1ioo, l0iiii.I00II0oii1o(), url, (byte[]) null, i1Io0i0II, i11i1ili));
                    } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
/* 289 */               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 291 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 306 */               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(l0iiii.I00II0oii1o()), "Failed to parse config URL. Not fetching. appId", string);
                    }
                }

                @Override
                public final lolOiIoiillI I001i1O0Ol() {
/* 3 */             return this.I00ll1.I00iiO;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0174 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:11:0x0045, B:21:0x0063, B:58:0x0177, B:29:0x0080, B:34:0x00dc, B:33:0x00ca, B:35:0x00e1, B:39:0x00f8, B:43:0x010e, B:45:0x0126, B:47:0x0141, B:49:0x014a, B:51:0x0150, B:52:0x0154, B:54:0x015d, B:56:0x016c, B:57:0x0174, B:46:0x0132, B:40:0x00ff, B:42:0x0108), top: B:66:0x0045, outer: #1 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I001i1lo1io(String str, int i, Throwable th, byte[] bArr, Map map) {
                    boolean z;
/* 1 */             l0I1IOo l0i1ioo = this.I00iiI;
/* 7 */             I00iOIl().I010II();
/* 10 */            I00iIi0i1o();
/* 13 */            lII0I0I000I.I0000O(str);
/* 17 */            if (bArr == null) {
                        try {
/* 19 */                    bArr = new byte[0];
                        } catch (Throwable th2) {
/* 407 */                   this.I00oIiI10 = false;
/* 409 */                   I00Io1o110i();
/* 2230 */                  throw th2;
                        }
                    }
/* 29 */            IOloiOI1 iOloiOI1 = I00II0oii1o().I00lll10;
/* 34 */            Integer numValueOf = Integer.valueOf(bArr.length);
/* 38 */            iOloiOI1.I0000Il00O("onConfigFetched. Response size", numValueOf);
/* 52 */            if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I01101olii)) {
/* 54 */                lio010i lio010iVar = this.I00io1l;
/* 56 */                I00O0o1oo(lio010iVar);
/* 59 */                lio010iVar.I010l1O(map);
                    }
/* 62 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 64 */            I00O0o1oo(iol1loo1io);
/* 67 */            iol1loo1io.I01Io000();
                    try {
/* 70 */                iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 72 */                I00O0o1oo(iol1loo1io2);
/* 75 */                l0IIii l0iiiiI01Ol1o0 = iol1loo1io2.I01Ol1o0(str);
/* 83 */                if (i == 200 || i == 204) {
/* 97 */                    z = th != null;
                        } else {
/* 89 */                    if (i == 304) {
/* 91 */                        i = 304;
/* 97 */                        if (th != null) {
                                }
                            }
                        }
/* 98 */                if (l0iiiiI01Ol1o0 == null) {
/* 112 */                   I00II0oii1o().I00l0I0l0lO1.I0000Il00O("App does not exist in onConfigFetched. appId", l01O0IO1ooO0.I010ioo(str));
                        } else {
/* 122 */                   l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 124 */                   if (z || i == 404) {
/* 226 */                       I00i0oil();
/* 231 */                       String strI01101IOlO = lio010i.I01101IOlO("Last-Modified", map);
/* 235 */                       I00i0oil();
/* 240 */                       String strI01101IOlO2 = lio010i.I01101IOlO("ETag", map);
/* 244 */                       if (i == 404 || i == 304) {
/* 256 */                           I00O0o1oo(l0l1ol11Var);
/* 263 */                           if (l0l1ol11Var.I01101olii(str) == null) {
/* 265 */                               I00O0o1oo(l0l1ol11Var);
/* 268 */                               l0l1ol11Var.I0110o(str, null, null, null);
                                    }
                                } else {
/* 249 */                           I00O0o1oo(l0l1ol11Var);
/* 252 */                           l0l1ol11Var.I0110o(str, bArr, strI01101IOlO, strI01101IOlO2);
                                }
/* 275 */                       I00IoO0().getClass();
/* 282 */                       l0iiiiI01Ol1o0.I0001Ioi1lo(System.currentTimeMillis());
/* 285 */                       iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 287 */                       I00O0o1oo(iol1loo1io3);
/* 290 */                       iol1loo1io3.I01OlIoIl(l0iiiiI01Ol1o0, false);
/* 293 */                       if (i == 404) {
/* 303 */                           I00II0oii1o().I00li1OI.I0000Il00O("Config not found. Using empty config. appId", str);
                                } else {
/* 319 */                           I00II0oii1o().I00lll10.I0000O(Integer.valueOf(i), "Successfully fetched config. Got network response. code, size", numValueOf);
                                }
/* 322 */                       I00O0o1oo(l0i1ioo);
/* 329 */                       if (l0i1ioo.I010ioo() && I00IlilI0i0i()) {
/* 337 */                           I000l1();
                                } else {
/* 341 */                           I00O0o1oo(l0i1ioo);
/* 348 */                           if (l0i1ioo.I010ioo()) {
/* 350 */                               iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 352 */                               I00O0o1oo(iol1loo1io4);
/* 363 */                               if (iol1loo1io4.I010l1O(l0iiiiI01Ol1o0.I00II0oii1o())) {
/* 369 */                                   I000oI1ioi(l0iiiiI01Ol1o0.I00II0oii1o());
                                        } else {
/* 373 */                                   I00Io1lO();
                                        }
                                    }
                                }
                            } else {
/* 133 */                       I00IoO0().getClass();
/* 140 */                       l0iiiiI01Ol1o0.I000II(System.currentTimeMillis());
/* 143 */                       iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 145 */                       I00O0o1oo(iol1loo1io5);
/* 148 */                       iol1loo1io5.I01OlIoIl(l0iiiiI01Ol1o0, false);
/* 163 */                       I00II0oii1o().I00lll10.I0000O(Integer.valueOf(i), "Fetching config failed. code, error", th);
/* 166 */                       I00O0o1oo(l0l1ol11Var);
/* 169 */                       l0l1ol11Var.I010II();
/* 174 */                       l0l1ol11Var.I00lll10.put(str, null);
/* 179 */                       l0O0o010I l0o0o010i = this.I00l0I0l0lO1.I00l0I0l0lO1;
/* 185 */                       I00IoO0().getClass();
/* 192 */                       l0o0o010i.I00000oOI(System.currentTimeMillis());
/* 197 */                       if (i == 503 || i == 429) {
/* 205 */                           l0O0o010I l0o0o010i2 = this.I00l0I0l0lO1.I00io1l;
/* 211 */                           I00IoO0().getClass();
/* 218 */                           l0o0o010i2.I00000oOI(System.currentTimeMillis());
                                }
/* 221 */                       I00Io1lO();
                            }
                        }
/* 376 */               iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 378 */               I00O0o1oo(iol1loo1io6);
/* 381 */               iol1loo1io6.I01Io001O();
/* 392 */               this.I00oIiI10 = false;
/* 394 */               I00Io1o110i();
                    } finally {
/* 398 */               iOl1lOo1IO iol1loo1io7 = this.I00iiO;
/* 400 */               I00O0o1oo(iol1loo1io7);
/* 403 */               iol1loo1io7.I01Io1();
                    }
                }

                public final int I001lllioOl(String str, i0O1lIi1O0IO i0o1lii1o0io) throws Throwable {
                    l1iIoO01 l1iioo01I010ioo;
/* 1 */             l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 3 */             iooOiIloili ioooiiloiliI011iO = l0l1ol11Var.I011iO(str);
/* 8 */             l1iioiool l1iioioolVar = l1iioiool.AD_PERSONALIZATION;
/* 10 */            if (ioooiiloiliI011iO == null) {
/* 14 */                i0o1lii1o0io.I000O01llI0(l1iioioolVar, iIloio1i.FAILSAFE);
/* 7 */                 return 1;
                    }
/* 18 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 20 */            I00O0o1oo(iol1loo1io);
/* 23 */            l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str);
/* 27 */            if (l0iiiiI01Ol1o0 == null || ((l1iIoO01) i0O1lIi1O0IO.I000II(l0iiiiI01Ol1o0.I0010o()).I00iiI) != l1iIoO01.POLICY || (l1iioo01I010ioo = l0l1ol11Var.I010ioo(str, l1iioioolVar)) == l1iIoO01.UNINITIALIZED) {
/* 65 */                i0o1lii1o0io.I000O01llI0(l1iioioolVar, iIloio1i.REMOTE_DEFAULT);
/* 72 */                if (l0l1ol11Var.I011iIOio(str, l1iioioolVar)) {
/* 74 */                    return 0;
                        }
                    } else {
/* 55 */                i0o1lii1o0io.I000O01llI0(l1iioioolVar, iIloio1i.REMOTE_ENFORCED_DEFAULT);
/* 60 */                if (l1iioo01I010ioo == l1iIoO01.GRANTED) {
/* 74 */                    return 0;
                        }
                    }
/* 7 */             return 1;
                }

                public final HashMap I001lloI(l0l1iIIOl l0l1iiiol) {
                    Serializable serializableI011Ill;
/* 3 */             HashMap map = new HashMap();
/* 6 */             I00i0oil();
/* 11 */            HashMap map2 = new HashMap();
/* 26 */            for (l0lliIlIO l0lliilio : l0l1iiiol.I001IO000()) {
/* 44 */                if (l0lliilio.I001IIilI0O().startsWith("gad_") && (serializableI011Ill = lio010i.I011Ill(l0lliilio)) != null) {
/* 56 */                    map2.put(l0lliilio.I001IIilI0O(), serializableI011Ill);
                        }
                    }
/* 72 */            for (Map.Entry entry : map2.entrySet()) {
/* 94 */                map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
/* 168 */           return map;
                }

                public final void I00II0Ol1O0l() {
/* 5 */             I00iOIl().I010II();
/* 14 */            if (this.I00o101lO.isEmpty()) {
/* 110 */               return;
                    }
/* 16 */            li0O100iO01 li0o100io01 = this.I010I0;
/* 18 */            int i = 2;
/* 19 */            if (li0o100io01 == null) {
/* 25 */                li0O100iO01 li0o100io012 = new li0O100iO01(this, this.I00ll1, i);
/* 28 */                this.I010I0 = li0o100io012;
/* 30 */                li0o100io01 = li0o100io012;
                    }
/* 37 */            if (li0o100io01.I0000Il00O != 0) {
/* 39 */                return;
                    }
/* 44 */            I00IoO0().getClass();
/* 69 */            long jMax = Math.max(0L, ((Integer) iol1II1ii1i.I00o101lO.I00000oIO(null)).intValue() - (SystemClock.elapsedRealtime() - this.I010II));
/* 85 */            I00II0oii1o().I00lll10.I0000Il00O("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
/* 88 */            li0O100iO01 li0o100io013 = this.I010I0;
/* 90 */            if (li0o100io013 == null) {
/* 96 */                li0O100iO01 li0o100io014 = new li0O100iO01(this, this.I00ll1, i);
/* 99 */                this.I010I0 = li0o100io014;
/* 101 */               li0o100io013 = li0o100io014;
                    }
/* 102 */           li0o100io013.I00000oOI(jMax);
                }

                @Override
                public final l01O0IO1ooO0 I00II0oii1o() {
/* 1 */             l0olllO1i l0olllo1i = this.I00ll1;
/* 3 */             lII0I0I000I.I000II(l0olllo1i);
/* 6 */             l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 8 */             l0olllO1i.I000II(l01o0io1ooo0);
/* 20 */            return l01o0io1ooo0;
                }

                /* JADX WARN: Removed duplicated region for block: B:138:0x048e A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:139:0x04ad A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:185:0x05d2 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:191:0x05ee A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:195:0x0603 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:225:0x0728  */
                /* JADX WARN: Removed duplicated region for block: B:235:0x0782 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:344:0x0b50 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:354:0x0b84 A[PHI: r8
                  0x0b84: PHI (r8v5 l0olllO1i) = (r8v4 l0olllO1i), (r8v34 l0olllO1i) binds: [B:343:0x0b4e, B:525:0x0b84] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:357:0x0b9c A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:358:0x0bbd A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x019e  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x01c0 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0284 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:79:0x0298  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x0299 A[Catch: all -> 0x011f, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:90:0x02d6 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #2 {all -> 0x011f, blocks: (B:3:0x0019, B:5:0x0035, B:8:0x003e, B:9:0x005e, B:12:0x007a, B:15:0x00a6, B:17:0x00df, B:20:0x00f8, B:22:0x0102, B:227:0x0742, B:26:0x0134, B:29:0x014a, B:31:0x0150, B:33:0x0156, B:35:0x0169, B:39:0x0176, B:41:0x0181, B:43:0x018f, B:45:0x0195, B:49:0x01a0, B:50:0x01ae, B:52:0x01c0, B:55:0x01de, B:57:0x01e4, B:59:0x01f4, B:61:0x0202, B:63:0x0212, B:64:0x021d, B:65:0x0220, B:67:0x022d, B:69:0x0237, B:70:0x0245, B:72:0x0264, B:74:0x026e, B:76:0x0284, B:77:0x028e, B:80:0x0299, B:81:0x02a3, B:84:0x02ab, B:87:0x02bc, B:88:0x02bf, B:90:0x02d6, B:141:0x04c6, B:142:0x04c9, B:144:0x04d5, B:147:0x04e8, B:149:0x04f9, B:151:0x0505, B:183:0x05c5, B:185:0x05d2, B:187:0x05d8, B:189:0x05de, B:191:0x05ee, B:192:0x05f1, B:193:0x05fd, B:195:0x0603, B:196:0x060f, B:198:0x0615, B:200:0x0625, B:202:0x062f, B:203:0x0644, B:205:0x064a, B:206:0x0665, B:208:0x066b, B:209:0x0689, B:210:0x0696, B:214:0x06c3, B:211:0x069e, B:213:0x06ae, B:215:0x06cd, B:216:0x06ee, B:218:0x06f4, B:220:0x0707, B:221:0x0714, B:222:0x0718, B:224:0x071e, B:226:0x072e, B:156:0x0526, B:158:0x0536, B:161:0x0549, B:163:0x055b, B:165:0x0567, B:167:0x0574, B:170:0x0582, B:172:0x058c, B:174:0x0596, B:177:0x05a1, B:179:0x05a7, B:181:0x05b7, B:182:0x05c2, B:98:0x02fc, B:101:0x0306, B:103:0x0314, B:107:0x0365, B:104:0x0336, B:106:0x0344, B:110:0x036c, B:113:0x039b, B:114:0x03bf, B:116:0x03f6, B:118:0x03fc, B:121:0x0408, B:123:0x043d, B:124:0x0458, B:126:0x045e, B:128:0x046c, B:132:0x0480, B:129:0x0474, B:135:0x0487, B:138:0x048e, B:139:0x04ad, B:230:0x075f, B:232:0x0771, B:234:0x077a, B:245:0x07ac, B:235:0x0782, B:237:0x078b, B:239:0x0791, B:242:0x079d, B:244:0x07a7, B:246:0x07af, B:247:0x07bb, B:250:0x07c3, B:252:0x07d5, B:253:0x07e0, B:255:0x07e8, B:259:0x0815, B:261:0x0831, B:263:0x0844, B:265:0x0860, B:267:0x0873, B:268:0x088f, B:270:0x0895, B:272:0x08ad, B:273:0x08bb, B:275:0x08cb, B:276:0x08d9, B:277:0x08dc, B:279:0x0926, B:281:0x092c, B:287:0x0957, B:289:0x095f, B:290:0x097d, B:292:0x0983, B:293:0x0997, B:295:0x09ae, B:297:0x09c8, B:299:0x09da, B:301:0x09e4, B:302:0x09e7, B:304:0x0a42, B:305:0x0a55, B:308:0x0a5d, B:311:0x0a7c, B:313:0x0a95, B:315:0x0aaa, B:317:0x0aaf, B:319:0x0ab3, B:321:0x0ab7, B:323:0x0ac1, B:325:0x0aca, B:327:0x0ace, B:329:0x0ad4, B:331:0x0adf, B:333:0x0aed, B:400:0x0d4f, B:335:0x0af7, B:337:0x0b13, B:342:0x0b2e, B:344:0x0b50, B:345:0x0b58, B:347:0x0b5e, B:349:0x0b70, B:355:0x0b86, B:357:0x0b9c, B:358:0x0bbd, B:360:0x0bc9, B:362:0x0be1, B:364:0x0c22, B:370:0x0c3e, B:372:0x0c49, B:374:0x0c4d, B:376:0x0c51, B:378:0x0c55, B:379:0x0c61, B:380:0x0c66, B:382:0x0c6c, B:384:0x0c82, B:385:0x0c87, B:399:0x0d4c, B:387:0x0cc6, B:389:0x0ccc, B:393:0x0ce0, B:395:0x0cfc, B:396:0x0d03, B:398:0x0d40, B:390:0x0cd1, B:340:0x0b19, B:401:0x0d5b, B:403:0x0d69, B:404:0x0d7d, B:405:0x0d85, B:407:0x0d8b, B:410:0x0da4, B:412:0x0db6, B:432:0x0e67, B:434:0x0e6d, B:436:0x0e84, B:439:0x0e8f, B:441:0x0e99, B:443:0x0ec0, B:445:0x0ed0, B:446:0x0ede, B:448:0x0eec, B:449:0x0efa, B:450:0x0f05, B:452:0x0f17, B:455:0x0f1e, B:460:0x0f5f, B:456:0x0f2d, B:458:0x0f3b, B:459:0x0f48, B:461:0x0f6e, B:462:0x0f81, B:466:0x0f9f, B:465:0x0f8c, B:413:0x0dcf, B:415:0x0dd5, B:417:0x0de7, B:419:0x0dee, B:425:0x0e06, B:427:0x0e0d, B:429:0x0e58, B:431:0x0e5f, B:430:0x0e5c, B:426:0x0e0a, B:418:0x0deb, B:282:0x093c, B:284:0x0942, B:286:0x0948, B:266:0x0870, B:262:0x0841, B:256:0x07ee, B:258:0x07f4, B:467:0x0fa8), top: B:477:0x0019, inners: #0, #1 }] */
                /* JADX WARN: Removed duplicated region for block: B:96:0x02f2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I00IO1(long j, String str) {
                    boolean z;
                    int i;
                    Long l;
                    l0olllO1i l0olllo1i;
                    l0ooIi1oOO l0ooii1ooo;
                    l0olllO1i l0olllo1i2;
                    l0IIii l0iiiiI01Ol1o0;
                    Long l2;
                    long j2;
                    l0olllO1i l0olllo1i3;
                    int iI011Ill;
                    long j3;
                    I0Oo1I101o i0Oo1I101o;
                    long jI00100o1O0lo;
                    String str2;
                    String str3;
                    int i2;
                    String str4;
                    iIl1iil iil1iilI00Ol1ll1;
                    iol01I0001 iol01i0001;
                    boolean zI011IO1I11OI;
                    boolean z2;
                    String str5;
                    String str6;
                    l0ooIi1oOO l0ooii1ooo2;
                    int i3;
                    int i4;
                    int i5;
                    String str7;
                    String str8;
                    int i6;
                    int i7;
                    int i8;
                    String str9;
                    long jI010l1ol111;
                    lilOOl0 lilool0 = this;
                    String str10 = "1";
                    String str11 = "_ai";
                    String str12 = "purchase";
                    String str13 = "items";
/* 2 */             Long l3 = 1L;
/* 3 */             lilool0.I00i01iIIliI().I01Io000();
                    try {
/* 4 */                 I0Oo1I101o i0Oo1I101o2 = new I0Oo1I101o(lilool0);
/* 6 */                 lilool0.I00i01iIIliI().I01Ilioliio(str, j, lilool0.I00oo1iO0ll, i0Oo1I101o2);
                        I0Oo1I101o i0Oo1I101o3 = i0Oo1I101o2;
                        ArrayList arrayList = (ArrayList) i0Oo1I101o3.I0000O;
/* 7 */                 if (arrayList == null || arrayList.isEmpty()) {
/* 533 */                   I00i01iIIliI().I01Io001O();
                            z = false;
                        } else {
/* 9 */                     l0ooIi1oOO l0ooii1ooo3 = (l0ooIi1oOO) ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I000OiO();
/* 10 */                    l0ooii1ooo3.I0000Il00O();
/* 11 */                    ((l100ll0OOIoO) l0ooii1ooo3.I00iiI).I00i01iIIliI();
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = 0;
                            int i12 = 0;
                            boolean z3 = false;
                            l0l0O000 l0l0o000 = null;
                            l0l0O000 l0l0o0002 = null;
                            boolean z4 = false;
                            while (true) {
/* 13 */                        int size = ((ArrayList) i0Oo1I101o3.I0000O).size();
                                i = i12;
                                l = l3;
                                l0olllo1i = lilool0.I00ll1;
                                l0ooii1ooo = l0ooii1ooo3;
                                int i13 = i9;
                                if (i11 >= size) {
                                    break;
                                }
/* 14 */                        l0l0O000 l0l0o0003 = (l0l0O000) ((l0l1iIIOl) ((ArrayList) i0Oo1I101o3.I0000O).get(i11)).I000OiO();
                                int i14 = i11;
/* 16 */                        if (lilool0.I00OloOo().I0111i(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0003.I000o00OoI0I())) {
/* 23 */                            lilool0.I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()), "Dropping blocked raw event. appId", l0olllo1i.I00l0OO0IO.I00000oIO(l0l0o0003.I000o00OoI0I()));
/* 25 */                            if (!str10.equals(lilool0.I00OloOo().I00OIl(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), "measurement.upload.blacklist_internal")) && !str10.equals(lilool0.I00OloOo().I00OIl(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), "measurement.upload.blacklist_public")) && !"_err".equals(l0l0o0003.I000o00OoI0I())) {
/* 29 */                                lilool0.I00iIO();
/* 32 */                                lioil0ilIOi.I011Ill(lilool0.I010OIo1l, ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), 11, "_ev", l0l0o0003.I000o00OoI0I(), 0);
                                    }
                                    str2 = str10;
                                    str7 = str11;
                                    str6 = str12;
                                    str8 = str13;
                                    i12 = i;
                                    l0ooii1ooo2 = l0ooii1ooo;
                                    i6 = i14;
                                    i5 = i10;
                                    i3 = i13;
                                } else {
/* 33 */                            String strI000o00OoI0I = l0l0o0003.I000o00OoI0I();
                                    str2 = str10;
                                    String str14 = str13;
/* 34 */                            if (strI000o00OoI0I.equals(str12) || strI000o00OoI0I.equals("_iap") || strI000o00OoI0I.equals("ecommerce_purchase")) {
                                        str3 = "_et";
                                        i2 = i10;
                                        str4 = "_fr";
                                    } else {
                                        i2 = i10;
                                        str3 = "_et";
                                        str4 = "_fr";
/* 38 */                                if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I0110OiO) && strI000o00OoI0I.equals("in_app_purchase")) {
                                        }
/* 51 */                                if (l0l0o0003.I000o00OoI0I().equals(ll0i0l0Ili.I00000oOI(str11, iO1l1II0O0.I0001Ioi1lo, iO1l1II0O0.I00000oIO))) {
/* 52 */                                    l0l0o0003.I000oI1ioi(str11);
/* 55 */                                    lilool0.I00II0oii1o().I00lll10.I00000oOI("Renaming ad_impression to _ai");
/* 57 */                                    if (Log.isLoggable(lilool0.I00II0oii1o().I010l1O(), 5)) {
/* 58 */                                        for (int i15 = 0; i15 < l0l0o0003.I000OOo1O(); i15++) {
/* 59 */                                            if ("ad_platform".equals(l0l0o0003.I000OiO(i15).I001IIilI0O()) && !l0l0o0003.I000OiO(i15).I001i1O0Ol().isEmpty() && "admob".equalsIgnoreCase(l0l0o0003.I000OiO(i15).I001i1O0Ol())) {
/* 65 */                                                lilool0.I00II0oii1o().I00li1OI.I00000oOI("AdMob ad impression logged from app. Potentially duplicative.");
                                                    }
                                                }
                                            }
                                        }
/* 66 */                                iil1iilI00Ol1ll1 = lilool0.I00Ol1ll1();
                                        iol01i0001 = iol1II1ii1i.I0110OiO;
/* 67 */                                if (iil1iilI00Ol1ll1.I01101IOlO(null, iol01i0001) && l0l0o0003.I000o00OoI0I().equals("in_app_purchase")) {
/* 69 */                                    l0l0o0003.I000oI1ioi("_iap");
/* 72 */                                    lilool0.I00II0oii1o().I00lll10.I00000oOI("Renaming in_app_purchase to _iap");
                                        }
/* 74 */                                zI011IO1I11OI = lilool0.I00OloOo().I011IO1I11OI(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0003.I000o00OoI0I());
/* 76 */                                if (lilool0.I00Ol1ll1().I01101IOlO(null, iol01i0001) && "_iap".equals(l0l0o0003.I000o00OoI0I())) {
/* 78 */                                    zI011IO1I11OI = lilool0.I00111O(l0l0o0003);
/* 79 */                                    String strI00111O = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 80 */                                    if ("_iap".equals(l0l0o0003.I000o00OoI0I())) {
/* 81 */                                        lilool0.I00IioO0OiOi(l0l0o0003, "value", strI00111O);
/* 82 */                                        lilool0.I00IioO0OiOi(l0l0o0003, "price", strI00111O);
                                            }
/* 83 */                                    if (!"_iap".equals(l0l0o0003.I000o00OoI0I())) {
/* 84 */                                        ArrayList arrayList2 = new ArrayList(l0l0o0003.I000O01llI0());
                                                int i16 = 0;
                                                while (true) {
/* 86 */                                            if (i16 >= arrayList2.size()) {
/* 88 */                                                l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
                                                        l0loooo1ioiI00IO1.I000O01llI0("quantity");
                                                        l0loooo1ioiI00IO1.I000OiO(1L);
/* 89 */                                                l0l0o0003.I000iOII((l0lliIlIO) l0loooo1ioiI00IO1.I0000oI00());
                                                        break;
                                                    }
/* 87 */                                            if ("quantity".equals(((l0lliIlIO) arrayList2.get(i16)).I001IIilI0O())) {
                                                        break;
                                                    }
                                                    i16++;
                                                }
                                            }
                                        }
                                        if (zI011IO1I11OI) {
/* 90 */                                    lilool0.I00i0oil();
                                            String strI000o00OoI0I2 = l0l0o0003.I000o00OoI0I();
/* 91 */                                    lII0I0I000I.I0000O(strI000o00OoI0I2);
/* 92 */                                    if (strI000o00OoI0I2.hashCode() == 95027 && strI000o00OoI0I2.equals("_ui")) {
                                                boolean z5 = false;
                                                boolean z6 = false;
/* 95 */                                        for (int i17 = 0; i17 < l0l0o0003.I000OOo1O(); i17++) {
/* 96 */                                            if ("_c".equals(l0l0o0003.I000OiO(i17).I001IIilI0O())) {
/* 97 */                                                l0lOoOo1Ioi l0loooo1ioi = (l0lOoOo1Ioi) l0l0o0003.I000OiO(i17).I000OiO();
/* 98 */                                                l0loooo1ioi.I000OiO(1L);
/* 99 */                                                l0lliIlIO l0lliilio = (l0lliIlIO) l0loooo1ioi.I0000oI00();
/* 100 */                                               l0l0o0003.I0000Il00O();
/* 101 */                                               ((l0l1iIIOl) l0l0o0003.I00iiI).I00Io1lO(i17, l0lliilio);
                                                        z5 = true;
                                                    } else if ("_r".equals(l0l0o0003.I000OiO(i17).I001IIilI0O())) {
/* 103 */                                               l0lOoOo1Ioi l0loooo1ioi2 = (l0lOoOo1Ioi) l0l0o0003.I000OiO(i17).I000OiO();
/* 104 */                                               l0loooo1ioi2.I000OiO(1L);
/* 105 */                                               l0lliIlIO l0lliilio2 = (l0lliIlIO) l0loooo1ioi2.I0000oI00();
/* 106 */                                               l0l0o0003.I0000Il00O();
/* 107 */                                               ((l0l1iIIOl) l0l0o0003.I00iiI).I00Io1lO(i17, l0lliilio2);
                                                        z6 = true;
                                                    }
                                                }
                                                if (z5 || !zI011IO1I11OI) {
                                                    z2 = zI011IO1I11OI;
                                                    str5 = str11;
                                                    str6 = str12;
                                                } else {
                                                    z2 = zI011IO1I11OI;
/* 113 */                                           lilool0.I00II0oii1o().I00lll10.I0000Il00O("Marking event as conversion", l0olllo1i.I00l0OO0IO.I00000oIO(l0l0o0003.I000o00OoI0I()));
/* 114 */                                           l0lOoOo1Ioi l0loooo1ioiI00IO12 = l0lliIlIO.I00IO1();
/* 115 */                                           l0loooo1ioiI00IO12.I000O01llI0("_c");
                                                    str5 = str11;
                                                    str6 = str12;
/* 116 */                                           l0loooo1ioiI00IO12.I000OiO(1L);
/* 117 */                                           l0l0o0003.I000l1(l0loooo1ioiI00IO12);
                                                }
                                                if (!z6) {
/* 123 */                                           lilool0.I00II0oii1o().I00lll10.I0000Il00O("Marking event as real-time", l0olllo1i.I00l0OO0IO.I00000oIO(l0l0o0003.I000o00OoI0I()));
/* 124 */                                           l0lOoOo1Ioi l0loooo1ioiI00IO13 = l0lliIlIO.I00IO1();
                                                    l0loooo1ioiI00IO13.I000O01llI0("_r");
                                                    l0loooo1ioiI00IO13.I000OiO(1L);
/* 125 */                                           l0l0o0003.I000l1(l0loooo1ioiI00IO13);
                                                }
                                                if (lilool0.I00i01iIIliI().I01OlOoii0(lilool0.I00000oOI(), ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), false, true, false, false).I0000oI00 > lilool0.I00Ol1ll1().I010o0o0oO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), iol1II1ii1i.I00100l0)) {
/* 132 */                                           I001lIiIIo1O(l0l0o0003, "_r");
                                                } else {
                                                    z4 = true;
                                                }
/* 133 */                                       if (lioil0ilIOi.I01OOIlI(l0l0o0003.I000o00OoI0I()) && z2 && lilool0.I00i01iIIliI().I01OlOoii0(lilool0.I00000oOI(), ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), true, false, false, false).I0000Il00O > lilool0.I00Ol1ll1().I010o0o0oO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), iol1II1ii1i.I000oI1ioi)) {
/* 144 */                                           lilool0.I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Too many conversions. Not logging as conversion. appId", l01O0IO1ooO0.I010ioo(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()));
                                                    boolean z7 = false;
                                                    l0lOoOo1Ioi l0loooo1ioi3 = null;
                                                    int i18 = -1;
/* 145 */                                           for (int i19 = 0; i19 < l0l0o0003.I000OOo1O(); i19++) {
/* 146 */                                               l0lliIlIO l0lliilioI000OiO = l0l0o0003.I000OiO(i19);
/* 147 */                                               if ("_c".equals(l0lliilioI000OiO.I001IIilI0O())) {
/* 148 */                                                   l0loooo1ioi3 = (l0lOoOo1Ioi) l0lliilioI000OiO.I000OiO();
                                                            i18 = i19;
                                                        } else if ("_err".equals(l0lliilioI000OiO.I001IIilI0O())) {
                                                            z7 = true;
                                                        }
                                                    }
                                                    if (z7) {
                                                        if (l0loooo1ioi3 != null) {
/* 150 */                                                   l0l0o0003.I000lI(i18);
                                                        } else {
                                                            l0loooo1ioi3 = null;
                                                            if (l0loooo1ioi3 == null) {
                                                            }
                                                        }
                                                    } else if (l0loooo1ioi3 == null) {
/* 151 */                                               l0lOoOo1Ioi l0loooo1ioi4 = (l0lOoOo1Ioi) l0loooo1ioi3.clone();
/* 152 */                                               l0loooo1ioi4.I000O01llI0("_err");
/* 153 */                                               l0loooo1ioi4.I000OiO(10L);
/* 154 */                                               l0lliIlIO l0lliilio3 = (l0lliIlIO) l0loooo1ioi4.I0000oI00();
/* 155 */                                               l0l0o0003.I0000Il00O();
/* 156 */                                               ((l0l1iIIOl) l0l0o0003.I00iiI).I00Io1lO(i18, l0lliilio3);
                                                    } else {
/* 161 */                                               lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Did not find conversion parameter. appId", l01O0IO1ooO0.I010ioo(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()));
                                                    }
                                                }
                                            } else {
                                                str5 = str11;
                                                str6 = str12;
                                                z2 = false;
                                            }
                                            if (z2) {
/* 162 */                                       lilool0.I00111O(l0l0o0003);
                                            }
/* 163 */                                   if ("_e".equals(l0l0o0003.I000o00OoI0I())) {
/* 164 */                                       lilool0.I00i0oil();
                                                if (lio010i.I010oio1OO0(str4, (l0l1iIIOl) l0l0o0003.I0000oI00()) == null) {
                                                    if (l0l0o0002 != null && Math.abs(l0l0o0002.I00100l0() - l0l0o0003.I00100l0()) <= 1000) {
/* 166 */                                               l0l0O000 l0l0o0004 = (l0l0O000) l0l0o0002.clone();
/* 167 */                                               if (lilool0.I00IOO(l0l0o0003, l0l0o0004)) {
                                                            l0ooii1ooo2 = l0ooii1ooo;
                                                            i3 = i13;
/* 168 */                                                   l0ooii1ooo2.I00OOll1(i3, l0l0o0004);
                                                            i4 = i2;
                                                            l0l0o000 = null;
                                                            l0l0o0002 = null;
/* 186 */                                                   if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I01101olii) && l0l0o0003.I001IIilI0O() && !l0l0o0003.I0010o()) {
/* 189 */                                                       jI010l1ol111 = lilool0.I00i0oil().I010l1ol111(l0l0o0003.I001IO000());
                                                                if (jI010l1ol111 != 0) {
/* 190 */                                                           l0l0o0003.I00111O(jI010l1ol111);
                                                                }
/* 191 */                                                       l0l0o0003.I0000Il00O();
/* 192 */                                                       ((l0l1iIIOl) l0l0o0003.I00iiI).I00111O(0L);
                                                            }
/* 193 */                                                   if (l0l0o0003.I000OOo1O() == 0) {
/* 194 */                                                       lilool0.I00i0oil();
                                                                Bundle bundleI010o0o0oO = lio010i.I010o0o0oO(l0l0o0003.I000O01llI0());
                                                                int i20 = 0;
/* 195 */                                                       while (i20 < l0l0o0003.I000OOo1O()) {
/* 196 */                                                           l0lliIlIO l0lliilioI000OiO2 = l0l0o0003.I000OiO(i20);
                                                                    String str15 = str14;
/* 197 */                                                           if (!l0lliilioI000OiO2.I001IIilI0O().equals(str15) || l0lliilioI000OiO2.I00II0Ol1O0l().isEmpty()) {
                                                                        i7 = i4;
                                                                        i8 = i20;
                                                                        str9 = str5;
/* 209 */                                                               if (!l0lliilioI000OiO2.I001IIilI0O().equals(str15)) {
/* 213 */                                                                   lilool0.I0010o(l0l0o0003.I000o00OoI0I(), (l0lOoOo1Ioi) l0lliilioI000OiO2.I000OiO(), bundleI010o0o0oO, ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O());
                                                                        }
                                                                    } else {
/* 199 */                                                               String strI00111O2 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 200 */                                                               iI00IlI1oII ii00ili1oiiI00II0Ol1O0l = l0lliilioI000OiO2.I00II0Ol1O0l();
/* 201 */                                                               Bundle[] bundleArr = new Bundle[ii00ili1oiiI00II0Ol1O0l.size()];
                                                                        i7 = i4;
                                                                        int i21 = 0;
/* 202 */                                                               while (i21 < ii00ili1oiiI00II0Ol1O0l.size()) {
/* 203 */                                                                   l0lliIlIO l0lliilio4 = (l0lliIlIO) ii00ili1oiiI00II0Ol1O0l.get(i21);
/* 204 */                                                                   lilool0.I00i0oil();
                                                                            Bundle bundleI010o0o0oO2 = lio010i.I010o0o0oO(l0lliilio4.I00II0Ol1O0l());
/* 205 */                                                                   Iterator it = l0lliilio4.I00II0Ol1O0l().iterator();
                                                                            while (it.hasNext()) {
/* 206 */                                                                       lilool0.I0010o(l0l0o0003.I000o00OoI0I(), (l0lOoOo1Ioi) ((l0lliIlIO) it.next()).I000OiO(), bundleI010o0o0oO2, strI00111O2);
                                                                                i20 = i20;
                                                                                str5 = str5;
                                                                            }
/* 207 */                                                                   bundleArr[i21] = bundleI010o0o0oO2;
                                                                            i21++;
                                                                            i20 = i20;
                                                                            str5 = str5;
                                                                        }
                                                                        i8 = i20;
                                                                        str9 = str5;
/* 208 */                                                               bundleI010o0o0oO.putParcelableArray(str15, bundleArr);
                                                                    }
                                                                    i20 = i8 + 1;
                                                                    str14 = str15;
                                                                    i4 = i7;
                                                                    str5 = str9;
                                                                }
                                                                i5 = i4;
                                                                str7 = str5;
                                                                str8 = str14;
/* 214 */                                                       l0l0o0003.I0000Il00O();
/* 215 */                                                       ((l0l1iIIOl) l0l0o0003.I00iiI).I00IoO0();
/* 216 */                                                       lio010i lio010iVarI00i0oil = lilool0.I00i0oil();
/* 217 */                                                       ArrayList arrayList3 = new ArrayList();
                                                                for (String str16 : bundleI010o0o0oO.keySet()) {
/* 219 */                                                           l0lOoOo1Ioi l0loooo1ioiI00IO14 = l0lliIlIO.I00IO1();
                                                                    l0loooo1ioiI00IO14.I000O01llI0(str16);
/* 220 */                                                           Object obj = bundleI010o0o0oO.get(str16);
                                                                    if (obj != null) {
/* 221 */                                                               lio010iVarI00i0oil.I011lIilI0lo(l0loooo1ioiI00IO14, obj);
/* 222 */                                                               arrayList3.add((l0lliIlIO) l0loooo1ioiI00IO14.I0000oI00());
                                                                    }
                                                                }
/* 223 */                                                       Iterator it2 = arrayList3.iterator();
                                                                while (it2.hasNext()) {
/* 224 */                                                           l0l0o0003.I000iOII((l0lliIlIO) it2.next());
                                                                }
                                                            } else {
                                                                i5 = i4;
                                                                str7 = str5;
                                                                str8 = str14;
                                                            }
                                                            i6 = i14;
/* 225 */                                                   ((ArrayList) i0Oo1I101o3.I0000O).set(i6, (l0l1iIIOl) l0l0o0003.I0000oI00());
/* 226 */                                                   l0ooii1ooo2.I00OilO00Il(l0l0o0003);
                                                            i12 = i + 1;
                                                        }
                                                    }
                                                    l0ooii1ooo2 = l0ooii1ooo;
                                                    i3 = i13;
                                                    l0l0o000 = l0l0o0003;
                                                    i4 = i;
/* 186 */                                           if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I01101olii)) {
/* 189 */                                               jI010l1ol111 = lilool0.I00i0oil().I010l1ol111(l0l0o0003.I001IO000());
                                                        if (jI010l1ol111 != 0) {
                                                        }
/* 191 */                                               l0l0o0003.I0000Il00O();
/* 192 */                                               ((l0l1iIIOl) l0l0o0003.I00iiI).I00111O(0L);
                                                    }
/* 193 */                                           if (l0l0o0003.I000OOo1O() == 0) {
                                                    }
                                                    i6 = i14;
/* 225 */                                           ((ArrayList) i0Oo1I101o3.I0000O).set(i6, (l0l1iIIOl) l0l0o0003.I0000oI00());
/* 226 */                                           l0ooii1ooo2.I00OilO00Il(l0l0o0003);
                                                    i12 = i + 1;
                                                } else {
                                                    l0ooii1ooo2 = l0ooii1ooo;
                                                    i3 = i13;
                                                    i4 = i2;
/* 186 */                                           if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I01101olii)) {
                                                    }
/* 193 */                                           if (l0l0o0003.I000OOo1O() == 0) {
                                                    }
                                                    i6 = i14;
/* 225 */                                           ((ArrayList) i0Oo1I101o3.I0000O).set(i6, (l0l1iIIOl) l0l0o0003.I0000oI00());
/* 226 */                                           l0ooii1ooo2.I00OilO00Il(l0l0o0003);
                                                    i12 = i + 1;
                                                }
                                            } else {
                                                l0ooii1ooo2 = l0ooii1ooo;
                                                i3 = i13;
/* 169 */                                       if ("_vs".equals(l0l0o0003.I000o00OoI0I())) {
/* 171 */                                           lilool0.I00i0oil();
                                                    if (lio010i.I010oio1OO0(str3, (l0l1iIIOl) l0l0o0003.I0000oI00()) == null) {
                                                        if (l0l0o000 != null && Math.abs(l0l0o000.I00100l0() - l0l0o0003.I00100l0()) <= 1000) {
/* 173 */                                                   l0l0O000 l0l0o0005 = (l0l0O000) l0l0o000.clone();
/* 174 */                                                   if (lilool0.I00IOO(l0l0o0005, l0l0o0003)) {
                                                                i4 = i2;
/* 175 */                                                       l0ooii1ooo2.I00OOll1(i4, l0l0o0005);
                                                                l0l0o000 = null;
                                                                l0l0o0002 = null;
                                                            }
                                                        }
                                                        i4 = i2;
                                                        l0l0o0002 = l0l0o0003;
                                                        i3 = i;
                                                    } else {
                                                        i4 = i2;
                                                    }
                                                } else {
                                                    i4 = i2;
/* 1 */                                             if (("_f".equals(l0l0o0003.I000o00OoI0I()) || "_v".equals(l0l0o0003.I000o00OoI0I())) && ("_f".equals(l0l0o0003.I000o00OoI0I()) || "_v".equals(l0l0o0003.I000o00OoI0I()))) {
                                                        int i22 = 0;
                                                        while (true) {
/* 180 */                                                   if (i22 >= l0l0o0003.I000OOo1O()) {
                                                                break;
                                                            }
/* 181 */                                                   l0lliIlIO l0lliilioI000OiO3 = l0l0o0003.I000OiO(i22);
/* 182 */                                                   if ("_elt".equals(l0lliilioI000OiO3.I001IIilI0O())) {
/* 183 */                                                       l0l0o0003.I0010I0i(l0lliilioI000OiO3.I001iOo1i0O());
/* 184 */                                                       l0l0o0003.I000lI(i22);
                                                                break;
                                                            }
                                                            i22++;
                                                        }
                                                    }
                                                }
/* 186 */                                       if (lilool0.I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I01101olii)) {
                                                }
/* 193 */                                       if (l0l0o0003.I000OOo1O() == 0) {
                                                }
                                                i6 = i14;
/* 225 */                                       ((ArrayList) i0Oo1I101o3.I0000O).set(i6, (l0l1iIIOl) l0l0o0003.I0000oI00());
/* 226 */                                       l0ooii1ooo2.I00OilO00Il(l0l0o0003);
                                                i12 = i + 1;
                                            }
                                        }
                                    }
/* 40 */                            l0lOoOo1Ioi l0loooo1ioiI00IO15 = l0lliIlIO.I00IO1();
/* 41 */                            l0loooo1ioiI00IO15.I000O01llI0("_ct");
                                    if (!z3) {
/* 42 */                                String strI00111O3 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 46 */                                String str17 = (lilool0.I00Iooi00oi(strI00111O3, str12) && lilool0.I00Iooi00oi(strI00111O3, "_iap") && lilool0.I00Iooi00oi(strI00111O3, "ecommerce_purchase")) ? "new" : "returning";
                                        l0loooo1ioiI00IO15.I000OOo1O(str17);
/* 48 */                                l0l0o0003.I000iOII((l0lliIlIO) l0loooo1ioiI00IO15.I0000oI00());
                                        z3 = true;
/* 51 */                                if (l0l0o0003.I000o00OoI0I().equals(ll0i0l0Ili.I00000oOI(str11, iO1l1II0O0.I0001Ioi1lo, iO1l1II0O0.I00000oIO))) {
                                        }
/* 66 */                                iil1iilI00Ol1ll1 = lilool0.I00Ol1ll1();
                                        iol01i0001 = iol1II1ii1i.I0110OiO;
/* 67 */                                if (iil1iilI00Ol1ll1.I01101IOlO(null, iol01i0001)) {
/* 69 */                                    l0l0o0003.I000oI1ioi("_iap");
/* 72 */                                    lilool0.I00II0oii1o().I00lll10.I00000oOI("Renaming in_app_purchase to _iap");
                                        }
/* 74 */                                zI011IO1I11OI = lilool0.I00OloOo().I011IO1I11OI(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0003.I000o00OoI0I());
/* 76 */                                if (lilool0.I00Ol1ll1().I01101IOlO(null, iol01i0001)) {
/* 78 */                                    zI011IO1I11OI = lilool0.I00111O(l0l0o0003);
/* 79 */                                    String strI00111O4 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 80 */                                    if ("_iap".equals(l0l0o0003.I000o00OoI0I())) {
                                            }
/* 83 */                                    if (!"_iap".equals(l0l0o0003.I000o00OoI0I())) {
                                            }
                                        }
                                        if (zI011IO1I11OI) {
                                        }
                                    }
                                }
                                i11 = i6 + 1;
                                str12 = str6;
                                l0ooii1ooo3 = l0ooii1ooo2;
                                i9 = i3;
                                str13 = str8;
                                l3 = l;
                                i10 = i5;
                                str10 = str2;
                                str11 = str7;
                            }
                            int i23 = i;
                            int i24 = 0;
                            long jLongValue = 0;
                            while (i24 < i23) {
/* 227 */                       l0l1iIIOl l0l1iiiolI01OlOoii0 = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01OlOoii0(i24);
/* 228 */                       if ("_e".equals(l0l1iiiolI01OlOoii0.I001iOo1i0O())) {
/* 229 */                           lilool0.I00i0oil();
                                    if (lio010i.I010oio1OO0("_fr", l0l1iiiolI01OlOoii0) != null) {
/* 230 */                               l0ooii1ooo.I00Oio(i24);
                                        i23--;
                                        i24--;
                                    } else {
/* 231 */                               lilool0.I00i0oil();
                                        l0lliIlIO l0lliilioI010oio1OO0 = lio010i.I010oio1OO0("_et", l0l1iiiolI01OlOoii0);
                                        if (l0lliilioI010oio1OO0 != null) {
/* 232 */                                   Long lValueOf = l0lliilioI010oio1OO0.I001i1lo1io() ? Long.valueOf(l0lliilioI010oio1OO0.I001iOo1i0O()) : null;
                                            if (lValueOf != null && lValueOf.longValue() > 0) {
/* 234 */                                       jLongValue += lValueOf.longValue();
                                            }
                                        }
                                    }
                                }
                                i24++;
                            }
/* 235 */                   lilool0.I00IO1oi11O(l0ooii1ooo, jLongValue, false);
/* 236 */                   Iterator it3 = l0ooii1ooo.I00OIl().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
/* 237 */                       if ("_s".equals(((l0l1iIIOl) it3.next()).I001iOo1i0O())) {
/* 240 */                           lilool0.I00i01iIIliI().I01Iol(l0ooii1ooo.I000oI1ioi(), "_se");
                                    break;
                                }
                            }
/* 241 */                   if (lio010i.I01Ilioliio("_sid", l0ooii1ooo) >= 0) {
/* 242 */                       lilool0.I00IO1oi11O(l0ooii1ooo, jLongValue, true);
                            } else {
/* 243 */                       int iI01Ilioliio = lio010i.I01Ilioliio("_se", l0ooii1ooo);
                                if (iI01Ilioliio >= 0) {
/* 244 */                           l0ooii1ooo.I0000Il00O();
/* 245 */                           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00iIO(iI01Ilioliio);
/* 250 */                           lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Session engagement user property is in the bundle without session ID. appId", l01O0IO1ooO0.I010ioo(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()));
                                }
                            }
/* 252 */                   String strI00111O5 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 253 */                   lilool0.I00iOIl().I010II();
/* 254 */                   lilool0.I00iIi0i1o();
/* 255 */                   l0IIii l0iiiiI01Ol1o02 = lilool0.I00i01iIIliI().I01Ol1o0(strI00111O5);
                            if (l0iiiiI01Ol1o02 == null) {
/* 259 */                       lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Cannot fix consent fields without appInfo. appId", l01O0IO1ooO0.I010ioo(strI00111O5));
                            } else {
/* 260 */                       lilool0.I000O01llI0(l0iiiiI01Ol1o02, l0ooii1ooo);
                            }
/* 262 */                   String strI00111O6 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 263 */                   lilool0.I00iOIl().I010II();
/* 264 */                   lilool0.I00iIi0i1o();
/* 265 */                   l0IIii l0iiiiI01Ol1o03 = lilool0.I00i01iIIliI().I01Ol1o0(strI00111O6);
                            if (l0iiiiI01Ol1o03 == null) {
/* 269 */                       lilool0.I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Cannot populate ad_campaign_info without appInfo. appId", l01O0IO1ooO0.I010ioo(strI00111O6));
                            } else {
/* 270 */                       lilool0.I000OOo1O(l0iiiiI01Ol1o03, l0ooii1ooo);
                            }
/* 271 */                   l0ooii1ooo.I0000Il00O();
/* 272 */                   ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00iiI(Long.MAX_VALUE);
/* 273 */                   l0ooii1ooo.I0000Il00O();
/* 274 */                   ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00iiO(Long.MIN_VALUE);
/* 275 */                   for (int i25 = 0; i25 < l0ooii1ooo.I00OIo(); i25++) {
/* 276 */                       l0l1iIIOl l0l1iiiolI01OlOoii02 = ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01OlOoii0(i25);
                                if (l0l1iiiolI01OlOoii02.I001lIiIIo1O() < ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01i01iOOOIo()) {
/* 279 */                           long jI001lIiIIo1O = l0l1iiiolI01OlOoii02.I001lIiIIo1O();
/* 280 */                           l0ooii1ooo.I0000Il00O();
/* 281 */                           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00iiI(jI001lIiIIo1O);
                                }
                                if (l0l1iiiolI01OlOoii02.I001lIiIIo1O() > ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01i1oI()) {
/* 284 */                           long jI001lIiIIo1O2 = l0l1iiiolI01OlOoii02.I001lIiIIo1O();
/* 285 */                           l0ooii1ooo.I0000Il00O();
/* 286 */                           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00iiO(jI001lIiIIo1O2);
                                }
                            }
/* 287 */                   l0ooii1ooo.I00IoO0();
/* 288 */                   l1ioIO011Oo l1ioio011oo = l1ioIO011Oo.I0000Il00O;
/* 292 */                   l1ioIO011Oo l1ioio011ooI000OiO = lilool0.I00000oIO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()).I000OiO(l1ioIO011Oo.I0000Il00O(100, ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00o0iI0io1()));
/* 293 */                   l1ioIO011Oo l1ioio011ooI01IiOO = lilool0.I00i01iIIliI().I01IiOO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O());
/* 294 */                   lilool0.I00i01iIIliI().I01Ii0ll10O(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l1ioio011ooI000OiO);
/* 295 */                   l1iioiool l1iioioolVar = l1iioiool.ANALYTICS_STORAGE;
/* 296 */                   if (!l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar) && l1ioio011ooI01IiOO.I000OOo1O(l1iioioolVar)) {
/* 297 */                       lilool0.I00i01iIIliI().I01Io1ilOIIo(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O());
                            } else if (l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar) && !l1ioio011ooI01IiOO.I000OOo1O(l1iioioolVar)) {
/* 300 */                       lilool0.I00i01iIIliI().I01IoO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O());
                            }
/* 301 */                   l1iioiool l1iioioolVar2 = l1iioiool.AD_STORAGE;
/* 302 */                   if (!l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar2)) {
/* 303 */                       l0ooii1ooo.I0000Il00O();
/* 304 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01IlIoOI();
/* 305 */                       l0ooii1ooo.I0000Il00O();
/* 306 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Ilo0i();
/* 307 */                       l0ooii1ooo.I0000Il00O();
/* 308 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I010ioo();
                            }
/* 309 */                   if (!l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar)) {
/* 310 */                       l0ooii1ooo.I0000Il00O();
/* 311 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Io001O();
/* 312 */                       l0ooii1ooo.I0000Il00O();
/* 313 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01101IOlO();
                            }
/* 314 */                   iIO0ooOool.I00000oIO();
/* 316 */                   if (lilool0.I00Ol1ll1().I01101IOlO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), iol1II1ii1i.I0100i)) {
/* 317 */                       lilool0.I00iIO();
/* 321 */                       if (lioil0ilIOi.I01I01Oolii((String) iol1II1ii1i.I00io1l.I00000oIO(null), ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()) && lilool0.I00000oIO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()).I000OOo1O(l1iioioolVar2) && ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00oIiI10()) {
/* 326 */                           lilool0.I0010I0i(l0ooii1ooo, i0Oo1I101o3);
                                }
                            }
/* 327 */                   l0ooii1ooo.I0000Il00O();
/* 328 */                   ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01O1lIi();
/* 341 */                   l0ooii1ooo.I00IlilI0i0i(lilool0.I00i0ilIl0i().I010ioo(l0ooii1ooo.I000oI1ioi(), l0ooii1ooo.I00OIl(), Collections.unmodifiableList(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Olioli()), Long.valueOf(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01i01iOOOIo()), Long.valueOf(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01i1oI()), !l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar)));
/* 342 */                   if (lilool0.I00Ol1ll1().I010i10l(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O())) {
/* 343 */                       HashMap map = new HashMap();
/* 344 */                       ArrayList arrayList4 = new ArrayList();
/* 345 */                       SecureRandom secureRandomI01OO1I = lilool0.I00iIO().I01OO1I();
                                int i26 = 0;
/* 346 */                       while (i26 < l0ooii1ooo.I00OIo()) {
/* 348 */                           l0l0O000 l0l0o0006 = (l0l0O000) ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01OlOoii0(i26).I000OiO();
/* 349 */                           if (l0l0o0006.I000o00OoI0I().equals("_ep")) {
/* 350 */                               lilool0.I00i0oil();
                                        String str18 = (String) lio010i.I01101olii("_en", (l0l1iIIOl) l0l0o0006.I0000oI00());
/* 351 */                               ii01Ioio01i ii01ioio01iI011lOIoo0l = (ii01Ioio01i) map.get(str18);
                                        if (ii01ioio01iI011lOIoo0l == null) {
/* 352 */                                   iOl1lOo1IO iol1loo1ioI00i01iIIliI = lilool0.I00i01iIIliI();
/* 353 */                                   String strI00111O7 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
                                            lII0I0I000I.I000II(str18);
/* 354 */                                   ii01ioio01iI011lOIoo0l = iol1loo1ioI00i01iIIliI.I011lOIoo0l("events", strI00111O7, str18);
                                            if (ii01ioio01iI011lOIoo0l != null) {
/* 355 */                                       map.put(str18, ii01ioio01iI011lOIoo0l);
                                            }
                                        }
                                        if (ii01ioio01iI011lOIoo0l == null || ii01ioio01iI011lOIoo0l.I000OOo1O != null) {
                                            l2 = l;
                                        } else {
                                            Long l4 = ii01ioio01iI011lOIoo0l.I000OiO;
                                            if (l4 != null && l4.longValue() > 1) {
/* 357 */                                       lilool0.I00i0oil();
/* 358 */                                       lio010i.I010lI0oi(l0l0o0006, "_sr", l4);
                                            }
                                            Boolean bool = ii01ioio01iI011lOIoo0l.I000iOII;
/* 359 */                                   if (bool == null || !bool.booleanValue()) {
                                                l2 = l;
                                            } else {
/* 360 */                                       lilool0.I00i0oil();
                                                l2 = l;
/* 361 */                                       lio010i.I010lI0oi(l0l0o0006, "_efs", l2);
                                            }
/* 362 */                                   arrayList4.add((l0l1iIIOl) l0l0o0006.I0000oI00());
                                        }
/* 363 */                               l0ooii1ooo.I00OOll1(i26, l0l0o0006);
                                        l0olllo1i3 = l0olllo1i;
                                    } else {
                                        l2 = l;
/* 364 */                               l0l1ol11 l0l1ol11VarI00OloOo = lilool0.I00OloOo();
/* 365 */                               String strI00111O8 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 366 */                               String strI00OIl = l0l1ol11VarI00OloOo.I00OIl(strI00111O8, "measurement.account.time_zone_offset_minutes");
/* 367 */                               if (TextUtils.isEmpty(strI00OIl)) {
                                            j2 = 0;
/* 374 */                                   I00iIO();
                                            long j4 = j2 * 60000;
/* 375 */                                   long jI00100l0 = (l0l0o0006.I00100l0() + j4) / 86400000;
/* 376 */                                   l0l1iIIOl l0l1iiiol = (l0l1iIIOl) l0l0o0006.I0000oI00();
/* 377 */                                   if (TextUtils.isEmpty("_dbg")) {
                                            }
                                        } else {
                                            try {
/* 368 */                                       j2 = Long.parseLong(strI00OIl);
                                            } catch (NumberFormatException e) {
/* 373 */                                       ((l0olllO1i) l0l1ol11VarI00OloOo.I00iOIl).I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(strI00111O8), "Unable to parse timezone offset. appId", e);
                                            }
/* 374 */                                   I00iIO();
                                            long j42 = j2 * 60000;
/* 375 */                                   long jI00100l02 = (l0l0o0006.I00100l0() + j42) / 86400000;
/* 376 */                                   l0l1iIIOl l0l1iiiol2 = (l0l1iIIOl) l0l0o0006.I0000oI00();
/* 377 */                                   if (TextUtils.isEmpty("_dbg")) {
                                                for (l0lliIlIO l0lliilio5 : l0l1iiiol2.I001IO000()) {
                                                    l0olllo1i3 = l0olllo1i;
/* 379 */                                           if (!"_dbg".equals(l0lliilio5.I001IIilI0O())) {
                                                        l0olllo1i = l0olllo1i3;
                                                    } else if (l2.equals(Long.valueOf(l0lliilio5.I001iOo1i0O()))) {
                                                        iI011Ill = 1;
                                                        if (iI011Ill > 0) {
                                                        }
                                                    } else {
/* 382 */                                               iI011Ill = I00OloOo().I011Ill(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0006.I000o00OoI0I());
                                                        if (iI011Ill > 0) {
/* 385 */                                                   I00II0oii1o().I00l0I0l0lO1.I0000O(l0l0o0006.I000o00OoI0I(), "Sample rate must be positive. event, rate", Integer.valueOf(iI011Ill));
/* 387 */                                                   arrayList4.add((l0l1iIIOl) l0l0o0006.I0000oI00());
/* 388 */                                                   l0ooii1ooo.I00OOll1(i26, l0l0o0006);
                                                        } else {
/* 389 */                                                   ii01Ioio01i ii01ioio01iI00000oOI = (ii01Ioio01i) map.get(l0l0o0006.I000o00OoI0I());
                                                            if (ii01ioio01iI00000oOI == null) {
                                                                j3 = j42;
/* 391 */                                                       ii01ioio01iI00000oOI = I00i01iIIliI().I011lOIoo0l("events", ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0006.I000o00OoI0I());
                                                                if (ii01ioio01iI00000oOI == null) {
/* 397 */                                                           I00II0oii1o().I00l0I0l0lO1.I0000O(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), "Event being bundled has no eventAggregate. appId, eventName", l0l0o0006.I000o00OoI0I());
/* 400 */                                                           ii01ioio01iI00000oOI = new ii01Ioio01i(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0006.I000o00OoI0I(), 1L, 1L, 1L, l0l0o0006.I00100l0(), 0L, null, null, null, null);
                                                                }
                                                            } else {
                                                                j3 = j42;
                                                            }
/* 401 */                                                   I00i0oil();
                                                            Long l5 = (Long) lio010i.I01101olii("_eid", (l0l1iIIOl) l0l0o0006.I0000oI00());
                                                            boolean z8 = l5 != null;
                                                            if (iI011Ill == 1) {
/* 402 */                                                       arrayList4.add((l0l1iIIOl) l0l0o0006.I0000oI00());
/* 403 */                                                       if (z8 && (ii01ioio01iI00000oOI.I000OOo1O != null || ii01ioio01iI00000oOI.I000OiO != null || ii01ioio01iI00000oOI.I000iOII != null)) {
/* 405 */                                                           map.put(l0l0o0006.I000o00OoI0I(), ii01ioio01iI00000oOI.I00000oOI(null, null, null));
                                                                }
/* 406 */                                                       l0ooii1ooo.I00OOll1(i26, l0l0o0006);
                                                            } else {
/* 407 */                                                       if (secureRandomI01OO1I.nextInt(iI011Ill) == 0) {
/* 408 */                                                           I00i0oil();
/* 409 */                                                           Long lValueOf2 = Long.valueOf(iI011Ill);
                                                                    lio010i.I010lI0oi(l0l0o0006, "_sr", lValueOf2);
/* 410 */                                                           arrayList4.add((l0l1iIIOl) l0l0o0006.I0000oI00());
                                                                    if (z8) {
/* 411 */                                                               ii01ioio01iI00000oOI = ii01ioio01iI00000oOI.I00000oOI(null, lValueOf2, null);
                                                                    }
                                                                    i0Oo1I101o = i0Oo1I101o3;
/* 415 */                                                           map.put(l0l0o0006.I000o00OoI0I(), new ii01Ioio01i(ii01ioio01iI00000oOI.I00000oIO, ii01ioio01iI00000oOI.I00000oOI, ii01ioio01iI00000oOI.I0000Il00O, ii01ioio01iI00000oOI.I0000O, ii01ioio01iI00000oOI.I0000oI00, ii01ioio01iI00000oOI.I0001Ioi1lo, l0l0o0006.I00100l0(), Long.valueOf(jI00100l02), ii01ioio01iI00000oOI.I000OOo1O, ii01ioio01iI00000oOI.I000OiO, ii01ioio01iI00000oOI.I000iOII));
                                                                } else {
                                                                    i0Oo1I101o = i0Oo1I101o3;
/* 416 */                                                           Long l6 = ii01ioio01iI00000oOI.I000O01llI0;
                                                                    if (l6 != null) {
/* 417 */                                                               jI00100o1O0lo = l6.longValue();
                                                                    } else {
/* 418 */                                                               I00iIO();
/* 419 */                                                               jI00100o1O0lo = (j3 + l0l0o0006.I00100o1O0lo()) / 86400000;
                                                                    }
                                                                    if (jI00100o1O0lo != jI00100l02) {
/* 420 */                                                               I00i0oil();
                                                                        lio010i.I010lI0oi(l0l0o0006, "_efs", l2);
/* 421 */                                                               I00i0oil();
/* 422 */                                                               Long lValueOf3 = Long.valueOf(iI011Ill);
                                                                        lio010i.I010lI0oi(l0l0o0006, "_sr", lValueOf3);
/* 423 */                                                               arrayList4.add((l0l1iIIOl) l0l0o0006.I0000oI00());
                                                                        if (z8) {
/* 424 */                                                                   ii01ioio01iI00000oOI = ii01ioio01iI00000oOI.I00000oOI(null, lValueOf3, Boolean.TRUE);
                                                                        }
/* 428 */                                                               map.put(l0l0o0006.I000o00OoI0I(), new ii01Ioio01i(ii01ioio01iI00000oOI.I00000oIO, ii01ioio01iI00000oOI.I00000oOI, ii01ioio01iI00000oOI.I0000Il00O, ii01ioio01iI00000oOI.I0000O, ii01ioio01iI00000oOI.I0000oI00, ii01ioio01iI00000oOI.I0001Ioi1lo, l0l0o0006.I00100l0(), Long.valueOf(jI00100l02), ii01ioio01iI00000oOI.I000OOo1O, ii01ioio01iI00000oOI.I000OiO, ii01ioio01iI00000oOI.I000iOII));
                                                                    } else {
                                                                        if (z8) {
/* 430 */                                                                   map.put(l0l0o0006.I000o00OoI0I(), ii01ioio01iI00000oOI.I00000oOI(l5, null, null));
                                                                        }
/* 431 */                                                               l0ooii1ooo.I00OOll1(i26, l0l0o0006);
                                                                    }
                                                                }
/* 431 */                                                       l0ooii1ooo.I00OOll1(i26, l0l0o0006);
                                                            }
                                                        }
                                                    }
                                                }
                                                l0olllo1i3 = l0olllo1i;
/* 382 */                                       iI011Ill = I00OloOo().I011Ill(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0006.I000o00OoI0I());
                                                if (iI011Ill > 0) {
                                                }
                                            } else {
                                                l0olllo1i3 = l0olllo1i;
/* 382 */                                       iI011Ill = I00OloOo().I011Ill(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), l0l0o0006.I000o00OoI0I());
                                                if (iI011Ill > 0) {
                                                }
                                            }
                                        }
                                        i26++;
                                        lilool0 = this;
                                        l = l2;
                                        i0Oo1I101o3 = i0Oo1I101o;
                                        l0olllo1i = l0olllo1i3;
                                    }
                                    i0Oo1I101o = i0Oo1I101o3;
                                    i26++;
                                    lilool0 = this;
                                    l = l2;
                                    i0Oo1I101o3 = i0Oo1I101o;
                                    l0olllo1i = l0olllo1i3;
                                }
                                l0olllo1i2 = l0olllo1i;
                                I0Oo1I101o i0Oo1I101o4 = i0Oo1I101o3;
/* 432 */                       if (arrayList4.size() < l0ooii1ooo.I00OIo()) {
/* 433 */                           l0ooii1ooo.I0000Il00O();
/* 434 */                           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00i01iIIliI();
/* 435 */                           l0ooii1ooo.I0000Il00O();
/* 436 */                           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00OloOo(arrayList4);
                                }
/* 437 */                       Iterator it4 = map.entrySet().iterator();
                                while (it4.hasNext()) {
/* 439 */                           I00i01iIIliI().I011olOoO("events", (ii01Ioio01i) ((Map.Entry) it4.next()).getValue());
                                }
                                i0Oo1I101o3 = i0Oo1I101o4;
                            } else {
                                l0olllo1i2 = l0olllo1i;
                            }
/* 441 */                   String strI00111O9 = ((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O();
/* 442 */                   l0IIii l0iiiiI01Ol1o04 = I00i01iIIliI().I01Ol1o0(strI00111O9);
                            if (l0iiiiI01Ol1o04 == null) {
/* 447 */                       I00II0oii1o().I00ilO0.I0000Il00O("Bundling raw events w/o app info. appId", l01O0IO1ooO0.I010ioo(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()));
                            } else if (l0ooii1ooo.I00OIo() > 0) {
/* 450 */                       l0o10OoO0 l0o10ooo0 = l0iiiiI01Ol1o04.I00000oIO.I00io1l;
/* 451 */                       l0olllO1i.I000II(l0o10ooo0);
/* 452 */                       l0o10ooo0.I010II();
                                long j5 = l0iiiiI01Ol1o04.I000OOo1O;
                                if (j5 != 0) {
/* 453 */                           l0ooii1ooo.I000O01llI0(j5);
                                } else {
/* 454 */                           l0ooii1ooo.I000OOo1O();
                                }
/* 456 */                       l0o10OoO0 l0o10ooo02 = l0iiiiI01Ol1o04.I00000oIO.I00io1l;
/* 457 */                       l0olllO1i.I000II(l0o10ooo02);
/* 458 */                       l0o10ooo02.I010II();
                                long j6 = l0iiiiI01Ol1o04.I000O01llI0;
                                if (j6 != 0) {
                                    j5 = j6;
                                }
                                if (j5 != 0) {
/* 459 */                           l0ooii1ooo.I00Ol1ll1(j5);
                                } else {
/* 460 */                           l0ooii1ooo.I00OloOo();
                                }
/* 461 */                       l0iiiiI01Ol1o04.I000O01llI0(l0ooii1ooo.I00OIo());
/* 463 */                       l0o10OoO0 l0o10ooo03 = l0iiiiI01Ol1o04.I00000oIO.I00io1l;
/* 464 */                       l0olllO1i.I000II(l0o10ooo03);
/* 465 */                       l0o10ooo03.I010II();
                                int i27 = (int) l0iiiiI01Ol1o04.I00IO1;
/* 466 */                       l0ooii1ooo.I0000Il00O();
/* 467 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I011iIOio(i27);
/* 469 */                       l0o10OoO0 l0o10ooo04 = l0iiiiI01Ol1o04.I00000oIO.I00io1l;
/* 470 */                       l0olllO1i.I000II(l0o10ooo04);
/* 471 */                       l0o10ooo04.I010II();
/* 472 */                       l0ooii1ooo.I001i1lo1io((int) l0iiiiI01Ol1o04.I000II);
/* 474 */                       l0iiiiI01Ol1o04.I00IoIO0lI(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01i01iOOOIo());
/* 476 */                       l0iiiiI01Ol1o04.I00IoO0(((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01i1oI());
/* 477 */                       String strI001IO000 = l0iiiiI01Ol1o04.I001IO000();
                                if (strI001IO000 != null) {
/* 478 */                           l0ooii1ooo.I00IO1(strI001IO000);
                                } else {
/* 479 */                           l0ooii1ooo.I00IO1oi11O();
                                }
/* 481 */                       I00i01iIIliI().I01OlIoIl(l0iiiiI01Ol1o04, false);
                            }
/* 482 */                   if (l0ooii1ooo.I00OIo() > 0) {
/* 483 */                       l0olllo1i2.getClass();
/* 485 */                       if (I00Ol1ll1().I01101IOlO(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O(), iol1II1ii1i.I011IOil)) {
/* 486 */                           String strI000oI1ioi = l0ooii1ooo.I000oI1ioi();
/* 487 */                           if (!TextUtils.isEmpty(strI000oI1ioi) && (l0iiiiI01Ol1o0 = I00i01iIIliI().I01Ol1o0(strI000oI1ioi)) != null) {
/* 489 */                               I00IoO0().getClass();
/* 490 */                               long jCurrentTimeMillis = System.currentTimeMillis();
/* 492 */                               l0o10OoO0 l0o10ooo05 = l0iiiiI01Ol1o0.I00000oIO.I00io1l;
/* 493 */                               l0olllO1i.I000II(l0o10ooo05);
/* 494 */                               l0o10ooo05.I010II();
                                        if (jCurrentTimeMillis - l0iiiiI01Ol1o0.I00IlilI0i0i >= I00Ol1ll1().I010lI0oi(strI000oI1ioi, iol1II1ii1i.I00oI0i)) {
/* 496 */                                   List listI01IO1il = I00i01iIIliI().I01IO1il("");
/* 497 */                                   if (!listI01IO1il.isEmpty()) {
/* 499 */                                       l0ooii1ooo.I0000Il00O();
/* 498 */                                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Ol1o0(listI01IO1il);
                                            }
/* 501 */                                   List listI01IO1il2 = I00i01iIIliI().I01IO1il(strI000oI1ioi);
/* 502 */                                   if (!listI01IO1il2.isEmpty()) {
/* 504 */                                       l0ooii1ooo.I0000Il00O();
/* 503 */                                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I01Ol1o0(listI01IO1il2);
                                            }
/* 506 */                                   l0iiiiI01Ol1o0.I001IIilI0O(jCurrentTimeMillis);
/* 508 */                                   I00i01iIIliI().I01OlIoIl(l0iiiiI01Ol1o0, false);
                                        }
                                    }
                                }
/* 509 */                       l00O0loO l00o0looI01101olii = I00OloOo().I01101olii(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O());
                                if (l00o0looI01101olii != null && l00o0looI01101olii.I00111O()) {
/* 510 */                           long jI001IIilI0O = l00o0looI01101olii.I001IIilI0O();
/* 511 */                           l0ooii1ooo.I0000Il00O();
/* 512 */                           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I010i10l(jI001IIilI0O);
                                } else if (((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00IioO0OiOi().isEmpty()) {
/* 515 */                           l0ooii1ooo.I0000Il00O();
/* 516 */                           ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I010i10l(-1L);
                                } else {
/* 521 */                           I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Did not find measurement config or missing version info. appId", l01O0IO1ooO0.I010ioo(((l100ll0OOIoO) i0Oo1I101o3.I00000oOI).I00111O()));
                                }
/* 522 */                       I00i01iIIliI().I01OoOi((l100ll0OOIoO) l0ooii1ooo.I0000oI00(), z4);
                            }
/* 523 */                   I00i01iIIliI().I011IO1I11OI((ArrayList) i0Oo1I101o3.I0000Il00O);
/* 524 */                   iOl1lOo1IO iol1loo1ioI00i01iIIliI2 = I00i01iIIliI();
                            try {
/* 526 */                       iol1loo1ioI00i01iIIliI2.I01Io11IiiiO().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{strI00111O9, strI00111O9});
                            } catch (SQLiteException e2) {
/* 531 */                       ((l0olllO1i) iol1loo1ioI00i01iIIliI2.I00iOIl).I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(strI00111O9), "Failed to remove unused event metadata. appId", e2);
                            }
/* 532 */                   I00i01iIIliI().I01Io001O();
                            z = true;
                        }
/* 534 */               I00i01iIIliI().I01Io1();
                        return z;
                    } catch (Throwable th) {
                        I00i01iIIliI().I01Io1();
/* 535 */               throw th;
                    }
                }

                public final void I00IO1oi11O(l0ooIi1oOO l0ooii1ooo, long j, boolean z) throws Throwable {
                    lioOO0ioOI liooo0iooi;
/* 8 */             String str = true != z ? "_lte" : "_se";
/* 11 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 13 */            I00O0o1oo(iol1loo1io);
/* 20 */            lioOO0ioOI liooo0iooiI01O1I1 = iol1loo1io.I01O1I1(l0ooii1ooo.I000oI1ioi(), str);
/* 24 */            if (liooo0iooiI01O1I1 != null) {
/* 26 */                Object obj = liooo0iooiI01O1I1.I0000oI00;
/* 30 */                String strI000oI1ioi = l0ooii1ooo.I000oI1ioi();
/* 38 */                I00IoO0().getClass();
/* 58 */                liooo0iooi = new lioOO0ioOI(strI000oI1ioi, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
                    } else {
/* 64 */                String strI000oI1ioi2 = l0ooii1ooo.I000oI1ioi();
/* 72 */                I00IoO0().getClass();
/* 85 */                liooo0iooi = new lioOO0ioOI(strI000oI1ioi2, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
                    }
/* 88 */            l1IIIIIl1iIO l1iiiiil1iioI00II0oii1o = l1IOl1iI00l.I00II0oii1o();
/* 92 */            l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 99 */            ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IO1oi11O(str);
/* 106 */           I00IoO0().getClass();
/* 109 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 113 */           l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 120 */           ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IO1(jCurrentTimeMillis);
/* 123 */           Object obj2 = liooo0iooi.I0000oI00;
/* 128 */           long jLongValue = ((Long) obj2).longValue();
/* 132 */           l1iiiiil1iioI00II0oii1o.I0000Il00O();
/* 139 */           ((l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I00iiI).I00IlilI0i0i(jLongValue);
/* 146 */           l1IOl1iI00l l1iol1ii00l = (l1IOl1iI00l) l1iiiiil1iioI00II0oii1o.I0000oI00();
/* 148 */           int iI01Ilioliio = lio010i.I01Ilioliio(str, l0ooii1ooo);
/* 152 */           if (iI01Ilioliio >= 0) {
/* 154 */               l0ooii1ooo.I0000Il00O();
/* 161 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00i0ilIl0i(iI01Ilioliio, l1iol1ii00l);
                    } else {
/* 165 */               l0ooii1ooo.I0000Il00O();
/* 172 */               ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I00i0oil(l1iol1ii00l);
                    }
/* 179 */           if (j > 0) {
/* 181 */               iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 183 */               I00O0o1oo(iol1loo1io2);
/* 186 */               iol1loo1io2.I01O10iIoo1O(liooo0iooi);
/* 204 */               I00II0oii1o().I00lll10.I0000O(true != z ? "lifetime" : "session-scoped", "Updated engagement user property. scope, value", obj2);
                    }
                }

                public final boolean I00IOO(l0l0O000 l0l0o000, l0l0O000 l0l0o0002) {
/* 11 */            lII0I0I000I.I00000oOI("_e".equals(l0l0o000.I000o00OoI0I()));
/* 14 */            I00i0oil();
/* 25 */            l0lliIlIO l0lliilioI010oio1OO0 = lio010i.I010oio1OO0("_sc", (l0l1iIIOl) l0l0o000.I0000oI00());
/* 34 */            String strI001i1O0Ol = l0lliilioI010oio1OO0 == null ? null : l0lliilioI010oio1OO0.I001i1O0Ol();
/* 38 */            I00i0oil();
/* 49 */            l0lliIlIO l0lliilioI010oio1OO02 = lio010i.I010oio1OO0("_pc", (l0l1iIIOl) l0l0o0002.I0000oI00());
/* 56 */            String strI001i1O0Ol2 = l0lliilioI010oio1OO02 != null ? l0lliilioI010oio1OO02.I001i1O0Ol() : null;
/* 60 */            if (strI001i1O0Ol2 == null || !strI001i1O0Ol2.equals(strI001i1O0Ol)) {
/* 171 */               return false;
                    }
/* 76 */            lII0I0I000I.I00000oOI("_e".equals(l0l0o000.I000o00OoI0I()));
/* 79 */            I00i0oil();
/* 90 */            l0lliIlIO l0lliilioI010oio1OO03 = lio010i.I010oio1OO0("_et", (l0l1iIIOl) l0l0o000.I0000oI00());
/* 94 */            if (l0lliilioI010oio1OO03 == null || !l0lliilioI010oio1OO03.I001i1lo1io() || l0lliilioI010oio1OO03.I001iOo1i0O() <= 0) {
/* 169 */               return true;
                    }
/* 113 */           long jI001iOo1i0O = l0lliilioI010oio1OO03.I001iOo1i0O();
/* 117 */           I00i0oil();
/* 126 */           l0lliIlIO l0lliilioI010oio1OO04 = lio010i.I010oio1OO0("_et", (l0l1iIIOl) l0l0o0002.I0000oI00());
/* 130 */           if (l0lliilioI010oio1OO04 != null && l0lliilioI010oio1OO04.I001iOo1i0O() > 0) {
/* 144 */               jI001iOo1i0O += l0lliilioI010oio1OO04.I001iOo1i0O();
                    }
/* 145 */           I00i0oil();
/* 152 */           lio010i.I010lI0oi(l0l0o0002, "_et", Long.valueOf(jI001iOo1i0O));
/* 155 */           I00i0oil();
/* 166 */           lio010i.I010lI0oi(l0l0o000, "_fr", 1L);
/* 169 */           return true;
                }

                public final void I00IioO0OiOi(l0l0O000 l0l0o000, String str, String str2) {
/* 7 */             ArrayList arrayList = new ArrayList(l0l0o000.I000O01llI0());
/* 10 */            int i = 0;
                    while (true) {
/* 16 */                if (i >= arrayList.size()) {
/* 38 */                    i = -1;
                            break;
                        } else if (str.equals(((l0lliIlIO) arrayList.get(i)).I001IIilI0O())) {
                            break;
                        } else {
/* 35 */                    i++;
                        }
                    }
/* 39 */            if (i == -1) {
/* 41 */                return;
                    }
/* 55 */            double dI001lloI = l0l0o000.I000OiO(i).I001lloI() * 1000000.0d;
/* 60 */            if (dI001lloI == 0.0d) {
/* 71 */                dI001lloI = l0l0o000.I000OiO(i).I001iOo1i0O() * 1000000.0d;
                    }
/* 76 */            if (dI001lloI > 9.223372036854776E18d || dI001lloI < -9.223372036854776E18d) {
/* 133 */               I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str2), IlIi0I0.I000lI("Data lost. Purchase ", str, " is too big. appId"), Double.valueOf(dI001lloI));
/* 408 */               return;
                    }
/* 84 */            l0l0o000.I000lI(i);
/* 87 */            l0lOoOo1Ioi l0loooo1ioiI00IO1 = l0lliIlIO.I00IO1();
/* 91 */            l0loooo1ioiI00IO1.I000O01llI0(str);
/* 98 */            l0loooo1ioiI00IO1.I000OiO(Math.round(dI001lloI));
/* 107 */           l0l0o000.I000iOII((l0lliIlIO) l0loooo1ioiI00IO1.I0000oI00());
                }

                public final boolean I00IlilI0i0i() {
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 11 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 13 */            I00O0o1oo(iol1loo1io);
/* 27 */            if (iol1loo1io.I011iO("select count(1) > 0 from raw_events", null) != 0) {
/* 45 */                return true;
                    }
/* 30 */            iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 32 */            I00O0o1oo(iol1loo1io2);
                    return !TextUtils.isEmpty(iol1loo1io2.I010lI0oi());
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0341  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00Io1lO() {
                    boolean z;
                    long jMax;
                    long jMax2;
                    int i;
                    Integer num;
                    int iIntValue;
/* 3 */             lio010i lio010iVar = this.I00io1l;
/* 9 */             I00iOIl().I010II();
/* 12 */            I00iIi0i1o();
/* 21 */            if (this.I00o0iI0io1 > 0) {
/* 27 */                I00IoO0().getClass();
/* 44 */                long jAbs = 3600000 - Math.abs(SystemClock.elapsedRealtime() - this.I00o0iI0io1);
/* 47 */                if (jAbs > 0) {
/* 61 */                    I00II0oii1o().I00lll10.I0000Il00O("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
/* 68 */                    I00i0O().I00000oIO();
/* 71 */                    liI1IolOl lii1iolol = this.I00ilI0I1;
/* 73 */                    I00O0o1oo(lii1iolol);
/* 76 */                    lii1iolol.I010ioo();
/* 79 */                    return;
                        }
/* 80 */                this.I00o0iI0io1 = 0L;
                    }
/* 88 */            if (!this.I00ll1.I0000Il00O() || !I00IlilI0i0i()) {
/* 978 */               I00II0oii1o().I00lll10.I00000oOI("Nothing to upload or uploading impossible");
/* 985 */               I00i0O().I00000oIO();
/* 988 */               liI1IolOl lii1iolol2 = this.I00ilI0I1;
/* 990 */               I00O0o1oo(lii1iolol2);
/* 993 */               lii1iolol2.I010ioo();
/* 2498 */              return;
                    }
/* 100 */           I00IoO0().getClass();
/* 103 */           long jCurrentTimeMillis = System.currentTimeMillis();
/* 107 */           I00Ol1ll1();
/* 123 */           long jMax3 = Math.max(0L, ((Long) iol1II1ii1i.I00IoiI.I00000oIO(null)).longValue());
/* 127 */           iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 129 */           I00O0o1oo(iol1loo1io);
/* 140 */           if (iol1loo1io.I011iO("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
/* 142 */               z = true;
                    } else {
/* 144 */               iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 146 */               I00O0o1oo(iol1loo1io2);
/* 157 */               if (iol1loo1io2.I011iO("select count(1) > 0 from queue where has_realtime = 1", null) == 0) {
/* 160 */                   z = false;
                        }
                    }
/* 161 */           if (z) {
/* 169 */               String strI010ioo = I00Ol1ll1().I010ioo("debug.firebase.analytics.app");
/* 177 */               if (TextUtils.isEmpty(strI010ioo) || ".none.".equals(strI010ioo)) {
/* 207 */                   I00Ol1ll1();
/* 222 */                   jMax = Math.max(0L, ((Long) iol1II1ii1i.I00IioO0OiOi.I00000oIO(null)).longValue());
                        } else {
/* 187 */                   I00Ol1ll1();
/* 202 */                   jMax = Math.max(0L, ((Long) iol1II1ii1i.I00IlilI0i0i.I00000oIO(null)).longValue());
                        }
                    } else {
/* 227 */               I00Ol1ll1();
/* 242 */               jMax = Math.max(0L, ((Long) iol1II1ii1i.I00IOO.I00000oIO(null)).longValue());
                    }
/* 250 */           long jI00000oIO = this.I00l0I0l0lO1.I00ioIO.I00000oIO();
/* 258 */           long jI00000oIO2 = this.I00l0I0l0lO1.I00l0I0l0lO1.I00000oIO();
/* 262 */           iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 264 */           I00O0o1oo(iol1loo1io3);
/* 269 */           long jI011iiii0i = iol1loo1io3.I011iiii0i("select max(bundle_end_timestamp) from queue", null, 0L);
/* 273 */           iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 275 */           I00O0o1oo(iol1loo1io4);
/* 288 */           long jMax4 = Math.max(jI011iiii0i, iol1loo1io4.I011iiii0i("select max(timestamp) from raw_events", null, 0L));
/* 294 */           if (jMax4 != 0) {
/* 309 */               long jAbs2 = jCurrentTimeMillis - Math.abs(jMax4 - jCurrentTimeMillis);
/* 317 */               long jAbs3 = jCurrentTimeMillis - Math.abs(jI00000oIO - jCurrentTimeMillis);
/* 325 */               long jAbs4 = jCurrentTimeMillis - Math.abs(jI00000oIO2 - jCurrentTimeMillis);
/* 327 */               long jMin = jMax3 + jAbs2;
/* 328 */               long jMax5 = Math.max(jAbs3, jAbs4);
/* 332 */               if (z && jMax5 > 0) {
/* 344 */                   jMin = Math.min(jAbs2, jMax5) + jMax;
                        }
/* 345 */               I00O0o1oo(lio010iVar);
/* 358 */               jMax2 = !lio010iVar.I01Ii0ll10O(jMax5, jMax) ? jMax5 + jMax : jMin;
/* 362 */               if (jAbs4 != 0 && jAbs4 >= jAbs2) {
/* 368 */                   int i2 = 0;
                            while (true) {
/* 369 */                       I00Ol1ll1();
/* 384 */                       i = 0;
/* 395 */                       if (i2 >= Math.min(20, Math.max(0, ((Integer) iol1II1ii1i.I00O0i0ii.I00000oIO(null)).intValue()))) {
/* 432 */                           jMax2 = 0;
                                    break;
                                }
/* 400 */                       I00Ol1ll1();
/* 422 */                       jMax2 += Math.max(0L, ((Long) iol1II1ii1i.I00Iooi00oi.I00000oIO(null)).longValue()) * (1 << i2);
/* 425 */                       if (jMax2 > jAbs4) {
                                    break;
                                } else {
/* 429 */                           i2++;
                                }
                            }
                        }
/* 438 */               if (jMax2 != 0) {
/* 448 */                   I00II0oii1o().I00lll10.I00000oOI("Next upload time is 0");
/* 455 */                   I00i0O().I00000oIO();
/* 458 */                   liI1IolOl lii1iolol3 = this.I00ilI0I1;
/* 460 */                   I00O0o1oo(lii1iolol3);
/* 463 */                   lii1iolol3.I010ioo();
/* 466 */                   return;
                        }
/* 467 */               l0I1IOo l0i1ioo = this.I00iiI;
/* 469 */               I00O0o1oo(l0i1ioo);
/* 476 */               if (!l0i1ioo.I010ioo()) {
/* 892 */                   I00II0oii1o().I00lll10.I00000oOI("No network");
/* 895 */                   l0IilI01 l0iili01I00i0O = I00i0O();
/* 899 */                   lilOOl0 lilool0 = l0iili01I00i0O.I00000oIO;
/* 901 */                   lilool0.I00iIi0i1o();
/* 908 */                   lilool0.I00iOIl().I010II();
/* 913 */                   if (!l0iili01I00i0O.I00000oOI) {
/* 927 */                       lilool0.I00ll1.I00iOIl.registerReceiver(l0iili01I00i0O, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
/* 930 */                       l0I1IOo l0i1ioo2 = lilool0.I00iiI;
/* 932 */                       I00O0o1oo(l0i1ioo2);
/* 939 */                       l0iili01I00i0O.I0000Il00O = l0i1ioo2.I010ioo();
/* 955 */                       lilool0.I00II0oii1o().I00lll10.I0000Il00O("Registering connectivity change receiver. Network connected", Boolean.valueOf(l0iili01I00i0O.I0000Il00O));
/* 959 */                       l0iili01I00i0O.I00000oOI = true;
                            }
/* 961 */                   liI1IolOl lii1iolol4 = this.I00ilI0I1;
/* 963 */                   I00O0o1oo(lii1iolol4);
/* 966 */                   lii1iolol4.I010ioo();
/* 969 */                   return;
                        }
/* 482 */               long jI00000oIO3 = this.I00l0I0l0lO1.I00io1l.I00000oIO();
/* 486 */               I00Ol1ll1();
/* 503 */               long jMax6 = Math.max(0L, ((Long) iol1II1ii1i.I00IO1oi11O.I00000oIO(null)).longValue());
/* 507 */               I00O0o1oo(lio010iVar);
/* 514 */               if (!lio010iVar.I01Ii0ll10O(jI00000oIO3, jMax6)) {
/* 517 */                   jMax2 = Math.max(jMax2, jI00000oIO3 + jMax6);
                        }
/* 525 */               I00i0O().I00000oIO();
/* 532 */               I00IoO0().getClass();
/* 539 */               long jCurrentTimeMillis2 = jMax2 - System.currentTimeMillis();
/* 544 */               if (jCurrentTimeMillis2 <= 0) {
/* 546 */                   I00Ol1ll1();
/* 561 */                   jCurrentTimeMillis2 = Math.max(0L, ((Long) iol1II1ii1i.I00Io1lO.I00000oIO(null)).longValue());
/* 567 */                   l0O0o010I l0o0o010i = this.I00l0I0l0lO1.I00ioIO;
/* 573 */                   I00IoO0().getClass();
/* 580 */                   l0o0o010i.I00000oOI(System.currentTimeMillis());
                        }
/* 595 */               I00II0oii1o().I00lll10.I0000Il00O("Upload scheduled in approximately ms", Long.valueOf(jCurrentTimeMillis2));
/* 598 */               liI1IolOl lii1iolol5 = this.I00ilI0I1;
/* 600 */               I00O0o1oo(lii1iolol5);
/* 603 */               lii1iolol5.I010OIo1l();
/* 608 */               l0olllO1i l0olllo1i = (l0olllO1i) lii1iolol5.I00iOIl;
/* 610 */               l0olllo1i.getClass();
/* 613 */               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 615 */               Context context = l0olllo1i.I00iOIl;
/* 621 */               if (!lioil0ilIOi.I01O10iIoo1O(context)) {
/* 623 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 630 */                   l01o0io1ooo0.I00lli11.I00000oOI("Receiver not registered/enabled");
                        }
/* 637 */               if (!lioil0ilIOi.I011iIOio(context)) {
/* 639 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 646 */                   l01o0io1ooo0.I00lli11.I00000oOI("Service not registered/enabled");
                        }
/* 649 */               lii1iolol5.I010ioo();
/* 652 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 663 */               l01o0io1ooo0.I00lll10.I0000Il00O("Scheduling upload, millis", Long.valueOf(jCurrentTimeMillis2));
/* 668 */               l0olllo1i.I00li1OI.getClass();
/* 671 */               SystemClock.elapsedRealtime();
/* 694 */               if (jCurrentTimeMillis2 < Math.max(0L, ((Long) iol1II1ii1i.I00Io1o110i.I00000oIO(null)).longValue())) {
/* 696 */                   li0O100iO01 li0o100io01 = lii1iolol5.I00ilI0I1;
/* 698 */                   if (li0o100io01 == null) {
/* 707 */                       li0O100iO01 li0o100io012 = new li0O100iO01(lii1iolol5, lii1iolol5.I00iiI.I00ll1, 1);
/* 710 */                       lii1iolol5.I00ilI0I1 = li0o100io012;
/* 712 */                       li0o100io01 = li0o100io012;
                            }
/* 719 */                   if (li0o100io01.I0000Il00O == 0) {
/* 722 */                       li0O100iO01 li0o100io013 = lii1iolol5.I00ilI0I1;
/* 724 */                       if (li0o100io013 == null) {
/* 733 */                           li0O100iO01 li0o100io014 = new li0O100iO01(lii1iolol5, lii1iolol5.I00iiI.I00ll1, 1);
/* 736 */                           lii1iolol5.I00ilI0I1 = li0o100io014;
/* 738 */                           li0o100io013 = li0o100io014;
                                }
/* 739 */                       li0o100io013.I00000oOI(jCurrentTimeMillis2);
                            }
                        }
/* 746 */               ComponentName componentName = new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService");
/* 749 */               int iI010l1O = lii1iolol5.I010l1O();
/* 755 */               PersistableBundle persistableBundle = new PersistableBundle();
/* 762 */               persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
/* 783 */               JobInfo jobInfoBuild = new JobInfo.Builder(iI010l1O, componentName).setMinimumLatency(jCurrentTimeMillis2).setOverrideDeadline(jCurrentTimeMillis2 + jCurrentTimeMillis2).setExtras(persistableBundle).build();
/* 787 */               Method method = iilllOOIoi1I.I00000oIO;
/* 796 */               JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
/* 798 */               jobScheduler.getClass();
/* 801 */               Method method2 = iilllOOIoi1I.I00000oIO;
/* 803 */               if (method2 == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
/* 880 */                   jobScheduler.schedule(jobInfoBuild);
/* 883 */                   return;
                        }
/* 813 */               Method method3 = iilllOOIoi1I.I00000oOI;
/* 815 */               if (method3 != null) {
                            try {
/* 823 */                       num = (Integer) method3.invoke(UserHandle.class, null);
                            } catch (IllegalAccessException | InvocationTargetException e) {
/* 843 */                       if (Log.isLoggable("JobSchedulerCompat", 6)) {
/* 847 */                           Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                                }
                            }
/* 834 */                   iIntValue = num != null ? num.intValue() : i;
                        }
                        try {
/* 879 */                   return;
                        } catch (IllegalAccessException | InvocationTargetException e2) {
/* 873 */                   Log.e("UploadAlarm", "error calling scheduleAsPackage", e2);
/* 876 */                   jobScheduler.schedule(jobInfoBuild);
/* 879 */                   return;
                        }
                    }
/* 296 */           jMax2 = 0;
/* 298 */           i = 0;
/* 438 */           if (jMax2 != 0) {
                    }
                }

                public final void I00Io1o110i() {
/* 5 */             I00iOIl().I010II();
/* 10 */            if (this.I00oIiI10 || this.I00oO101o || this.I00oOio10iI1) {
/* 92 */                I00II0oii1o().I00lll10.I0000oI00("Not stopping services. fetch, network, upload", Boolean.valueOf(this.I00oIiI10), Boolean.valueOf(this.I00oO101o), Boolean.valueOf(this.I00oOio10iI1));
/* 110 */               return;
                    }
/* 29 */            I00II0oii1o().I00lll10.I00000oOI("Stopping uploading service(s)");
/* 32 */            ArrayList arrayList = this.I00o0l1o1o0;
/* 34 */            if (arrayList == null) {
/* 36 */                return;
                    }
/* 37 */            Iterator it = arrayList.iterator();
/* 45 */            while (it.hasNext()) {
/* 53 */                ((Runnable) it.next()).run();
                    }
/* 57 */            ArrayList arrayList2 = this.I00o0l1o1o0;
/* 59 */            lII0I0I000I.I000II(arrayList2);
/* 62 */            arrayList2.clear();
                }

                public final Boolean I00IoIO0lI(l0IIii l0iiii) {
                    try {
/* 1 */                 long jI00O0i0ii = l0iiii.I00O0i0ii();
/* 11 */                l0olllO1i l0olllo1i = this.I00ll1;
/* 13 */                if (jI00O0i0ii != -2147483648L) {
/* 38 */                    if (l0iiii.I00O0i0ii() == i01l1OO001.I00000oIO(l0olllo1i.I00iOIl).I0000Il00O(0, l0iiii.I00II0oii1o()).versionCode) {
/* 40 */                        return Boolean.TRUE;
                            }
                        } else {
/* 57 */                    String str = i01l1OO001.I00000oIO(l0olllo1i.I00iOIl).I0000Il00O(0, l0iiii.I00II0oii1o()).versionName;
/* 59 */                    String strI00IoiI = l0iiii.I00IoiI();
/* 63 */                    if (strI00IoiI != null && strI00IoiI.equals(str)) {
/* 71 */                        return Boolean.TRUE;
                            }
                        }
/* 74 */                return Boolean.FALSE;
                    } catch (PackageManager.NameNotFoundException unused) {
/* 77 */                return null;
                    }
                }

                @Override
                public final Iioi0lilII I00IoO0() {
/* 1 */             l0olllO1i l0olllo1i = this.I00ll1;
/* 3 */             lII0I0I000I.I000II(l0olllo1i);
/* 6 */             return l0olllo1i.I00li1OI;
                }

                public final lli10iI I00IoiI(String str) throws Throwable {
/* 5 */             iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 7 */             I00O0o1oo(iol1loo1io);
/* 10 */            l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str);
/* 15 */            if (l0iiiiI01Ol1o0 != null) {
/* 17 */                l0olllO1i l0olllo1i = l0iiiiI01Ol1o0.I00000oIO;
/* 27 */                if (!TextUtils.isEmpty(l0iiiiI01Ol1o0.I00IoiI())) {
/* 31 */                    Boolean boolI00IoIO0lI = I00IoIO0lI(l0iiiiI01Ol1o0);
/* 35 */                    if (boolI00IoIO0lI != null && !boolI00IoIO0lI.booleanValue()) {
/* 55 */                        I00II0oii1o().I00ilO0.I0000Il00O("App version does not match; dropping. appId", l01O0IO1ooO0.I010ioo(str));
/* 14 */                        return null;
                            }
/* 61 */                    String strI00IOO = l0iiiiI01Ol1o0.I00IOO();
/* 66 */                    String strI00IoiI = l0iiiiI01Ol1o0.I00IoiI();
/* 70 */                    long jI00O0i0ii = l0iiiiI01Ol1o0.I00O0i0ii();
/* 74 */                    l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 76 */                    l0olllO1i.I000II(l0o10ooo0);
/* 79 */                    l0o10ooo0.I010II();
/* 83 */                    String str2 = l0iiiiI01Ol1o0.I000l1;
/* 85 */                    l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 87 */                    l0olllO1i.I000II(l0o10ooo02);
/* 90 */                    l0o10ooo02.I010II();
/* 94 */                    long j = l0iiiiI01Ol1o0.I000lI;
/* 96 */                    l0o10OoO0 l0o10ooo03 = l0olllo1i.I00io1l;
/* 98 */                    l0olllO1i.I000II(l0o10ooo03);
/* 101 */                   l0o10ooo03.I010II();
/* 105 */                   long j2 = l0iiiiI01Ol1o0.I000o00OoI0I;
/* 107 */                   l0o10OoO0 l0o10ooo04 = l0olllo1i.I00io1l;
/* 109 */                   l0olllO1i.I000II(l0o10ooo04);
/* 112 */                   l0o10ooo04.I010II();
/* 116 */                   boolean z = l0iiiiI01Ol1o0.I000oI1ioi;
/* 119 */                   String strI00Io1lO = l0iiiiI01Ol1o0.I00Io1lO();
/* 123 */                   l0o10OoO0 l0o10ooo05 = l0olllo1i.I00io1l;
/* 125 */                   l0olllO1i.I000II(l0o10ooo05);
/* 128 */                   l0o10ooo05.I010II();
/* 131 */                   boolean z2 = l0iiiiI01Ol1o0.I00100l0;
/* 133 */                   Boolean boolI001i1lo1io = l0iiiiI01Ol1o0.I001i1lo1io();
/* 137 */                   long jI00000oOI = l0iiiiI01Ol1o0.I00000oOI();
/* 141 */                   l0o10OoO0 l0o10ooo06 = l0olllo1i.I00io1l;
/* 143 */                   l0olllO1i.I000II(l0o10ooo06);
/* 146 */                   l0o10ooo06.I010II();
/* 149 */                   ArrayList arrayList = l0iiiiI01Ol1o0.I0010o;
/* 155 */                   String strI000II = I00000oIO(str).I000II();
/* 159 */                   boolean zI001l0I00 = l0iiiiI01Ol1o0.I001l0I00();
/* 165 */                   l0o10OoO0 l0o10ooo07 = l0olllo1i.I00io1l;
/* 167 */                   l0olllO1i.I000II(l0o10ooo07);
/* 170 */                   l0o10ooo07.I010II();
/* 173 */                   long j3 = l0iiiiI01Ol1o0.I001IO000;
/* 181 */                   int i = I00000oIO(str).I00000oOI;
/* 187 */                   String str3 = I00ilI0I1(str).I00000oOI;
/* 191 */                   l0o10OoO0 l0o10ooo08 = l0olllo1i.I00io1l;
/* 193 */                   l0olllO1i.I000II(l0o10ooo08);
/* 196 */                   l0o10ooo08.I010II();
/* 199 */                   int i2 = l0iiiiI01Ol1o0.I001i1lo1io;
/* 201 */                   l0o10OoO0 l0o10ooo09 = l0olllo1i.I00io1l;
/* 203 */                   l0olllO1i.I000II(l0o10ooo09);
/* 206 */                   l0o10ooo09.I010II();
/* 255 */                   return new lli10iI(str, strI00IOO, strI00IoiI, jI00O0i0ii, str2, j, j2, null, z, false, strI00Io1lO, 0L, 0, z2, false, boolI001i1lo1io, jI00000oOI, arrayList, strI000II, "", null, zI001l0I00, j3, i, str3, i2, l0iiiiI01Ol1o0.I001lllioOl, l0iiiiI01Ol1o0.I00II0Ol1O0l(), l0iiiiI01Ol1o0.I0010o(), 0L, l0iiiiI01Ol1o0.I00111O(), 0L);
                        }
                    }
/* 267 */           I00II0oii1o().I00lli11.I0000Il00O("No app data available; dropping", str);
/* 14 */            return null;
                }

                public final boolean I00Iooi00oi(String str, String str2) throws Throwable {
/* 1 */             iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 3 */             I00O0o1oo(iol1loo1io);
/* 8 */             ii01Ioio01i ii01ioio01iI011lOIoo0l = iol1loo1io.I011lOIoo0l("events", str, str2);
                    return ii01ioio01iI011lOIoo0l == null || ii01ioio01iI011lOIoo0l.I0000Il00O < 1;
                }

                public final void I00OI1() {
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 13 */            if (this.I00lll10) {
/* 743 */               return;
                    }
/* 16 */            this.I00lll10 = true;
/* 22 */            I00iOIl().I010II();
/* 25 */            FileLock fileLock = this.I00ol1;
/* 27 */            l0olllO1i l0olllo1i = this.I00ll1;
/* 31 */            if (fileLock == null || !fileLock.isValid()) {
/* 55 */                iIl1iil iil1iil = ((l0olllO1i) this.I00iiO.I00iOIl).I00iio;
                        try {
/* 86 */                    FileChannel channel = new RandomAccessFile(new File(new File(l0olllo1i.I00iOIl.getFilesDir(), "google_app_measurement.db").getPath()), "rw").getChannel();
/* 90 */                    this.I00olI = channel;
/* 92 */                    FileLock fileLockTryLock = channel.tryLock();
/* 96 */                    this.I00ol1 = fileLockTryLock;
/* 98 */                    if (fileLockTryLock == null) {
/* 380 */                       I00II0oii1o().I00ilO0.I00000oOI("Storage concurrent data access panic");
/* 743 */                       return;
                            }
/* 106 */                   I00II0oii1o().I00lll10.I00000oOI("Storage concurrent access okay");
                        } catch (FileNotFoundException e) {
/* 416 */                   I00II0oii1o().I00ilO0.I0000Il00O("Failed to acquire storage lock", e);
/* 743 */                   return;
                        } catch (IOException e2) {
/* 404 */                   I00II0oii1o().I00ilO0.I0000Il00O("Failed to access storage lock file", e2);
/* 743 */                   return;
                        } catch (OverlappingFileLockException e3) {
/* 392 */                   I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Storage lock already acquired", e3);
/* 743 */                   return;
                        }
                    } else {
/* 45 */                I00II0oii1o().I00lll10.I00000oOI("Storage concurrent access okay");
                    }
/* 109 */           FileChannel fileChannel = this.I00olI;
/* 115 */           I00iOIl().I010II();
/* 123 */           int i = 0;
/* 124 */           if (fileChannel == null || !fileChannel.isOpen()) {
/* 193 */               I00II0oii1o().I00ilO0.I00000oOI("Bad channel to read from");
                    } else {
/* 133 */               ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                        try {
/* 137 */                   fileChannel.position(0L);
/* 140 */                   int i2 = fileChannel.read(byteBufferAllocate);
/* 144 */                   if (i2 == 4) {
/* 167 */                       byteBufferAllocate.flip();
/* 170 */                       i = byteBufferAllocate.getInt();
                            } else if (i2 != -1) {
/* 161 */                       I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Unexpected data length. Bytes read", Integer.valueOf(i2));
                            }
                        } catch (IOException e4) {
/* 183 */                   I00II0oii1o().I00ilO0.I0000Il00O("Failed to read from channel", e4);
                        }
                    }
/* 196 */           iooloO1iOil iooloo1ioilI000iOII = l0olllo1i.I000iOII();
/* 200 */           iooloo1ioilI000iOII.I010OIo1l();
/* 203 */           int i3 = iooloo1ioilI000iOII.I00ilI0I1;
/* 209 */           I00iOIl().I010II();
/* 212 */           if (i > i3) {
/* 230 */               I00II0oii1o().I00ilO0.I0000O(Integer.valueOf(i), "Panic: can't downgrade version. Previous, current version", Integer.valueOf(i3));
/* 233 */               return;
                    }
/* 234 */           if (i < i3) {
/* 236 */               FileChannel fileChannel2 = this.I00olI;
/* 242 */               I00iOIl().I010II();
/* 245 */               if (fileChannel2 == null || !fileChannel2.isOpen()) {
/* 343 */                   I00II0oii1o().I00ilO0.I00000oOI("Bad channel to read from");
                        } else {
/* 254 */                   ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
/* 258 */                   byteBufferAllocate2.putInt(i3);
/* 261 */                   byteBufferAllocate2.flip();
                            try {
/* 264 */                       fileChannel2.truncate(0L);
/* 267 */                       fileChannel2.write(byteBufferAllocate2);
/* 270 */                       fileChannel2.force(true);
/* 281 */                       if (fileChannel2.size() != 4) {
/* 299 */                           I00II0oii1o().I00ilO0.I0000Il00O("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                                }
/* 321 */                       I00II0oii1o().I00lll10.I0000O(Integer.valueOf(i), "Storage version upgraded. Previous, current version", Integer.valueOf(i3));
/* 324 */                       return;
                            } catch (IOException e5) {
/* 333 */                       I00II0oii1o().I00ilO0.I0000Il00O("Failed to write to channel", e5);
                            }
                        }
/* 362 */               I00II0oii1o().I00ilO0.I0000O(Integer.valueOf(i), "Storage version upgrade failed. Previous, current version", Integer.valueOf(i3));
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00OIO1(lio0llOI0 lio0lloi0, lli10iI lli10ii) throws Throwable {
                    String str;
                    long jLongValue;
/* 13 */            I00iOIl().I010II();
/* 16 */            I00iIi0i1o();
/* 19 */            boolean zI00O0i0ii = I00O0i0ii(lli10ii);
/* 23 */            String str2 = lli10ii.I00iOIl;
/* 25 */            if (zI00O0i0ii) {
/* 31 */                if (!lli10ii.I00ioIO) {
/* 33 */                    I00Ol00(lli10ii);
/* 36 */                    return;
                        }
/* 37 */                lioil0ilIOi lioil0ilioiI00iIO = I00iIO();
/* 41 */                String str3 = lio0lloi0.I00iiI;
/* 43 */                int iI01OoOi = lioil0ilioiI00iIO.I01OoOi(str3);
/* 50 */                i1Il01 i1il01 = this.I010OIo1l;
/* 52 */                if (iI01OoOi != 0) {
/* 54 */                    I00iIO();
/* 57 */                    I00Ol1ll1();
/* 60 */                    String strI010l1ol111 = lioil0ilIOi.I010l1ol111(true, str3, 24);
/* 72 */                    int length = str3 != null ? str3.length() : 0;
/* 73 */                    I00iIO();
/* 80 */                    lioil0ilIOi.I011Ill(i1il01, lli10ii.I00iOIl, iI01OoOi, "_ev", strI010l1ol111, length);
/* 83 */                    return;
                        }
/* 92 */                int iI0111i = I00iIO().I0111i(str3, lio0lloi0.zza());
/* 96 */                if (iI0111i != 0) {
/* 98 */                    I00iIO();
/* 101 */                   I00Ol1ll1();
/* 104 */                   String strI010l1ol1112 = lioil0ilIOi.I010l1ol111(true, str3, 24);
/* 108 */                   Object objZza = lio0lloi0.zza();
/* 130 */                   int length2 = (objZza == null || !((objZza instanceof String) || (objZza instanceof CharSequence))) ? 0 : objZza.toString().length();
/* 136 */                   I00iIO();
/* 144 */                   lioil0ilIOi.I011Ill(i1il01, lli10ii.I00iOIl, iI0111i, "_ev", strI010l1ol1112, length2);
/* 147 */                   return;
                        }
/* 157 */               Object objI011IO1I11OI = I00iIO().I011IO1I11OI(str3, lio0lloi0.zza());
/* 161 */               if (objI011IO1I11OI != null) {
/* 169 */                   if ("_sid".equals(str3)) {
/* 171 */                       long j = lio0lloi0.I00iiO;
/* 173 */                       String str4 = lio0lloi0.I00ilO0;
/* 175 */                       lII0I0I000I.I000II(str2);
/* 178 */                       iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 180 */                       I00O0o1oo(iol1loo1io);
/* 185 */                       lioOO0ioOI liooo0iooiI01O1I1 = iol1loo1io.I01O1I1(str2, "_sno");
/* 189 */                       if (liooo0iooiI01O1I1 != null) {
/* 191 */                           Object obj = liooo0iooiI01O1I1.I0000oI00;
/* 195 */                           if (obj instanceof Long) {
/* 199 */                               jLongValue = ((Long) obj).longValue();
/* 163 */                               str = "_sid";
                                    } else {
/* 206 */                               if (liooo0iooiI01O1I1 != null) {
/* 218 */                                   I00II0oii1o().I00l0I0l0lO1.I0000Il00O("Retrieved last session number from database does not contain a valid (long) value", liooo0iooiI01O1I1.I0000oI00);
                                        }
/* 221 */                               iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 223 */                               I00O0o1oo(iol1loo1io2);
/* 230 */                               ii01Ioio01i ii01ioio01iI011lOIoo0l = iol1loo1io2.I011lOIoo0l("events", str2, "_s");
/* 234 */                               if (ii01ioio01iI011lOIoo0l != null) {
/* 240 */                                   IOloiOI1 iOloiOI1 = I00II0oii1o().I00lll10;
/* 163 */                                   str = "_sid";
/* 244 */                                   long j2 = ii01ioio01iI011lOIoo0l.I0000Il00O;
/* 252 */                                   iOloiOI1.I0000Il00O("Backfill the session number. Last used session number", Long.valueOf(j2));
/* 255 */                                   jLongValue = j2;
                                        } else {
/* 163 */                                   str = "_sid";
/* 259 */                                   jLongValue = 0;
                                        }
                                    }
/* 281 */                           I00OIO1(new lio0llOI0(j, Long.valueOf(jLongValue + 1), "_sno", str4), lli10ii);
                                }
                            } else {
/* 163 */                       str = "_sid";
                            }
/* 289 */                   lII0I0I000I.I000II(str2);
/* 292 */                   String str5 = lio0lloi0.I00ilO0;
/* 294 */                   lII0I0I000I.I000II(str5);
/* 299 */                   lioOO0ioOI liooo0iooi = new lioOO0ioOI(str2, str5, str3, lio0lloi0.I00iiO, objI011IO1I11OI);
/* 306 */                   IOloiOI1 iOloiOI12 = I00II0oii1o().I00lll10;
/* 308 */                   l0olllO1i l0olllo1i = this.I00ll1;
/* 310 */                   l00i1l00OlIO l00i1l00olio = l0olllo1i.I00l0OO0IO;
/* 312 */                   String str6 = liooo0iooi.I0000Il00O;
/* 320 */                   iOloiOI12.I0000O(l00i1l00olio.I0000Il00O(str6), "Setting user property", objI011IO1I11OI);
/* 323 */                   iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 325 */                   I00O0o1oo(iol1loo1io3);
/* 328 */                   iol1loo1io3.I01Io000();
                            try {
/* 331 */                       boolean zEquals = "_id".equals(str6);
/* 335 */                       Object obj2 = liooo0iooi.I0000oI00;
/* 337 */                       if (zEquals) {
/* 339 */                           iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 341 */                           I00O0o1oo(iol1loo1io4);
/* 344 */                           lioOO0ioOI liooo0iooiI01O1I12 = iol1loo1io4.I01O1I1(str2, "_id");
/* 348 */                           if (liooo0iooiI01O1I12 != null && !obj2.equals(liooo0iooiI01O1I12.I0000oI00)) {
/* 358 */                               iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 360 */                               I00O0o1oo(iol1loo1io5);
/* 365 */                               iol1loo1io5.I01Iol(str2, "_lair");
                                    }
                                }
/* 372 */                       I00Ol00(lli10ii);
/* 375 */                       iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 377 */                       I00O0o1oo(iol1loo1io6);
/* 380 */                       boolean zI01O10iIoo1O = iol1loo1io6.I01O10iIoo1O(liooo0iooi);
/* 390 */                       if (str.equals(str3)) {
/* 392 */                           lio010i lio010iVar = this.I00io1l;
/* 394 */                           I00O0o1oo(lio010iVar);
/* 397 */                           String str7 = lli10ii.I00oO101o;
/* 414 */                           long jI01IiOO = TextUtils.isEmpty(str7) ? 0L : lio010iVar.I01IiOO(str7.getBytes(StandardCharsets.UTF_8));
/* 418 */                           iOl1lOo1IO iol1loo1io7 = this.I00iiO;
/* 420 */                           I00O0o1oo(iol1loo1io7);
/* 423 */                           l0IIii l0iiiiI01Ol1o0 = iol1loo1io7.I01Ol1o0(str2);
/* 427 */                           if (l0iiiiI01Ol1o0 != null) {
/* 429 */                               l0iiiiI01Ol1o0.I001lllioOl(jI01IiOO);
/* 436 */                               if (l0iiiiI01Ol1o0.I000oI1ioi()) {
/* 438 */                                   iOl1lOo1IO iol1loo1io8 = this.I00iiO;
/* 440 */                                   I00O0o1oo(iol1loo1io8);
/* 444 */                                   iol1loo1io8.I01OlIoIl(l0iiiiI01Ol1o0, false);
                                        }
                                    }
                                }
/* 447 */                       iOl1lOo1IO iol1loo1io9 = this.I00iiO;
/* 449 */                       I00O0o1oo(iol1loo1io9);
/* 452 */                       iol1loo1io9.I01Io001O();
/* 455 */                       if (!zI01O10iIoo1O) {
/* 471 */                           I00II0oii1o().I00ilO0.I0000O(l0olllo1i.I00l0OO0IO.I0000Il00O(str6), "Too many unique user properties are set. Ignoring user property", obj2);
/* 474 */                           I00iIO();
/* 483 */                           lioil0ilIOi.I011Ill(i1il01, str2, 9, null, null, 0);
                                }
/* 486 */                       iOl1lOo1IO iol1loo1io10 = this.I00iiO;
/* 488 */                       I00O0o1oo(iol1loo1io10);
/* 491 */                       iol1loo1io10.I01Io1();
                            } catch (Throwable th) {
/* 495 */                       iOl1lOo1IO iol1loo1io11 = this.I00iiO;
/* 497 */                       I00O0o1oo(iol1loo1io11);
/* 500 */                       iol1loo1io11.I01Io1();
/* 503 */                       throw th;
                            }
                        }
                    }
                }

                public final void I00OIl(String str, lli10iI lli10ii) throws Throwable {
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 11 */            boolean zI00O0i0ii = I00O0i0ii(lli10ii);
/* 15 */            String str2 = lli10ii.I00iOIl;
/* 17 */            if (zI00O0i0ii) {
/* 22 */                if (!lli10ii.I00ioIO) {
/* 24 */                    I00Ol00(lli10ii);
/* 27 */                    return;
                        }
/* 28 */                Boolean boolI00O10llo = I00O10llo(lli10ii);
/* 38 */                if ("_npa".equals(str) && boolI00O10llo != null) {
/* 50 */                    I00II0oii1o().I00lli11.I00000oOI("Falling back to manifest metadata value for ad personalization");
/* 59 */                    I00IoO0().getClass();
/* 89 */                    I00OIO1(new lio0llOI0(System.currentTimeMillis(), Long.valueOf(true != boolI00O10llo.booleanValue() ? 0L : 1L), "_npa", "auto"), lli10ii);
/* 92 */                    return;
                        }
/* 97 */                IOloiOI1 iOloiOI1 = I00II0oii1o().I00lli11;
/* 99 */                l0olllO1i l0olllo1i = this.I00ll1;
/* 109 */               iOloiOI1.I0000Il00O("Removing user property", l0olllo1i.I00l0OO0IO.I0000Il00O(str));
/* 112 */               iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 114 */               I00O0o1oo(iol1loo1io);
/* 117 */               iol1loo1io.I01Io000();
                        try {
/* 120 */                   I00Ol00(lli10ii);
/* 129 */                   if ("_id".equals(str)) {
/* 131 */                       iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 133 */                       I00O0o1oo(iol1loo1io2);
/* 136 */                       lII0I0I000I.I000II(str2);
/* 141 */                       iol1loo1io2.I01Iol(str2, "_lair");
                            }
/* 148 */                   iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 150 */                   I00O0o1oo(iol1loo1io3);
/* 153 */                   lII0I0I000I.I000II(str2);
/* 156 */                   iol1loo1io3.I01Iol(str2, str);
/* 159 */                   iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 161 */                   I00O0o1oo(iol1loo1io4);
/* 164 */                   iol1loo1io4.I01Io001O();
/* 181 */                   I00II0oii1o().I00lli11.I0000Il00O("User property removed", l0olllo1i.I00l0OO0IO.I0000Il00O(str));
/* 184 */                   iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 186 */                   I00O0o1oo(iol1loo1io5);
/* 189 */                   iol1loo1io5.I01Io1();
                        } catch (Throwable th) {
/* 193 */                   iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 195 */                   I00O0o1oo(iol1loo1io6);
/* 198 */                   iol1loo1io6.I01Io1();
/* 332 */                   throw th;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:136:0x0379  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x0444 A[Catch: all -> 0x00fc, TryCatch #3 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x02a2, B:107:0x02ce, B:108:0x02d1, B:110:0x02f2, B:151:0x03ba, B:152:0x03bd, B:160:0x0469, B:113:0x0309, B:118:0x0328, B:120:0x0330, B:122:0x0336, B:126:0x0349, B:130:0x035c, B:134:0x0368, B:137:0x037c, B:142:0x039b, B:144:0x03a3, B:146:0x03ab, B:148:0x03b1, B:140:0x0389, B:128:0x0354, B:116:0x0316, B:77:0x01e6, B:79:0x0218, B:80:0x0224, B:82:0x022b, B:84:0x0231, B:86:0x023b, B:88:0x0241, B:90:0x0247, B:92:0x024d, B:93:0x0252, B:99:0x026b, B:101:0x026f, B:102:0x0280, B:103:0x028b, B:104:0x0296, B:153:0x03e6, B:155:0x041b, B:156:0x041e, B:157:0x0444, B:159:0x044b, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:171:0x00dc, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0144 A[Catch: all -> 0x00fc, TryCatch #3 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x02a2, B:107:0x02ce, B:108:0x02d1, B:110:0x02f2, B:151:0x03ba, B:152:0x03bd, B:160:0x0469, B:113:0x0309, B:118:0x0328, B:120:0x0330, B:122:0x0336, B:126:0x0349, B:130:0x035c, B:134:0x0368, B:137:0x037c, B:142:0x039b, B:144:0x03a3, B:146:0x03ab, B:148:0x03b1, B:140:0x0389, B:128:0x0354, B:116:0x0316, B:77:0x01e6, B:79:0x0218, B:80:0x0224, B:82:0x022b, B:84:0x0231, B:86:0x023b, B:88:0x0241, B:90:0x0247, B:92:0x024d, B:93:0x0252, B:99:0x026b, B:101:0x026f, B:102:0x0280, B:103:0x028b, B:104:0x0296, B:153:0x03e6, B:155:0x041b, B:156:0x041e, B:157:0x0444, B:159:0x044b, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:171:0x00dc, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:58:0x014b A[Catch: all -> 0x00fc, TryCatch #3 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x02a2, B:107:0x02ce, B:108:0x02d1, B:110:0x02f2, B:151:0x03ba, B:152:0x03bd, B:160:0x0469, B:113:0x0309, B:118:0x0328, B:120:0x0330, B:122:0x0336, B:126:0x0349, B:130:0x035c, B:134:0x0368, B:137:0x037c, B:142:0x039b, B:144:0x03a3, B:146:0x03ab, B:148:0x03b1, B:140:0x0389, B:128:0x0354, B:116:0x0316, B:77:0x01e6, B:79:0x0218, B:80:0x0224, B:82:0x022b, B:84:0x0231, B:86:0x023b, B:88:0x0241, B:90:0x0247, B:92:0x024d, B:93:0x0252, B:99:0x026b, B:101:0x026f, B:102:0x0280, B:103:0x028b, B:104:0x0296, B:153:0x03e6, B:155:0x041b, B:156:0x041e, B:157:0x0444, B:159:0x044b, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:171:0x00dc, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0158 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #3 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x02a2, B:107:0x02ce, B:108:0x02d1, B:110:0x02f2, B:151:0x03ba, B:152:0x03bd, B:160:0x0469, B:113:0x0309, B:118:0x0328, B:120:0x0330, B:122:0x0336, B:126:0x0349, B:130:0x035c, B:134:0x0368, B:137:0x037c, B:142:0x039b, B:144:0x03a3, B:146:0x03ab, B:148:0x03b1, B:140:0x0389, B:128:0x0354, B:116:0x0316, B:77:0x01e6, B:79:0x0218, B:80:0x0224, B:82:0x022b, B:84:0x0231, B:86:0x023b, B:88:0x0241, B:90:0x0247, B:92:0x024d, B:93:0x0252, B:99:0x026b, B:101:0x026f, B:102:0x0280, B:103:0x028b, B:104:0x0296, B:153:0x03e6, B:155:0x041b, B:156:0x041e, B:157:0x0444, B:159:0x044b, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:171:0x00dc, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0163 A[Catch: all -> 0x00fc, TryCatch #3 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x02a2, B:107:0x02ce, B:108:0x02d1, B:110:0x02f2, B:151:0x03ba, B:152:0x03bd, B:160:0x0469, B:113:0x0309, B:118:0x0328, B:120:0x0330, B:122:0x0336, B:126:0x0349, B:130:0x035c, B:134:0x0368, B:137:0x037c, B:142:0x039b, B:144:0x03a3, B:146:0x03ab, B:148:0x03b1, B:140:0x0389, B:128:0x0354, B:116:0x0316, B:77:0x01e6, B:79:0x0218, B:80:0x0224, B:82:0x022b, B:84:0x0231, B:86:0x023b, B:88:0x0241, B:90:0x0247, B:92:0x024d, B:93:0x0252, B:99:0x026b, B:101:0x026f, B:102:0x0280, B:103:0x028b, B:104:0x0296, B:153:0x03e6, B:155:0x041b, B:156:0x041e, B:157:0x0444, B:159:0x044b, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:171:0x00dc, inners: #0, #1, #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: all -> 0x00fc, TRY_LEAVE, TryCatch #3 {all -> 0x00fc, blocks: (B:33:0x00dc, B:35:0x00ec, B:43:0x0103, B:47:0x0113, B:49:0x0122, B:55:0x0137, B:57:0x0144, B:59:0x014f, B:62:0x0158, B:65:0x016f, B:68:0x0188, B:71:0x01ae, B:74:0x01be, B:76:0x01d6, B:105:0x02a2, B:107:0x02ce, B:108:0x02d1, B:110:0x02f2, B:151:0x03ba, B:152:0x03bd, B:160:0x0469, B:113:0x0309, B:118:0x0328, B:120:0x0330, B:122:0x0336, B:126:0x0349, B:130:0x035c, B:134:0x0368, B:137:0x037c, B:142:0x039b, B:144:0x03a3, B:146:0x03ab, B:148:0x03b1, B:140:0x0389, B:128:0x0354, B:116:0x0316, B:77:0x01e6, B:79:0x0218, B:80:0x0224, B:82:0x022b, B:84:0x0231, B:86:0x023b, B:88:0x0241, B:90:0x0247, B:92:0x024d, B:93:0x0252, B:99:0x026b, B:101:0x026f, B:102:0x0280, B:103:0x028b, B:104:0x0296, B:153:0x03e6, B:155:0x041b, B:156:0x041e, B:157:0x0444, B:159:0x044b, B:63:0x0163, B:58:0x014b, B:51:0x012c, B:54:0x0134), top: B:171:0x00dc, inners: #0, #1, #2 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I00OIo(lli10iI lli10ii) throws Throwable {
                    long j;
                    long j2;
                    long j3;
                    long j4;
                    long j5;
                    long j6;
                    int i;
                    ii01Ioio01i ii01ioio01iI011lOIoo0l;
                    boolean z;
                    l0olllO1i l0olllo1i;
                    String str;
                    String str2;
                    String str3;
                    PackageInfo packageInfoI0000Il00O;
                    lli10iI lli10ii2;
                    ApplicationInfo applicationInfo;
                    ApplicationInfo applicationInfoI00000oIO;
                    long j7;
                    boolean z2;
                    long jElapsedRealtime;
/* 5 */             l0olllO1i l0olllo1i2 = this.I00ll1;
/* 23 */            I00iOIl().I010II();
/* 26 */            I00iIi0i1o();
/* 29 */            lII0I0I000I.I000II(lli10ii);
/* 32 */            boolean z3 = lli10ii.I00o0iI0io1;
/* 34 */            String str4 = lli10ii.I00iOIl;
/* 36 */            lII0I0I000I.I0000O(str4);
/* 43 */            if (I00O0i0ii(lli10ii)) {
/* 46 */                iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 48 */                I00O0o1oo(iol1loo1io);
/* 51 */                l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str4);
/* 58 */                if (l0iiiiI01Ol1o0 != null && TextUtils.isEmpty(l0iiiiI01Ol1o0.I00IOO()) && !TextUtils.isEmpty(lli10ii.I00iiI)) {
/* 78 */                    l0iiiiI01Ol1o0.I0001Ioi1lo(0L);
/* 81 */                    iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 83 */                    I00O0o1oo(iol1loo1io2);
/* 86 */                    iol1loo1io2.I01OlIoIl(l0iiiiI01Ol1o0, false);
/* 89 */                    l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 91 */                    I00O0o1oo(l0l1ol11Var);
/* 94 */                    l0l1ol11Var.I010II();
/* 99 */                    l0l1ol11Var.I00l0I0l0lO1.remove(str4);
                        }
/* 104 */               if (!lli10ii.I00ioIO) {
/* 106 */                   I00Ol00(lli10ii);
/* 109 */                   return;
                        }
/* 111 */               long j8 = lli10ii.I00ll1;
/* 113 */               iIl1iil iil1iilI00Ol1ll1 = I00Ol1ll1();
/* 119 */               iol01I0001 iol01i0001 = iol1II1ii1i.I01101olii;
/* 126 */               if (iil1iilI00Ol1ll1.I01101IOlO(null, iol01i0001)) {
/* 128 */                   j = j8;
/* 130 */                   j2 = lli10ii.I0100o111I;
                        } else {
/* 133 */                   j = j8;
/* 135 */                   j2 = 0;
                        }
/* 139 */               if (j == 0) {
/* 145 */                   I00IoO0().getClass();
/* 148 */                   long jCurrentTimeMillis = System.currentTimeMillis();
/* 161 */                   if (I00Ol1ll1().I01101IOlO(null, iol01i0001)) {
/* 167 */                       I00IoO0().getClass();
/* 170 */                       jElapsedRealtime = SystemClock.elapsedRealtime();
                            } else {
/* 175 */                       jElapsedRealtime = 0;
                            }
/* 177 */                   j4 = jCurrentTimeMillis;
/* 179 */                   j3 = jElapsedRealtime;
                        } else {
/* 182 */                   j3 = j2;
/* 184 */                   j4 = j;
                        }
/* 186 */               int i2 = lli10ii.I00lli11;
/* 189 */               if (i2 != 0 && i2 != 1) {
/* 209 */                   I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str4), "Incorrect app type, assuming installed app. appId, appType", Integer.valueOf(i2));
/* 212 */                   i2 = 0;
                        }
/* 213 */               iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 215 */               I00O0o1oo(iol1loo1io3);
/* 218 */               iol1loo1io3.I01Io000();
                        try {
/* 221 */                   iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 223 */                   I00O0o1oo(iol1loo1io4);
/* 226 */                   lioOO0ioOI liooo0iooiI01O1I1 = iol1loo1io4.I01O1I1(str4, "_npa");
/* 230 */                   Boolean boolI00O10llo = I00O10llo(lli10ii);
/* 235 */                   if (liooo0iooiI01O1I1 != null) {
/* 237 */                       j5 = 1;
/* 247 */                       if (!"auto".equals(liooo0iooiI01O1I1.I00000oOI)) {
/* 250 */                           j6 = j4;
/* 323 */                           if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010ioo)) {
/* 332 */                               i = i2;
/* 333 */                               I00Oio(lli10ii, j6);
                                    } else {
/* 325 */                               i = i2;
/* 328 */                               I00Oio(lli10ii, lli10ii.I00oooO);
                                    }
/* 336 */                           I00Ol00(lli10ii);
/* 339 */                           iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 343 */                           if (i != 0) {
/* 345 */                               I00O0o1oo(iol1loo1io5);
/* 350 */                               ii01ioio01iI011lOIoo0l = iol1loo1io5.I011lOIoo0l("events", str4, "_f");
/* 354 */                               z = false;
                                    } else {
/* 356 */                               I00O0o1oo(iol1loo1io5);
/* 361 */                               ii01ioio01iI011lOIoo0l = iol1loo1io5.I011lOIoo0l("events", str4, "_v");
/* 365 */                               z = true;
                                    }
/* 366 */                           if (ii01ioio01iI011lOIoo0l != null) {
/* 375 */                               long j9 = ((j6 / 3600000) + j5) * 3600000;
/* 391 */                               if (z) {
/* 1008 */                                  Long lValueOf = Long.valueOf(j9);
/* 1014 */                                  long j10 = j6;
/* 1021 */                                  I00OIO1(new lio0llOI0(j10, lValueOf, "_fvt", "auto"), lli10ii);
/* 1028 */                                  I00iOIl().I010II();
/* 1031 */                                  I00iIi0i1o();
/* 1036 */                                  Bundle bundle = new Bundle();
/* 1041 */                                  bundle.putLong("_c", 1L);
/* 1044 */                                  bundle.putLong("_r", 1L);
/* 1047 */                                  bundle.putLong("_et", 1L);
/* 1050 */                                  if (z3) {
/* 1052 */                                      bundle.putLong("_dac", 1L);
                                            }
/* 1059 */                                  I00IoO0().getClass();
/* 1066 */                                  bundle.putLong("_elt", System.currentTimeMillis());
/* 1089 */                                  I0000O(new ii0oooi0IO0l("_v", new ii0il0lOolIo(bundle), "auto", j10, j3), lli10ii);
                                        } else {
/* 397 */                                   Long lValueOf2 = Long.valueOf(j9);
/* 403 */                                   long j11 = j6;
/* 410 */                                   I00OIO1(new lio0llOI0(j11, lValueOf2, "_fot", "auto"), lli10ii);
/* 417 */                                   I00iOIl().I010II();
/* 420 */                                   i0O1lIi1O0IO i0o1lii1o0io = this.I00li1OI;
/* 422 */                                   lII0I0I000I.I000II(i0o1lii1o0io);
/* 427 */                                   l0olllO1i l0olllo1i3 = (l0olllO1i) i0o1lii1o0io.I00iiI;
/* 429 */                                   if (str4 == null || str4.isEmpty()) {
/* 437 */                                       l0olllo1i = l0olllo1i2;
/* 377 */                                       str = "_elt";
/* 441 */                                       str2 = str4;
/* 381 */                                       str3 = "_et";
/* 663 */                                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i3.I00ilO0;
/* 665 */                                       l0olllO1i.I000II(l01o0io1ooo0);
/* 672 */                                       l01o0io1ooo0.I00l0OO0IO.I00000oOI("Install Referrer Reporter was called with invalid app package name");
                                            } else {
/* 381 */                                       str3 = "_et";
/* 449 */                                       l0o10OoO0 l0o10ooo0 = l0olllo1i3.I00io1l;
/* 453 */                                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i3.I00ilO0;
/* 377 */                                       str = "_elt";
/* 457 */                                       Context context = l0olllo1i3.I00iOIl;
/* 459 */                                       l0olllO1i.I000II(l0o10ooo0);
/* 462 */                                       l0o10ooo0.I010II();
/* 469 */                                       if (i0o1lii1o0io.I00000oOI()) {
/* 489 */                                           l0olllo1i = l0olllo1i2;
/* 492 */                                           Ii0io10 ii0io10 = new Ii0io10(1);
/* 495 */                                           ii0io10.I00iiO = i0o1lii1o0io;
/* 497 */                                           ii0io10.I00iiI = str4;
/* 499 */                                           VarHandle.storeStoreFence();
/* 502 */                                           l0o10OoO0 l0o10ooo02 = l0olllo1i3.I00io1l;
/* 504 */                                           l0olllO1i.I000II(l0o10ooo02);
/* 507 */                                           l0o10ooo02.I010II();
/* 516 */                                           Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
/* 521 */                                           str2 = str4;
/* 528 */                                           intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
/* 531 */                                           PackageManager packageManager = context.getPackageManager();
/* 535 */                                           if (packageManager == null) {
/* 537 */                                               l0olllO1i.I000II(l01o0io1ooo02);
/* 544 */                                               l01o0io1ooo02.I00l0OO0IO.I00000oOI("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                                    } else {
/* 550 */                                               List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
/* 554 */                                               if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
/* 652 */                                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 659 */                                                   l01o0io1ooo02.I00ll1.I00000oOI("Play Service for fetching Install Referrer is unavailable on device");
                                                        } else {
/* 568 */                                                   ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
/* 570 */                                                   if (serviceInfo != null) {
/* 572 */                                                       String str5 = serviceInfo.packageName;
/* 576 */                                                       if (serviceInfo.name != null && "com.android.vending".equals(str5) && i0o1lii1o0io.I00000oOI()) {
                                                                    try {
/* 600 */                                                               boolean zI00000oIO = IOloio1Ili.I00000oOI().I00000oIO(context, new Intent(intent), ii0io10, 1);
/* 604 */                                                               l0olllO1i.I000II(l01o0io1ooo02);
/* 620 */                                                               l01o0io1ooo02.I00lll10.I0000Il00O("Install Referrer Service is", zI00000oIO ? "available" : "not available");
                                                                    } catch (RuntimeException e) {
/* 624 */                                                               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i3.I00ilO0;
/* 626 */                                                               l0olllO1i.I000II(l01o0io1ooo03);
/* 637 */                                                               l01o0io1ooo03.I00ilO0.I0000Il00O("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                                    }
                                                                } else {
/* 641 */                                                           l0olllO1i.I000II(l01o0io1ooo02);
/* 648 */                                                           l01o0io1ooo02.I00l0I0l0lO1.I00000oOI("Play Store version 8.3.73 or higher required for Install Referrer");
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
/* 471 */                                           l0olllO1i.I000II(l01o0io1ooo02);
/* 478 */                                           l01o0io1ooo02.I00ll1.I00000oOI("Install Referrer Reporter is not available");
/* 481 */                                           l0olllo1i = l0olllo1i2;
/* 483 */                                           str2 = str4;
                                                }
                                            }
/* 679 */                                   I00iOIl().I010II();
/* 682 */                                   I00iIi0i1o();
/* 687 */                                   Bundle bundle2 = new Bundle();
/* 690 */                                   long j12 = j5;
/* 692 */                                   bundle2.putLong("_c", j12);
/* 695 */                                   bundle2.putLong("_r", j12);
/* 700 */                                   bundle2.putLong("_uwa", 0L);
/* 703 */                                   bundle2.putLong("_pfo", 0L);
/* 706 */                                   bundle2.putLong("_sys", 0L);
/* 709 */                                   bundle2.putLong("_sysu", 0L);
/* 714 */                                   bundle2.putLong(str3, j12);
/* 717 */                                   if (z3) {
/* 719 */                                       bundle2.putLong("_dac", j12);
                                            }
/* 722 */                                   lII0I0I000I.I000II(str2);
/* 725 */                                   iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 727 */                                   I00O0o1oo(iol1loo1io6);
/* 730 */                                   lII0I0I000I.I0000O(str2);
/* 733 */                                   iol1loo1io6.I010II();
/* 736 */                                   iol1loo1io6.I010OIo1l();
/* 739 */                                   String str6 = str2;
/* 741 */                                   long jI0110o = iol1loo1io6.I0110o(str6);
/* 745 */                                   l0olllO1i l0olllo1i4 = l0olllo1i;
/* 753 */                                   if (l0olllo1i4.I00iOIl.getPackageManager() == null) {
/* 767 */                                       I00II0oii1o().I00ilO0.I0000Il00O("PackageManager is null, first open report might be inaccurate. appId", l01O0IO1ooO0.I010ioo(str6));
/* 770 */                                       lli10ii2 = lli10ii;
                                            } else {
                                                try {
/* 785 */                                           packageInfoI0000Il00O = i01l1OO001.I00000oIO(l0olllo1i4.I00iOIl).I0000Il00O(0, str6);
                                                } catch (PackageManager.NameNotFoundException e2) {
/* 803 */                                           I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str6), "Package info is null, first open report might be inaccurate. appId", e2);
/* 806 */                                           packageInfoI0000Il00O = null;
                                                }
/* 807 */                                       if (packageInfoI0000Il00O != null) {
/* 809 */                                           long j13 = packageInfoI0000Il00O.firstInstallTime;
/* 815 */                                           if (j13 != 0) {
/* 821 */                                               if (j13 != packageInfoI0000Il00O.lastUpdateTime) {
/* 829 */                                                   applicationInfo = null;
/* 834 */                                                   if (!I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I00oli)) {
/* 855 */                                                       bundle2.putLong("_uwa", 1L);
                                                            } else if (jI0110o == 0) {
/* 844 */                                                       bundle2.putLong("_uwa", 1L);
/* 847 */                                                       z2 = false;
/* 848 */                                                       jI0110o = 0;
                                                            }
/* 851 */                                                   z2 = false;
                                                        } else {
/* 859 */                                                   applicationInfo = null;
/* 860 */                                                   z2 = true;
                                                        }
/* 884 */                                               lli10ii2 = lli10ii;
/* 886 */                                               I00OIO1(new lio0llOI0(j11, Long.valueOf(true != z2 ? 0L : 1L), "_fi", "auto"), lli10ii2);
                                                    } else {
/* 890 */                                               lli10ii2 = lli10ii;
/* 892 */                                               applicationInfo = null;
                                                    }
                                                    try {
/* 900 */                                               applicationInfoI00000oIO = i01l1OO001.I00000oIO(l0olllo1i4.I00iOIl).I00000oIO(0, str6);
                                                    } catch (PackageManager.NameNotFoundException e3) {
/* 918 */                                               I00II0oii1o().I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str6), "Application info is null, first open report might be inaccurate. appId", e3);
/* 921 */                                               applicationInfoI00000oIO = applicationInfo;
                                                    }
/* 922 */                                           if (applicationInfoI00000oIO != null) {
/* 930 */                                               if ((applicationInfoI00000oIO.flags & 1) != 0) {
/* 932 */                                                   j7 = 1;
/* 934 */                                                   bundle2.putLong("_sys", 1L);
                                                        } else {
/* 938 */                                                   j7 = 1;
                                                        }
/* 944 */                                               if ((applicationInfoI00000oIO.flags & Barcode.FORMAT_ITF) != 0) {
/* 946 */                                                   bundle2.putLong("_sysu", j7);
                                                        }
                                                    }
                                                }
                                            }
/* 772 */                                   long j14 = jI0110o;
/* 953 */                                   if (j14 >= 0) {
/* 955 */                                       bundle2.putLong("_pfo", j14);
                                            }
/* 962 */                                   I00IoO0().getClass();
/* 971 */                                   bundle2.putLong(str, System.currentTimeMillis());
/* 994 */                                   I0000O(new ii0oooi0IO0l("_f", new ii0il0lOolIo(bundle2), "auto", j11, j3), lli10ii2);
                                        }
                                    } else {
/* 1094 */                              long j15 = j6;
/* 1098 */                              if (lli10ii.I00l0I0l0lO1) {
/* 1127 */                                  I0000O(new ii0oooi0IO0l("_cd", new ii0il0lOolIo(new Bundle()), "auto", j15, 0L), lli10ii);
                                        }
                                    }
/* 1130 */                          iOl1lOo1IO iol1loo1io7 = this.I00iiO;
/* 1132 */                          I00O0o1oo(iol1loo1io7);
/* 1135 */                          iol1loo1io7.I01Io001O();
/* 1138 */                          iOl1lOo1IO iol1loo1io8 = this.I00iiO;
/* 1140 */                          I00O0o1oo(iol1loo1io8);
/* 1143 */                          iol1loo1io8.I01Io1();
                                }
                            } else {
/* 256 */                       j5 = 1;
                            }
/* 258 */                   if (boolI00O10llo != null) {
/* 282 */                       lio0llOI0 lio0lloi0 = new lio0llOI0(j4, Long.valueOf(true != boolI00O10llo.booleanValue() ? 0L : j5), "_npa", "auto");
/* 287 */                       j6 = j4;
/* 289 */                       if (liooo0iooiI01O1I1 == null || !liooo0iooiI01O1I1.I0000oI00.equals(lio0lloi0.I00iio)) {
/* 301 */                           I00OIO1(lio0lloi0, lli10ii);
                                }
                            } else {
/* 305 */                       j6 = j4;
/* 307 */                       if (liooo0iooiI01O1I1 != null) {
/* 309 */                           I00OIl("_npa", lli10ii);
                                }
                            }
/* 323 */                   if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010ioo)) {
                            }
/* 336 */                   I00Ol00(lli10ii);
/* 339 */                   iOl1lOo1IO iol1loo1io52 = this.I00iiO;
/* 343 */                   if (i != 0) {
                            }
/* 366 */                   if (ii01ioio01iI011lOIoo0l != null) {
                            }
/* 1130 */                  iOl1lOo1IO iol1loo1io72 = this.I00iiO;
/* 1132 */                  I00O0o1oo(iol1loo1io72);
/* 1135 */                  iol1loo1io72.I01Io001O();
/* 1138 */                  iOl1lOo1IO iol1loo1io82 = this.I00iiO;
/* 1140 */                  I00O0o1oo(iol1loo1io82);
/* 1143 */                  iol1loo1io82.I01Io1();
                        } catch (Throwable th) {
/* 1147 */                  iOl1lOo1IO iol1loo1io9 = this.I00iiO;
/* 1149 */                  I00O0o1oo(iol1loo1io9);
/* 1152 */                  iol1loo1io9.I01Io1();
/* 1261 */                  throw th;
                        }
                    }
                }

                public final void I00OOll1(iII000ol000 iii000ol000, lli10iI lli10ii) {
                    ii0oooi0IO0l ii0oooi0io0l;
/* 3 */             lII0I0I000I.I0000O(iii000ol000.I00iOIl);
/* 8 */             lII0I0I000I.I000II(iii000ol000.I00iiI);
/* 13 */            lII0I0I000I.I000II(iii000ol000.I00iiO);
/* 20 */            lII0I0I000I.I0000O(iii000ol000.I00iiO.I00iiI);
/* 27 */            I00iOIl().I010II();
/* 30 */            I00iIi0i1o();
/* 37 */            if (I00O0i0ii(lli10ii)) {
/* 42 */                if (!lli10ii.I00ioIO) {
/* 44 */                    I00Ol00(lli10ii);
/* 47 */                    return;
                        }
/* 50 */                iII000ol000 iii000ol0002 = new iII000ol000(iii000ol000);
/* 53 */                boolean z = false;
/* 54 */                iii000ol0002.I00ilI0I1 = false;
/* 56 */                iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 58 */                I00O0o1oo(iol1loo1io);
/* 61 */                iol1loo1io.I01Io000();
                        try {
/* 64 */                    iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 66 */                    I00O0o1oo(iol1loo1io2);
/* 69 */                    String str = iii000ol0002.I00iOIl;
/* 71 */                    lII0I0I000I.I000II(str);
/* 78 */                    iII000ol000 iii000ol000I01OOIlI = iol1loo1io2.I01OOIlI(str, iii000ol0002.I00iiO.I00iiI);
/* 82 */                    l0olllO1i l0olllo1i = this.I00ll1;
/* 84 */                    if (iii000ol000I01OOIlI != null && !iii000ol000I01OOIlI.I00iiI.equals(iii000ol0002.I00iiI)) {
/* 118 */                       I00II0oii1o().I00l0I0l0lO1.I0000oI00("Updating a conditional user property with different origin. name, origin, origin (from DB)", l0olllo1i.I00l0OO0IO.I0000Il00O(iii000ol0002.I00iiO.I00iiI), iii000ol0002.I00iiI, iii000ol000I01OOIlI.I00iiI);
                            }
/* 127 */                   if (iii000ol000I01OOIlI != null && iii000ol000I01OOIlI.I00ilI0I1) {
/* 135 */                       iii000ol0002.I00iiI = iii000ol000I01OOIlI.I00iiI;
/* 139 */                       iii000ol0002.I00iio = iii000ol000I01OOIlI.I00iio;
/* 143 */                       iii000ol0002.I00ioIO = iii000ol000I01OOIlI.I00ioIO;
/* 147 */                       iii000ol0002.I00ilO0 = iii000ol000I01OOIlI.I00ilO0;
/* 151 */                       iii000ol0002.I00l0I0l0lO1 = iii000ol000I01OOIlI.I00l0I0l0lO1;
/* 153 */                       iii000ol0002.I00ilI0I1 = true;
/* 157 */                       lio0llOI0 lio0lloi0 = iii000ol0002.I00iiO;
/* 176 */                       iii000ol0002.I00iiO = new lio0llOI0(iii000ol000I01OOIlI.I00iiO.I00iiO, lio0lloi0.zza(), lio0lloi0.I00iiI, iii000ol000I01OOIlI.I00iiO.I00ilO0);
                            } else if (TextUtils.isEmpty(iii000ol0002.I00ilO0)) {
/* 189 */                       lio0llOI0 lio0lloi02 = iii000ol0002.I00iiO;
/* 206 */                       iii000ol0002.I00iiO = new lio0llOI0(iii000ol0002.I00iio, lio0lloi02.zza(), lio0lloi02.I00iiI, iii000ol0002.I00iiO.I00ilO0);
/* 208 */                       iii000ol0002.I00ilI0I1 = true;
/* 210 */                       z = true;
                            }
/* 213 */                   if (iii000ol0002.I00ilI0I1) {
/* 215 */                       lio0llOI0 lio0lloi03 = iii000ol0002.I00iiO;
/* 219 */                       String str2 = iii000ol0002.I00iOIl;
/* 221 */                       lII0I0I000I.I000II(str2);
/* 224 */                       String str3 = iii000ol0002.I00iiI;
/* 226 */                       String str4 = lio0lloi03.I00iiI;
/* 228 */                       long j = lio0lloi03.I00iiO;
/* 230 */                       Object objZza = lio0lloi03.zza();
/* 234 */                       lII0I0I000I.I000II(objZza);
/* 237 */                       lioOO0ioOI liooo0iooi = new lioOO0ioOI(str2, str3, str4, j, objZza);
/* 240 */                       Object obj = liooo0iooi.I0000oI00;
/* 242 */                       String str5 = liooo0iooi.I0000Il00O;
/* 244 */                       iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 246 */                       I00O0o1oo(iol1loo1io3);
/* 253 */                       if (iol1loo1io3.I01O10iIoo1O(liooo0iooi)) {
/* 271 */                           I00II0oii1o().I00lli11.I0000oI00("User property updated immediately", iii000ol0002.I00iOIl, l0olllo1i.I00l0OO0IO.I0000Il00O(str5), obj);
                                } else {
/* 295 */                           I00II0oii1o().I00ilO0.I0000oI00("(2)Too many active user properties, ignoring", l01O0IO1ooO0.I010ioo(iii000ol0002.I00iOIl), l0olllo1i.I00l0OO0IO.I0000Il00O(str5), obj);
                                }
/* 298 */                       if (z && (ii0oooi0io0l = iii000ol0002.I00l0I0l0lO1) != null) {
/* 313 */                           I000II(new ii0oooi0IO0l(ii0oooi0io0l, iii000ol0002.I00iio, 0L), lli10ii);
                                }
                            }
/* 316 */                   iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 318 */                   I00O0o1oo(iol1loo1io4);
/* 325 */                   if (iol1loo1io4.I01OO1I(iii000ol0002)) {
/* 353 */                       I00II0oii1o().I00lli11.I0000oI00("Conditional property added", iii000ol0002.I00iOIl, l0olllo1i.I00l0OO0IO.I0000Il00O(iii000ol0002.I00iiO.I00iiI), iii000ol0002.I00iiO.zza());
                            } else {
/* 387 */                       I00II0oii1o().I00ilO0.I0000oI00("Too many conditional properties, ignoring", l01O0IO1ooO0.I010ioo(iii000ol0002.I00iOIl), l0olllo1i.I00l0OO0IO.I0000Il00O(iii000ol0002.I00iiO.I00iiI), iii000ol0002.I00iiO.zza());
                            }
/* 390 */                   iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 392 */                   I00O0o1oo(iol1loo1io5);
/* 395 */                   iol1loo1io5.I01Io001O();
/* 398 */                   iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 400 */                   I00O0o1oo(iol1loo1io6);
/* 403 */                   iol1loo1io6.I01Io1();
                        } catch (Throwable th) {
/* 407 */                   iOl1lOo1IO iol1loo1io7 = this.I00iiO;
/* 409 */                   I00O0o1oo(iol1loo1io7);
/* 412 */                   iol1loo1io7.I01Io1();
/* 900 */                   throw th;
                        }
                    }
                }

                public final void I00OilO00Il(iII000ol000 iii000ol000, lli10iI lli10ii) {
/* 3 */             lII0I0I000I.I0000O(iii000ol000.I00iOIl);
/* 8 */             lII0I0I000I.I000II(iii000ol000.I00iiO);
/* 15 */            lII0I0I000I.I0000O(iii000ol000.I00iiO.I00iiI);
/* 22 */            I00iOIl().I010II();
/* 25 */            I00iIi0i1o();
/* 32 */            if (I00O0i0ii(lli10ii)) {
/* 37 */                if (!lli10ii.I00ioIO) {
/* 39 */                    I00Ol00(lli10ii);
/* 42 */                    return;
                        }
/* 43 */                iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 45 */                I00O0o1oo(iol1loo1io);
/* 48 */                iol1loo1io.I01Io000();
                        try {
/* 51 */                    I00Ol00(lli10ii);
/* 54 */                    String str = iii000ol000.I00iOIl;
/* 56 */                    lII0I0I000I.I000II(str);
/* 59 */                    iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 61 */                    I00O0o1oo(iol1loo1io2);
/* 68 */                    iII000ol000 iii000ol000I01OOIlI = iol1loo1io2.I01OOIlI(str, iii000ol000.I00iiO.I00iiI);
/* 72 */                    l0olllO1i l0olllo1i = this.I00ll1;
/* 74 */                    if (iii000ol000I01OOIlI != null) {
/* 96 */                        I00II0oii1o().I00lli11.I0000O(iii000ol000.I00iOIl, "Removing conditional user property", l0olllo1i.I00l0OO0IO.I0000Il00O(iii000ol000.I00iiO.I00iiI));
/* 99 */                        iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 101 */                       I00O0o1oo(iol1loo1io3);
/* 108 */                       iol1loo1io3.I01OOiI1o(str, iii000ol000.I00iiO.I00iiI);
/* 113 */                       if (iii000ol000I01OOIlI.I00ilI0I1) {
/* 115 */                           iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 117 */                           I00O0o1oo(iol1loo1io4);
/* 124 */                           iol1loo1io4.I01Iol(str, iii000ol000.I00iiO.I00iiI);
                                }
/* 131 */                       ii0oooi0IO0l ii0oooi0io0l = iii000ol000.I00li1OI;
/* 133 */                       if (ii0oooi0io0l != null) {
/* 135 */                           ii0il0lOolIo ii0il0loolio = ii0oooi0io0l.I00iiI;
/* 160 */                           ii0oooi0IO0l ii0oooi0io0lI01IO1il = I00iIO().I01IO1il(ii0oooi0io0l.I00iOIl, ii0il0loolio != null ? ii0il0loolio.I0001Ioi1lo() : null, iii000ol000I01OOIlI.I00iiI, ii0oooi0io0l.I00iio, ii0oooi0io0l.I00ilI0I1, true);
/* 164 */                           lII0I0I000I.I000II(ii0oooi0io0lI01IO1il);
/* 167 */                           I000II(ii0oooi0io0lI01IO1il, lli10ii);
                                }
                            } else {
/* 195 */                       I00II0oii1o().I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(iii000ol000.I00iOIl), "Conditional user property doesn't exist", l0olllo1i.I00l0OO0IO.I0000Il00O(iii000ol000.I00iiO.I00iiI));
                            }
/* 198 */                   iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 200 */                   I00O0o1oo(iol1loo1io5);
/* 203 */                   iol1loo1io5.I01Io001O();
/* 206 */                   iOl1lOo1IO iol1loo1io6 = this.I00iiO;
/* 208 */                   I00O0o1oo(iol1loo1io6);
/* 211 */                   iol1loo1io6.I01Io1();
                        } catch (Throwable th) {
/* 215 */                   iOl1lOo1IO iol1loo1io7 = this.I00iiO;
/* 217 */                   I00O0o1oo(iol1loo1io7);
/* 220 */                   iol1loo1io7.I01Io1();
/* 332 */                   throw th;
                        }
                    }
                }

                public final void I00Oio(lli10iI lli10ii, long j) throws Throwable {
/* 7 */             iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 9 */             I00O0o1oo(iol1loo1io);
/* 12 */            String str = lli10ii.I00iOIl;
/* 14 */            lII0I0I000I.I000II(str);
/* 17 */            l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str);
/* 22 */            if (l0iiiiI01Ol1o0 != null) {
/* 24 */                I00iIO();
/* 27 */                String str2 = lli10ii.I00iiI;
/* 29 */                String strI00IOO = l0iiiiI01Ol1o0.I00IOO();
/* 33 */                boolean zIsEmpty = TextUtils.isEmpty(str2);
/* 37 */                boolean zIsEmpty2 = TextUtils.isEmpty(strI00IOO);
/* 41 */                if (!zIsEmpty && !zIsEmpty2) {
/* 45 */                    lII0I0I000I.I000II(str2);
/* 52 */                    if (!str2.equals(strI00IOO)) {
/* 70 */                        I00II0oii1o().I00l0I0l0lO1.I0000Il00O("New GMP App Id passed in. Removing cached database data. appId", l01O0IO1ooO0.I010ioo(l0iiiiI01Ol1o0.I00II0oii1o()));
/* 73 */                        iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 75 */                        I00O0o1oo(iol1loo1io2);
/* 80 */                        l0olllO1i l0olllo1i = (l0olllO1i) iol1loo1io2.I00iOIl;
/* 82 */                        String strI00II0oii1o = l0iiiiI01Ol1o0.I00II0oii1o();
/* 86 */                        iol1loo1io2.I010OIo1l();
/* 89 */                        iol1loo1io2.I010II();
/* 92 */                        lII0I0I000I.I0000O(strI00II0oii1o);
                                try {
/* 95 */                            SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = iol1loo1io2.I01Io11IiiiO();
/* 99 */                            String[] strArr = {strI00II0oii1o};
/* 192 */                           int iDelete = sQLiteDatabaseI01Io11IiiiO.delete("events", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("apps", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseI01Io11IiiiO.delete("diagnostic_signals", "app_id=?", strArr);
/* 209 */                           if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I010oio1OO0)) {
/* 217 */                               iDelete += sQLiteDatabaseI01Io11IiiiO.delete("no_data_mode_events", "app_id=?", strArr);
                                    }
/* 221 */                           if (iDelete > 0) {
/* 223 */                               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 225 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 236 */                               l01o0io1ooo0.I00lll10.I0000O(strI00II0oii1o, "Deleted application data. app, records", Integer.valueOf(iDelete));
                                    }
                                } catch (SQLiteException e) {
/* 241 */                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 243 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 254 */                           l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(strI00II0oii1o), "Error deleting application data. appId, error", e);
                                }
/* 239 */                       l0iiiiI01Ol1o0 = null;
                            }
                        }
                    }
/* 258 */           if (l0iiiiI01Ol1o0 != null) {
/* 285 */               boolean z = (l0iiiiI01Ol1o0.I00O0i0ii() == -2147483648L || l0iiiiI01Ol1o0.I00O0i0ii() == lli10ii.I00l0OO0IO) ? false : true;
/* 286 */               String strI00IoiI = l0iiiiI01Ol1o0.I00IoiI();
/* 311 */               if (z || ((l0iiiiI01Ol1o0.I00O0i0ii() != -2147483648L || strI00IoiI == null || strI00IoiI.equals(lli10ii.I00iiO)) ? false : true)) {
/* 315 */                   Bundle bundle = new Bundle();
/* 320 */                   bundle.putString("_pv", strI00IoiI);
/* 338 */                   ii0oooi0IO0l ii0oooi0io0l = new ii0oooi0IO0l("_au", new ii0il0lOolIo(bundle), "auto", j, 0L);
/* 351 */                   if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I010l10O)) {
/* 353 */                       I0000O(ii0oooi0io0l, lli10ii);
                            } else {
/* 357 */                       I0000oI00(ii0oooi0io0l, lli10ii);
                            }
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0150  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0184  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x01d4  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x01ff  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x0201  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
                /* JADX WARN: Removed duplicated region for block: B:75:0x0219  */
                /* JADX WARN: Removed duplicated region for block: B:78:0x022e  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x025b  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x025d  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x0273  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x027f  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0283  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final l0IIii I00Ol00(lli10iI lli10ii) {
                    boolean z;
                    String str;
                    long j;
                    String str2;
                    String str3;
                    String str4;
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 11 */            lII0I0I000I.I000II(lli10ii);
/* 14 */            boolean z2 = lli10ii.I00lll10;
/* 16 */            String str5 = lli10ii.I00iOIl;
/* 18 */            lII0I0I000I.I0000O(str5);
/* 21 */            String str6 = lli10ii.I00oIiI10;
/* 27 */            if (!str6.isEmpty()) {
/* 36 */                this.I00oooO.put(str5, new lil111OOoo(this, str6));
                    }
/* 39 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 41 */            I00O0o1oo(iol1loo1io);
/* 44 */            l0IIii l0iiiiI01Ol1o0 = iol1loo1io.I01Ol1o0(str5);
/* 60 */            l1ioIO011Oo l1ioio011ooI000OiO = I00000oIO(str5).I000OiO(l1ioIO011Oo.I0000Il00O(100, lli10ii.I00oII));
/* 66 */            String strI010l1O = this.I00l0I0l0lO1.I010l1O(lli10ii, l1ioio011ooI000OiO);
/* 70 */            boolean z3 = true;
/* 71 */            l1iioiool l1iioioolVar = l1iioiool.AD_STORAGE;
/* 73 */            l1iioiool l1iioioolVar2 = l1iioiool.ANALYTICS_STORAGE;
/* 76 */            if (l0iiiiI01Ol1o0 != null) {
/* 110 */               l0olllO1i l0olllo1i = l0iiiiI01Ol1o0.I00000oIO;
/* 116 */               if (l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar) && strI010l1O != null) {
/* 120 */                   l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 122 */                   l0olllO1i.I000II(l0o10ooo0);
/* 125 */                   l0o10ooo0.I010II();
/* 134 */                   if (!strI010l1O.equals(l0iiiiI01Ol1o0.I0000oI00)) {
/* 136 */                       l0o10OoO0 l0o10ooo02 = l0olllo1i.I00io1l;
/* 138 */                       l0olllO1i.I000II(l0o10ooo02);
/* 141 */                       l0o10ooo02.I010II();
/* 146 */                       boolean zIsEmpty = TextUtils.isEmpty(l0iiiiI01Ol1o0.I0000oI00);
/* 150 */                       l0iiiiI01Ol1o0.I00IlilI0i0i(strI010l1O);
/* 153 */                       if (z2 && !"00000000-0000-0000-0000-000000000000".equals(this.I00l0I0l0lO1.I010ioo(lli10ii, l1ioio011ooI000OiO).first) && !zIsEmpty) {
/* 177 */                           if (l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar2)) {
/* 183 */                               l0iiiiI01Ol1o0.I00IO1oi11O(I000OiO(l1ioio011ooI000OiO));
/* 186 */                               z = false;
                                    } else {
/* 188 */                               z = true;
                                    }
/* 189 */                           iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 191 */                           I00O0o1oo(iol1loo1io2);
/* 200 */                           if (iol1loo1io2.I01O1I1(str5, "_id") != null) {
/* 202 */                               iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 204 */                               I00O0o1oo(iol1loo1io3);
/* 213 */                               if (iol1loo1io3.I01O1I1(str5, "_lair") == null) {
/* 219 */                                   I00IoO0().getClass();
/* 238 */                                   lioOO0ioOI liooo0iooi = new lioOO0ioOI(str5, "auto", "_lair", System.currentTimeMillis(), 1L);
/* 241 */                                   iOl1lOo1IO iol1loo1io4 = this.I00iiO;
/* 243 */                                   I00O0o1oo(iol1loo1io4);
/* 246 */                                   iol1loo1io4.I01O10iIoo1O(liooo0iooi);
                                        }
                                    }
                                } else if (TextUtils.isEmpty(l0iiiiI01Ol1o0.I00IO1()) && l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar2)) {
/* 270 */                           l0iiiiI01Ol1o0.I00IO1oi11O(I000OiO(l1ioio011ooI000OiO));
                                }
                            }
                        } else if (TextUtils.isEmpty(l0iiiiI01Ol1o0.I00IO1()) && l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar2)) {
/* 295 */                   l0iiiiI01Ol1o0.I00IO1oi11O(I000OiO(l1ioio011ooI000OiO));
                        }
/* 300 */               l0olllO1i l0olllo1i2 = l0iiiiI01Ol1o0.I00000oIO;
/* 304 */               l0iiiiI01Ol1o0.I00IioO0OiOi(lli10ii.I00iiI);
/* 307 */               str = lli10ii.I00li1OI;
/* 313 */               if (!TextUtils.isEmpty(str)) {
/* 315 */                   l0iiiiI01Ol1o0.I00Io1o110i(str);
                        }
/* 318 */               j = lli10ii.I00ilI0I1;
/* 324 */               if (j != 0) {
/* 326 */                   l0iiiiI01Ol1o0.I00OI1(j);
                        }
/* 329 */               str2 = lli10ii.I00iiO;
/* 335 */               if (!TextUtils.isEmpty(str2)) {
/* 337 */                   l0iiiiI01Ol1o0.I00Iooi00oi(str2);
                        }
/* 342 */               l0iiiiI01Ol1o0.I00O0o1oo(lli10ii.I00l0OO0IO);
/* 345 */               str3 = lli10ii.I00iio;
/* 347 */               if (str3 != null) {
/* 349 */                   l0iiiiI01Ol1o0.I00O10llo(str3);
                        }
/* 354 */               l0iiiiI01Ol1o0.I00000oIO(lli10ii.I00ilO0);
/* 359 */               l0iiiiI01Ol1o0.I0000O(lli10ii.I00ioIO);
/* 362 */               str4 = lli10ii.I00io1l;
/* 368 */               if (!TextUtils.isEmpty(str4)) {
/* 370 */                   l0iiiiI01Ol1o0.I001i1O0Ol(str4);
                        }
/* 373 */               l0o10OoO0 l0o10ooo03 = l0olllo1i2.I00io1l;
/* 375 */               l0olllO1i.I000II(l0o10ooo03);
/* 378 */               l0o10ooo03.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I00100l0 == z2;
/* 393 */               l0iiiiI01Ol1o0.I00100l0 = z2;
/* 395 */               Boolean bool = lli10ii.I00o0l1o1o0;
/* 397 */               l0o10OoO0 l0o10ooo04 = l0olllo1i2.I00io1l;
/* 399 */               l0olllO1i.I000II(l0o10ooo04);
/* 402 */               l0o10ooo04.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= !Objects.equals(l0iiiiI01Ol1o0.I00100o1O0lo, bool);
/* 417 */               l0iiiiI01Ol1o0.I00100o1O0lo = bool;
/* 421 */               l0iiiiI01Ol1o0.I0000Il00O(lli10ii.I00o101lO);
/* 424 */               String str7 = lli10ii.I00oO101o;
/* 426 */               l0o10OoO0 l0o10ooo05 = l0olllo1i2.I00io1l;
/* 428 */               l0olllO1i.I000II(l0o10ooo05);
/* 431 */               l0o10ooo05.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= !Objects.equals(l0iiiiI01Ol1o0.I00111O, str7);
/* 446 */               l0iiiiI01Ol1o0.I00111O = str7;
/* 448 */               iIIOIOl0IlOO iiioiol0iloo = iIIOIOl0IlOO.I00iiI;
/* 467 */               if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I00ooIo0)) {
/* 491 */                   if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I00oo1iO0ll)) {
/* 493 */                       l0iiiiI01Ol1o0.I001iOo1i0O(null);
                            }
                        } else {
/* 471 */                   l0iiiiI01Ol1o0.I001iOo1i0O(lli10ii.I00oI0i);
                        }
/* 496 */               boolean z4 = lli10ii.I00oOio10iI1;
/* 498 */               l0o10OoO0 l0o10ooo06 = l0olllo1i2.I00io1l;
/* 500 */               l0olllO1i.I000II(l0o10ooo06);
/* 503 */               l0o10ooo06.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I001IIilI0O == z4;
/* 518 */               l0iiiiI01Ol1o0.I001IIilI0O = z4;
/* 520 */               String str8 = lli10ii.I00ooIo0;
/* 522 */               l0o10OoO0 l0o10ooo07 = l0olllo1i2.I00io1l;
/* 524 */               l0olllO1i.I000II(l0o10ooo07);
/* 527 */               l0o10ooo07.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I001lloI == str8;
/* 542 */               l0iiiiI01Ol1o0.I001lloI = str8;
/* 544 */               iIO0ooOool.I00000oIO();
/* 557 */               if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I0100i)) {
/* 559 */                   int i = lli10ii.I00oliIiO01i;
/* 561 */                   l0o10OoO0 l0o10ooo08 = l0olllo1i2.I00io1l;
/* 563 */                   l0olllO1i.I000II(l0o10ooo08);
/* 566 */                   l0o10ooo08.I010II();
                            l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I001i1lo1io != i;
/* 581 */                   l0iiiiI01Ol1o0.I001i1lo1io = i;
                        }
/* 585 */               l0iiiiI01Ol1o0.I001lIiIIo1O(lli10ii.I00ol1);
/* 588 */               String str9 = lli10ii.I00ooiO1I;
/* 590 */               l0o10OoO0 l0o10ooo09 = l0olllo1i2.I00io1l;
/* 592 */               l0olllO1i.I000II(l0o10ooo09);
/* 595 */               l0o10ooo09.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I00IO1oi11O == str9;
/* 610 */               l0iiiiI01Ol1o0.I00IO1oi11O = str9;
/* 612 */               int i2 = lli10ii.I0100i;
/* 614 */               l0o10OoO0 l0o10ooo010 = l0olllo1i2.I00io1l;
/* 616 */               l0olllO1i.I000II(l0o10ooo010);
/* 619 */               l0o10ooo010.I010II();
                        l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I00IioO0OiOi != i2;
/* 632 */               l0iiiiI01Ol1o0.I00IioO0OiOi = i2;
/* 638 */               if (!l0iiiiI01Ol1o0.I000oI1ioi()) {
/* 644 */                   z3 = z;
                        } else if (!z) {
/* 643 */                   return l0iiiiI01Ol1o0;
                        }
/* 645 */               iOl1lOo1IO iol1loo1io5 = this.I00iiO;
/* 647 */               I00O0o1oo(iol1loo1io5);
/* 650 */               iol1loo1io5.I01OlIoIl(l0iiiiI01Ol1o0, z3);
/* 1261 */              return l0iiiiI01Ol1o0;
                    }
/* 82 */            l0iiiiI01Ol1o0 = new l0IIii(this.I00ll1, str5);
/* 89 */            if (l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar2)) {
/* 95 */                l0iiiiI01Ol1o0.I00IO1oi11O(I000OiO(l1ioio011ooI000OiO));
                    }
/* 102 */           if (l1ioio011ooI000OiO.I000OOo1O(l1iioioolVar)) {
/* 104 */               l0iiiiI01Ol1o0.I00IlilI0i0i(strI010l1O);
                    }
/* 107 */           z = false;
/* 300 */           l0olllO1i l0olllo1i22 = l0iiiiI01Ol1o0.I00000oIO;
/* 304 */           l0iiiiI01Ol1o0.I00IioO0OiOi(lli10ii.I00iiI);
/* 307 */           str = lli10ii.I00li1OI;
/* 313 */           if (!TextUtils.isEmpty(str)) {
                    }
/* 318 */           j = lli10ii.I00ilI0I1;
/* 324 */           if (j != 0) {
                    }
/* 329 */           str2 = lli10ii.I00iiO;
/* 335 */           if (!TextUtils.isEmpty(str2)) {
                    }
/* 342 */           l0iiiiI01Ol1o0.I00O0o1oo(lli10ii.I00l0OO0IO);
/* 345 */           str3 = lli10ii.I00iio;
/* 347 */           if (str3 != null) {
                    }
/* 354 */           l0iiiiI01Ol1o0.I00000oIO(lli10ii.I00ilO0);
/* 359 */           l0iiiiI01Ol1o0.I0000O(lli10ii.I00ioIO);
/* 362 */           str4 = lli10ii.I00io1l;
/* 368 */           if (!TextUtils.isEmpty(str4)) {
                    }
/* 373 */           l0o10OoO0 l0o10ooo032 = l0olllo1i22.I00io1l;
/* 375 */           l0olllO1i.I000II(l0o10ooo032);
/* 378 */           l0o10ooo032.I010II();
                    l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I00100l0 == z2;
/* 393 */           l0iiiiI01Ol1o0.I00100l0 = z2;
/* 395 */           Boolean bool2 = lli10ii.I00o0l1o1o0;
/* 397 */           l0o10OoO0 l0o10ooo042 = l0olllo1i22.I00io1l;
/* 399 */           l0olllO1i.I000II(l0o10ooo042);
/* 402 */           l0o10ooo042.I010II();
                    l0iiiiI01Ol1o0.I00O0o1oo |= !Objects.equals(l0iiiiI01Ol1o0.I00100o1O0lo, bool2);
/* 417 */           l0iiiiI01Ol1o0.I00100o1O0lo = bool2;
/* 421 */           l0iiiiI01Ol1o0.I0000Il00O(lli10ii.I00o101lO);
/* 424 */           String str72 = lli10ii.I00oO101o;
/* 426 */           l0o10OoO0 l0o10ooo052 = l0olllo1i22.I00io1l;
/* 428 */           l0olllO1i.I000II(l0o10ooo052);
/* 431 */           l0o10ooo052.I010II();
                    l0iiiiI01Ol1o0.I00O0o1oo |= !Objects.equals(l0iiiiI01Ol1o0.I00111O, str72);
/* 446 */           l0iiiiI01Ol1o0.I00111O = str72;
/* 448 */           iIIOIOl0IlOO iiioiol0iloo2 = iIIOIOl0IlOO.I00iiI;
/* 467 */           if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I00ooIo0)) {
                    }
/* 496 */           boolean z42 = lli10ii.I00oOio10iI1;
/* 498 */           l0o10OoO0 l0o10ooo062 = l0olllo1i22.I00io1l;
/* 500 */           l0olllO1i.I000II(l0o10ooo062);
/* 503 */           l0o10ooo062.I010II();
                    l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I001IIilI0O == z42;
/* 518 */           l0iiiiI01Ol1o0.I001IIilI0O = z42;
/* 520 */           String str82 = lli10ii.I00ooIo0;
/* 522 */           l0o10OoO0 l0o10ooo072 = l0olllo1i22.I00io1l;
/* 524 */           l0olllO1i.I000II(l0o10ooo072);
/* 527 */           l0o10ooo072.I010II();
                    l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I001lloI == str82;
/* 542 */           l0iiiiI01Ol1o0.I001lloI = str82;
/* 544 */           iIO0ooOool.I00000oIO();
/* 557 */           if (I00Ol1ll1().I01101IOlO(null, iol1II1ii1i.I0100i)) {
                    }
/* 585 */           l0iiiiI01Ol1o0.I001lIiIIo1O(lli10ii.I00ol1);
/* 588 */           String str92 = lli10ii.I00ooiO1I;
/* 590 */           l0o10OoO0 l0o10ooo092 = l0olllo1i22.I00io1l;
/* 592 */           l0olllO1i.I000II(l0o10ooo092);
/* 595 */           l0o10ooo092.I010II();
                    l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I00IO1oi11O == str92;
/* 610 */           l0iiiiI01Ol1o0.I00IO1oi11O = str92;
/* 612 */           int i22 = lli10ii.I0100i;
/* 614 */           l0o10OoO0 l0o10ooo0102 = l0olllo1i22.I00io1l;
/* 616 */           l0olllO1i.I000II(l0o10ooo0102);
/* 619 */           l0o10ooo0102.I010II();
                    l0iiiiI01Ol1o0.I00O0o1oo |= l0iiiiI01Ol1o0.I00IioO0OiOi != i22;
/* 632 */           l0iiiiI01Ol1o0.I00IioO0OiOi = i22;
/* 638 */           if (!l0iiiiI01Ol1o0.I000oI1ioi()) {
                    }
/* 645 */           iOl1lOo1IO iol1loo1io52 = this.I00iiO;
/* 647 */           I00O0o1oo(iol1loo1io52);
/* 650 */           iol1loo1io52.I01OlIoIl(l0iiiiI01Ol1o0, z3);
/* 1261 */          return l0iiiiI01Ol1o0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
                public final List I00Ol10(Bundle bundle, lli10iI lli10ii) {
                    int[] iArr;
/* 11 */            I00iOIl().I010II();
/* 14 */            iIO0ooOool.I00000oIO();
/* 17 */            iIl1iil iil1iilI00Ol1ll1 = I00Ol1ll1();
/* 21 */            String str = lli10ii.I00iOIl;
/* 29 */            if (!iil1iilI00Ol1ll1.I01101IOlO(str, iol1II1ii1i.I0100i) || str == null) {
/* 333 */               return new ArrayList();
                    }
/* 35 */            if (bundle != null) {
/* 39 */                int[] intArray = bundle.getIntArray("uriSources");
/* 45 */                long[] longArray = bundle.getLongArray("uriTimestamps");
/* 49 */                if (intArray != null) {
/* 51 */                    if (longArray == null || longArray.length != intArray.length) {
/* 196 */                       I00II0oii1o().I00ilO0.I00000oOI("Uri sources and timestamps do not match");
                            } else {
/* 59 */                        int i = 0;
/* 61 */                        while (i < intArray.length) {
/* 63 */                            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 65 */                            I00O0o1oo(iol1loo1io);
/* 70 */                            l0olllO1i l0olllo1i = (l0olllO1i) iol1loo1io.I00iOIl;
/* 72 */                            int i2 = intArray[i];
/* 74 */                            long j = longArray[i];
/* 76 */                            lII0I0I000I.I0000O(str);
/* 79 */                            iol1loo1io.I010II();
/* 82 */                            iol1loo1io.I010OIo1l();
                                    try {
/* 101 */                               iArr = intArray;
                                    } catch (SQLiteException e) {
/* 164 */                               e = e;
/* 165 */                               iArr = intArray;
                                    }
                                    try {
/* 111 */                               int iDelete = iol1loo1io.I01Io11IiiiO().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
/* 115 */                               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 117 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 120 */                               IOloiOI1 iOloiOI1 = l01o0io1ooo0.I00lll10;
/* 134 */                               StringBuilder sb = new StringBuilder(String.valueOf(iDelete).length() + 46);
/* 137 */                               sb.append("Pruned ");
/* 140 */                               sb.append(iDelete);
/* 143 */                               sb.append(" trigger URIs. appId, source, timestamp");
/* 158 */                               iOloiOI1.I0000oI00(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                                    } catch (SQLiteException e2) {
/* 162 */                               e = e2;
/* 167 */                               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 169 */                               l0olllO1i.I000II(l01o0io1ooo02);
/* 180 */                               l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error pruning trigger URIs. appId", e);
/* 183 */                               i++;
/* 185 */                               intArray = iArr;
                                    }
/* 183 */                           i++;
/* 185 */                           intArray = iArr;
                                }
                            }
                        }
                    }
/* 199 */           iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 201 */           I00O0o1oo(iol1loo1io2);
/* 204 */           String str2 = lli10ii.I00iOIl;
/* 206 */           lII0I0I000I.I0000O(str2);
/* 209 */           iol1loo1io2.I010II();
/* 212 */           iol1loo1io2.I010OIo1l();
/* 217 */           ?? arrayList = new ArrayList();
/* 220 */           Cursor cursorQuery = null;
                    try {
                        try {
/* 248 */                   cursorQuery = iol1loo1io2.I01Io11IiiiO().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
/* 256 */                   if (cursorQuery.moveToFirst()) {
/* 294 */                       do {
/* 259 */                           String string = cursorQuery.getString(0);
/* 263 */                           if (string == null) {
/* 265 */                               string = "";
                                    }
/* 287 */                           arrayList.add(new li1l0Iiiii(cursorQuery.getInt(2), cursorQuery.getLong(1), string));
/* 294 */                       } while (cursorQuery.moveToNext());
                            }
                        } catch (Throwable th) {
/* 325 */                   if (cursorQuery != null) {
/* 327 */                       cursorQuery.close();
                            }
/* 330 */                   throw th;
                        }
                    } catch (SQLiteException e3) {
/* 301 */               l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) iol1loo1io2.I00iOIl).I00ilO0;
/* 303 */               l0olllO1i.I000II(l01o0io1ooo03);
/* 314 */               l01o0io1ooo03.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Error querying trigger uris. appId", e3);
/* 317 */               arrayList = Collections.EMPTY_LIST;
                    }
/* 319 */           if (cursorQuery != null) {
/* 321 */               cursorQuery.close();
                    }
/* 324 */           return arrayList;
                }

                public final iIl1iil I00Ol1ll1() {
/* 1 */             l0olllO1i l0olllo1i = this.I00ll1;
/* 3 */             lII0I0I000I.I000II(l0olllo1i);
/* 6 */             return l0olllo1i.I00iio;
                }

                public final l0l1ol11 I00OloOo() {
/* 1 */             l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 3 */             I00O0o1oo(l0l1ol11Var);
/* 20 */            return l0l1ol11Var;
                }

                public final iOl1lOo1IO I00i01iIIliI() {
/* 1 */             iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 3 */             I00O0o1oo(iol1loo1io);
/* 20 */            return iol1loo1io;
                }

                public final l0IilI01 I00i0O() {
/* 1 */             l0IilI01 l0iili01 = this.I00iio;
/* 3 */             if (l0iili01 != null) {
/* 5 */                 return l0iili01;
                    }
/* 8 */             I000II.I001IO000("Network broadcast receiver not created");
/* 11 */            return null;
                }

                public final i1lioiII I00i0ilIl0i() {
/* 1 */             i1lioiII i1lioiii = this.I00ilO0;
/* 3 */             I00O0o1oo(i1lioiii);
/* 20 */            return i1lioiii;
                }

                public final lio010i I00i0oil() {
/* 1 */             lio010i lio010iVar = this.I00io1l;
/* 3 */             I00O0o1oo(lio010iVar);
/* 20 */            return lio010iVar;
                }

                public final lioil0ilIOi I00iIO() {
/* 1 */             l0olllO1i l0olllo1i = this.I00ll1;
/* 3 */             lII0I0I000I.I000II(l0olllo1i);
/* 6 */             lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 8 */             l0olllO1i.I0000oI00(lioil0ilioi);
/* 20 */            return lioil0ilioi;
                }

                public final void I00iIi0i1o() {
/* 7 */             if (this.I00lli11.get()) {
/* 9 */                 return;
                    }
/* 12 */            I000II.I001IO000("UploadController is not initialized");
                }

                @Override
                public final l0o10OoO0 I00iOIl() {
/* 1 */             l0olllO1i l0olllo1i = this.I00ll1;
/* 3 */             lII0I0I000I.I000II(l0olllo1i);
/* 6 */             l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 8 */             l0olllO1i.I000II(l0o10ooo0);
/* 20 */            return l0o10ooo0;
                }

                @Override
                public final Context I00iiI() {
/* 3 */             return this.I00ll1.I00iOIl;
                }

                public final void I00iiO(lli10iI lli10ii) {
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 11 */            String str = lli10ii.I00iOIl;
/* 13 */            lII0I0I000I.I0000O(str);
/* 20 */            l1ioIO011Oo l1ioio011ooI0000Il00O = l1ioIO011Oo.I0000Il00O(lli10ii.I00olI, lli10ii.I00oII);
/* 24 */            I00000oIO(str);
/* 35 */            I00II0oii1o().I00lll10.I0000O(str, "Setting storage consent for package", l1ioio011ooI0000Il00O);
/* 42 */            I00iOIl().I010II();
/* 45 */            I00iIi0i1o();
/* 50 */            this.I00ooIo0.put(str, l1ioio011ooI0000Il00O);
/* 53 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 55 */            I00O0o1oo(iol1loo1io);
/* 58 */            iol1loo1io.I01IO0oio(str, l1ioio011ooI0000Il00O);
                }

                public final void I00iio(lli10iI lli10ii) {
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 11 */            String str = lli10ii.I00iOIl;
/* 13 */            lII0I0I000I.I0000O(str);
/* 18 */            iOoOIi0i ioooii0iI00000oOI = iOoOIi0i.I00000oOI(lli10ii.I00oli);
/* 30 */            I00II0oii1o().I00lll10.I0000O(str, "Setting DMA consent for package", ioooii0iI00000oOI);
/* 37 */            I00iOIl().I010II();
/* 40 */            I00iIi0i1o();
/* 53 */            l1iIoO01 l1iioo01I00000oIO = iOoOIi0i.I0000Il00O(100, I00ilO0(str)).I00000oIO();
/* 59 */            this.I00ooiO1I.put(str, ioooii0iI00000oOI);
/* 62 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 64 */            I00O0o1oo(iol1loo1io);
/* 67 */            lII0I0I000I.I000II(str);
/* 70 */            lII0I0I000I.I000II(ioooii0iI00000oOI);
/* 73 */            iol1loo1io.I010II();
/* 76 */            iol1loo1io.I010OIo1l();
/* 79 */            l1ioIO011Oo l1ioio011ooI011Ol0 = iol1loo1io.I011Ol0(str);
/* 83 */            l1ioIO011Oo l1ioio011oo = l1ioIO011Oo.I0000Il00O;
/* 85 */            if (l1ioio011ooI011Ol0 == l1ioio011oo) {
/* 87 */                iol1loo1io.I01IO0oio(str, l1ioio011oo);
                    }
/* 92 */            ContentValues contentValues = new ContentValues();
/* 97 */            contentValues.put("app_id", str);
/* 104 */           contentValues.put("dma_consent_settings", ioooii0iI00000oOI.I00000oOI);
/* 107 */           iol1loo1io.I011lO1liO1O(contentValues);
/* 118 */           l1iIoO01 l1iioo01I00000oIO2 = iOoOIi0i.I0000Il00O(100, I00ilO0(str)).I00000oIO();
/* 126 */           I00iOIl().I010II();
/* 129 */           I00iIi0i1o();
/* 133 */           l1iIoO01 l1iioo01 = l1iIoO01.GRANTED;
/* 136 */           l1iIoO01 l1iioo012 = l1iIoO01.DENIED;
/* 144 */           boolean z = l1iioo01I00000oIO == l1iioo012 && l1iioo01I00000oIO2 == l1iioo01;
/* 145 */           boolean z2 = l1iioo01I00000oIO == l1iioo01 && l1iioo01I00000oIO2 == l1iioo012;
/* 151 */           if (z || z2) {
/* 165 */               I00II0oii1o().I00lll10.I0000Il00O("Generated _dcu event for", str);
/* 170 */               Bundle bundle = new Bundle();
/* 173 */               iOl1lOo1IO iol1loo1io2 = this.I00iiO;
/* 175 */               I00O0o1oo(iol1loo1io2);
/* 205 */               if (iol1loo1io2.I01OlOoii0(I00000oOI(), str, false, false, false, false).I0001Ioi1lo < I00Ol1ll1().I010o0o0oO(str, iol1II1ii1i.I00iiI)) {
/* 211 */                   bundle.putLong("_r", 1L);
/* 214 */                   iOl1lOo1IO iol1loo1io3 = this.I00iiO;
/* 216 */                   I00O0o1oo(iol1loo1io3);
/* 245 */                   I00II0oii1o().I00lll10.I0000O(str, "_dcu realtime event count", Long.valueOf(iol1loo1io3.I01OlOoii0(I00000oOI(), str, false, false, true, false).I0001Ioi1lo));
                        }
/* 252 */               this.I010OIo1l.I00000oOI(str, "_dcu", bundle);
                    }
                }

                public final iOoOIi0i I00ilI0I1(String str) throws NumberFormatException {
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 11 */            HashMap map = this.I00ooiO1I;
/* 17 */            iOoOIi0i ioooii0i = (iOoOIi0i) map.get(str);
/* 19 */            if (ioooii0i != null) {
/* 77 */                return ioooii0i;
                    }
/* 21 */            iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 23 */            I00O0o1oo(iol1loo1io);
/* 26 */            lII0I0I000I.I000II(str);
/* 29 */            iol1loo1io.I010II();
/* 32 */            iol1loo1io.I010OIo1l();
/* 45 */            iOoOIi0i ioooii0iI00000oOI = iOoOIi0i.I00000oOI(iol1loo1io.I011lIilI0lo("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
/* 49 */            map.put(str, ioooii0iI00000oOI);
/* 52 */            return ioooii0iI00000oOI;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final Bundle I00ilO0(String str) throws Throwable {
/* 5 */             I00iOIl().I010II();
/* 8 */             I00iIi0i1o();
/* 11 */            l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 13 */            I00O0o1oo(l0l1ol11Var);
/* 21 */            if (l0l1ol11Var.I011iO(str) == null) {
/* 20 */                return null;
                    }
/* 26 */            Bundle bundle = new Bundle();
/* 29 */            l1ioIO011Oo l1ioio011ooI00000oIO = I00000oIO(str);
/* 35 */            Bundle bundle2 = new Bundle();
/* 44 */            Iterator it = l1ioio011ooI00000oIO.I00000oIO.entrySet().iterator();
                    while (true) {
/* 58 */                if (!it.hasNext()) {
                            break;
                        }
/* 64 */                Map.Entry entry = (Map.Entry) it.next();
/* 72 */                int iOrdinal = ((l1iIoO01) entry.getValue()).ordinal();
/* 80 */                String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
/* 83 */                if (str2 != null) {
/* 93 */                    bundle2.putString(((l1iioiool) entry.getKey()).I00iOIl, str2);
                        }
                    }
/* 97 */            bundle.putAll(bundle2);
/* 109 */           iOoOIi0i ioooii0iI00io1l = I00io1l(str, I00ilI0I1(str), l1ioio011ooI00000oIO, new i0O1lIi1O0IO());
/* 115 */           Bundle bundle3 = new Bundle();
/* 132 */           for (Map.Entry entry2 : ioooii0iI00io1l.I0000oI00.entrySet()) {
/* 146 */               int iOrdinal2 = ((l1iIoO01) entry2.getValue()).ordinal();
/* 154 */               String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
/* 159 */               if (str3 != null) {
/* 169 */                   bundle3.putString(((l1iioiool) entry2.getKey()).I00iOIl, str3);
                        }
                    }
/* 173 */           Boolean bool = ioooii0iI00io1l.I0000Il00O;
/* 175 */           if (bool != null) {
/* 183 */               bundle3.putString("is_dma_region", bool.toString());
                    }
/* 186 */           String str4 = ioooii0iI00io1l.I0000O;
/* 188 */           if (str4 != null) {
/* 192 */               bundle3.putString("cps_display_str", str4);
                    }
/* 195 */           bundle.putAll(bundle3);
/* 198 */           iOl1lOo1IO iol1loo1io = this.I00iiO;
/* 200 */           I00O0o1oo(iol1loo1io);
/* 205 */           lioOO0ioOI liooo0iooiI01O1I1 = iol1loo1io.I01O1I1(str, "_npa");
/* 239 */           bundle.putString("ad_personalization", 1 != (liooo0iooiI01O1I1 != null ? liooo0iooiI01O1I1.I0000oI00.equals(1L) : I001lllioOl(str, new i0O1lIi1O0IO())) ? "granted" : "denied");
/* 437 */           return bundle;
                }

                /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00b2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final iOoOIi0i I00io1l(String str, iOoOIi0i ioooii0i, l1ioIO011Oo l1ioio011oo, i0O1lIi1O0IO i0o1lii1o0io) {
                    l1iioiool l1iioioolVarI01101IOlO;
                    l1iioiool l1iioioolVar;
                    l1iIoO01 l1iioo01;
                    l1iIoO01 l1iioo01I010ioo;
/* 1 */             l0l1ol11 l0l1ol11Var = this.I00iOIl;
/* 3 */             I00O0o1oo(l0l1ol11Var);
/* 6 */             iooOiIloili ioooiiloiliI011iO = l0l1ol11Var.I011iO(str);
/* 12 */            int i = 90;
/* 14 */            l1iIoO01 l1iioo012 = l1iIoO01.DENIED;
/* 16 */            l1iioiool l1iioioolVar2 = l1iioiool.AD_USER_DATA;
/* 18 */            if (ioooiiloiliI011iO == null) {
/* 24 */                if (ioooii0i.I00000oIO() == l1iioo012) {
/* 26 */                    i = ioooii0i.I00000oIO;
/* 28 */                    i0o1lii1o0io.I0000oI00(l1iioioolVar2, i);
                        } else {
/* 34 */                    i0o1lii1o0io.I000O01llI0(l1iioioolVar2, iIloio1i.FAILSAFE);
                        }
/* 43 */                return new iOoOIi0i(Boolean.FALSE, i, Boolean.TRUE, "-");
                    }
/* 47 */            l1iIoO01 l1iioo01I00000oIO = ioooii0i.I00000oIO();
/* 53 */            l1iIoO01 l1iioo013 = l1iIoO01.GRANTED;
/* 55 */            if (l1iioo01I00000oIO == l1iioo013 || l1iioo01I00000oIO == l1iioo012) {
/* 181 */               i = ioooii0i.I00000oIO;
/* 183 */               i0o1lii1o0io.I0000oI00(l1iioioolVar2, i);
                    } else {
/* 61 */                l1iIoO01 l1iioo014 = l1iIoO01.POLICY;
/* 63 */                l1iIoO01 l1iioo015 = l1iIoO01.UNINITIALIZED;
/* 65 */                if (l1iioo01I00000oIO != l1iioo014 || (l1iioo01I010ioo = l0l1ol11Var.I010ioo(str, l1iioioolVar2)) == l1iioo015) {
/* 81 */                    l0l1ol11Var.I010II();
/* 84 */                    l0l1ol11Var.I010l1O(str);
/* 87 */                    iooOiIloili ioooiiloiliI011iO2 = l0l1ol11Var.I011iO(str);
/* 91 */                    if (ioooiiloiliI011iO2 == null) {
/* 133 */                       l1iioioolVarI01101IOlO = null;
/* 134 */                       EnumMap enumMap = l1ioio011oo.I00000oIO;
/* 136 */                       l1iioioolVar = l1iioiool.AD_STORAGE;
/* 142 */                       l1iioo01 = (l1iIoO01) enumMap.get(l1iioioolVar);
/* 144 */                       if (l1iioo01 != null) {
/* 147 */                           l1iioo015 = l1iioo01;
                                }
/* 154 */                       boolean z = l1iioo015 != l1iioo013 || l1iioo015 == l1iioo012;
/* 155 */                       if (l1iioioolVarI01101IOlO == l1iioioolVar || !z) {
/* 168 */                           i0o1lii1o0io.I000O01llI0(l1iioioolVar2, iIloio1i.REMOTE_DEFAULT);
/* 179 */                           l1iioo01I00000oIO = true == l0l1ol11Var.I011iIOio(str, l1iioioolVar2) ? l1iioo012 : l1iioo013;
                                } else {
/* 161 */                           i0o1lii1o0io.I000O01llI0(l1iioioolVar2, iIloio1i.REMOTE_DELEGATION);
/* 164 */                           l1iioo01I00000oIO = l1iioo015;
                                }
                            } else {
/* 106 */                       for (ioioiol10O ioioiol10o : ioooiiloiliI011iO2.I001IIilI0O()) {
/* 122 */                           if (l1iioioolVar2 == l0l1ol11.I01101IOlO(ioioiol10o.I00111O())) {
/* 128 */                               l1iioioolVarI01101IOlO = l0l1ol11.I01101IOlO(ioioiol10o.I001IIilI0O());
                                        break;
                                    }
                                }
/* 133 */                       l1iioioolVarI01101IOlO = null;
/* 134 */                       EnumMap enumMap2 = l1ioio011oo.I00000oIO;
/* 136 */                       l1iioioolVar = l1iioiool.AD_STORAGE;
/* 142 */                       l1iioo01 = (l1iIoO01) enumMap2.get(l1iioioolVar);
/* 144 */                       if (l1iioo01 != null) {
                                }
/* 154 */                       if (l1iioo015 != l1iioo013) {
/* 155 */                           if (l1iioioolVarI01101IOlO == l1iioioolVar) {
/* 168 */                               i0o1lii1o0io.I000O01llI0(l1iioioolVar2, iIloio1i.REMOTE_DEFAULT);
/* 179 */                               if (true == l0l1ol11Var.I011iIOio(str, l1iioioolVar2)) {
                                        }
                                    }
                                }
                            }
                        } else {
/* 75 */                    i0o1lii1o0io.I000O01llI0(l1iioioolVar2, iIloio1i.REMOTE_ENFORCED_DEFAULT);
/* 78 */                    l1iioo01I00000oIO = l1iioo01I010ioo;
                        }
                    }
/* 186 */           l0l1ol11Var.I010II();
/* 189 */           l0l1ol11Var.I010l1O(str);
/* 192 */           iooOiIloili ioooiiloiliI011iO3 = l0l1ol11Var.I011iO(str);
/* 196 */           boolean z2 = ioooiiloiliI011iO3 == null || !ioooiiloiliI011iO3.I001i1O0Ol() || ioooiiloiliI011iO3.I001i1lo1io();
/* 212 */           I00O0o1oo(l0l1ol11Var);
/* 215 */           l0l1ol11Var.I010II();
/* 218 */           l0l1ol11Var.I010l1O(str);
/* 223 */           TreeSet treeSet = new TreeSet();
/* 226 */           iooOiIloili ioooiiloiliI011iO4 = l0l1ol11Var.I011iO(str);
/* 230 */           if (ioooiiloiliI011iO4 != null) {
/* 237 */               Iterator it = ioooiiloiliI011iO4.I001IO000().iterator();
/* 245 */               while (it.hasNext()) {
/* 257 */                   treeSet.add(((ioo0loOI1oiI) it.next()).I00111O());
                        }
                    }
/* 261 */           if (l1iioo01I00000oIO == l1iioo012 || treeSet.isEmpty()) {
/* 298 */               return new iOoOIi0i(Boolean.FALSE, i, Boolean.valueOf(z2), "-");
                    }
/* 286 */           return new iOoOIi0i(Boolean.TRUE, i, Boolean.valueOf(z2), z2 ? TextUtils.join("", treeSet) : "");
                }
            }
