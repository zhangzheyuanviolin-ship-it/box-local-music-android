            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.SharedPreferences;
            import android.hardware.camera2.CaptureResult;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import android.util.Base64;
            import android.util.Log;
            import android.view.ActionMode;
            import android.view.Menu;
            import android.view.MenuItem;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.io.InterruptedIOException;
            import java.lang.invoke.VarHandle;
            import java.security.AlgorithmParameters;
            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.InvalidKeyException;
            import java.security.Key;
            import java.security.NoSuchAlgorithmException;
            import java.security.PrivateKey;
            import java.security.ProviderException;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.RejectedExecutionException;
            import java.util.concurrent.SynchronousQueue;
            import java.util.concurrent.ThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import javax.crypto.BadPaddingException;
            import javax.crypto.Cipher;
            import javax.crypto.IllegalBlockSizeException;
            import javax.crypto.spec.SecretKeySpec;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            
/* 94 */    public final class o01l1ioOo0 implements OolOliOI0Oii, IIiOOIoi0, I1OlOl11O0 {
                public static o01l1ioOo0 I00ilI0I1;
                public static final o11IoIoIOI0l I00ilO0;
                public static final o11O11o I00io1l;
                public Object I00iOIl;
                public Object I00iiI;
                public Object I00iiO;
                public Object I00iio;

                static {
/* 3 */             int i = 0;
/* 7 */             I00ilO0 = new o11IoIoIOI0l(i);
/* 14 */            I00io1l = new o11O11o(i);
                }

                public o01l1ioOo0(Context context, I0i0io0oOOi i0i0io0oOOi) {
/* 28 */            o0OIl1o1i0Oi o0oil1o1i0oi = new o0OIl1o1i0Oi(context, new Oioo1I0o(context), new o0O011i1(context, o0IiIio1Ii1i.I00000oIO("shared-installation-id").I00000oIO()), "shared-installation-id");
/* 31 */            i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 34 */            i0oi1l1oo.I00iOIl = o0oil1o1i0oi;
/* 36 */            this.I00iiO = i0oi1l1oo;
/* 43 */            this.I00iiI = new o0I0li(context);
/* 47 */            o01iIOoOi o01iioooi = new o01iIOoOi();
/* 52 */            OIOlo00i oIOlo00i = new OIOlo00i();
/* 55 */            OollIoI001lo.I00000oOI();
/* 60 */            oIOlo00i.I0010I0i = 10000;
/* 62 */            OollIoI001lo.I00000oOI();
/* 65 */            oIOlo00i.I0010o = 10000;
/* 67 */            OollIoI001lo.I00000oOI();
/* 70 */            oIOlo00i.I00111O = 10000;
/* 77 */            o01iioooi.I00000oOI = new OIOlo0OloOi(oIOlo00i);
/* 79 */            o01iioooi.I00000oIO = i0i0io0oOOi;
/* 81 */            o01iioooi.I0000O = i0oi1l1oo;
/* 84 */            o01iioooi.I0000Il00O = null;
/* 88 */            o01iioooi.I0000oI00 = "https://firebaseinstallations.googleapis.com/v1";
/* 90 */            VarHandle.storeStoreFence();
/* 93 */            this.I00iOIl = o01iioooi;
                }

                public I0Oi111ii I00000oIO() {
/* 5 */             I1Io1oIoo i1Io1oIoo = (I1Io1oIoo) this.I00iOIl;
/* 9 */             String str = (String) this.I00iiI;
/* 13 */            String str2 = (String) this.I00iiO;
/* 17 */            Ol0III1O1 ol0III1O1 = (Ol0III1O1) this.I00iio;
/* 20 */            I0Oi111ii i0Oi111ii = new I0Oi111ii(7);
/* 28 */            Set setUnmodifiableSet = i1Io1oIoo == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(i1Io1oIoo);
/* 32 */            i0Oi111ii.I00iiI = setUnmodifiableSet;
/* 34 */            Map map = Collections.EMPTY_MAP;
/* 36 */            i0Oi111ii.I00iio = str;
/* 38 */            i0Oi111ii.I00ilI0I1 = str2;
/* 40 */            if (ol0III1O1 == null) {
/* 42 */                ol0III1O1 = Ol0III1O1.I00000oOI;
                    }
/* 44 */            i0Oi111ii.I00ilO0 = ol0III1O1;
/* 48 */            HashSet hashSet = new HashSet(setUnmodifiableSet);
/* 55 */            Iterator it = map.values().iterator();
/* 63 */            if (it.hasNext()) {
/* 110 */               throw IIlIOloOOO.I000lI(it);
                    }
/* 69 */            i0Oi111ii.I00iiO = Collections.unmodifiableSet(hashSet);
/* 71 */            VarHandle.storeStoreFence();
/* 74 */            return i0Oi111ii;
                }

                public Io1li0o I00000oOI() {
/* 3 */             Integer num = (Integer) this.I00iOIl;
/* 6 */             if (num == null) {
/* 277 */               IioIoO10iOiI.I000oI1ioi("key size is not set");
/* 5 */                 return null;
                    }
/* 12 */            if (((Integer) this.I00iiI) == null) {
/* 271 */               IioIoO10iOiI.I000oI1ioi("tag size is not set");
/* 5 */                 return null;
                    }
/* 18 */            if (((I0i0io0oOOi) this.I00iiO) == null) {
/* 265 */               IioIoO10iOiI.I000oI1ioi("hash type is not set");
/* 5 */                 return null;
                    }
/* 24 */            if (((Io1lOlI) this.I00iio) == null) {
/* 259 */               IioIoO10iOiI.I000oI1ioi("variant is not set");
/* 5 */                 return null;
                    }
/* 32 */            if (num.intValue() < 16) {
/* 256 */               throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.I00iOIl));
                    }
/* 36 */            Integer num2 = (Integer) this.I00iiI;
/* 38 */            int iIntValue = num2.intValue();
/* 44 */            I0i0io0oOOi i0i0io0oOOi = (I0i0io0oOOi) this.I00iiO;
/* 48 */            if (iIntValue < 10) {
/* 236 */               throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
                    }
