            package p000;

            import android.text.TextUtils;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            
            public final class l01O0IO1ooO0 extends l1i00il00li {
                public char I00iiO;
                public long I00iio;
                public String I00ilI0I1;
                public IOloiOI1 I00ilO0;
                public IOloiOI1 I00io1l;
                public IOloiOI1 I00ioIO;
                public IOloiOI1 I00l0I0l0lO1;
                public IOloiOI1 I00l0OO0IO;
                public IOloiOI1 I00li1OI;
                public IOloiOI1 I00ll1;
                public IOloiOI1 I00lli11;
                public IOloiOI1 I00lll10;

                public static l01I01OOO I010ioo(String str) {
/* 1 */             if (str == null) {
/* 3 */                 return null;
                    }
/* 7 */             l01I01OOO l01i01ooo = new l01I01OOO();
/* 10 */            l01i01ooo.I00000oIO = str;
/* 12 */            VarHandle.storeStoreFence();
/* 29 */            return l01i01ooo;
                }

                public static String I010l1ol111(boolean z, String str, Object obj, Object obj2, Object obj3) {
/* 1 */             String strI010lI0oi = I010lI0oi(obj, z);
/* 5 */             String strI010lI0oi2 = I010lI0oi(obj2, z);
/* 9 */             String strI010lI0oi3 = I010lI0oi(obj3, z);
/* 15 */            StringBuilder sb = new StringBuilder();
/* 18 */            String str2 = "";
/* 20 */            if (str == null) {
/* 18 */                str = "";
                    }
/* 27 */            if (!TextUtils.isEmpty(str)) {
/* 29 */                sb.append(str);
/* 32 */                str2 = ": ";
                    }
/* 38 */            String str3 = ", ";
/* 40 */            if (!TextUtils.isEmpty(strI010lI0oi)) {
/* 42 */                sb.append(str2);
/* 45 */                sb.append(strI010lI0oi);
/* 38 */                str2 = ", ";
                    }
/* 53 */            if (TextUtils.isEmpty(strI010lI0oi2)) {
/* 62 */                str3 = str2;
                    } else {
/* 55 */                sb.append(str2);
/* 58 */                sb.append(strI010lI0oi2);
                    }
/* 67 */            if (!TextUtils.isEmpty(strI010lI0oi3)) {
/* 69 */                sb.append(str3);
/* 72 */                sb.append(strI010lI0oi3);
                    }
/* 75 */            return sb.toString();
                }

                public static String I010lI0oi(Object obj, boolean z) {
                    int iLastIndexOf;
                    String className;
                    int iLastIndexOf2;
/* 3 */             if (obj == null) {
/* 1 */                 return "";
                    }
/* 8 */             if (obj instanceof Integer) {
/* 17 */                obj = Long.valueOf(((Integer) obj).intValue());
                    }
/* 27 */            if (obj instanceof Long) {
/* 29 */                if (!z) {
/* 31 */                    return obj.toString();
                        }
/* 37 */                Long l = (Long) obj;
/* 51 */                if (Math.abs(l.longValue()) < 100) {
/* 53 */                    return obj.toString();
                        }
/* 62 */                char cCharAt = obj.toString().charAt(0);
/* 74 */                String strValueOf = String.valueOf(Math.abs(l.longValue()));
/* 90 */                long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
/* 106 */               long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
/* 114 */               int length = String.valueOf(jRound).length();
/* 24 */                String str = cCharAt == '-' ? "-" : "";
/* 146 */               StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
/* 149 */               sb.append(str);
/* 152 */               sb.append(jRound);
/* 157 */               sb.append("...");
/* 160 */               sb.append(str);
/* 163 */               sb.append(jRound2);
/* 166 */               return sb.toString();
                    }
/* 173 */           if (obj instanceof Boolean) {
/* 175 */               return obj.toString();
                    }
/* 182 */           if (!(obj instanceof Throwable)) {
                        return obj instanceof l01I01OOO ? ((l01I01OOO) obj).I00000oIO : z ? "-" : obj.toString();
                    }
/* 184 */           Throwable th = (Throwable) obj;
/* 203 */           StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
/* 208 */           String canonicalName = l0olllO1i.class.getCanonicalName();
/* 229 */           String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
/* 233 */           StackTraceElement[] stackTrace = th.getStackTrace();
/* 237 */           int length2 = stackTrace.length;
/* 238 */           int i = 0;
                    while (true) {
/* 239 */               if (i >= length2) {
                            break;
                        }
/* 241 */               StackTraceElement stackTraceElement = stackTrace[i];
/* 247 */               if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
/* 279 */                   if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
/* 283 */                       sb2.append(": ");
/* 286 */                       sb2.append(stackTraceElement);
                                break;
                            }
                        }
/* 290 */               i++;
                    }
/* 293 */           return sb2.toString();
                }

                @Override
                public final boolean I010OIo1l() {
/* 1 */             return false;
                }

                public final void I010l10O(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
/* 1 */             if (!z && Log.isLoggable(I010l1O(), i)) {
/* 22 */                Log.println(i, I010l1O(), I010l1ol111(false, str, obj, obj2, obj3));
                    }
/* 25 */            if (z2 || i < 5) {
/* 965 */               return;
                    }
/* 30 */            lII0I0I000I.I000II(str);
/* 37 */            l0o10OoO0 l0o10ooo0 = ((l0olllO1i) this.I00iOIl).I00io1l;
/* 40 */            if (l0o10ooo0 == null) {
/* 48 */                Log.println(6, I010l1O(), "Scheduler not set. Not logging error/warn");
/* 51 */                return;
                    }
/* 54 */            if (!l0o10ooo0.I00iiI) {
/* 62 */                Log.println(6, I010l1O(), "Scheduler not initialized. Not logging error/warn");
/* 65 */                return;
                    }
/* 68 */            if (i >= 9) {
/* 70 */                i = 8;
                    }
/* 74 */            l010iooill10 l010iooill10Var = new l010iooill10();
/* 77 */            l010iooill10Var.I00iiI = i;
/* 79 */            l010iooill10Var.I00iiO = str;
/* 81 */            l010iooill10Var.I00iio = obj;
/* 83 */            l010iooill10Var.I00ilI0I1 = obj2;
/* 85 */            l010iooill10Var.I00ilO0 = obj3;
/* 87 */            l010iooill10Var.I00io1l = this;
/* 89 */            VarHandle.storeStoreFence();
/* 92 */            l0o10ooo0.I010o0o0oO(l010iooill10Var);
                }

                public final String I010l1O() {
                    String str;
                    synchronized (this) {
                        try {
/* 2 */                     str = this.I00ilI0I1;
/* 4 */                     if (str == null) {
/* 16 */                        ((l0olllO1i) ((l0olllO1i) this.I00iOIl).I00iio.I00iOIl).getClass();
/* 19 */                        str = "FA";
/* 21 */                        this.I00ilI0I1 = "FA";
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 27 */            return str;
                }
            }
