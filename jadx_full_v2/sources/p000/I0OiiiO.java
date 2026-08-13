            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.view.Choreographer;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.security.GeneralSecurityException;
            import java.security.SecureRandom;
            import java.text.SimpleDateFormat;
            import java.util.Locale;
            import java.util.Random;
            import java.util.WeakHashMap;
            import javax.crypto.Cipher;
            
            public final class I0OiiiO extends ThreadLocal {
                public final int I00000oIO;

                public I0OiiiO(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object initialValue() {
                    switch (this.I00000oIO) {
                        case 0:
                            try {
/* 336 */                       return (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/CTR/NoPadding");
                            } catch (GeneralSecurityException e) {
/* 341 */                       OoOil11Ol1o.I000oI1ioi(e);
/* 4 */                         return null;
                            }
                        case 1:
                            try {
/* 317 */                       return (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/ECB/NOPADDING");
                            } catch (GeneralSecurityException e2) {
/* 322 */                       OoOil11Ol1o.I000oI1ioi(e2);
/* 4 */                         return null;
                            }
                        case 2:
                            try {
/* 298 */                       return (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/CTR/NOPADDING");
                            } catch (GeneralSecurityException e3) {
/* 303 */                       OoOil11Ol1o.I000oI1ioi(e3);
/* 4 */                         return null;
                            }
                        case 3:
                            try {
/* 279 */                       return (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/GCM-SIV/NoPadding");
                            } catch (GeneralSecurityException e4) {
/* 284 */                       OoOil11Ol1o.I000oI1ioi(e4);
/* 4 */                         return null;
                            }
                        case 4:
/* 239 */                   Choreographer choreographer = Choreographer.getInstance();
/* 243 */                   Looper looperMyLooper = Looper.myLooper();
/* 247 */                   if (looperMyLooper != null) {
/* 253 */                       I101OO01 i101oo01 = new I101OO01(choreographer, Handler.createAsync(looperMyLooper));
/* 258 */                       return iiollilo0IO1.I00000oIO(i101oo01, i101oo01.I00li1OI);
                            }
/* 265 */                   I000II.I001IO000("no Looper on this thread");
/* 4 */                     return null;
                        case 5:
/* 225 */                   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
/* 228 */                   simpleDateFormat.setLenient(false);
/* 233 */                   simpleDateFormat.setTimeZone(OollIoI001lo.I0000oI00);
/* 236 */                   return simpleDateFormat;
                        case 6:
/* 215 */                   return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
                        case 7:
/* 205 */                   return new SimpleDateFormat("HH:mm:ss", Locale.US);
                        case 8:
/* 195 */                   return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                        case 9:
/* 185 */                   return new Random();
                        case 10:
/* 155 */                   if (Looper.myLooper() == Looper.getMainLooper()) {
/* 157 */                       return O1OIIoio0i1.I0000O();
                            }
/* 166 */                   if (Looper.myLooper() != null) {
/* 179 */                       return new Io11oioo(new Handler(Looper.myLooper()));
                            }
/* 4 */                     return null;
                        case 11:
                            try {
/* 138 */                       return (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/GCM/NoPadding");
                            } catch (GeneralSecurityException e5) {
/* 143 */                       OoOil11Ol1o.I000oI1ioi(e5);
/* 4 */                         return null;
                            }
                        case 12:
/* 121 */                   SecureRandom secureRandom = new SecureRandom();
/* 124 */                   secureRandom.nextLong();
/* 127 */                   return secureRandom;
                        case 13:
/* 113 */                   i1iIO0I1I00 i1iio0i1i00 = new i1iIO0I1I00();
/* 116 */                   i1iio0i1i00.I00iOIl = 0;
/* 118 */                   return i1iio0i1i00;
                        case 14:
/* 68 */                    Thread.currentThread();
/* 73 */                    if (liOoOi1III.I00000oIO == null) {
/* 83 */                        liOoOi1III.I00000oIO = Looper.getMainLooper().getThread();
                            }
/* 85 */                    iOli00o11Olo ioli00o11olo = new iOli00o11Olo();
/* 88 */                    ioli00o11olo.I00000oIO = false;
/* 90 */                    ioli00o11olo.I00000oOI = null;
/* 92 */                    ioli00o11olo.I0000Il00O = null;
/* 94 */                    ioli00o11olo.I0000O = null;
/* 96 */                    Thread threadCurrentThread = Thread.currentThread();
/* 100 */                   WeakHashMap weakHashMap = iIl1i1i11.I0000Il00O;
                            synchronized (weakHashMap) {
/* 103 */                       weakHashMap.put(threadCurrentThread, ioli00o11olo);
                            }
/* 107 */                   return ioli00o11olo;
                        case 15:
/* 62 */                    return new Random();
                        case 16:
/* 54 */                    iliiOOl1Oll0 iliiool1oll0 = new iliiOOl1Oll0();
/* 57 */                    iliiool1oll0.I00iOIl = 0;
/* 59 */                    return iliiool1oll0;
                        case 17:
/* 47 */                    return 0L;
                        case PoseLandmark.RIGHT_PINKY:
/* 20 */                    iO1lilOi.I00000oIO(Thread.currentThread());
/* 23 */                    o0Ol1IO o0ol1io = new o0Ol1IO();
/* 26 */                    o0ol1io.I00000oIO = false;
/* 28 */                    o0ol1io.I00000oOI = null;
/* 30 */                    Thread threadCurrentThread2 = Thread.currentThread();
/* 34 */                    WeakHashMap weakHashMap2 = o0IOOIili01o.I00000oOI;
                            synchronized (weakHashMap2) {
/* 37 */                        weakHashMap2.put(threadCurrentThread2, o0ol1io);
                            }
/* 41 */                    return o0ol1io;
                        default:
/* 10 */                    return new Random();
                    }
                }
            }