/* 52 */            if (i0i0io0oOOi == I0i0io0oOOi.I00ilO0) {
/* 56 */                if (iIntValue > 20) {
/* 74 */                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
                        }
                    } else if (i0i0io0oOOi == I0i0io0oOOi.I00io1l) {
/* 81 */                if (iIntValue > 28) {
/* 99 */                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
                        }
                    } else if (i0i0io0oOOi == I0i0io0oOOi.I00ioIO) {
/* 106 */               if (iIntValue > 32) {
/* 124 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
                        }
                    } else if (i0i0io0oOOi == I0i0io0oOOi.I00l0I0l0lO1) {
/* 131 */               if (iIntValue > 48) {
/* 149 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
                        }
                    } else {
/* 152 */               if (i0i0io0oOOi != I0i0io0oOOi.I00l0OO0IO) {
/* 217 */                   IioIoO10iOiI.I000oI1ioi("unknown hash type; must be SHA256, SHA384 or SHA512");
/* 5 */                     return null;
                        }
/* 156 */               if (iIntValue > 64) {
/* 214 */                   throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
                        }
                    }
/* 164 */           int iIntValue2 = ((Integer) this.I00iOIl).intValue();
/* 172 */           int iIntValue3 = ((Integer) this.I00iiI).intValue();
/* 178 */           Io1lOlI io1lOlI = (Io1lOlI) this.I00iio;
/* 182 */           I0i0io0oOOi i0i0io0oOOi2 = (I0i0io0oOOi) this.I00iiO;
/* 184 */           Io1li0o io1li0o = new Io1li0o();
/* 187 */           io1li0o.I00000oIO = iIntValue2;
/* 189 */           io1li0o.I00000oOI = iIntValue3;
/* 191 */           io1li0o.I0000Il00O = io1lOlI;
/* 193 */           io1li0o.I0000O = i0i0io0oOOi2;
/* 195 */           VarHandle.storeStoreFence();
/* 198 */           return io1li0o;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000Il00O(IIl00I iIl00I, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OolOoIlOO oolOoIlOO;
                    Float fValueOf;
/* 3 */             OllO00oiil ollO00oiil = (OllO00oiil) this.I00iio;
/* 7 */             if (iOoil1iiIilo instanceof OolOoIlOO) {
/* 10 */                oolOoIlOO = (OolOoIlOO) iOoil1iiIilo;
/* 12 */                int i = oolOoIlOO.I00iiO;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    oolOoIlOO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 28 */                    oolOoIlOO = new OolOoIlOO(this, (IOoilo) iOoil1iiIilo);
                        }
                    }
/* 31 */            Object objInvoke = oolOoIlOO.I00iOIl;
/* 33 */            Object obj = Ii0111o.I00iOIl;
/* 35 */            int i2 = oolOoIlOO.I00iiO;
/* 37 */            Boolean boolValueOf = null;
/* 39 */            if (i2 == 0) {
/* 53 */                lIoii1l01l0i.I00000oOI(objInvoke);
/* 62 */                ((Boolean) ollO00oiil.getValue()).getClass();
/* 75 */                if (!((Boolean) ollO00oiil.getValue()).booleanValue()) {
/* 77 */                    return Boolean.TRUE;
                        }
/* 80 */                oolOoIlOO.I00iiO = 1;
/* 82 */                objInvoke = iIl00I.invoke(oolOoIlOO);
/* 86 */                if (objInvoke == obj) {
/* 88 */                    return obj;
                        }
                    } else {
/* 41 */                if (i2 != 1) {
/* 49 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 37 */                    return null;
                        }
/* 43 */                lIoii1l01l0i.I00000oOI(objInvoke);
                    }
/* 89 */            I0oIl0101 i0oIl0101 = (I0oIl0101) objInvoke;
/* 93 */            if (i0oIl0101 == null) {
/* 97 */                Log.w("CXCP", "shouldUseTorchAsFlash: frameMetadata is null, defaulting to workaround for safety.");
/* 100 */               return Boolean.TRUE;
                    }
/* 111 */           String str = (String) i0oIl0101.I00iOIl.get(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
/* 113 */           if (str == null) {
/* 117 */               Log.w("CXCP", "isUltraWideCamera: could not get active physical camera ID to identify if it's ultra wide camera.");
                    } else {
/* 123 */               IIlOlol0liO iIlOlol0liO = (IIlOlol0liO) this.I00iiI;
/* 125 */               IIllI0o.I00000oOI(str);
/* 134 */               IIlo0i0ll iIlo0i0llI00000oIO = iIlOlol0liO.I0000Il00O().I0000Il00O.I00000oIO(str);
                        try {
                            try {
/* 161 */                       fValueOf = Float.valueOf(((Iooool) this.I00iiO).I00000oOI(iIlo0i0llI00000oIO) / Iooool.I00000oIO(Iooool.I0000Il00O(iIlo0i0llI00000oIO), Iooool.I0000O(iIlo0i0llI00000oIO)));
                            } catch (Exception e) {
/* 176 */                       throw new IllegalStateException("Failed to get a valid view angle", e);
                            }
                        } catch (Exception e2) {
/* 179 */                   Log.e("CXCP", "Failed to get the intrinsic zoom ratio", e2);
/* 182 */                   fValueOf = null;
                        }
/* 183 */               if (fValueOf != null) {
/* 198 */                   boolValueOf = Boolean.valueOf(fValueOf.floatValue() < 1.0f);
                        } else {
/* 205 */                   Log.w("CXCP", "isUltraWideCamera: could not calculate intrinsic zoom ratio.");
                        }
                    }
/* 214 */           return Boolean.valueOf(boolValueOf != null ? boolValueOf.booleanValue() : true);
                }

                @Override
                public boolean I0000O() {
/* 15 */            return !((Boolean) ((OllO00oiil) this.I00iio).getValue()).booleanValue();
                }

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
                
                    if (r8 == r2) goto L27;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
                
                    if (r8 == r2) goto L27;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I0000oI00(IOoilo iOoilo) throws Throwable {
                    Ii1IIliiOoo ii1IIliiOoo;
                    Ii11I1iOiIo ii11I1iOiIo;
/* 3 */             Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00iio;
/* 7 */             if (iOoilo instanceof Ii1IIliiOoo) {
/* 10 */                ii1IIliiOoo = (Ii1IIliiOoo) iOoilo;
/* 12 */                int i = ii1IIliiOoo.I00iiO;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    ii1IIliiOoo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    ii1IIliiOoo = new Ii1IIliiOoo(this, iOoilo);
                        }
                    }
/* 29 */            Object objI000O01llI0 = ii1IIliiOoo.I00iOIl;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = ii1IIliiOoo.I00iiO;
/* 38 */            if (i2 == 0) {
/* 58 */                lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 63 */                List list = (List) this.I00iiO;
/* 65 */                if (list == null || list.isEmpty()) {
/* 95 */                    ii1IIliiOoo.I00iiO = 1;
/* 98 */                    objI000O01llI0 = ii1OIIlOi.I000O01llI0(false, ii1IIliiOoo);
                        } else {
/* 74 */                    Ol0Oiooo ol0OioooI0000Il00O = ii1OIIlOi.I0000Il00O();
/* 80 */                    Ii1IiO ii1IiO = new Ii1IiO(ii1OIIlOi, this, null);
/* 83 */                    ii1IIliiOoo.I00iiO = 2;
/* 85 */                    objI000O01llI0 = ol0OioooI0000Il00O.I00000oOI(ii1IiO, ii1IIliiOoo);
                        }
/* 104 */               return ii0111o;
                    }
/* 40 */            if (i2 == 1) {
/* 54 */                lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 105 */               ii11I1iOiIo = (Ii11I1iOiIo) objI000O01llI0;
                    } else {
/* 42 */                if (i2 != 2) {
/* 50 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                    return null;
                        }
/* 44 */                lIoii1l01l0i.I00000oOI(objI000O01llI0);
/* 92 */                ii11I1iOiIo = (Ii11I1iOiIo) objI000O01llI0;
                    }
/* 109 */           ii1OIIlOi.I000O01llI0.I0000Il00O(ii11I1iOiIo);
/* 112 */           return OoiIlOl1iI.I00000oIO;
                }

                public void I0001Ioi1lo(ArrayDeque arrayDeque, Object obj) {
                    synchronized (this) {
/* 6 */                 if (!arrayDeque.remove(obj)) {
/* 20 */                    throw new AssertionError("Call wasn't in-flight!");
                        }
                    }
/* 9 */             I000oI1ioi();
                }

                public void I000II(OOliOOlol1 oOliOOlol1) {
/* 3 */             oOliOOlol1.I00iiI.decrementAndGet();
/* 10 */            I0001Ioi1lo((ArrayDeque) this.I00iiO, oOliOOlol1);
                }

                public void I000O01llI0(JSONObject jSONObject) throws JSONException {
/* 9 */             lII1IoI.I00000oOI(l0IlIoi1oIoO.I00000oOI(jSONObject, "token_type"), "token type must not be empty if defined");
/* 14 */            String strI0000Il00O = l0IlIoi1oIoO.I0000Il00O(jSONObject, "access_token");
/* 18 */            if (strI0000Il00O != null) {
/* 22 */                lII1IoI.I00000oOI(strI0000Il00O, "access token cannot be empty if specified");
                    }
/* 25 */            this.I00iOIl = strI0000Il00O;
/* 31 */            this.I00iiI = l0IlIoi1oIoO.I00000oIO(jSONObject);
/* 39 */            if (jSONObject.has("expires_in")) {
/* 41 */                long j = jSONObject.getLong("expires_in");
/* 60 */                this.I00iiI = Long.valueOf(TimeUnit.SECONDS.toMillis(j) + System.currentTimeMillis());
                    }
/* 64 */            String strI0000Il00O2 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "refresh_token");
/* 68 */            if (strI0000Il00O2 != null) {
/* 72 */                lII1IoI.I00000oOI(strI0000Il00O2, "refresh token must not be empty if defined");
                    }
/* 75 */            this.I00iio = strI0000Il00O2;
/* 79 */            String strI0000Il00O3 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "id_token");
/* 83 */            if (strI0000Il00O3 != null) {
/* 87 */                lII1IoI.I00000oOI(strI0000Il00O3, "id token must not be empty if defined");
                    }
/* 90 */            this.I00iiO = strI0000Il00O3;
/* 94 */            String strI0000Il00O4 = l0IlIoi1oIoO.I0000Il00O(jSONObject, "scope");
/* 102 */           if (!TextUtils.isEmpty(strI0000Il00O4)) {
/* 107 */               String[] strArrSplit = strI0000Il00O4.split(" +");
/* 111 */               if (strArrSplit == null) {
/* 114 */                   strArrSplit = new String[0];
                        }
/* 122 */               iOOIoOO1il1i.I00000oIO(Arrays.asList(strArrSplit));
                    }
/* 125 */           HashSet hashSet = Oo1Ioo1.I0000O;
/* 129 */           LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 132 */           Iterator<String> itKeys = jSONObject.keys();
/* 140 */           while (itKeys.hasNext()) {
/* 142 */               String next = itKeys.next();
/* 152 */               if (!hashSet.contains(next)) {
/* 162 */                   linkedHashMap.put(next, jSONObject.get(next).toString());
                        }
                    }
/* 168 */           iOIOlii1.I00000oOI(linkedHashMap, Oo1Ioo1.I0000O);
                }

                public O1OIll00i I000OOo1O(I0ioOiiIO0 i0ioOiiIO0, byte[] bArr) throws OIiiIO, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
