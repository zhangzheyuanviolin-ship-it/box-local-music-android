            package p000;

            import com.jegly.offlineLLM.smollm.SmolLM;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.locks.ReentrantLock;
            import java.util.regex.Pattern;
            
            public final class O1111l {
                public SmolLM I00000oIO;
                public ReentrantLock I00000oOI;
                public Ol1OIlllo I0000Il00O;
                public String I0000O;
                public String I0000oI00;
                public volatile OlIl0i I0001Ioi1lo;
                public volatile OlIl0i I000II;
                public volatile OlIl0i I000O01llI0;
                public AtomicBoolean I000OOo1O;

                public static String I00000oIO(String str, boolean z) {
/* 1 */             OOoilolI10I[] oOoilolI10IArr = OOoilolI10I.I00iOIl;
/* 127 */           String strI000iOII = OlOolloIIOl0.I000iOII(Pattern.compile("<\\|turn_end\\|>", 66).matcher(Pattern.compile("<turn\\|.*?\\|>", 66).matcher(Pattern.compile("<end_of_turn>", 66).matcher(Pattern.compile("<start_of_turn>.*?\\n", 66).matcher(Pattern.compile("<think>.*", 32).matcher(Pattern.compile("<think>.*?</think>", 32).matcher(OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(Pattern.compile("<\\|im_start\\|>(system|user|assistant)\\n?", 66).matcher(str).replaceAll(""), "<|im_end|>", ""), "<|endoftext|>", ""), "<|eot_id|>", "")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll("")).replaceAll(""), "System instruction:", "");
/* 131 */           if (z) {
/* 143 */               strI000iOII = Pattern.compile("<.*$", 66).matcher(strI000iOII).replaceAll("");
                    }
/* 151 */           return OlOoOIi0o.I00OIo(strI000iOII).toString();
                }

                public final void I00000oOI() {
/* 1 */             ReentrantLock reentrantLock = this.I00000oOI;
/* 3 */             reentrantLock.lock();
                    try {
/* 6 */                 OlIl0i olIl0i = this.I0001Ioi1lo;
/* 8 */                 IOoil1iiIilo iOoil1iiIilo = null;
/* 9 */                 if (olIl0i != null) {
/* 11 */                    olIl0i.I000II(null);
                        }
/* 17 */                OlIl0i olIl0i2 = this.I000II;
/* 19 */                if (olIl0i2 != null) {
/* 21 */                    olIl0i2.I000II(null);
                        }
/* 24 */                OlIl0i olIl0i3 = this.I000O01llI0;
/* 26 */                if (olIl0i3 != null) {
/* 28 */                    olIl0i3.I000II(null);
                        }
/* 31 */                OlIl0i olIl0i4 = this.I000O01llI0;
/* 33 */                if (olIl0i4 != null) {
/* 42 */                    iOi1IOoIO0l.I00000oOI(new I0II0OiI(olIl0i4, iOoil1iiIilo, 27));
                        }
/* 48 */                this.I000OOo1O.set(false);
                        try {
/* 53 */                    this.I00000oIO.close();
                        } catch (Exception unused) {
                        }
/* 56 */                reentrantLock.unlock();
                    } catch (Throwable th) {
/* 60 */                reentrantLock.unlock();
/* 110 */               throw th;
                    }
                }
            }
