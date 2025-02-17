/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * TBD
 * </p>
 */
public class CreateApplicationRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * Name of your Amazon Kinesis Analytics application (for example,
     * <code>sample-app</code>).
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Summary description of the application.
     * </p>
     */
    private String applicationDescription;
    /**
     * <p>
     * Use this parameter to configure the application input.
     * </p>
     * <p>
     * You can configure your application to receive input from a single
     * streaming source. In this configuration, you map this streaming source to
     * an in-application stream that is created. Your application code can then
     * query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     * </p>
     * <p>
     * For the streaming source, you provide its Amazon Resource Name (ARN) and
     * format of data on the stream (for example, JSON, CSV, etc). You also must
     * provide an IAM role that Amazon Kinesis Analytics can assume to read this
     * stream on your behalf.
     * </p>
     * <p>
     * To create the in-application stream, you need to specify a schema to
     * transform your data into a schematized version used in SQL. In the
     * schema, you provide the necessary mapping of the data elements in the
     * streaming source to record columns in the in-app stream.
     * </p>
     */
    private java.util.List<Input> inputs;
    /**
     * <p>
     * You can configure application output to write data from any of the
     * in-application streams to up to five destinations.
     * </p>
     * <p>
     * These destinations can be Amazon Kinesis streams, Amazon Kinesis Firehose
     * delivery streams, or both.
     * </p>
     * <p>
     * In the configuration, you specify the in-application stream name, the
     * destination stream Amazon Resource Name (ARN), and the format to use when
     * writing data. You must also provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to the destination stream on your behalf.
     * </p>
     * <p>
     * In the output configuration, you also provide the output stream Amazon
     * Resource Name (ARN) and the format of data in the stream (for example,
     * JSON, CSV). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to this stream on your behalf.
     * </p>
     */
    private java.util.List<Output> outputs;
    /**
     * <p>
     * One or more SQL statements that read input data, transform it, and
     * generate output. For example, you can write a SQL statement that reads
     * input data and generates a running average of the number of advertisement
     * clicks by vendor.
     * </p>
     * <p>
     * You can also provide a series of SQL statements, where output of one
     * statement can be used as the input for the next statement.
     * </p>
     * <p>
     * Note that the application code must create the streams with names
     * specified in the <code>Outputs</code>. For example, if your
     * <code>Outputs</code> defines output streams named
     * <code>ExampleOutputStream1</code> and <code>ExampleOutputStream2</code>,
     * then your application code must create these streams.
     * </p>
     */
    private String applicationCode;

    /**
     * <p>
     * Name of your Amazon Kinesis Analytics application (for example,
     * <code>sample-app</code>).
     * </p>
     * 
     * @param applicationName
     *        Name of your Amazon Kinesis Analytics application (for example,
     *        <code>sample-app</code>).
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * Name of your Amazon Kinesis Analytics application (for example,
     * <code>sample-app</code>).
     * </p>
     * 
     * @return Name of your Amazon Kinesis Analytics application (for example,
     *         <code>sample-app</code>).
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * Name of your Amazon Kinesis Analytics application (for example,
     * <code>sample-app</code>).
     * </p>
     * 
     * @param applicationName
     *        Name of your Amazon Kinesis Analytics application (for example,
     *        <code>sample-app</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Summary description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        Summary description of the application.
     */

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    /**
     * <p>
     * Summary description of the application.
     * </p>
     * 
     * @return Summary description of the application.
     */

    public String getApplicationDescription() {
        return this.applicationDescription;
    }

    /**
     * <p>
     * Summary description of the application.
     * </p>
     * 
     * @param applicationDescription
     *        Summary description of the application.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateApplicationRequest withApplicationDescription(
            String applicationDescription) {
        setApplicationDescription(applicationDescription);
        return this;
    }

    /**
     * <p>
     * Use this parameter to configure the application input.
     * </p>
     * <p>
     * You can configure your application to receive input from a single
     * streaming source. In this configuration, you map this streaming source to
     * an in-application stream that is created. Your application code can then
     * query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     * </p>
     * <p>
     * For the streaming source, you provide its Amazon Resource Name (ARN) and
     * format of data on the stream (for example, JSON, CSV, etc). You also must
     * provide an IAM role that Amazon Kinesis Analytics can assume to read this
     * stream on your behalf.
     * </p>
     * <p>
     * To create the in-application stream, you need to specify a schema to
     * transform your data into a schematized version used in SQL. In the
     * schema, you provide the necessary mapping of the data elements in the
     * streaming source to record columns in the in-app stream.
     * </p>
     * 
     * @return Use this parameter to configure the application input.</p>
     *         <p>
     *         You can configure your application to receive input from a single
     *         streaming source. In this configuration, you map this streaming
     *         source to an in-application stream that is created. Your
     *         application code can then query the in-application stream like a
     *         table (you can think of it as a constantly updating table).
     *         </p>
     *         <p>
     *         For the streaming source, you provide its Amazon Resource Name
     *         (ARN) and format of data on the stream (for example, JSON, CSV,
     *         etc). You also must provide an IAM role that Amazon Kinesis
     *         Analytics can assume to read this stream on your behalf.
     *         </p>
     *         <p>
     *         To create the in-application stream, you need to specify a schema
     *         to transform your data into a schematized version used in SQL. In
     *         the schema, you provide the necessary mapping of the data
     *         elements in the streaming source to record columns in the in-app
     *         stream.
     */

    public java.util.List<Input> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * Use this parameter to configure the application input.
     * </p>
     * <p>
     * You can configure your application to receive input from a single
     * streaming source. In this configuration, you map this streaming source to
     * an in-application stream that is created. Your application code can then
     * query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     * </p>
     * <p>
     * For the streaming source, you provide its Amazon Resource Name (ARN) and
     * format of data on the stream (for example, JSON, CSV, etc). You also must
     * provide an IAM role that Amazon Kinesis Analytics can assume to read this
     * stream on your behalf.
     * </p>
     * <p>
     * To create the in-application stream, you need to specify a schema to
     * transform your data into a schematized version used in SQL. In the
     * schema, you provide the necessary mapping of the data elements in the
     * streaming source to record columns in the in-app stream.
     * </p>
     * 
     * @param inputs
     *        Use this parameter to configure the application input.</p>
     *        <p>
     *        You can configure your application to receive input from a single
     *        streaming source. In this configuration, you map this streaming
     *        source to an in-application stream that is created. Your
     *        application code can then query the in-application stream like a
     *        table (you can think of it as a constantly updating table).
     *        </p>
     *        <p>
     *        For the streaming source, you provide its Amazon Resource Name
     *        (ARN) and format of data on the stream (for example, JSON, CSV,
     *        etc). You also must provide an IAM role that Amazon Kinesis
     *        Analytics can assume to read this stream on your behalf.
     *        </p>
     *        <p>
     *        To create the in-application stream, you need to specify a schema
     *        to transform your data into a schematized version used in SQL. In
     *        the schema, you provide the necessary mapping of the data elements
     *        in the streaming source to record columns in the in-app stream.
     */

    public void setInputs(java.util.Collection<Input> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<Input>(inputs);
    }

    /**
     * <p>
     * Use this parameter to configure the application input.
     * </p>
     * <p>
     * You can configure your application to receive input from a single
     * streaming source. In this configuration, you map this streaming source to
     * an in-application stream that is created. Your application code can then
     * query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     * </p>
     * <p>
     * For the streaming source, you provide its Amazon Resource Name (ARN) and
     * format of data on the stream (for example, JSON, CSV, etc). You also must
     * provide an IAM role that Amazon Kinesis Analytics can assume to read this
     * stream on your behalf.
     * </p>
     * <p>
     * To create the in-application stream, you need to specify a schema to
     * transform your data into a schematized version used in SQL. In the
     * schema, you provide the necessary mapping of the data elements in the
     * streaming source to record columns in the in-app stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInputs(java.util.Collection)} or
     * {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        Use this parameter to configure the application input.</p>
     *        <p>
     *        You can configure your application to receive input from a single
     *        streaming source. In this configuration, you map this streaming
     *        source to an in-application stream that is created. Your
     *        application code can then query the in-application stream like a
     *        table (you can think of it as a constantly updating table).
     *        </p>
     *        <p>
     *        For the streaming source, you provide its Amazon Resource Name
     *        (ARN) and format of data on the stream (for example, JSON, CSV,
     *        etc). You also must provide an IAM role that Amazon Kinesis
     *        Analytics can assume to read this stream on your behalf.
     *        </p>
     *        <p>
     *        To create the in-application stream, you need to specify a schema
     *        to transform your data into a schematized version used in SQL. In
     *        the schema, you provide the necessary mapping of the data elements
     *        in the streaming source to record columns in the in-app stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateApplicationRequest withInputs(Input... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<Input>(inputs.length));
        }
        for (Input ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Use this parameter to configure the application input.
     * </p>
     * <p>
     * You can configure your application to receive input from a single
     * streaming source. In this configuration, you map this streaming source to
     * an in-application stream that is created. Your application code can then
     * query the in-application stream like a table (you can think of it as a
     * constantly updating table).
     * </p>
     * <p>
     * For the streaming source, you provide its Amazon Resource Name (ARN) and
     * format of data on the stream (for example, JSON, CSV, etc). You also must
     * provide an IAM role that Amazon Kinesis Analytics can assume to read this
     * stream on your behalf.
     * </p>
     * <p>
     * To create the in-application stream, you need to specify a schema to
     * transform your data into a schematized version used in SQL. In the
     * schema, you provide the necessary mapping of the data elements in the
     * streaming source to record columns in the in-app stream.
     * </p>
     * 
     * @param inputs
     *        Use this parameter to configure the application input.</p>
     *        <p>
     *        You can configure your application to receive input from a single
     *        streaming source. In this configuration, you map this streaming
     *        source to an in-application stream that is created. Your
     *        application code can then query the in-application stream like a
     *        table (you can think of it as a constantly updating table).
     *        </p>
     *        <p>
     *        For the streaming source, you provide its Amazon Resource Name
     *        (ARN) and format of data on the stream (for example, JSON, CSV,
     *        etc). You also must provide an IAM role that Amazon Kinesis
     *        Analytics can assume to read this stream on your behalf.
     *        </p>
     *        <p>
     *        To create the in-application stream, you need to specify a schema
     *        to transform your data into a schematized version used in SQL. In
     *        the schema, you provide the necessary mapping of the data elements
     *        in the streaming source to record columns in the in-app stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateApplicationRequest withInputs(
            java.util.Collection<Input> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * You can configure application output to write data from any of the
     * in-application streams to up to five destinations.
     * </p>
     * <p>
     * These destinations can be Amazon Kinesis streams, Amazon Kinesis Firehose
     * delivery streams, or both.
     * </p>
     * <p>
     * In the configuration, you specify the in-application stream name, the
     * destination stream Amazon Resource Name (ARN), and the format to use when
     * writing data. You must also provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to the destination stream on your behalf.
     * </p>
     * <p>
     * In the output configuration, you also provide the output stream Amazon
     * Resource Name (ARN) and the format of data in the stream (for example,
     * JSON, CSV). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to this stream on your behalf.
     * </p>
     * 
     * @return You can configure application output to write data from any of
     *         the in-application streams to up to five destinations.</p>
     *         <p>
     *         These destinations can be Amazon Kinesis streams, Amazon Kinesis
     *         Firehose delivery streams, or both.
     *         </p>
     *         <p>
     *         In the configuration, you specify the in-application stream name,
     *         the destination stream Amazon Resource Name (ARN), and the format
     *         to use when writing data. You must also provide an IAM role that
     *         Amazon Kinesis Analytics can assume to write to the destination
     *         stream on your behalf.
     *         </p>
     *         <p>
     *         In the output configuration, you also provide the output stream
     *         Amazon Resource Name (ARN) and the format of data in the stream
     *         (for example, JSON, CSV). You also must provide an IAM role that
     *         Amazon Kinesis Analytics can assume to write to this stream on
     *         your behalf.
     */

    public java.util.List<Output> getOutputs() {
        return outputs;
    }

    /**
     * <p>
     * You can configure application output to write data from any of the
     * in-application streams to up to five destinations.
     * </p>
     * <p>
     * These destinations can be Amazon Kinesis streams, Amazon Kinesis Firehose
     * delivery streams, or both.
     * </p>
     * <p>
     * In the configuration, you specify the in-application stream name, the
     * destination stream Amazon Resource Name (ARN), and the format to use when
     * writing data. You must also provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to the destination stream on your behalf.
     * </p>
     * <p>
     * In the output configuration, you also provide the output stream Amazon
     * Resource Name (ARN) and the format of data in the stream (for example,
     * JSON, CSV). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to this stream on your behalf.
     * </p>
     * 
     * @param outputs
     *        You can configure application output to write data from any of the
     *        in-application streams to up to five destinations.</p>
     *        <p>
     *        These destinations can be Amazon Kinesis streams, Amazon Kinesis
     *        Firehose delivery streams, or both.
     *        </p>
     *        <p>
     *        In the configuration, you specify the in-application stream name,
     *        the destination stream Amazon Resource Name (ARN), and the format
     *        to use when writing data. You must also provide an IAM role that
     *        Amazon Kinesis Analytics can assume to write to the destination
     *        stream on your behalf.
     *        </p>
     *        <p>
     *        In the output configuration, you also provide the output stream
     *        Amazon Resource Name (ARN) and the format of data in the stream
     *        (for example, JSON, CSV). You also must provide an IAM role that
     *        Amazon Kinesis Analytics can assume to write to this stream on
     *        your behalf.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new java.util.ArrayList<Output>(outputs);
    }

    /**
     * <p>
     * You can configure application output to write data from any of the
     * in-application streams to up to five destinations.
     * </p>
     * <p>
     * These destinations can be Amazon Kinesis streams, Amazon Kinesis Firehose
     * delivery streams, or both.
     * </p>
     * <p>
     * In the configuration, you specify the in-application stream name, the
     * destination stream Amazon Resource Name (ARN), and the format to use when
     * writing data. You must also provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to the destination stream on your behalf.
     * </p>
     * <p>
     * In the output configuration, you also provide the output stream Amazon
     * Resource Name (ARN) and the format of data in the stream (for example,
     * JSON, CSV). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to this stream on your behalf.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOutputs(java.util.Collection)} or
     * {@link #withOutputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param outputs
     *        You can configure application output to write data from any of the
     *        in-application streams to up to five destinations.</p>
     *        <p>
     *        These destinations can be Amazon Kinesis streams, Amazon Kinesis
     *        Firehose delivery streams, or both.
     *        </p>
     *        <p>
     *        In the configuration, you specify the in-application stream name,
     *        the destination stream Amazon Resource Name (ARN), and the format
     *        to use when writing data. You must also provide an IAM role that
     *        Amazon Kinesis Analytics can assume to write to the destination
     *        stream on your behalf.
     *        </p>
     *        <p>
     *        In the output configuration, you also provide the output stream
     *        Amazon Resource Name (ARN) and the format of data in the stream
     *        (for example, JSON, CSV). You also must provide an IAM role that
     *        Amazon Kinesis Analytics can assume to write to this stream on
     *        your behalf.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateApplicationRequest withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new java.util.ArrayList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can configure application output to write data from any of the
     * in-application streams to up to five destinations.
     * </p>
     * <p>
     * These destinations can be Amazon Kinesis streams, Amazon Kinesis Firehose
     * delivery streams, or both.
     * </p>
     * <p>
     * In the configuration, you specify the in-application stream name, the
     * destination stream Amazon Resource Name (ARN), and the format to use when
     * writing data. You must also provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to the destination stream on your behalf.
     * </p>
     * <p>
     * In the output configuration, you also provide the output stream Amazon
     * Resource Name (ARN) and the format of data in the stream (for example,
     * JSON, CSV). You also must provide an IAM role that Amazon Kinesis
     * Analytics can assume to write to this stream on your behalf.
     * </p>
     * 
     * @param outputs
     *        You can configure application output to write data from any of the
     *        in-application streams to up to five destinations.</p>
     *        <p>
     *        These destinations can be Amazon Kinesis streams, Amazon Kinesis
     *        Firehose delivery streams, or both.
     *        </p>
     *        <p>
     *        In the configuration, you specify the in-application stream name,
     *        the destination stream Amazon Resource Name (ARN), and the format
     *        to use when writing data. You must also provide an IAM role that
     *        Amazon Kinesis Analytics can assume to write to the destination
     *        stream on your behalf.
     *        </p>
     *        <p>
     *        In the output configuration, you also provide the output stream
     *        Amazon Resource Name (ARN) and the format of data in the stream
     *        (for example, JSON, CSV). You also must provide an IAM role that
     *        Amazon Kinesis Analytics can assume to write to this stream on
     *        your behalf.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateApplicationRequest withOutputs(
            java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * One or more SQL statements that read input data, transform it, and
     * generate output. For example, you can write a SQL statement that reads
     * input data and generates a running average of the number of advertisement
     * clicks by vendor.
     * </p>
     * <p>
     * You can also provide a series of SQL statements, where output of one
     * statement can be used as the input for the next statement.
     * </p>
     * <p>
     * Note that the application code must create the streams with names
     * specified in the <code>Outputs</code>. For example, if your
     * <code>Outputs</code> defines output streams named
     * <code>ExampleOutputStream1</code> and <code>ExampleOutputStream2</code>,
     * then your application code must create these streams.
     * </p>
     * 
     * @param applicationCode
     *        One or more SQL statements that read input data, transform it, and
     *        generate output. For example, you can write a SQL statement that
     *        reads input data and generates a running average of the number of
     *        advertisement clicks by vendor.</p>
     *        <p>
     *        You can also provide a series of SQL statements, where output of
     *        one statement can be used as the input for the next statement.
     *        </p>
     *        <p>
     *        Note that the application code must create the streams with names
     *        specified in the <code>Outputs</code>. For example, if your
     *        <code>Outputs</code> defines output streams named
     *        <code>ExampleOutputStream1</code> and
     *        <code>ExampleOutputStream2</code>, then your application code must
     *        create these streams.
     */

    public void setApplicationCode(String applicationCode) {
        this.applicationCode = applicationCode;
    }

    /**
     * <p>
     * One or more SQL statements that read input data, transform it, and
     * generate output. For example, you can write a SQL statement that reads
     * input data and generates a running average of the number of advertisement
     * clicks by vendor.
     * </p>
     * <p>
     * You can also provide a series of SQL statements, where output of one
     * statement can be used as the input for the next statement.
     * </p>
     * <p>
     * Note that the application code must create the streams with names
     * specified in the <code>Outputs</code>. For example, if your
     * <code>Outputs</code> defines output streams named
     * <code>ExampleOutputStream1</code> and <code>ExampleOutputStream2</code>,
     * then your application code must create these streams.
     * </p>
     * 
     * @return One or more SQL statements that read input data, transform it,
     *         and generate output. For example, you can write a SQL statement
     *         that reads input data and generates a running average of the
     *         number of advertisement clicks by vendor.</p>
     *         <p>
     *         You can also provide a series of SQL statements, where output of
     *         one statement can be used as the input for the next statement.
     *         </p>
     *         <p>
     *         Note that the application code must create the streams with names
     *         specified in the <code>Outputs</code>. For example, if your
     *         <code>Outputs</code> defines output streams named
     *         <code>ExampleOutputStream1</code> and
     *         <code>ExampleOutputStream2</code>, then your application code
     *         must create these streams.
     */

    public String getApplicationCode() {
        return this.applicationCode;
    }

    /**
     * <p>
     * One or more SQL statements that read input data, transform it, and
     * generate output. For example, you can write a SQL statement that reads
     * input data and generates a running average of the number of advertisement
     * clicks by vendor.
     * </p>
     * <p>
     * You can also provide a series of SQL statements, where output of one
     * statement can be used as the input for the next statement.
     * </p>
     * <p>
     * Note that the application code must create the streams with names
     * specified in the <code>Outputs</code>. For example, if your
     * <code>Outputs</code> defines output streams named
     * <code>ExampleOutputStream1</code> and <code>ExampleOutputStream2</code>,
     * then your application code must create these streams.
     * </p>
     * 
     * @param applicationCode
     *        One or more SQL statements that read input data, transform it, and
     *        generate output. For example, you can write a SQL statement that
     *        reads input data and generates a running average of the number of
     *        advertisement clicks by vendor.</p>
     *        <p>
     *        You can also provide a series of SQL statements, where output of
     *        one statement can be used as the input for the next statement.
     *        </p>
     *        <p>
     *        Note that the application code must create the streams with names
     *        specified in the <code>Outputs</code>. For example, if your
     *        <code>Outputs</code> defines output streams named
     *        <code>ExampleOutputStream1</code> and
     *        <code>ExampleOutputStream2</code>, then your application code must
     *        create these streams.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateApplicationRequest withApplicationCode(String applicationCode) {
        setApplicationCode(applicationCode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getApplicationDescription() != null)
            sb.append("ApplicationDescription: " + getApplicationDescription()
                    + ",");
        if (getInputs() != null)
            sb.append("Inputs: " + getInputs() + ",");
        if (getOutputs() != null)
            sb.append("Outputs: " + getOutputs() + ",");
        if (getApplicationCode() != null)
            sb.append("ApplicationCode: " + getApplicationCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;
        if (other.getApplicationName() == null
                ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null
                && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getApplicationDescription() == null
                ^ this.getApplicationDescription() == null)
            return false;
        if (other.getApplicationDescription() != null
                && other.getApplicationDescription().equals(
                        this.getApplicationDescription()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null
                && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null
                && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getApplicationCode() == null
                ^ this.getApplicationCode() == null)
            return false;
        if (other.getApplicationCode() != null
                && other.getApplicationCode().equals(this.getApplicationCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationName() == null) ? 0 : getApplicationName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getApplicationDescription() == null) ? 0
                        : getApplicationDescription().hashCode());
        hashCode = prime * hashCode
                + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode
                + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime
                * hashCode
                + ((getApplicationCode() == null) ? 0 : getApplicationCode()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateApplicationRequest clone() {
        return (CreateApplicationRequest) super.clone();
    }
}