/* 3 */             PrivateKey privateKey = (PrivateKey) this.I00iio;
/* 7 */             I0ioOiiIO0 i0ioOiiIO02 = (I0ioOiiIO0) this.I00iOIl;
/* 11 */            OIiiIOi1l oIiiIOi1l = (OIiiIOi1l) this.I00iiI;
                    try {
/* 19 */                Cipher cipherI00000oOI = oIiiIOi1l.I00000oOI(i0ioOiiIO02.I00iOIl, (HashMap) this.I00iiO);
/* 23 */                AlgorithmParameters algorithmParametersI00000oIO = oIiiIOi1l.I00000oIO(i0ioOiiIO02);
/* 28 */                Key secretKeySpec = null;
                        try {
/* 29 */                    if (algorithmParametersI00000oIO != null) {
/* 31 */                        cipherI00000oOI.init(4, privateKey, algorithmParametersI00000oIO);
                            } else {
/* 35 */                        cipherI00000oOI.init(4, privateKey);
                            }
/* 45 */                    secretKeySpec = cipherI00000oOI.unwrap(bArr, OIiiIOi1l.I0000Il00O(i0ioOiiIO0.I00iOIl), 3);
                        } catch (IllegalStateException | UnsupportedOperationException | GeneralSecurityException | ProviderException unused) {
                        }
/* 49 */                if (secretKeySpec == null) {
/* 52 */                    if (algorithmParametersI00000oIO != null) {
/* 54 */                        cipherI00000oOI.init(2, privateKey, algorithmParametersI00000oIO);
                            } else {
/* 58 */                        cipherI00000oOI.init(2, privateKey);
                            }
/* 71 */                    secretKeySpec = new SecretKeySpec(cipherI00000oOI.doFinal(bArr), i0ioOiiIO0.I00iOIl.I00iOIl);
                        }
/* 76 */                byte[] encoded = secretKeySpec.getEncoded();
/* 80 */                if (encoded != null) {
/* 82 */                    secretKeySpec = encoded;
                        }
/* 85 */                O1OIll00i o1OIll00i = new O1OIll00i(14);
/* 88 */                o1OIll00i.I00iiI = secretKeySpec;
/* 90 */                return o1OIll00i;
                    } catch (InvalidAlgorithmParameterException e) {
/* 115 */               throw new OIiiIO("invalid algorithm parameters: " + e.getMessage(), e);
                    } catch (InvalidKeyException e2) {
/* 332 */               throw new OIiiIO("key invalid: " + e2.getMessage(), e2);
                    } catch (BadPaddingException e3) {
/* 140 */               throw new OIiiIO("bad padding: " + e3.getMessage(), e3);
                    } catch (IllegalBlockSizeException e4) {
/* 165 */               throw new OIiiIO("illegal blocksize: " + e4.getMessage(), e4);
                    }
                }

                public OliilliIi I000OiO(I0I1liIO0ii i0I1liIO0ii) {
/* 3 */             ArrayList arrayList = (ArrayList) this.I00iiO;
/* 5 */             int size = arrayList.size();
/* 10 */            for (int i = 0; i < size; i++) {
/* 16 */                OliilliIi oliilliIi = (OliilliIi) arrayList.get(i);
/* 18 */                if (oliilliIi != null && oliilliIi.I00000oOI == i0I1liIO0ii) {
/* 24 */                    return oliilliIi;
                        }
                    }
/* 32 */            Context context = (Context) this.I00iiI;
/* 34 */            OliilliIi oliilliIi2 = new OliilliIi();
/* 37 */            oliilliIi2.I00000oIO = context;
/* 39 */            oliilliIi2.I00000oOI = i0I1liIO0ii;
/* 41 */            VarHandle.storeStoreFence();
/* 44 */            arrayList.add(oliilliIi2);
/* 77 */            return oliilliIi2;
                }

                public OI000ilOol I000iOII(IOIOill iOIOill, List list) {
/* 3 */             O1I00llOi o1I00llOi = (O1I00llOi) this.I00iio;
/* 7 */             OIIool oIIool = new OIIool();
/* 10 */            oIIool.I00000oIO = iOIOill;
/* 12 */            oIIool.I00000oOI = list;
/* 14 */            VarHandle.storeStoreFence();
/* 21 */            return (OI000ilOol) o1I00llOi.invoke(oIIool);
                }

                public boolean I000l1(I0I1liIO0ii i0I1liIO0ii, MenuItem menuItem) {
/* 20 */            return ((ActionMode.Callback) this.I00iOIl).onActionItemClicked(I000OiO(i0I1liIO0ii), new O1ioi1oo0Ol((Context) this.I00iiI, (OliiollI) menuItem));
                }

                public boolean I000lI(I0I1liIO0ii i0I1liIO0ii, O1illlIiilIl o1illlIiilIl) {
/* 3 */             ActionMode.Callback callback = (ActionMode.Callback) this.I00iOIl;
/* 5 */             OliilliIi oliilliIiI000OiO = I000OiO(i0I1liIO0ii);
/* 11 */            Ol0Ii10o1 ol0Ii10o1 = (Ol0Ii10o1) this.I00iio;
/* 17 */            Menu o1l0oO1I0iO = (Menu) ol0Ii10o1.get(o1illlIiilIl);
/* 19 */            if (o1l0oO1I0iO == null) {
/* 27 */                o1l0oO1I0iO = new O1l0oO1I0iO((Context) this.I00iiI, o1illlIiilIl);
/* 30 */                ol0Ii10o1.put(o1illlIiilIl, o1l0oO1I0iO);
                    }
/* 33 */            return callback.onCreateActionMode(oliilliIiI000OiO, o1l0oO1I0iO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:36:0x007b, code lost:
                
                    if (r4 != r1.I00iiO) goto L26;
                 */
                /* JADX WARN: Path cross not found for [B:22:0x0043, B:26:0x004f], limit reached: 41 */
                /* JADX WARN: Path cross not found for [B:26:0x004f, B:22:0x0043], limit reached: 41 */
                /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x004c A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:13:0x0030, B:35:0x0079, B:26:0x004f, B:28:0x0055, B:29:0x0059, B:31:0x005d, B:32:0x0068, B:22:0x0043, B:25:0x004c, B:19:0x003c), top: B:40:0x0028 }] */
                /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0076 -> B:35:0x0079). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000o00OoI0I(IOoilo iOoilo) throws Throwable {
                    OOIo110OiO oOIo110OiO;
                    Object objI000iOII;
                    int i;
/* 3 */             IIIII1OI1 iiiii1oi1 = (IIIII1OI1) this.I00iiO;
/* 7 */             I1Il0loi i1Il0loi = (I1Il0loi) this.I00iio;
/* 11 */            if (iOoilo instanceof OOIo110OiO) {
/* 14 */                oOIo110OiO = (OOIo110OiO) iOoilo;
/* 16 */                int i2 = oOIo110OiO.I00iio;
/* 22 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 25 */                    oOIo110OiO.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 30 */                    oOIo110OiO = new OOIo110OiO(this, iOoilo);
                        }
                    }
