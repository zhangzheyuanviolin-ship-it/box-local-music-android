            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.content.pm.ServiceInfo;
            import android.content.res.Resources;
            import android.content.res.TypedArray;
            import android.os.Bundle;
            import android.os.IInterface;
            import android.text.method.KeyListener;
            import android.text.method.NumberKeyListener;
            import android.util.AttributeSet;
            import android.util.Base64;
            import android.util.Log;
            import android.view.Surface;
            import android.view.View;
            import android.view.animation.Animation;
            import android.view.autofill.AutofillManager;
            import android.view.inputmethod.EditorInfo;
            import android.view.inputmethod.InputConnection;
            import android.widget.EditText;
            import com.google.android.datatransport.cct.CctBackendFactory;
            import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.net.HttpURLConnection;
            import java.net.URL;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.EnumMap;
            import java.util.EnumSet;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            import java.util.TreeSet;
            import java.util.UUID;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.ConcurrentSkipListMap;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.locks.ReentrantReadWriteLock;
            import kotlin.jvm.functions.Function1;
            
/* 4 */     public final class IIlio101Io implements I1OlOl11O0, IOIiIio, OOooio11i00, OlilI1O, Illo1O0O10l {
                public static final Object I00iio = new Object();
                public static i01I000O00 I00ilI0I1;
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IIlio101Io(EditText editText) {
/* 2 */             this.I00iOIl = 4;
/* 7 */             this.I00iiI = editText;
/* 13 */            IIloOI iIloOI = new IIloOI(13);
/* 20 */            IIlio101Io iIlio101Io = new IIlio101Io(11);
/* 23 */            iIlio101Io.I00iiI = editText;
/* 27 */            IiooolIIo1Il iiooolIIo1Il = new IiooolIIo1Il();
/* 30 */            iiooolIIo1Il.I00iOIl = editText;
/* 33 */            iiooolIIo1Il.I00iiO = true;
/* 35 */            VarHandle.storeStoreFence();
/* 38 */            iIlio101Io.I00iiO = iiooolIIo1Il;
/* 40 */            editText.addTextChangedListener(iiooolIIo1Il);
/* 45 */            if (Iioo1iIIIO0O.I00000oOI == null) {
                        synchronized (Iioo1iIIIO0O.I00000oIO) {
                            try {
/* 52 */                        if (Iioo1iIIIO0O.I00000oOI == null) {
/* 56 */                            Iioo1iIIIO0O iioo1iIIIO0O = new Iioo1iIIIO0O();
                                    try {
/* 72 */                                Iioo1iIIIO0O.I0000Il00O = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, Iioo1iIIIO0O.class.getClassLoader());
                                    } catch (Throwable unused) {
                                    }
/* 74 */                            Iioo1iIIIO0O.I00000oOI = iioo1iIIIO0O;
                                }
                            } finally {
                            }
                        }
                    }
/* 85 */            editText.setEditableFactory(Iioo1iIIIO0O.I00000oOI);
/* 88 */            VarHandle.storeStoreFence();
/* 91 */            iIloOI.I00iiI = iIlio101Io;
/* 93 */            VarHandle.storeStoreFence();
/* 96 */            this.I00iiO = iIloOI;
                }

                public static o0IiOl I00IoIO0lI(Context context, Intent intent, boolean z) {
                    i01I000O00 i01i000o00;
/* 4 */             Log.isLoggable("FirebaseMessaging", 3);
                    synchronized (I00iio) {
                        try {
/* 10 */                    i01i000o00 = I00ilI0I1;
/* 12 */                    if (i01i000o00 == null) {
/* 16 */                        i01i000o00 = new i01I000O00(context);
/* 19 */                        I00ilI0I1 = i01i000o00;
                            }
                        } finally {
                        }
                    }
/* 26 */            if (!z) {
/* 117 */               return i01i000o00.I00000oOI(intent).I000iOII(new I1Ii1lIoOI(1), new IioIoO10iOiI(8));
                    }
/* 36 */            if (OillOo0.I000iOII().I000o00OoI0I(context)) {
                        synchronized (iO1O101oi.I00000oIO) {
                            try {
/* 41 */                        iO1O101oi.I00000oIO(context);
/* 47 */                        boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
/* 53 */                        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
/* 56 */                        if (!booleanExtra) {
/* 60 */                            iO1O101oi.I00000oOI.I00000oIO();
                                }
/* 66 */                        o0IiOl o0iiolI00000oOI = i01i000o00.I00000oOI(intent);
/* 73 */                        Olio1i0OI00i olio1i0OI00i = new Olio1i0OI00i(4);
/* 76 */                        olio1i0OI00i.I00iiI = intent;
/* 78 */                        VarHandle.storeStoreFence();
/* 81 */                        o0iiolI00000oOI.I000OiO(olio1i0OI00i);
                            } finally {
                            }
                        }
                    } else {
/* 88 */                i01i000o00.I00000oOI(intent);
                    }
/* 96 */            return lOio0o.I0000oI00(-1);
                }

                public static String I00O10llo(Class cls) {
/* 1 */             int modifiers = cls.getModifiers();
/* 9 */             if (Modifier.isInterface(modifiers)) {
/* 17 */                return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
                    }
/* 26 */            if (!Modifier.isAbstract(modifiers)) {
/* 63 */                return null;
                    }
/* 58 */            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
                }

                public static OoOI1i1i I00ll1(List list) {
                    return list.isEmpty() ? OoOI1i1i.I00iiO : new OoOI1i1i(list);
                }

                public static boolean I00o0iI0io1(String str, File file, Function1 function1) {
/* 2 */             String str2 = str;
/* 5 */             for (int i = 0; i < 5; i++) {
                        try {
/* 16 */                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
/* 20 */                    httpURLConnection.setConnectTimeout(20000);
/* 26 */                    httpURLConnection.setReadTimeout(60000);
/* 29 */                    httpURLConnection.setInstanceFollowRedirects(false);
/* 36 */                    httpURLConnection.setRequestProperty("User-Agent", "Box-App/1.0");
/* 39 */                    httpURLConnection.connect();
/* 42 */                    int responseCode = httpURLConnection.getResponseCode();
/* 48 */                    if (300 > responseCode || responseCode >= 400) {
/* 118 */                       long contentLengthLong = httpURLConnection.getContentLengthLong();
/* 126 */                       if (contentLengthLong < 1) {
/* 128 */                           contentLengthLong = 1;
                                }
/* 129 */                       InputStream inputStream = httpURLConnection.getInputStream();
                                try {
/* 135 */                           FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
/* 140 */                               byte[] bArr = new byte[65536];
/* 142 */                               long j = 0;
                                        while (true) {
/* 144 */                                   int i2 = inputStream.read(bArr);
/* 149 */                                   if (i2 == -1) {
/* 169 */                                       fileOutputStream.close();
/* 172 */                                       inputStream.close();
/* 176 */                                       httpURLConnection.disconnect();
/* 175 */                                       return true;
                                            }
/* 151 */                                   fileOutputStream.write(bArr, 0, i2);
/* 155 */                                   j += i2;
/* 163 */                                   function1.invoke(Float.valueOf(j / contentLengthLong));
                                        }
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
/* 56 */                        String headerField = httpURLConnection.getHeaderField("Location");
/* 60 */                        if (headerField == null) {
                                    break;
                                }
/* 64 */                        httpURLConnection.disconnect();
/* 73 */                        if (OlOolloIIOl0.I000l1(headerField, "/", false)) {
/* 77 */                            URL url = new URL(str2);
/* 107 */                           str2 = url.getProtocol() + "://" + url.getHost() + headerField;
                                } else {
/* 114 */                           str2 = headerField;
                                }
                            }
                        } catch (Throwable th) {
/* 202 */                   Log.e("DiarizationEngine", "Download failed: ".concat(str), th);
                            try {
/* 205 */                       file.delete();
                            } catch (Throwable unused) {
                            }
                        }
                    }
/* 1 */             return false;
                }

                @Override
                public boolean I00000oIO(OoOOlO11iOi ooOOlO11iOi, OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I001IIilI0O(ooOOlO11iOi, ooOIi1lliil);
                }

                @Override
                public int I00000oOI(O0iIo0i1 o0iIo0i1) {
/* 1 */             return ii00il1.I00000oOI(o0iIo0i1);
                }

                @Override
                public boolean I0000Il00O(IO0OlIoI1oI iO0OlIoI1oI) {
/* 1 */             return iO0OlIoI1oI instanceof IO0O1IiIooO;
                }

                @Override
                public O0i1lI0o1io I0000O() {
/* 20 */            throw new UnsupportedOperationException("Not supported");
                }

                @Override
                public Oi1iIiI1 I0000oI00(Oi1iIiI1 oi1iIiI1) {
/* 2 */             return ii00il1.I00Oio(oi1iIiI1, false);
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
/* 16 */            ((IOo1llI) this.I00iiI).accept(I1lIoo.I00000oIO(0, (Surface) this.I00iiO));
                }

                @Override
                public Oi1iIiI1 I000II(IlOIioiOooOO ilOIioiOooOO) {
/* 1 */             return ii00il1.I00OOll1(ilOIioiOooOO);
                }

                @Override
                public Oi1iIiI1 I000O01llI0(IlOIioiOooOO ilOIioiOooOO) {
/* 1 */             return ii00il1.I00IoIO0lI(ilOIioiOooOO);
                }

                @Override
                public boolean I000OOo1O(Oi1iIiI1 oi1iIiI1) {
/* 1 */             return ii00il1.I001lIiIIo1O(oi1iIiI1);
                }

                @Override
                public boolean I000OiO(OoOI1Ooo1 ooOI1Ooo1) {
/* 1 */             return ii00il1.I00IlilI0i0i(ooOI1Ooo1);
                }

                @Override
                public int I000iOII(OoOI11 ooOI11) {
/* 3 */             if (ooOI11 instanceof Oi1iIiI1) {
/* 7 */                 return ii00il1.I00000oOI((O0iIo0i1) ooOI11);
                    }
/* 14 */            if (ooOI11 instanceof I1IiIo) {
/* 18 */                return ((I1IiIo) ooOI11).size();
                    }
/* 27 */            StringBuilder sb = new StringBuilder("unknown type argument list type: ");
/* 30 */            sb.append(ooOI11);
/* 43 */            OIiilo1Ool0o.I0001Ioi1lo(OOoOl0i.I00000oIO.I00000oOI(ooOI11.getClass()), sb);
/* 46 */            return 0;
                }

                @Override
                public OoOioOO1 I000l1(OoOI1Ooo1 ooOI1Ooo1) {
/* 1 */             return ii00il1.I0010o(ooOI1Ooo1);
                }

                @Override
                public void I000lI(O0iIo0i1 o0iIo0i1) {
/* 1 */             ii00il1.I0001Ioi1lo(o0iIo0i1);
                }

                @Override
                public O0iIo0i1 I000o00OoI0I(OoOI1Ooo1 ooOI1Ooo1) {
/* 1 */             return ii00il1.I00100o1O0lo(this, ooOI1Ooo1);
                }

                @Override
                public boolean I000oI1ioi(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I00II0Ol1O0l(ooOIi1lliil);
                }

                @Override
                public IO0Oio I00100l0(IO0OlIoI1oI iO0OlIoI1oI) {
/* 1 */             return ii00il1.I00OIl(iO0OlIoI1oI);
                }

                @Override
                public boolean I00100o1O0lo(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I001i1lo1io(ooOIi1lliil);
                }

                @Override
                public boolean I0010I0i(Oi1iIiI1 oi1iIiI1) {
                    return ii00il1.I00IO1(I00i01iIIliI(oi1iIiI1)) && !ii00il1.I00IO1oi11O(oi1iIiI1);
                }

                @Override
                public boolean I0010o(Oi1iIiI1 oi1iIiI1) {
/* 5 */             return ii00il1.I001i1lo1io(ii00il1.I00OIo(oi1iIiI1));
                }

                @Override
                public boolean I00111O(Ooioo0o1l0 ooioo0o1l0) {
                    return ii00il1.I00II0oii1o(I001i1O0Ol(ooioo0o1l0)) != ii00il1.I00II0oii1o(I00Iooi00oi(ooioo0o1l0));
                }

                @Override
                public OoOI1Ooo1 I001IIilI0O(Oi1iIiI1 oi1iIiI1, int i) {
/* 1 */             if (i < 0 || i >= ii00il1.I00000oOI(oi1iIiI1)) {
/* 14 */                return null;
                    }
/* 9 */             return ii00il1.I000l1(oi1iIiI1, i);
                }

                @Override
                public OoOioOO1 I001IO000(OoOOlO11iOi ooOOlO11iOi) {
/* 1 */             return ii00il1.I00111O(ooOOlO11iOi);
                }

                @Override
                public Oi1iIiI1 I001i1O0Ol(O0iIo0i1 o0iIo0i1) {
                    Ol0O0iI0l0O ol0O0iI0l0OI00IoIO0lI;
/* 1 */             IlOIOIi00io ilOIOIi00ioI0001Ioi1lo = ii00il1.I0001Ioi1lo(o0iIo0i1);
                    return (ilOIOIi00ioI0001Ioi1lo == null || (ol0O0iI0l0OI00IoIO0lI = ii00il1.I00IoIO0lI(ilOIOIi00ioI0001Ioi1lo)) == null) ? ii00il1.I000II(o0iIo0i1) : ol0O0iI0l0OI00IoIO0lI;
                }

                @Override
                public O0iIo0i1 I001i1lo1io(IO0OlIoI1oI iO0OlIoI1oI) {
/* 1 */             return ii00il1.I00IoO0(iO0OlIoI1oI);
                }

                @Override
                public Collection I001iOo1i0O(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I00OIO1(ooOIi1lliil);
                }

                @Override
                public boolean I001l0I00(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I001l0I00(ooOIi1lliil);
                }

                @Override
                public void I001lIiIIo1O(IInterface iInterface, OOoolO01Ioo oOoolO01Ioo) {
/* 7 */             String str = (String) this.I00iiI;
/* 11 */            IliliOOliOi ililiOOliOi = (IliliOOliOi) this.I00iiO;
/* 13 */            OIoloo oIoloo = new OIoloo();
/* 16 */            oIoloo.I00iOIl = str;
/* 18 */            oIoloo.I00iiI = ililiOOliOi;
/* 24 */            ((IoOlo00) iInterface).I001lloI(oOoolO01Ioo, l1oOOloO0.I00000oIO(oIoloo));
                }

                @Override
                public OoOIi1lliil I001lllioOl(Oi1iIiI1 oi1iIiI1) {
/* 1 */             return ii00il1.I00OIo(oi1iIiI1);
                }

                @Override
                public IO0Io01l1 I001lloI(IO0OlIoI1oI iO0OlIoI1oI) {
/* 1 */             return ii00il1.I000OiO(iO0OlIoI1oI);
                }

                @Override
                public boolean I00II0Ol1O0l(O0iIo0i1 o0iIo0i1) {
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0OI000II = ii00il1.I000II(o0iIo0i1);
                    return (ol0O0iI0l0OI000II != null ? ii00il1.I0000oI00(ol0O0iI0l0OI000II) : null) != null;
                }

                @Override
                public void I00II0oii1o(Throwable th) {
/* 17 */            lII1OI11o1I.I0000oI00("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof Oll01O);
/* 33 */            ((IOo1llI) this.I00iiI).accept(I1lIoo.I00000oIO(1, (Surface) this.I00iiO));
                }

                @Override
                public Ol0O0iI0l0O I00IO1(O0iIl1 o0iIl1) {
/* 1 */             return ii00il1.I000II(o0iIl1);
                }

                @Override
                public boolean I00IO1oi11O(Oi1iIiI1 oi1iIiI1) {
                    return ii00il1.I0000oI00(oi1iIiI1) != null;
                }

                @Override
                public int I00IOO() {
/* 3 */             Object[] objArr = (Object[]) this.I00iiO;
/* 5 */             if (objArr != null) {
/* 7 */                 return objArr.length;
                    }
/* 9 */             return 0;
                }

                @Override
                public boolean I00IioO0OiOi(Oi1iIiI1 oi1iIiI1) {
/* 5 */             return ii00il1.I001lloI(ii00il1.I00OIo(oi1iIiI1));
                }

                @Override
                public lOoiI0 I00IlilI0i0i(Oi1iIiI1 oi1iIiI1) {
/* 1 */             return ii00il1.I00OI1(this, oi1iIiI1);
                }

                @Override
                public Collection I00Io1lO(Oi1iIiI1 oi1iIiI1) {
/* 1 */             return ii00il1.I00O0i0ii(this, oi1iIiI1);
                }

                @Override
                public O0iIo0i1 I00Io1o110i(O0iIo0i1 o0iIo0i1) {
/* 1 */             return ii00il1.I00IoiI(o0iIo0i1);
                }

                @Override
                public void I00IoO0(Oi1iIiI1 oi1iIiI1) {
/* 1 */             ii00il1.I00Io1lO(oi1iIiI1);
                }

                @Override
                public int I00IoiI(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I00Iooi00oi(ooOIi1lliil);
                }

                @Override
                public Oi1iIiI1 I00Iooi00oi(O0iIo0i1 o0iIo0i1) {
                    Ol0O0iI0l0O ol0O0iI0l0OI00OOll1;
/* 1 */             IlOIOIi00io ilOIOIi00ioI0001Ioi1lo = ii00il1.I0001Ioi1lo(o0iIo0i1);
                    return (ilOIOIi00ioI0001Ioi1lo == null || (ol0O0iI0l0OI00OOll1 = ii00il1.I00OOll1(ilOIOIi00ioI0001Ioi1lo)) == null) ? ii00il1.I000II(o0iIo0i1) : ol0O0iI0l0OI00OOll1;
                }

                @Override
                public IO0OlIoI1oI I00O0i0ii(Ol0O1I ol0O1I) {
/* 1 */             return ii00il1.I0000O(this, ol0O1I);
                }

                public boolean I00O0o1oo() {
                    synchronized (this) {
/* 10 */                if (((AtomicBoolean) this.I00iiO).get()) {
/* 13 */                    return false;
                        }
/* 19 */                ((AtomicInteger) this.I00iiI).incrementAndGet();
/* 23 */                return true;
                    }
                }

                @Override
                public O0iIo0i1 I00OI1(ArrayList arrayList) {
/* 1 */             return l00IlO1iolO.I00000oIO(arrayList);
                }

                @Override
                public OoOI1Ooo1 I00OIO1(O0iIo0i1 o0iIo0i1) {
/* 1 */             return ii00il1.I000O01llI0(o0iIo0i1);
                }

                @Override
                public OoOI1Ooo1 I00OIl(IO0Oio iO0Oio) {
/* 1 */             return ii00il1.I00O0o1oo(iO0Oio);
                }

                @Override
                public boolean I00OIo(Oi1iIiI1 oi1iIiI1, Oi1iIiI1 oi1iIiI12) {
/* 1 */             return ii00il1.I001IO000(oi1iIiI1, oi1iIiI12);
                }

                @Override
                public String I00OOll1() {
/* 3 */             return (String) this.I00iiI;
                }

                @Override
                public OoOOlO11iOi I00OilO00Il(OoOIi1lliil ooOIi1lliil, int i) {
/* 1 */             return ii00il1.I000o00OoI0I(ooOIi1lliil, i);
                }

                @Override
                public boolean I00Oio(OoOIi1lliil ooOIi1lliil, OoOIi1lliil ooOIi1lliil2) {
/* 6 */             if (!(ooOIi1lliil instanceof OoOIOoO1I)) {
/* 76 */                I000II.I000iOII("Failed requirement.");
/* 3 */                 return false;
                    }
/* 10 */            if (!(ooOIi1lliil2 instanceof OoOIOoO1I)) {
/* 72 */                I000II.I000iOII("Failed requirement.");
/* 3 */                 return false;
                    }
/* 16 */            if (ii00il1.I00000oIO(ooOIi1lliil, ooOIi1lliil2)) {
/* 70 */                return true;
                    }
/* 18 */            OoOIOoO1I ooOIOoO1I = (OoOIOoO1I) ooOIi1lliil;
/* 20 */            OoOIOoO1I ooOIOoO1I2 = (OoOIOoO1I) ooOIi1lliil2;
/* 24 */            Map map = (Map) this.I00iiI;
/* 34 */            if (((O0iIllo) this.I00iiO).I000II(ooOIOoO1I, ooOIOoO1I2)) {
/* 70 */                return true;
                    }
/* 37 */            if (map != null) {
/* 44 */                OoOIOoO1I ooOIOoO1I3 = (OoOIOoO1I) map.get(ooOIOoO1I);
/* 50 */                OoOIOoO1I ooOIOoO1I4 = (OoOIOoO1I) map.get(ooOIOoO1I2);
/* 52 */                if (ooOIOoO1I3 != null && ooOIOoO1I3.equals(ooOIOoO1I2)) {
/* 70 */                    return true;
                        }
/* 60 */                if (ooOIOoO1I4 != null && ooOIOoO1I4.equals(ooOIOoO1I)) {
/* 70 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override
                public boolean I00Ol00(Oi1iIiI1 oi1iIiI1) {
/* 1 */             Ol0O0iI0l0O ol0O0iI0l0OI000II = ii00il1.I000II(oi1iIiI1);
                    return (ol0O0iI0l0OI000II != null ? I00iIO(ol0O0iI0l0OI000II) : null) != null;
                }

                @Override
                public boolean I00Ol10(O0iIo0i1 o0iIo0i1) {
/* 1 */             return o0iIo0i1 instanceof OIO0IOO;
                }

                @Override
                public void I00Ol1ll1(Oi1iIiI1 oi1iIiI1) {
/* 1 */             ii00il1.I00Io1o110i(oi1iIiI1);
                }

                @Override
                public IlOIioiOooOO I00OloOo(O0iIo0i1 o0iIo0i1) {
/* 1 */             return ii00il1.I0001Ioi1lo(o0iIo0i1);
                }

                @Override
                public OoOIi1lliil I00i01iIIliI(O0iIo0i1 o0iIo0i1) {
/* 1 */             Oi1iIiI1 oi1iIiI1I000II = ii00il1.I000II(o0iIo0i1);
/* 5 */             if (oi1iIiI1I000II == null) {
/* 7 */                 oi1iIiI1I000II = I001i1O0Ol(o0iIo0i1);
                    }
/* 11 */            return ii00il1.I00OIo(oi1iIiI1I000II);
                }

                @Override
                public boolean I00i0O(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I001lloI(ooOIi1lliil);
                }

                @Override
                public Oi1iIiI1 I00i0ilIl0i(Oi1iIiI1 oi1iIiI1) {
/* 1 */             IO0Io01l1 iO0Io01l1 = IO0Io01l1.I00iOIl;
/* 3 */             return ii00il1.I000OOo1O(oi1iIiI1);
                }

                @Override
                public Oi1iIiI1 I00i0oil(O0iIo0i1 o0iIo0i1) {
/* 1 */             return ii00il1.I000II(o0iIo0i1);
                }

                @Override
                public IO0OlIoI1oI I00iIO(Oi1iIiI1 oi1iIiI1) {
                    Ol0O1I ol0O1I;
/* 1 */             IiIiOIi0 iiIiOIi0I0000oI00 = ii00il1.I0000oI00(oi1iIiI1);
/* 5 */             if (iiIiOIi0I0000oI00 == null || (ol0O1I = iiIiOIi0I0000oI00.I00iiI) == null) {
/* 12 */                ol0O1I = (Ol0O1I) oi1iIiI1;
                    }
/* 14 */            return ii00il1.I0000O(this, ol0O1I);
                }

                @Override
                public boolean I00iIi0i1o(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I001i1O0Ol(ooOIi1lliil);
                }

                @Override
                public void I00iOIl(Olil1OioO olil1OioO) {
/* 5 */             lOIOiI11oo.I00000oIO(olil1OioO, (Object[]) this.I00iiO);
                }

                @Override
                public boolean I00iiI(IO0OlIoI1oI iO0OlIoI1oI) {
/* 1 */             return ii00il1.I00IioO0OiOi(iO0OlIoI1oI);
                }

                @Override
                public boolean I00iiO(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I00IO1(ooOIi1lliil);
                }

                @Override
                public OoOI1Ooo1 I00iio(OoOI11 ooOI11, int i) {
/* 3 */             if (ooOI11 instanceof Ol0O1I) {
/* 7 */                 return ii00il1.I000l1((O0iIo0i1) ooOI11, i);
                    }
/* 14 */            if (ooOI11 instanceof I1IiIo) {
/* 22 */                return (OoOI1Ooo1) ((I1IiIo) ooOI11).get(i);
                    }
/* 29 */            StringBuilder sb = new StringBuilder("unknown type argument list type: ");
/* 32 */            sb.append(ooOI11);
/* 45 */            OIiilo1Ool0o.I0001Ioi1lo(OOoOl0i.I00000oIO.I00000oOI(ooOI11.getClass()), sb);
/* 48 */            return null;
                }

                @Override
                public boolean I00ilI0I1(OoOIi1lliil ooOIi1lliil) {
/* 1 */             return ii00il1.I001iOo1i0O(ooOIi1lliil);
                }

                @Override
                public OoOI1Ooo1 I00ilO0(O0iIo0i1 o0iIo0i1, int i) {
/* 1 */             return ii00il1.I000l1(o0iIo0i1, i);
                }

                @Override
                public boolean I00io1l(O0iIo0i1 o0iIo0i1) {
/* 21 */            return !O0000Ioio00.I0000O(ii00il1.I00OIo(I001i1O0Ol(o0iIo0i1)), ii00il1.I00OIo(I00Iooi00oi(o0iIo0i1)));
                }

                @Override
                public boolean I00ioIO(O0iIo0i1 o0iIo0i1) {
/* 1 */             return ii00il1.I00II0oii1o(o0iIo0i1);
                }

                @Override
                public OoOI11 I00l0I0l0lO1(Oi1iIiI1 oi1iIiI1) {
/* 1 */             return ii00il1.I0000Il00O(oi1iIiI1);
                }

                @Override
                public Ooioo0o1l0 I00l0OO0IO(Ol0O1I ol0O1I, Ol0O1I ol0O1I2) {
/* 1 */             return ii00il1.I000iOII(this, ol0O1I, ol0O1I2);
                }

                @Override
                public O0iIo0i1 I00li1OI(O0iIo0i1 o0iIo0i1) {
/* 1 */             return ii00il1.I00OilO00Il(this, o0iIo0i1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00e2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public I111ooiO0 I00lli11(OOOi000ooO oOOi000ooO, OI1IlOlol oI1IlOlol) {
                    Map mapI000OiO;
                    IOIO10lo iOIO10lo;
/* 15 */            OI000ilOol oI000ilOolI0000Il00O = ilOOOOloO.I0000Il00O((OI0010oo1o) this.I00iiI, l1iI1lOO.I00000oIO(oI1IlOlol, oOOi000ooO.I00iiO), (o01l1ioOo0) this.I00iiO);
/* 25 */            if (oOOi000ooO.I00iio.size() == 0 || Il0ooiloI.I0000oI00(oI000ilOolI0000Il00O)) {
/* 227 */               mapI000OiO = Il011I1OiO0I.I00iOIl;
                    } else {
/* 33 */                int i = IiOiIO0i1Oil.I00000oIO;
/* 41 */                if (IiOiIO0i1Oil.I000l1(oI000ilOolI0000Il00O, IOIOllO1oli.I00ilI0I1) && (iOIO10lo = (IOIO10lo) IOOi0Ool1i.I00Oio(oI000ilOolI0000Il00O.I000II())) != null) {
/* 57 */                    List listI00Iooi00oi = iOIO10lo.I00Iooi00oi();
/* 69 */                    int iI00000oIO = O1Oii0o0Oi.I00000oIO(IOOi1I.I0000O(listI00Iooi00oi, 10));
/* 75 */                    if (iI00000oIO < 16) {
/* 77 */                        iI00000oIO = 16;
                            }
/* 80 */                    LinkedHashMap linkedHashMap = new LinkedHashMap(iI00000oIO);
/* 91 */                    for (Object obj : listI00Iooi00oi) {
/* 104 */                       linkedHashMap.put(((Ooo00oi0O) obj).getName(), obj);
                            }
/* 108 */                   List<OOOOlOoi0> list = oOOi000ooO.I00iio;
/* 114 */                   ArrayList arrayList = new ArrayList();
/* 125 */                   for (OOOOlOoi0 oOOOlOoi0 : list) {
/* 143 */                       Ooo00oi0O ooo00oi0O = (Ooo00oi0O) linkedHashMap.get(l1iI1lOO.I00000oOI(oI1IlOlol, oOOOlOoi0.I00iiO));
/* 145 */                       OIoi0IIoi oIoi0IIoi = null;
/* 146 */                       if (ooo00oi0O != null) {
/* 153 */                           OI1Iio0ii1 oI1Iio0ii1I00000oOI = l1iI1lOO.I00000oOI(oI1IlOlol, oOOOlOoi0.I00iiO);
/* 157 */                           O0iIl1 type = ooo00oi0O.getType();
/* 161 */                           OOOOlIoIlOi oOOOlIoIlOi = oOOOlOoi0.I00iio;
/* 163 */                           IOo0i1 iOo0i1I0100i = I0100i(type, oOOOlIoIlOi, oI1IlOlol);
/* 171 */                           Il0ool10 il0ool10 = I00lll10(iOo0i1I0100i, type, oOOOlIoIlOi) ? iOo0i1I0100i : 0;
/* 174 */                           if (il0ool10 == 0) {
/* 196 */                               String str = "Unexpected argument value: actual type " + oOOOlIoIlOi.I00iiO + " != expected type " + type;
/* 204 */                               il0ool10 = new Il0ool10(OoiIlOl1iI.I00000oIO);
/* 207 */                               il0ool10.I00000oOI = str;
/* 209 */                               VarHandle.storeStoreFence();
                                    }
/* 212 */                           oIoi0IIoi = new OIoi0IIoi(oI1Iio0ii1I00000oOI, il0ool10);
                                }
/* 216 */                       if (oIoi0IIoi != null) {
/* 218 */                           arrayList.add(oIoi0IIoi);
                                }
                            }
/* 222 */                   mapI000OiO = O1Oii0O0loo.I000OiO(arrayList);
                        }
                    }
/* 237 */           return new I111ooiO0(oI000ilOolI0000Il00O.I00Ol10(), mapI000OiO, OlI1o0ooI.I00IO1);
                }

                public boolean I00lll10(IOo0i1 iOo0i1, O0iIl1 o0iIl1, OOOOlIoIlOi oOOOlIoIlOi) {
/* 3 */             OI0010oo1o oI0010oo1o = (OI0010oo1o) this.I00iiI;
/* 5 */             OOOOil0 oOOOil0 = oOOOlIoIlOi.I00iiO;
/* 17 */            int i = oOOOil0 == null ? -1 : I11I0ol0lI.I00000oIO[oOOOil0.ordinal()];
/* 22 */            if (i != 10) {
/* 26 */                if (i != 13) {
/* 32 */                    return O0000Ioio00.I0000O(iOo0i1.I00000oIO(oI0010oo1o), o0iIl1);
                        }
/* 39 */                if (iOo0i1 instanceof I1IoIo1O0) {
/* 44 */                    Object obj = ((I1IoIo1O0) iOo0i1).I00000oIO;
/* 59 */                    if (((List) obj).size() == oOOOlIoIlOi.I00li1OI.size()) {
/* 65 */                        O0iIl1 o0iIl1I000II = oI0010oo1o.I0000O().I000II(o0iIl1);
/* 69 */                        if (o0iIl1I000II != null) {
/* 75 */                            Iterable iterableI0001Ioi1lo = IOOi1I.I0001Ioi1lo((Collection) obj);
/* 81 */                            if ((iterableI0001Ioi1lo instanceof Collection) && ((Collection) iterableI0001Ioi1lo).isEmpty()) {
/* 171 */                               return true;
                                    }
/* 93 */                            Iterator it = iterableI0001Ioi1lo.iterator();
/* 102 */                           while (((IooO10lI) it).I00iiO) {
/* 107 */                               int iNextInt = ((IooIlO1) it).nextInt();
/* 132 */                               if (!I00lll10((IOo0i1) ((List) obj).get(iNextInt), o0iIl1I000II, (OOOOlIoIlOi) oOOOlIoIlOi.I00li1OI.get(iNextInt))) {
                                        }
                                    }
/* 171 */                           return true;
                                }
                            }
                        }
/* 137 */               IoOOl0iOl1io.I001lIiIIo1O("Deserialized ArrayValue should have the same number of elements as the original array value: ", iOo0i1);
/* 21 */                return false;
                    }
/* 145 */           IOIiO1lIl0l iOIiO1lIl0lI00100o1O0lo = o0iIl1.I00iOIl().I00100o1O0lo();
/* 156 */           OI000ilOol oI000ilOol = iOIiO1lIl0lI00100o1O0lo instanceof OI000ilOol ? (OI000ilOol) iOIiO1lIl0lI00100o1O0lo : null;
/* 157 */           if (oI000ilOol == null) {
/* 171 */               return true;
                    }
/* 159 */           OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 167 */           if (O0i1lI0o1io.I00000oOI(oI000ilOol, OlIllOO11lOl.I00O0i0ii)) {
/* 171 */               return true;
                    }
/* 21 */            return false;
                }

                /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OIOi0l1il I00o0l1o1o0(OoOilO ooOilO, boolean z) throws NoSuchMethodException, SecurityException {
                    IOo11IliOOl1 iOo11IliOOl1;
                    String str;
                    OIOi0l1il iO0o1O0li0;
/* 1 */             Type type = ooOilO.I00000oOI;
/* 3 */             Class cls = ooOilO.I00000oIO;
/* 7 */             Map map = (Map) this.I00iiI;
/* 13 */            IOOlIIilOl0 iOOlIIilOl0 = null;
/* 14 */            if (map.get(type) != null) {
/* 397 */               OIiilo1Ool0o.I00000oIO();
/* 13 */                return null;
                    }
/* 20 */            if (map.get(cls) != null) {
/* 393 */               OIiilo1Ool0o.I00000oIO();
/* 13 */                return null;
                    }
/* 30 */            if (EnumSet.class.isAssignableFrom(cls)) {
/* 34 */                iOo11IliOOl1 = new IOo11IliOOl1(0);
/* 37 */                iOo11IliOOl1.I00iiI = type;
/* 39 */                VarHandle.storeStoreFence();
                    } else if (cls == EnumMap.class) {
/* 49 */                iOo11IliOOl1 = new IOo11IliOOl1(1);
/* 52 */                iOo11IliOOl1.I00iiI = type;
/* 54 */                VarHandle.storeStoreFence();
                    } else {
/* 58 */                iOo11IliOOl1 = null;
                    }
/* 59 */            if (iOo11IliOOl1 != null) {
/* 61 */                return iOo11IliOOl1;
                    }
/* 66 */            lIlo0lli01.I00000oIO((List) this.I00iiO);
/* 78 */            if (Modifier.isAbstract(cls.getModifiers())) {
/* 80 */                iO0o1O0li0 = null;
                    } else {
                        try {
/* 82 */                    Constructor declaredConstructor = cls.getDeclaredConstructor(null);
/* 86 */                    lIo000I lio000i = OOoi0l1.I00000oIO;
                            try {
/* 88 */                        declaredConstructor.setAccessible(true);
/* 91 */                        str = null;
                            } catch (Exception e) {
/* 127 */                       str = "Failed making constructor '" + OOoi0l1.I00000oOI(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + OOoi0l1.I0000oI00(e);
                            }
/* 131 */                   if (str != null) {
/* 135 */                       iO0o1O0li0 = new IO0o1O0li0(str, 2);
                            } else {
/* 142 */                       I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(5);
/* 145 */                       i0IOIlIOIII.I00iiI = declaredConstructor;
/* 147 */                       VarHandle.storeStoreFence();
/* 150 */                       iO0o1O0li0 = i0IOIlIOIII;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
/* 151 */           if (iO0o1O0li0 != null) {
/* 153 */               return iO0o1O0li0;
                    }
/* 160 */           int i = 6;
/* 161 */           if (Collection.class.isAssignableFrom(cls)) {
/* 169 */               if (cls.isAssignableFrom(ArrayList.class)) {
/* 173 */                   iOOlIIilOl0 = new IOOlIIilOl0(i);
                        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
/* 190 */                   iOOlIIilOl0 = new IOOlIIilOl0(9);
                        } else if (cls.isAssignableFrom(TreeSet.class)) {
/* 207 */                   iOOlIIilOl0 = new IOOlIIilOl0(10);
                        } else if (cls.isAssignableFrom(ArrayDeque.class)) {
/* 224 */                   iOOlIIilOl0 = new IOOlIIilOl0(11);
                        }
                    } else if (Map.class.isAssignableFrom(cls)) {
/* 243 */               if (cls.isAssignableFrom(O100l1O0IiiO.class)) {
/* 247 */                   if (type instanceof ParameterizedType) {
/* 252 */                       Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
/* 257 */                       if (actualTypeArguments.length != 0 && iIllolOO.I0000oI00(actualTypeArguments[0]) == String.class) {
                                }
                            }
/* 274 */                   iOOlIIilOl0 = new IOOlIIilOl0(12);
                        } else if (cls.isAssignableFrom(LinkedHashMap.class)) {
/* 290 */                   iOOlIIilOl0 = new IOOlIIilOl0(13);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
/* 306 */                   iOOlIIilOl0 = new IOOlIIilOl0(14);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
/* 321 */                   iOOlIIilOl0 = new IOOlIIilOl0(7);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
/* 337 */                   iOOlIIilOl0 = new IOOlIIilOl0(8);
                        }
                    }
/* 340 */           if (iOOlIIilOl0 != null) {
/* 342 */               return iOOlIIilOl0;
                    }
/* 343 */           String strI00O10llo = I00O10llo(cls);
/* 347 */           if (strI00O10llo != null) {
/* 351 */               return new IO0o1O0li0(strI00O10llo, 2);
                    }
/* 355 */           if (z) {
/* 384 */               I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(i);
/* 387 */               i0IOIlIOIII2.I00iiI = cls;
/* 389 */               VarHandle.storeStoreFence();
/* 392 */               return i0IOIlIOIII2;
                    }
/* 378 */           return new IO0o1O0li0("Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.", 2);
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public CctBackendFactory I00o101lO(String str) throws PackageManager.NameNotFoundException {
                    Bundle bundle;
                    PackageManager packageManager;
/* 7 */             Map map = (Map) this.I00iiO;
/* 12 */            if (map == null) {
/* 16 */                Context context = (Context) this.I00iiI;
                        try {
/* 18 */                    packageManager = context.getPackageManager();
                        } catch (PackageManager.NameNotFoundException unused) {
/* 57 */                    Log.w("BackendRegistry", "Application info not found.");
                        }
/* 22 */                if (packageManager == null) {
/* 26 */                    Log.w("BackendRegistry", "Context has no PackageManager.");
                        } else {
/* 40 */                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), Barcode.FORMAT_ITF);
/* 44 */                    if (serviceInfo == null) {
/* 48 */                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                            } else {
/* 52 */                        bundle = serviceInfo.metaData;
/* 61 */                        if (bundle != null) {
/* 65 */                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
/* 68 */                            map = Collections.EMPTY_MAP;
                                } else {
/* 73 */                            HashMap map2 = new HashMap();
/* 88 */                            for (String str2 : bundle.keySet()) {
/* 96 */                                Object obj = bundle.get(str2);
/* 102 */                               if ((obj instanceof String) && str2.startsWith("backend:")) {
/* 123 */                                   for (String str3 : ((String) obj).split(",", -1)) {
/* 127 */                                       String strTrim = str3.trim();
/* 135 */                                       if (!strTrim.isEmpty()) {
/* 144 */                                           map2.put(strTrim, str2.substring(8));
                                                }
                                            }
                                        }
                                    }
/* 150 */                           map = map2;
                                }
/* 151 */                       this.I00iiO = map;
                            }
                        }
/* 29 */                bundle = null;
/* 61 */                if (bundle != null) {
                        }
/* 151 */               this.I00iiO = map;
                    }
/* 157 */           String str4 = (String) map.get(str);
/* 159 */           if (str4 == null) {
/* 9 */                 return null;
                    }
                    try {
/* 180 */               return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
                    } catch (ClassNotFoundException e) {
/* 266 */               Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
/* 9 */                 return null;
                    } catch (IllegalAccessException e2) {
/* 243 */               Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
/* 9 */                 return null;
                    } catch (InstantiationException e3) {
/* 224 */               Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
/* 9 */                 return null;
                    } catch (NoSuchMethodException e4) {
/* 205 */               Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
/* 9 */                 return null;
                    } catch (InvocationTargetException e5) {
/* 197 */               Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
/* 9 */                 return null;
                    }
                }

                public int I00oI0i(String str) {
                    int andIncrement;
/* 3 */             ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.I00iiI;
/* 9 */             Integer num = (Integer) concurrentHashMap.get(str);
/* 11 */            if (num != null) {
/* 13 */                return num.intValue();
                    }
                    synchronized (concurrentHashMap) {
                        try {
/* 23 */                    Integer num2 = (Integer) concurrentHashMap.get(str);
/* 25 */                    if (num2 != null) {
/* 27 */                        andIncrement = num2.intValue();
                            } else {
/* 38 */                        andIncrement = ((AtomicInteger) this.I00iiO).getAndIncrement();
/* 46 */                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                            }
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
/* 50 */            return andIncrement;
                }

                public KeyListener I00oII(KeyListener keyListener) {
/* 3 */             if (keyListener instanceof NumberKeyListener) {
/* 77 */                return keyListener;
                    }
/* 13 */            ((IIlio101Io) ((IIloOI) this.I00iiO).I00iiI).getClass();
/* 18 */            if (keyListener instanceof IiooiI111I) {
/* 20 */                return keyListener;
                    }
/* 21 */            if (keyListener == null) {
/* 23 */                return null;
                    }
/* 27 */            if (keyListener instanceof NumberKeyListener) {
/* 29 */                return keyListener;
                    }
/* 32 */            IiooiI111I iiooiI111I = new IiooiI111I();
/* 35 */            iiooiI111I.I00000oIO = keyListener;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            return iiooiI111I;
                }

                public AutofillManager I00oIiI10() {
/* 3 */             AutofillManager autofillManager = (AutofillManager) this.I00iiO;
/* 5 */             if (autofillManager != null) {
/* 55 */                return autofillManager;
                    }
/* 17 */            AutofillManager autofillManager2 = (AutofillManager) ((Context) this.I00iiI).getSystemService(AutofillManager.class);
/* 19 */            if (autofillManager2 != null) {
/* 21 */                this.I00iiO = autofillManager2;
/* 23 */                return autofillManager2;
                    }
/* 26 */            I000II.I001IO000("Could not locate AutofillManager from context");
/* 29 */            return null;
                }

                public String I00oO101o(String str) {
/* 3 */             String str2 = (String) this.I00iiO;
/* 7 */             Resources resources = (Resources) this.I00iiI;
/* 11 */            int identifier = resources.getIdentifier(str, "string", str2);
/* 15 */            if (identifier == 0) {
/* 17 */                return null;
                    }
/* 19 */            return resources.getString(identifier);
                }

                public void I00oOio10iI1(AttributeSet attributeSet, int i) {
/* 12 */            TypedArray typedArrayObtainStyledAttributes = ((EditText) this.I00iiI).getContext().obtainStyledAttributes(attributeSet, OOilOli0.I000OOo1O, i, 0);
                    try {
/* 25 */                boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
/* 32 */                typedArrayObtainStyledAttributes.recycle();
/* 35 */                I0100o111I(z);
                    } catch (Throwable th) {
/* 39 */                typedArrayObtainStyledAttributes.recycle();
/* 106 */               throw th;
                    }
                }

                public OoOIOIOOlo I00ol1() {
/* 10 */            return new OoOIOIOOlo(true, true, this, i1i0olI.I00ilI0I1, O0iIoIOO0O0.I00000oIO);
                }

                public void I00olI(View view, int i, boolean z) {
/* 5 */             I00oIiI10().notifyViewVisibilityChanged(view, i, z);
                }

                public IiooI1I10 I00oli(InputConnection inputConnection, EditorInfo editorInfo) {
                    InputConnection inputConnection2;
/* 3 */             IIloOI iIloOI = (IIloOI) this.I00iiO;
/* 5 */             if (inputConnection == null) {
/* 7 */                 iIloOI.getClass();
/* 10 */                inputConnection2 = null;
                    } else {
/* 14 */                IIlio101Io iIlio101Io = (IIlio101Io) iIloOI.I00iiI;
/* 16 */                iIlio101Io.getClass();
/* 21 */                if (!(inputConnection instanceof IiooI1I10)) {
/* 28 */                    EditText editText = (EditText) iIlio101Io.I00iiI;
/* 34 */                    O1oO0lOoI1 o1oO0lOoI1 = new O1oO0lOoI1(11);
/* 38 */                    IiooI1I10 iiooI1I10 = new IiooI1I10(inputConnection, false);
/* 41 */                    iiooI1I10.I00000oIO = editText;
/* 43 */                    iiooI1I10.I00000oOI = o1oO0lOoI1;
/* 49 */                    if (IiollO1llli.I0000O()) {
/* 55 */                        IiollO1llli.I00000oIO().I000OOo1O(editorInfo);
                            }
/* 58 */                    VarHandle.storeStoreFence();
/* 61 */                    inputConnection = iiooI1I10;
                        }
/* 62 */                inputConnection2 = inputConnection;
                    }
/* 63 */            return (IiooI1I10) inputConnection2;
                }

                public void I00oliIiO01i() {
/* 5 */             ((II1oo0l11IOI) this.I00iiI).I00000oIO();
                }

                public void I00oo1iO0ll(Bundle bundle) {
/* 3 */             II1oo0l11IOI iI1oo0l11IOI = (II1oo0l11IOI) this.I00iiI;
/* 7 */             OiIoOoIi01 oiIoOoIi01 = (OiIoOoIi01) iI1oo0l11IOI.I0000O;
/* 11 */            if (!iI1oo0l11IOI.I00000oIO) {
/* 13 */                iI1oo0l11IOI.I00000oIO();
                    }
/* 30 */            if (oiIoOoIi01.I000iOII().I00ol1().I00000oIO(O0oOi0I.I00iio)) {
/* 81 */                IoOOl0iOl1io.I001lIiIIo1O("performRestore cannot be called when owner is ", oiIoOoIi01.I000iOII().I00ol1());
/* 168 */               return;
                    }
/* 34 */            if (iI1oo0l11IOI.I00000oOI) {
/* 67 */                I000II.I001IO000("SavedStateRegistry was already restored.");
/* 70 */                return;
                    }
/* 36 */            Bundle bundle2 = null;
/* 37 */            if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
/* 47 */                Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
/* 51 */                if (bundle3 == null) {
/* 55 */                    lO0iIII0.I00000oIO("androidx.lifecycle.BundlableSavedStateRegistry.key");
/* 58 */                    throw null;
                        }
/* 53 */                bundle2 = bundle3;
                    }
/* 59 */            iI1oo0l11IOI.I000O01llI0 = bundle2;
/* 62 */            iI1oo0l11IOI.I00000oOI = true;
                }

                public void I00ooIo0(Bundle bundle) {
/* 3 */             II1oo0l11IOI iI1oo0l11IOI = (II1oo0l11IOI) this.I00iiI;
/* 14 */            Bundle bundleI00000oIO = iOiIOo1010i.I00000oIO((OIoi0IIoi[]) Arrays.copyOf(new OIoi0IIoi[0], 0));
/* 20 */            Bundle bundle2 = (Bundle) iI1oo0l11IOI.I000O01llI0;
/* 22 */            if (bundle2 != null) {
/* 24 */                bundleI00000oIO.putAll(bundle2);
                    }
                    synchronized (((lolOiIoiillI) iI1oo0l11IOI.I0001Ioi1lo)) {
/* 48 */                for (Map.Entry entry : ((LinkedHashMap) iI1oo0l11IOI.I000II).entrySet()) {
/* 72 */                    bundleI00000oIO.putBundle((String) entry.getKey(), ((OiIoOil) entry.getValue()).I00000oIO());
                        }
                    }
/* 83 */            if (bundleI00000oIO.isEmpty()) {
/* 90 */                return;
                    }
/* 87 */            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleI00000oIO);
                }

                public o0IiOl I00ooiO1I(Intent intent) {
/* 3 */             String stringExtra = intent.getStringExtra("gcm.rawData64");
/* 7 */             int i = 0;
/* 8 */             if (stringExtra != null) {
/* 16 */                intent.putExtra("rawData", Base64.decode(stringExtra, 0));
/* 19 */                intent.removeExtra("gcm.rawData64");
                    }
/* 24 */            Context context = (Context) this.I00iiI;
/* 28 */            I1Ii1lIoOI i1Ii1lIoOI = (I1Ii1lIoOI) this.I00iiO;
/* 43 */            boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
/* 51 */            boolean z2 = (intent.getFlags() & 268435456) != 0;
/* 55 */            if (z && !z2) {
/* 59 */                return I00IoIO0lI(context, intent, z2);
                    }
/* 66 */            IlII1oo ilII1oo = new IlII1oo(i);
/* 69 */            ilII1oo.I00000oOI = context;
/* 71 */            ilII1oo.I0000Il00O = intent;
/* 73 */            VarHandle.storeStoreFence();
/* 76 */            o0IiOl o0iiolI0000Il00O = lOio0o.I0000Il00O(ilII1oo, i1Ii1lIoOI);
/* 82 */            IlIII00II ilIII00II = new IlIII00II();
/* 85 */            ilIII00II.I00iOIl = context;
/* 87 */            ilIII00II.I00iiI = intent;
/* 89 */            ilIII00II.I00iiO = z2;
/* 91 */            VarHandle.storeStoreFence();
/* 94 */            return o0iiolI0000Il00O.I000l1(i1Ii1lIoOI, ilIII00II);
                }

                public int I00oooO(Oi1OOo1O oi1OOo1O) {
/* 3 */             LinkedHashMap linkedHashMap = (LinkedHashMap) this.I00iiO;
/* 5 */             String strConcat = oi1OOo1O.I00000oIO;
/* 7 */             if (strConcat == null) {
/* 14 */                String string = UUID.randomUUID().toString();
/* 18 */                linkedHashMap.put(string, oi1OOo1O);
/* 23 */                strConcat = "format:".concat(string);
                    }
/* 33 */            return ((I11110OIl) this.I00iiI).I000O01llI0(Oi1OOo1O.I00000oOI, strConcat);
                }

                public IOo0i1 I0100i(O0iIl1 o0iIl1, OOOOlIoIlOi oOOOlIoIlOi, OI1IlOlol oI1IlOlol) {
/* 9 */             boolean zBooleanValue = IlO1il.I00Iooi00oi.I0000oI00(oOOOlIoIlOi.I00lli11).booleanValue();
/* 13 */            OOOOil0 oOOOil0 = oOOOlIoIlOi.I00iiO;
                    switch (oOOOil0 == null ? -1 : I11I0ol0lI.I00000oIO[oOOOil0.ordinal()]) {
                        case 1:
/* 287 */                   byte b = (byte) oOOOlIoIlOi.I00iio;
                            return zBooleanValue ? new Ooi010II(b) : new IIOIIi1l11iO(b);
                        case 2:
/* 280 */                   return new IO1I0lIl0l(Character.valueOf((char) oOOOlIoIlOi.I00iio));
                        case 3:
/* 255 */                   short s = (short) oOOOlIoIlOi.I00iio;
                            return zBooleanValue ? new Ooi010II(s) : new Ol01Il11oii(s);
                        case 4:
/* 237 */                   int i = (int) oOOOlIoIlOi.I00iio;
                            return zBooleanValue ? new Ooi010II(i) : new IooOlil01il(i);
                        case 5:
/* 219 */                   long j = oOOOlIoIlOi.I00iio;
                            return zBooleanValue ? new Ooi010II(j) : new O1IOl11I(j);
                        case 6:
/* 215 */                   return new II11Oo0I(oOOOlIoIlOi.I00ilI0I1);
                        case 7:
/* 207 */                   return new II11Oo0I(oOOOlIoIlOi.I00ilO0);
                        case 8:
/* 199 */                   return new II11Oo0I(Boolean.valueOf(oOOOlIoIlOi.I00iio != 0));
                        case 9:
/* 178 */                   return new OlOlol0il01(oI1IlOlol.getString(oOOOlIoIlOi.I00io1l));
                        case 10:
/* 166 */                   return new O0IiIOO(l1iI1lOO.I00000oIO(oI1IlOlol, oOOOlIoIlOi.I00ioIO), oOOOlIoIlOi.I00ll1);
                        case 11:
/* 152 */                   return new Il0o0Oii0I(l1iI1lOO.I00000oIO(oI1IlOlol, oOOOlIoIlOi.I00ioIO), l1iI1lOO.I00000oOI(oI1IlOlol, oOOOlIoIlOi.I00l0I0l0lO1));
                        case 12:
/* 134 */                   return new I11IOOl1IolO(I00lli11(oOOOlIoIlOi.I00l0OO0IO, oI1IlOlol));
                        case 13:
/* 69 */                    List list = oOOOlIoIlOi.I00li1OI;
/* 81 */                    ArrayList arrayList = new ArrayList(IOOi1I.I0000O(list, 10));
/* 84 */                    Iterator it = list.iterator();
/* 92 */                    while (it.hasNext()) {
/* 116 */                       arrayList.add(I0100i(((OI0010oo1o) this.I00iiI).I0000O().I0000oI00(), (OOOOlIoIlOi) it.next(), oI1IlOlol));
                            }
/* 122 */                   return new OoOl0o110(arrayList, o0iIl1);
                        default:
/* 68 */                    throw new IllegalStateException(("Unsupported annotation argument type: " + oOOOlIoIlOi.I00iiO + " (expected " + o0iIl1 + ')').toString());
                    }
                }

                public void I0100o111I(boolean z) {
/* 11 */            IiooolIIo1Il iiooolIIo1Il = (IiooolIIo1Il) ((IIlio101Io) ((IIloOI) this.I00iiO).I00iiI).I00iiO;
/* 15 */            if (iiooolIIo1Il.I00iiO != z) {
/* 19 */                if (iiooolIIo1Il.I00iiI != null) {
/* 21 */                    IiollO1llli iiollO1llliI00000oIO = IiollO1llli.I00000oIO();
/* 25 */                    IioooOl0oOl iioooOl0oOl = iiooolIIo1Il.I00iiI;
/* 27 */                    iiollO1llliI00000oIO.getClass();
/* 32 */                    lII1OI11o1I.I0000O("initCallback cannot be null", iioooOl0oOl);
/* 35 */                    ReentrantReadWriteLock reentrantReadWriteLock = iiollO1llliI00000oIO.I00000oIO;
/* 41 */                    reentrantReadWriteLock.writeLock().lock();
                            try {
/* 46 */                        iiollO1llliI00000oIO.I00000oOI.remove(iioooOl0oOl);
                            } finally {
/* 62 */                        reentrantReadWriteLock.writeLock().unlock();
                            }
                        }
/* 66 */                iiooolIIo1Il.I00iiO = z;
/* 68 */                if (z) {
/* 80 */                    IiooolIIo1Il.I00000oIO(iiooolIIo1Il.I00iOIl, IiollO1llli.I00000oIO().I0000Il00O());
                        }
                    }
                }

                public void I010101Oo1lO() {
                    Ololli ololli;
/* 7 */             if (((Oo1i1iO0o0) this.I00iiO) == Oo1i1iO0o0.I00iOIl) {
/* 12 */                Ioll0IliO1l.I0000Il00O("ToolbarRequester is not initialized.");
                    }
/* 17 */            Oloo0l1lIl oloo0l1lIl = (Oloo0l1lIl) this.I00iiI;
/* 19 */            if (oloo0l1lIl == null || !oloo0l1lIl.I00lll10) {
/* 110 */               return;
                    }
/* 25 */            OlIl0i olIl0i = oloo0l1lIl.I00oO101o;
/* 28 */            if ((olIl0i == null || !olIl0i.I0000Il00O()) && (ololli = (Ololli) iiliIooIliOo.I00000oIO(oloo0l1lIl, OloloO.I00000oOI)) != null) {
/* 66 */                oloo0l1lIl.I00oO101o = iOi1II01i0.I0000O(oloo0l1lIl.I00ooiO1I(), null, Ii01I10.I00iio, new OO11OilO(oloo0l1lIl, ololli, null, 23), 1);
                    }
                }

                public void I010I0() {
                    synchronized (this) {
/* 6 */                 ((AtomicInteger) this.I00iiI).decrementAndGet();
/* 17 */                if (((AtomicInteger) this.I00iiI).get() < 0) {
/* 28 */                    throw new IllegalStateException("Unbalanced call to unblock() detected.");
                        }
                    }
                }

                public void I010II(OI0Iol1O oI0Iol1O) {
/* 3 */             OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) this.I00iiI;
/* 9 */             Object objI000II = ((OI10I1IoI0Ol) this.I00iiO).I000II(oI0Iol1O);
/* 13 */            if (objI000II != null) {
/* 17 */                int i = 28;
/* 19 */                if (!(objI000II instanceof OI0oiiIO0)) {
/* 54 */                    O0l0IlolloIO o0l0IlolloIO = new O0l0IlolloIO(i);
/* 57 */                    o0l0IlolloIO.I00iiI = oI0Iol1O;
/* 59 */                    VarHandle.storeStoreFence();
/* 62 */                    OI0i0OIO.I0000Il00O(oI10I1IoI0Ol, (OI0IlliOIlO) objI000II, o0l0IlolloIO);
/* 77 */                    return;
                        }
/* 21 */                OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) objI000II;
/* 23 */                Object[] objArr = oI0oiiIO0.I00000oIO;
/* 25 */                int i2 = oI0oiiIO0.I00000oOI;
/* 28 */                for (int i3 = 0; i3 < i2; i3++) {
/* 32 */                    OI0IlliOIlO oI0IlliOIlO = (OI0IlliOIlO) objArr[i3];
/* 36 */                    O0l0IlolloIO o0l0IlolloIO2 = new O0l0IlolloIO(i);
/* 39 */                    o0l0IlolloIO2.I00iiI = oI0Iol1O;
/* 41 */                    VarHandle.storeStoreFence();
/* 44 */                    OI0i0OIO.I0000Il00O(oI10I1IoI0Ol, oI0IlliOIlO, o0l0IlolloIO2);
                        }
                    }
                }

                @Override
                public ListenableFuture call() {
/* 3 */             Il11olIIio1i il11olIIio1i = (Il11olIIio1i) this.I00iiI;
/* 5 */             int i = Il11olIIio1i.I00ilI0I1;
/* 15 */            if (il11olIIio1i.compareAndSet(Il11o0l.I00iOIl, Il11o0l.I00iiO)) {
/* 32 */                return ((I1OlOl11O0) this.I00iiO).call();
                    }
/* 17 */            IoiiOIo1i ioiiOIo1i = IoiiOIo1i.I00ioIO;
                    return ioiiOIo1i != null ? ioiiOIo1i : new IoiiOIo1i();
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 8:
/* 37 */                    return ((Map) this.I00iiI).toString();
                        case 12:
/* 28 */                    return ((I1OlOl11O0) this.I00iiO).toString();
                        case 14:
/* 19 */                    return IlIi0I0.I000lI("ScriptRecord[scriptTag=", (String) this.I00iiI, "]");
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
/* 5 */         public Ol0O0iI0l0O I000II(IlOIioiOooOO ilOIioiOooOO) {
/* 6 */             return ii00il1.I00OOll1(ilOIioiOooOO);
                }

                @Override
/* 5 */         public Ol0O0iI0l0O I000O01llI0(IlOIioiOooOO ilOIioiOooOO) {
/* 6 */             return ii00il1.I00IoIO0lI(ilOIioiOooOO);
                }

                @Override
/* 6 */         public Ol0O0iI0l0O I0000oI00(Oi1iIiI1 oi1iIiI1) {
/* 7 */             return ii00il1.I00Oio(oi1iIiI1, true);
                }

/* 98 */        public IIlio101Io(int i, Object obj, Object obj2) {
/* 99 */            this.I00iOIl = i;
                    this.I00iiI = obj;
                    this.I00iiO = obj2;
                }

/* 99 */        public IIlio101Io() {
                    this.I00iOIl = 28;
/* 101 */           this.I00iiO = Oo1i1iO0o0.I00iOIl;
                }

/* 101 */       public IIlio101Io(int i) {
/* 102 */           this.I00iOIl = i;
                }

/* 102 */       public IIlio101Io(Context context) {
                    this.I00iOIl = 1;
/* 104 */           this.I00iiI = context;
/* 105 */           this.I00iiO = new I1Ii1lIoOI(1);
                }

/* 105 */       public IIlio101Io(Animation animation) {
                    this.I00iOIl = 13;
/* 107 */           this.I00iiI = animation;
/* 108 */           this.I00iiO = null;
                }
            }
