            package p000;

            import android.os.SystemClock;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class iOiiIIIii0Io implements lIIOoiIOO0 {
                public iOil1lO10l I00000oIO;
                public AtomicLong I00000oOI;
                public long I0000Il00O;
                public Object I0000O;

                @Override
                public final Object zza(Object obj) {
/* 1 */             iOil1lO10l ioil1lo10l = this.I00000oIO;
/* 3 */             AtomicLong atomicLong = this.I00000oOI;
/* 5 */             long j = this.I0000Il00O;
/* 7 */             Object obj2 = this.I0000O;
/* 9 */             ioil1lo10l.getClass();
/* 16 */            IOiOol0 iOiOol0 = new IOiOol0(11);
/* 21 */            iOiOol0.I00iiO = iO0Io0.NO_ERROR;
/* 23 */            ilOiOOII0I0 iloiooii0i0 = ioil1lo10l.I00iio;
/* 35 */            iOiOol0.I00iiI = Integer.valueOf(iloiooii0i0 != null ? iloiooii0i0.I0001Ioi1lo : -1);
/* 43 */            iOiOol0.I00iio = Boolean.valueOf(ioil1lo10l.I00ilO0);
/* 59 */            iOiOol0.I00ioIO = Long.valueOf(atomicLong.get() & Long.MAX_VALUE);
/* 72 */            iOiOol0.I00io1l = Long.valueOf((SystemClock.elapsedRealtime() - j) & Long.MAX_VALUE);
/* 75 */            ioil1lo10l.I00ilO0 = false;
/* 77 */            Object objI000l1 = ioil1lo10l.I000l1(obj);
/* 83 */            ioil1lo10l.I00iiO.I00000oOI(iOiOol0, obj2, objI000l1);
/* 168 */           return objI000l1;
                }
            }