/* 33 */            Object obj = oOIo110OiO.I00iiI;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i3 = oOIo110OiO.I00iio;
                    try {
/* 41 */                if (i3 == 0) {
/* 65 */                    lIoii1l01l0i.I00000oOI(obj);
/* 68 */                    oOIo110OiO.I00iio = 1;
/* 70 */                    objI000iOII = iiiii1oi1.I000iOII(oOIo110OiO);
/* 74 */                    if (objI000iOII == ii0111o) {
                            }
                        } else if (i3 == 1) {
/* 61 */                    lIoii1l01l0i.I00000oOI(obj);
/* 77 */                    i1Il0loi.addLast(obj);
/* 84 */                    if (!i1Il0loi.isEmpty()) {
/* 92 */                        for (Object objI0000oI00 = iiiii1oi1.I0000oI00(); !(objI0000oI00 instanceof IO10l0l0); objI0000oI00 = iiiii1oi1.I0000oI00()) {
/* 94 */                            IO10lIoiO.I0000O(objI0000oI00);
/* 97 */                            i1Il0loi.addLast(objI0000oI00);
                                }
/* 105 */                       i = i1Il0loi.I00iiO;
/* 109 */                       IliI1Ii1II iliI1Ii1II = (IliI1Ii1II) this.I00iiI;
/* 111 */                       oOIo110OiO.I00iOIl = i;
/* 113 */                       oOIo110OiO.I00iio = 2;
/* 119 */                       if (iliI1Ii1II.invoke(i1Il0loi, oOIo110OiO) == ii0111o) {
/* 121 */                           return;
                                }
                            }
/* 68 */                    oOIo110OiO.I00iio = 1;
/* 70 */                    objI000iOII = iiiii1oi1.I000iOII(oOIo110OiO);
/* 74 */                    if (objI000iOII == ii0111o) {
/* 121 */                       return;
                            }
/* 77 */                    i1Il0loi.addLast(objI000iOII);
/* 84 */                    if (!i1Il0loi.isEmpty()) {
                            }
/* 68 */                    oOIo110OiO.I00iio = 1;
/* 70 */                    objI000iOII = iiiii1oi1.I000iOII(oOIo110OiO);
/* 74 */                    if (objI000iOII == ii0111o) {
                            }
                        } else if (i3 != 2) {
/* 57 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                        } else {
/* 47 */                    i = oOIo110OiO.I00iOIl;
/* 49 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
                    } catch (Throwable th) {
/* 127 */               I00100l0(th);
/* 168 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I000oI1ioi() {
                    int size;
                    int i;
                    ThreadPoolExecutor threadPoolExecutor;
/* 1 */             byte[] bArr = OollIoI001lo.I00000oIO;
/* 5 */             ArrayList arrayList = new ArrayList();
                    synchronized (this) {
                        try {
/* 13 */                    Iterator it = ((ArrayDeque) this.I00iiI).iterator();
/* 21 */                    while (it.hasNext()) {
/* 27 */                        OOliOOlol1 oOliOOlol1 = (OOliOOlol1) it.next();
/* 39 */                        if (((ArrayDeque) this.I00iiO).size() >= 64) {
                                    break;
                                }
/* 48 */                        if (oOliOOlol1.I00iiI.get() < 5) {
/* 50 */                            it.remove();
/* 55 */                            oOliOOlol1.I00iiI.incrementAndGet();
/* 58 */                            arrayList.add(oOliOOlol1);
/* 65 */                            ((ArrayDeque) this.I00iiO).add(oOliOOlol1);
                                }
                            }
                            synchronized (this) {
/* 77 */                        ((ArrayDeque) this.I00iiO).size();
/* 84 */                        ((ArrayDeque) this.I00iio).size();
                            }
/* 89 */                    size = arrayList.size();
/* 95 */                    for (i = 0; i < size; i++) {
/* 102 */                       OOliOOlol1 oOliOOlol12 = (OOliOOlol1) arrayList.get(i);
                                synchronized (this) {
/* 107 */                           threadPoolExecutor = (ThreadPoolExecutor) this.I00iOIl;
/* 109 */                           if (threadPoolExecutor == null) {
/* 113 */                               TimeUnit timeUnit = TimeUnit.SECONDS;
/* 117 */                               SynchronousQueue synchronousQueue = new SynchronousQueue();
/* 135 */                               String str = OollIoI001lo.I000II + " Dispatcher";
/* 141 */                               Ooll0O0llOl1 ooll0O0llOl1 = new Ooll0O0llOl1();
/* 144 */                               ooll0O0llOl1.I00000oIO = str;
/* 146 */                               ooll0O0llOl1.I00000oOI = false;
/* 148 */                               VarHandle.storeStoreFence();
/* 157 */                               ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, ooll0O0llOl1);
/* 160 */                               this.I00iOIl = threadPoolExecutor2;
/* 162 */                               threadPoolExecutor = threadPoolExecutor2;
                                    }
                                }
/* 167 */                       OOlioiIOOO1 oOlioiIOOO1 = oOliOOlol12.I00iiO;
/* 169 */                       byte[] bArr2 = OollIoI001lo.I00000oIO;
                                try {
                                    try {
/* 171 */                               threadPoolExecutor.execute(oOliOOlol12);
                                    } catch (RejectedExecutionException e) {
/* 183 */                               InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
/* 186 */                               interruptedIOException.initCause(e);
/* 189 */                               oOlioiIOOO1.I000OOo1O(interruptedIOException);
/* 192 */                               I01i01OoI i01i01OoI = oOliOOlol12.I00iOIl;
/* 196 */                               if (!oOlioiIOOO1.I00lli11) {
/* 206 */                                   ((IIoOoIol0Io0) i01i01OoI.I00iiO).resumeWith(lIoii1l01l0i.I00000oIO(interruptedIOException));
                                        }
/* 213 */                               oOlioiIOOO1.I00iOIl.I00iOIl.I000II(oOliOOlol12);
                                    }
                                } catch (Throwable th) {
/* 223 */                           oOlioiIOOO1.I00iOIl.I00iOIl.I000II(oOliOOlol12);
/* 226 */                           throw th;
                                }
                            }
                        } catch (Throwable th2) {
/* 245 */                   throw th2;
                        }
                    }
/* 89 */            size = arrayList.size();
/* 95 */            while (i < size) {
                    }
                }

                public void I00100l0(Throwable th) {
/* 3 */             I1Il0loi i1Il0loi = (I1Il0loi) this.I00iio;
/* 7 */             IIIII1OI1 iiiii1oi1 = (IIIII1OI1) this.I00iiO;
/* 14 */            if (iiiii1oi1.I0000Il00O(false, th)) {
/* 22 */                for (Object objI0000oI00 = iiiii1oi1.I0000oI00(); !(objI0000oI00 instanceof IO10l0l0); objI0000oI00 = iiiii1oi1.I0000oI00()) {
/* 24 */                    IO10lIoiO.I0000O(objI0000oI00);
/* 27 */                    i1Il0loi.addLast(objI0000oI00);
                        }
/* 39 */                if (i1Il0loi.isEmpty()) {
/* 77 */                    return;
                        }
/* 50 */                ((Function1) this.I00iOIl).invoke(new ArrayList(i1Il0loi));
/* 53 */                i1Il0loi.clear();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Type inference failed for: r3v3, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r9v0, types: [o01l1ioOo0] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object I00100o1O0lo(IOoilo iOoilo) throws Throwable {
                    OiI1oll0 oiI1oll0;
                    OI1I0OoOl oI1I0OoOl;
                    Throwable th;
                    OI11ol oI11ol;
/* 3 */             IOi10loi iOi10loi = (IOi10loi) this.I00iiI;
/* 7 */             if (iOoilo instanceof OiI1oll0) {
/* 10 */                oiI1oll0 = (OiI1oll0) iOoilo;
/* 12 */                int i = oiI1oll0.I00iio;
/* 18 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 21 */                    oiI1oll0.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 26 */                    oiI1oll0 = new OiI1oll0(this, iOoilo);
                        }
                    }
/* 29 */            Object obj = oiI1oll0.I00iiI;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i2 = oiI1oll0.I00iio;
/* 37 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    try {
/* 40 */                if (i2 == 0) {
/* 67 */                    lIoii1l01l0i.I00000oOI(obj);
/* 74 */                    if (iOi10loi.I00oII()) {
/* 76 */                        return ooiIlOl1iI;
                            }
/* 79 */                    oI1I0OoOl = (OI1I0OoOl) this.I00iOIl;
/* 81 */                    oiI1oll0.I00iOIl = oI1I0OoOl;
/* 83 */                    oiI1oll0.I00iio = 1;
/* 89 */                    if (oI1I0OoOl.I00000oIO(oiI1oll0) != ii0111o) {
                            }
/* 112 */                   return ii0111o;
                        }
/* 42 */                if (i2 != 1) {
/* 44 */                    if (i2 != 2) {
/* 56 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                        return null;
                            }
/* 46 */                    oI11ol = oiI1oll0.I00iOIl;
                            try {
/* 48 */                        lIoii1l01l0i.I00000oOI(obj);
/* 114 */                       iOi10loi.I00O10llo(ooiIlOl1iI);
/* 117 */                       oI11ol.I00000oOI(null);
/* 120 */                       return ooiIlOl1iI;
                            } catch (Throwable th2) {
/* 52 */                        th = th2;
/* 125 */                       oI11ol.I00000oOI(null);
/* 168 */                       throw th;
                            }
                        }
/* 60 */                ?? r3 = oiI1oll0.I00iOIl;
/* 62 */                lIoii1l01l0i.I00000oOI(obj);
/* 65 */                oI1I0OoOl = r3;
/* 96 */                if (iOi10loi.I00oII()) {
/* 98 */                    oI1I0OoOl.I00000oOI(null);
/* 101 */                   return ooiIlOl1iI;
                        }
/* 102 */               oiI1oll0.I00iOIl = oI1I0OoOl;
/* 104 */               oiI1oll0.I00iio = 2;
/* 110 */               if (I0000oI00(oiI1oll0) != ii0111o) {
/* 113 */                   oI11ol = oI1I0OoOl;
/* 114 */                   iOi10loi.I00O10llo(ooiIlOl1iI);
/* 117 */                   oI11ol.I00000oOI(null);
/* 120 */                   return ooiIlOl1iI;
                        }
/* 112 */               return ii0111o;
                    } catch (Throwable th3) {
/* 122 */               OI1I0OoOl oI1I0OoOl2 = oI1I0OoOl;
/* 123 */               th = th3;
/* 124 */               oI11ol = oI1I0OoOl2;
/* 125 */               oI11ol.I00000oOI(null);
/* 168 */               throw th;
                    }
                }

                public boolean I0010I0i(Object obj) {
/* 11 */            return !(((IIIII1OI1) this.I00iiO).I000lI(obj) instanceof IO10l0l0);
                }

                /* JADX WARN: Removed duplicated region for block: B:51:0x00fe A[Catch: NumberFormatException | JSONException -> 0x010b, NumberFormatException | JSONException -> 0x010b, TRY_LEAVE, TryCatch #0 {NumberFormatException | JSONException -> 0x010b, blocks: (B:10:0x0031, B:24:0x0065, B:24:0x0065, B:26:0x0072, B:26:0x0072, B:28:0x0084, B:28:0x0084, B:29:0x008d, B:29:0x008d, B:51:0x00fe, B:51:0x00fe, B:33:0x009a, B:33:0x009a, B:35:0x00a7, B:35:0x00a7, B:37:0x00b9, B:37:0x00b9, B:38:0x00c2, B:38:0x00c2, B:42:0x00ce, B:42:0x00ce, B:46:0x00de, B:46:0x00de, B:50:0x00f2, B:50:0x00f2), top: B:63:0x0031, outer: #1 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Bundle I0010o() throws JSONException {
/* 3 */             l0Oi0o l0oi0o = (l0Oi0o) this.I00iio;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) l0oi0o.I00iOIl;
/* 13 */            if (((Bundle) this.I00iiO) == null) {
/* 26 */                String string = l0oi0o.I010ioo().getString((String) this.I00iOIl, null);
/* 30 */                if (string != null) {
                            try {
/* 34 */                        Bundle bundle = new Bundle();
/* 39 */                        JSONArray jSONArray = new JSONArray(string);
/* 48 */                        for (int i = 0; i < jSONArray.length(); i++) {
                                    try {
/* 50 */                                JSONObject jSONObject = jSONArray.getJSONObject(i);
/* 56 */                                String string2 = jSONObject.getString("n");
/* 62 */                                String string3 = jSONObject.getString("t");
/* 66 */                                int iHashCode = string3.hashCode();
/* 74 */                                if (iHashCode != 100) {
/* 78 */                                    if (iHashCode != 108) {
/* 82 */                                        if (iHashCode != 115) {
/* 86 */                                            if (iHashCode != 3352) {
/* 90 */                                                if (iHashCode == 3445 && string3.equals("la")) {
/* 102 */                                                   iIO0ooOool.I00000oIO();
/* 113 */                                                   if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I0100o111I)) {
/* 121 */                                                       JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
/* 124 */                                                       int length = jSONArray2.length();
/* 128 */                                                       long[] jArr = new long[length];
/* 131 */                                                       for (int i2 = 0; i2 < length; i2++) {
/* 137 */                                                           jArr[i2] = jSONArray2.optLong(i2);
                                                                }
/* 142 */                                                       bundle.putLongArray(string2, jArr);
                                                            }
                                                        } else {
/* 255 */                                                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 257 */                                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 264 */                                                   l01o0io1ooo0.I00ilO0.I0000Il00O("Unrecognized persisted bundle type. Type", string3);
                                                        }
                                                    } else if (string3.equals("ia")) {
/* 155 */                                               iIO0ooOool.I00000oIO();
/* 166 */                                               if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I0100o111I)) {
/* 174 */                                                   JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
/* 177 */                                                   int length2 = jSONArray3.length();
/* 181 */                                                   int[] iArr = new int[length2];
/* 184 */                                                   for (int i3 = 0; i3 < length2; i3++) {
/* 190 */                                                       iArr[i3] = jSONArray3.optInt(i3);
                                                            }
/* 195 */                                                   bundle.putIntArray(string2, iArr);
                                                        }
                                                    }
                                                } else if (string3.equals("s")) {
/* 211 */                                           bundle.putString(string2, jSONObject.getString("v"));
                                                }
                                            } else if (string3.equals("l")) {
/* 231 */                                       bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                            }
                                        } else if (string3.equals("d")) {
/* 251 */                                   bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                        }
                                    } catch (NumberFormatException | JSONException unused) {
/* 268 */                               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 270 */                               l0olllO1i.I000II(l01o0io1ooo02);
/* 277 */                               l01o0io1ooo02.I00ilO0.I00000oOI("Error reading value from SharedPreferences. Value dropped");
                                    }
                                }
