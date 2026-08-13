            package com.google.android.libraries.vision.visionkit.pipeline;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import p000.IlIi0I0;
            import p000.IoOOl0iOl1io;
            import p000.i101ool;
            import p000.iI1I1lol;
            import p000.ii0II11oi0I;
            import p000.ii0oIOiIl;
            import p000.iio00oIO;
            import p000.io0i0oloi;
            import p000.l1oiOIloOo;
            import p000.lI1000oO0Ol;
            import p000.lIO1l111i;
            import p000.lIOiOOl;
            import p000.lIil0l010OO;
            
/* 45 */    public class PipelineException extends Exception {
                private static final String ROOT_CAUSE_DELIMITER = "#vk ";
                private final iio00oIO statusCode;
                private final String statusMessage;
                private final io0i0oloi visionkitStatus;

                private PipelineException(io0i0oloi io0i0oloiVar) {
/* 23 */            super(IlIi0I0.I000lI(iio00oIO.values()[io0i0oloiVar.I00111O()].I00iOIl, ": ", io0i0oloiVar.I001IO000()));
/* 36 */            this.statusCode = iio00oIO.values()[io0i0oloiVar.I00111O()];
/* 42 */            this.statusMessage = io0i0oloiVar.I001IO000();
/* 44 */            this.visionkitStatus = io0i0oloiVar;
                }

                public List<iI1I1lol> getComponentStatuses() {
/* 1 */             io0i0oloi io0i0oloiVar = this.visionkitStatus;
/* 3 */             if (io0i0oloiVar != null) {
/* 5 */                 return io0i0oloiVar.I001i1O0Ol();
                    }
/* 10 */            lIO1l111i lio1l111i = lIOiOOl.I00lll10;
/* 12 */            return lIil0l010OO.I00o101lO;
                }

                public lI1000oO0Ol getRootCauseMessage() {
                    Object next;
                    Object obj;
/* 9 */             if (!this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
/* 113 */               return l1oiOIloOo.I00iOIl;
                    }
/* 11 */            String str = this.statusMessage;
/* 13 */            str.getClass();
/* 19 */            i101ool i101oolVar = new i101ool(1);
/* 23 */            i101oolVar.I00iiO = 2;
/* 26 */            i101oolVar.I00ilI0I1 = 0;
/* 31 */            i101oolVar.I00ilO0 = Integer.MAX_VALUE;
/* 33 */            i101oolVar.I00iio = str;
/* 35 */            VarHandle.storeStoreFence();
/* 40 */            ArrayList arrayList = new ArrayList();
/* 47 */            while (i101oolVar.hasNext()) {
/* 55 */                arrayList.add((String) i101oolVar.next());
                    }
/* 59 */            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
/* 65 */            if (listUnmodifiableList instanceof List) {
/* 67 */                List list = listUnmodifiableList;
/* 73 */                if (list.isEmpty()) {
/* 86 */                    IoOOl0iOl1io.I00000oOI();
/* 89 */                    return null;
                        }
/* 81 */                obj = list.get(list.size() - 1);
                    } else {
/* 91 */                Iterator it = listUnmodifiableList.iterator();
/* 103 */               do {
/* 95 */                    next = it.next();
/* 103 */               } while (it.hasNext());
/* 105 */               obj = next;
                    }
/* 108 */           return lI1000oO0Ol.I0000O((String) obj);
                }

                public iio00oIO getStatusCode() {
/* 1 */             return this.statusCode;
                }

                public String getStatusMessage() {
/* 1 */             return this.statusMessage;
                }

/* 46 */        public PipelineException(int i, String str) {
/* 51 */            super(IlIi0I0.I000lI(iio00oIO.values()[i].I00iOIl, ": ", str));
/* 52 */            this.statusCode = iio00oIO.values()[i];
                    this.statusMessage = str;
                    this.visionkitStatus = null;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 52 */        public PipelineException(byte[] bArr) {
/* 55 */            this(io0i0oloi.I001IIilI0O(bArr, ii0II11oi0I.I0000Il00O));
/* 53 */            ii0II11oi0I ii0ii11oi0i = ii0II11oi0I.I00000oOI;
/* 54 */            ii0oIOiIl ii0oioiil = ii0oIOiIl.I0000Il00O;
                }
            }
