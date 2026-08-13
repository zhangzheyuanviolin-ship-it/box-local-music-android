            package com.google.android.libraries.vision.visionkit.pipeline.alt;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import p000.IlIi0I0;
            import p000.IoOOl0iOl1io;
            import p000.i0ii0OlOO;
            import p000.i0o11Io;
            import p000.i0oii0llI;
            import p000.i101o1;
            import p000.i101olIl0OiI;
            import p000.i101ool;
            import p000.i10I011;
            import p000.i10I10;
            import p000.i10IIII01ol;
            import p000.i11IO0ii;
            import p000.i11liii0;
            
/* 45 */    public class PipelineException extends Exception {
                private static final String ROOT_CAUSE_DELIMITER = "#vk ";
                private final i0o11Io statusCode;
                private final String statusMessage;
                private final i0oii0llI visionkitStatus;

                private PipelineException(i0oii0llI i0oii0lli) {
/* 23 */            super(IlIi0I0.I000lI(i0o11Io.values()[i0oii0lli.I000oI1ioi()].I00iOIl, ": ", i0oii0lli.I00100o1O0lo()));
/* 36 */            this.statusCode = i0o11Io.values()[i0oii0lli.I000oI1ioi()];
/* 42 */            this.statusMessage = i0oii0lli.I00100o1O0lo();
/* 44 */            this.visionkitStatus = i0oii0lli;
                }

                public List<i0ii0OlOO> getComponentStatuses() {
/* 1 */             i0oii0llI i0oii0lli = this.visionkitStatus;
/* 3 */             if (i0oii0lli != null) {
/* 5 */                 return i0oii0lli.I0010I0i();
                    }
/* 10 */            i10I011 i10i011 = i10I10.I00lll10;
/* 12 */            return i10IIII01ol.I00o101lO;
                }

                public i101olIl0OiI getRootCauseMessage() {
                    Object next;
                    Object obj;
/* 9 */             if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
/* 112 */               return i101o1.I00iOIl;
                    }
/* 11 */            String str = this.statusMessage;
/* 13 */            str.getClass();
/* 19 */            i101ool i101oolVar = new i101ool(0);
/* 23 */            i101oolVar.I00iiO = 2;
/* 25 */            i101oolVar.I00ilI0I1 = 0;
/* 30 */            i101oolVar.I00ilO0 = Integer.MAX_VALUE;
/* 32 */            i101oolVar.I00iio = str;
/* 34 */            VarHandle.storeStoreFence();
/* 39 */            ArrayList arrayList = new ArrayList();
/* 46 */            while (i101oolVar.hasNext()) {
/* 54 */                arrayList.add((String) i101oolVar.next());
                    }
/* 58 */            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 64 */            if (listUnmodifiableList instanceof List) {
/* 66 */                List list = listUnmodifiableList;
/* 72 */                if (list.isEmpty()) {
/* 85 */                    IoOOl0iOl1io.I00000oOI();
/* 88 */                    return null;
                        }
/* 80 */                obj = list.get(list.size() - 1);
                    } else {
/* 90 */                Iterator it = listUnmodifiableList.iterator();
/* 102 */               do {
/* 94 */                    next = it.next();
/* 102 */               } while (it.hasNext());
/* 104 */               obj = next;
                    }
/* 107 */           return i101olIl0OiI.I0000O((String) obj);
                }

                public i0o11Io getStatusCode() {
/* 1 */             return this.statusCode;
                }

                public String getStatusMessage() {
/* 1 */             return this.statusMessage;
                }

/* 46 */        public PipelineException(int i, String str) {
/* 51 */            super(IlIi0I0.I000lI(i0o11Io.values()[i].I00iOIl, ": ", str));
/* 52 */            this.statusCode = i0o11Io.values()[i];
                    this.statusMessage = str;
                    this.visionkitStatus = null;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 52 */        public PipelineException(byte[] bArr) {
/* 55 */            this(i0oii0llI.I00100l0(bArr, i11IO0ii.I0000Il00O));
/* 53 */            i11IO0ii i11io0ii = i11IO0ii.I00000oOI;
/* 54 */            i11liii0 i11liii0Var = i11liii0.I0000Il00O;
                }
            }
