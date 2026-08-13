            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.net.URL;
            import java.security.AccessController;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Enumeration;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.ServiceConfigurationError;
            import java.util.ServiceLoader;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.LinkedBlockingQueue;
            
            public abstract class O1I1lilOlO0I {
                public static volatile int I00000oIO;
                public static final OI1IIoll I00000oOI;
                public static final OI1IIoll I0000Il00O;
                public static volatile OI1IIoll I0000O;
                public static final String[] I0000oI00;

                static {
                    String property;
/* 4 */             OI1IIoll oI1IIoll = new OI1IIoll(1);
/* 9 */             OliOIoi1Iiol oliOIoi1Iiol = new OliOIoi1Iiol();
/* 13 */            oliOIoi1Iiol.I00iOIl = false;
/* 20 */            oliOIoi1Iiol.I00iiI = new ConcurrentHashMap();
/* 27 */            oliOIoi1Iiol.I00iiO = new LinkedBlockingQueue();
/* 29 */            VarHandle.storeStoreFence();
/* 32 */            oI1IIoll.I00000oOI = oliOIoi1Iiol;
/* 36 */            new O1oO0lOoI1();
/* 41 */            new ThreadLocal();
/* 46 */            new I1oiIIi0i1l();
/* 49 */            VarHandle.storeStoreFence();
/* 52 */            I00000oOI = oI1IIoll;
/* 56 */            OI1IIoll oI1IIoll2 = new OI1IIoll(0);
/* 66 */            oI1IIoll2.I00000oOI = new liIoOiiO1Oi(13);
/* 70 */            new O1oO0lOoI1();
/* 73 */            VarHandle.storeStoreFence();
/* 76 */            I0000Il00O = oI1IIoll2;
                    try {
/* 80 */                property = System.getProperty("slf4j.detectLoggerNameMismatch");
                    } catch (SecurityException unused) {
/* 85 */                property = null;
                    }
/* 86 */            if (property != null) {
/* 91 */                property.equalsIgnoreCase("true");
                    }
/* 100 */           I0000oI00 = new String[]{"2.0"};
                }

                public static ArrayList I00000oIO() {
                    ServiceLoader serviceLoaderLoad;
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             ClassLoader classLoader = O1I1lilOlO0I.class.getClassLoader();
/* 18 */            String property = System.getProperty("slf4j.provider");
/* 22 */            OI1IIoll oI1IIoll = null;
/* 23 */            if (property != null && !property.isEmpty()) {
                        try {
/* 43 */                    String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
/* 47 */                    int i = Oi01Io.I00000oIO;
/* 60 */                    if (IIlIOloOOO.I001lIiIIo1O(2) >= IIlIOloOOO.I001lIiIIo1O(Oi01Io.I00000oOI)) {
/* 72 */                        Oi01Io.I0000Il00O().println("SLF4J(I): ".concat(str));
                            }
/* 87 */                    oI1IIoll = (OI1IIoll) classLoader.loadClass(property).getConstructor(null).newInstance(null);
                        } catch (ClassCastException e) {
/* 114 */                   Oi01Io.I00000oOI("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e);
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
/* 137 */                   Oi01Io.I00000oOI("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e2);
                        }
                    }
/* 140 */           if (oI1IIoll != null) {
/* 142 */               arrayList.add(oI1IIoll);
/* 145 */               return arrayList;
                    }
/* 150 */           if (System.getSecurityManager() == null) {
/* 154 */               serviceLoaderLoad = ServiceLoader.load(OI1IIoll.class, classLoader);
                    } else {
/* 161 */               O1I1l1l o1I1l1l = new O1I1l1l();
/* 164 */               o1I1l1l.I00000oIO = classLoader;
/* 166 */               VarHandle.storeStoreFence();
/* 173 */               serviceLoaderLoad = (ServiceLoader) AccessController.doPrivileged(o1I1l1l);
                    }
/* 175 */           Iterator it = serviceLoaderLoad.iterator();
/* 183 */           while (it.hasNext()) {
                        try {
/* 191 */                   arrayList.add((OI1IIoll) it.next());
                        } catch (ServiceConfigurationError e3) {
/* 214 */                   Oi01Io.I00000oIO("A service provider failed to instantiate:\n" + e3.getMessage());
                        }
                    }
/* 541 */           return arrayList;
                }

                public static O1I1OOiol I00000oOI(String str) {
                    OI1IIoll oI1IIoll;
                    IoOl111 ioOl111;
/* 4 */             if (I00000oIO == 0) {
                        synchronized (O1I1lilOlO0I.class) {
                            try {
/* 11 */                        if (I00000oIO == 0) {
/* 13 */                            I00000oIO = 1;
/* 15 */                            I0000Il00O();
                                }
                            } finally {
                            }
                        }
                    }
/* 25 */            int i = I00000oIO;
/* 27 */            if (i != 1) {
/* 30 */                oI1IIoll = null;
/* 31 */                if (i == 2) {
/* 53 */                    I000II.I001IO000("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                        } else if (i == 3) {
/* 48 */                    oI1IIoll = I0000O;
                        } else if (i == 4) {
/* 39 */                    oI1IIoll = I0000Il00O;
                        } else {
/* 44 */                    I000II.I001IO000("Unreachable code");
                        }
                    } else {
/* 57 */                oI1IIoll = I00000oOI;
                    }
                    switch (oI1IIoll.I00000oIO) {
                        case 0:
/* 71 */                    ioOl111 = (liIoOiiO1Oi) oI1IIoll.I00000oOI;
                            break;
                        default:
/* 66 */                    ioOl111 = (OliOIoi1Iiol) oI1IIoll.I00000oOI;
                            break;
                    }
/* 73 */            return ioOl111.I0000Il00O(str);
                }

                public static final void I0000Il00O() {
                    try {
/* 1 */                 ArrayList arrayListI00000oIO = I00000oIO();
/* 5 */                 I000II(arrayListI00000oIO);
/* 14 */                if (arrayListI00000oIO.isEmpty()) {
/* 41 */                    I00000oIO = 4;
/* 45 */                    Oi01Io.I0000O("No SLF4J providers were found.");
/* 50 */                    Oi01Io.I0000O("Defaulting to no-operation (NOP) logger implementation");
/* 55 */                    Oi01Io.I0000O("See https://www.slf4j.org/codes.html#noProviders for further details.");
/* 62 */                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                            try {
/* 67 */                        ClassLoader classLoader = O1I1lilOlO0I.class.getClassLoader();
/* 80 */                        Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
/* 88 */                        while (systemResources.hasMoreElements()) {
/* 96 */                            linkedHashSet.add(systemResources.nextElement());
                                }
                            } catch (IOException e) {
/* 102 */                       Oi01Io.I00000oOI("Error getting resources from path", e);
                            }
/* 105 */                   I0001Ioi1lo(linkedHashSet);
                        } else {
/* 22 */                    I0000O = (OI1IIoll) arrayListI00000oIO.get(0);
/* 26 */                    I0000O.getClass();
/* 31 */                    I0000O.getClass();
/* 34 */                    I00000oIO = 3;
/* 36 */                    I0000oI00(arrayListI00000oIO);
                        }
/* 108 */               I0000O();
/* 113 */               if (I00000oIO == 3) {
                            try {
                                switch (I0000O.I00000oIO) {
                                    case 0:
/* 133 */                               boolean z = false;
/* 134 */                               for (String str : I0000oI00) {
/* 142 */                                   if ("2.0.99".startsWith(str)) {
/* 144 */                                       z = true;
                                            }
                                        }
/* 148 */                               if (z) {
/* 200 */                                   return;
                                        }
/* 185 */                               Oi01Io.I0000O("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(I0000oI00).toString());
/* 190 */                               Oi01Io.I0000O("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
/* 200 */                               return;
                                    default:
/* 127 */                               throw new UnsupportedOperationException();
                                }
                            } catch (Throwable th) {
/* 197 */                       Oi01Io.I00000oOI("Unexpected problem occurred during version sanity check", th);
                            }
                        }
                    } catch (Exception e2) {
/* 203 */               I00000oIO = 2;
/* 207 */               Oi01Io.I00000oOI("Failed to instantiate SLF4J LoggerFactory", e2);
/* 212 */               IoOOl0iOl1io.I000l1("Unexpected initialization failure", e2);
                    }
                }

                public static void I0000O() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             OI1IIoll oI1IIoll = I00000oOI;
                    synchronized (oI1IIoll) {
                        try {
/* 9 */                     ((OliOIoi1Iiol) oI1IIoll.I00000oOI).I00iOIl = true;
/* 13 */                    OliOIoi1Iiol oliOIoi1Iiol = (OliOIoi1Iiol) oI1IIoll.I00000oOI;
/* 15 */                    oliOIoi1Iiol.getClass();
/* 29 */                    Iterator it = new ArrayList(oliOIoi1Iiol.I00iiI.values()).iterator();
/* 37 */                    while (it.hasNext()) {
/* 43 */                        OliOIoIO1iol oliOIoIO1iol = (OliOIoIO1iol) it.next();
/* 51 */                        oliOIoIO1iol.I00iiI = I00000oOI(oliOIoIO1iol.I00iOIl);
                            }
                        } catch (Throwable th) {
/* 541 */                   throw th;
                        }
                    }
/* 64 */            LinkedBlockingQueue linkedBlockingQueue = ((OliOIoi1Iiol) I00000oOI.I00000oOI).I00iiO;
/* 66 */            int size = linkedBlockingQueue.size();
/* 74 */            ArrayList arrayList = new ArrayList(Barcode.FORMAT_ITF);
/* 77 */            int i = 0;
/* 82 */            while (linkedBlockingQueue.drainTo(arrayList, Barcode.FORMAT_ITF) != 0) {
/* 101 */               Iterator it2 = arrayList.iterator();
/* 109 */               while (it2.hasNext()) {
/* 115 */                   OliOO0Oo1 oliOO0Oo1 = (OliOO0Oo1) it2.next();
/* 117 */                   if (oliOO0Oo1 != null) {
/* 120 */                       OliOIoIO1iol oliOIoIO1iol2 = oliOO0Oo1.I0000Il00O;
/* 122 */                       String str = oliOIoIO1iol2.I00iOIl;
/* 126 */                       if (oliOIoIO1iol2.I00iiI == null) {
/* 254 */                           I000II.I001IO000("Delegate logger cannot be null at this state.");
/* 257 */                           return;
                                } else if (!(oliOIoIO1iol2.I00iiI instanceof OI1IIO)) {
/* 139 */                           if (!oliOIoIO1iol2.I001IIilI0O()) {
/* 167 */                               Oi01Io.I0000O(str);
                                    } else if (oliOIoIO1iol2.I00100l0(oliOO0Oo1.I00000oIO) && oliOIoIO1iol2.I001IIilI0O()) {
                                        try {
/* 163 */                                   oliOIoIO1iol2.I00iio.invoke(oliOIoIO1iol2.I00iiI, oliOO0Oo1);
                                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                        }
                                    }
                                }
                            }
/* 170 */                   int i2 = i + 1;
/* 172 */                   if (i == 0) {
/* 180 */                       if (oliOO0Oo1.I0000Il00O.I001IIilI0O()) {
/* 201 */                           Oi01Io.I0000O("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
/* 206 */                           Oi01Io.I0000O("now being replayed. These are subject to the filtering rules of the underlying logging system.");
/* 211 */                           Oi01Io.I0000O("See also https://www.slf4j.org/codes.html#replay");
                                } else if (!(oliOO0Oo1.I0000Il00O.I00iiI instanceof OI1IIO)) {
/* 226 */                           Oi01Io.I0000O("The following set of substitute loggers may have been accessed");
/* 231 */                           Oi01Io.I0000O("during the initialization phase. Logging calls during this");
/* 236 */                           Oi01Io.I0000O("phase were not honored. However, subsequent logging calls to these");
/* 241 */                           Oi01Io.I0000O("loggers will work as normally expected.");
/* 246 */                           Oi01Io.I0000O("See also https://www.slf4j.org/codes.html#substituteLogger");
                                }
                            }
/* 249 */                   i = i2;
                        }
/* 258 */               arrayList.clear();
                    }
/* 88 */            OliOIoi1Iiol oliOIoi1Iiol2 = (OliOIoi1Iiol) I00000oOI.I00000oOI;
/* 92 */            oliOIoi1Iiol2.I00iiI.clear();
/* 97 */            oliOIoi1Iiol2.I00iiO.clear();
                }

                public static void I0000oI00(ArrayList arrayList) {
/* 5 */             if (arrayList.isEmpty()) {
/* 128 */               I000II.I001IO000("No providers were found which is impossible after successful initialization.");
/* 186 */               return;
                    }
/* 15 */            if (arrayList.size() > 1) {
/* 34 */                String str = "Actual provider is of type [" + arrayList.get(0) + "]";
/* 38 */                int i = Oi01Io.I00000oIO;
/* 51 */                if (IIlIOloOOO.I001lIiIIo1O(2) >= IIlIOloOOO.I001lIiIIo1O(Oi01Io.I00000oOI)) {
/* 63 */                    Oi01Io.I0000Il00O().println("SLF4J(I): ".concat(str));
/* 66 */                    return;
                        }
/* 66 */                return;
                    }
/* 94 */            String str2 = "Connected with provider of type [" + ((OI1IIoll) arrayList.get(0)).getClass().getName() + "]";
/* 98 */            int i2 = Oi01Io.I00000oIO;
/* 110 */           if (IIlIOloOOO.I001lIiIIo1O(1) >= IIlIOloOOO.I001lIiIIo1O(Oi01Io.I00000oOI)) {
/* 122 */               Oi01Io.I0000Il00O().println("SLF4J(D): ".concat(str2));
                    }
                }

                public static void I0001Ioi1lo(LinkedHashSet linkedHashSet) {
/* 5 */             if (linkedHashSet.isEmpty()) {
/* 7 */                 return;
                    }
/* 10 */            Oi01Io.I0000O("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
/* 13 */            Iterator it = linkedHashSet.iterator();
/* 21 */            while (it.hasNext()) {
/* 48 */                Oi01Io.I0000O("Ignoring binding found at [" + ((URL) it.next()) + "]");
                    }
/* 54 */            Oi01Io.I0000O("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
                }

                public static void I000II(ArrayList arrayList) {
/* 6 */             if (arrayList.size() > 1) {
/* 10 */                Oi01Io.I0000O("Class path contains multiple SLF4J providers.");
/* 13 */                Iterator it = arrayList.iterator();
/* 21 */                while (it.hasNext()) {
/* 48 */                    Oi01Io.I0000O("Found provider [" + ((OI1IIoll) it.next()) + "]");
                        }
/* 54 */                Oi01Io.I0000O("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
                    }
                }
            }