/* 284 */                       this.I00iiO = bundle;
                            } catch (JSONException unused2) {
/* 287 */                       l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 289 */                       l0olllO1i.I000II(l01o0io1ooo03);
/* 296 */                       l01o0io1ooo03.I00ilO0.I00000oOI("Error loading bundle from SharedPreferences. Values will be lost");
                            }
                        }
/* 303 */               if (((Bundle) this.I00iiO) == null) {
/* 309 */                   this.I00iiO = (Bundle) this.I00iiI;
                        }
                    }
/* 315 */           Bundle bundle2 = (Bundle) this.I00iiO;
/* 317 */           lII0I0I000I.I000II(bundle2);
/* 320 */           return new Bundle(bundle2);
                }

                public iO0iIIoO11 I00111O(OillOo0 oillOo0, l1OoioI11o1l... l1ooioi11o1lArr) {
/* 1 */             iO0iIIoO11 io0iiioo11I00000oOI = iO0iIIoO11.I00Ol1ll1;
/* 5 */             for (l1OoioI11o1l l1ooioi11o1l : l1ooioi11o1lArr) {
/* 9 */                 io0iiioo11I00000oOI = ll01OOOOii.I00000oOI(l1ooioi11o1l);
/* 17 */                ll00I0ii.I000iOII((OillOo0) this.I00iiO);
/* 22 */                if ((io0iiioo11I00000oOI instanceof iO11IOo0II) || (io0iiioo11I00000oOI instanceof iIolollI1)) {
/* 32 */                    io0iiioo11I00000oOI = ((OoOlO1O0o) this.I00iOIl).I000OiO(oillOo0, io0iiioo11I00000oOI);
                        }
                    }
/* 106 */           return io0iiioo11I00000oOI;
                }

                public void I001IIilI0O(Bundle bundle) throws JSONException {
/* 3 */             l0Oi0o l0oi0o = (l0Oi0o) this.I00iio;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) l0oi0o.I00iOIl;
/* 19 */            Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
/* 27 */            SharedPreferences.Editor editorEdit = l0oi0o.I010ioo().edit();
/* 31 */            int size = bundle2.size();
/* 37 */            String str = (String) this.I00iOIl;
/* 39 */            if (size == 0) {
/* 41 */                editorEdit.remove(str);
                    } else {
/* 48 */                JSONArray jSONArray = new JSONArray();
/* 63 */                for (String str2 : bundle2.keySet()) {
/* 71 */                    Object obj = bundle2.get(str2);
/* 75 */                    if (obj != null) {
                                try {
/* 79 */                            JSONObject jSONObject = new JSONObject();
/* 84 */                            jSONObject.put("n", str2);
/* 87 */                            iIO0ooOool.I00000oIO();
/* 111 */                           if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I0100o111I)) {
/* 115 */                               if (obj instanceof String) {
/* 121 */                                   jSONObject.put("v", obj.toString());
/* 124 */                                   jSONObject.put("t", "s");
                                        } else if (obj instanceof Long) {
/* 140 */                                   jSONObject.put("v", obj.toString());
/* 143 */                                   jSONObject.put("t", "l");
                                        } else if (obj instanceof int[]) {
/* 157 */                                   jSONObject.put("v", Arrays.toString((int[]) obj));
/* 162 */                                   jSONObject.put("t", "ia");
                                        } else if (obj instanceof long[]) {
/* 176 */                                   jSONObject.put("v", Arrays.toString((long[]) obj));
/* 181 */                                   jSONObject.put("t", "la");
                                        } else if (obj instanceof Double) {
/* 193 */                                   jSONObject.put("v", obj.toString());
/* 196 */                                   jSONObject.put("t", "d");
                                        } else {
/* 200 */                                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 202 */                                   l0olllO1i.I000II(l01o0io1ooo0);
/* 211 */                                   l01o0io1ooo0.I00ilO0.I0000Il00O("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                        }
/* 246 */                               jSONArray.put(jSONObject);
                                    } else {
/* 220 */                               jSONObject.put("v", obj.toString());
/* 225 */                               if (obj instanceof String) {
/* 227 */                                   jSONObject.put("t", "s");
                                        } else if (obj instanceof Long) {
/* 235 */                                   jSONObject.put("t", "l");
                                        } else if (obj instanceof Double) {
/* 243 */                                   jSONObject.put("t", "d");
                                        } else {
/* 251 */                                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 253 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 262 */                                   l01o0io1ooo02.I00ilO0.I0000Il00O("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                                        }
/* 246 */                               jSONArray.put(jSONObject);
                                    }
                                } catch (JSONException e) {
/* 267 */                           l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 269 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 276 */                           l01o0io1ooo03.I00ilO0.I0000Il00O("Cannot serialize bundle value to SharedPreferences", e);
                                }
                            }
                        }
/* 285 */               editorEdit.putString(str, jSONArray.toString());
                    }
/* 288 */           editorEdit.apply();
/* 291 */           this.I00iiO = bundle2;
                }

                public String I001IO000() {
                    boolean zI00000oIO;
/* 3 */             i0OI1l1Oo i0oi1l1oo = (i0OI1l1Oo) this.I00iiO;
/* 7 */             o01iIOoOi o01iioooi = (o01iIOoOi) this.I00iOIl;
/* 20 */            lII0I0I000I.I000OiO(((IioiI0IIIIO) this.I00iio) != null);
/* 32 */            lII0I0I000I.I000OiO(((IioiI0IIIIO) this.I00iio) != null);
/* 37 */            IioiI0IIIIO iioiI0IIIIO = (IioiI0IIIIO) this.I00iio;
/* 39 */            iioiI0IIIIO.getClass();
/* 50 */            if (System.currentTimeMillis() >= iioiI0IIIIO.I00000oIO) {
/* 54 */                o01oIol1O o01oiol1o = new o01oIol1O();
/* 57 */                o01oiol1o.I0000Il00O();
                        try {
/* 62 */                    if (o01iioooi.I0000Il00O == null) {
/* 64 */                        zI00000oIO = false;
                            } else {
/* 70 */                        OoOlO1O0o ooOlO1O0o = new OoOlO1O0o(14);
/* 73 */                        ooOlO1O0o.I00iiI = o01iioooi;
/* 75 */                        ooOlO1O0o.I00iiO = o01oiol1o;
/* 77 */                        VarHandle.storeStoreFence();
/* 80 */                        zI00000oIO = o0li1IlO0.I00000oIO(ooOlO1O0o);
/* 84 */                        if (!zI00000oIO) {
/* 90 */                            o01oiol1o.I0000O.I000l1(loOill110Ol.RPC_EXPONENTIAL_BACKOFF_FAILED);
                                }
                            }
/* 93 */                    if (zI00000oIO) {
/* 97 */                        this.I00iio = o01iioooi.I0000Il00O;
                            }
                        } finally {
/* 111 */                   o01oiol1o.I00000oOI();
/* 116 */                   i0oi1l1oo.I0001Ioi1lo(lioiiIOoil.INSTALLATION_ID_REFRESH_TEMPORARY_TOKEN, o01oiol1o);
                        }
                    }
/* 128 */           lII0I0I000I.I000OiO(((IioiI0IIIIO) this.I00iio) != null);
/* 137 */           return (String) ((IioiI0IIIIO) this.I00iio).I0000O;
                }

                public void I001i1O0Ol() {
/* 3 */             o01iIOoOi o01iioooi = (o01iIOoOi) this.I00iOIl;
/* 7 */             o0I0li o0i0li = (o0I0li) this.I00iiI;
/* 11 */            i0OI1l1Oo i0oi1l1oo = (i0OI1l1Oo) this.I00iiO;
/* 15 */            o01oIol1O o01oiol1o = new o01oIol1O();
/* 18 */            o01oiol1o.I0000Il00O();
                    try {
/* 21 */                IioiI0IIIIO iioiI0IIIIOI00000oIO = o0i0li.I00000oIO(o01oiol1o);
/* 25 */                if (iioiI0IIIIOI00000oIO != null) {
/* 27 */                    this.I00iio = iioiI0IIIIOI00000oIO;
                        } else {
/* 35 */                    o01oIol1O o01oiol1o2 = new o01oIol1O();
/* 38 */                    o01oiol1o2.I0000Il00O();
                            try {
/* 45 */                        byte[] bArr = new byte[17];
/* 49 */                        o01loIio11i.I00000oIO.nextBytes(bArr);
/* 60 */                        bArr[0] = (byte) ((bArr[0] & 15) | 112);
/* 70 */                        String strSubstring = Base64.encodeToString(bArr, 11).substring(0, 22);
/* 76 */                        "Generated installation id: ".concat(strSubstring);
/* 79 */                        o01Il0IOli o01il0ioli = new o01Il0IOli(strSubstring);
/* 84 */                        l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 87 */                        l1il1ilioi1l.I00iOIl = o01iioooi;
/* 89 */                        l1il1ilioi1l.I00iiI = o01il0ioli;
/* 91 */                        l1il1ilioi1l.I00iiO = o01oiol1o2;
/* 93 */                        VarHandle.storeStoreFence();
/* 100 */                       if (o0li1IlO0.I00000oIO(l1il1ilioi1l)) {
/* 122 */                           IioiI0IIIIO iioiI0IIIIO = o01iioooi.I0000Il00O;
/* 124 */                           this.I00iio = iioiI0IIIIO;
/* 126 */                           if (iioiI0IIIIO != null) {
/* 128 */                               o0i0li.I0000Il00O(iioiI0IIIIO, o01oiol1o2);
                                    }
/* 131 */                           o01oiol1o2.I00000oOI();
                                } else {
/* 104 */                           o01oiol1o2.I00000oIO(loOill110Ol.RPC_EXPONENTIAL_BACKOFF_FAILED);
/* 109 */                           o01oiol1o2.I00000oIO(loOill110Ol.RPC_ERROR);
/* 112 */                           o01oiol1o2.I00000oOI();
                                }
/* 116 */                       i0oi1l1oo.I0001Ioi1lo(lioiiIOoil.INSTALLATION_ID_REGISTER_NEW_ID, o01oiol1o2);
                            } catch (Throwable th) {
/* 146 */                       o01oiol1o2.I00000oOI();
/* 151 */                       i0oi1l1oo.I0001Ioi1lo(lioiiIOoil.INSTALLATION_ID_REGISTER_NEW_ID, o01oiol1o2);
/* 154 */                       throw th;
                            }
                        }
/* 137 */               o01oiol1o.I00000oOI();
/* 142 */               i0oi1l1oo.I0001Ioi1lo(lioiiIOoil.INSTALLATION_ID_INIT, o01oiol1o);
                    } catch (Throwable th2) {
/* 155 */               o01oiol1o.I00000oOI();
/* 160 */               i0oi1l1oo.I0001Ioi1lo(lioiiIOoil.INSTALLATION_ID_INIT, o01oiol1o);
/* 245 */               throw th2;
                    }
                }

                public iOO010illOlI I001i1lo1io() {
/* 3 */             iOO010illOlI ioo010illoli = new iOO010illOlI();
/* 10 */            ioo010illoli.I00000oIO = (iOl1111iO) this.I00iOIl;
/* 16 */            ioo010illoli.I00000oOI = (iOIo11i) this.I00iiI;
/* 22 */            ioo010illoli.I0000Il00O = (iOl001i1iO1i) this.I00iiO;
/* 28 */            ioo010illoli.I0000O = (iI1li01iIO01) this.I00iio;
/* 30 */            VarHandle.storeStoreFence();
/* 55 */            return ioo010illoli;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1, types: [IIiOOI] */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v3 */
                /* JADX WARN: Type inference failed for: r5v5 */
                /* JADX WARN: Type inference failed for: r5v7 */
                /* JADX WARN: Type inference failed for: r5v8 */
                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
                    ?? r5;
/* 4 */             il0I1i0Oo1 il0i1i0oo1 = (il0I1i0Oo1) this.I00iOIl;
/* 8 */             iOo0ll1 ioo0ll1 = (iOo0ll1) this.I00iiI;
/* 13 */            iOioO0lIOo ioioo0lioo = (iOioO0lIOo) this.I00iiO;
/* 18 */            ii0IiiI ii0iiii = (ii0IiiI) this.I00iio;
/* 20 */            ComponentName componentName = il0I1i0Oo1.I00li1OI;
                    try {
/* 22 */                l0IO0lo0ool l0io0lo0ool = ioo0ll1.I00000oIO;
/* 25 */                io1011lii io1011liiVar = (io1011lii) l0io0lo0ool;
/* 31 */                r5 = 11;
/* 33 */                Parcel parcelI00O0i0ii = io1011liiVar.I00O0i0ii(11, io1011liiVar.I00Iooi00oi());
/* 37 */                int i = parcelI00O0i0ii.readInt();
/* 41 */                parcelI00O0i0ii.recycle();
                        try {
/* 46 */                    if (i > 0) {
/* 48 */                        il11i0 il11i0VarI00000oIO = ioioo0lioo.I00000oIO();
/* 55 */                        IIiOOI iIiOOI2 = iIiOOI;
/* 56 */                        iioI0l iioi0l = new iioI0l(il0i1i0oo1, ii0iiii, ioioo0lioo, iIiOOI2, 0);
/* 59 */                        io1011lii io1011liiVar2 = (io1011lii) l0io0lo0ool;
/* 61 */                        Parcel parcelI00Iooi00oi = io1011liiVar2.I00Iooi00oi();
/* 65 */                        int i2 = iil0IIlIl0oo.I00000oIO;
/* 67 */                        parcelI00Iooi00oi.writeInt(1);
/* 70 */                        il11i0VarI00000oIO.writeToParcel(parcelI00Iooi00oi, 0);
/* 73 */                        parcelI00Iooi00oi.writeStrongBinder(iioi0l);
/* 78 */                        Parcel parcelI00O0i0ii2 = io1011liiVar2.I00O0i0ii(12, parcelI00Iooi00oi);
/* 82 */                        parcelI00O0i0ii2.readInt();
/* 85 */                        parcelI00O0i0ii2.recycle();
                                r5 = iIiOOI2;
                            } else {
/* 95 */                        IIiOOI iIiOOI3 = iIiOOI;
/* 99 */                        iioI0l iioi0l2 = new iioI0l(il0i1i0oo1, ii0iiii, ioioo0lioo, iIiOOI3, 1);
/* 102 */                       il11i0 il11i0VarI00000oIO2 = ioioo0lioo.I00000oIO();
/* 106 */                       io1011lii io1011liiVar3 = (io1011lii) l0io0lo0ool;
/* 108 */                       Parcel parcelI00Iooi00oi2 = io1011liiVar3.I00Iooi00oi();
/* 112 */                       int i3 = iil0IIlIl0oo.I00000oIO;
/* 114 */                       parcelI00Iooi00oi2.writeInt(1);
/* 117 */                       il11i0VarI00000oIO2.writeToParcel(parcelI00Iooi00oi2, 0);
/* 120 */                       parcelI00Iooi00oi2.writeStrongBinder(iioi0l2);
/* 124 */                       Parcel parcelI00O0i0ii3 = io1011liiVar3.I00O0i0ii(7, parcelI00Iooi00oi2);
/* 128 */                       parcelI00O0i0ii3.readInt();
/* 131 */                       parcelI00O0i0ii3.recycle();
                                r5 = iIiOOI3;
                            }
/* 169 */                   return "requestDownloadableFeatureFuture";
                        } catch (RemoteException e) {
/* 89 */                    e = e;
/* 90 */                    RemoteException remoteException = e;
/* 148 */                   Log.e("il0I1i0Oo1", "AiCore service failed to download feature ".concat(((iOoOoIioii) ioioo0lioo).I00000oIO), remoteException);
/* 166 */                   r5.I0000O(iOiIOO1ll.I00000oOI(6, "AICore service failed to download feature ".concat(((iOoOoIioii) ioioo0lioo).I00000oIO), remoteException));
/* 169 */                   return "requestDownloadableFeatureFuture";
                        }
                    } catch (RemoteException e2) {
/* 92 */                e = e2;
/* 93 */                r5 = iIiOOI;
                    }
                }

                @Override
                public ListenableFuture call() {
/* 5 */             loilO0l loilo0l = (loilO0l) this.I00iOIl;
/* 9 */             ll10Ii1io1I ll10ii1io1i = (ll10Ii1io1I) this.I00iiO;
/* 13 */            Executor executor = (Executor) this.I00iio;
/* 16 */            loloOo1OiO lolooo1oio = new loloOo1OiO(1);
/* 19 */            lolooo1oio.I00000oOI = loilo0l;
/* 21 */            lolooo1oio.I0000Il00O = ll10ii1io1i;
/* 23 */            lolooo1oio.I0000O = executor;
/* 25 */            VarHandle.storeStoreFence();
/* 38 */            return I01iIIO.I00100l0((I011IO1I11OI) this.I00iiI, o0iOII1liI.I00000oOI(lolooo1oio), Iii11Ooi.I00iOIl);
                }

/* 95 */        public o01l1ioOo0(l0Oi0o l0oi0o, String str) {
                    this.I00iio = l0oi0o;
/* 97 */            lII0I0I000I.I0000O(str);
                    this.I00iOIl = str;
/* 98 */            this.I00iiI = new Bundle();
                }

/* 98 */        public o01l1ioOo0(O1I0OloI o1I0OloI, OI0010oo1o oI0010oo1o) {
                    this.I00iOIl = o1I0OloI;
                    this.I00iiI = oI0010oo1o;
/* 101 */           OIIoil0oI oIIoil0oI = new OIIoil0oI(0);
                    oIIoil0oI.I00iiI = this;
/* 102 */           VarHandle.storeStoreFence();
                    this.I00iiO = o1I0OloI.I00000oOI(oIIoil0oI);
/* 104 */           OIIoil0oI oIIoil0oI2 = new OIIoil0oI(1);
                    oIIoil0oI2.I00iiI = this;
/* 105 */           VarHandle.storeStoreFence();
                    this.I00iio = o1I0OloI.I00000oOI(oIIoil0oI2);
                }

/* 105 */       public o01l1ioOo0(I0l1OOl1l10 i0l1OOl1l10, OoOOol ooOOol, O0ioIllo0i1 o0ioIllo0i1) {
/* 107 */           this.I00iOIl = i0l1OOl1l10;
/* 108 */           this.I00iiI = ooOOol;
/* 109 */           this.I00iiO = o0ioIllo0i1;
/* 111 */           iOliil ioliil = new iOliil(7);
/* 112 */           ioliil.I00iiI = this;
/* 113 */           ioliil.I00iiO = ooOOol;
/* 115 */           iolOOiI iolooii = new iolOOiI(14);
/* 116 */           ioliil.I00iio = iolooii;
/* 117 */           ioliil.I00ilI0I1 = new OoIOol(iolooii);
/* 118 */           VarHandle.storeStoreFence();
                    this.I00iio = ioliil;
                }

/* 118 */       public o01l1ioOo0(Object obj, Function3 function3, Function3 function32, I0iII1i10I i0iII1i10I) {
/* 120 */           this.I00iOIl = obj;
/* 121 */           this.I00iiI = function3;
/* 122 */           this.I00iiO = function32;
/* 123 */           this.I00iio = i0iII1i10I;
                }
            }
