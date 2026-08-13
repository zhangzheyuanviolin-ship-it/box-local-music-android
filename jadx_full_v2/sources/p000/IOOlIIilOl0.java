            package p000;

            import android.os.Handler;
            import android.os.HandlerThread;
            import com.google.firebase.components.ComponentRegistrar;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashSet;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.TreeMap;
            import java.util.TreeSet;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentSkipListMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class IOOlIIilOl0 implements Iiio1OI0O0i, IOiOl1lII10i, OIOi0l1il, Illill0o, IOiOiIIiii1 {
                public final int I00iOIl;

                public IOOlIIilOl0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static void I0000Il00O() {
/* 20 */            throw new IOiIIo1l(5);
                }

                public static void I0000oI00(Object obj) {
/* 29 */            throw new IllegalStateException(obj.toString());
                }

                public static void I0001Ioi1lo(Object obj, String str, Object obj2) {
/* 98 */            throw new IllegalStateException((str + obj + obj2).toString());
                }

                public static void I000II(String str) {
/* 29 */            throw new NullPointerException(str);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static void I000O01llI0(String str, int i, Object obj) {
/* 98 */            throw new IllegalStateException((str + obj + ((char) i)).toString());
                }

                public static void I000OOo1O(String str, Object obj) {
/* 37 */            throw new Ii01OOool(str + obj);
                }

                public static void I000OiO(String str, Object obj, Object obj2, Object obj3) {
/* 204 */           throw new Ii01OOool(str + obj + obj2 + obj3 + ')');
                }

                public static void I000iOII() {
/* 20 */            throw new IllegalStateException();
                }

                public static void I000l1(String str, Object obj) throws IOException {
/* 37 */            throw new IOException(str + obj);
                }

                public static void I000lI(String str, Object obj) {
/* 37 */            throw new IllegalStateException((str + obj).toString());
                }

                @Override
                public List I00000oIO(ComponentRegistrar componentRegistrar) {
/* 1 */             return componentRegistrar.getComponents();
                }

                @Override
                public Object I00000oOI() {
                    switch (this.I00iOIl) {
                        case 6:
/* 57 */                    return new ArrayList();
                        case 7:
/* 51 */                    return new ConcurrentHashMap();
                        case 8:
/* 45 */                    return new ConcurrentSkipListMap();
                        case 9:
/* 39 */                    return new LinkedHashSet();
                        case 10:
/* 33 */                    return new TreeSet();
                        case 11:
/* 27 */                    return new ArrayDeque();
                        case 12:
/* 21 */                    return new O100l1O0IiiO(true);
                        case 13:
/* 14 */                    return new LinkedHashMap();
                        default:
/* 8 */                     return new TreeMap();
                    }
                }

                @Override
                public double I0000O(double d) {
                    switch (this.I00iOIl) {
                        case 0:
/* 50 */                    double d2 = d < 0.0d ? -d : d;
/* 88 */                    return Math.copySign(d2 >= 0.04045d ? Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d) : d2 * 0.07739938080495357d, d);
                        case 1:
/* 33 */                    float[] fArr = IOOlIOOi0O0.I00000oIO;
/* 37 */                    return IOOlIOOi0O0.I00000oOI(IOOlIOOi0O0.I0000Il00O, d);
                        case 2:
/* 24 */                    float[] fArr2 = IOOlIOOi0O0.I00000oIO;
/* 28 */                    return IOOlIOOi0O0.I00000oIO(IOOlIOOi0O0.I0000Il00O, d);
                        case 3:
/* 15 */                    float[] fArr3 = IOOlIOOi0O0.I00000oIO;
/* 19 */                    return IOOlIOOi0O0.I0000O(IOOlIOOi0O0.I0000O, d);
                        default:
/* 6 */                     float[] fArr4 = IOOlIOOi0O0.I00000oIO;
/* 10 */                    return IOOlIOOi0O0.I0000Il00O(IOOlIOOi0O0.I0000O, d);
                    }
                }

                @Override
                public Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 17:
/* 100 */                   return null;
                        default:
/* 8 */                     Iio1oiI iio1oiI = (Iio1oiI) obj;
/* 10 */                    Map map = Collections.EMPTY_MAP;
/* 12 */                    IiI1oOoo iiI1oOoo = new IiI1oOoo();
/* 21 */                    iiI1oOoo.I0000oI00 = new AtomicBoolean(false);
/* 27 */                    iiI1oOoo.I0001Ioi1lo = new float[16];
/* 31 */                    iiI1oOoo.I000II = new float[16];
/* 38 */                    iiI1oOoo.I000O01llI0 = new LinkedHashMap();
/* 40 */                    iiI1oOoo.I000OOo1O = 0;
/* 42 */                    iiI1oOoo.I000OiO = false;
/* 49 */                    iiI1oOoo.I000iOII = new ArrayList();
/* 55 */                    HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
/* 58 */                    iiI1oOoo.I00000oOI = handlerThread;
/* 60 */                    handlerThread.start();
/* 69 */                    Handler handler = new Handler(handlerThread.getLooper());
/* 72 */                    iiI1oOoo.I0000O = handler;
/* 79 */                    iiI1oOoo.I0000Il00O = new Io11oioo(handler);
/* 86 */                    iiI1oOoo.I00000oIO = new OIi0ooo0l1();
                            try {
/* 88 */                        iiI1oOoo.I000OOo1O(iio1oiI);
/* 91 */                        VarHandle.storeStoreFence();
/* 94 */                        return iiI1oOoo;
                            } catch (RuntimeException e) {
/* 96 */                        iiI1oOoo.I00000oIO();
/* 99 */                        throw e;
                            }
                    }
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
/* 11 */            Set setI0000oI00 = ((I1ii1o0) iOiOIoiiO0i).I0000oI00(OOiilOlOOI.I00000oIO(I1l1000Io.class));
/* 15 */            Io0IIl00 io0IIl00 = Io0IIl00.I00000oOI;
/* 17 */            if (io0IIl00 == null) {
                        synchronized (Io0IIl00.class) {
                            try {
/* 22 */                        io0IIl00 = Io0IIl00.I00000oOI;
/* 24 */                        if (io0IIl00 == null) {
/* 28 */                            io0IIl00 = new Io0IIl00();
/* 36 */                            io0IIl00.I00000oIO = new HashSet();
/* 38 */                            VarHandle.storeStoreFence();
/* 41 */                            Io0IIl00.I00000oOI = io0IIl00;
                                }
                            } finally {
                            }
                        }
                    }
/* 50 */            IiIO0i100IO iiIO0i100IO = new IiIO0i100IO();
/* 57 */            iiIO0i100IO.I00000oIO = IiIO0i100IO.I00000oOI(setI0000oI00);
/* 59 */            iiIO0i100IO.I00000oOI = io0IIl00;
/* 61 */            VarHandle.storeStoreFence();
/* 77 */            return iiIO0i100IO;
                }
            }
