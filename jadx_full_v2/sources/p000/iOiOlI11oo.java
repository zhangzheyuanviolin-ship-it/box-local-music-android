            package p000;

            import android.os.SystemClock;
            import java.time.Duration;
            
            public final class iOiOlI11oo implements lIIOoiIOO0 {
                public iOiiOlio I00000oIO;
                public long I00000oOI;
                public Object I0000Il00O;

                @Override
                public final Object zza(Object obj) {
/* 1 */             iOiiOlio ioiiolio = this.I00000oIO;
/* 3 */             long j = this.I00000oOI;
/* 5 */             Object obj2 = this.I0000Il00O;
/* 7 */             ilOl1l ilol1l = (ilOl1l) obj;
/* 13 */            long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
/* 18 */            IOiOol0 iOiOol0 = new IOiOol0(11);
/* 23 */            iOiOol0.I00iiO = iO0Io0.NO_ERROR;
/* 25 */            ilOiOOII0I0 iloiooii0i0 = ioiiolio.I00iio;
/* 37 */            iOiOol0.I00iiI = Integer.valueOf(iloiooii0i0 != null ? iloiooii0i0.I0001Ioi1lo : -1);
/* 45 */            iOiOol0.I00iio = Boolean.valueOf(ioiiolio.I00ilO0);
/* 57 */            iOiOol0.I00io1l = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
/* 60 */            ioiiolio.I00ilO0 = false;
/* 70 */            ioiiolio.I00iiO.I0000Il00O(iOiOol0, obj2, ilol1l.I00000oIO, Duration.ofMillis(jElapsedRealtime));
/* 77 */            return ilol1l;
                }
            }
