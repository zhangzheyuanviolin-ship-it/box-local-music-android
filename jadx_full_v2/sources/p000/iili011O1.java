            package p000;

            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.text.TextUtils;
            import java.lang.reflect.ParameterizedType;
            import java.lang.reflect.Type;
            import java.util.Arrays;
            import java.util.EnumMap;
            import java.util.concurrent.CountDownLatch;
            
/* 61 */    public final class iili011O1 implements l0iO00i1IO0, OIOolOo, OOooilOIIl0I, lo11I0lO {
                public final int I00iOIl;
                public Object I00iiI;

                public iili011O1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public void I00000oIO(String str, Bundle bundle) {
                    String string;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiI;
/* 5 */             l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 7 */             l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 9 */             l0olllO1i.I000II(l0o10ooo0);
/* 12 */            l0o10ooo0.I010II();
/* 19 */            if (l0olllo1i.I00000oIO()) {
/* 106 */               return;
                    }
/* 25 */            if (bundle.isEmpty()) {
/* 27 */                string = null;
                    } else {
/* 31 */                Uri.Builder builder = new Uri.Builder();
/* 34 */                builder.path(str);
/* 49 */                for (String str2 : bundle.keySet()) {
/* 61 */                    builder.appendQueryParameter(str2, bundle.getString(str2));
                        }
/* 69 */                string = builder.build().toString();
                    }
/* 77 */            if (TextUtils.isEmpty(string)) {
/* 106 */               return;
                    }
/* 79 */            l0olllO1i.I0000oI00(l0oi0o);
/* 84 */            l0oi0o.I00ol1.I000O01llI0(string);
/* 87 */            l0O0o010I l0o0o010i = l0oi0o.I00olI;
/* 91 */            l0olllo1i.I00li1OI.getClass();
/* 98 */            l0o0o010i.I00000oOI(System.currentTimeMillis());
                }

                public boolean I00000oOI() {
/* 5 */             if (!I0000Il00O()) {
/* 48 */                return false;
                    }
/* 10 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iiI;
/* 14 */            l0olllo1i.I00li1OI.getClass();
/* 17 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 21 */            l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 23 */            l0olllO1i.I0000oI00(l0oi0o);
                    return jCurrentTimeMillis - l0oi0o.I00olI.I00000oIO() > l0olllo1i.I00iio.I010lI0oi(null, iol1II1ii1i.I00iIO);
                }

                public boolean I0000Il00O() {
/* 5 */             l0Oi0o l0oi0o = ((l0olllO1i) this.I00iiI).I00ilI0I1;
/* 7 */             l0olllO1i.I0000oI00(l0oi0o);
                    return l0oi0o.I00olI.I00000oIO() > 0;
                }

                @Override
                public void accept(Object obj, Object obj2) {
/* 9 */             lIIl1lol0iOI liil1lol0ioi = (lIIl1lol0iOI) ((lIIo1l) obj).I000l1();
/* 17 */            l1oiO1ol1 l1oio1ol1 = new l1oiO1ol1((lI1i1OI1O0l) this.I00iiI, (OloIlI0ll) obj2);
/* 20 */            Parcel parcelI00Iooi00oi = liil1lol0ioi.I00Iooi00oi();
/* 24 */            iiIIoi1oIO1.I0000Il00O(parcelI00Iooi00oi, l1oio1ol1);
/* 29 */            liil1lol0ioi.I00O0o1oo(27, parcelI00Iooi00oi);
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 5 */             ((CountDownLatch) this.I00iiI).countDown();
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 6:
/* 15 */                    StringBuilder sb = new StringBuilder(32);
/* 20 */                    sb.append("RunConfig{");
/* 29 */                    l1IllOOOo1 l1illoooo1 = (l1IllOOOo1) ((l1IllOOOo1) this.I00iiI).I00iio;
/* 31 */                    String str = "";
/* 33 */                    while (l1illoooo1 != null) {
/* 35 */                        Object obj = l1illoooo1.I00iiO;
/* 37 */                        sb.append(str);
/* 42 */                        String str2 = (String) l1illoooo1.I00iiI;
/* 44 */                        if (str2 != null) {
/* 46 */                            sb.append(str2);
/* 51 */                            sb.append('=');
                                }
/* 54 */                        if (obj == null || !obj.getClass().isArray()) {
/* 85 */                            sb.append(obj);
                                } else {
/* 81 */                            sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r1.length() - 1);
                                }
/* 90 */                        l1illoooo1 = (l1IllOOOo1) l1illoooo1.I00iio;
/* 92 */                        str = ", ";
                            }
/* 97 */                    sb.append('}');
/* 100 */                   return sb.toString();
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
/* 3 */             Type type = (Type) this.I00iiI;
/* 11 */            if (!(type instanceof ParameterizedType)) {
/* 110 */               throw new llIIooI0iolO("Invalid EnumMap type: ".concat(String.valueOf(type)), 25);
                    }
/* 21 */            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
/* 25 */            if (type2 instanceof Class) {
/* 31 */                return new EnumMap((Class) type2);
                    }
/* 48 */            throw new llIIooI0iolO("Invalid EnumMap type: ".concat(String.valueOf(type)), 25);
                }

                @Override
                public void zzb(Object obj) {
                }

                @Override
/* 62 */        public void zza(Throwable th) {
/* 63 */            iiI11l01l iii11l01l = (iiI11l01l) this.I00iiI;
                    synchronized (iii11l01l.I0001Ioi1lo) {
/* 66 */                iii11l01l.I000O01llI0 = null;
                    }
                }
            }
